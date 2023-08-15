import java.util.Scanner;
public class Class {                                                //Main class
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String name;
        String menu;
        System.out.println("Enter your username");                  //Main menu of the programme
        name = in.nextLine();
        System.out.println("Hello "+name);

        System.out.println("Select menu");
        System.out.println("1.satu1");
        System.out.println("2.dua2");
        menu = in.nextLine();

        if(menu.equals("satu")){
            first.bla();
        }else if(menu.equals("dua")){
            second.ble();
        }

    }
    public static class first{                                      //Other class
        public static void bla(){
            System.out.println("Helo u select 1");
        }
    }
    public static class second{                                     //Other class
        public static void ble(){
            System.out.println("Helo u select 2");
        }
    }
}