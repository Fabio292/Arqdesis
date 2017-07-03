package heranca;

public class Cilindro implements Poliedro 
{

	
	private Circulo circulo ;
	private Retangulo retangulo;
	
		
	public Cilindro( ) 
	{
		this( 0.0 , 0.0 );
	}
	
	
	public Cilindro( double raio , double altura )
	{
		retangulo = new Retangulo( );
		circulo = new Circulo( raio );
				
		retangulo.setAltura( altura );
	}
		
	@Override
	public double volume( )
	{
		return Math.pow( circulo.getRaio( ) , 3 ) * Math.PI * retangulo.getAltura( );
	}

	@Override
	public String toString( )
	{
		return "Cilindro (volume = " + volume( ) + ")";
	}
	
}
