public class SinglyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("=== Тестирование с Integer ===");
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();

        // Добавление элементов
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(1, 15); // Вставка по индексу

        System.out.println("Список после добавления: " + intList);
        System.out.println("Размер списка: " + intList.size());
        System.out.println("Элемент по индексу 2: " + intList.get(2));

        // Удаление элементов
        intList.remove(2);
        System.out.println("После удаления элемента с индексом 2: " + intList);

        // Тестирование итератора
        System.out.print("Элементы через итератор: ");
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестирование разворота
        intList.reverse();
        System.out.println("После разворота: " + intList);

        System.out.println("\n=== Тестирование с String ===");
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();

        stringList.add("Java");
        stringList.add("Generics");
        stringList.add("Collections");

        System.out.println("Список строк: " + stringList);
        System.out.println("Содержит 'Java'? " + stringList.contains("Java"));
        System.out.println("Индекс 'Generics': " + stringList.indexOf("Generics"));

        // Тестирование работы с null
        stringList.add(null);
        System.out.println("После добавления null: " + stringList);
        System.out.println("Содержит null? " + stringList.contains(null));

        System.out.println("\n=== Тестирование с пользовательским классом ===");
        SinglyLinkedList<Person> personList = new SinglyLinkedList<>();
        personList.add(new Person("Иван", 25));
        personList.add(new Person("Мария", 30));

        System.out.println("Список людей: " + personList);

        // Тестирование метода merge
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.add(1);
        list1.add(2);

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.add(3);
        list2.add(4);

        SinglyLinkedList<Integer> merged = SinglyLinkedList.merge(list1, list2);
        System.out.println("\nОбъединенный список: " + merged);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
