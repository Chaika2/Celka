/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLl_1 {
    public static Object[] id_class;
    private static float[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLl_1()};
        id_class = objectArray;
    }

    public rrLl_1() {
        this.id_throws();
    }

    static {
        rrLl_1.ntfClinit();
    }

    public float id_class() {
        return ((Float)this.id_break[id_throws[3]]).floatValue();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, -17, -39, 53, 82, -21, -87, 64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrLl_1.id_throws[4]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6C9D3F80C5D88980L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE1A5FFD3;
    }

    public static rrLl_1 id_break(float f) {
        Float f2 = Float.valueOf(f);
        ((rrLl_1)rrLl_1.id_class[rrLl_1.id_throws[0]]).id_break[rrLl_1.id_throws[1]] = f2;
        return (rrLl_1)id_class[id_throws[2]];
    }

    private static void id_break() {
        id_throws = new short[5];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
            objectArray[rrLl_1.id_protected[2]] = Float.valueOf(id_byte[0]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLl_1.id_case();
        rrLl_1.id_break();
        rrLl_1.id_protected();
        rrLl_1.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_byte = new float[1];
    }
}

