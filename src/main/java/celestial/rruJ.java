/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruJ {
    private static float[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_break = new float[1];
    }

    public rruJ(rruX rruX2, rruX rruX3, float f) {
        this.id_break();
        rruX rruX4 = rruX2;
        this.id_class[rruJ.id_byte[0]] = rruX4;
        rruX rruX5 = rruX3;
        this.id_class[rruJ.id_byte[1]] = rruX5;
        Float f2 = Float.valueOf(f);
        this.id_class[rruJ.id_byte[2]] = f2;
    }

    static {
        rruJ.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -109, 1, 82, -54, -43, -109, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x51E5F535;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x61598A73EC35138AL;
    }

    private static void id_class() {
        id_protected = new byte[]{3, 2};
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rruJ.id_protected[1]] = Float.valueOf(id_break[0]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruJ.id_protected();
        rruJ.id_byte();
        rruJ.id_class();
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        id_byte = sArray;
    }
}

