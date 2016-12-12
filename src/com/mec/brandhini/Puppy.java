package com.mec.brandhini;

import java.io.Serializable;

/**
 * Created by Mec on 12/12/2016.
 */

public class Puppy implements Serializable {
    int puppyAge;
    int humanAge;
    String puppyName;
    String breed;
    public static String name = "Test";
    public static int a = 10;
    public int b = 20;

    public Puppy()
    {
        this.puppyName="";
    }
    public void setName(String name)
    {
        this.puppyName = name;
    }
    public String getName()
    {
        return puppyName;
    }


   // public Puppy(String name) {
  //      // This constructor has one parameter, name.
   //     this.puppyName = name;
   // }

    public void age (int age){
        humanAge = age;
        puppyAge = humanAge*7;
    }

    public void breed (String breed_input){
        breed = breed_input;
    }

    public void printPupper(){
    System.out.println("Name: "+puppyName);
    System.out.println("Human Age: "+humanAge);
    System.out.println("Dog Age: "+puppyAge);
    System.out.println("Breed: "+breed);
    }

//    public void setAge( int age ) {
  //      puppyAge = age;
 //   }

 //   public int getAge( ) {
 //       System.out.println("Puppy's age is :" + puppyAge*7 );
 //       return puppyAge*7;
 //   }

  //  public static void main(String []args) {
  //    /* Object creation */
 //       Puppy myPuppy = new Puppy( "tommy" );
//
  //    /* Call class method to set puppy's age */
   //     myPuppy.setAge( 2 );
//
  //    /* Call another class method to get puppy's age */
    //    myPuppy.getAge( );
//
  //    /* You can access instance variable as follows as well */
    //    System.out.println("Variable Value :" + myPuppy.puppyAge );
    //}
}
