package Lab07Encapsulation.Lab07_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;

        while (isContinuing){
            System.out.println("========MENU==========");
            System.out.println("0.. Exist!");
            System.out.println("1. To add a new book");
            System.out.println("2. To retrieve book info");

            int userOption = scanner.nextInt();

            switch (userOption){
                case 0:
                    isContinuing = false;
                    System.out.println("Thank you!");
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBookInfo();
                    break;
                default:
                    System.out.println("Wrong option!");
            }
        }
    }

    private static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ISBN: ");
        String bookISBN = scanner.nextLine();

        System.out.println("Book title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Book author: ");
        String bookAuthor = scanner.nextLine();

        bookList.add(new Book(bookISBN, bookTitle, bookAuthor));
    }

    private static void retrieveBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        String bookISBN = scanner.nextLine();

        for (Book book : bookList) {
            if(book.getISBN().equals(bookISBN)){
                System.out.println(book);
            }
        }
    }


}
