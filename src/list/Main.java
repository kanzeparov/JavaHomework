package list;

import java.util.*;

public class Main {

    public static void main(java.lang.String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");




        List<String> solarSystem = new LinkedList<String>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));

        //

        Collections.sort(solarSystem);
        System.out.println(solarSystem);


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));

        //Compare LinkedList, ArrayList
    }
}
