import java.util.Scanner;

class ExercicePrompt {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecris un truc gros !");

        String input = scanner.nextLine();

        System.out.println("input = " + input);

        //exo multiplication
        System.out.println("Exo multiplication : rentre un chiffre !");

        int multi = scanner.nextInt();

        System.out.println("multiplication par lui même: " + multi * multi);

        //exo permutation

        System.out.println("Exo permutation : rentre un chiffre !");

        int a = scanner.nextInt();

        System.out.println("Donne un titi chiffre :");

        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.println("variable a = " + a + " variable b = " + b);
    }
}