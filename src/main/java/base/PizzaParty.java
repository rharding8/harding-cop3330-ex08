package base;

import java.util.Scanner;

public class PizzaParty {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    PizzaParty newParty = new PizzaParty();

    int people = newParty.getPeople();
    int pizzas = newParty.getPizzas();
    int slices = newParty.getSlices(pizzas);

    System.out.println(newParty.printPizza(people, pizzas, slices) + newParty.slicesPerPerson(people, slices) + newParty.remainingSlices(people, slices));
  }

  public int getPeople(){
    System.out.print("How many people? ");
    return input.nextInt();
  }

  public int getPizzas(){
    System.out.print("How many pizzas for them? ");
    return input.nextInt();
  }

  public int getSlices(int pizzas){
    System.out.print("How many slices per pizza? ");
    int slices = input.nextInt();
    return slices * pizzas;
  }

  public String printPizza(int people, int pizzas, int slices){
    return String.format("%d people with %d pizzas (%d slices)%n", people, pizzas, slices);
  }

  public String slicesPerPerson(int people, int totalSlices){
    int slices = totalSlices / people;
    return String.format("Each person gets %d pieces of pizza%n", slices);
  }

  public String remainingSlices(int people, int totalSlices){
    int slices = totalSlices % people;
    return String.format("There are %d leftover pieces.", slices);
  }
}
