package com.mec.brandhini;
import java.io.*;
/**
 * Created by Mec on 12/12/2016.
 */
public class PuppyTest {

    public static void main(String args[]) {

        Puppy pupper1 = new Puppy();
        Puppy pupper2 = new Puppy();
        Puppy pupper3 = new Puppy();

        pupper1.setName("Chop");
        pupper1.age(2);
        pupper1.breed("Tan Frenchie");
        pupper1.printPupper();

        pupper2.setName("Balou");
        pupper2.age(3);
        pupper2.breed("Blue Frenchie");
        pupper2.printPupper();

        pupper3.setName("Hamlet");
        pupper3.age(1);
        pupper3.breed("Black & Tan Frenchie");
        pupper3.printPupper();

    }
}
