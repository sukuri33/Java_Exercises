package Day19_assignments;

public class taskThree {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")){
                System.out.println("first index number of Gloves is: "+i);
                System.out.println(items[i].charAt(0));
            }
            if (items[i].equals("iPad")){
                System.out.println("iPad is exist in the items list");
            }
        }
        String reportList = "";
        if (items.length == prices.length && items.length == itemIDs.length){
            for (int i = 0; i < items.length; i++) {
                reportList += "\n"+items[i]+" - "+prices[i]+" - "+itemIDs[i];
            }
        }
        System.out.println(reportList);
    }
}

/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */
