package roach;

public class RoachPopulation {
	private double population;
	public RoachPopulation()
	{
		population = 0;
	}
	public RoachPopulation(int initialPopulation)
	{
		population = initialPopulation;
	}
	public void breed()
	{
		population = population*2;
	}
	public void spray(double percentReduction)
	{
		population = population - (percentReduction*0.01)*population;
	}
	public double getRoaches()
	{
		return population;
	}
}