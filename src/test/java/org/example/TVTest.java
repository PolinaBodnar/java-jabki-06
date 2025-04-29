//import org.example.tv.TV;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TVTest {
//
//    @Test
//    public void testSetAndGetChannel() {
//        TV tv = new TV();
//        tv.setCurrentChannel(5);
//        assertEquals(5, tv.getCurrentChannel());
//    }
//
//    @Test
//    public void testSetInvalidChannel() {
//        TV tv = new TV();
//        assertThrows(IllegalArgumentException.class, () -> tv.setCurrentChannel(51));
//    }
//
//    @Test
//    public void testNextChannel() {
//        TV tv = new TV();
//        tv.setCurrentChannel(10);
//        tv.nextChannel();
//        assertEquals(11, tv.getCurrentChannel());
//    }
//
//    @Test
//    public void testVolumeRange() {
//        TV tv = new TV();
//        tv.setVolume(30);
//        assertEquals(30, tv.getVolume());
//        assertThrows(IllegalArgumentException.class, () -> tv.setVolume(110));
//    }
//}
