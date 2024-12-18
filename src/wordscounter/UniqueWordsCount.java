package wordscounter;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;




public class UniqueWordsCount {

	private String inputFile; //input file to read data
	private String outputFile; //output file to save result

	public UniqueWordsCount(String inputFile, String outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}
	
	public void processFiles() throws IOException {
		
		File readFile = new File(inputFile);
		String fileContent = FileUtils.readFileToString(readFile, "UTF-8");
		
        String[] words = StringUtils.split(fileContent.toLowerCase().replaceAll("[^a-zA-Z\\d\\s:]", ""));
		
		Set<String> uniqueWords = new HashSet<>();
		
		for (String word : words) {
			uniqueWords.add(word);
		}
		
		File resultFile = new File(outputFile);
		FileUtils.writeStringToFile(resultFile, "Total words: " + words.length + " Unique words: " + uniqueWords.size(), "UTF-8");
		
		
		
	}
	
	
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	
	public String getInputFile(){
		return inputFile;
	}
	
	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}
	
	public String getOutputFile() {
		return outputFile;
	}
	
}
