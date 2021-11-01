package JavaTwo;

public class HomeWorkTwo {
        public static void main(String[] args) {
            sumOne(6, 8);
            sumTwo(-9);
            sumTree(-7);
            sumFour("Java", 3);
            //everyFourthYear();

        }
        // c boolean почему-то не выводит в консоль,наверное, что-то делаю не так,но что не пойму
        public static boolean sumOne(int a, int b) {
            int c = a + b;
            if (c >= 10 && c <= 20) {
                return true;
            } else {
                return false;
            }
        }

        public static void sumTwo(int x) {
            if (x >= 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        public static boolean sumTree(int g) {
            if (g < 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void sumFour(String name, int d) {
            for (d = 1; d < 4; d++){
                System.out.println(name + " " + d);
            }
        }
  /* условие понял, но записать в программе не смог,посмотрел подсказку с 3 урока, понял как можно было записать
      public static boolean everyFourthYear( int y ){
*/
    }
