public class Polymorphism {
    public static void main(String[] args) {                                        //Main method
        System.out.println("Selamat datang ke kedai buah");
        System.out.println("Rasalah buah ini");

        Buah.nanas.makan();

        Buah.limau.makan();
    }

    static class Buah {                                                             //Class that will morph into other classes
        public static void makan() {
            System.out.println("Rasa buah ini sedap");
        }

        static class nanas extends Buah {                                          //Class buah polymorph into nanas
            public static void makan() {
                System.out.println("Rasa nanas ini manis");
            }
        }

        static class limau extends Buah {                                         //Class buah polymorph into nanas
            public static void makan() {
                System.out.println("Rasa limau ini masin");
            }
        }
    }
}
