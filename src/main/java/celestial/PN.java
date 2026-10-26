/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_extends;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PN {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new short[2];
    }

    public PN(C_extends<?> c_extends) {
        C_extends<?> c_extends2;
        this.id_protected();
        this.id_class[PN.id_byte[0]] = c_extends2 = c_extends;
    }

    static {
        PN.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF5A3A48D96043B3AL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x85D74235;
    }

    public C_extends<?> id_class() {
        return (C_extends)this.id_class[id_byte[1]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -67, -59, -80, -54, 21, 12, 15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        PN.id_break();
        PN.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

