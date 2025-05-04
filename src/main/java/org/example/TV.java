package org.example;

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
            System.out.println("Неправильный канал. Канал должен быть от 1 до 50.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Неправильный уровень громкости. Громкость должна быть от 0 до 100.");
        }
    }

    public void nextChannel() {
        if (currentChannel < 50) {
            currentChannel++;
        } else {
            currentChannel = 1;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Громкость уже на максимуме!");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Громкость уже на минимуме!");
        }
    }

    @Override
    public String toString() {
        return "Текущий канал: " + currentChannel + ", Громкость: " + volume;
    }
}
