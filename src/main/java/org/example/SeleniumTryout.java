package org.example;

import java.util.Scanner;

public class SeleniumTryout {

    public static String site = "https://www.google.com/";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n1. close()" +
                "\n2. get()" +
                "\n3. getTittle()" +
                "\n4. getPageSource" +
                "\n5. getCurrentUrl" +
                "\n6. quit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Select a browser: \n1.Chrome " +
                        "\n2. Firefox" +
                        "\n3. MS Edge");
                int browserChoice = scan.nextInt();
                if (browserChoice == 1 )
                {
                    Store.chrome().close();
                    System.out.println("Close successful");
                }
                else if (browserChoice == 2)
                {
                    Store.fireFox().close();
                    System.out.println("Close successful for Firefox");
                }
                else
                {
                    Store.msEdge().close();
                    System.out.println("Close successful for MS Edge");
                }
                break;

            case 2:
                System.out.println("Select a browser: \n1.Chrome " +
                        "\n2. Firefox" +
                        "\n3. MS Edge");
                int browserChoice2 = scan.nextInt();
                if (browserChoice2 == 1 )
                {
                    Store.chrome().get(site);
                    System.out.println("Google opened in chrome");
                }
                else if (browserChoice2 == 2)
                {
                    Store.fireFox().get(site);
                    System.out.println("Google opened in Firefox");
                }
                else
                {
                    Store.msEdge().get(site);
                    System.out.println("Google opened in MS Edge");
                }
                break;

            case 3:
                System.out.println("Select a browser: \n1.Chrome " +
                        "\n2. Firefox" +
                        "\n3. MS Edge");
                int browserChoice3 = scan.nextInt();
                if (browserChoice3 == 1 )
                {
                    Store.chrome().get(site);
                    System.out.println("Tittle is" + Store.chrome().getTitle());
                }
                else if (browserChoice3 == 2)
                {
                    Store.fireFox().get(site);
                    System.out.println("Tittle is" + Store.fireFox().getTitle());
                }
                else
                {
                    Store.msEdge().get(site);
                    System.out.println("Tittle is" + Store.msEdge().getTitle());
                }
                break;

            case 4:
                System.out.println("Select a browser: \n1.Chrome " +
                        "\n2. Firefox" +
                        "\n3. MS Edge");
                int browserChoice4 = scan.nextInt();
                if (browserChoice4 == 1 )
                {
                    Store.chrome().get(site);
                    System.out.println("PageSource: " + Store.chrome().getPageSource());
                }
                else if (browserChoice4 == 2)
                {
                    Store.fireFox().get(site);
                    System.out.println("PageSource: " + Store.fireFox().getPageSource());
                }
                else
                {
                    Store.msEdge().get(site);
                    System.out.println("PageSource: " + Store.msEdge().getPageSource());
                }
                break;
        }

    }
}
