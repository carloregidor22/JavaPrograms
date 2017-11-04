package com.chapter1.lesson2;

public class O extends X {

	String name;
    public static void main(String[] args) {
        O dog1 = new O();
        dog1.bark();
        dog1.name = "Bart";
        
        O[] myDogs = new O[3];
        myDogs[0] = new O();
        myDogs[1] = new O();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
        
        
    }
    
    public void go() {
        int x = 0;  //added initialization after verified that it doesn't compile
                   // without it -Tyler Boone
        int z = x + 3;
    }
    
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() { }
    
    public void chaseCat() { }

}
