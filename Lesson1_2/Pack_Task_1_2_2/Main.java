package Netology_JC.Lesson1_2.Pack_Task_1_2_2;

import java.util.*;

public class Main {

    public static void  main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }

        System.out.println("Количество несовершеннолетних:");
        long count = persons.stream()
                .filter(x -> x.getAge() < 18)
                .count();
        System.out.println(count);

        System.out.println("Список фамилий призывников:");
        persons.stream()
                .filter(x -> x.getSex() == Sex.MAN)
                .filter(x -> x.getAge() <= 27)
                .filter(x -> x.getAge() >= 18)
                .forEach(System.out::println);

        System.out.println("Список потенциально работоспособных людей с высшим образованием:");
        persons.stream()
                .filter(x -> x.getEducation() == Education.HIGHER)
                .filter(x -> x.getAge() >= 18)
                .filter(x -> x.getAge() <= (x.getSex() == Sex.MAN ? 65 : 60))
                .sorted(Comparator.comparing(Person::getFamily))
                .forEach(System.out::println);
    }
}
