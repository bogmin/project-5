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
	public PosAvg() throws IOException {
		addStationNames();
		this.stations = new ArrayList<String>();
	}
	
	public void addStationNames() throws IOException {
		BufferedReader readit = new BufferedReader(new FileReader("Mesonet.txt"));
		//bunch of readLines due to useless lines at top of file
		String read = readit.readLine();
		read = readit.readLine();
		read = readit.readLine();
		read = readit.readLine();
		while (read != null) {
			read.trim();
			String stationName = read.substring(1,5);
				stations.add(stationName);
				++numStations;
			read = readit.readLine();
		}
		readit.close();
	}
	public int indexOfStation() {
		int n = 0;
		for (int i = 0; i < stations.size(); ++i) {
			if (stID.equalsIgnoreCase(stations.get(i))) {
				n = i;
			}
		}
		return n + 1;
	}

}
