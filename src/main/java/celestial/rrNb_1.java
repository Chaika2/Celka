/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rrQK;
import celestial.rrQo_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNb_1 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static double[] id_protected;
    private static byte[] id_throws;

    public double id_byte() {
        return (Double)this.id_class[id_byte[16]];
    }

    public rrNb_1(rrQK rrQK2, double d) {
        this.id_private();
        rrQK rrQK3 = (rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_byte[0]]);
        this.id_class[rrNb_1.id_byte[1]] = rrQK3;
        rrQK rrQK4 = rrQK2;
        this.id_class[rrNb_1.id_byte[2]] = rrQK4;
        Double d2 = d;
        this.id_class[rrNb_1.id_byte[3]] = d2;
    }

    public rrNb_1(double d) {
        this.id_private();
        rrQK rrQK2 = (rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_byte[4]]);
        this.id_class[rrNb_1.id_byte[5]] = rrQK2;
        Double d2 = d;
        this.id_class[rrNb_1.id_byte[6]] = d2;
    }

    static {
        rrNb_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1DAED560;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6DE8FBF4D5396E82L;
    }

    public void id_class(double d) {
        if ((Double)this.id_class[id_byte[17]] == d) {
            return;
        }
        Double d2 = d;
        this.id_class[rrNb_1.id_byte[18]] = d2;
        Double d3 = (double)((Double)this.id_class[id_byte[19]]);
        this.id_class[rrNb_1.id_byte[20]] = d3;
        Double d4 = id_protected[3];
        this.id_class[rrNb_1.id_byte[21]] = d4;
        Double d5 = (Double)this.id_class[id_byte[22]] - (Double)this.id_class[id_byte[23]];
        this.id_class[rrNb_1.id_byte[24]] = d5;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, 104, 57, -61, 24, -81, 32, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(float f) {
        Double d = f;
        this.id_class[rrNb_1.id_byte[34]] = d;
        Double d2 = f;
        this.id_class[rrNb_1.id_byte[35]] = d2;
        Double d3 = f;
        this.id_class[rrNb_1.id_byte[36]] = d3;
        Double d4 = id_protected[11];
        this.id_class[rrNb_1.id_byte[37]] = d4;
        Double d5 = id_protected[12];
        this.id_class[rrNb_1.id_byte[38]] = d5;
    }

    public void id_class(rrQK rrQK2) {
        rrQK rrQK3 = rrQK2;
        this.id_class[rrNb_1.id_byte[40]] = rrQK3;
    }

    public double id_class() {
        return (Double)this.id_class[id_byte[31]];
    }

    public void id_break(double d) {
        Double d2 = d;
        this.id_class[rrNb_1.id_byte[39]] = d2;
    }

    public void id_break() {
        Double d = id_protected[10];
        this.id_class[rrNb_1.id_byte[33]] = d;
    }

    public void id_break(float f) {
        Double d = f;
        this.id_class[rrNb_1.id_byte[25]] = d;
    }

    public boolean id_throws() {
        return (Double)this.id_class[id_byte[32]] > id_protected[9] ? id_break[0] : id_break[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNb_1.id_extends();
        rrNb_1.id_catch();
        rrNb_1.id_implements();
        rrNb_1.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{7, 2, 3, 4, 5};
    }

    private static void id_catch() {
        short[] sArray = new short[41];
        sArray[1] = 6;
        sArray[2] = 6;
        sArray[5] = 6;
        sArray[8] = 4;
        sArray[10] = 4;
        sArray[11] = 1;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 4;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 2;
        sArray[18] = 2;
        sArray[19] = 3;
        sArray[20] = 1;
        sArray[21] = 4;
        sArray[22] = 2;
        sArray[23] = 1;
        sArray[24] = 5;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 3;
        sArray[29] = 4;
        sArray[30] = 5;
        sArray[32] = 3;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 1;
        sArray[36] = 2;
        sArray[37] = 4;
        sArray[38] = 5;
        sArray[39] = 3;
        sArray[40] = 6;
        id_byte = sArray;
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    public void id_case() {
        Double d = id_protected[4];
        this.id_class[rrNb_1.id_byte[26]] = d;
        Double d2 = id_protected[5];
        this.id_class[rrNb_1.id_byte[27]] = d2;
        Double d3 = id_protected[6];
        this.id_class[rrNb_1.id_byte[28]] = d3;
        Double d4 = id_protected[7];
        this.id_class[rrNb_1.id_byte[29]] = d4;
        Double d5 = id_protected[8];
        this.id_class[rrNb_1.id_byte[30]] = d5;
    }

    private static void id_implements() {
        double[] dArray = new double[19];
        dArray[0] = 0.01;
        dArray[2] = 1.0;
        dArray[10] = 1.0;
        dArray[11] = 1.0;
        id_protected = dArray;
    }

    public void id_protected() {
        double d = (Double)rrQo_1.id_class[id_byte[7]] * id_protected[0];
        Double d2 = rfU_2.id_class((Double)this.id_class[id_byte[8]] + (Double)this.id_class[id_byte[9]] * d, id_protected[1], id_protected[2]);
        this.id_class[rrNb_1.id_byte[10]] = d2;
        Double d3 = (Double)this.id_class[id_byte[11]] + (Double)this.id_class[id_byte[12]] * ((rrQK)((Object)this.id_class[id_byte[13]])).id_class((Double)this.id_class[id_byte[14]]);
        this.id_class[rrNb_1.id_byte[15]] = d3;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrNb_1.id_break[2]] = id_protected[13];
            objectArray[rrNb_1.id_break[3]] = id_protected[14];
            objectArray[rrNb_1.id_throws[1]] = id_protected[15];
            objectArray[rrNb_1.id_throws[2]] = id_protected[16];
            objectArray[rrNb_1.id_throws[3]] = id_protected[17];
            objectArray[rrNb_1.id_throws[4]] = id_protected[18];
        }
    }
}

