public class MultiDimensionalArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) ((Math.random()) * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
