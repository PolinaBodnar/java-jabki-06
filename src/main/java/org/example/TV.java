package org.example.tv;

public class TV {
    private int currentChannel;
    private int volume;

    public TV() {
        this.currentChannel = 1;
        this.volume = 50;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 1 && currentChannel <= 50) {
            this.currentChannel = currentChannel;
        } else {
            throw new IllegalArgumentException("Канал должен быть от 1 до 50");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Громкость должна быть от 0 до 100");
        }
    }

    public void nextChannel() {
        if (currentChannel < 50) {
            currentChannel++;
        } else {
            currentChannel = 1; // Переходим на первый канал
        }
    }
}
