package ptiteste;

public class TesteDeCoordenas {
	
	public static void main(String[] args) {
		
		
		Coordenadas pontos = new Coordenadas(2,2,1,1);
		
		pontos.CalculoPonto1();
		pontos.CalculoPonto2();
		
		pontos.CalculoDistanciaDosPontos();
		
		System.out.println("Ponto 1 -> " + pontos.x1);
		System.out.println("Ponto 2 -> " + pontos.y1);
		System.out.println("Ponto 3 -> " + pontos.x2);
		System.out.println("Ponto 4 -> " + pontos.y2);

		System.out.println("-------------------------");
		
		System.out.println(pontos);
		
	}

}
