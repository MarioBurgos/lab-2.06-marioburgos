package com.ironhack.main;

import com.ironhack.classes.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<String, Student>();
        Student jesus = new Student("Jesus", 80);
        Student fran = new Student("Fran", 60);
        Student alex = new Student("Alex", 40);
        Student boris = new Student("Boris", 20);

        studentMap.put(jesus.getName(), jesus);
        studentMap.put(fran.getName(), fran);
        studentMap.put(alex.getName(), alex);
        studentMap.put(boris.getName(), boris);

        System.out.println(studentMap);

        increaseGradesBy10Percent(studentMap);

        System.out.println(studentMap);

    }

    public static Map<String, Student> increaseGradesBy10Percent(Map<String, Student> map){
        int tenPercent = 0;
        for (String name: map.keySet()) {
            tenPercent = (int) (map.get(name).getGrade() * 0.1);
            map.get(name).setGrade(map.get(name).getGrade() + tenPercent);
        }
        return map;
    }
}