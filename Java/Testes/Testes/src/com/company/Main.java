package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // List of all contacts.
    private static List<Contact> contactList;

    // Path of file
    private static String FilePath = "Contatos.txt";

    // Separator for each subject
    private static String columnSeparator = "§";

    // Separator of each item within a subject
    private static String fieldSeparator = "¶";

    // Constructor
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // initialize
        contactList = new ArrayList<Contact>();
        boolean isRunning = true;

        // Load Contacts
        loadContacts();

        while (isRunning) {
            System.out.println();
            System.out.println("Bem Vindo à agenda Java");
            System.out.println();
            System.out.println("O Que Deseja Fazer?");
            System.out.println("\t1 - Listar Contatos");
            System.out.println("\t2 - Incluir Contato");
            System.out.println("\t3 - Editar Contato");
            System.out.println("\t4 - Excluir Contato");
            System.out.println("\t5 - Buscar Contato");
            System.out.println("\t0 - Sair");

            int option = waitForUserIntInput("", 0, 5);
            System.out.println(option);
            switch (option) {
                case 1:
                    listar(contactList);
                    break;
                case 2:
                    incluir();
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    buscar();
                    break;

                case 0:
                    isRunning = false;
                    break;
            }
        }
    }

    //Load all contacts from file;
    private static void loadContacts() throws FileNotFoundException, IOException {

        File tempFile = new File(FilePath);
        if (!tempFile.exists()) {
            return;
        }

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(FilePath));
            String line = reader.readLine();
            while (line != null) {

                String name = line.split(columnSeparator)[0];
                Contact contact = new Contact(name);

                for (String phone : line.split(columnSeparator)[1].split(fieldSeparator)) {
                    if (phone.length() > 0) {
                        contact.addPhone(phone);
                    }
                }
                contactList.add(contact);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Save all contacts to file;
    private static void saveContacts() throws IOException {

        contactList.sort(Comparator.comparing(Contact::getName));

        FileWriter out = null;
        try {
            out = new FileWriter(FilePath);

            String record;
            for (Contact contact : contactList) {

                record = contact.getName() + columnSeparator;
                for (String phone : contact.getPhoneList()) {
                    record += fieldSeparator + phone;
                }
                out.write(record + "\n");
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    private static void listar(List<Contact> listToDisplay) {
        listar(listToDisplay, false, true, true);
    }

    // Displays a list of contacts passed as parameter
    private static void listar(List<Contact> listToDisplay, boolean displayPositions, boolean displayPhones, boolean displayMainMenuMessage) {

        System.out.println(listToDisplay.size() + " contatos encontrados!!");
        System.out.println();

        int count = 1;
        for (Contact contact : listToDisplay) {

            System.out.println((displayPositions ? count++ + " - " : "") + contact.getName());
            if (displayPhones) {
                for (String phone : contact.getPhoneList()) {
                    System.out.println("\t" + phone);
                }
                System.out.println();
            }
        }

        if (displayMainMenuMessage) {
            System.out.println("Pressione enter para voltar ao menu principal");
            waitForUserInput();
        }
    }

    // Creates a new contact
    private static void incluir() throws IOException {
        System.out.println("Adicionar novo contato");
        System.out.println("Nome:");
        Contact contact = new Contact(waitForUserInput());

        boolean keepAdding = true;

        do {
            System.out.println("Fone:");
            contact.addPhone(waitForUserInput());
            System.out.println("Deseja adicionar outro telefone para este contato? (S/N)");
            keepAdding = "S".equalsIgnoreCase(waitForUserInput());
        } while (keepAdding);

        contactList.add(contact);

        saveContacts();
    }

    // Updates an existing contact
    public static void editar() throws IOException {
        System.out.println("Você deseja edita qual contato?");

        listar(contactList, true, false, false);

        int indexPlusOne = waitForUserIntInput("", 1, contactList.size());

        Contact itemToBeUpdated = contactList.get(indexPlusOne - 1);

        System.out.println("O Que você deseja fazer");
        System.out.println("\t1 - Editar Nome");
        System.out.println("\t2 - Editar Telefone");
        System.out.println("\t3 - Incluir Telefone");
        System.out.println("\t4 - Excluir Telefone");

        switch (waitForUserIntInput("", 1, 4)) {
            case 1:
                System.out.println("Digite o novo nome do contato");
                String newName = waitForUserInput();
                itemToBeUpdated.setName(newName);

                contactList.remove(indexPlusOne - 1);
                contactList.add(itemToBeUpdated);
                break;
            case 2:
                System.out.println("Qual telefone você deseja editar?");
                int count = 1;
                for (String phone : itemToBeUpdated.getPhoneList()) {
                    System.out.println("\t" + (count++) + " - " + phone);
                }
                int phoneIndexPlusOne = waitForUserIntInput("", 1, itemToBeUpdated.getPhoneList().size());

                System.out.println("Qual o novo número?");
                String newNumber = waitForUserInput();

                itemToBeUpdated.editPhone(phoneIndexPlusOne - 1, newNumber);

                break;
            case 3:
                System.out.println("Digite o novo Número:");
                itemToBeUpdated.addPhone(waitForUserInput());
                break;
            case 4:
                System.out.println("Qual telefone você deseja excluir?");
                int counter = 1;
                for (String phone : itemToBeUpdated.getPhoneList()) {
                    System.out.println("\t" + (counter++) + " - " + phone);
                }
                int selectedPhoneIndexPlusOne = waitForUserIntInput("", 1, itemToBeUpdated.getPhoneList().size());

                itemToBeUpdated.removePhone(selectedPhoneIndexPlusOne - 1);
                break;
        }

        saveContacts();
    }

    // Deletes an existing record
    public static void excluir() throws IOException {
        System.out.println("Qual contato você deseja excluir?");
        listar(contactList, true, false, false);
        System.out.println();
        int option = waitForUserIntInput("", 1, contactList.size());

        System.out.println("Deseja realmente excluir " + contactList.get(option).getName() + "? (S/N)");
        String confirm = waitForUserInput();

        if ("S".equalsIgnoreCase(confirm)) {
            if (contactList.size() > option) {
                contactList.remove(option);
            }
            System.out.println("Contato excluído!");
            saveContacts();
            System.out.println("Pressione enter para voltar ao menu principal");
            waitForUserInput();
        }
    }

    // Searches a contact
    public static void buscar() {
        System.out.println("Você desaja buscar contatos por qual critério?");
        System.out.println("\t1 - Nome");
        System.out.println("\t2 - Fone");

        List<Contact> filteredList;

        switch (waitForUserIntInput("", 1, 2)) {
            case 1:
                System.out.println("Digite o nome do contato a ser buscado");
                String nome = waitForUserInput();
                filteredList = contactList.stream().filter(x -> x.getName().toLowerCase().contains(nome.toLowerCase())).collect(Collectors.toList());

                // List the filtered items matching the criteria.
                listar(filteredList);

                break;
            case 2:
                System.out.println("Digite o número do contato a ser buscado");
                String phone = waitForUserInput();

                filteredList = contactList.stream().filter(x -> x.getPhoneList().stream().filter(y -> y.contains(phone)).count() > 0).collect(Collectors.toList());

                // List the filtered items matching the criteria.
                listar(filteredList);
                break;
        }
    }

    // Wait for user input and returns the typed text.
    public static String waitForUserInput() {
        Scanner waitScanner = new Scanner(System.in);
        return waitScanner.nextLine();
    }

    // Wait for user input and returns the typed text.
    public static int waitForUserIntInput(String message, int minValue, int maxValue) {
        Scanner waitScanner = new Scanner(System.in);
        int response = -1;
        do {
            System.out.println(message);
            response = waitScanner.nextInt();
            if (response < minValue || response > maxValue) {
                System.out.println("Opção não encontrada, digite uma opção entre " + minValue + " e " + maxValue);
            }
        } while (response < minValue || response > maxValue);

        return response;
    }

}

