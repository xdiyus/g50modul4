package dopUrok210Google.ex1;

import java.util.Scanner;

public class Main {

    static Scanner scanner= new Scanner(System.in);
   static  Scanner scanner1 = new Scanner(System.in);
   static UserService userService = new UserService();
    public static void main(String[] args) {

        while (true){
            System.out.println("1.Login\t2.Register\t0.Exit");
            switch (scanner.nextInt()){
                case 1 -> {
                myAdd();
                }case 2 ->{

                }
                case 0 ->{return;}
                default ->{
                    System.out.println("Tugadi");
                }
            }
        }
        private static void myExam(){
            
        }

    }
    private static void myAdd(){

        System.out.println("User: ");
        String name = scanner1.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();

       User user = new User(age,name);

       if(userService.addUser(user)){
           System.out.println("User add");
       }
       else{
           System.out.println("Not found");
       }
    }
}
