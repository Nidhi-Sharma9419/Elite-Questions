package clssesobjconstrtor;

import jdk.swing.interop.SwingInterOpUtils;

public class Sample extends Object{
    public static void main(String[] args){
        System.out.println(Gender.FEMALE.comment());
        //PRINTS '1: F'
        System.out.println(Gender.MALE.comment());
        System.out.println(Gender.UNDEFINED.comment());
    }
}
