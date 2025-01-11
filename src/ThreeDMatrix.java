// Демонстрация использования трехмерного массива.
public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] treed = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    treed[i][j][k] = i * j * k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(treed[i][j][k] + " ");
                System.out.println();
            }
        System.out.println();
    }
}
