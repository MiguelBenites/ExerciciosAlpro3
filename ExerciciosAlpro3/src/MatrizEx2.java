import java.util.*;

public class MatrizEx2 {
	private int[][] dados;
	private int totalLinhas;
	private int totalColunas;

	public MatrizEx2() {
		totalLinhas = 3;
		totalColunas = 3;
		dados = new int[totalLinhas][totalColunas];
	}

	public MatrizEx2(int lin, int col) {
		totalLinhas = lin;
		totalColunas = col;
		dados = new int[totalLinhas][totalColunas];
	}

	public int getTotalColunas() {
		return totalColunas;
	}

	public int getTotalLinhas() {
		return totalLinhas;
	}

	public boolean set(int lin, int col, int elem) {
		if (lin < 0 || lin >= totalLinhas)
			return false;
		if (col < 0 || col >= totalColunas)
			return false;

		dados[lin][col] = elem;

		return true;
	}

	public int get(int lin, int col) {
		if (lin < 0 || lin >= totalLinhas)
			return 0;
		if (col < 0 || col >= totalColunas)
			return 0;

		return dados[lin][col];
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < totalLinhas; i++) {
			for (int j = 0; j < totalColunas; j++) {
				str += "[" + i + "][" + j + "]:" + dados[i][j] + " ";
			}
			str += "\n";
		}
		return str;
	}

	public static MatrizEx2 Multiplica(MatrizEx2 matA, MatrizEx2 matB) {
		int soma;
		MatrizEx2 res = new MatrizEx2(matA.getTotalLinhas(), matB.getTotalColunas());

		for (int lin = 0; lin < matA.getTotalLinhas(); lin++)
			for (int col = 0; col < matB.getTotalColunas(); col++) {
				soma = 0;
				for (int i = 0; i < matA.getTotalColunas(); i++)
					soma += matA.get(lin, i) * matB.get(i, col);
				res.set(lin, col, soma);
			}

		return res;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// *******************************************************
		// *******************************************************
		// EXERCICIO 2 - matriz C = matriz A x matriz B
		// *******************************************************
		// *******************************************************
		// referencias para realizar a multiplicacao de matrizes
		MatrizEx2 matrizA, matrizB, matrizC;
		int linA, colA, linB, colB;

		do {
			System.out.println("Digite um número de linhas da matriz A:");
			linA = entrada.nextInt();
			if (linA < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (linA <= 0);

		do {
			System.out.println("Digite um número de colunas da matriz A:");
			colA = entrada.nextInt();
			if (colA < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (colA <= 0);

		// cria o objeto para a matriz A
		matrizA = new MatrizEx2(linA, colA);

		// popula a matriz A
		System.out.println("Informe os valores (inteiros) da matriz A");
		for (int i = 0; i < matrizA.getTotalLinhas(); i++)
			for (int j = 0; j < matrizA.getTotalColunas(); j++) {
				System.out.println("Matriz A[" + i + "][" + j + "]:");
				matrizA.set(i, j, entrada.nextInt());
			}

		do {
			System.out.println("Digite um número de linhas da matriz B:");
			linB = entrada.nextInt();
			if (linB < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (linB <= 0);

		do {
			System.out.println("Digite um número de colunas da matriz B:");
			colB = entrada.nextInt();
			if (colB < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (colB <= 0);

		// cria o objeto para a matriz B
		matrizB = new MatrizEx2(linB, colB);

		// popula a matriz B
		System.out.println("Informe os valores (inteiros) da matriz B");
		for (int i = 0; i < matrizB.getTotalLinhas(); i++)
			for (int j = 0; j < matrizB.getTotalColunas(); j++) {
				System.out.println("Matriz B[" + i + "][" + j + "]:");
				matrizB.set(i, j, entrada.nextInt());
			}

		if (colA == linB) {
			System.out.println("Multiplicando a matriz A pela matriz B...");
			// o objeto da matriz C será criado dentro da funcao Multiplica e
			// será
			// entao retornado uma referencia
			matrizC = MatrizEx2.Multiplica(matrizA, matrizB);

			// imprime informacao do tamanho da matriz C
			System.out.println("Matriz C tem " + matrizC.getTotalLinhas() + " linhas e " + matrizC.getTotalColunas()
					+ " colunas.");
			// imprime os valores da matriz C
			System.out.println(matrizC.toString());
		} else {
			System.out.println(
					"Não é possível multiplicar matriz A (" + matrizA.getTotalLinhas() + "x" + matrizA.getTotalColunas()
							+ ") pela matriz B (" + matrizB.getTotalLinhas() + "x" + matrizB.getTotalColunas() + ").");
			System.out.println("O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
		}

	} // end main

} // end class