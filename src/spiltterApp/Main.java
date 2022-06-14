package spiltterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Budget Splitter App!");
        Scanner input = new Scanner(System.in);

        System.out.println("How many people will be joining this budget?");
        ArrayList<User> usersList = prepareUserLists(input);

        String[] options = optionsList();

        while(true){
            System.out.println("What would like to do?");

            for (int i = 0; i < options.length; i++) {
                System.out.println(options[i]+":"+(i+1));
            }

            int selectedOp = input.nextInt();

            switch(selectedOp -1){
                case 0:

                    Expense expense = new Expense();
                    System.out.println("Expense name:");
                    expense.expenseName = input.next();
                    System.out.println("Expense amount:");
                    expense.amount = input.nextDouble();

                    for (User user : usersList) {
                        System.out.println("id: "+usersList.indexOf(user)+" name:"+user.fName);
                    }

                    int userId = input.nextInt();
                    expense.user = usersList.get(userId).fName;

                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }





    }
    public static ArrayList<User> prepareUserLists (Scanner input){
        ArrayList<User> usersList = new ArrayList<>();
        int pplCount = input.nextInt();
        for (int i = 0; i < pplCount; i++) {

            User user = new User();
            System.out.println("Name:");
            user.fName = input.next();
            System.out.println("Email:");
            user.email = input.next();
            usersList.add(user);
        }
        return usersList;
    }

    public static String[] optionsList(){
        String[] options = {"Make Expense","List Specific Person Expense","List All Expenses","Make Split","List All Users", "Close the budget"};
        return options;
    }
}
