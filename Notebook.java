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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Notebook {

    //1 - ОЗУ
    int ozu;
    //2 - Объем ЖД
    int value;
    //3 - Операционная система
    String os;
    //4 - Цвет
    String palitra;
    
    public Notebook(int ozu, int value, String os, String palitra) {
        this.ozu = ozu;
        this.value = value;
        this.os = os; 
        this.palitra = palitra; 

    }
    public String toString() {
        return "OZU: " + ozu + "  Value: " + value + "  OS: " + os + "  Palitra: " + palitra;
    }
    
    
    
        



 }
