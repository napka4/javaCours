import java.util.ArrayList;
import java.util.List;


class ExerciceListDyn {
    public static void main(String[] args) {

        List<String> maList = new ArrayList<String>();

        maList.add("Pepito");
        maList.add("Prince");
        maList.add("Fromage");

        for(int i = 0 ; i < maList.size(); i++) {
            System.out.println("Il y a dans ma liste " + maList.get(i));
        }//fin boucle

        //jours de la semaine en list, avec le dimanche qui commence la semaine
        List<String> semaine = new ArrayList<String>();

        semaine.add("Lundi");
        semaine.add("Mardi");
        semaine.add("Mercredi");
        semaine.add("Jeudi");
        semaine.add("Vendredi");
        semaine.add("Samedi");
        semaine.add("Dimanche");

        for (int i = 0; i < semaine.size(); i++) {
            System.out.println(semaine.get(i) + "------");
        }

        String dimanche = semaine.get(6);
        semaine.remove(6);
        semaine.add(0, dimanche);

        for (int i = 0; i < semaine.size(); i++) {
            System.out.println(semaine.get(i));
        }
    }//fin
}//fin class