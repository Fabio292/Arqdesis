package heranca;

public class Losango extends Poligono
{
	
	public Losango( )
	{
		this( 0.0 , 0.0 );
	}

	
	public Losango( double base , double altura )
	{
		super( base , altura );	
	}

	@Override
	public double perimetro( )
	{
		return 4 * getBase( );
	}

	@Override
	public String toString( ) 
	{
		return "Losango (perimetro = " + perimetro( ) + ", area = " + area( ) + ")";
	}
	
}
