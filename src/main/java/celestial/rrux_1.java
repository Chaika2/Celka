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

public class rrux_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;

    public void id_byte(rrux_1 rrux_12) {
        Float f = Float.valueOf(((Float)rrux_12.id_class[id_break[4]]).floatValue());
        this.id_class[rrux_1.id_break[5]] = f;
        Float f2 = Float.valueOf(((Float)rrux_12.id_class[id_break[6]]).floatValue());
        this.id_class[rrux_1.id_break[7]] = f2;
    }

    public rrux_1 id_byte(float f) {
        float f2 = ((Float)this.id_class[id_break[38]]).floatValue();
        float f3 = ((Float)this.id_class[id_break[39]]).floatValue();
        f = (float)Math.toRadians(f);
        Float f4 = Float.valueOf(rfU_2.id_break(f) * f2 - rfU_2.id_class(f) * f3);
        this.id_class[rrux_1.id_break[40]] = f4;
        Float f5 = Float.valueOf(rfU_2.id_class(f) * f2 + rfU_2.id_break(f) * f3);
        this.id_class[rrux_1.id_break[41]] = f5;
        return this;
    }

    private static void id_byte() {
        short[] sArray = new short[44];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[26] = 1;
        sArray[27] = 1;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[33] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[39] = 1;
        sArray[41] = 1;
        sArray[43] = 1;
        id_break = sArray;
    }

    public rrux_1(float f, float f2) {
        this.id_throws();
        Float f3 = Float.valueOf(f);
        this.id_class[rrux_1.id_break[0]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrux_1.id_break[1]] = f4;
    }

    static {
        rrux_1.ntfClinit();
    }

    public String toString() {
        return "Vector2 [x=" + ((Float)this.id_class[id_break[42]]).floatValue() + ", y=" + ((Float)this.id_class[id_break[43]]).floatValue() + "]";
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return this.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9ECFC7F3B6C9F147L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -58, 116, 72, -35, 112, 20, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrux_1 id_class() {
        float f = rfU_2.id_byte(((Float)this.id_class[id_break[28]]).floatValue() * ((Float)this.id_class[id_break[29]]).floatValue() + ((Float)this.id_class[id_break[30]]).floatValue() * ((Float)this.id_class[id_break[31]]).floatValue());
        if (f < id_protected[0]) {
            Float f2 = Float.valueOf(id_protected[1]);
            this.id_class[rrux_1.id_break[32]] = f2;
            Float f3 = Float.valueOf(id_protected[2]);
            this.id_class[rrux_1.id_break[33]] = f3;
        } else {
            rrux_1 rrux_12 = this;
            Float f4 = Float.valueOf(((Float)rrux_12.id_class[id_break[34]]).floatValue() / f);
            rrux_12.id_class[rrux_1.id_break[35]] = f4;
            rrux_1 rrux_13 = this;
            Float f5 = Float.valueOf(((Float)rrux_13.id_class[id_break[36]]).floatValue() / f);
            rrux_13.id_class[rrux_1.id_break[37]] = f5;
        }
        return this;
    }

    public rrux_1 id_class(rrux_1 rrux_12) {
        rrux_1 rrux_13 = this;
        Float f = Float.valueOf(((Float)rrux_13.id_class[id_break[8]]).floatValue() + ((Float)rrux_12.id_class[id_break[9]]).floatValue());
        rrux_13.id_class[rrux_1.id_break[10]] = f;
        rrux_1 rrux_14 = this;
        Float f2 = Float.valueOf(((Float)rrux_14.id_class[id_break[11]]).floatValue() + ((Float)rrux_12.id_class[id_break[12]]).floatValue());
        rrux_14.id_class[rrux_1.id_break[13]] = f2;
        return this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x42B3123C;
    }

    public rrux_1 id_class(float f) {
        rrux_1 rrux_12 = this;
        Float f2 = Float.valueOf(((Float)rrux_12.id_class[id_break[20]]).floatValue() / f);
        rrux_12.id_class[rrux_1.id_break[21]] = f2;
        rrux_1 rrux_13 = this;
        Float f3 = Float.valueOf(((Float)rrux_13.id_class[id_break[22]]).floatValue() / f);
        rrux_13.id_class[rrux_1.id_break[23]] = f3;
        return this;
    }

    public rrux_1 id_break(float f) {
        rrux_1 rrux_12 = this;
        Float f2 = Float.valueOf(((Float)rrux_12.id_class[id_break[24]]).floatValue() * f);
        rrux_12.id_class[rrux_1.id_break[25]] = f2;
        rrux_1 rrux_13 = this;
        Float f3 = Float.valueOf(((Float)rrux_13.id_class[id_break[26]]).floatValue() * f);
        rrux_13.id_class[rrux_1.id_break[27]] = f3;
        return this;
    }

    public rrux_1 id_break() {
        return new rrux_1(((Float)this.id_class[id_break[2]]).floatValue(), ((Float)this.id_class[id_break[3]]).floatValue());
    }

    public rrux_1 id_break(rrux_1 rrux_12) {
        rrux_1 rrux_13 = this;
        Float f = Float.valueOf(((Float)rrux_13.id_class[id_break[14]]).floatValue() - ((Float)rrux_12.id_class[id_break[15]]).floatValue());
        rrux_13.id_class[rrux_1.id_break[16]] = f;
        rrux_1 rrux_14 = this;
        Float f2 = Float.valueOf(((Float)rrux_14.id_class[id_break[17]]).floatValue() - ((Float)rrux_12.id_class[id_break[18]]).floatValue());
        rrux_14.id_class[rrux_1.id_break[19]] = f2;
        return this;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrux_1.id_byte[0]] = Float.valueOf(id_protected[3]);
            objectArray[rrux_1.id_byte[1]] = Float.valueOf(id_protected[4]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrux_1.id_protected();
        rrux_1.id_byte();
        rrux_1.id_catch();
        rrux_1.id_case();
    }

    private static void id_catch() {
        float[] fArray = new float[5];
        fArray[0] = 1.0E-4f;
        id_protected = fArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

