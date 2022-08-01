package com.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution("C:\\kn\\text2.txt");
        solution.writeObject("Программирование - моё будущее!");

        FileOutputStream fileOutput = new FileOutputStream("your.file.name");
        ObjectOutputStream out = new ObjectOutputStream(fileOutput);

        out.writeObject(solution);

        fileOutput.close();
        out.close();
        solution.close();

        FileInputStream fiStream = new FileInputStream("your.file.name");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Solution newSolution = (Solution) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        newSolution.writeObject("Программирование так же моё настоящее!");
        newSolution.close();

    }
}






























