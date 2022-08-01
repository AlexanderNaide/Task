package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

/*
C:\text1.txt
C:\text2.txt
 */

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameAllLines = reader.readLine();
        String nameForRemoveLines = reader.readLine();
        reader.close();
        BufferedReader readerAllLines = new BufferedReader(new FileReader(nameAllLines));
        BufferedReader readerForRemoveLines = new BufferedReader(new FileReader(nameForRemoveLines));
        String t1;
        while ((t1 = readerAllLines.readLine()) != null){
            allLines.add(t1);
        }
        String t2;
        while ((t2 = readerForRemoveLines.readLine()) != null){
            forRemoveLines.add(t2);
        }
        readerAllLines.close();
        readerForRemoveLines.close();

        Solution solution = new Solution();

        try{
            solution.joinData();
        } catch (CorruptedDataException e){
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            for (String t : forRemoveLines){
                allLines.remove(t);
            }
        }
        else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();
        }
    }
}






























