package com.javarush.task.task12.task12002;

/*
Работа с классами и интерфейсами.
 */

public class Solution {
    public interface Messenger{
        void getMessage();
        void sendMessage();
    }
    public interface Application{
        default void sendApplication(){
            System.out.println("Приложение установлено.");
        }
    }

    public static class Telegramm implements Messenger, Application{
        @Override
        public void getMessage() {
            System.out.println("Телега отправила сообщение.");
        }

        @Override
        public void sendMessage() {
            System.out.println("Телега получила сообщение.");
        }
    }

    public static class Viber implements Messenger, Application{
        @Override
        public void getMessage() {
            System.out.println("Вибер отправил сообщение.");
        }

        @Override
        public void sendMessage() {
            System.out.println("Вибер получил сообщение.");
        }
    }

    public static class WhatsApp implements Messenger, Application{
        @Override
        public void getMessage() {
            System.out.println("ВатсАпп отправил сообщение.");
        }

        @Override
        public void sendMessage() {
            System.out.println("ВатсАпп получил сообщение.");
        }
    }

    public static class User {
        public Messenger messenger;
        public User(Messenger messenger){
            this.messenger = messenger;
        }
    }
    public static class Smartfone{
        public Application application;
        public Smartfone (Application application){
            this.application = application;
        }
    }

    public static void main(String[] args) {
        Telegramm telega = new Telegramm();
        User vasa = new User(telega);
        Smartfone nokia = new Smartfone(telega);

        nokia.application.sendApplication();
        telega.getMessage();
        vasa.messenger.getMessage();
    }
}
