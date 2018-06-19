import java.util.Scanner;

class ExerciceEntier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Donne un chiffre :");
        int unEntier = scanner.nextInt();

        System.out.println("Donne un  dousieme titi chiffre :");
        int deuzEntier = scanner.nextInt();

        System.out.println("Li resoultat c'est ça: " + (unEntier + deuzEntier));

        //moyenne de 3 chiffres
        System.out.println("L'éxo de la moyenne : Donne un premier titi chiffre :");
        int moyA = scanner.nextInt();

        System.out.println("Donne un  dousieme titi chiffre :");
        int moyB = scanner.nextInt();

        System.out.println("Donne un  3e titi chiffre :");
        int moyC = scanner.nextInt();

        System.out.println("La moyenne mesdames et monsieurs !!! roulement de tambour : " + ((moyA + moyB + moyC) / 3));
    }
}