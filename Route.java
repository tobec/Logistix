/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 31.08.2018
  * @author Tobias Becker
  */

import java.io.*;
import java.util.*;

public class Route {
  
  // Anfang Attribute
  private Point startpunkt;
  private Point zielpunkt;
  private Point[] zwischenpunkte;
  private float frachtgewicht;
  private float frachtvolumen;
  // Ende Attribute
  
  public Route(Point startpunkt, Point zielpunkt, float frachtgewicht, float frachtvolumen) {
    this.startpunkt = startpunkt;
    this.zielpunkt = zielpunkt;
    this.frachtgewicht = frachtgewicht;
    this.frachtvolumen = frachtvolumen;
    this.zwischenpunkte = null;
  }
  
  // Anfang Methoden
  public Point getStartpunkt() {
    return startpunkt;
  }
  
  public Point getZielpunkt() {
    return zielpunkt;
  }
  
  public Point[] getZwischenpunkte() {
    return zwischenpunkte;
  }
  
  
  public double getFrachtgewicht() {
    return 0;
  }
  
  public double getFrachtvolumen() {
    return 0;
  }
  
  public void setZwischenpunkte(Point[] zwischenpunkte) {
    this.zwischenpunkte = zwischenpunkte;
  }
  
  public String toString(){
    String zp ="[";
    for (int i = 0;i < this.zwischenpunkte.length ;i++ ) {
      if (this.zwischenpunkte[i] != null) {
        zp += "," + this.zwischenpunkte[i]; 
      } // end of if
    } // end of for
    zp += "]";
    
    return "Startpunkt: " + this.startpunkt 
    + " Zwischenpunkte: " + zp 
    + " Endpunkt: " + this.zielpunkt
    + " Gewicht/Volumen: " +this.frachtgewicht + "/" + this.frachtvolumen;
  }
  
  // Ende Methoden
} // end of Route