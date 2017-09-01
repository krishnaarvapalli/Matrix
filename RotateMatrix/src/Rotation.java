
public class Rotation {
	
	
	private static char matrix[][] = {
			{ 'U', 'S', 'A' },
			{ 'U', 'S', 'A' },
			{ 'U', 'S', 'A' }
			
	};

	public static <Char> void main(String[] args) {
		System.out.println("Input matrix :");
		printMatrix(matrix);
		
		char[][] rotatedMatrix = rotateMatrixBy90Degrees();
		
		System.out.println("\nArray after rotating by 90 degrees : ");
		printMatrix(rotatedMatrix);
	}

	private static char[][] rotateMatrixBy90Degrees() {
		char[][] newMatrix = createNewMatrix();
		
		int columns = getColumnsLength();
		int rows = getRowsLength();
		
		for (int j = 0; j < columns; j++) {
			for (int i = 0, k = rows - 1; i < rows; i++, k--) {
				newMatrix[j][i] = matrix[k][j];
			}
		}
		return newMatrix;
	}

	private static char[][] createNewMatrix() {
		return new char[getColumnsLength()][getRowsLength()];
	}

	private static char getRowsLength() {
		return (char) matrix.length;
	}

	private static char getColumnsLength() {
		return (char) matrix[0].length;
	}

	private static <Char> void printMatrix(char[][] matrix2) {
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
