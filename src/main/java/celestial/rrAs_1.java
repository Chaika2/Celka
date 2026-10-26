/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLY;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAs_1 {
    public Object[] id_class;
    private static byte[] id_byte;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static double[] id_case;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[8] = 1;
        id_throws = sArray;
    }

    public rrAs_1() {
        this.id_catch();
    }

    static {
        rrAs_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x654AC07857FC6EADL;
    }

    public static rrAs_1 id_class(rLY rLY2, double d) {
        rLY rLY3 = rLY2;
        ((rrAs_1)rrAs_1.id_break[rrAs_1.id_throws[0]]).id_class[rrAs_1.id_throws[1]] = rLY3;
        Double d2 = d;
        ((rrAs_1)rrAs_1.id_break[rrAs_1.id_throws[2]]).id_class[rrAs_1.id_throws[3]] = d2;
        return (rrAs_1)id_break[id_throws[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{102, -35, -26, -116, 97, -43, 49, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rLY rLY2) {
        rLY rLY3 = rLY2;
        this.id_class[rrAs_1.id_throws[7]] = rLY3;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D3EE18E;
    }

    public void id_class(double d) {
        Double d2 = d;
        this.id_class[rrAs_1.id_throws[8]] = d2;
    }

    public rLY id_class() {
        return (rLY)this.id_class[id_throws[5]];
    }

    public double id_break() {
        return (Double)this.id_class[id_throws[6]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrAs_1.id_protected();
        rrAs_1.id_byte();
        rrAs_1.id_case();
        rrAs_1.id_throws();
        rrAs_1.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrAs_1.id_protected[1]] = id_case[0];
        }
    }

    private static void id_case() {
        id_case = new double[1];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAs_1()};
        id_break = objectArray;
    }
}

