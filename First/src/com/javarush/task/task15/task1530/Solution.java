package com.javarush.task.task15.task1530;

public class Solution {
    public static void main(String[] args) {
        DrinkMaker latte = new LatteMaker();
        DrinkMaker tea = new TeaMaker();
        latte.makeDrink();
        tea.makeDrink();
    }
}