import java.util.*;

public class MatrizEx3 {
	private int[][] dados;
	private int totalLinhas;
	private int totalColunas;

	public MatrizEx3() {
		totalLinhas = 3;
		totalColunas = 3;
		dados = new int[totalLinhas][totalColunas];
	}

	public MatrizEx3(int lin, int col) {
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

	public static MatrizEx3 Soma(MatrizEx3 matA, MatrizEx3 matB) {
		MatrizEx3 res = new MatrizEx3(matA.getTotalLinhas(), matA.getTotalColunas());

		for (int lin = 0; lin < matA.getTotalLinhas(); lin++)
			for (int col = 0; col < matA.getTotalColunas(); col++)
				res.set(lin, col, (matA.get(lin, col) + matB.get(lin, col)));

		return res;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// *******************************************************
		// *******************************************************
		// EXERCICIO 3 - matriz F = matriz D + matriz E
		// *******************************************************
		// *******************************************************
		// referencias para realizar a soma de matrizes
		MatrizEx3 matrizD, matrizE, matrizF;
		int linD, colD, linE, colE;

		do {
			System.out.println("Digite um número de linhas da matriz D:");
			linD = entrada.nextInt();
			if (linD < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (linD <= 0);

		do {
			System.out.println("Digite um número de colunas da matriz D:");
			colD = entrada.nextInt();
			if (colD < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (colD <= 0);

		// cria o objeto para a matriz D
		matrizD = new MatrizEx3(linD, colD);

		// popula a matriz D
		System.out.println("Informe os valores (inteiros) da matriz D");
		for (int i = 0; i < matrizD.getTotalLinhas(); i++)
			for (int j = 0; j < matrizD.getTotalColunas(); j++) {
				System.out.println("Matriz D[" + i + "][" + j + "]:");
				matrizD.set(i, j, entrada.nextInt());
			}

		do {
			System.out.println("Digite um número de linhas da matriz E:");
			linE = entrada.nextInt();
			if (linE < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (linE <= 0);

		do {
			System.out.println("Digite um número de colunas da matriz E:");
			colE = entrada.nextInt();
			if (colE < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (colE <= 0);

		// cria o objeto para a matriz E
		matrizE = new MatrizEx3(linE, colE);

		// popula a matriz E
		System.out.println("Informe os valores (inteiros) da matriz E");
		for (int i = 0; i < matrizE.getTotalLinhas(); i++)
			for (int j = 0; j < matrizE.getTotalColunas(); j++) {
				System.out.println("Matriz E[" + i + "][" + j + "]:");
				matrizE.set(i, j, entrada.nextInt());
			}

		if ((linD == linE) && (colD == colE)) {
			System.out.println("Somando as matrizes D e E...");
			// o objeto da matriz F será criado dentro da funcao Soma e será
			// entao retornado uma referencia
			matrizF = MatrizEx3.Soma(matrizD, matrizE);

			// imprime informacao do tamanho da matriz F
			System.out.println("Matriz F tem " + matrizF.getTotalLinhas() + " linhas e " + matrizF.getTotalColunas()
					+ " colunas.");
			// imprime os valores da matriz F
			System.out.println(matrizF.toString());
		} else {
			System.out.println(
					"Não é possível somar as matrizes D (" + matrizD.getTotalLinhas() + "x" + matrizD.getTotalColunas()
							+ ") e E (" + matrizE.getTotalLinhas() + "x" + matrizE.getTotalColunas() + ").");
			System.out.println("O número de linhas e colunas das matrizes devem ser iguais.");
		}

	} // end main

} // end class