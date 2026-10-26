/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrFl_1<T> {
    private static short[] id_class;
    private static float[] id_break;
    private static boolean[] id_protected;
    public Object[] id_byte;

    public abstract Collection<T> id_byte();

    public rrFl_1() {
        this.id_class();
    }

    static {
        rrFl_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE57C73A4;
    }

    public abstract void id_class(Ml_1 var1, float var2, float var3);

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x758F1C0768AE0AD4L;
    }

    public abstract float id_class(T var1);

    private void id_class() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[0]];
            objectArray[rrFl_1.id_protected[1]] = Float.valueOf(id_break[0]);
        }
    }

    public void id_class(float f) {
        this.id_break(((Float)this.id_byte[id_class[0]]).floatValue() + f);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, 89, -126, -84, -86, 41, 79, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_byte[rrFl_1.id_class[1]] = f2;
    }

    public void id_throws() {
    }

    private static /* synthetic */ void ntfClinit() {
        rrFl_1.id_break();
        rrFl_1.id_case();
        rrFl_1.id_catch();
    }

    public float id_finally() {
        return ((Float)this.id_byte[id_class[2]]).floatValue();
    }

    private static void id_catch() {
        id_break = new float[1];
    }

    private static void id_case() {
        id_class = new short[3];
    }

    public abstract float id_protected();
}

