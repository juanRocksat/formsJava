package conversion;

public interface Conversion
{
	public  default int pixelToCentimetros(int pixel) {
		return (int)pixel*100/3794; 
	}
	public default int cmToPixel(int cm){
		return (int)3794*cm/100;
	}
}
