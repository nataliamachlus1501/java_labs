package collections_pt1;

import exceptions.NotPositiveNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LodówkaApp {
    public static void main(String[] args) {
        boolean close = false;
        while (!close) {
            System.out.print("Chose an operation from 'dodaj', 'wez', 'wyświetl','zamknij': ");
            Scanner input = new Scanner(System.in);
            String s = input.next();
            switch (s) {
                case "dodaj":
                    System.out.println("Enter name of food you want to add: ");
                    String n1 = input.next();
                    System.out.println("Enter amount of food: ");
                    int i1 = 0;
                    try {
                        i1 = input.nextInt();
                        if(i1 < 0) {
                            throw new NotPositiveNumberException("You entered a negative value.");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("You entered wrong value.");
                        break;
                    }catch(NotPositiveNumberException e){
                            System.out.println(e.getMessage());
                            break;
                    }
                    Lodówka.dodaj(n1, i1);
                    break;
                case "wez":
                    System.out.println("Enter name of food you want to take: ");
                    String n2 = input.next();
                    System.out.println("Enter amount of food you want to take: ");
                    int i2 = 0;
                    try {
                        i2 = input.nextInt();
                        if(i2 < 0){
                            throw new NotPositiveNumberException("You entered a negative value.");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("You entered wrong value.");
                        break;
                    }catch(NotPositiveNumberException e){
                        System.out.println(e.getMessage());
                        break;
                    }
                    Lodówka.weź(n2, i2);
                    break;
                case "wyswietl":
                    Lodówka.wyświetl();
                    break;
                case "zamknij":
                    close = true;
                    break;
                default:
                    System.out.println("There is no such a operation");
                    break;

            }
        }
    }
}
