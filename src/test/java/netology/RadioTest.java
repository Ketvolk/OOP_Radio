package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetChannelsQuantity() {
        int expected = 10;
        int actual = radio.getChannelsQuantity();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxNumber() {
        int expected = 9;
        int actual = radio.getMaxNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumber() {
        radio.setCurrentNumber(8);

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberMin() {
        radio.setCurrentNumber(0);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberUnderMin() {
        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberUpperMax() {
        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberMax() {
        radio.setCurrentNumber(9);

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberMin() {
        radio.setCurrentNumber(0);
        radio.nextNumber();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberMax() {
        radio.setCurrentNumber(9);
        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberMin() {
        radio.setCurrentNumber(0);
        radio.prevNumber();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberMax() {
        radio.setCurrentNumber(9);
        radio.prevNumber();

        int expected = 8;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpperMax() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetNextVolumeMax() {
        radio.setCurrentVolume(100);
        radio.louder();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeMin() {
        radio.setCurrentVolume(0);
        radio.louder();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevVolumeMax() {
        radio.setCurrentVolume(100);
        radio.quieter();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotShouldSetPrevVolumeMin() {
        radio.setCurrentVolume(0);
        radio.quieter();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}