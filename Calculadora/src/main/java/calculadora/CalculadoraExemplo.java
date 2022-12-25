package calculadora;

import javax.jws.WebService;

@WebService(targetNamespace = "http://calculadora/", portName = "CalculadoraExemploPort", serviceName = "CalculadoraExemploService")
public class CalculadoraExemplo {
	
	public Double soma(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public Double subtrai(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public Double multiplica(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public Double divide(Double num1, Double num2) {
		return num1 / num2;
	}

}
