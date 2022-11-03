import java.util.Hashtable;

/**
 * Library class extends Building class
 * no outside sources used
 * @author Ryan (K) Emerson
 * @version October 31, 2022
 */
public class Library extends Building {

  /**
   * Allocates space for private hashtable of string and boolean key and value
   */
  private Hashtable<String, Boolean> collection;

  /**
   * Constructs a Library instance
   * @param name of Library
   * @param address of Library
   * @param number of floors in Library
   */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /**
   * Adds title to library's collection of books
   * @param title of book
   */
  public void addTitle(String title){
    collection.put(title, true);
  }
  /**
   * Removes title to library's collection of books
   * @param title of book
   * @return printable string indicating the title that has been removed
   */
  public String removeTitle(String title){
    collection.remove(title);
    return title + " has been removed from the collection";
  }

  /**
   * Changes value in key-value pair to indicate title not available in library
   * @param title of book
   */
  public void checkOut(String title){
    collection.replace(title, false);
  }
  /**
   * Changes value in key-value pair to indicate title is available in library
   * @param title of book
   */
  public void returnTitle(String title){
    collection.replace(title, true);
  }

  /**
   * Checks to see if hashtable of titles in library collection contains book title
   * @param title of book
   * @return t/f: is in collection
   */
  public boolean containsTitle(String title){
    boolean containsTitle = collection.contains(title);
    return containsTitle;
  }
  /**
   * Checks value in hashtable of titles to see if title is currently available at the library
   * @param title of book
   * @return t/f: book is available
   */
  public boolean isAvailable(String title){
    boolean isAvailable = collection.get(title); 
    return isAvailable;
  }
  
  /**
   * Prints all key-value pairs in hashtable
   */
  public void printCollection(){
    System.out.println(collection.toString());
  }

  /**
   * Main method for testing
   * @param args
   */
  public static void main(String[] args) {
    Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive", 5);
    System.out.println(neilsonLibrary);
    neilsonLibrary.addTitle("Where the Crawdads Sing");
    neilsonLibrary.printCollection(); 

    neilsonLibrary.checkOut("Where the Crawdads Sing");
    neilsonLibrary.removeTitle("Where the Crawdads Sing");
    System.out.println(neilsonLibrary.removeTitle("Where the Crawdads Sing"));
    //System.out.println(neilsonLibrary.isAvailable("Where the Crawdads Sing"));
    }
  }