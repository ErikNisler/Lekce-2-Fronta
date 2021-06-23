package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OrderList orderList = new OrderList();
        //Registrace pacienta
        Patient patient1 = new Patient("Jarek", LocalDate.of(2000,4,4), Sex.MALE, "Sportovní 2");
        Patient patient2 = new Patient("Erik", LocalDate.of(1995,4,5), Sex.MALE, "Holandská 9");
        Patient patient3 = new Patient("Marek", LocalDate.of(1997,4,10), Sex.MALE, "Pařížská 43");

        //Objednání pacienta + vložení do řady objednaných

        orderList.ordering(patient1,LocalDate.of(2021,5,11),"Bolest zad",Request.PREVENTION);
        orderList.ordering(patient2,LocalDate.of(2021,5,12),"Zlomená ruka",Request.URGENT);
        orderList.ordering(patient3,LocalDate.of(2021,5,13),"Angína",Request.ORD_MEDICAMENTS);


        //Vypsání pořadového čísla
        System.out.println(patient1.getName() + ", " + patient1.getId());
        System.out.println(patient2.getId());


        //Vyvolání dalšího pacienta
        System.out.println(patient1.getName());

        //Odstranění pacienta ze seznamu čekajících

        //Rozšíření

        HashMap<Integer, Patient> invocation = new HashMap<>();

        invocation.put(patient1.getId(),patient1);
        invocation.put(patient2.getId(),patient2);
        invocation.put(patient3.getId(),patient2);

        Patient value1 = invocation.get(patient1.getId());
        System.out.println("Hashmap:" +value1.getAll());

        //Vyvolání konkrétního pacienta pomocí zadaného jména nebo pořadového čísla

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej ID a já ti vypíšu pacienta: ");
        Integer input = scanner.nextInt();
        System.out.println(orderList.invocation(input));


    }
}
