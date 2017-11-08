package conversion;

public interface Conversion
{
	public  static int pixelToCentimetros(int pixel) {
		return (int)pixel*100/3794; 
	}
}
