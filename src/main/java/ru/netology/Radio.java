package ru.netology;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount = 10;

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

    public void setCurrentVolume(int currentVolume) {
        if ((currentVolume < 0) || (currentVolume > 100)) {
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
        if (currentVolume == 100) {
            return;}
        else {
            currentVolume++;}
    }

    public Radio (int stationsCount){
        this.stationsCount = stationsCount;
    }
}
