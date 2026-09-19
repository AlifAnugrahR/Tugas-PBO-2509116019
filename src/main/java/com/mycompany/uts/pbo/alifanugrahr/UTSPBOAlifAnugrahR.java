package com.mycompany.uts.pbo.alifanugrahr;

import Controller.SatwaCRUD;
import view.Menu;
import java.util.Scanner;

public class UTSPBOAlifAnugrahR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SatwaCRUD crud = new SatwaCRUD();

        Menu.jalankan(input, crud);

        input.close();
    }
}