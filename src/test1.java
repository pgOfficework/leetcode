import java.util.Arrays;
import java.util.Comparator;

public class test1 {

	public static void main(String[] args) {
		
		int a[]= {2, 4, 2, 6, 7, 1};
		int b[]= {0, 5, 3, 2, 1, 5};
		
		System.out.println( solution(a, b, 2));
		
	}

	public static int solution(int[] X, int[] Y, int W) {

		int[][] potholes = new int[X.length][W];
		for (int i = 0; i < X.length; i++) {
			potholes[i][0] = X[i];
			potholes[i][1] = Y[i];
		}

		Arrays.sort(potholes, Comparator.comparingInt(a -> a[0]));

		int minimumDistance = 0;

		int left = 0;
		int right = potholes.length - 1;

		while (left < right) {
			int leftDistance = Math.abs(potholes[left][0]) - potholes[right][0] - W / 2;
			int rightDistance = Math.abs(potholes[right][0]) - potholes[left][0] - W / 2;

			if (leftDistance < rightDistance) {
				minimumDistance = minimumDistance + leftDistance;
				left++;
			} else {
				minimumDistance = minimumDistance + rightDistance;
				right--;
			}

			int lJump = Math.min(Math.max(0, potholes[right][0] - potholes[left][0] - W / 2), W / 2);
			int RJump = Math.min(Math.max(0, potholes[left][0] - potholes[right][0] - W / 2), W / 2);
			
			if(lJump>0 && right+1<potholes.length && potholes[right][0]<=potholes[left][0]+lJump){
				continue;
			}
			if(RJump>0 && left+1<potholes.length && potholes[left][0]<=potholes[left][0]+RJump){
				continue;
			}
			
			minimumDistance = minimumDistance + Math.max(lJump, RJump);

			left = left + lJump;
			right = right + RJump;
			
			if(potholes[left][0]==potholes[right][0]) {
				break;
			}

//			if (left + W / 2 <= potholes[right][0]) {
//				left = left + (W / 2);
//			} else if (right - W / 2 >= potholes[left][0]) {
//				right = right - W / 2;
//			}
		}

		return minimumDistance;
		// Implement your solution here
	}

}
