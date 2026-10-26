/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.iB_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLJ
extends Om_1 {
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static double[] id_throws;
    private static short[] id_case;
    public static Object[] id_break;

    public void id_byte(double d) {
        this.id_private();
        Double d2 = d;
        this.id_class[rrLJ.id_case[16]] = d2;
    }

    public rrLJ() {
        this.id_private();
    }

    static {
        rrLJ.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, -44, 119, -124, 52, 69, -100, 21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrLJ id_class(iB_2 iB_22, double d, double d2, double d3) {
        iB_2 iB_23 = iB_22;
        ((rrLJ)rrLJ.id_break[rrLJ.id_case[0]]).id_class[rrLJ.id_case[1]] = iB_23;
        Double d4 = d;
        ((rrLJ)rrLJ.id_break[rrLJ.id_case[2]]).id_class[rrLJ.id_case[3]] = d4;
        Double d5 = d2;
        ((rrLJ)rrLJ.id_break[rrLJ.id_case[4]]).id_class[rrLJ.id_case[5]] = d5;
        Double d6 = d3;
        ((rrLJ)rrLJ.id_break[rrLJ.id_case[6]]).id_class[rrLJ.id_case[7]] = d6;
        ((rrLJ)id_break[id_case[8]]).id_class(id_byte[0]);
        return (rrLJ)id_break[id_case[9]];
    }

    public iB_2 id_class() {
        this.id_private();
        return (iB_2)this.id_class[id_case[10]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4591B11887196776L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC22DD621;
    }

    public void id_class(double d) {
        this.id_private();
        Double d2 = d;
        this.id_class[rrLJ.id_case[15]] = d2;
    }

    public void id_break(double d) {
        this.id_private();
        Double d2 = d;
        this.id_class[rrLJ.id_case[14]] = d2;
    }

    public double id_break() {
        this.id_private();
        return (Double)this.id_class[id_case[12]];
    }

    public double id_throws() {
        this.id_private();
        return (Double)this.id_class[id_case[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLJ.id_extends();
        rrLJ.id_implements();
        rrLJ.id_case();
        rrLJ.id_finally();
        rrLJ.id_catch();
    }

    private static void id_finally() {
        id_protected = new byte[]{4, 2, 3};
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLJ()};
        id_break = objectArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_throws = new double[3];
    }

    private static void id_implements() {
        short[] sArray = new short[17];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 3;
        id_case = sArray;
    }

    public double id_protected() {
        this.id_private();
        return (Double)this.id_class[id_case[11]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrLJ.id_byte[2]] = id_throws[0];
            objectArray[rrLJ.id_protected[1]] = id_throws[1];
            objectArray[rrLJ.id_protected[2]] = id_throws[2];
        }
    }
}

