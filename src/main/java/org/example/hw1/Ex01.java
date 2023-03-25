package org.example.hw1;

import org.example.hw1.model.Notebook;
import java.util.*;
import static org.example.hw1.model.Filter.createMinimalNotebook;
import static org.example.hw1.model.Filter.filterNotebooks;

public class Ex01 {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("Asus","Laptop15", 15.6, 4, 1000, "windows");
        Notebook n2 = new Notebook("Asus","Laptop14", 14.0, 4, 128, "no");
        Notebook n3 = new Notebook("Acer","Extensa15", 15.6, 4, 128, "linux");
        Notebook n4 = new Notebook("HP","250G7", 15.6, 4, 128, "no");
        Notebook n5 = new Notebook("Acer","Aspire3", 17.3, 4, 256, "windows");
        Notebook n6 = new Notebook("Asus","VivoBook", 16.0, 16, 512, "windows");

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(n1);
        notebookSet.add(n2);
        notebookSet.add(n3);
        notebookSet.add(n4);
        notebookSet.add(n5);
        notebookSet.add(n6);

        Map<String, Object> filterMap = new HashMap<>();

        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while(choice != 7){
            System.out.println("\nДобавить минимальные характеристики для отбора?\n" +
                    "1. Диагональ экрана\n" +
                    "2. Оперативная память\n" +
                    "3. Объем жесткого диска\n" +
                    "4. Операционная система\n\n" +
                    "5. Вывести результаты отбора\n" +
                    "6. Сбросить все фильтры\n" +
                    "7. Выход\n");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введите минимальный размер диагонали экрана(дюймов): ");
                    filterMap.put("screenSize", scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Введите минимальный объем оперативной памяти(Гб): ");
                    filterMap.put("memory", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Введите минимальный объем жесткого диска(Гб): ");
                    filterMap.put("hdd", scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Введите ОС (windows, linux или no) :");
                    scanner.nextLine();
                    filterMap.put("os", scanner.nextLine().toLowerCase());
                    break;
                case 5:
                    if(!filterMap.isEmpty()) {
                        System.out.println("Выбраны фильтры: " + filterMap.entrySet());
                        Set<Notebook> filteredSet = filterNotebooks(notebookSet, createMinimalNotebook(filterMap));
                        for(Notebook el: filteredSet)
                            System.out.println(el);
                    } else {
                        for(Notebook el: notebookSet)
                            System.out.println(el);
                    }
                    break;
                case 6:
                    filterMap.clear();
                    break;
                case 7:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Нужно ввести цифру от 1 до 6\n");
            }
        }
    }
}
