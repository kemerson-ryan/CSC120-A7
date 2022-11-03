import java.util.ArrayList;

/**
 * House class extends from Building class
 * no outside sources used
 * @author Ryan (K) Emerson
 * @version October 31, 2022
 */
public class House extends Building {

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
    super(name, address, nFloors);
    this.hasDiningRoom = hasDR;
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
   * Getter for number of residents in house
   * @return number of strings in array of students
   */
  public int getnResidents(){
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
    return isResident;
  }
  
  /**
   * Main method for testing
   * @param args
   */
  public static void main(String[] args) {
    House emersonHouse = new House("Emerson", "1 Paradise Lane", 4, true);
    System.out.println(emersonHouse);
    //emersonHouse.moveIn("Xochitl Krumbiegel"); 
    //System.out.println(emersonHouse.nResidents()); 
    //System.out.println(emersonHouse.isResident("Xochitl Krumbiegel"));
  }
}