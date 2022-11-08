import java.util.ArrayList;

/**
 * House class extends from Building class
 * no outside sources used
 * @author Ryan (K) Emerson
 * @version November 7, 2022
 */
public class House extends Building {
  @Override   //overriding Building's showOptions method
        public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown() \n + goToFloor(n) \n + getHasDiningRoom() \n + getnResidents() \n + moveIn(String residentName) \n + moveOut(String residentName) \n + moveOut() \n + isResident(String residentName)");
    }

  /**
   * Allocating space for an array of students and boolean whether or not there's a dining room
   */
  ArrayList<String> residents = new ArrayList<String>();
  boolean hasDiningRoom;

  /**
   * Constructs House instance
   * @param name of house
   * @param address of house
   * @param number of floors in the house
   * @param t/f: house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDR) {
    this(name, address, nFloors, hasDR, false);
  }
  public House(String name, String address, int nFloors, boolean hasDR, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDR;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Getter for if house has dining room
   * @return t/f: house has dining room
   */
  public boolean getHasDiningRoom() {
    return this.hasDiningRoom;
  }
  /**
   * Getter for if house has an elevator
   * @return t/f: house has an elevator
   */
  public boolean getHasElevator() {
    return this.hasDiningRoom;
  }
  /**
   * Getter for number of residents in house
   * @return number of strings in array of students
   */
  public int getnResidents(){
    System.out.println("There are " + this.residents.size() + " residents in " + getName() + " house");
    return this.residents.size();
  }
  /**
   * Adds student to array of resident names
   * @param residentName
   */
  public void moveIn(String residentName){
    residents.add(residentName);
  }
  /**
   * Clears resident array
   */
  public void moveOut(){
    residents.clear();
    System.out.println("All students have been moved out of " + getName());
  }
  /**
   * Removes student name from array of residents in the house
   * @param residentName
   */
  public void moveOut(String residentName){
    residents.remove(residentName);
    System.out.println(residentName + " moved out of " + getName()); //directions said to return the name moved out. means print?
  }
  /**
   * Checks if a student's name is in residents array of names
   * @param residentName
   * @return t/f: student is resident in house
   */
  public boolean isResident(String residentName){
    boolean isResident = residents.contains(residentName);
    System.out.println(residentName + " is a resident in " + getName() + ": " + isResident);
    return isResident;
  }
  
  /**
   * Main method for testing
   * @param args
   */
  public static void main(String[] args) {
    House emersonHouse = new House("Emerson House", "1 Paradise Lane", 4, true);
    House jordanHouse = new House("Jordan House", "1 Paradise Lane", 4, false, true);
    System.out.println(emersonHouse);
    System.out.println(jordanHouse);
    jordanHouse.moveIn("Xochitl Krumbiegel"); 
    //emersonHouse.moveIn("Ryan Emerson");
    //emersonHouse.isResident("Xochitl Krumbiegel");
    //emersonHouse.getnResidents();
    jordanHouse.getnResidents();
    jordanHouse.getnResidents();
    jordanHouse.isResident("Xochitl Krumbiegel");
    jordanHouse.isResident("Ryan Emerson");

    //emersonHouse.showOptions();
  }
}