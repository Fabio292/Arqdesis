package heranca;

public class Esfera implements Poliedro 
{

	
	private Circulo circulo;
	
	
	public Esfera( )
	{
		this( 0.0 );
	}
	
	
	public Esfera( double raio )
	{
		circulo = new Circulo( raio );
	}
	
	@Override
	public double volume( ) 
	{
		return ( 4.0 / 3.0 ) * Math.pow( circulo.getRaio( ) , 3 ) * Math.PI; 
	}

	@Override
	public String toString( )
	{
		return "(Esfera volume = " + volume( ) + ")";
	}
}
