package de.exxcellent.challenge.Services;

import de.exxcellent.challenge.Objects.ThreeColsData;
import de.exxcellent.challenge.Objects.ValueAndValueName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadCsvData {


   public static ValueAndValueName getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable(int valueNameCol, int col1, int col2, String filePath){
       String[] valueNameColStrings = ReadCol(valueNameCol, filePath, ",");
       String[] col1Data = ReadCol(col1, filePath, ",");
       String[] col2Data = ReadCol(col2, filePath, ",");

       ValueAndValueName valueAndValueName = new ValueAndValueName();
       valueAndValueName.setIntValue(Integer.MAX_VALUE);
       //start at 1 for ignoring header
       for(int i =1; i<col1Data.length;i++){

           int compareInt = Integer.parseInt(col1Data[i]) - Integer.parseInt(col2Data[i]);
           //wetter Ergebniss immer positiv und wir gehen hier mal davon aus das negative ergebnisse gernell nicht erwünscht sind wenn icht 2 methoden
           if((valueAndValueName.getIntValue()>compareInt)&&(compareInt>-1)){
               valueAndValueName.setIntValue(compareInt);
               valueAndValueName.setValueName(valueNameColStrings[i]);
           }
       }
       return valueAndValueName;
   }



   public static String[] ReadCol(int col, String filePath,String delimeter){
       String data[];
       String currentLine;
       ArrayList<String> colData = new ArrayList<String>();

       try{
           FileReader fileReader = new FileReader(filePath);
           BufferedReader bufferedReader = new BufferedReader(fileReader);

           //while till nextline  null
           while((currentLine = bufferedReader.readLine())!=null){
                data = currentLine.split(delimeter);
                //string from desired collumn to array list
                colData.add(data[col]);
           }
           return colData.toArray(new String[0]);
       }catch (Exception e){
           System.out.println(e);
           return null;
       }
   }

    //für diesen recht speziellen fall drei cols auf einmal lesen performanterer Code
    public static ArrayList<ThreeColsData> Read3Cols(int valueCol, int col2, int col3, String filePath, String delimeter){
        String data[];
        String currentLine;
        ArrayList<ThreeColsData> toReturnData = new ArrayList<ThreeColsData>();

        try{
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //while till nextline  null
            while((currentLine = bufferedReader.readLine())!=null){
                data = currentLine.split(delimeter);
                //string from desired collumn to array list
                ThreeColsData dataElement = new ThreeColsData();
                dataElement.setValueCol(data[valueCol]);
                try{
                    //try catch for bad values in table int collumns they get ignored with max and min value for our case
                    //there are cleaner ways to do this or maybe we want the error but with my used time i thn this is fine
                    dataElement.setIntValue1Col(Integer.parseInt(data[col2]));
                }  catch (NumberFormatException e) {
                    dataElement.setIntValue1Col(Integer.MAX_VALUE);
            }
                try{
                    dataElement.setIntValue2Col(Integer.parseInt(data[col3]));
                }  catch (NumberFormatException e) {
                     dataElement.setIntValue2Col(0);
                }
                toReturnData.add(dataElement);
            }
            return toReturnData;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ValueAndValueName getValueAndValueNameOfSmallestDiffrenceBetweenTwoColsOfTable2(int valueNameCol, int col1, int col2, String filePath){
       ArrayList<ThreeColsData> threeColsData= Read3Cols(valueNameCol,col1,col2,filePath,",");

        ValueAndValueName valueAndValueName = new ValueAndValueName();
        valueAndValueName.setIntValue(Integer.MAX_VALUE);
        //start at 1 for ignoring header
        for(int i =1; i<threeColsData.size();i++){

            int compareInt = threeColsData.get(i).getIntValue1Col() - threeColsData.get(i).getIntValue2Col();
            //wetter Ergebniss immer positiv und wir gehen hier mal davon aus das negative ergebnisse gernell nicht erwünscht sind wenn icht 2 methoden
            if((valueAndValueName.getIntValue()>compareInt)&&(compareInt>-1)){
                valueAndValueName.setIntValue(compareInt);
                valueAndValueName.setValueName(threeColsData.get(i).getValueCol());
            }
        }
        return valueAndValueName;
    }


}
