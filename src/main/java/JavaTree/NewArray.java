package JavaTree;

public class NewArray {
        public static void main(String[] args) {
            int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) {
                    System.out.println(arr3[i] * 2);

                }

            }
            int arr1[] = new int[100];
            for(int i = 1; i < arr1.length; i++){
                System.out.print(i + " ");
            }
        }
    }
