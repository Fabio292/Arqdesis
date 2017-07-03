package heranca;

public class Circulo extends Figura 
{
	
	private double raio;
	
	public Circulo( )
	{
		this( 0.0 );
	}
	
	
	public Circulo( double raio )
	{
		setRaio( raio );
	}
	
	
	public double getRaio( )
	{
		return raio;
	}

	public void setRaio( double raio )
	{
		this.raio = raio;
	}

	
	@Override
	public double area( ) 
	{
		return Math.PI * Math.pow( getRaio( ) , 2 );
	}

	@Override
	public double perimetro( )
	{
		return 2 * Math.PI * getRaio( );
	}

	
	@Override
	public String toString( )
	{
		return "Circulo (area = " + area( ) + ", perimetro = " + perimetro( ) + ")";
	}
}
