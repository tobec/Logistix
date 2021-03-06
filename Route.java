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
  private Point[] getCompleteRoute(){
    Point [] route = new Point [this.zwischenpunkte.length + 2];
    
    route [0] = this.startpunkt;
    for (int i = 1;i < route.length - 1 ; i++ ) {
      route[i] = this.zwischenpunkte[i-1];
    } // end of for
    route [route.length - 1] = this.zielpunkt;
    
    return route
    }
  public boolean existAsDirectLink(Point point1, Point point2){
    
    Point[] route = this.getCompleteRoute();
    int index1 = Arrays.asList(route).indexOf(point1);
    int index2 = Arrays.asList(route).indexOf(point2);
    
    if (index2 - 1 == index1 || index2 + 1 == index1) {
      return true;
    }
    
    return false;
  }
  public boolean existAsLink (Point point1,Point point2){
    Point[] route = this.getCompleteRoute();
    if (Arrays.asList(route).indexOf(point1) != false && Arrays.asList(route).imdexOf(point2) != false) {
      
    } // end of if
  if (this.existAsDirectLink() == true || indirectLink == true ) {
      return true;
  } // end of if
    return false;
    }
  
  public boolean isConnected(Point point) {
    if (this.startpunkt == point) {
      return true;
    }
    if (this.zielpunkt == point) {
      return true;
    } // end of if-else
    for (int i = 0;i<this.zwischenpunkte.length;i++ ) {
      if (this.zwischenpunkte[i] == point) {
        return true;
      } // end of if 
    } // end of for
    return false;
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
