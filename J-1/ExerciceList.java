class ExerciceList {
    public static void main(String[]args) {

        int maList[] = {4,8,2,4,6};

        for(int i = 0; i < maList.length; i++) {

            System.out.println(maList[i]);

        }//fin de la boucle
System.out.println("------exo 1 :-----");

        //exo 1
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {

                System.out.print("*");

            }//fin de la deuxième boucle
            System.out.println("");
        }//fin de la boucle exo 1

System.out.println("----------exo 2:-----------");

        //exo2
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }//fin de la deuxième boucle
            System.out.println("");
        }//fin de la 1ere boucle

    }//fin

}//fin de la classe