package com.company;

/*

1529. Level 15 Lection 12. Mastering a Static Block
1. Create separate Plane and Helicopter classes that implement the Flyable interface in separate files.
2. The Plane class must have a constructor with the int parameter - the number of passengers carried.
3. In the static reset method of the Solution class:
3.1. Read from the console a parameter of type String.
3.2. If the parameter is “helicopter”, then assign a Helicopter class object to the Flyable result static object.
3.3. If the parameter is "plane", then read the second parameter of type int (number of passengers), assign the object of class Plane to the static object Flyable result.
4. In the static block, initialize the Flyable result by calling the reset method.
5. Close the input stream using the close () method.

Requirements:
1. The Plane class must be created in a separate file and implement the Flyable interface.
2. The Helicopter class must be created in a separate file and implement the Flyable interface.
3. The Plane class must have a constructor with an int parameter.
4. In the Solution class, the static reset method must be implemented.
5. The reset method should read a line from the keyboard.
6. If the entered string is "helicopter", an object of the Helicopter type must be stored in the result variable.
7. If the input string is "plane", an object of type Plane must be stored in the variable result.
8. The result field of the Solution class must be initialized in a static block by calling the reset method.


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {

        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static Flyable result;

    public static void reset() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        if (s.equals("helicopter")){
            result = new Helicopter();
        }

        else if (s.equals("plane")){
            int pCount = Integer.parseInt(reader.readLine());

            result = new Plane(pCount);
        }
        //add your code here - добавьте код тут
    }
}

class Plane implements Flyable {

    private int passenger;
    @Override
    public void fly() {

    }

    public Plane(int passenger) {
        this.passenger = passenger;
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly() {

    }
}

interface Flyable {
    void fly();
}

