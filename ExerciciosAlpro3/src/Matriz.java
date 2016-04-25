import java.util.*;

public class Matriz {
	
	
	//referência para matriz
	private int[][] dados;
	
	//variável para linhas
	private int totalLinhas;
	
	//referência para colunas
	private int totalColunas;
	
	
	public Matriz() {
	
		//instância uma matriz
		totalLinhas = 3;
		totalColunas = 3;
		dados = new int[totalLinhas][totalColunas];
	}

	//construtor...
	public Matriz(int lin, int col) {
		totalLinhas = lin;
		totalColunas = col;
		dados = new int[totalLinhas][totalColunas];
	}

	//retorna numero de colunas
	public int getTotalColunas() {
		return totalColunas;
	}

	
	//retorna numero de linhas
	public int getTotalLinhas() {
		return totalLinhas;
	}

	
	//insere um item na matriz e retorna se conseguiu ou não...
	public boolean set(int lin, int col, int elem) {
		if (lin < 0 || lin >= totalLinhas)
			return false;
		if (col < 0 || col >= totalColunas)
			return false;

		dados[lin][col] = elem;

		return true;
	}

	//retorna um item da matriz
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

	public static void main(String[] args) {
		// ...
		Matriz m = new Matriz(3, 3);
		
		System.out.println("Matriz: \n"+m.toString());
		
		m.set(0, 0, 1);
		m.set(1, 0, 8);
		m.set(2, 0, 9);
		m.set(2, 2, 3);
				
		System.out.println("Matriz:       \n"+m.toString());
		System.out.println("Retorna em 2,0: "+m.get(2, 0));
		
		
		
		

	} // end main

} // end class