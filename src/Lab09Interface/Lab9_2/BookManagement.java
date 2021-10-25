package Lab09Interface.Lab9_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    private static String bookFileLocationPath = System.getProperty("user.dir") + "/Book.txt";
    private static List<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;

        //read current data
        bookList = DataFactory.readBookList(bookFileLocationPath);

        while (isContinuing){
            System.out.println("========MENU==========");
            System.out.println("0. Exist!");
            System.out.println("1. To add a new book");
            System.out.println("2. To retrieve book info");
            System.out.println("3. To update book info");
            System.out.println("4. To delete book info");

            int userOption = scanner.nextInt();

            switch (userOption){
                case 0:
                    isContinuing = false;
                    saveBook();
                    System.out.println("Thank you!");
                    break;
                case 1:
                    addBook();
                    saveBook();
                    break;
                case 2:
                    retrieveBookInfo();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                default:
                    System.out.println("Wrong option!");
            }
        }

        List<Book> books = DataFactory.readBookList(bookFileLocationPath);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void updateBook() {
        int bookUpdateIndex = retrieveBookInfo();

        if(bookUpdateIndex >= 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Book title update: ");
            String bookTitle = scanner.nextLine();

            System.out.println("Enter Book author update: ");
            String bookAuthor = scanner.nextLine();

            bookList.get(bookUpdateIndex).setTitle(bookTitle);
            bookList.get(bookUpdateIndex).setAuthor(bookAuthor);

            saveBook();

            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    private static void deleteBook(){
        int bookRemoveIndex = retrieveBookInfo();

        if(bookRemoveIndex >= 0){
            bookList.remove(bookRemoveIndex);

            saveBook();

            for (Book book : bookList) {
                System.out.println(book);
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

    private static void saveBook(){
        boolean isSavingSuccess = DataFactory.saveBookList(bookList, bookFileLocationPath);

        if(isSavingSuccess){
            System.out.println("[INFO] Book saved info: " + bookFileLocationPath);
        } else {
            System.out.println("[ERR] Saving book: FAILED!");
        }
    }

    private static int retrieveBookInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter ISBN: ");
        String bookISBN = scanner.nextLine();
        int bookIndex = -1;
        if(!bookISBN.isEmpty()){
            for (int idx = 0; idx < bookList.size(); idx ++) {
                if(bookList.get(idx).getISBN().equals(bookISBN)) {
                    bookIndex = idx;
                    break;
                }
            }
        } else
            System.out.println("You should input ISBN!");

        if (bookIndex >= 0){
            System.out.println(bookList.get(bookIndex));
        } else
            System.out.println("Book not found!");
        return bookIndex;
    }

}
