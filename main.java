public class Main {
  public static void main(String[] args) {

// winter, spring, summer, autumn
// warm jacket, t-shirt, swimming suit, rain coat
 String season = "spring";
    
    if (season == "winter"){
      System.out.println("Wear a warm jacket");
    }
    if (season == "spring"){
      System.out.println("Wear a T-shirt");
    }
    if (season == "summer"){
      System.out.println("Wear a swimming suit");
    }
    if (season == "autumn"){
      System.out.println("Wear a rain coat");
    }
    
// in the example above, we are wasting computer resources because the correct answer is "spring" and then it will still continue to check summer and autumn as well. Therefore, it's better to use "else if" which stops checking after it gets a true answer. See the example below:

    String season1 = "random";
    
    if (season1 == "winter"){
      System.out.println("Wear a warm jacket");
    }
    else if (season1 == "spring"){
      System.out.println("Wear a T-shirt");
    }
    else if (season1 == "summer"){
      System.out.println("Wear a swimming suit");
    }
    else if (season1 == "autumn"){
      System.out.println("Wear a rain coat");
    }
    else {
      System.out.println("I do not recognize this season!");
    }

    // another example
    
    double temp = 15;

    if (temp <= 5){
      System.out.println("Wear super warm clothes");
    }
    else if (5 < temp && temp <= 15){
      System.out.println("Wear warm clothes");
    }
    else if (15 < temp && temp <= 30){
      System.out.println("Wear normal clothes");
    }
    else if (temp < 30){
      System.out.println("Wear a cooling jacket");
    }
    else {
      System.out.println("I do not recognize this number!");
    }

    //easier way to do the above example:

    double temp1 = 15;

    if (temp1 <= 5) {
      System.out.println("Wear super warm clothes");
    }
    else if (temp1 <= 15) {
      System.out.println("Wear warm clothes");
    }
    else if (temp1 <= 30) {
      System.out.println("Wear normal clothes");
    }
    else {
      System.out.println("Wear a cooling jacket");
    }
    
  }


}
