/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruv_1 {
    public static Object[] id_class;
    private static byte[] id_byte;
    public Object[] id_break;
    private static float[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;

    public float id_byte() {
        return ((Float)this.id_break[id_case[28]]).floatValue();
    }

    public rruv_1(float f, float f2, float f3, float f4) {
        this.id_throws();
        Float f5 = Float.valueOf(f);
        this.id_break[rruv_1.id_case[22]] = f5;
        Float f6 = Float.valueOf(f2);
        this.id_break[rruv_1.id_case[23]] = f6;
        Float f7 = Float.valueOf(f3);
        this.id_break[rruv_1.id_case[24]] = f7;
        Float f8 = Float.valueOf(f4);
        this.id_break[rruv_1.id_case[25]] = f8;
    }

    static {
        rruv_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return id_throws[4];
        }
        if (!(object instanceof rruv_1)) {
            return id_throws[5];
        }
        rruv_1 rruv_12 = (rruv_1)object;
        if (Float.compare(this.id_break(), rruv_12.id_break()) != 0) {
            return id_throws[6];
        }
        if (Float.compare(this.id_protected(), rruv_12.id_protected()) != 0) {
            return id_throws[7];
        }
        if (Float.compare(this.id_byte(), rruv_12.id_byte()) != 0) {
            return id_throws[8];
        }
        if (Float.compare(this.id_class(), rruv_12.id_class()) != 0) {
            return id_throws[9];
        }
        return id_throws[10];
    }

    public String toString() {
        return "Bound(x=" + this.id_break() + ", y=" + this.id_protected() + ", width=" + this.id_byte() + ", height=" + this.id_class() + ")";
    }

    public int hashCode() {
        byte by = id_byte[0];
        int n = id_throws[11];
        n = n * id_byte[1] + Float.floatToIntBits(this.id_break());
        n = n * id_byte[2] + Float.floatToIntBits(this.id_protected());
        n = n * id_byte[3] + Float.floatToIntBits(this.id_byte());
        n = n * id_byte[4] + Float.floatToIntBits(this.id_class());
        return n;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B7530D12F4AAA4CL;
    }

    public rruv_1 id_class(float f, float f2) {
        return new rruv_1(((Float)this.id_break[id_case[0]]).floatValue() - f, ((Float)this.id_break[id_case[1]]).floatValue() - f2, ((Float)this.id_break[id_case[2]]).floatValue() + f * id_protected[0], ((Float)this.id_break[id_case[3]]).floatValue() + f2 * id_protected[1]);
    }

    public boolean id_class(rruv_1 rruv_12) {
        return ((Float)this.id_break[id_case[4]]).floatValue() < ((Float)rruv_12.id_break[id_case[5]]).floatValue() + ((Float)rruv_12.id_break[id_case[6]]).floatValue() && ((Float)this.id_break[id_case[7]]).floatValue() + ((Float)this.id_break[id_case[8]]).floatValue() > ((Float)rruv_12.id_break[id_case[9]]).floatValue() && ((Float)this.id_break[id_case[10]]).floatValue() < ((Float)rruv_12.id_break[id_case[11]]).floatValue() + ((Float)rruv_12.id_break[id_case[12]]).floatValue() && ((Float)this.id_break[id_case[13]]).floatValue() + ((Float)this.id_break[id_case[14]]).floatValue() > ((Float)rruv_12.id_break[id_case[15]]).floatValue() ? id_throws[0] : id_throws[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, 7, -66, 13, -46, 60, -24, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF502481;
    }

    public float id_class() {
        return ((Float)this.id_break[id_case[29]]).floatValue();
    }

    public float id_break() {
        return ((Float)this.id_break[id_case[26]]).floatValue();
    }

    public boolean id_break(float f, float f2) {
        return ((Float)this.id_break[id_case[16]]).floatValue() < f && ((Float)this.id_break[id_case[17]]).floatValue() + ((Float)this.id_break[id_case[18]]).floatValue() > f && ((Float)this.id_break[id_case[19]]).floatValue() < f2 && ((Float)this.id_break[id_case[20]]).floatValue() + ((Float)this.id_break[id_case[21]]).floatValue() > f2 ? id_throws[2] : id_throws[3];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[5]];
            objectArray[rruv_1.id_throws[13]] = Float.valueOf(id_protected[6]);
            objectArray[rruv_1.id_throws[14]] = Float.valueOf(id_protected[7]);
            objectArray[rruv_1.id_byte[6]] = Float.valueOf(id_protected[8]);
            objectArray[rruv_1.id_byte[7]] = Float.valueOf(id_protected[9]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruv_1.id_catch();
        rruv_1.id_implements();
        rruv_1.id_finally();
        rruv_1.id_private();
        rruv_1.id_case();
    }

    private static void id_finally() {
        float[] fArray = new float[10];
        fArray[0] = 2.0f;
        fArray[1] = 2.0f;
        id_protected = fArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[15] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rruv_1(0.0f, 0.0f, 0.0f, 0.0f)};
        id_class = objectArray;
    }

    private static void id_implements() {
        short[] sArray = new short[30];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[6] = 2;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 3;
        sArray[13] = 1;
        sArray[14] = 3;
        sArray[15] = 1;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 3;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[27] = 1;
        sArray[28] = 2;
        sArray[29] = 3;
        id_case = sArray;
    }

    public float id_protected() {
        return ((Float)this.id_break[id_case[27]]).floatValue();
    }

    private static void id_private() {
        id_byte = new byte[]{59, 59, 59, 59, 59, 4, 2, 3};
    }
}

