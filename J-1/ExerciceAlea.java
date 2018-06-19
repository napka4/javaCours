import java.util.Arrays;
import java.util.List;


class ExerciceAlea {
    public static void main(String[] args) {

        //methode simple:
//        int[]maListe = {1,6,7,9,5};
//
//        Arrays.sort(maListe);
//
//        System.out.println(Arrays.toString(maListe));

        //methode dure !
        int[]maListe = {1,6,7,9,5};

        for (int i = 0; i < maListe.length; i++) {
            for (int j = i; j < maListe.length; j++){
                if(maListe[i] > maListe[j]) {
                    int temp = maListe[i];
                    maListe[i] = maListe[j];
                    maListe[j] = temp;
                }
            }
        }
        for(int i = 0; i < maListe.length; i++) {
            System.out.println(maListe[i]);
        }

    }
}