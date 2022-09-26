package himars;

public class Lancadores {

	Himars himars;
	boolean ligado = false;
	double fatorDisparo = 1;

	Lancadores(Himars himars) { // O motor recebe o carro e o carro recebe o motor >> Um pra Um.
		this.himars = himars;
	}

	int velocidade() { // Giros recebe se estiver ligado execute a função, caso não, não execute
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorDisparo * 100);
		}

	}
}
