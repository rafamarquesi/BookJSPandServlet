package com.example.model;
//esse capeta não ta funfando
import java.util.*;

public class BeerExpert
{
   public List getBrands(String color)
   {
      List brands = new ArrayList();
      if (color.equals("amber")) 
      {
         brands.add("[joe]Jack Amber");
         brands.add("[jone]Red Moose");
      } else 
      {
         brands.add("Jail Pale Ale");
         brands.add("Gout Stout");
      }
      System.out.println("imprime");
      return(brands);      
   }
}
