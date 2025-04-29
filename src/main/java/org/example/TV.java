//package org.example.tv;
//
//public class TV {
//    private int currentChannel;  // Текущий канал
//    private int volume;  // Громкость
//
//    // Конструктор с начальными значениями
//    public TV() {
//        this.currentChannel = 1;  // Канал по умолчанию
//        this.volume = 50;  // Громкость по умолчанию
//    }
//
//    // Геттер для currentChannel
//    public int getCurrentChannel() {
//        return currentChannel;
//    }
//
//    // Сеттер для currentChannel с валидацией
//    public void setCurrentChannel(int currentChannel) {
//        if (currentChannel >= 1 && currentChannel <= 50) {
//            this.currentChannel = currentChannel;
//        } else {
//            System.out.println("Номер канала должен быть от 1 до 50.");
//        }
//    }
//
//    // Геттер для volume
//    public int getVolume() {
//        return volume;
//    }
//
//    // Сеттер для volume с валидацией
//    public void setVolume(int volume) {
//        if (volume >= 0 && volume <= 100) {
//            this.volume = volume;
//        } else {
//            System.out.println("Громкость должна быть от 0 до 100.");
//        }
//    }
//
//    // Метод для переключения на следующий канал
//    public void nextChannel() {
//        if (currentChannel < 50) {
//            currentChannel++;
//        } else {
//            currentChannel = 1;  // Если на канале 50, то переключаем на канал 1
//        }
//    }
//
//    // Метод для переключения на предыдущий канал
//    public void previousChannel() {
//        if (currentChannel > 1) {
//            currentChannel--;
//        } else {
//            currentChannel = 50;  // Если на канале 1, то переключаем на канал 50
//        }
//    }
//}
