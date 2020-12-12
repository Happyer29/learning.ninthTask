package ru.vsu.cs.yagodintsevNikitaAndreevich;

import ru.vsu.cs.util.ArrayUtils;

import java.io.FileNotFoundException;

public class console {
    public static void main(String[] args) throws FileNotFoundException {
        int[] input1 = ArrayUtils.readIntArrayFromFile(args[0]);
        int[] input2 = ArrayUtils.readIntArrayFromFile(args[1]);
        String outFile = args[2];
        int[] res = Task.Process(input1, input2);
        ArrayUtils.writeArrayToFile(outFile, res);

    }
}
