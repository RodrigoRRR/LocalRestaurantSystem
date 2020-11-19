package model;

public class XTudo implements Sanduiches, Cardapio{

	private String a;
	private String o;
	private String tipo;
	private String adcional;
	private String opcao;
	private Double preco;
	private int contador = 0;
	
	public String getA() 
	{
		return a;
	}

	public void setA(String a) 
	{
		this.a = a;
	}

	public String getO() 
	{
		return o;
	}

	public void setO(String o) 
	{
		this.o = o;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public String getAdcional() 
	{
		return adcional;
	}

	public String getOpcao() 
	{
		return opcao;
	}
	
	public int getContador() 
	{
		return contador;
	}

	public void setContador(int contador) 
	{
		this.contador = contador;
	}
	
	public Double getPreco() 
	{
		return preco;
	}

	@Override
	public void tipoH()
	{
		tipo = "X Tudo";
	}
	
	@Override
	public void adcional()
	{
		if (a == "sem adicional")
		{
			adcional = "sem adcional";
		}
		
		if (a == "queijo") 
		{
			adcional = "queijo";
		}
		
		if (a == "bacon")
		{
			adcional = "bacon";
		}
		
		if (a == "picles")
		{
			adcional = "picles";
		}
	}
	
	@Override
	public void opcao()
	{
		if (o == " ")
		{
			opcao = " ";
		}
		
		if (o != " ")
		{
			opcao = o;
		}
	}
	
	@Override
	public void preco()
	{
		if (adcional == "sem adicional")
		{
			preco = 20.00;
		}
		
		if (adcional == "queijo")
		{
			preco = 20.00 + 2.00;
		}
		
		if (adcional == "bacon")
		{
			preco = 20.00 + 2.00;
		}
	}
}
