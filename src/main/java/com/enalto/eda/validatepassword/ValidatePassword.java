package com.enalto.eda.validatepassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void main(String[] args) {
        FormatPassword formatPassword = new FormatPassword("myPassword1*");
        System.out.println(formatPassword.isValid());
    }
}

class FormatPassword{
    private final String password;

    private static final String
            REGEX_PASSWORD =
            "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%&*])[A-Za-z\\d@#$%*?&]{8,}$";

    public FormatPassword(String password){
        this.password = password;
    }

    public boolean isValid(){
        //Pattern pattern = Pattern.compile("([^a-zA-Z])+([0-9])+([@#/$%^&+=!?-])+");
        Pattern pattern = Pattern.compile(REGEX_PASSWORD);
        Matcher matcher = pattern.matcher(this.password);

        return (matcher.matches());
    }
}
