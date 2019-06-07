package practice;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class ReadProgram {
	public static void main(String[] myArgs)
    {
        int mem[] = new int [100];
        char program[] = new char [500];
        FileReader inputFile;
        try
        {
            inputFile = new FileReader (myArgs[0]);
        }
        catch (IOException ioEx)
        {
            JOptionPane.showMessageDialog(null,"Invalid File Name",
            "Invalid File name",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int counter = 0;
        try
        {
            while (inputFile.read(program,counter,1)!=-1)
                ++counter;
        }
        catch (IOException ioEx)
        {
            JOptionPane.showMessageDialog(null,"File Read Erroe",
            "Encountered an error while reading file",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        String stringToTokenize = new String (program);
        StringTokenizer tokens = new StringTokenizer(stringToTokenize,"\r\n\0",false);
        while (tokens.hasMoreTokens())
        {
            mem[counter++] = Integer.parseInt(tokens.nextToken());
            for(int inst = 0 ; inst<counter;++inst)
                System.out.printf("\n Instruction[%d] = %d",inst ,mem[inst]);
        }
    }

}
