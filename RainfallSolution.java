import org.junit.Assert;
import org.junit.Test;

public class RainfallSolution {

	public int calculator(final int[] walls) {

		System.out.println("Start to calculate on below graph:");
		drawWallsInConsole(walls);

		int left = 0;
		int right = walls.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int leftPool = 0;
		int rightPool = 0;

		while (left < right) {
			if (walls[left] >= leftMax) {
				leftMax = walls[left];
			} else {
				leftPool += leftMax - walls[left];
			}

			if (walls[right] >= rightMax) {
				rightMax = walls[right];
			} else {
				rightPool += rightMax - walls[right];
			}

			if (leftMax <= rightMax) {
				left++;
			} else {
				right--;
			}
		}

		System.out.println("Result for this graph: " + (leftPool + rightPool));
		System.out.println();

		return leftPool + rightPool;
	}

	@Test
	public void test() {
		final int[] test0 = { 2, 3 };
		Assert.assertEquals(0, calculator(test0));

		final int[] test1 = { 2, 4, 1, 2, 3, 4, 6, 6, 5 };
		Assert.assertEquals(6, calculator(test1));

		final int[] test2 = { 2, 4, 1, 2, 3, 4, 6, 6, 5, 4, 5 };
		Assert.assertEquals(7, calculator(test2));

		final int[] test3 = { 3, 1, 2, 1 };
		Assert.assertEquals(1, calculator(test3));

		final int[] test4 = { 2, 5, 1, 2, 3, 4, 7, 7, 6 };
		Assert.assertEquals(10, calculator(test4));

		final int[] test5 = { 2, 5, 1, 3, 1, 2, 1, 7, 7, 6 };
		Assert.assertEquals(17, calculator(test5));

		final int[] test6 = { 2, 7, 2, 7, 4, 7, 1, 7, 3, 7 };
		Assert.assertEquals(18, calculator(test6));

		final int[] test7 = { 6, 7, 7, 4, 3, 2, 1, 5, 2 };
		Assert.assertEquals(10, calculator(test7));

		final int[] test8 = { 2, 5, 1, 2, 3, 4, 7, 7, 6, 2, 7, 1, 2, 3, 4, 5, 5, 4 };
		Assert.assertEquals(26, calculator(test8));
	}

	public void drawWallsInConsole(final int[] walls) {
		// suppose no wall's taller than 10
		final StringBuffer sb = new StringBuffer();
		for (int i = 9; i > 0; i--) {
			sb.append(i + "|");
			for (final int wall : walls) {
				if (i != 1) {
					if (wall == i - 1) {
						sb.append(" _ ");
					} else if (wall > i - 1) {
						sb.append("| |");
					} else {
						sb.append("   ");
					}
				} else {
					if (wall > i - 1) {
						sb.append("|_|");
					}
				}
			}

			if (i == 1) {
				sb.append("__");
			}
			sb.append("\n");
		}
		sb.append("  ");

		for (int i = 0; i < walls.length; i++) {
			if (i < 10) {
				sb.append(" " + (i + 1) + " ");
			} else if (i >= 10 && i < 100) {
				sb.append((i + 1) + " ");
			} else {
				sb.append((i + 1));
			}

		}
		System.out.println(sb.toString());
	}

}