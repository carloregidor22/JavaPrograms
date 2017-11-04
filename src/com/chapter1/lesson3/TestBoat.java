package com.chapter1.lesson3;

public class TestBoat
{
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Boat b2 = new Sailboat();
        Boat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat {
    private int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength() {
        return length;
    }
    public void move() {
        System.out.println("drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
    public void move(){
    	System.out.println("Further row");
    }
}
class Sailboat extends Boat {
    public void move() {
        System.out.println("hoist sail ");
    }
}
