package de.exxcellent.challenge;

import de.exxcellent.challenge.Objects.ValueAndValueName;
import de.exxcellent.challenge.Services.ReadCsvData;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
      /*  ValueAndValueName weatherValueAndValueName = ReadCsvData.getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable(0,1,2,"src/main/resources/de/exxcellent/challenge//weather.csv");
        String dayWithSmallestTempSpread = weatherValueAndValueName.getValueName();    // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        int tempSpread = weatherValueAndValueName.getIntValue();
        System.out.println("The Temprature Spred was " + tempSpread);

        ValueAndValueName footballValueAndValueName = ReadCsvData.getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable(0,5,6,"src/main/resources/de/exxcellent/challenge//football.csv");
        String teamWithSmallestGoalDiff = footballValueAndValueName.getValueName();    // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", teamWithSmallestGoalDiff);
        int goalDiff = footballValueAndValueName.getIntValue();
        System.out.println("The Goal Diff was " + goalDiff); */

        ValueAndValueName weatherValueAndValueName1 = ReadCsvData.getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable2(0,1,2,"src/main/resources/de/exxcellent/challenge//weather.csv");
        String dayWithSmallestTempSpread1 = weatherValueAndValueName1.getValueName();    // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread1);
        int tempSpread1 = weatherValueAndValueName1.getIntValue();
        System.out.println("The Temprature Spred was " + tempSpread1);

        ValueAndValueName footballValueAndValueName1 = ReadCsvData.getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable2(0,5,6,"src/main/resources/de/exxcellent/challenge//football.csv");
        String teamWithSmallestGoalDiff1 = footballValueAndValueName1.getValueName();    // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", teamWithSmallestGoalDiff1);
        int goalDiff1 = footballValueAndValueName1.getIntValue();
        System.out.println("The Goal Diff was " + goalDiff1);
    }



}
