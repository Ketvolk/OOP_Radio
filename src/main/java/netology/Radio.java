package netology;

import lombok.*;

@Getter

public class Radio {

    private int channelsQuantity = 10;
    private int maxNumber = channelsQuantity - 1;
    private int currentNumber;
    private int currentVolume;

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextNumber() {
        if (currentNumber == maxNumber) {
            currentNumber = 0;
        } else currentNumber = currentNumber + 1;
    }

    public void prevNumber() {
        if (currentNumber == 0) {
            currentNumber = maxNumber;
        } else currentNumber = currentNumber - 1;
    }

    public void louder() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void quieter() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

