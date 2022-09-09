package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {
        inventoryDAO id=new inventoryDAO();
        inventory i=new inventory();
        inventory i2=new inventory();
       // i.setItemid(003);

     //   i.setItemname("Glasses");

       // id.addinventory(i);



     i= id.findinventory(3);
        System.out.println("found"+i);
     id.deleteinventory(3);
  //   System.out.println("Deleted "+i);

    }
}
