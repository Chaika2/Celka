/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrub_1 {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static float[] id_throws;

    public void id_byte(rrub_1 rrub_12) {
        Float f = Float.valueOf(((Float)rrub_12.id_class[id_byte[6]]).floatValue());
        this.id_class[rrub_1.id_byte[7]] = f;
        Float f2 = Float.valueOf(((Float)rrub_12.id_class[id_byte[8]]).floatValue());
        this.id_class[rrub_1.id_byte[9]] = f2;
        Float f3 = Float.valueOf(((Float)rrub_12.id_class[id_byte[10]]).floatValue());
        this.id_class[rrub_1.id_byte[11]] = f3;
    }

    public rrub_1 id_byte() {
        return new rrub_1(((Float)this.id_class[id_byte[3]]).floatValue(), ((Float)this.id_class[id_byte[4]]).floatValue(), ((Float)this.id_class[id_byte[5]]).floatValue());
    }

    public rrub_1 id_byte(float f) {
        rrub_1 rrub_12 = this;
        Float f2 = Float.valueOf(((Float)rrub_12.id_class[id_byte[30]]).floatValue() / f);
        rrub_12.id_class[rrub_1.id_byte[31]] = f2;
        rrub_1 rrub_13 = this;
        Float f3 = Float.valueOf(((Float)rrub_13.id_class[id_byte[32]]).floatValue() / f);
        rrub_13.id_class[rrub_1.id_byte[33]] = f3;
        rrub_1 rrub_14 = this;
        Float f4 = Float.valueOf(((Float)rrub_14.id_class[id_byte[34]]).floatValue() / f);
        rrub_14.id_class[rrub_1.id_byte[35]] = f4;
        return this;
    }

    public rrub_1(float f, float f2, float f3) {
        this.id_case();
        Float f4 = Float.valueOf(f);
        this.id_class[rrub_1.id_byte[0]] = f4;
        Float f5 = Float.valueOf(f2);
        this.id_class[rrub_1.id_byte[1]] = f5;
        Float f6 = Float.valueOf(f3);
        this.id_class[rrub_1.id_byte[2]] = f6;
    }

    static {
        rrub_1.ntfClinit();
    }

    public String toString() {
        return "Vector2 [x=" + ((Float)this.id_class[id_byte[61]]).floatValue() + ", y=" + ((Float)this.id_class[id_byte[62]]).floatValue() + "]";
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_byte();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, 46, -94, 127, -23, 43, 50, -70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9AA38B29;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5472D0A3DE0C1D7EL;
    }

    public float id_class() {
        return ((Float)this.id_class[id_byte[63]]).floatValue() * ((Float)this.id_class[id_byte[64]]).floatValue() + ((Float)this.id_class[id_byte[65]]).floatValue() * ((Float)this.id_class[id_byte[66]]).floatValue() + ((Float)this.id_class[id_byte[67]]).floatValue() * ((Float)this.id_class[id_byte[68]]).floatValue();
    }

    public rrub_1 id_class(float f) {
        float f2 = ((Float)this.id_class[id_byte[57]]).floatValue();
        float f3 = ((Float)this.id_class[id_byte[58]]).floatValue();
        f = (float)Math.toRadians(f);
        Float f4 = Float.valueOf(rfU_2.id_break(f) * f2 - rfU_2.id_class(f) * f3);
        this.id_class[rrub_1.id_byte[59]] = f4;
        Float f5 = Float.valueOf(rfU_2.id_class(f) * f2 + rfU_2.id_break(f) * f3);
        this.id_class[rrub_1.id_byte[60]] = f5;
        return this;
    }

    public rrub_1 id_class(rrub_1 rrub_12) {
        rrub_1 rrub_13 = this;
        Float f = Float.valueOf(((Float)rrub_13.id_class[id_byte[12]]).floatValue() + ((Float)rrub_12.id_class[id_byte[13]]).floatValue());
        rrub_13.id_class[rrub_1.id_byte[14]] = f;
        rrub_1 rrub_14 = this;
        Float f2 = Float.valueOf(((Float)rrub_14.id_class[id_byte[15]]).floatValue() + ((Float)rrub_12.id_class[id_byte[16]]).floatValue());
        rrub_14.id_class[rrub_1.id_byte[17]] = f2;
        rrub_1 rrub_15 = this;
        Float f3 = Float.valueOf(((Float)rrub_15.id_class[id_byte[18]]).floatValue() + ((Float)rrub_12.id_class[id_byte[19]]).floatValue());
        rrub_15.id_class[rrub_1.id_byte[20]] = f3;
        return this;
    }

    public rrub_1 id_break(rrub_1 rrub_12) {
        rrub_1 rrub_13 = this;
        Float f = Float.valueOf(((Float)rrub_13.id_class[id_byte[21]]).floatValue() - ((Float)rrub_12.id_class[id_byte[22]]).floatValue());
        rrub_13.id_class[rrub_1.id_byte[23]] = f;
        rrub_1 rrub_14 = this;
        Float f2 = Float.valueOf(((Float)rrub_14.id_class[id_byte[24]]).floatValue() - ((Float)rrub_12.id_class[id_byte[25]]).floatValue());
        rrub_14.id_class[rrub_1.id_byte[26]] = f2;
        rrub_1 rrub_15 = this;
        Float f3 = Float.valueOf(((Float)rrub_15.id_class[id_byte[27]]).floatValue() - ((Float)rrub_12.id_class[id_byte[28]]).floatValue());
        rrub_15.id_class[rrub_1.id_byte[29]] = f3;
        return this;
    }

    public rrub_1 id_break() {
        float f = rfU_2.id_byte(((Float)this.id_class[id_byte[42]]).floatValue() * ((Float)this.id_class[id_byte[43]]).floatValue() + ((Float)this.id_class[id_byte[44]]).floatValue() * ((Float)this.id_class[id_byte[45]]).floatValue() + ((Float)this.id_class[id_byte[46]]).floatValue() * ((Float)this.id_class[id_byte[47]]).floatValue());
        if (f < id_throws[0]) {
            Float f2 = Float.valueOf(id_throws[1]);
            this.id_class[rrub_1.id_byte[48]] = f2;
            Float f3 = Float.valueOf(id_throws[2]);
            this.id_class[rrub_1.id_byte[49]] = f3;
            Float f4 = Float.valueOf(id_throws[3]);
            this.id_class[rrub_1.id_byte[50]] = f4;
        } else {
            rrub_1 rrub_12 = this;
            Float f5 = Float.valueOf(((Float)rrub_12.id_class[id_byte[51]]).floatValue() / f);
            rrub_12.id_class[rrub_1.id_byte[52]] = f5;
            rrub_1 rrub_13 = this;
            Float f6 = Float.valueOf(((Float)rrub_13.id_class[id_byte[53]]).floatValue() / f);
            rrub_13.id_class[rrub_1.id_byte[54]] = f6;
            rrub_1 rrub_14 = this;
            Float f7 = Float.valueOf(((Float)rrub_14.id_class[id_byte[55]]).floatValue() / f);
            rrub_14.id_class[rrub_1.id_byte[56]] = f7;
        }
        return this;
    }

    public rrub_1 id_break(float f) {
        rrub_1 rrub_12 = this;
        Float f2 = Float.valueOf(((Float)rrub_12.id_class[id_byte[36]]).floatValue() * f);
        rrub_12.id_class[rrub_1.id_byte[37]] = f2;
        rrub_1 rrub_13 = this;
        Float f3 = Float.valueOf(((Float)rrub_13.id_class[id_byte[38]]).floatValue() * f);
        rrub_13.id_class[rrub_1.id_byte[39]] = f3;
        rrub_1 rrub_14 = this;
        Float f4 = Float.valueOf(((Float)rrub_14.id_class[id_byte[40]]).floatValue() * f);
        rrub_14.id_class[rrub_1.id_byte[41]] = f4;
        return this;
    }

    private static void id_throws() {
        float[] fArray = new float[7];
        fArray[0] = 1.0E-4f;
        id_throws = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrub_1.id_private();
        rrub_1.id_catch();
        rrub_1.id_throws();
        rrub_1.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[69];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 2;
        sArray[28] = 2;
        sArray[29] = 2;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 2;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 2;
        sArray[44] = 1;
        sArray[45] = 1;
        sArray[46] = 2;
        sArray[47] = 2;
        sArray[49] = 1;
        sArray[50] = 2;
        sArray[53] = 1;
        sArray[54] = 1;
        sArray[55] = 2;
        sArray[56] = 2;
        sArray[58] = 1;
        sArray[60] = 1;
        sArray[62] = 1;
        sArray[65] = 1;
        sArray[66] = 1;
        sArray[67] = 2;
        sArray[68] = 2;
        id_byte = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrub_1.id_protected[0]] = Float.valueOf(id_throws[4]);
            objectArray[rrub_1.id_protected[1]] = Float.valueOf(id_throws[5]);
            objectArray[rrub_1.id_break[1]] = Float.valueOf(id_throws[6]);
        }
    }

    private static void id_protected() {
        id_break = new byte[]{3, 2};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }
}

