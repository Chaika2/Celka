/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryE {
    private static boolean[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;

    public float id_byte() {
        return ((Float)this.id_class[id_throws[2]]).floatValue();
    }

    public rryE(float f, float f2, float f3) {
        this.id_case();
        Float f4 = Float.valueOf(f);
        this.id_class[rryE.id_throws[3]] = f4;
        Float f5 = Float.valueOf(f2);
        this.id_class[rryE.id_throws[4]] = f5;
        Float f6 = Float.valueOf(f3);
        this.id_class[rryE.id_throws[5]] = f6;
    }

    static {
        rryE.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, 43, -83, -93, -58, -30, -85, -63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x736EC9A1C3B9547DL;
    }

    public float id_class() {
        return ((Float)this.id_class[id_throws[0]]).floatValue();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEC5C0AC5;
    }

    public float id_break() {
        return ((Float)this.id_class[id_throws[1]]).floatValue();
    }

    private static void id_throws() {
        id_protected = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rryE.id_catch();
        rryE.id_protected();
        rryE.id_private();
        rryE.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[0] = Float.valueOf(0.0f);
            this.id_class[1] = Float.valueOf(0.0f);
            this.id_class[2] = Float.valueOf(0.0f);
        }
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_throws = sArray;
    }

    private static void id_private() {
        id_byte = new float[3];
    }
}

