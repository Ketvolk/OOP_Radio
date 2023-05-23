package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RatioTest {

    @Test
    public void shouldSetNumber() {
        Ratio ratio = new Ratio();

        ratio.setCurrentNumber(8);

        int expected = 8;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberMin() {
        Ratio ratio = new Ratio();

        ratio.setCurrentNumber(0);

        int expected = 0;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberUnderMin() {
        Ratio ratio = new Ratio();

        ratio.setCurrentNumber(-1);

        int expected = 0;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberUpperMax() {
        Ratio ratio = new Ratio();

        ratio.setCurrentNumber(10);

        int expected = 0;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberMax() {
        Ratio ratio = new Ratio();

        ratio.setCurrentNumber(9);

        int expected = 9;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberMin() {
        Ratio ratio = new Ratio();
        ratio.setCurrentNumber(0);
        ratio.nextNumber();

        int expected = 1;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberMax() {
        Ratio ratio = new Ratio();
        ratio.setCurrentNumber(9);
        ratio.nextNumber();

        int expected = 0;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberMin() {
        Ratio ratio = new Ratio();
        ratio.setCurrentNumber(0);
        ratio.prevNumber();

        int expected = 9;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberMax() {
        Ratio ratio = new Ratio();
        ratio.setCurrentNumber(9);
        ratio.prevNumber();

        int expected = 8;
        int actual = ratio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Ratio ratio = new Ratio();

        ratio.setCurrentVolume(99);

        int expected = 99;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {
        Ratio ratio = new Ratio();

        ratio.setCurrentVolume(0);

        int expected = 0;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderMin() {
        Ratio ratio = new Ratio();

        ratio.setCurrentVolume(-1);

        int expected = 0;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {
        Ratio ratio = new Ratio();

        ratio.setCurrentVolume(100);

        int expected = 100;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpperMax() {
        Ratio ratio = new Ratio();

        ratio.setCurrentVolume(101);

        int expected = 0;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetNextVolumeMax() {
        Ratio ratio = new Ratio();
        ratio.setCurrentVolume(100);
        ratio.louder();

        int expected = 100;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolumeMin() {
        Ratio ratio = new Ratio();
        ratio.setCurrentVolume(0);
        ratio.louder();

        int expected = 1;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevVolumeMax() {
        Ratio ratio = new Ratio();
        ratio.setCurrentVolume(100);
        ratio.quieter();

        int expected = 99;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NotShouldSetPrevVolumeMin() {
        Ratio ratio = new Ratio();
        ratio.setCurrentVolume(0);
        ratio.quieter();

        int expected = 0;
        int actual = ratio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

