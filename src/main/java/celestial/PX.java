/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PJ;
import celestial.an_3;
import celestial.rfU_2;
import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PX {
    public static Object[] id_class;
    private static boolean[] id_byte;
    public Object[] id_break;
    private static float[] id_protected;
    private static double[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public void id_byte(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[PX.id_case[21]] = f2;
    }

    public PX id_byte(PX pX) {
        return new PX(((Float)this.id_break[id_case[8]]).floatValue() - ((Float)pX.id_break[id_case[9]]).floatValue(), ((Float)this.id_break[id_case[10]]).floatValue() - ((Float)pX.id_break[id_case[11]]).floatValue());
    }

    public PX id_byte() {
        return new PX(PX.id_protected(((Float)this.id_break[id_case[16]]).floatValue()), PX.id_break(((Float)this.id_break[id_case[17]]).floatValue()));
    }

    public PX(float f, float f2) {
        this.id_private();
        Float f3 = Float.valueOf(f);
        this.id_break[PX.id_case[0]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_break[PX.id_case[1]] = f4;
    }

    static {
        PX.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return id_byte[16];
        }
        if (object == null || object.getClass() != this.getClass()) {
            return id_byte[17];
        }
        PX pX = (PX)object;
        return Float.floatToIntBits(((Float)this.id_break[id_case[32]]).floatValue()) == Float.floatToIntBits(((Float)pX.id_break[id_case[33]]).floatValue()) && Float.floatToIntBits(((Float)this.id_break[id_case[34]]).floatValue()) == Float.floatToIntBits(((Float)pX.id_break[id_case[35]]).floatValue()) ? id_byte[18] : id_byte[19];
    }

    public String toString() {
        return "Yaw: " + ((Float)this.id_break[id_case[30]]).floatValue() + ", Pitch: " + ((Float)this.id_break[id_case[31]]).floatValue();
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_catch[0]];
        objectArray[PX.id_byte[20]] = Float.valueOf(((Float)this.id_break[id_case[36]]).floatValue());
        objectArray[PX.id_byte[21]] = Float.valueOf(((Float)this.id_break[id_case[37]]).floatValue());
        return Objects.hash(objectArray);
    }

    public boolean id_class(PX pX, float f) {
        return this.id_break(pX.id_throws(), f) && this.id_class(pX.id_protected(), f) ? id_byte[2] : id_byte[3];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{126, 34, -20, -114, 63, -47, 57, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public PX id_class() {
        return new PX(((Float)this.id_break[id_case[12]]).floatValue(), PX.id_break(((Float)this.id_break[id_case[13]]).floatValue()));
    }

    public boolean id_class(PX pX) {
        return this.id_break(pX) && this.id_throws(pX) ? id_byte[0] : id_byte[1];
    }

    public boolean id_class(float f, float f2, float f3) {
        return this.id_break(f, f3) && this.id_class(f2, f3) ? id_byte[4] : id_byte[5];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x61F48A13;
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[PX.id_case[20]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC28A93FE499A67FEL;
    }

    public rjU_2 id_class(an_3 an_32, float f) {
        return PJ.id_class(this).id_throws(an_32.id_new(f));
    }

    public boolean id_class(float f, float f2) {
        return Math.abs(((Float)this.id_break[id_case[24]]).floatValue() - f) < f2 ? id_byte[8] : id_byte[9];
    }

    public boolean id_break(PX pX, float f) {
        return Math.abs(((Float)this.id_break[id_case[25]]).floatValue() - ((Float)pX.id_break[id_case[26]]).floatValue()) < f ? id_byte[10] : id_byte[11];
    }

    public boolean id_break(float f, float f2) {
        float f3 = Math.abs(PX.id_protected(((Float)this.id_break[id_case[29]]).floatValue()) - PX.id_protected(f));
        return f3 < f2 || f3 > id_protected[0] - f2 ? id_byte[14] : id_byte[15];
    }

    public static float id_break(float f) {
        return rfU_2.id_class(f, id_protected[1], id_protected[2]);
    }

    public PX id_break() {
        return new PX(PX.id_protected(((Float)this.id_break[id_case[14]]).floatValue()), ((Float)this.id_break[id_case[15]]).floatValue());
    }

    public boolean id_break(PX pX) {
        float f = Math.abs(PX.id_protected(((Float)this.id_break[id_case[27]]).floatValue()) - PX.id_protected(((Float)pX.id_break[id_case[28]]).floatValue()));
        return (double)f < id_throws[1] || (double)f > id_throws[2] ? id_byte[12] : id_byte[13];
    }

    public float id_throws() {
        return ((Float)this.id_break[id_case[2]]).floatValue();
    }

    public boolean id_throws(PX pX) {
        return (double)Math.abs(((Float)this.id_break[id_case[22]]).floatValue() - ((Float)pX.id_break[id_case[23]]).floatValue()) < id_throws[0] ? id_byte[6] : id_byte[7];
    }

    public PX id_throws(float f) {
        return new PX(f, ((Float)this.id_break[id_case[18]]).floatValue());
    }

    private static /* synthetic */ void ntfClinit() {
        PX.id_case();
        PX.id_catch();
        PX.id_native();
        PX.id_implements();
        PX.id_extends();
        PX.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new PX(0.0f, 0.0f)};
        id_class = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[38];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[31] = 1;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[37] = 1;
        id_case = sArray;
    }

    private static void id_extends() {
        id_catch = new byte[]{2, 2};
    }

    public PX id_case(float f) {
        return new PX(((Float)this.id_break[id_case[19]]).floatValue(), f);
    }

    private static void id_case() {
        boolean[] blArray = new boolean[26];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[25] = true;
        id_byte = blArray;
    }

    private static void id_implements() {
        float[] fArray = new float[12];
        fArray[0] = 360.0f;
        fArray[1] = -90.0f;
        fArray[2] = 90.0f;
        fArray[3] = 360.0f;
        fArray[4] = -180.0f;
        fArray[5] = 360.0f;
        fArray[6] = 180.0f;
        fArray[7] = 360.0f;
        id_protected = fArray;
    }

    public PX id_protected(PX pX) {
        return new PX(((Float)this.id_break[id_case[4]]).floatValue() + ((Float)pX.id_break[id_case[5]]).floatValue(), ((Float)this.id_break[id_case[6]]).floatValue() + ((Float)pX.id_break[id_case[7]]).floatValue());
    }

    public float id_protected() {
        return ((Float)this.id_break[id_case[3]]).floatValue();
    }

    public static float id_protected(float f) {
        float f2 = f % id_protected[3];
        if (f2 < id_protected[4]) {
            f2 += id_protected[5];
        }
        if (f2 > id_protected[6]) {
            f2 -= id_protected[7];
        }
        return f2;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[1]];
            objectArray[PX.id_byte[23]] = Float.valueOf(id_protected[10]);
            objectArray[PX.id_byte[24]] = Float.valueOf(id_protected[11]);
        }
    }

    private static void id_native() {
        id_throws = new double[]{0.01, 0.01, 359.99};
    }
}

