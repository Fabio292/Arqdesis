package heranca;

public abstract class Poligono extends Figura 
{

	
	private double altura , base ;

	
	public Poligono( double base , double altura ) 
	{
		setAltura( altura );
		setBase( base );
	}

	public double getAltura( )
	{
		return altura;
	}

	public void setAltura( double altura )
	{
		this.altura = ( altura < 0.0 ? 0.0 : altura );
	}

	public double getBase( ) 
	{
		return base;
	}

	public void setBase( double base )
	{
		this.base = ( base < 0.0 ? 0.0 : base);
	}
	@Override
	public double area( )
	{
		return getBase( ) * getAltura( );
	}

}
