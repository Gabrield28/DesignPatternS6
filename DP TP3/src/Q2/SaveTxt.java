package Q2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTxt implements SaveStrategy {

	private int[][] _data;
	public void save(String s, CGrille9x9 g) {
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
}
