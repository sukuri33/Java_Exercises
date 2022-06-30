package Day30_assignments.deviceTask;


import Day30_assignments.deviceTask.phones.IPhone;

public class MyDevices {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("12Mini","Blue",5,799.99,true,true);
        System.out.println(iPhone);
        iPhone.faceTime();
        iPhone.call();
        iPhone.text();
    }

}
