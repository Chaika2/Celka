/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrnX_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnh_3 {
    private static boolean[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    public rrnh_3() {
        this.id_byte();
    }

    static {
        rrnh_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, -33, -49, 89, 93, 69, -23, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrnh_3 id_class(rrnX_2 rrnX_22) {
        rrnX_2 rrnX_23 = rrnX_22;
        ((rrnh_3)rrnh_3.id_break[rrnh_3.id_protected[0]]).id_class[rrnh_3.id_protected[1]] = rrnX_23;
        return (rrnh_3)id_break[id_protected[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3CF4A325;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEC98743795D53DCDL;
    }

    public rrnX_2 id_class() {
        return (rrnX_2)((Object)this.id_class[id_protected[3]]);
    }

    private static void id_break() {
        id_protected = new short[4];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnh_3.id_throws();
        rrnh_3.id_break();
        rrnh_3.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrnh_3()};
        id_break = objectArray;
    }
}

