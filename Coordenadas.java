package ptiteste;

public class Coordenadas {

	double x1;
	double x2;
	double y1;
	double y2;

	public Coordenadas(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	// calculo de distancia euclidiana**
	public double CalculoPonto1() {
		return Math.pow(x2 - x1, 2);
	}

	public double CalculoPonto2() {
		return Math.pow(y2 - y1, 2);
	}

	public double CalculoDistanciaDosPontos() {
			return Math.sqrt(CalculoPonto1() + CalculoPonto2());
		}  

	public String toString() {
		return "A distancia é: " + CalculoDistanciaDosPontos();
	}

}
