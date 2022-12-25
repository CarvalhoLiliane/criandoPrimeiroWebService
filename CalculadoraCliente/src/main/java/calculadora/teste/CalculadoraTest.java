package calculadora.teste;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import calculadora.CalculadoraExemplo;
import calculadora.CalculadoraExemploPortImpl;

public class CalculadoraTest {

	public static void main(String[] args) throws MalformedURLException  {
		URL url = new URL("http://localhost:8080/Calculadora/services/CalculadoraExemploPort?wsdl");
		
		QName qNameCalc = new QName("http://calculadora/", "CalculadoraExemploService");
		
		Service ws = Service.create(url, qNameCalc);
		
		// CalculadoraExemplo é a classe
		CalculadoraExemplo calc = ws.getPort(CalculadoraExemplo.class);
		// CalculadoraExemplo.class é a interface. 
		
		
		System.out.println("10 - 2 =  " + calc.subtrai(10.0, 2.0));
		System.out.println("10 + 2 =  " + calc.soma(10.0, 2.0));
		System.out.println("10 x 2 =  " + calc.multiplica(10.0, 2.0));
		System.out.println("10 / 2 =  " + calc.divide(10.0, 2.0));
		
	}

}
