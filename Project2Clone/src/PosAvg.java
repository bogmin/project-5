import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	int numStations = 0;
	String stID;
	private ArrayList<String> stations;
	
	public PosAvg(String stID) throws IOException {
		this.stID = stID; 
		this.stations = new ArrayList<String>();
		addStationNames();
	}

}
