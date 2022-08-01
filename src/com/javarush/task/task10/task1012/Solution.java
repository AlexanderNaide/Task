package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i);
            char[] textSkan = text.toCharArray();
            for (int j = 0; j < textSkan.length; j++) {
                char a = textSkan[j];
                if (alphabet.contains(a)){
                    int x = map.get(a)+1;
                    map.put(a, x);
                }
            }
        }
        for (Character character : alphabet){
            System.out.println(character + " " + map.get(character));
        }
        // напишите тут ваш код
    }
}