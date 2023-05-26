package netology;

public class Radio {
    private int channelsQuantity = 10;
    private int maxNumber;
    private int currentChannelsQuantity;
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio (int channelsQuantity) {
        this.maxNumber = channelsQuantity - 1;
    }

    public Radio () {
        this.maxNumber = channelsQuantity - 1;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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
