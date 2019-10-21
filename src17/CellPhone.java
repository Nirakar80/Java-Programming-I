
public class CellPhone
{
	private String manufacturer;
	private String model;
	private double price;
	
	public CellPhone(String newMfr, String newMdl, double newPrice)
	{
		manufacturer = newMfr;
		model =newMdl;
		price = newPrice;
	}
	
	public void setManufacture(String mfr)
	{
		manufacturer = mfr;
	}
	
	public void setModel(String mdl)
	{
		model = mdl;
	}

	public void setPrice(double prc)
	{
		price = prc;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public double getPrice()
	{
		return price;
	}
}
