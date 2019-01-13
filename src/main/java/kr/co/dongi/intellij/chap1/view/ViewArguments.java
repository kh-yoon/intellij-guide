package kr.co.dongi.intellij.chap1.view;

import java.util.List;

public class ViewArguments {
    public ViewArguments() {
        String email = "kh.yoon@dongi.co.kr";
        EmailSender emailSender = new EmailSender(1L, "test", email);

        emailSender.send(email);
        emailSender.send(email);
        emailSender.send(email);
        emailSender.send(email);
        emailSender.send(email);
        emailSender.send(email);
        emailSender.send(email);
        emailSender.send("test");
        emailSender.send("test");
        emailSender.send("test");
        emailSender.send("test");
    }


    public void setName() {
        setName(10);
    }

    public String setName(int x) {
        String i = "1";
        System.out.println(i);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);

        return "1";
    }

    public void extractMethod(List<Book> books) {
        loopAuthors(books);

    }

    private void loopAuthors(List<Book> books) {
        for (Book book : books) {
            print(book);
        }
    }

    private void print(Book book) {
        for (String s : book.getAuthors()) {
            System.out.println("담당자가 맞습니다.");
        }
    }


    public static class Book {
        private List<String> authors;

        public List<String> getAuthors() {
            return authors;
        }
    }
}

