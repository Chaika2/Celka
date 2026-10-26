/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rrNb_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZH {
    public Object[] id_class;
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;

    public void id_byte(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrZH.id_throws[27]] = f2;
    }

    public boolean id_byte() {
        return ((Float)this.id_class[id_throws[24]]).floatValue() < id_byte[4] ? id_break[2] : id_break[3];
    }

    public rrZH(float f) {
        this.id_native();
        rrNb_1 rrNb_12 = new rrNb_1(f);
        this.id_class[rrZH.id_throws[0]] = rrNb_12;
    }

    static {
        rrZH.ntfClinit();
    }

    public void id_class(float f, float f2) {
        Float f3 = Float.valueOf(f);
        this.id_class[rrZH.id_throws[3]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZH.id_throws[4]] = f4;
        Float f5 = Float.valueOf(rfU_2.id_class(((Float)this.id_class[id_throws[5]]).floatValue(), Math.min(id_byte[0], -((Float)this.id_class[id_throws[6]]).floatValue() + ((Float)this.id_class[id_throws[7]]).floatValue()), id_byte[1]));
        this.id_class[rrZH.id_throws[8]] = f5;
        ((rrNb_1)this.id_class[id_throws[9]]).id_protected();
        ((rrNb_1)this.id_class[id_throws[10]]).id_class((double)((Float)this.id_class[id_throws[11]]).floatValue());
        Float f6 = Float.valueOf((float)((rrNb_1)this.id_class[id_throws[12]]).id_byte());
        this.id_class[rrZH.id_throws[13]] = f6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, 94, -8, -46, -91, -106, -21, 63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x58089F7A1CCB5924L;
    }

    public boolean id_class() {
        return ((Float)this.id_class[id_throws[21]]).floatValue() > -((Float)this.id_class[id_throws[22]]).floatValue() + ((Float)this.id_class[id_throws[23]]).floatValue() + id_byte[3] ? id_break[0] : id_break[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3510F42;
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrZH.id_throws[16]] = f2;
        Float f3 = Float.valueOf(f);
        this.id_class[rrZH.id_throws[17]] = f3;
        ((rrNb_1)this.id_class[id_throws[18]]).id_class(f);
    }

    public boolean id_class(boolean bl, double d, double d2) {
        if (bl) {
            rrZH rrZH2 = this;
            Float f = Float.valueOf(((Float)rrZH2.id_class[id_throws[1]]).floatValue() + (float)(d * d2));
            rrZH2.id_class[rrZH.id_throws[2]] = f;
        }
        return bl;
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrZH.id_throws[29]] = f2;
    }

    public float id_break() {
        return ((Float)this.id_class[id_throws[26]]).floatValue();
    }

    public float id_throws() {
        return -((Float)this.id_class[id_throws[19]]).floatValue() + ((Float)this.id_class[id_throws[20]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrZH.id_implements();
        rrZH.id_private();
        rrZH.id_finally();
        rrZH.id_extends();
    }

    private static void id_finally() {
        float[] fArray = new float[9];
        fArray[3] = 1.0f;
        id_byte = fArray;
    }

    public rrNb_1 id_catch() {
        return (rrNb_1)this.id_class[id_throws[25]];
    }

    private static void id_extends() {
        id_protected = new byte[]{5, 2, 3, 4};
    }

    public float id_case() {
        return ((Float)this.id_class[id_throws[28]]).floatValue();
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    public void id_protected() {
        ((rrNb_1)this.id_class[id_throws[14]]).id_case();
        Float f = Float.valueOf(id_byte[2]);
        this.id_class[rrZH.id_throws[15]] = f;
    }

    private static void id_private() {
        short[] sArray = new short[30];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 1;
        sArray[11] = 1;
        sArray[13] = 2;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[19] = 3;
        sArray[20] = 4;
        sArray[21] = 2;
        sArray[22] = 3;
        sArray[23] = 4;
        sArray[24] = 2;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[28] = 2;
        sArray[29] = 2;
        id_throws = sArray;
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrZH.id_break[4]] = Float.valueOf(id_byte[5]);
            objectArray[rrZH.id_protected[1]] = Float.valueOf(id_byte[6]);
            objectArray[rrZH.id_protected[2]] = Float.valueOf(id_byte[7]);
            objectArray[rrZH.id_protected[3]] = Float.valueOf(id_byte[8]);
        }
    }
}

