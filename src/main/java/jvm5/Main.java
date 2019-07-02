package jvm5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        String linia;
        do {
            linia = scanner.nextLine();

            switch (linia) {
                case "dodaj":
                    System.out.println("Ile?");
                    int ile = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < ile; i++) {
                        list.add(i);
                    }
                    break;
                case "usun":
                    System.out.println("Ile?");
                    int ileu = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < ileu; i++) {
                        list.remove(0);
                    }
                    break;
                case "gc":
                    // wymuszenie Garbage collectora.
                    Runtime.getRuntime().gc();
                    break;

                default:

            }
        } while (!linia.equalsIgnoreCase("stop"));

    }
}
