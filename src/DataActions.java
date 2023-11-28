import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Реализовать сохранение данных в csv файл; Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
Разделитель между столбцами - символ точка с запятой (;)
(Пример см. на скриншоте)
Для хранения данных использовать класс вида:
public class AppData {
   private String[] header;
   private int[][] data;
   // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */
class MainClass {
    public static final String PATH = new File("data.csv").getAbsolutePath();

    public static void main(String[] args) throws IOException {
        DataActions actions = new DataActions();
        AppData appData = new AppData();
        actions.save(appData, false);
        actions.reader();
    }
}

class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader() {
        String[] header = new String[3];
        for (int i = 1; i <= 3; i++) {
            header[i - 1] = "Value".concat(String.valueOf(i));
        }
        return header;
    }

    public int[][] getData() {

        int[][] data = {

                {
                        1, 5, 98},
                {
                        54, 67, 2
                }
        };
        return data;
    }
}

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
            writer = new CSVWriter(new FileWriter(MainClass.PATH,reWrite), ';', ICSVWriter.NO_QUOTE_CHARACTER, ICSVWriter.DEFAULT_ESCAPE_CHARACTER, ICSVWriter.DEFAULT_LINE_END);
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
            writer = new CSVWriter(new FileWriter(MainClass.PATH, reWrite));
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
            writer = new CSVWriter(new FileWriter(MainClass.PATH, reWrite));
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
            reader = new com.opencsv.CSVReader(new FileReader(MainClass.PATH),';', ICSVWriter.NO_QUOTE_CHARACTER, ICSVWriter.DEFAULT_ESCAPE_CHARACTER, ICSVWriter.DEFAULT_LINE_END);
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
