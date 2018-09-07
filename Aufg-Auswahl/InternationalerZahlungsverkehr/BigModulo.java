import java.io.IOException;


public class BigModulo 
{

  public static int getBigModulo (String strDezimalGanzZahlMitVielenStellen, int iTeiler)
  {
    // Plausibilitätsprüfung
    if (iTeiler <= 0) 
    {
      return -1;
    }
    
    int iDezimalstellenAnzahl = strDezimalGanzZahlMitVielenStellen.length();
    int iErg = 0;
    
    // Aufteilen des langen Zahlenstrings in einzelne Stellen
    for (int i = 0; i < iDezimalstellenAnzahl; i++)
    {
      String strSubstring = strDezimalGanzZahlMitVielenStellen.substring(i, i+1);
      char   cZeichen     = strSubstring.charAt(0);
      // Plausibilitaetspruefung des Inhalts 
      if ( ((int)cZeichen < 0x30) || ((int)cZeichen >= 0x40) )
      {
        // String enthaelt nicht ausschliesslich Ziffern
        return -1;
      }

      int iZiffer = Integer.parseInt(strSubstring);
      // Berechnung des Divisionsrestes
      iErg = ((iErg * 10) + iZiffer) % iTeiler; 
    }
    
    return iErg;
  }
  

  // Schlanke Version
  // Überprüfungen auf Plausibilitäten wurden entfernt
  public static int getBigModuloLean (String strDezimalGanzZahlMitVielenStellen, int iTeiler)
  {
    int iDezimalstellenAnzahl = strDezimalGanzZahlMitVielenStellen.length();
    int iErg = 0;
    
    // Aufteilen des langen Zahlenstrings in einzelne Stellen
    for (int i = 0; i < iDezimalstellenAnzahl; i++)
    {
      String strSubstring = strDezimalGanzZahlMitVielenStellen.substring(i, i+1);
      int    iZiffer = Integer.parseInt(strSubstring);
      // Berechnung des Divisionsrestes
      iErg = ((iErg * 10) + iZiffer) % iTeiler; 
    }
    
    return iErg;
  }
  
  
  
  
  public static void testBigModulo () 
  {
    String  str   = "123456789";
    int     iZahl = Integer.parseInt(str);
    boolean bOK  = true;
    
    
    for (int iTeiler = 1; iTeiler < 1234; iTeiler++)
    {
      int iOrgVal  = 0;
      try
      {
        iOrgVal  = iZahl % iTeiler;
        
      }
      catch (ArithmeticException e1) 
      {
        iOrgVal  = -1;
      }
       
      int iTestVal = getBigModulo         (str, iTeiler);
//      int iTestVal = getBigModuloLean     (str, iTeiler);
      boolean bEqual = (iOrgVal == iTestVal);
      System.out.format("Teiler: %4d Originalerg: %4d Mein Ergebnis: %4d  OK: %b \n", iTeiler, iOrgVal, iTestVal, bEqual);
      if (!bEqual)
      {
        bOK = false;
      }
    }
    
    System.out.format("Total OK: %b", bOK);
  }
    
  
  public static void main(String[] args) 
  {
    System.out.format("Das ist der grosse Modulo Tester \n");

    testBigModulo ();
  }

}
