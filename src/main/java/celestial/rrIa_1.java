/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIa_1 {
    private static float[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    public rrIa_1() {
        this.id_break();
    }

    static {
        rrIa_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{118, -52, -115, 73, -100, -71, 78, -111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6564BE92;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8C5E2235458F146L;
    }

    public void id_class() {
        Float f = Float.valueOf(id_break[1]);
        this.id_class[rrIa_1.id_byte[2]] = f;
    }

    public float id_class(float f, float f2) {
        rrIa_1 rrIa_12 = this;
        float f3 = ((Float)rrIa_12.id_class[id_byte[0]]).floatValue() + f2;
        Float f4 = Float.valueOf(f3);
        rrIa_12.id_class[rrIa_1.id_byte[1]] = f4;
        return (float)Math.sin(f *= Math.min(f3, id_break[0]));
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
            this.id_class[0] = Float.valueOf(0.0f);
        }
    }

    private static void id_throws() {
        float[] fArray = new float[3];
        fArray[0] = 1.0f;
        id_break = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIa_1.id_byte();
        rrIa_1.id_protected();
        rrIa_1.id_throws();
    }

    private static void id_protected() {
        id_byte = new short[3];
    }
}

