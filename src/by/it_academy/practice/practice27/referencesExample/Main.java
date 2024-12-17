package by.it_academy.practice.practice27.referencesExample;

import java.lang.ref.*;

public class Main {
    public static void main(String[] args) {
        String message = "Привет, мир!";
        System.out.println(message);

        SoftReference<String> softRef = new SoftReference<>("Привет, мир!");
        String message1 = softRef.get();
        System.out.println(message1);

        WeakReference<String> weakRef = new WeakReference<>("Привет, мир!");
        String message2 = weakRef.get();
        System.out.println(message2);

        ReferenceQueue<String> queue = new ReferenceQueue<>(); // создаем очередь queue, которая
        // будет использоваться для отслеживания фантомных ссылок
        PhantomReference<String> phantomRef = new PhantomReference<>("Привет, мир!", queue); // создаем фантомную ссылку phantomRef на объект типа String с содержимым «Привет, мир!»
        /*
         * Когда объект становится доступным только через фантомную ссылку,
         * он добавляется в очередь queue.
         * Мы можем это проверить, извлекая ссылки из этой очереди.*/
        Reference<? extends String> reference = queue.poll();
        /*
         * Мы используем метод poll(), чтобы извлечь ссылку из очереди.
         * Если ссылка является фантомной, это означает,
         * что объект будет удален и мы можем предпринять соответствующие действия*/


    }
}
