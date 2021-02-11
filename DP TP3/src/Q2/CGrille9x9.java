package Q2;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CGrille9x9 {
	private int[][] _data;
	
	// constructeur, allocation de la grille
	public CGrille9x9 () {
		_data = new int[9][9];
	}
	
	// setter : numeros de lignes et de colonnes commencent a 1
	public void set(int col, int lig, int val) {
		_data[col-1][lig-1] = val;
	}
	
	// getter : numeros de lignes et de colonnes commencent a 1
	public int get(int col, int lig) {
		return _data[col-1][lig-1];
	}
	
	// renvoie vrai si la grille est remplie
	public boolean isFull() {
		boolean full = true;
		for (int c=0; c<9; c++)
			for (int l=0; l<9; l++)
				full &= (_data[c][l] != 0);
		return full;
	}

	public void saveText(String s) {
		BufferedWriter bufferedWriter = null;

		try {

			bufferedWriter = new BufferedWriter(new FileWriter(s));

			for (int l=0; l<9; l++) {
				for (int c=0; c<9; c++) {
					bufferedWriter.write( String.valueOf(_data[c][l]) + " " );
				}
				bufferedWriter.write("\n");
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			//Close the BufferedWriter
			try {
				if (bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	public void saveXML(String s) {
		BufferedWriter bufferedWriter = null;

		try {

			bufferedWriter = new BufferedWriter(new FileWriter(s));

			bufferedWriter.write("<grid>\n");
			for (int l=0; l<9; l++) {
				for (int c=0; c<9; c++) {
					bufferedWriter.write("    <elem lig=\""+(l+1)+"\" col=\""+(c+1)+"\" >");
					bufferedWriter.write( String.valueOf(_data[c][l]) );
					bufferedWriter.write("</elem>\n");
				}
			}
			bufferedWriter.write("</grid>\n");

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			//Close the BufferedWriter
			try {
				if (bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
