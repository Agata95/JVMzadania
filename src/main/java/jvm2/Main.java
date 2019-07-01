package jvm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // użytkownik ma wpisać liczbę
        // jeśli nie wpisze liczby lub nie poporawną liczbę to ponowić pytanie
        // jeśli wpisał poprawnie wypisz N razy "Hello World"

        // String[] args - args
        // args[1] - zawiera liczbę
        // args.length >= 1

//        Rozwinięcie:
        // jeśli liczba tam jest (args[1] jest liczbą)
        // jeśli liczba tam jest, to pętla powinna wypisywać Hello World tyle razy i kończyć program
        // jeśli liczby nie ma, to program ma działać jak wcześniej (wczytywać ze scannera)

        Scanner scanner = new Scanner(System.in);
        Integer iloscObiegow;
        if (args.length >= 1) {
            iloscObiegow = Integer.parseInt(args[0]);
        } else {
            iloscObiegow = null;
        }

//        while (iloscObiegow == null){
//            System.out.println("Podaj liczbę:");
//            String parametr = scanner.nextLine();
//
//            try {
//                int ilosc = Integer.parseInt(parametr);
//                iloscObiegow = ilosc;
//            }catch (IllegalArgumentException iae){
//                System.out.println("To nie jest liczba.");
//            }
//        }

        while (iloscObiegow == null) {
            System.out.println("Podaj liczbę:");
            try {
                int ilsoc = scanner.nextInt();
                iloscObiegow = ilsoc;
            } catch (InputMismatchException ime) {
                System.out.println("TO NIE JEST LICZBA!");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < iloscObiegow; i++) {
            System.out.println("Hello World!");
        }

    }
}
