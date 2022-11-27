package com.example.halozatkerdesgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {
    List<String> questions = new ArrayList<String>();



    public static String generateQuestion(Questions x){

        String q = "";

        int y = (int) (Math.random() * x.questions.size());




        return x.questions.get(y);
    }


    public static Questions loadQuestions(Questions x) throws FileNotFoundException {



        File file=new File("E:\\PROGRAMOZAS\\javaEgyetem\\Halozatkerdesgenerator\\src\\main\\java\\com\\example\\halozatkerdesgenerator\\questions.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            x.questions.add(sc.nextLine());
        }



        return x;
    }



}
