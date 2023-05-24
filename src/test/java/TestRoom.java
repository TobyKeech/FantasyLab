import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRoom {

    Room room;

    @Before
    public void setUp(){
        room = new Room("Throne room");
    }

    @Test
    public void testHasName(){
        assertEquals("Throne room", room.getName());
    }

}
