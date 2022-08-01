package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/*
Свой FileWriter
*/

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        this.fileWriter = new FileWriter(fd);
    }

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++){
            sb.append(cbuf[off + i]);
        }
        System.out.println(sb.toString());
        fileWriter.write(cbuf, off, len);
    }

    public void write(int c) throws IOException {
        System.out.println(c);
        fileWriter.write(c);

    }

    public void write(String str) throws IOException {
        System.out.println(str);
        fileWriter.write(str);
    }

    public void write(String str, int off, int len) throws IOException {
        char[] cbuf = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++){
            sb.append(cbuf[off + i]);
        }
        System.out.println(sb.toString());
        fileWriter.write(str, off, len);

    }

    public void write(char[] cbuf) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cbuf.length; i++){
            sb.append(cbuf[i]);
        }
        System.out.println(sb.toString());
        fileWriter.write(cbuf);

    }

    public void close() throws IOException {
        fileWriter.close();
    }


    public static void main(String[] args) {

    }

}






























