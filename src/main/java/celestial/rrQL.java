/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.QY;
import celestial.rqO_2;
import celestial.rrQF;
import celestial.rrQV;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrQL
implements rrQF {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2, -1, -1, 2, 16, 16};
    }

    public rrQL(String string) {
        this.id_case();
        String string2 = string;
        this.id_class[rrQL.id_byte[0]] = string2;
    }

    static {
        rrQL.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCCCB9AFA8C327A34L;
    }

    public String id_class(String string, String string2) {
        if (Character.isUpperCase(string.charAt(id_protected[2]))) {
            return string + string2;
        }
        if (Character.isUpperCase(string2.charAt(id_protected[3]))) {
            return string2 + string;
        }
        if (string.length() < string2.length()) {
            return string2 + string;
        }
        return string + string2;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public Pair<String, String> id_class(Random random) {
        try (InputStream inputStream = QY.id_instanceof().F().id_class(new rqO_2("celestial/" + (String)this.id_class[id_byte[1]])).id_break();){
            Pair pair;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));){
                String string;
                String string2;
                ArrayList<String> arrayList = new ArrayList<String>();
                while ((string2 = bufferedReader.readLine()) != null) {
                    arrayList.add(string2.trim());
                }
                String string3 = (String)arrayList.get(random.nextInt(arrayList.size()));
                while (string3.equals(string = (String)arrayList.get(random.nextInt(arrayList.size())))) {
                }
                pair = Pair.of((Object)string3, (Object)string);
            }
            return pair;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    @Override
    public CompletableFuture<String> id_class() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Pair<String, String> pair = this.id_class(threadLocalRandom);
        if (pair == null) {
            return CompletableFuture.completedFuture(null);
        }
        CompletableFuture<String> completableFuture = rrQV.id_byte((String)pair.getLeft());
        CompletableFuture<String> completableFuture2 = rrQV.id_byte((String)pair.getRight());
        CompletableFuture[] completableFutureArray = new CompletableFuture[id_break[0]];
        completableFutureArray[rrQL.id_protected[0]] = completableFuture;
        completableFutureArray[rrQL.id_protected[1]] = completableFuture2;
        return CompletableFuture.allOf(completableFutureArray).thenApplyAsync(void_ -> {
            String string;
            String string2 = (String)completableFuture.join();
            String string3 = (String)completableFuture2.join();
            String string4 = this.id_class(string2, threadLocalRandom);
            String string5 = this.id_class(string4, string = this.id_class(string3, threadLocalRandom));
            if (string5.length() > id_break[4]) {
                string5 = string5.substring(id_protected[6], id_break[5]);
            }
            return string5;
        });
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA94EF651;
    }

    public void id_class(String string) {
        String string2 = string;
        this.id_class[rrQL.id_byte[3]] = string2;
    }

    public String id_class(String string, Random random) {
        int n = string.length();
        int n2 = id_break[1];
        for (int i = id_protected[4]; i < n; ++i) {
            if (!Character.isUpperCase(string.charAt(i))) continue;
            n2 = i;
            break;
        }
        if (n2 == id_break[2]) {
            n2 = n / id_break[3];
        }
        String string2 = string.substring(id_protected[5], n2);
        String string3 = string.substring(n2);
        return random.nextBoolean() ? string2 : string3;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{38, 93, 80, 47, -32, 99, -22, 110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        return (String)this.id_class[id_byte[2]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQL.id_throws();
        rrQL.id_protected();
        rrQL.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[7]];
        }
    }

    private static void id_protected() {
        id_byte = new short[4];
    }
}

