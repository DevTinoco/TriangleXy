package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	
	//PARA CRIAR UMA FUNÇAO:
	
	//PUBLIC = INDICA QUE PODE SER USADA EM OUTRO ARQUIVO
	//DOUBLE = TIPO DE RETORNO DA OPERAÇÃO, POR SER UM CALCULO DE AREA, ESSA AREA É UM NUMERO E PARA RETORNAR UM NUMERO USAMOS DOUBLE
	//AREA = NOME DA OPEARAÇAO.
	//AREA FUNÇAO = NÃO RECEBE PARAMETROS POIS SO PRECISAMOS DE A,B e C PARA CALCULAR A AREA. 
	//APOS CRIAR A FUNCAO, SUBSTITUIR O CALCULO PARA CHAMAR A FUNCAO.
	public double area() {
		 double p = (a + b +c )/ 2.0;
		 return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	}


