package com.javarush.task.task12.task12001;
/*
Работа с классами, базовыми и наследованными
 */
public class Solution {
    public static class Messenger{
        public void getMessage(){

        }
        public void sendMessage(){

        }
    }
    public static class Application{
        void sendApplication(){
            System.out.println("Приложение установлено.");
        }
    }

    public static class Telegramm extends Messenger {
        @Override
        public void getMessage() {
            System.out.println("Телега отправила сообщение.");
        }

        @Override
        public void sendMessage() {
            System.out.println("Телега получила сообщение.");
        }
    }

    public static class Viber extends Messenger {
        @Override
        public void getMessage() {
            System.out.println("Вибер отправил сообщение.");
        }

        @Override
        public void sendMessage() {
            System.out.println("Вибер получил сообщение.");
        }
    }

    public static class WhatsApp extends Messenger {
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
        public Messenger messenger;
        public Smartfone (Messenger messenger){
            this.messenger = messenger;
        }
    }

    public static void main(String[] args) {
        Telegramm telega = new Telegramm();
        User vasa = new User(telega);
        Smartfone nokia = new Smartfone(telega);

        nokia.messenger.getMessage();
        telega.getMessage();
        vasa.messenger.getMessage();
    }
}
