package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TVTest {

    @Test
    void testChangeChannel() {
        TV tv = new TV();
        tv.setCurrentChannel(10);
        assertEquals(10, tv.getCurrentChannel());
    }

    @Test
    void testChangeVolume() {
        TV tv = new TV();
        tv.setVolume(30);
        assertEquals(30, tv.getVolume());
    }

    @Test
    void testIncreaseVolume() {
        TV tv = new TV();
        tv.increaseVolume();
        assertEquals(51, tv.getVolume());
    }

    @Test
    void testDecreaseVolume() {
        TV tv = new TV();
        tv.decreaseVolume();
        assertEquals(49, tv.getVolume());
    }
}
