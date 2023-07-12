/**
 * Задание
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.

    Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
    Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

 */
package HomrWork_6;


import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Notebook notebook1 = new Notebook(24,20,"Win","White");
        Notebook notebook2 = new Notebook(16,40,"Linux","Grey");
        Notebook notebook3 = new Notebook(24,60,"Win","White");
        Notebook notebook4 = new Notebook(32,60,"Linux","Black");
        Notebook notebook5 = new Notebook(16,20,"Win","Black");
        Notebook notebook6 = new Notebook(16,20,"Win","Black");

        //Создать множество ноутбуков.
        Set<String> setNotebook = new HashSet<>();
        setNotebook.add(notebook1.toString());
        setNotebook.add(notebook2.toString());
        setNotebook.add(notebook3.toString());
        setNotebook.add(notebook4.toString());
        setNotebook.add(notebook5.toString());
        setNotebook.add(notebook6.toString());
        
        //Меню работы программы
        Map<Integer,String> menu = new HashMap<Integer,String>();
        menu.put(1,"Показать склад.");
        menu.put(2,"Поиск.");

        System.out.println("Меню :");
        for (var item : menu.entrySet()) {
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите число для взаимодействия с меню :");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                for (String el : setNotebook){
                    System.out.println(el);
                }
                break;
            case 2:
                poiskMenu(setNotebook);
                break;
            default: 
                break;        
        }
    }
    
    // Меню поиска по категориям
    static void poiskMenu(Set<String>set){

        System.out.print("Критерии для поиска :\n");
        Set<String> setNotebook = set;

        Map<Integer,String> filtr = new HashMap<Integer,String>();
        filtr.put(1,"ОЗУ");
        filtr.put(2,"Объем ЖД");
        filtr.put(3,"ОС");
        filtr.put(4,"Цвет");

        for (var item : filtr.entrySet()) {
            System.out.printf("%d: %s\n", item.getKey(), item.getValue());
        }

        System.out.print("Ваш выбор :");
        Scanner scan2 = new Scanner(System.in);
        int choice = scan2.nextInt();
        poisk(choice,setNotebook);
    }

    //Меню выбора поиска по параметрам в выбранной категории
    
    static void poisk(int numberOfChoice, Set<String>set){ 
        switch(numberOfChoice){
            case 1:
                resFilter1(set);
                break;
            case 2:
                resFilter2(set);
                break;
            case 3:
                resFilter3(set);
                break;
            case 4:
                resFilter4(set);
                break;
            default:
                break;
        }
    }

    static void  resFilter1(Set<String>s){
        Scanner scan11 = new Scanner(System.in);
        System.out.print("Введите размер ОЗУ для поиска : ");
        int yourchoice1 = scan11.nextInt();
        Set<String> res = new HashSet<>();
        for (String el : s){
            if (el.contains("OZU: "+yourchoice1)){res.add(el);}
        }

        if(res.size()<1){System.out.println("По Вашему запросу пусто.");
        }else{
            for (String el : res){System.out.println(el);}
        }
    }

    static void  resFilter2(Set<String>s){
        System.out.print("Введите объем ЖД для поиска : ");
        Scanner scan12 = new Scanner(System.in);
        int yourchoice2 = scan12.nextInt();
        Set<String> res = new HashSet<>();
        for (String el : s){
            if (el.contains("Value: "+yourchoice2)){res.add(el);}
        }
        if(res.size()<1){System.out.println("По Вашему запросу пусто.");
        }else{
            for (String el : res){System.out.println(el);}
        }

    }

    static void  resFilter3(Set<String>s){
        System.out.print("Введите ОС для поиска(Win/Linux) : ");
        Scanner scan13 = new Scanner(System.in);
        String yourchoice3 = scan13.nextLine();
        Set<String> res = new HashSet<>();
        for (String el : s){
            if (el.contains("OS: "+yourchoice3)){res.add(el);}
        }
        if(res.size()<1){System.out.println("По Вашему запросу пусто.");
        }else{
            for (String el : res){System.out.println(el);}
        }

    }

    static void  resFilter4(Set<String>s){
        System.out.print("Введите цвет для поиска : ");
        Scanner scan14 = new Scanner(System.in);
        String yourchoice4 = scan14.nextLine();
        Set<String> res = new HashSet<>();
        for (String el : s){
            if (el.contains("Palitra: "+yourchoice4)){res.add(el);}
        }
        if(res.size()<1){System.out.println("По Вашему запросу пусто.");
        }else{
            for (String el : res){System.out.println(el);}
        }

    }
}
