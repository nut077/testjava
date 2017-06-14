package com.nut.test.io;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("testio.txt");
        try {
            //FileOutputStream out = new FileOutputStream(file);
            //out.write("Hello".getBytes());
            //out.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            System.out.println(fileContent);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("obj.ser")))) {
            objectOutputStream.writeObject(new SimpleObject("these are some random contents", 1, 2, 3));
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("obj.ser")))) {
                SimpleObject data = (SimpleObject) objectInputStream.readObject();
                System.out.println(data.getContent() + " " + data.getX() + " " + data.getY() + " " + data.getZ());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            testThrow();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void testThrow() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("aaaaa")));
    }


}
