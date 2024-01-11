package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTextInParentheses {

    public static void main(String[] args) {
        try {
            String filePath = "/home/vikas.chavan/Documents/SpringBoot_Microservice/PaymentApp/maven/SpringBoot_Microservice_Ashoka/IPayment/src/main/java/org/example/row.txt"; // Replace with the actual path to your file
            String content = readFile(filePath);

            String pattern = "\\((.*?)\\)";
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(content);

            while (matcher.find()) {
                String result = matcher.group(1);
                System.out.println(result.trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
