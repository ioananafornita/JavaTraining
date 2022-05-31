package org.example;

import Tests.Car;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car();
        System.out.println(car1.getColor());
        car1.setColor("Green");
        System.out.println(car1.getColor());
        System.out.println(car1.getStarted());
        car1.Start();
        System.out.println(car1.getStarted());
        car1.Stop();
        System.out.println(car1.getStarted());
        car1.Signal("Left");
        System.out.println(car1.getSignalingLeft());
        if (car1.getSignalingLeft())
        {
            System.out.println("Signaling Left");
        }
        car1.Start();
        if (car1.getStarted() ==true)
        {
            System.out.println("engine start");
        }
        car1.Signal("Right");
        if (car1.getSignalingRight())
        {

            System.out.println("Signaling right");
        }
        car1.Stop();
        if (car1.getStarted() ==false)
        {
            System.out.println("the engine stopped");
        }
        Car car2 = new Car();
        //structura obiect = instantierea unei clase se face folosind cuvantul "new"
        System.out.println(car2.getColor());
    }

}