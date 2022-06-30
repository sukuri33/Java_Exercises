package Day28_assignments.credentialsTask;

public class Credentials {
    private String userName;
    private String passWord;
    public Credentials(String userName, String passWord) {
        setUserName(userName);
        setPassWord(passWord);
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (isStrongPassword(passWord)) {
            this.passWord = passWord;
        } else {
            System.out.println("Your password isn't strong enough!");
            System.exit(1);
        }
    }

    private boolean isStrongPassword(String passWord) {
        boolean isStrong = false;
        int countOfLetter = 0;
        int countOfSpecialChar = 0;
        int countOfDigit = 0;

        if (passWord.length() >= 8 || !passWord.contains(" ")) {
            char[] eachChar = passWord.toCharArray();
            for (char c : eachChar) {
                if (Character.isLetter(c))
                    countOfLetter++;
                if (Character.isDigit(c))
                    countOfDigit++;
                if (!Character.isLetterOrDigit(c))
                    countOfSpecialChar++;
            }
            if (countOfDigit > 0 && countOfLetter > 0 && countOfSpecialChar > 0)
                isStrong = true;
        }
        return isStrong;
    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

/*
6. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */
