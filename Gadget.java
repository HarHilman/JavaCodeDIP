import java.util.Scanner;
public class Gadget {                                   //Superclass

    String choose;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choose;

        System.out.println("Hello viewers!");           //Main Menu
        System.out.println("Choose your model");
        System.out.println("1.Samsung");
        System.out.println("2.Apple");
        choose = in.nextLine();

        try{                                            //Exception handling
            if(choose.equals("Samsung")){
                phone.enter();
            }else if(choose.equals("Apple")){
                phone.enter2();
            }
        }catch(Exception ex){
            System.out.println("Error");
        }

    }
    public static class phone extends Gadget{           //Class phone(Subclass) inherit from class gadget(super class)
        public static void enter(){
            System.out.println("Hey bixby");
        }
        public static void enter2(){
            System.out.println("Hey siri");
        }
    }
}