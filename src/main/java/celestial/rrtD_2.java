/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtD_2 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    public int id_byte() {
        return (Integer)((Supplier)this.id_class[id_break[3]]).get();
    }

    public rrtD_2(Supplier<Integer> supplier, Supplier<Integer> supplier2, Supplier<Integer> supplier3) {
        Supplier<Integer> supplier4;
        Supplier<Integer> supplier5;
        Supplier<Integer> supplier6;
        this.id_case();
        this.id_class[rrtD_2.id_break[0]] = supplier6 = supplier;
        this.id_class[rrtD_2.id_break[1]] = supplier5 = supplier2;
        this.id_class[rrtD_2.id_break[2]] = supplier4 = supplier3;
    }

    static {
        rrtD_2.ntfClinit();
    }

    public int id_class() {
        return (Integer)((Supplier)this.id_class[id_break[4]]).get();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF95B3D63;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x54AC018381B61D2AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, 98, 110, 102, -59, -62, -81, -49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_break() {
        return (Integer)((Supplier)this.id_class[id_break[5]]).get();
    }

    private static void id_throws() {
        id_byte = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrtD_2.id_protected();
        rrtD_2.id_throws();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_break = sArray;
    }
}

