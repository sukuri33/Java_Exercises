package DailyStuff;

import java.util.Scanner;

/**
 * A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.
 *
 * Implement the lameDb() method
 *
 * This method has 4 String parameters and returns a String
 *
 * db: information in database. Each item is separated by a #. Each element will also have a number in the beginning about which element it is.
 * op: action that will be taken on database (add, edit, or remove)
 * id: The id number that will be manipulated
 * data: extra data that will be used alongside operation
 * The method returns the modifed database
 */
public class ReplitTask {

    public static String lameDb(String db, String op, String id, String data) {
        String[] dbItems = db.split("#");
        String temp = "";
        int j = 0;
        switch(op){
            case "delete":
                for (int i = 0; i < dbItems.length; i++) {
                    if (dbItems[i].contains(id)){
                     temp += dbItems[i].replace(dbItems[i],"");
                     continue;
                    }
                    temp += dbItems[i]+"#";
                }
                break;
            case "edit":
                for (int i = 0; i < dbItems.length; i++) {
                    if (dbItems[i].contains(id)){
                        temp += dbItems[i].replace(dbItems[i].substring(1),data)+"#";
                        continue;
                    }
                    temp += dbItems[i]+"#";
                }
                break;
            case "add":
                if (dbItems.length < Integer.valueOf(id)){
                    temp = db+"#"+id+data;
                }else{
                    for (int i = 0; i < dbItems.length; i++) {
                        j++;
                        if (dbItems[i].contains(id)){
                            temp+= j+data+"#";
                            j++;
                            dbItems[i] = j+dbItems[i].substring(1);
                            temp+=dbItems[i]+"#";
                            //j++;
                            continue;
                        }
                        temp += j+dbItems[i].substring(1)+"#";
                    }
                }
                break;
        }
        if (temp.charAt(temp.length()-1) == '#'){
            temp = temp.substring(0,temp.length()-1);
        }
        return temp;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}