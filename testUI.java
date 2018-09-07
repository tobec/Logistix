/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 31.08.2018
  * @author Tobias Becker
  */

public class testUI {
  
  public static void main(String[] args) {
    Point p1 = new Point("Hamburg","HH");
    Point p2 = new Point("Berlin","BE");
    Point p3 = new Point("Frankfurt am Main","FFM");
    Point p4 = new Point("Dortmund","DO");
    
    Route r1 = new Route(p1,p2,23,50);
    
    Point[] r1Zwischen = new Point[18];
    r1Zwischen[0] = p3;
    r1Zwischen[1]  =p4;
    
    r1.setZwischenpunkte(r1Zwischen);
    
    System.out.println(r1);
  } // end of main

} // end of class testUI
