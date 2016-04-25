import java.util.*;








/**
 * Exercicio 4 da disciplina de Alpro 3
 * 
 * 
 * 
 * 
 * 
 * @author dellcloud1
 *
 */
public class MatrizEx4 {
	private int[][] dados;
	private int totalLinhas;
	private int totalColunas;

	public MatrizEx4() {
		totalLinhas = 3;
		totalColunas = 3;
		dados = new int[totalLinhas][totalColunas];
	}

	public MatrizEx4(int lin, int col) {
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

	public static MatrizEx4 Transposta(MatrizEx4 matA) {
		MatrizEx4 res = new MatrizEx4(matA.getTotalColunas(), matA.getTotalLinhas());

		for (int lin = 0; lin < matA.getTotalLinhas(); lin++)
			for (int col = 0; col < matA.getTotalColunas(); col++)
				res.set(col, lin, matA.get(lin, col));

		return res;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// *******************************************************
		// *******************************************************
		// EXERCICIO 4 - (matriz H)^T = matriz G
		// *******************************************************
		// *******************************************************
		// referencias para realizar a soma de matrizes
		MatrizEx4 matrizG, matrizH;
		int linG, colG;

		do {
			System.out.println("Digite um número de linhas da matriz G:");
			linG = entrada.nextInt();
			if (linG < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (linG <= 0);

		do {
			System.out.println("Digite um número de colunas da matriz G:");
			colG = entrada.nextInt();
			if (colG < 1)
				System.out.println("O número informado deve ser maior que zero!");
		} while (colG <= 0);

		// cria o objeto para a matriz G
		matrizG = new MatrizEx4(linG, colG);

		// popula a matriz G
		System.out.println("Informe os valores (inteiros) da matriz G");
		for (int i = 0; i < matrizG.getTotalLinhas(); i++)
			for (int j = 0; j < matrizG.getTotalColunas(); j++) {
				System.out.println("Matriz G[" + i + "][" + j + "]:");
				matrizG.set(i, j, entrada.nextInt());
			}

		System.out.println("Transpondo a matriz G...");
		// o objeto da matriz H será criado dentro da funcao Transposta e será
		// entao retornado uma referencia
		matrizH = MatrizEx4.Transposta(matrizG);

		// imprime informacao do tamanho da matriz F
		System.out.println(
				"Matriz H tem " + matrizH.getTotalLinhas() + " linhas e " + matrizH.getTotalColunas() + " colunas.");
		// imprime os valores da matriz H
		System.out.println(matrizH.toString());

	} // end main

} // end class