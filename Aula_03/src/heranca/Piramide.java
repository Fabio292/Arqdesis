package heranca;

public class Piramide implements Poliedro
{
	
	private Quadrado quadrado;
	private double alturaPiramide;

	
	public Piramide( )
	{
		this( 0.0 , 0.0 );
	}

	
	public Piramide( double ladoBase , double alturaPiramide )
	{
		quadrado = new Quadrado( ladoBase );
		setAlturaPiramide( alturaPiramide );
	}

	public double getAlturaPiramide( )
	{
		return alturaPiramide;
	}

	public void setAlturaPiramide( double alturaPiramide )
	{
		this.alturaPiramide = ( alturaPiramide >= 0.0 ? alturaPiramide : 0.0 );
	}

	@Override
	public double volume( ) 
	{
		return ( 1.0 / 3.0 ) * ( quadrado.area( ) * getAlturaPiramide( ) );
	}

	@Override
	public String toString( ) 
	{
		return "Piramide (volume = " + volume( ) + ")";
	}
	
	

}
