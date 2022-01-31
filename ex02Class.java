package aula03;

public class ex02Class 
	{
	 	
		int pessoas;
		double peso;
		String empresa;
		int bagagem;	
		
		public ex02Class()
		{
			this.pessoas=125;
			this.peso=65.000;
			this.empresa="GEN AirLines";
			this.bagagem=50;			
		}
	
		public void informarPassageiros()
		{
			System.out.println("embarcaram: "+pessoas+" passageiros. ");
		}
		
		public void informarPeso()
		{
			System.out.println("limite máximo de peso na aeronave: "+peso);
		}
		
		public void informarBagagem()
		{
			System.out.println("a bagagem máxima permitida é de: "+bagagem+"KG");
		}
	
		public void informarEmpresa()
		{
			System.out.println("nós da companhia aerea "+empresa+" agradecemos a preferência!");
		}
	}

