import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg {
	int numStations = 0;
	char letterAvg;
	private ArrayList<String> stations;
	
	public LetterAvg(char letterAvg) throws IOException{
		this.letterAvg = letterAvg;
		this.stations = new ArrayList<String>();
		addStationNames();
	}
	public void addStationNames() throws IOException {
		BufferedReader readit = new BufferedReader(new FileReader("Mesonet.txt"));
		//bunch of readLines due to useless lines at top of file
		String read = readit.readLine();
		read = readit.readLine();
		read = readit.readLine();
		read = readit.readLine();
		while (read != null) {
			String stationName = read.substring(1,5);
				stations.add(stationName);
				++numStations;
			read = readit.readLine();
		}
		readit.close();
	}
	public int numberOfStationWithLetterAvg() {
		int counter = 0;
		for (int i = 0; i < stations.size(); ++i) {
			if (letterAvg == stations.get(i).charAt(0)) {
				++counter;
			}
		}
		return counter; 
	}
}
