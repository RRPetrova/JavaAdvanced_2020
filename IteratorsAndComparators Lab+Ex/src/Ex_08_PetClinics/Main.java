package Ex_08_PetClinics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        HashMap<String, Clinic> clinics = new HashMap<>();
        HashMap<String, Pet> pets = new HashMap<>();

        while (n-- > 0) {
            String[] cmd = reader.readLine().split("\\s+");

            switch (cmd[0]) {
                case "Create":
                    if (cmd[1].equals("Pet")) {
                        Pet pet = new Pet(cmd[2], Integer.parseInt(cmd[3]), cmd[4]);
                        pets.putIfAbsent(cmd[2], pet);
                    } else {
                        try {
                            Clinic clinic = new Clinic(cmd[2], Integer.parseInt(cmd[3]));
                            clinics.putIfAbsent(cmd[2], clinic);
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Add":
                    System.out.println(clinics.get(cmd[2]).add(pets.get(cmd[1])));
                    break;
                case "Release":
                    System.out.println(clinics.get(cmd[1]).release());
                    break;
                case "HasEmptyRooms":
                    System.out.println(clinics.get(cmd[1]).hasEmptyRooms());
                    break;
                case "Print":
                    if (cmd.length == 2) {
                        for (Pet pet : clinics.get(cmd[1])) {
                            if (pet != null) {
                                System.out.println(pet.toString());
                            } else {
                                System.out.println("Room empty");
                            }
                        }

                    } else {
                        System.out.println(clinics.get(cmd[1]).printRoom(Integer.parseInt(cmd[2]) - 1));
                    }
                    break;
            }


        }


    }
}
