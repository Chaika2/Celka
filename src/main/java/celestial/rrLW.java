/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLW {
    private static short[] id_byte;
    private static double[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_protected = new double[1];
    }

    public rrLW() {
        this.id_protected();
    }

    static {
        rrLW.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{114, -86, 5, -23, -95, -3, -95, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_class() {
        return (Double)this.id_class[id_byte[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFEBCC3F0;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1DB9F674A65C2B14L;
    }

    public static rrLW id_class(double d) {
        Double d2 = d;
        ((rrLW)rrLW.id_break[rrLW.id_byte[0]]).id_class[rrLW.id_byte[1]] = d2;
        return (rrLW)id_break[id_byte[2]];
    }

    public void id_break(double d) {
        Double d2 = d;
        this.id_class[rrLW.id_byte[4]] = d2;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_throws = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLW()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLW.id_break();
        rrLW.id_case();
        rrLW.id_byte();
        rrLW.id_throws();
    }

    private static void id_case() {
        id_byte = new short[5];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[1]];
            objectArray[rrLW.id_throws[2]] = id_protected[0];
        }
    }
}

