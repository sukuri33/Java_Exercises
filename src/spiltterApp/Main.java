package spiltterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner object to take various user inputs for the application
        Scanner scanner = new Scanner(System.in);

        //Greeting message
        System.out.println("Welcome to Budget Planner!");

        //Asking how many ppl would be in this budget planner?
        System.out.println("How many people will split the budget?");

        //Users DB - to store participants into DB(for now in this ArrayList)
        ArrayList<User> userList = prepareUserLists(scanner);
                                  //
        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count : " + userList.size());

        String [] optionList = prepareOptionList();

        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<optionList.length;i++){

                System.out.println(optionList[i] + ":" + (i+1));

            }

            int request =  scanner.nextInt();

            switch(request-1){
                case 0:

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");
                    expense.amount = scanner.nextInt();


                    System.out.println("Which user made this expense? Just type user id: ");

                    for(User user : userList){
                        System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
                    }

                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;

                    expenseList.add(expense);
                    break;

                case 1:

                    System.out.println("Please provide user name that you would like to search");
                    String userName = scanner.next();

                    User myUser = null;

                    for(User chosenUser : userList){

                       if(chosenUser.name.equals(userName)){
                            myUser = chosenUser;
                            break;
                       }
                    }

                    if(myUser == null){
                        System.out.println("User not exists!");
                        break;
                    }

                    int userExpenseAmount = 0;
                    int expenseCount=0;

                    for(int i=0;i<expenseList.size();i++){

                        if(expenseList.get(i).user.equals(userName)){

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;

                            System.out.println(expenseCount + " -expense amount:" + expenseList.get(i).amount + ",expense by :" + expenseList.get(i).user);
                        }

                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);
                    break;


                case 2:

                    for(int i = 0;i<expenseList.size();i++){
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }
                    break;

                case 3:

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split : splitList){

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();

        for(Split split : splitList){
            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " need to give " + (-1 * (split.amount-amount)));
            }
        }
    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

            ArrayList<Split> splitList = new ArrayList<>();

            for(Expense expense : expenseList){

                Split split = existSplitList(expense.user,splitList);

                if(split != null){
                    split.amount += expense.amount;
                }else{
                    Split willbeAdded = new Split();
                    willbeAdded.userName = expense.user;
                    willbeAdded.amount = expense.amount;
                    splitList.add(willbeAdded);
                }

            }

            return splitList;
    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }
        return null;
    }

    /**
     * Purpose: prepareUserLists method is responsible for recording users into DB and return it
     * back to application whenever is needed
     *
     * @param scanner - Scanner Object for taking the input from user to create a user list
     * @return this method returns userList object of ArrayList class in which added users will be stored
     */
    public static ArrayList<User> prepareUserLists(Scanner scanner){

        ArrayList<User> userList = new ArrayList<>(); // created an ArrayList instance to collect users

        int userCount = scanner.nextInt(); //Asking how many participants will be there in this budgeting plan

        for(int i=0;i<userCount;i++) {

            User user = new User(); // this object will be used to store participants information

            System.out.println("Name: ");
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            userList.add(user); // each iteration one participant information will be stored into this user obj

        }

        return userList; //after desired amount of head count info is stored into user obj then it will be returned
    }

    /**
     * This is a method where all the possible options are stored.
     * Isolating it into a method like this would be helpful in the case that we decided to update anything
     * then we can make a such change within this method and rest of the application won't be impacted
     *
     * @return String Array
     */
    public static String[] prepareOptionList(){

        /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {"Make Expense","List Specific Person Expense","List All Expenses","Make Split","List All Users","Close the budget"};
        return optionList;
    }
}

