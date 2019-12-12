# project-5
ReadWrite class: ReadWrite serves an identical function as the previous projects, serving only to read through Mesonet.txt and write the results to an ArrayList. The method for doing so can be called by creating a ReadWrite object. returning() simply calls the addStationNames method and then returns the ArrayList.
Main class: Everything. Broken up into sections here:
-VBox creation: the VBox contains everything within the project in the panel.
-Slider creation: the slider is created first, as well as the associated listeners and labels for printing its value in real-time.
-ComboBox creation: creates the drop-down box.
-displayButton: reads the value of the ComboBox and the Slider, and displays the stations with desired Hamming Distance from the selected station.
-Calculate HD button: displays the number of stations with each Hamming Distance, 0-4, from the selected station.
-Add Station button and TextField: creates a button and text field for adding stations. Text field reads number of characters; if it does not equal four characters, pops up an alert. If a valid station name, adds it to the ArrayList, and by extension the drop-down menu.
-Free area: Asks user if they like jazz. If yes, provides them with jazz. If no, calls user a bozo.
-Wrapping up: adds and displays all components. Creates the Scene and enables display.
-hammDist0: used for Calculate HD. Calculates the numbers of stations of given Hamming Distance, and assigns values in an array, which can be later displayed.
-hammDist1: used for Show Stations. Assigns station names of desired Hamming Distance from given station name to an ArrayList, which can then be printed. Should have used ListView.
-addStations: adds stations.
