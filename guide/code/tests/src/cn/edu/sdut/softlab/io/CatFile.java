package cn.edu.sdut.softlab.io;

import java.io.*;


/**
 * 文件合并
 */
public class CatFile {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CatFile src-file1 src-file2 src-file3 outFile");
            return;
        }

        String[] inFiles = new String[args.length - 1];
        String outFile = args[args.length];
        for (int i = 0; i < args.length - 1; i++) {
            inFiles[i] = args[i];
        }

        try (OutputStream out = new FileOutputStream(outFile);
        ) {
            byte[] buf = new byte[1000];
            for (String file : inFiles) {
                InputStream in  = new FileInputStream(file);
                int b = 0;
                while ((b = in.read(buf)) >= 0) {
                    out.write(buf, 0, b);
                    out.flush();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
