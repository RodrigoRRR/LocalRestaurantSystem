package model;

public class PQqueijos implements Pizzas, Cardapio{

	private String b;
	private String t;
	private String sabor;
	private String borda;
	private String tamanho;
	private double preco;
	private int contador = 0;
	
	public String getB() 
	{
		return b;
	}

	public void setB(String b) 
	{
		this.b = b;
	}

	public String getT() 
	{
		return t;
	}

	public void setT(String t) 
	{
		this.t = t;
	}

	public String getSabor() 
	{
		return sabor;
	}

	public String getBorda() 
	{
		return borda;
	}

	public String getTamanho() 
	{
		return tamanho;
	}

	public int getContador() 
	{
		return contador;
	}

	public void setContador(int contador) 
	{
		this.contador = contador;
	}

	public double getPreco() 
	{
		return preco;
	}

	@Override
	public void Sabor() 
	{
		sabor = "4 Queijos";
	}
	
	@Override
	public void Borda() 
	{
		
		if(b == "sem borda")
		{
			borda = "sem borda";
		}
		
		if (b == "cheddar")
		{
			borda = "cheddar";
		}
		
		if(b == "catupiry")
		{
			borda = "catupiry";
		}
		
		if(b == "chocolate")
		{
			borda = "chocolate";
		}
		
	}
	
	@Override
	public void Tamanho() 
	{
		
		if (t == "pequena")
		{
			tamanho = "pequena";
		}
		
		if (t == "media")
		{
			tamanho = "media";
		}
		
		if (t == "grande")
		{
			tamanho = "grande";
		}
		
	}
	
	@Override
	public void preco()
	{
		if (tamanho == "pequena")
		{
			preco = 20.00;
			
			if (borda != "sem borda")
			{
				preco = preco + 2;
			}
			
		}
		
		if (tamanho == "media")
		{
			preco = 25.00;
			
			if (borda != "sem borda")
			{
				preco = preco + 2;
			}
		}
		
		if (tamanho == "grande")
		{
			preco = 30.00;
			
			if (borda != "sem borda")
			{
				preco = preco + 2;
			}
		}
	}
}
