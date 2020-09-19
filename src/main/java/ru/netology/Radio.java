package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount = 10;

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStationsCount(int stationsCount) {
        this.stationsCount = stationsCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation < 1) || (currentStation > stationsCount)) {
            return;}
        else {
            this.currentStation = currentStation;}
    }

    public void next(){
        if (currentStation == stationsCount) {
            currentStation = 1;}
        else {
            currentStation++;}
    }

    public void prev(){
        if (currentStation == 1) {
            currentStation = stationsCount;}
        else {
            currentStation--;}
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume < 0) || (currentVolume > 10)) {
            return;}
        else {
            this.currentVolume = currentVolume;}
    }

    public void minus(){
        if (currentVolume == 0) {
            return;}
        else {
            currentVolume--;}
    }

    public void plus(){
        if (currentVolume == 10) {
            return;}
        else {
            currentVolume++;}
    }

    public Radio(){}

    public Radio(int stationsCount){
        this.stationsCount = stationsCount;
    }

}
