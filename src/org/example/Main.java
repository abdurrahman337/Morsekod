package org.example;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) { // Här har vi en While-Loop och While-loopen exekveras om och om igen, så länge som villkoret är uppfyllt
                    System.out.println("Select conversion mode, type 'exit' to quit! ");
                    System.out.println("1: Text to Morse Code");
                    System.out.println("2: Morse Code to Text");
                    String choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("exit")) { // ignorerar upper lowercase när man skriver exit.
                        System.out.println("Exiting program.");
                        break; //Break hjälper oss med att avsluta från loopen omedelbart.
                    }
                      // Här säger vi att vad är värdärna "choice"
                    switch (choice) {  //I switch-satsen definieras en eller flera case-satser som sedan avslutas med nyckelordet break
                        // Här säger vi Switch och Case .
                        case "1":                //Vad kan case ("1" värde) kan vara                          // Första Vilkoren
                            System.out.println("Enter English Text:");
                            String textInput = scanner.nextLine().toUpperCase();
                            System.out.println("Morse Code: " + org.example.MorsekodConverter.toMorseCode(textInput));
                            break;   //
                        case "2":    // Andra vilkoren
                            System.out.println("Enter Morse Code (separate characters with semicolons!)");
                            String morseInput = scanner.nextLine();
                            System.out.println("Text: " + org.example.MorsekodConverter.fromMorseCode(morseInput));
                            break;
                        default:
                            System.err.println("Invalid choice. Please enter 1 or 2.");   // Om  Choice får en unexpected value  då kommer fram
                            // Default valuen som är ("Invalid choice. Please enter 1 or 2.")
                    }

                    System.out.println(); // Skriv ut en tom rad för bättre läsbarhet /förståelse
                }

            }
        }

