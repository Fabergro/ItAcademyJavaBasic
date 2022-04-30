package HOME15;

//62 - создать класс Person c полями name, surname, age. Из группы в 100 сделать фильтр по заданию


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HM15_2 {
    public static void main(String[] args) {

        Person p1 = new Person("Tom", "Bred",30);
        Person p2 = new Person("Tommy", "Ared",16);
        Person p3 = new Person("Tommmyly", "Zared",25);
        Person p4 = new Person("Tron", "Koft",18);
        Person p5 = new Person("Tabb", "Cherq",15);
        Person p6 = new Person("Tooom", "Quard",20);
        Person p7 = new Person("Tiif", "Doom",20);
        Person p8 = new Person("Aaron", "Wort",21);
        Person p9 = new Person("Oolog", "Abci",20);
        Person p10 = new Person("Bred", "Abcd",20);
        Person p11 = new Person("Anna", "Affar",20);
        Person p12 = new Person("Zor", "Zud",24);
        Person p13 = new Person("Bum", "Zoag",25);
        Person p14 = new Person("Eon", "Nam",26);
        Person p15 = new Person("Ion", "Gaw",27);
        Person p16 = new Person("Karapuz", "Myu",28);
        Person p17 = new Person("Doom", "Iorof",29);
        Person p18 = new Person("Quake", "Fram",30);
        Person p19 = new Person("Sport", "Fred",16);
        Person p20 = new Person("Grom", "Freq",18);
        int n = 20; // число персон, внести, чтоб быстрее грузилось в коллекцию



        ArrayList <Person> group = new ArrayList<>();
   /*     for (int i = 1; i <= n; i++) {
            String str = "p" + i;
            group.add(String.(str));
            System.out.println(str);

        } */
/*
        for (int i = 1; i < n + 1 ; i++) {
            Person tmp = new Person("name" + i, "surname" + i, i);
            group.add(tmp);
        }
  */

        group.add(p1);group.add(p2);group.add(p3);group.add(p4);group.add(p5);
        group.add(p6);group.add(p7);group.add(p8);group.add(p9);group.add(p10);
        group.add(p11);group.add(p12);group.add(p13);group.add(p14);group.add(p15);
        group.add(p16);group.add(p17);group.add(p18);group.add(p19);group.add(p20);

        System.out.println(group.toString());

        //    System.out.println(group.stream().max());
        System.out.println(p10.getAge());
        group.stream().forEach(s -> System.out.println(s));

        System.out.println();
        group.stream()
                .filter(u -> u.getAge() < 21)
                .forEach(s -> System.out.println(s));
        System.out.println();

        List <Person> filt = group.stream()
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName).thenComparing(Person::getAge))
                .limit(4)
                .collect(Collectors.toList());
        //          .forEach(s -> System.out.println(s));

        System.out.println();

        for(Person s : filt){
            System.out.println(s);
        }

    }
}

class Person {
    private final String name;
    private final String surname;
    private final int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String name() { return name; }
    String surname() { return surname; }
    int age() { return age; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    /*  public boolean equals(Object o) {
            if (!(o instanceof Person)) return false;
            Person other = (Person) o;
            return other.name == name && other.age == age;
        }

        public int hashCode() {
            return Objects.hash(name, age);
        }
    */
    public String toString() {
        return String.format("[name=%s, surname=%s, age=%d]", name, surname, age);
    }


}
