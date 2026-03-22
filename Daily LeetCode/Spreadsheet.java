
import com.sun.jdi.Value;

public class Spreadsheet {
    int sheet[][];

    public Spreadsheet(int rows) {
        sheet = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        // ex. cell = B10 -> it means goto Bth col and (10-1)th row bec the rows are 1
        // indexed and not 0 indexed
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1;
        sheet[row][col-'A'] = value;
    }

    public void resetCell(String cell) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1)) - 1;
        sheet[row][col-'A'] = 0;
    }

    public int getValue(String formula) {
        formula = formula.substring(1);
        String values[] = formula.split("\\+");
        // ["5","10"]
        // ["A1" , "B10"] ---> 
        return evaluate(values[0])+evaluate(values[1]);

    }

    public int evaluate(String value) {
        try {
            Integer.parseInt(value); // or Integer.parseInt(str) if you only want integers
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // it means the value is in the form A10
            char col = value.charAt(0);
            int row = Integer.parseInt(value.substring(1)) - 1;
            return sheet[row][col-'A'];
        }
    }
    public static void main(String[] args) {
        System.out.println("Creating a new spreadsheet with 15 rows.");
        Spreadsheet s = new Spreadsheet(15);

        // 1. Set some initial cell values
        System.out.println("Setting A1 = 10");
        s.setCell("A1", 10);
        System.out.println("Setting B2 = 25");
        s.setCell("B2", 25);

        // 2. Test a formula with two cell references
        int result1 = s.getValue("=A1+B2");
        System.out.println("Result of =A1+B2 is: " + result1); // Expected: 35

        // 3. Test a formula with a cell reference and a literal value
        int result2 = s.getValue("=C3+7");
        System.out.println("Result of =C3+7 (C3 is initially 0) is: " + result2); // Expected: 7

        // 4. Update a cell and re-evaluate the formula
        System.out.println("Setting C3 = 3");
        s.setCell("C3", 3);
        int result3 = s.getValue("=C3+7");
        System.out.println("Result of =C3+7 after setting C3 is: " + result3); // Expected: 10

        // 5. Test the resetCell functionality
        System.out.println("Resetting cell A1 to 0.");
        s.resetCell("A1");
        int result4 = s.getValue("=A1+B2");
        System.out.println("Result of =A1+B2 after resetting A1 is: " + result4); // Expected: 25
    }

}
