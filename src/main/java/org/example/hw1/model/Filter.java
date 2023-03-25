package org.example.hw1.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Filter {
    /**
     * Метод создает минимальную конфигурацию ноутбука на основе переданного фильтра
     * @param inputFilter мап с заданными пользователем критериями отбора
     * @return некий ноутбук с минимальными заданными параметрами, используемый для сравнения с имеющимися
     */
    public static Notebook createMinimalNotebook(Map<String, Object> inputFilter) {
        Notebook minimalConfigNotebook = new Notebook("Any", "Any",
                (Double) inputFilter.getOrDefault("screenSize", 0.0),
                (Integer) inputFilter.getOrDefault("memory", 0),
                (Integer) inputFilter.getOrDefault("hdd", 0),
                (String) inputFilter.getOrDefault("os", "windows linux no"));

        return minimalConfigNotebook;
    }

    /**
     *  Метод формирует из списка ноутбуков новый список ноутбуков с характеристиками не менее заданных во втором аргументе
     * @param inputSet список всех имеющихся ноутбуков, из которых нужно отбирать
     * @param minimalNotebook ноутбук, с минимально допустимыми характеристиками
     * @return список ноутбуков с нужными характеристиками
     */
    public static Set<Notebook> filterNotebooks(Set<Notebook> inputSet, Notebook minimalNotebook) {
        Set<Notebook> filteredSet = new HashSet<>();

        for(Notebook notebook : inputSet){
            if(notebook.getScreenSize() >= minimalNotebook.getScreenSize() &&
                notebook.getMemory() >= minimalNotebook.getMemory() &&
                notebook.getHdd() >= minimalNotebook.getHdd() &&
                minimalNotebook.getOs().contains(notebook.getOs())) {
                    filteredSet.add(notebook);
            }
        }
        return filteredSet;
    }
}
