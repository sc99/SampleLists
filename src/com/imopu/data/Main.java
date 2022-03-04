package com.imopu.data;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Arreglo unidisemnsional
    private static String[] names = new String[10];


    public static void main(String[] args) {
	        names[0] = "Fulanito";
            names[1] = "Sutanita";
            names[9] = "Perengano";

            names[2] = "";
        ArrayList<String> namesList = new ArrayList<>();

        for(int i = 0; i < names.length; i++) {
            namesList.add(names[i]);
        }
        System.out.println(namesList.size());
        System.out.println(namesList.get(0));
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        for (String s: namesList) {
            System.out.println(s);
        }
    }
}
