/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 31.08.2018
  * @author Tobias Becker
  */

public class Point {
  
  // Anfang Attribute
  private String name;
  private String shortname;
  // Ende Attribute
  
  public Point(String name, String shortname) {
    this.name = name;
    this.shortname = shortname;
  }

  // Anfang Methoden
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShortname() {
    return shortname;
  }

  public void setShortname(String shortname) {
    this.shortname = shortname;
  }
  
  public String toString(){
    return this.shortname +" | " + this.name;
    }
  // Ende Methoden
} // end of Point
