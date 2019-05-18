import java.util.*;

public class Human {

    private String name;
    private int age;

    private Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareByName(Human human) {
        return name.compareTo(human.name);
    }

    public int compareByAge(Human human) {
        return Integer.compare(age, human.age);
    }

    public static void main(String[] args) {
        //Коллекция через интерфейс List
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Tom", 25));
        humanList.add(new Human("Sam", 10));
        humanList.add(new Human("Sara", 30));
        humanList.add((new Human("Alexandra", 17)));
        humanList.add(new Human("Ben", 35));
        System.out.println("Работа с коллекцией через интерфейс List");
        System.out.println("Произвольный список:\n" + humanList);

        System.out.println("\nСортировка списка по алфавиту");
        Collections.sort(humanList, Human::compareByName);
        System.out.println("Список значений по возрастанию:\n" + humanList);
        Collections.reverse(humanList);
        System.out.println("Список значений по убыванию:\n" + humanList);

        System.out.println("\nСортировка списка по возрасту");
        Collections.sort(humanList, Human::compareByAge);
        System.out.println("Список значений по возрастанию:\n" + humanList);
        Collections.reverse(humanList);
        System.out.println("Список значений по убыванию:\n" + humanList);

        //Колекция через интерфейс Set
        Set<Human> humanSet = new TreeSet<>(Human::compareByName);
        humanSet.addAll(humanList);
        System.out.println("\nСортировка списка с помощью интерфейса Set: \n" + humanSet);

    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}
