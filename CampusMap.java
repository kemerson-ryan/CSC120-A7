import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }
    
    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Seelye Hall","5 Chapin Way Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Burton Hall", "46 College Lane Northampton, MA 01063", 4));
        Building campusCenter = new Building("Campus Center", "100 Elm Street Northampton, MA 01063"); //read about what I've done here in the bottom of my reflection document
        myMap.addBuilding(campusCenter);
        Library youngLibrary = new Library("Young Library", "4 Tyler Drive Northampton, MA 01063", 1);
        myMap.addBuilding(youngLibrary);
        myMap.addBuilding(new Library("Josten Library", "122 Green Street Northampton, MA 10163", 2));
        myMap.addBuilding(new House("King House", "1 Paradise Lane Northampton, MA 01063", 3, true));
        myMap.addBuilding(new House("Scales House", "1 Paradise Lane Northampton, MA 01063", 3, true));
        myMap.addBuilding(new House("Tyler House", "151 Green Street Northampton, MA 01063", 4, true));
        myMap.addBuilding(new House("Emerson House", "1 Paradise Lane Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Cafe("CC Cafe", "1 Chapin Way Northampton, MA 01060", 1));

        System.out.println(myMap);
    }
    
}
