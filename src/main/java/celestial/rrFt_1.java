/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFt_1
extends Om_1 {
    private static byte[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static double[] id_case;

    public rrFt_1() {
        this.id_throws();
    }

    static {
        rrFt_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-22, -99, 3, -78, -61, 19, -107, 52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(double d) {
        this.id_throws();
        Double d2 = d;
        this.id_class[rrFt_1.id_throws[8]] = d2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAC851AD9;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B8718E47FD31BDAL;
    }

    public double id_class() {
        this.id_throws();
        return (Double)this.id_class[id_throws[6]];
    }

    public static rrFt_1 id_class(double d, boolean bl) {
        Double d2 = d;
        ((rrFt_1)rrFt_1.id_break[rrFt_1.id_throws[0]]).id_class[rrFt_1.id_throws[1]] = d2;
        Boolean bl2 = bl;
        ((rrFt_1)rrFt_1.id_break[rrFt_1.id_throws[2]]).id_class[rrFt_1.id_throws[3]] = bl2;
        ((rrFt_1)id_break[id_throws[4]]).id_class(id_protected[0]);
        return (rrFt_1)id_break[id_throws[5]];
    }

    public void id_break(boolean bl) {
        this.id_throws();
        Boolean bl2 = bl;
        this.id_class[rrFt_1.id_throws[9]] = bl2;
    }

    public boolean id_break() {
        this.id_throws();
        return (Boolean)this.id_class[id_throws[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrFt_1.id_protected[2]] = id_case[0];
            objectArray[rrFt_1.id_protected[3]] = id_protected[4];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFt_1.id_protected();
        rrFt_1.id_case();
        rrFt_1.id_implements();
        rrFt_1.id_catch();
        rrFt_1.id_private();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static void id_implements() {
        id_case = new double[1];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrFt_1()};
        id_break = objectArray;
    }
}

