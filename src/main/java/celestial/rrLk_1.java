/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLk_1 {
    private static boolean[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_protected;
    private static double[] id_throws;

    private static void id_byte() {
        id_protected = new short[5];
    }

    public rrLk_1() {
        this.id_throws();
    }

    static {
        rrLk_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -8, 51, -13, -57, -105, 100, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x54CA00ACA9E778D3L;
    }

    public double id_class() {
        return (Double)this.id_class[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7AF32EA1;
    }

    public void id_class(double d) {
        Double d2 = d;
        this.id_class[rrLk_1.id_protected[4]] = d2;
    }

    public static rrLk_1 id_break(double d) {
        Double d2 = d;
        ((rrLk_1)rrLk_1.id_break[rrLk_1.id_protected[0]]).id_class[rrLk_1.id_protected[1]] = d2;
        return (rrLk_1)id_break[id_protected[2]];
    }

    private static void id_break() {
        id_throws = new double[1];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
            objectArray[rrLk_1.id_byte[2]] = id_throws[0];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLk_1.id_protected();
        rrLk_1.id_byte();
        rrLk_1.id_break();
        rrLk_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrLk_1()};
        id_break = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }
}

