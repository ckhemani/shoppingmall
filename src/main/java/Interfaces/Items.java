package Interfaces;

import java.util.HashMap;

public interface Items {
    HashMap<String, Double> item();

    default void check(){
        System.out.println("Test default function in Interface");
    }
}