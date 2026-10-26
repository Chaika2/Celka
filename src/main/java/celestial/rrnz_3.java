/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rhd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnz_3 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrnz_3() {
        this.id_break();
    }

    static {
        rrnz_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x187E44C535BBC3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD3A12A56;
    }

    public static rrnz_3 id_class(rhd_3 rhd_32) {
        rhd_3 rhd_33 = rhd_32;
        ((rrnz_3)rrnz_3.id_break[rrnz_3.id_protected[0]]).id_class[rrnz_3.id_protected[1]] = rhd_33;
        return (rrnz_3)id_break[id_protected[2]];
    }

    public rhd_3 id_class() {
        return (rhd_3)this.id_class[id_protected[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -92, -128, -37, -1, -115, -42, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_throws() {
        id_protected = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnz_3.id_byte();
        rrnz_3.id_throws();
        rrnz_3.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrnz_3()};
        id_break = objectArray;
    }
}

