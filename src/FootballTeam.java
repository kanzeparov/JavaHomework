import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import  java.lang.*;

class FootballTeam {
      int number, age;
      String name, position;

      public FootballTeam(int number, int age, String name, String position) {
         this.number = number;
         this.age = age;
         this.name = name;
         this.position = position;
      }

   public String toString() {
         return this.number + " " + this.age + " " + this.name + " " + this.position;
   }
}

class Sort implements Comparator<FootballTeam> {
      public int compare(FootballTeam a,FootballTeam b) {
         return a.number - b.number; // сортировка по номеру
         //return a.age - b.age; сортировка по возрасту
      }
     }

     class Main {
   public static void main (String[] args) {
      ArrayList<FootballTeam> ar = new ArrayList<FootballTeam>();
      ar.add(new FootballTeam(1, 29, "Жауме Доменек", "Вратарь"));
      ar.add(new FootballTeam(25, 29, "Алессандро Флоренци", "Защитник"));
      ar.add(new FootballTeam(21, 27, "Кристиано Пиччини", "Защитник"));
      ar.add(new FootballTeam(24, 33, "Эсекиэль Гарай", "Защитник"));
      ar.add(new FootballTeam(32, 23, "Хави Хименес", "Защитник"));
      ar.add(new FootballTeam(10, 30, "Даниэль Парехо", "Полузащитник"));
      ar.add(new FootballTeam(11, 29, "Денис Черышев", "Полузащитник"));
      ar.add(new FootballTeam(20, 20, "Ферран Торрес", "Полузащитник"));
      ar.add(new FootballTeam(15, 23, "Ману Вальехо", "Полузащитник"));
      ar.add(new FootballTeam(9, 32, "Кевин Гамейро", "Нападающий"));
      ar.add(new FootballTeam(22, 23, "Макси Гомес", "Нападающий"));

      System.out.println("Unsorted");
      for (int i=0; i < ar.size(); i++)
         System.out.println(ar.get(i));

      Collections.sort(ar, new Sort());

      System.out.println("\nSorted by number");
      for (int i = 0; i < ar.size(); i++)
         System.out.println(ar.get(i));
   }
}