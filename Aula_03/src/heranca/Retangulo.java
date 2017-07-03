package heranca;

public class Retangulo extends Poligono implements Diagonal 
{
	public Retangulo( )
	{
		this( 0.0 , 0.0 );
	}
	
	public Retangulo( double base , double altura )
	{
		super( base , altura );
	}
	
	@Override
	public  double diagonal( ) 
	{
		return Math.sqrt( Math.pow( getBase( ) , 2 ) + Math.pow( getAltura( ) , 2 ) );
	}

	@Override
	public double perimetro( ) 
	{
		return 2 * getAltura( ) + 2 * getBase( ) ;
	}

	@Override
	public String toString( ) 
	{
		return "Retangulo (diagonal = " + diagonal( ) + ", perimetro = "
				+ perimetro( ) + ", area = " + area( ) + ")";
	}
}
