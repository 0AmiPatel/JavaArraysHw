import java.util.ArrayList;
import java.util.Scanner;

public class TFLStation {

    //IF USER ENTERS STATION FROM ZONE 1 IT SHOULD SAY WHICH LINE COMES TO THIS STATION.

    public static void main(String args[]) {

        ArrayList<String> stations = new ArrayList<String>() {{

            add("Finchley Road");
            add("Angel");
            add("Barbican");
            add("Old Street");
            add("London Bridge");
            add("Baker Street");
            add("Oxford Circus");
            add("Waterloo ");
            add("Regents Park ");
            add("Bond Street");
            add("Green Park");
            add("Westminster");
            add("Kings Cross");
            add("Liverpool Street");
            add("Lancaster Gate");
            add("Marble Arch");
            add("Holbourne");
            add("Tottenham Court");
            add("Chancery Lane");
            add("St. Pauls");
            add("Bank");
            add("Victoria");
            add("Southwark ");
            add("Marylebone");
            add("Piccadilly circus");


        }};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Station name");
        String st = sc.next();

        for (String s : stations) {
                    }
            if (stations.contains(st)){
                System.out.println(" Jubilee or Metropolitan line comes to this station");
            } else {

                System.out.println("This Station does not come under zone 1");
            }

    }
}
