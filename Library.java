import java.util.Hashtable;

/**
 * Library class extends Building class
 * no outside sources used
 * @author Ryan (K) Emerson
 * @version November 7, 2022
 */
public class Library extends Building {
  @Override   //overriding Building's showOptions method
        public void showOptions() {
          if(this.hasElevator){
            System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + addTitle(String title) \n + addTitle(String title, String titleTwo) \n + removeTitle(String title) \n + checkOut(String title) \n + returnTitle(String title) \n + containsTitle(String title) \n + isAvailable(String title) \n + printCollection()");
          } else {
            System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + addTitle(String title) \n + addTitle(String title, String titleTwo) \n + removeTitle(String title) \n + checkOut(String title) \n + returnTitle(String title) \n + containsTitle(String title) \n + isAvailable(String title) \n + printCollection()");
          }
    }
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
    this.hasElevator = true;
    this.collection = new Hashtable<String, Boolean>();
    //System.out.println("You have built a library: 📖");
  }

  /**
   * Adds title to library's collection of books
   * @param title of book
   */
  public void addTitle(String title){
    this.collection.put(title, true);
  }
  /**
   * Adds two titles to library's collection of books
   * @param title of book
   * @param title of second book
   */
  public void addTitle(String title, String titleTwo){
    this.collection.put(title, true);
    this.collection.put(titleTwo, true);
  }
  /**
   * Removes title to library's collection of books
   * @param title of book
   * @return printable string indicating the title that has been removed
   */
  public void removeTitle(String title){
    if(containsTitle(title)){
      this.collection.remove(title);
    System.out.println(title + " has been removed from the collection");
    } else{
      System.out.println(title + " cannot be removed from this collection, because we do not have it in our collection");
    }
  }
  /**
   * Changes value in key-value pair to indicate title not available in library
   * @param title of book
   */
  public void checkOut(String title){
    this.collection.replace(title, false);
  }
  /**
   * Changes values in two key-value pairs to indicate titles not available in library
   * @param title of book
   * @param title of second book
   */
  public void checkOut(String title, String titleTwo){
    this.collection.replace(title, false);
    this.collection.replace(titleTwo, false);
  }
  /**
   * Changes value in key-value pair to indicate title is available in library
   * @param title of book
   */
  public void returnTitle(String title){
    this.collection.replace(title, true);
  }

  /**
   * Checks to see if hashtable of titles in library collection contains book title
   * @param title of book
   * @return t/f: is in collection
   */
  public boolean containsTitle(String title){
    boolean containsTitle = this.collection.containsKey(title);
    System.out.println(name + " contains '" + title + "': " + containsTitle);
    return containsTitle;
  }
  /**
   * Checks value in hashtable of titles to see if title is currently available at the library
   * @param title of book
   * @return t/f: book is available
   */
  public void isAvailable(String title){
    boolean isAvailable = this.collection.get(title); 
    System.out.println("'" + title + "' is available: " + isAvailable);
  }
  
  /**
   * Prints all key-value pairs in hashtable
   */
  public void printCollection(){
    System.out.println(this.collection.toString());
  }

  /**
   * Main method for testing
   * @param args
   */
  public static void main(String[] args) {
    Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive", 5);
    System.out.println(neilsonLibrary);
    
    Library jostenLibrary = new Library("Josten Library", "7 Neilson Drive", 5);
    System.out.println(jostenLibrary);

    //neilsonLibrary.addTitle("Where the Crawdads Sing");
    //neilsonLibrary.printCollection(); 

    //neilsonLibrary.containsTitle("Where the Crawdads Sing");
    //neilsonLibrary.printCollection(); 

    //neilsonLibrary.removeTitle("Where the Crawdads");
    //neilsonLibrary.printCollection(); 

    //neilsonLibrary.isAvailable("Where the Crawdads Sing");
    //neilsonLibrary.printCollection(); 

    jostenLibrary.enter();
    //jostenLibrary.goUp();
    jostenLibrary.goToFloor(3);
    //jostenLibrary.exit();

    //neilsonLibrary.showOptions();
    neilsonLibrary.enter();
    neilsonLibrary.goUp();
    neilsonLibrary.goToFloor(3);
    neilsonLibrary.exit();

    
    }
  }