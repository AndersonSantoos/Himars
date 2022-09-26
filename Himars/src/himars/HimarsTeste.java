package himars;

public class HimarsTeste {
	public static void main(String[] args) {

		Himars h1 = new Himars();
		System.out.println(h1.estarligado()); // DESLIGADO

		h1.ligar(); // ACIONANDO O LIGAMENTO DO HIMARS
		System.out.println(h1.estarligado());

		System.out.println(h1.lancadores.velocidade());

		h1.acelerarTiros();
		h1.acelerarTiros();
		h1.acelerarTiros();
		h1.acelerarTiros();
		System.out.println(h1.lancadores.velocidade());

		h1.diminuirTiros();
		h1.diminuirTiros();
		h1.diminuirTiros();
		System.out.println(h1.lancadores.velocidade());

	}

}
