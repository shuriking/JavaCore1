package JavaOne;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = 5;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отррицательная");
        }
    }
    public static void printColor(){
        int value = -200;

        if (value <=0){
            System.out.println("Красный");
        }else if (value > 1 && value < 100){
            System.out.println("Желтый");
        }else if(value>100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 35;
        int b = 43;

        if(a>=b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }

}