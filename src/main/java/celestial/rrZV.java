/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZV {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static long[] id_throws;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrZV.id_byte[0]] = id_byte[1];
            objectArray[rrZV.id_byte[2]] = id_throws[1];
            objectArray[rrZV.id_break[1]] = id_throws[2];
            objectArray[rrZV.id_break[2]] = id_byte[3];
        }
    }

    public rrZV() {
        HashMap hashMap;
        this.id_byte();
        Long l = id_throws[0];
        this.id_class[rrZV.id_protected[0]] = l;
        this.id_class[rrZV.id_protected[1]] = hashMap = new HashMap();
    }

    static {
        rrZV.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDB8066D0AF53E9BCL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, -7, 46, -62, 0, 3, -30, 79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9C899A73;
    }

    private static void id_class() {
        id_break = new byte[]{6, 2, 5};
    }

    private static void id_break() {
        id_protected = new short[]{2, 3};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZV.id_throws();
        rrZV.id_protected();
        rrZV.id_break();
        rrZV.id_class();
    }

    private static void id_protected() {
        long[] lArray = new long[3];
        lArray[0] = Long.MAX_VALUE;
        id_throws = lArray;
    }
}

