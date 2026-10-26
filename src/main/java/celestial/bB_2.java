/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bB_2 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;

    public void id_byte() {
        Object var5_1 = null;
        this.id_class[bB_2.id_throws[6]] = var5_1;
        Float f = Float.valueOf(id_protected[0]);
        this.id_class[bB_2.id_throws[7]] = f;
    }

    public bB_2() {
        this.id_protected();
    }

    static {
        bB_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, -13, -126, -58, -81, 120, -10, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rjU_2 rjU_22) {
        if ((rjU_2)this.id_class[id_throws[0]] == null) {
            rjU_2 rjU_23 = rjU_22;
            this.id_class[bB_2.id_throws[1]] = rjU_23;
        }
        bB_2 bB_22 = this;
        Float f = Float.valueOf(((Float)bB_22.id_class[id_throws[2]]).floatValue() + (float)((rjU_2)this.id_class[id_throws[3]]).id_case(rjU_22));
        bB_22.id_class[bB_2.id_throws[4]] = f;
        rjU_2 rjU_24 = rjU_22;
        this.id_class[bB_2.id_throws[5]] = rjU_24;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x63810C63;
    }

    public float id_class() {
        return ((Float)this.id_class[id_throws[9]]).floatValue();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD71A977C92C11A8L;
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_class[id_throws[8]];
    }

    private static void id_throws() {
        id_protected = new float[2];
    }

    private static /* synthetic */ void ntfClinit() {
        bB_2.id_private();
        bB_2.id_catch();
        bB_2.id_throws();
        bB_2.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[10];
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[bB_2.id_byte[0]] = Float.valueOf(id_protected[1]);
        }
    }

    private static void id_private() {
        id_byte = new boolean[]{true};
    }
}

