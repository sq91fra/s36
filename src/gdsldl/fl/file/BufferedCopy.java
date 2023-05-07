package gdsldl.fl.file;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws Exception {
        String srcPath = "d:\\hello.c";
        String destPath = "d:\\hello2.c";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(srcPath));
            bw = new BufferedWriter(new FileWriter(destPath));

            while ((line = br.readLine()) != null){
                bw.write(line);
//                插入换行符
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) br.close();
            if (bw != null) bw.close();
        }

    }
}
