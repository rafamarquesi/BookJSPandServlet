package com.example.model;

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
      return(brands);      
   }
   //fdp
}