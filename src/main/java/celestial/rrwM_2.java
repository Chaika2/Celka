/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwE_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwM_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static float[] id_throws;
    public Object[] id_class;

    public float id_byte() {
        return ((Float)this.id_class[id_protected[9]]).floatValue();
    }

    public rrwM_2(rrwE_2 rrwE_22, float f, float f2) {
        this.id_case();
        rrwE_2 rrwE_23 = rrwE_22;
        this.id_class[rrwM_2.id_protected[0]] = rrwE_23;
        Float f3 = Float.valueOf(f);
        this.id_class[rrwM_2.id_protected[1]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrwM_2.id_protected[2]] = f4;
    }

    static {
        rrwM_2.ntfClinit();
    }

    public float id_class() {
        return ((Float)this.id_class[id_protected[8]]).floatValue();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6E3528E96EB3A805L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3C32F922;
    }

    public void id_class(rrwE_2 rrwE_22) {
        rrwE_2 rrwE_23 = rrwE_22;
        this.id_class[rrwM_2.id_protected[10]] = rrwE_23;
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrwM_2.id_protected[11]] = f2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, 85, -8, -108, -20, 85, -4, 83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public float id_class(float f, float f2) {
        return ((rrwE_2)((Object)this.id_class[id_protected[3]])).id_class(f, f2) + ((Float)this.id_class[id_protected[4]]).floatValue();
    }

    public float id_break(float f, float f2) {
        return ((rrwE_2)((Object)this.id_class[id_protected[5]])).id_break(f, f2) + ((Float)this.id_class[id_protected[6]]).floatValue();
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrwM_2.id_protected[12]] = f2;
    }

    public rrwE_2 id_break() {
        return (rrwE_2)((Object)this.id_class[id_protected[7]]);
    }

    private static void id_throws() {
        id_byte = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwM_2.id_catch();
        rrwM_2.id_private();
        rrwM_2.id_protected();
        rrwM_2.id_throws();
    }

    private static void id_catch() {
        id_break = new boolean[]{true};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrwM_2.id_break[0]] = Float.valueOf(id_throws[0]);
            objectArray[rrwM_2.id_byte[1]] = Float.valueOf(id_throws[1]);
        }
    }

    private static void id_protected() {
        id_throws = new float[2];
    }

    private static void id_private() {
        short[] sArray = new short[13];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        id_protected = sArray;
    }
}

