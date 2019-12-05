import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWrite {
    int numStations = 0;
    private ArrayList<String> stations;
    
    public ReadWrite()  {
        this.stations = new ArrayList<String>();
    }

    private void addStationNames() throws IOException{
        BufferedReader readit = new BufferedReader(new FileReader("Mesonet.txt"));
        String read = readit.readLine();
        while (read != null) {
            String stationName = read.substring(0,4);
            stations.add(stationName);
            ++numStations;
            read = readit.readLine();
        }
        readit.close();
        // TODO Auto-generated method stub
        
    }
    ArrayList<String> returning() throws IOException{
        addStationNames();
        return stations;
    }
    
    }
