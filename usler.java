import java.util.Scanner;

public class usler {
    public static void main(String[] args) {
        int n, i, u = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Sayi Gir:");
        i = in.nextInt();

        for (n = 1; n <= i; n *= 5) {

            System.out.println(n);
        }
            for (n = 1; n <= i; n *= 4) {

                System.out.println(n);

            }


        }

    }






