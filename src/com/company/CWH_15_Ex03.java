package com.company;

import java.util.Locale;

public class CWH_15_Ex03 {
    public static void main(String[] args) {

        //lowerCaseSString

        String name="RahulNagulkar";

        name=name.toLowerCase(Locale.ROOT);

        System.out.println(name);

        //replace spaces with underscore

        String name1="  Rahul  Nagulkar";

        name1=name1.replace(" ","_");

        System.out.println(name1);

        //Fill in letter temlate

        String letter="Dear <|name|>, Thanks a lot!";

        letter = letter.replace("<|name|>", "Rahul");
        System.out.println(letter);

        //Detect double and triple spaces in string

        String name3="Rahul is very  good   boy";
        System.out.println(name3.indexOf("  "));
        System.out.println(name3.indexOf("   "));

        //Letter using escape sequence character

        String name4="Dear Rahul, This java course is nice. Thanks";

        System.out.println("Dear Rahul,\n\t This java course is nice. \n\t Thanks");

    }


}
