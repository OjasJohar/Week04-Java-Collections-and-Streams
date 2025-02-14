package bytearraystream;

import java.io.*;

public class ImageByteArray_05 {
    public static void main(String[] args) {
        String inputImage = "src/main/java/bytearraystream/input1.jpg";
        String outputImage = "src/main/java/bytearraystream/output.jpg";

        try (FileInputStream fis = new FileInputStream(inputImage);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(outputImage)) {

                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image successfully copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
