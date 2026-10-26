/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.R;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class f_1
extends R {
    private static short[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    public f_1(String string) {
        this.id_protected();
        String string2 = string;
        this.id_class[f_1.id_byte[0]] = string2;
        Object var7_3 = null;
        this.id_class[f_1.id_byte[1]] = var7_3;
    }

    static {
        f_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBBA8497864282770L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{28, 21, 39, 87, -16, 78, -38, -42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_byte = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x86AA3669;
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        f_1.id_class();
        f_1.id_throws();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

