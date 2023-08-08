import java.util.Scanner;
//Import to scan user input
public class Main {                                     //Main class
    static Scanner in = new Scanner(System.in);
    //Inserting scanner
    public static void main(String[] args) {            //Main method

        String pilih;

        System.out.println("WELCOME");                  //Main menu
        System.out.println("Nak makan ke minum?");
        pilih = in.nextLine();

        try {                                           //Exception handling for user input
            if (pilih.equals("makan")) {
                Hidangan.Makan();
            } else if (pilih.equals("minum")) {
                Hidangan.minum();
            } else {
                System.out.println("BYE");
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }

    }

    public static class Hidangan {                      //Superclass Hidangan

        public static void Makan() {                    //Method for pilihan hidangan makan
            String pilih;

            System.out.println("Makan apa?");           //Makan main menu
            System.out.println("1. Buah");
            System.out.println("2. Mee");
            pilih = in.nextLine();

            try {                                       //Exception handling for user input
                if (pilih.equals("buah")) {
                    Buah buah = new Buah();
                    buah.rasa();
                } else if (pilih.equals("mee")) {
                    Mee mee = new Mee();
                    mee.rasa();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }

        public static void minum() {                    //Method for pilihan hidangan minum
            String pilih;
            System.out.println("Minum apa?");           //Minum main menu
            System.out.println("1. Air kosong");
            System.out.println("2. Teh tarik");
            pilih = in.nextLine();

            try {                                       //Exception handling for user input
                if (pilih.equals("air kosong")) {
                    Air air = new Air();
                    air.rasa();
                } else if (pilih.equals("teh tarik")) {
                    Teh teh = new Teh();
                    teh.rasa();
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
    }

    public static class Buah extends Hidangan {         //Subclass Buah inherited from Hidangan(superclass)
        public Buah() {                                 //Constructor for Buah class

        }

        public void rasa() {                            //Method for buah
            System.out.println("Wah,,buah ini manis");
        }
    }

    public static class Mee extends Hidangan {          //Subclass Mee inherited from Hidangan(superclass)
        public Mee() {                                  //Constructor for Mee class

        }

        public void rasa() {                            //Method for mee
            System.out.println("Ish,,mee ini masin");
        }
    }

    public static class Air extends Hidangan {          //Subclass Air inherited from Hidangan(superclass)
        public Air() {                                  //Constructor for Air class

        }

        public void rasa() {                            //Method for air
            System.out.println("Aik kenapa air ini masin?");
        }
    }

    public static class Teh extends Hidangan {          //Subclass Teh inherited from Hidangan(superclass)
        public Teh() {                                  //Constructor for Teh class

        }

        public void rasa() {                            //Method for teh
            System.out.println("Ish,,manis gile");
        }
    }
}
