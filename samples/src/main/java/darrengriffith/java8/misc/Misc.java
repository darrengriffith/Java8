/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.misc;

import java.util.Base64;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 *
 * @author darrengriffith
 */
public class Misc {

    public static void main(String[] args) {

        System.out.println("\n--- Misc ---\n");

        //
        // Joining Strings
        //
        System.out.println("\n~~ Joining Strings ~~");

        String stooges = String.join(",", "Larry", "Curly", "Moe");
        System.out.println(stooges);

        String[] states = {"CA", "FL", "NY", "GA", "NM", "AL"};
        String statesList = String.join(",", states);
        System.out.println(statesList);

        StringJoiner sj = new StringJoiner(",", "{", "}");
        sj.setEmptyValue("{}");
        System.out.println(sj);

        Stream<String> stateStream = Stream.of(states);
        stateStream.forEach(s -> sj.add(s));
        System.out.println(sj);

        //
        // Base64
        //
        System.out.println("\n~~ Base64 Encoding and Decoding ~~");

        byte[] bytes = new byte[100];
        for (int i = 0; i < 100; i++) {
            bytes[i] = (byte) i;
        }

        Base64.Encoder b64encoder = Base64.getEncoder();
        String b64str = b64encoder.encodeToString(bytes);

        System.out.println(b64str);

        Base64.Decoder b64decoder = Base64.getDecoder();
        byte[] decodedBytes = b64decoder.decode(b64str);
        for (int j = 0; j < decodedBytes.length; j++) {
            System.out.print(decodedBytes[j] + " ");
        }
        System.out.println();

        //
        // URL Encoder
        //
        System.out.println("\n~~ URL Encoding and Decoding ~~");

        String urlStr = "http://server.location/include invalid chars/like?%$\"quot\"";
        
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        String urlEncoded = urlEncoder.encodeToString(urlStr.getBytes());
        System.out.println(urlEncoded);
        
        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] urlBytes = urlDecoder.decode(urlEncoded);
        System.out.println(new String(urlBytes));
    }
}
