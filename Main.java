/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().changeSize(24, 24);
        new JerooGUI();
        Main m = new Main();
        m.runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public void runJerooCode() {
        Jeroo bugs = new Jeroo(0,  0, EAST, 90);
        Jeroo daffy = new Jeroo(0, 23, WEST, 90);
 
    }

}
