package heranca;
public class Cubo implements Poliedro 
{
	
	private Quadrado quadrado;

	
	public Cubo( )
	{
		this( 0.0 );
	}
	
	
	public Cubo( double lado )
	{
		quadrado = new Quadrado( lado );
	}
	
	@Override
	public double volume( )
	{
		return Math.pow( quadrado.getBase( ) ,  3 );
	}

	@Override
	public String toString( ) 
	{
		return "Cubo (volume = " + volume( ) + ")";
	}
	
	

}
