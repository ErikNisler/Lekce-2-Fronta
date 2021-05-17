package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Registrace pacienta
        Patient patient1 = new Patient("Jarek", LocalDate.of(2000,4,4), Sex.MALE, "Sportovní 2");
        Patient patient2 = new Patient("Erik", LocalDate.of(1995,4,5), Sex.MALE, "Holandská 9");
        Patient patient3 = new Patient("Marek", LocalDate.of(1997,4,10), Sex.MALE, "Pařížská 43");
        Patient patient4 = new Patient("Radka", LocalDate.of(1999,4,9), Sex.FEMALE, "Šmejkalova 195");

        //Objednání pacienta

        patient1.getAllOrder(LocalDate.of(2021,5,11),"Bolest zad",Request.PREVENTION);
        patient2.getAllOrder(LocalDate.of(2021,5,12),"Zlomená ruka",Request.URGENT);
        patient3.getAllOrder(LocalDate.of(2021,5,13),"Angína",Request.ORD_MEDICAMENTS);

        //Vložení pacienta do řady
        ArrayList<Patient> waitingPatients = new ArrayList<>();
        waitingPatients.add(patient1);
        waitingPatients.add(patient2);
        waitingPatients.add(patient3);

        //Vypsání pořadového čísla
        System.out.println(patient1.getId());
        System.out.println(patient2.getId());


        //Vyvolání dalšího pacienta
        System.out.println(patient1.getName());
        //Odstranění pacienta ze seznamu čekajících
        waitingPatients.remove(patient1);

        //Rozšíření
        //Vyvolání konkrétního pacienta pomocí zadaného jména nebo pořadového čísla

        HashMap<Integer, Patient> invocation = new HashMap<>();
        invocation.put(patient1.getId(),patient1);
        invocation.put(patient2.getId(),patient2);

        Patient value1 = invocation.get(patient1.getId());
        System.out.println("Hashmap:" +value1.getAll());

        //Výpis všech pacientů ve frontě
        for (Patient p: waitingPatients) {
            System.out.println(p.getAll());
        }
    }
}
