
package humber.rooms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/*
 *
 * Author: Inderjit Badwal (Sunny)
 *
 */
public class RoomMap {
    
   private Map<String, Room> rooms;
   
   public RoomMap() {
       
   }
   
   public boolean addRoom(Room room) {
       return true;
   }
   
   public boolean removeRoom(String roomID) {
       return true;
   }
   
   public Iterator getRooms() {
       return new ArrayList<>().iterator();
   }
    
}
