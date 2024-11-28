package by.it_academy.practice.practice22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ImageDownload {

    public static void main(String[] args) {
        List<String> imageUrls = Arrays.asList(
                "https://devhumor.com/content/uploads/images/May2024/java_release_meme.jpg",
                "https://www.pitpat.com/wp-content/uploads/2021/07/geo-chierchia-Fkwlgk2vQdA-unsplash-1-1536x1152.jpg"
        );

        downloadImages(imageUrls);

    }

    public static void downloadImages(List<String> imageUrls) {
        // запускаем асинхронные задачи
        List<CompletableFuture<Void>> futures = imageUrls.stream()
                .map(url -> CompletableFuture.runAsync(() -> downloadImage(url)))
                .toList();

        // для дальнейшего использоваия положим в массив
        CompletableFuture<Void>[] futuresArray = futures.toArray(new CompletableFuture[0]);

        // объеденим все Future в один
        CompletableFuture<Void> futuresComposed = CompletableFuture.allOf(futuresArray);

        // дождемся результата
        futuresComposed.join();

        System.out.println("All images downloaded successfully");

    }

    private static void downloadImage(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            try (InputStream in = url.openStream();
                 FileOutputStream out = new FileOutputStream(getFileName(imageUrl));) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("Image downloaded " + imageUrl);
            }
        } catch (IOException e) {
            System.out.println("Failed to download image " + imageUrl);
        }
    }

    private static String getFileName(String imageUrl) {
        return imageUrl.substring(imageUrl.lastIndexOf("/") + 1);
    }
}

