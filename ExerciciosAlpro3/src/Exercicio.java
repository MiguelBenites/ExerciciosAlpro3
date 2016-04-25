
public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(f(4));

		System.out.println(contagem(4));
		
	}

	/**
	 * Método exercicio de análise assintótica
	 * 
	 * 
	 * 
	 * f(n) = 6n² + 5n + 4
	 * 
	 * @param n
	 * @return
	 */
	public static int f(int n) {
		int soma = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				soma += i + j;
		return soma;
	}

	/**
	 * Método exercicio de análise assintótica
	 * 
	 * 
	 * g(n) = 5(2^n) + 5n + 6
	 * 
	 * @param n
	 * @return
	 */
	public static int g(int n) {
		int s = 0, cont = 1;
		while (n > 0) {
			cont *= 2;
			n -= 1;
		}
		for (int i = 0; i < cont; i++)
			s += i;
		return s;
	}

	/**
	 * 
	 * Qual função tem maior complexidade: f(n) ou g(n)? Pode-se afirmar que a
	 * função de maior complexidade apresenta um desempenho "sempre" pior do que
	 * a daquela de menor complexidade?
	 * 
	 * De uma maneira geral, f(n) cresce de maneira muito mais lenta em relação
	 * à g(n).
	 * 
	 */

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int m(int n) {
		int cont = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				cont = cont + 1;
		return cont;
	}
	/*
	 * 
	 * Qual é o O()? Justifique sua resposta. Resposta: O(n2), pelo mesmo
	 * princípio da soma de Gauss. Desta forma, o laço da variável “i” será
	 * realizado “n vezes” e o Laço de “j” será feito “n-1, n-2, n-3, …, 1
	 * vezes”.
	 * 
	 */

	
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int contagem(int n) {
		int cont = 0;
		for (int i = 0; i < 2 * n; i++)
			for (int j = 0; j < n; j++)
				cont = cont + 1;
		return cont;
	}

}
