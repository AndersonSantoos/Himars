package himars;

public class Himars {

	Lancadores lancadores;

	Himars() {
		this.lancadores = new Lancadores(this);
	}

	void acelerarTiros() {
		if (lancadores.fatorDisparo < 9) {
			lancadores.fatorDisparo += 0.7;
		}
	}

	void diminuirTiros() {
		if (lancadores.fatorDisparo > 0.5) {
			lancadores.fatorDisparo -= 0.4;
		}
	}

	void ligar() {
		lancadores.ligado = true;
	}

	void desligar() {
		lancadores.ligado = false;
	}

	boolean estarligado() {
		return lancadores.ligado;
	}

}
