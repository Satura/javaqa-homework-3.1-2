package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);
        assertEquals(0,radio.getCurrentStation());
        radio.setCurrentStation(-2);
        assertEquals(0,radio.getCurrentStation());
        radio.setCurrentStation(7);
        assertEquals(7,radio.getCurrentStation());
    }

    @Test
    void shouldSwitchNextStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);

        radio.next();
        assertEquals(14,radio.getCurrentStation());
        radio.next();
        assertEquals(15,radio.getCurrentStation());
        radio.next();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    void shouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.prev();
        assertEquals(2,radio.getCurrentStation());
        radio.prev();
        assertEquals(1,radio.getCurrentStation());
        radio.prev();
        assertEquals(10,radio.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(14);
        assertEquals(0,radio.getCurrentVolume());
        radio.setCurrentVolume(-3);
        assertEquals(0,radio.getCurrentVolume());
        radio.setCurrentVolume(3);
        assertEquals(3,radio.getCurrentVolume());
    }

    @Test
    void shouldMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.minus();
        assertEquals(1,radio.getCurrentVolume());
        radio.minus();
        assertEquals(0,radio.getCurrentVolume());
        radio.minus();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void shouldPlusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.plus();
        assertEquals(9,radio.getCurrentVolume());
        radio.plus();
        assertEquals(100,radio.getCurrentVolume());
        radio.plus();
        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    void shouldSetStationsCount(){
        Radio radio = new Radio();
        assertEquals(10,radio.getStationsCount());

        radio.setStationsCount(15);
        assertEquals(15,radio.getStationsCount());
    }

    @Test
    void shouldCreateRadioPresetStations(){
        Radio radio = new Radio(42);
        assertEquals(42,radio.getStationsCount());
    }
}
