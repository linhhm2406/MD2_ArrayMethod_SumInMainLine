import java.util.Scanner;

public class SumOfMainDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao kich thuoc : ");
        int size = input.nextInt();

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Nhap vao phan tu thu [%d][%d] : ", i, j);
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j==i){
                    sum+=array[i][j];
                }
            }
        }

        System.out.printf("Tong cac phan tu o duong cheo chinh la %d",sum);
    }
}
