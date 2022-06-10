package DailyStuff;

import java.util.Scanner;

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


/*
public static String lameDb(String db, String op, String id, String data) {
            String[] dbItems = db.split("#");
        String temp = "";
        int j = 1;
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
                        if (dbItems[i].contains(id) && id.equals("1")){
                            temp += j+data+"#";
                            j++;
                            dbItems[i] = j+dbItems[i].substring(1);
                            temp+=dbItems[i]+"#";
                            continue;
                        }
                        j++;
                        temp += j+dbItems[i].substring(1)+"#";
                    }
                }
            default:

        }
if (temp.charAt(temp.length()-1) == '#'){
    temp = temp.substring(0,temp.length()-1);
}
return temp;

  }//end lameDb

 */