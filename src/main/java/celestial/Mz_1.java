/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCZ;
import celestial.rVL;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mz_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_throws;
    private static String[] id_case;

    public xc_3 id_byte() {
        if ((xc_3)this.id_break[id_protected[2]] == null) {
            xd_3 xd_32 = rVL.id_strictfp.id_class((rqO_2)this.id_break[id_protected[3]]);
            xc_3 xc_32 = xd_32.id_continue();
            this.id_break[Mz_1.id_protected[4]] = xc_32;
            ((Map)this.id_break[id_protected[5]]).keySet().stream().sorted(String::compareTo).forEachOrdered(string -> {
                rCZ<?> rCZ2 = xd_32.id_new().id_class((String)string);
                if (rCZ2 != null) {
                    xc_3 xc_32 = Mz_1.id_class((xc_3)this.id_break[id_protected[8]], rCZ2, (String)((Map)this.id_break[id_protected[9]]).get(string));
                    this.id_break[Mz_1.id_protected[10]] = xc_32;
                }
            });
        }
        return (xc_3)this.id_break[id_protected[6]];
    }

    private Mz_1(rqO_2 rqO_22, Map<String, String> map) {
        Map<String, String> map2;
        this.id_throws();
        rqO_2 rqO_23 = rqO_22;
        this.id_break[Mz_1.id_protected[0]] = rqO_23;
        this.id_break[Mz_1.id_protected[1]] = map2 = map;
    }

    static {
        Mz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x273AF3698F9ECC3AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, 51, 31, 17, -52, -21, 110, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE24CE293;
    }

    private static void id_class() {
        id_case = new String[]{new String("location"), new String("properties"), new String(","), new String("="), new String("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?")};
    }

    private static <T extends Comparable<T>> xc_3 id_class(xc_3 xc_32, rCZ<T> rCZ2, String string) {
        Optional<T> optional = rCZ2.id_break(string);
        if (optional.isPresent()) {
            return (xc_3)xc_32.id_class(rCZ2, (Comparable)optional.get());
        }
        throw new IllegalArgumentException("Invalid value for property " + rCZ2);
    }

    private static void id_break() {
        id_byte = new byte[]{3};
    }

    public static Mz_1 id_break(String string) {
        Matcher matcher = ((Pattern)id_class[id_protected[7]]).matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        try {
            String string2 = matcher.group(id_case[0]);
            String string3 = matcher.group(id_case[1]);
            rqO_2 rqO_22 = new rqO_2(string2);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (string3 != null) {
                String[] stringArray = string3.split(id_case[2]);
                int n = stringArray.length;
                for (int i = id_throws[0]; i < n; ++i) {
                    String string4 = stringArray[i];
                    String[] stringArray2 = string4.split(id_case[3]);
                    hashMap.put(stringArray2[id_throws[1]], stringArray2[id_throws[2]]);
                }
            }
            return new Mz_1(rqO_22, hashMap);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Mz_1.id_catch();
        Mz_1.id_class();
        Mz_1.id_protected();
        Mz_1.id_break();
        Mz_1.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{Pattern.compile(id_case[4], 0)};
        id_class = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_protected = sArray;
    }
}

