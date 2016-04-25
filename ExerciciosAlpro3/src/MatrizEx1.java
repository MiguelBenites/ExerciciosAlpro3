import java.util.*;

public class MatrizEx1 {
	private int[][] dados;
	private int totalLinhas;
	private int totalColunas;

	public MatrizEx1() {
		totalLinhas = 3;
		totalColunas = 3;
		dados = new int[totalLinhas][totalColunas];
	}

	public MatrizEx1(int lin, int col) {
		totalLinhas = lin;
		totalColunas = col;
		dados = new int[totalLinhas][totalColunas];
	}

	
	
	//Exercicio
	public void Inicializa() {
		for (int i = 0; i < totalLinhas; i++)
			for (int j = 0; j < totalColunas; j++)
				dados[i][j] = i + j;
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

	public void imprimeLinhas() {
		for (int i = 0; i < totalLinhas; i++) {
			for (int j = 0; j < totalColunas; j++) {
				System.out.print("[" + i + "][" + j + "]:" + dados[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public void imprimeColunas() {
		for (int j = 0; j < totalColunas; j++) {
			for (int i = 0; i < totalLinhas; i++) {
				System.out.print("[" + i + "][" + j + "]:" + dados[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// *******************************************************
		// *******************************************************
		// EXERCICIO 1
		// *******************************************************
		// *******************************************************
		// cria um objeto Matriz de 5 linhas e 6 colunas
		MatrizEx1 mat = new MatrizEx1(5, 6);
		// inicializa cada posicao da matriz com o valor da soma da
		// coordenada de sua linha com a coordenada de sua coluna
		mat.Inicializa();
		// imprime informacao do tamanho da matriz
		System.out.println("Matriz de " + mat.getTotalLinhas() + " linhas e " + mat.getTotalColunas() + " colunas.");
		System.out.println("");
		// imprime os valores da matriz (linha por linha)
		System.out.println("Valores na matriz linha por linha...");
		mat.imprimeLinhas();
		System.out.println("");
		System.out.println("Valores na matriz coluna por coluna...");
		mat.imprimeColunas();
		// *******************************************************
		// *******************************************************

	} // end main

} // end class