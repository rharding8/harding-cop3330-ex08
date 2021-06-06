/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

// Note: Incorporates challenge02 AND some code improvements.

package challenge02;

import java.util.Scanner;

public class PizzaPartyChallenge {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    PizzaPartyChallenge newParty = new PizzaPartyChallenge();

    int people = newParty.getPeople();
    int pizzas = newParty.getPizzas();
    int slices = newParty.getSlices(pizzas);

    System.out.println(newParty.printPizza(people, pizzas, slices) + newParty.slicesPerPerson(people, slices) + newParty.remainingSlices(people, slices));
  }

  public int getPeople(){
    System.out.print("How many people? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Answer! Try Again.");
      return getPeople();
    }
    return Integer.parseInt(n);
  }

  public int getPizzas(){
    System.out.print("How many pizzas for them? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Answer! Try Again.");
      return getPizzas();
    }
    return Integer.parseInt(n);
  }

  public int getSlices(int pizzas){
    System.out.print("How many slices per pizza? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Answer! Try Again.");
      return getSlices(pizzas);
    }
    return Integer.parseInt(n) * pizzas;
  }

  public String printPizza(int people, int pizzas, int slices){
    String output = "";
    if (people == 1){
      output = output + String.format("%d person with ", people);
    }
    else {
      output = output + String.format("%d people with ", people);
    }

    if (pizzas == 1){
      output = output + String.format("%d pizza ", pizzas);
    }
    else {
      output = output + String.format("%d pizzas ", pizzas);
    }

    if (slices == 1){
      output = output + String.format("(%d slice)%n", slices);
    }
    else {
      output = output + String.format("(%d slices)%n", slices);
    }

    return output;
  }

  public String slicesPerPerson(int people, int totalSlices){
    int slices = totalSlices / people;
    if (slices == 1){
      return String.format("Each person gets %d piece of pizza%n", slices);
    }
    else {
      return String.format("Each person gets %d pieces of pizza%n", slices);
    }

  }

  public String remainingSlices(int people, int totalSlices){
    int slices = totalSlices % people;
    if (slices == 1){
      return String.format("There is %d leftover piece.", slices);
    }
    else {
      return String.format("There are %d leftover pieces.", slices);
    }

  }
}
