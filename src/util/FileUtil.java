package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Driver;
import model.Truck;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

    private FileUtil() {
    }

    public static <T> T[] loadJsonArray(String path, Class<T[]> cls) {
        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        Path PATH = Paths.get(path);
        try {
            String str = Files.readString(PATH);
            return GSON.fromJson(str, cls);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static Truck[] getTrucks() {
        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        Path PATH = Paths.get("data/trucks.json");
        try {
            String str = Files.readString(PATH);
            return GSON.fromJson(str, Truck[].class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return new Truck[0];
        }
    }

    public static Driver[] getDrivers() {
        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        Path PATH = Paths.get("data/drivers.json");
        try {
            String str = Files.readString(PATH);
            return GSON.fromJson(str, Driver[].class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return new Driver[0];
        }
    }

/*    public static void writeFile(Truck[] trucks) {
        String json = GSON.toJson(trucks);

        byte[] bytes = json.getBytes();
        try {
            Files.write(PATH, bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }*/
}
