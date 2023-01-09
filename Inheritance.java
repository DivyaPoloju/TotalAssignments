

class Fruit
{
   String fruitName;
}
// child class Apple is inheriting parent class Fruit
class Apple extends Fruit
{
}
// child class DragonFruit is inheriting parent class Fruit
class DragonFruit extends Fruit
{
}
public class Inheritance
{
public static void main(String argvs[])
{
    // creating object of the child class Apple
               Apple apple = new Apple();
               // assigning the fruit name
               apple.fruitName = "Apple";
               // displaying the fruit name
               System.out.println("Fruit name is " + apple.fruitName);
               // creating object of the child class DragonFruit
               DragonFruit dragonfruit = new DragonFruit();
               // assinging the fruit name
               dragonfruit.fruitName = "DragonFruit";
               // displaying the fruit name
               System.out.println("Fruit name is " + dragonfruit.fruitName);
}
} 
