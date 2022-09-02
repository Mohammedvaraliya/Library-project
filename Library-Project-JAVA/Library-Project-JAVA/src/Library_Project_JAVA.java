import java.util.Scanner;

class Library{

    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books ++;
        System.out.printf("[%s] has been added! ", book);
    }

    void showAvailableBooks(){
        System.out.println("Available Books are : " + no_of_books);
        for (String book: this.books){
            if (book == null){
                continue;
            }
            System.out.println("**" + book);
        }
    }

    void issueBook(String book){
        for(int i=0; i<=this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
            else if (this.books[i] != book) {
                System.out.println("This book does not exist! Please enter the correct name");
                return;
            }

        }
    }


    void returnBook(String book){
        addBook(book);
    }
}



public class Library_Project_JAVA {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("THE SOUND AND THE FURY BY WILLIAM FAULKNER");
        centralLibrary.addBook("THE HOUSE OF MIRTH BY EDITH WHARTON");
        centralLibrary.addBook("EAST OF EDEN BY JOHN STEINBECK");
        centralLibrary.addBook("THE SUN ALSO RISES BY ERNEST HEMINGWAY");
        centralLibrary.addBook("VILE BODIES BY EVELYN WAUGH");
        centralLibrary.addBook("A SCANNER DARKLY BY PHILIP K. DICK");
        centralLibrary.addBook("MOAB IS MY WASHPOT BY STEPHEN FRY");
        centralLibrary.addBook("NUMBER THE STARS BY LOIS LOWRY");
        centralLibrary.addBook("BRAVE NEW WORLD BY ALDOUS HUXLEY");
        centralLibrary.addBook("ROSEMARY AND RUE (OCTOBER DAYE #1) BY SEANAN MCGUIRE");
        centralLibrary.addBook("THE FAULT IN OUR STARS BY JOHN GREEN");
        System.out.println("\n\n");

        while (true) {
            System.out.println("Welcome To Varaliya's Library \n");
            System.out.println("Enter 1 for [Add Book]...");
            System.out.println("Enter 2 for [Display Books]...");
            System.out.println("Enter 3 for [Issue Book]...");
            System.out.println("Enter 4 for [Return Book]...");
            System.out.println("Enter 5 for Exit\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int userInput = sc.nextInt();

            if (userInput == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("You choose 1 Please type a book which you want to add : ");
                String addingBook = sc1.nextLine();
                System.out.printf("You have entered [%s] \n" , addingBook);
                centralLibrary.addBook(addingBook);
                System.out.println("\n");
            }

            else if (userInput == 2) {
                System.out.println("You choose 2!");
                centralLibrary.showAvailableBooks();
                System.out.println("\n");
            }

            else if (userInput == 3) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("You choose 3!");
                centralLibrary.showAvailableBooks();
                System.out.println("\n");
                System.out.print("Type the Book Which you want to issue : ");
                String issueBook = sc2.nextLine();
                System.out.printf("You have entered [%s] \n" , issueBook);
                centralLibrary.issueBook(issueBook);
                System.out.println("\n");
            }

            else if (userInput == 4) {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("You choose 4 Please type a book which you want to return : ");
                String returnBook = sc3.nextLine();
                System.out.printf("You have entered [%s] \n" , returnBook);
                centralLibrary.returnBook(returnBook);
                System.out.println("\n");
            }

            else if (userInput == 5) {
                System.out.println("Thanks for using this Library! Have a great day ahead!");
                break;
            }

            else if (userInput > 5){
                System.out.println("You have Entered wrong Input");
                System.out.println("\n");
            }


        }

    }
}
