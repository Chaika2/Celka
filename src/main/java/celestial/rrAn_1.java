/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAn_1 {
    public Object[] id_class;
    private static short[] id_byte;
    public static Object[] id_break;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
            objectArray[rrAn_1.id_protected[2]] = id_protected[3];
        }
    }

    public rrAn_1() {
        this.id_byte();
    }

    static {
        rrAn_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{51, 78, -110, -76, -38, 85, 99, 16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_byte[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF4A3235C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89F8A93BE80A355FL;
    }

    public static rrAn_1 id_class(boolean bl) {
        Boolean bl2 = bl;
        ((rrAn_1)rrAn_1.id_break[rrAn_1.id_byte[0]]).id_class[rrAn_1.id_byte[1]] = bl2;
        return (rrAn_1)id_break[id_byte[2]];
    }

    public void id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrAn_1.id_byte[4]] = bl2;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static void id_throws() {
        id_byte = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAn_1.id_break();
        rrAn_1.id_throws();
        rrAn_1.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAn_1()};
        id_break = objectArray;
    }
}

