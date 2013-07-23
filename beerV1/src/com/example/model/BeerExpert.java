package com.example.model;

import java.util.*;

public class BeerExpert
{
   public List getBrands(String color, String body)
   {
      List brands = new ArrayList();
      if (color.equals("amber") && body.equals("medium"))
      {
         brands.add("Jack Amber");
         brands.add("Red Moose");
      } else 
      {
         brands.add("Jail Pale Ale");
         brands.add("Gout Stout");
      }
      return(brands);      
   }
   
   public String getAdvice(String answer){
	   
	   
	   return null;
   }
}
