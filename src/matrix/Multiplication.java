package matrix;

public class Multiplication {

    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{10,11},{20,21},{30,31}};

//        a= new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
//        b= new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int n=a[0].length;

        int result[][]= new int[n][n];

        System.out.println(b.length);

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j]=0;
                for (int k = 0; k < n; k++) {
                    result[i][j]+=a[i][k]*b[k][j];

                }

            }
            System.out.println();

        }

        System.out.println(result[0][0]+" "+result[0][1]+" "+result[0][2]);
        System.out.println(result[1][0]+" "+result[1][1]+" "+result[1][2]);
        System.out.println(result[2][0]+" "+result[2][1]+" "+result[2][2]);
    }
}
