import Utils.Utils;

public class Calculadora {
    public static void main(String[] args) {
        int resultat  = 0;
        boolean sortir = false;
        while (!sortir){
            int operador1 = Utils.LlegirInt("Escriu el valor del primer operador: ");
            int operador2 = Utils.LlegirInt("Escriu el valor del segon operador: ");
            int opcio = Utils.LlegirInt(getMenu());
            switch (opcio){
                case 1: resultat = suma(operador1,operador2);
                        break;
                case 2: //resultat = resta(operador1,operador2);
                        break;
                case 3: //resultat = divisio(operador1,operador2);
                        break;
                case 4: //resultat = multiplicacio(operador1,operador2);
                        break;
                case 5:  sortir = true;

            }
            System.out.println("El resulta de la operacio es " + resultat);
        }

    }

    public static int suma (int a,int b){
        return a + b;
    }

    private static String getMenu() {
        return "Quina operació vols realitzar:\n"+
                              "  1-suma\n"+
                              "  2-resta\n"+
                              "  3-divisió\n"+
                              "  4-multiplicacio\n"+
                              "  5-sortir";
    }

}
