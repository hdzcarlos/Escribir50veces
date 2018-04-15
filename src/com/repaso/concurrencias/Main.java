package com.repaso.concurrencias;

public class Main {

    public static void main(String[] args) {
        Thread hiloA = new Thread (() ->{
            Thread.currentThread().setName("Hilo A");
            for (int i = 0; i<50; i++){
                System.out.println(Thread.currentThread().getName());
            }

        });
        Thread hiloB = new Thread (() ->{
            for (int i = 0; i<50; i++){
                System.out.println("Hilo B");
            }

        });
        Thread hiloC = new Thread (() ->{
            for (int i = 0; i<50; i++){
                System.out.println("Hilo C");
            }

        });
        hiloA.start();
        hiloB.start();
        hiloC.start();
    }
}
