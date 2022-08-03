
public class Password {
    //Here we have a num , a type date which declare a collection of constants

    public static enum Numero {
        UNO("One", "Huk", "Um"),
        DOS("Two", "Iskay", "Dois"),
        TRES("Three", "Kinsa", "Três"),
        CUATRO("Four", "Tawa", "Quatro"),
        CINCO("Five", "Pisqa", "Cinco"),
        SEIS("Six", "Soqta", "Seis"),
        SIETE("Seven", "Qanchis", "Sete"),
        OCHO("Eight", "Pusaq", "Oito"),
        NUEVE("Nine", "Isqon", "Nove"),
        DIEZ("Ten", "Chunka", "Dez");

        private String english;
        private String quechua;
        private String portugues;

        private Numero(String e, String q, String p) {
            english = e;
            quechua = q;
            portugues = p;
        }

        public String getEnglish() {
            return english;
        }

        public String getQuechua() {
            return quechua;
        }

        public String getPortugues() {
            return portugues;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < Numero.values().length; i++) {
            System.out.println(Numero.values()[i].getQuechua() + "," + Numero.values()[i].getEnglish() + "," + Numero.values()[i].getPortugues());
        }

        System.out.println("\nhora en distintos idiomas :D! y con ForEach\n");
        for (Numero numero : Numero.values()) {
            System.out.println(numero.getQuechua() + "," + numero.getEnglish() + "," + numero.getPortugues());
        }
    }
}