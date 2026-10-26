/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrZH;
import celestial.rrfJ_2;
import celestial.rrfk_3;
import celestial.rrfx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfz_3 {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static float[] id_throws;
    public Object[] id_class;

    public float id_byte() {
        return ((Float)this.id_class[id_byte[9]]).floatValue();
    }

    public void id_byte(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrfz_3.id_byte[12]] = f2;
    }

    public rrfz_3(rrfk_3 rrfk_32, rrfx_3 rrfx_32, rrfJ_2 rrfJ_22) {
        this.id_implements();
        rrfk_3 rrfk_33 = rrfk_32;
        this.id_class[rrfz_3.id_byte[0]] = rrfk_33;
        rrfx_3 rrfx_33 = rrfx_32;
        this.id_class[rrfz_3.id_byte[1]] = rrfx_33;
        rrfJ_2 rrfJ_23 = rrfJ_22;
        this.id_class[rrfz_3.id_byte[2]] = rrfJ_23;
    }

    static {
        rrfz_3.ntfClinit();
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrfz_3.id_byte[13]] = f2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, 47, -99, 3, 32, -113, 12, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9846D56B;
    }

    public rrfx_3 id_class() {
        return (rrfx_3)((Object)this.id_class[id_byte[10]]);
    }

    public boolean id_class(float f, float f2) {
        return f >= this.id_throws() && f <= this.id_throws() + id_throws[0] && f2 >= this.id_break() && f2 <= this.id_break() + id_throws[1] ? id_protected[0] : id_protected[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2CDF7552AF7B90AL;
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrfz_3.id_byte[8]] = f2;
    }

    public float id_break() {
        return ((Float)this.id_class[id_byte[4]]).floatValue() + ((Float)this.id_class[id_byte[5]]).floatValue() + ((rrZH)((rrfk_3)this.id_class[rrfz_3.id_byte[6]]).id_class[id_byte[7]]).id_case();
    }

    public float id_throws() {
        return ((Float)this.id_class[id_byte[3]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrfz_3.id_catch();
        rrfz_3.id_private();
        rrfz_3.id_finally();
        rrfz_3.id_case();
    }

    private static void id_finally() {
        float[] fArray = new float[5];
        fArray[0] = 15.0f;
        fArray[1] = 15.0f;
        id_throws = fArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        id_break = new byte[]{6, 2};
    }

    private void id_implements() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[0] = Float.valueOf(0.0f);
            this.id_class[1] = Float.valueOf(0.0f);
            this.id_class[2] = Float.valueOf(0.0f);
        }
    }

    public rrfJ_2 id_protected() {
        return (rrfJ_2)this.id_class[id_byte[11]];
    }

    private static void id_private() {
        short[] sArray = new short[14];
        sArray[0] = 5;
        sArray[1] = 3;
        sArray[2] = 4;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[13] = 1;
        id_byte = sArray;
    }
}

