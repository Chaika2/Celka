/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cM_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnk_3 {
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_break;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrnk_3() {
        this.id_protected();
    }

    static {
        rrnk_3.ntfClinit();
    }

    public static rrnk_3 id_class(cM_2 cM_22) {
        cM_2 cM_23 = cM_22;
        ((rrnk_3)rrnk_3.id_break[rrnk_3.id_protected[0]]).id_class[rrnk_3.id_protected[1]] = cM_23;
        return (rrnk_3)id_break[id_protected[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6624DCF1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE50B9B24B250BC1L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, -60, -42, 64, -107, 91, 64, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public cM_2 id_class() {
        return (cM_2)this.id_class[id_protected[3]];
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrnk_3()};
        id_break = objectArray;
    }

    private static void id_throws() {
        id_protected = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnk_3.id_byte();
        rrnk_3.id_throws();
        rrnk_3.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }
}

