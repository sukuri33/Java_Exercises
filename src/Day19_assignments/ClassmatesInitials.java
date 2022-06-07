package Day19_assignments;

public class ClassmatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Ahmet Tugrul","Alena Elhajassaad","Alexander Bessonov","Baturay Gok","Ermek Keneshbekovich","Esmira Mindrescu"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].substring(0,1)+classmates[i].substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2));
        }
    }
}

/*


1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines


 */
