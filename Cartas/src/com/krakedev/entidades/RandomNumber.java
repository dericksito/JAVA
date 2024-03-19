package com.krakedev.entidades;

import java.util.Random;

public class RandomNumber {
    public static int obtenerPosicion() {
        Random rand = new Random();
        return rand.nextInt(52); 
    }
}
