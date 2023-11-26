import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DataActions {

    public List<String[]> arrayToList(int[][] myData) {
        List<String[]> stringDataList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String[] array = new String[3];
            for (int j = 0; j < 3; j++) {
                array[j] = String.valueOf(myData[i][j]);
            }
            stringDataList.add(array);
        }
        return stringDataList;
    }

    public void save(AppData appData, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(MainClass.PATH), ';', ICSVWriter.NO_QUOTE_CHARACTER, ICSVWriter.DEFAULT_ESCAPE_CHARACTER, ICSVWriter.DEFAULT_LINE_END);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        csvWriterSpecialSeparators(appData.getHeader(),
                0,
                ';',
                MainClass.PATH,
                true);
        csvWriterSpecialSeparators(arrayToList(appData.getData()), 0, ';', MainClass.PATH, true);
        csvWriterSpecialSeparators(arrayToList(appData.getData()), 1, ';', MainClass.PATH, true);

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
    public void csvWriterSpecialSeparators(String[] dataList, int rawNum, char separator, String path, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(path, reWrite));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeNext(dataList);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void csvWriterSpecialSeparators(List<String[]> dataList, int rawNum, char separator, String path, Boolean reWrite) {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter(path, reWrite));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert writer != null;
        writer.writeNext(dataList.get(rawNum));
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reader() {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(MainClass.PATH));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String[]> fullData = null;
        try {
            assert reader != null;
            fullData = reader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        assert fullData != null;
        for (String[] row : fullData) {
            System.out.println(Arrays.toString(row));
        }
    }
}
