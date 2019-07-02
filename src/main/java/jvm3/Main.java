package jvm3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // #####
    // #   #
    // #   #
    // #   #
    // #####

    // wpisuje 1

    // #####
    // ##  #
    // #   #
    // #   #
    // #####

    // wpisuje 9

    // #####
    // ##  #
    // #   #
    // #  ##
    // #####

    // wpisuje 5

    // #####
    // ##  #
    // # # #
    // #  ##
    // #####
    public static void main(String[] args) {
        Plansza plansza = new Plansza();

        Scanner scanner = new Scanner(System.in);

        while (!plansza.jestKompletna()) {
            plansza.wypisz();
            try {
                int numerKomorki = scanner.nextInt();
                plansza.zaznacz(numerKomorki);
            } catch (InputMismatchException ime) {
                scanner.nextLine();
            }
        }

        plansza.wypisz();
    }
}
