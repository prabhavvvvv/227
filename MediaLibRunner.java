/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    String title = "Prabhav";

    Book myBook = new Book(title, "Tolkien");
    System.out.println(myBook);
    myLib.addBook(myBook);
    System.out.println(myLib);
    int rating = 10;
    myBook.setRating(rating);
    rating = 100;
    //if rating is changed what will print out on the next time
    //it would print 10 because the setRating method wasn't called again after changing the rating to 100
    title = "Lord of the Flies"; //stringb
    System.out.println(myBook);

    Book newBook = new Book("Harry Potter", "J.K. Rowling");//booka
    MediaLib newLib = new MediaLib();
    newLib.addBook(newBook); //booka added to newLib
    System.out.println(newLib);
    newBook.setAuthor("Prabhav Yeddanapudi");//booka gets changed on the author attribute


    newBook = new Book("New", "title");//bookb
    System.out.println(newLib);

  }
}
