/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.roE_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ba_3 {
    private static double[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_break = new double[4];
    }

    public ba_3(roE_2 roE_22) {
        this.id_break();
        Double d = roE_22.id_throws();
        this.id_class[ba_3.id_protected[0]] = d;
        Double d2 = roE_22.id_catch();
        this.id_class[ba_3.id_protected[1]] = d2;
        Double d3 = roE_22.id_case();
        this.id_class[ba_3.id_protected[2]] = d3;
        Double d4 = roE_22.id_private();
        this.id_class[ba_3.id_protected[3]] = d4;
    }

    static {
        ba_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x788D77CF;
    }

    public boolean id_class(int n, int n2) {
        return (double)n > (Double)this.id_class[id_protected[8]] && (double)(n + id_throws[4]) < (Double)this.id_class[id_protected[9]] && (double)n2 > (Double)this.id_class[id_protected[10]] && (double)(n2 + id_throws[5]) < (Double)this.id_class[id_protected[11]] ? id_throws[6] : id_throws[7];
    }

    private static void id_class() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 3;
        id_protected = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB85E15032E60E49L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{64, 21, -101, -6, -29, -117, -113, 31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_break(int n, int n2) {
        return (double)(n + id_throws[0]) > (Double)this.id_class[id_protected[4]] && (double)n < (Double)this.id_class[id_protected[5]] && (double)(n2 + id_throws[1]) > (Double)this.id_class[id_protected[6]] && (double)n2 < (Double)this.id_class[id_protected[7]] ? id_throws[2] : id_throws[3];
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[ba_3.id_throws[8]] = id_break[0];
            objectArray[ba_3.id_throws[9]] = id_break[1];
            objectArray[ba_3.id_byte[1]] = id_break[2];
            objectArray[ba_3.id_byte[2]] = id_break[3];
        }
    }

    private static void id_throws() {
        id_byte = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        ba_3.id_protected();
        ba_3.id_class();
        ba_3.id_byte();
        ba_3.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_throws = blArray;
    }
}

