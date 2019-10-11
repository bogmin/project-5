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
}
