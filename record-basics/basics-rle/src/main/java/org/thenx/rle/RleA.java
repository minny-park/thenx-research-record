package org.thenx.rle;

public class RleA {

    public static void main(String[] args) {
        String source = "212611417117726053643435767636171750066066071013";
        String s = rleCompress(source);
        System.out.println("---> rle compression: " + s);
    }

    public static String rleCompress(String source) {
        if (source.length() <= 1) {
            return source;
        }

        int runLength = 1;
        while (runLength < source.length() && source.charAt(0) == source.charAt(runLength)) {
            runLength++;
        }

        return runLength + source.substring(0, 1) + rleCompress(source.substring(runLength));
    }
}
