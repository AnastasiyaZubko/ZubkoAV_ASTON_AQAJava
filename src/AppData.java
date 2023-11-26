public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public String[] getHeader() {
        String[] header = new String[3];
        for (int i = 1; i <= 3; i++) {
            header[i-1 ] = "Value".concat(String.valueOf(i));
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




