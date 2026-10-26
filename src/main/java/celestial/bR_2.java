/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EZ;
import celestial.rC_2;
import celestial.rP_2;
import celestial.rn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bR_2
extends rn_3 {
    public Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_protected = new short[1];
    }

    public bR_2(rP_2 rP_22, rC_2 rC_22, EZ eZ) {
        super(rP_22, rC_22);
        this.id_protected();
        EZ eZ2 = eZ;
        this.id_break[bR_2.id_protected[0]] = eZ2;
    }

    static {
        bR_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x465875A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE9F55894D84BFB17L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-76, -128, -49, -66, -74, -101, 22, -19}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        bR_2.id_throws();
        bR_2.id_byte();
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

