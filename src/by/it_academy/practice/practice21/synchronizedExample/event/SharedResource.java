package by.it_academy.practice.practice21.synchronizedExample.event;

public class SharedResource {

    private String message;
    private boolean written;

    public synchronized void write(String message) throws InterruptedException {
        Thread.sleep(1000);
        if (written) {
            System.out.println("write()");
            wait(); // ждем пока не прочитает сообщение
        }

        this.message = message;
        written = true;
        System.out.println("Message written to resource " + message);
        notify(); // Уведомляем поток чтение, что можно прочитать сообщение
    }

    public synchronized String read() throws InterruptedException {
        if (!written) {
            System.out.println("read() is waiting until write()");
            wait();
        }

        String message = this.message;
        written = false;
        notify(); // Уведомляем поток записи, что можно записать новое сообщение
        return message;
    }

}
