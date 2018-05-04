package java8;

import java.io.*;

public class ProcessFile {
    public static void main(String[] args) {
//        new ProcessFile().processFile();


        File f = new File("src" + File.separator + "java8" + File.separator + "FirstCode.java");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            new ProcessFile().processFileByLambda(f, (BufferedReader b) -> b.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void processFileByLambda(File f, BrLambda brl) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(brl.getStr(br));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }

    @FunctionalInterface
    public interface BrLambda {
        public String getStr(BufferedReader b) throws IOException;
    }

    private void processFile() {
        File f = new File("src" + File.separator + "java8" + File.separator + "FirstCode.java");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
