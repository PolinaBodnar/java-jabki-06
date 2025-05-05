package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TVTest {

    // Позитивные проверки
    @Test
    public void testDefaultConstructor() {
        TV tv = new TV();
        assertEquals(1, tv.getCurrentChannel());
        assertEquals(50, tv.getVolume());
    }

    @Test
    public void testSetValidChannel() {
        TV tv = new TV();
        tv.setCurrentChannel(10);
        assertEquals(10, tv.getCurrentChannel());
    }

    @Test
    public void testSetValidVolume() {
        TV tv = new TV();
        tv.setVolume(80);
        assertEquals(80, tv.getVolume());
    }

    @Test
    public void testNextChannelWithinRange() {
        TV tv = new TV();
        tv.setCurrentChannel(49);
        tv.nextChannel();
        assertEquals(50, tv.getCurrentChannel());
    }

    @Test
    public void testNextChannelWrapAround() {
        TV tv = new TV();
        tv.setCurrentChannel(50);
        tv.nextChannel();
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test
    public void testIncreaseVolume() {
        TV tv = new TV();
        tv.setVolume(99);
        tv.increaseVolume();
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        TV tv = new TV();
        tv.setVolume(1);
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void testToString() {
        TV tv = new TV();
        tv.setCurrentChannel(5);
        tv.setVolume(75);
        String expected = "Текущий канал: 5, Громкость: 75";
        assertEquals(expected, tv.toString());
    }

    // Отрицательные проверки
    @Test
    public void testSetInvalidChannelBelowRange() {
        TV tv = new TV();
        tv.setCurrentChannel(0);
        assertEquals(1, tv.getCurrentChannel(), "Канал не должен измениться при установке 0");
    }

    @Test
    public void testSetInvalidChannelAboveRange() {
        TV tv = new TV();
        tv.setCurrentChannel(51);
        assertEquals(1, tv.getCurrentChannel(), "Канал не должен измениться при установке 51");
    }

    @Test
    public void testSetInvalidVolumeBelowRange() {
        TV tv = new TV();
        tv.setVolume(-1);
        assertEquals(50, tv.getVolume(), "Громкость не должна измениться при установке -1");
    }

    @Test
    public void testSetInvalidVolumeAboveRange() {
        TV tv = new TV();
        tv.setVolume(101);
        assertEquals(50, tv.getVolume(), "Громкость не должна измениться при установке 101");
    }

    @Test
    public void testIncreaseVolumeAtMax() {
        TV tv = new TV();
        tv.setVolume(100);
        tv.increaseVolume();
        assertEquals(100, tv.getVolume(), "Громкость не должна превышать 100");
    }

    @Test
    public void testDecreaseVolumeAtMin() {
        TV tv = new TV();
        tv.setVolume(0);
        tv.decreaseVolume();
        assertEquals(0, tv.getVolume(), "Громкость не должна быть меньше 0");
    }
}
