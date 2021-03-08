package hu.bme.mit.train.controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the epic train!"); // Display the string.
        TrainControllerImpl trainControl = new TrainControllerImpl();
        trainControl.setSpeedLimit(300);
    }
}
