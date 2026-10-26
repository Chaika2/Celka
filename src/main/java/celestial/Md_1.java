/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.Validate;

public class Md_1 {
    public Object[] id_class;
    private static long[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[0] = 3;
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[5] = 3;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 2;
        sArray[12] = 2;
        sArray[13] = 3;
        id_protected = sArray;
    }

    public Md_1(int n, long l, @Nullable long[] lArray) {
        this.id_protected();
        Validate.inclusiveBetween((long)id_break[0], (long)id_break[1], (long)n);
        Long l2 = l;
        this.id_class[Md_1.id_protected[0]] = l2;
        Integer n2 = n;
        this.id_class[Md_1.id_protected[1]] = n2;
        Long l3 = (id_break[2] << n) - id_break[3];
        this.id_class[Md_1.id_protected[2]] = l3;
        if (lArray != null) {
            long[] lArray2 = lArray;
            this.id_class[Md_1.id_protected[3]] = lArray2;
        } else {
            long[] lArray3 = new long[(int)(Md_1.id_class(l * (long)n, id_break[4]) / id_break[5])];
            this.id_class[Md_1.id_protected[4]] = lArray3;
        }
    }

    static {
        Md_1.ntfClinit();
    }

    public long id_class() {
        return (Long)this.id_class[id_protected[13]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 88, -21, -32, -105, -102, 11, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1524E1B;
    }

    public int id_class(long l) {
        Validate.inclusiveBetween((long)id_break[11], (long)((Long)this.id_class[id_protected[5]] - id_break[12]), (long)l);
        long l2 = l * (long)((Integer)this.id_class[id_protected[6]]).intValue();
        int n = (int)(l2 >> id_byte[1]);
        int n2 = (int)((l + id_break[13]) * (long)((Integer)this.id_class[id_protected[7]]).intValue() - id_break[14] >> id_byte[2]);
        int n3 = (int)(l2 & id_break[15]);
        if (n == n2) {
            return (int)(((long[])this.id_class[id_protected[8]])[n] >>> n3 & (Long)this.id_class[id_protected[9]]);
        }
        int n4 = id_byte[3] - n3;
        return (int)((((long[])this.id_class[id_protected[10]])[n] >>> n3 | ((long[])this.id_class[id_protected[11]])[n2] << n4) & (Long)this.id_class[id_protected[12]]);
    }

    public static long id_class(long l, long l2) {
        long l3;
        byte by = id_throws[0];
        if (l2 == id_break[6]) {
            return id_break[7];
        }
        if (l == id_break[8]) {
            return l2;
        }
        if (l < id_break[9]) {
            by = id_byte[0];
        }
        return (l3 = l % (l2 * (long)by)) == id_break[10] ? l : l + l2 * (long)by - l3;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_throws = blArray;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6074D622E13618CDL;
    }

    private static void id_throws() {
        id_byte = new byte[]{-1, 6, 6, 64, 4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        Md_1.id_break();
        Md_1.id_case();
        Md_1.id_byte();
        Md_1.id_throws();
    }

    private static void id_case() {
        long[] lArray = new long[18];
        lArray[0] = 1L;
        lArray[1] = 32L;
        lArray[2] = 1L;
        lArray[3] = 1L;
        lArray[4] = 64L;
        lArray[5] = 64L;
        lArray[12] = 1L;
        lArray[13] = 1L;
        lArray[14] = 1L;
        lArray[15] = 63L;
        id_break = lArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
            objectArray[Md_1.id_throws[1]] = id_throws[2];
            objectArray[Md_1.id_byte[5]] = id_break[16];
            objectArray[Md_1.id_byte[6]] = id_break[17];
        }
    }
}

