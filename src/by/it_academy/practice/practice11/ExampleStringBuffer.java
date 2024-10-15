package by.it_academy.practice.practice11;

public class ExampleStringBuffer {
    public static void main(String[] args) {
        //        StringBuffer()
//        StringBuffer(int capacity)
//        StringBuffer(String str)
//        StringBuffer(CharSequence chars)

        String str = "Java";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println("Емкость: " + strBuffer.capacity()); // 20
        strBuffer.ensureCapacity(32);
        System.out.println("Емкость: " + strBuffer.capacity()); // 42
        System.out.println("Длина: " + strBuffer.length()); // 4


//        //получить строку, которая хранится в StringBuffer
//        String str = "Java";
//        StringBuffer strBuffer = new StringBuffer(str);
//        System.out.println(strBuffer); // Java

//        //Получение и установка символов
//        StringBuffer strBuffer = new StringBuffer("Java");
//        char c = strBuffer.charAt(0); // J
//        System.out.println(c);
//        strBuffer.setCharAt(0, 'c');
//        System.out.println(strBuffer.toString()); // cava

//        //Добавление в строку
//        //append() добавляет подстроку в конец StringBuffer
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.append(" world");
//        System.out.println(strBuffer.toString()); // hello world

//        //insert() добавляет строку или символ по определенному индексу в StringBuffer
//        StringBuffer strBuffer = new StringBuffer("word");
//        strBuffer.insert(3, 'l');
//        System.out.println(strBuffer.toString()); //world
//        strBuffer.insert(0, "s");
//        System.out.println(strBuffer.toString()); //sworld

//        //Удаление символов
//        //delete() удаляет все символы с определенного индекса о определенной позиции
//        //метод deleteCharAt() удаляет один символ по определенному индексу
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.delete(0,2);
//        System.out.println(strBuffer.toString()); //sembler
//        strBuffer.deleteCharAt(6);
//        System.out.println(strBuffer.toString()); //semble

////        Обрезка строки
////        substring() обрезает строку с определенного индекса до конца, либо до определенного индекса
//        StringBuffer strBuffer = new StringBuffer("hello java!");
//        String str1 = strBuffer.substring(6); // обрезка строки с 6 символа до конца
//        System.out.println(str1); //java!
//        String str2 = strBuffer.substring(3, 9); // обрезка строки с 3 по 9 символ
//        System.out.println(str2); //lo jav


////        Изменение длины
//        StringBuffer strBuffer = new StringBuffer("hello");
//        strBuffer.setLength(10);
//        System.out.println(strBuffer.toString()); //"hello     "
//        strBuffer.setLength(4);
//        System.out.println(strBuffer.toString()); //"hell"

////        Замена в строке
////        Для замены подстроки между определенными позициями в StringBuffer на другую подстроку применяется метод replace()
//        StringBuffer strBuffer = new StringBuffer("hello world!");
//        strBuffer.replace(6,11,"java");
//        System.out.println(strBuffer.toString()); //hello java!

////        Обратный порядок в строке
////        reverse() меняет порядок в StringBuffer на обратный
//        StringBuffer strBuffer = new StringBuffer("assembler");
//        strBuffer.reverse();
//        System.out.println(strBuffer.toString()); //relbmessa

    }
}
