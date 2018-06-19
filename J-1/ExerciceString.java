import java.util.Scanner;

class ExerciceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecris quelque chose petit :");
        String str = scanner.nextLine();

        System.out.println("C'est tout gros: " + str.toUpperCase());

        //le premier caractère et le dernier caractère a affiché
        System.out.println("rentre un truc que tu veux : ");
        String mdr = scanner.nextLine();
        int last = mdr.length() - 1;

        System.out.println(" le premier caractère est " + mdr.charAt(0));
        System.out.println(" le dernier caractère est " + mdr.substring(last));
    }
}