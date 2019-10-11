
public class MesoInherit extends MesoAbstract {
	MesoStation station;
	private int[] proper = new int[3];
	
	public MesoInherit(MesoStation mesoStation) {
		this.station = mesoStation;
	}
	
	@Override
	public int[] calAverage() {
		int[] values = new int[station.getStID().length()];
		double avg = 0;
		
		for(int i = 0; i < station.getStID().length(); ++i) {
			char letter = station.getStID().charAt(i);
			int ascii = (int) letter;
			values[i] = ascii;
		}
		for(int i = 0; i < values.length; ++i) {
			avg = avg + values[i];
		}
		avg = avg / values.length;
		proper[0] = (int) Math.ceil(avg);
		proper[1] = (int) Math.floor(avg);
		proper[2] = (int) Math.round(avg);
		return proper;
	}
	@Override
	public char letterAverage() {
		
	}
}
