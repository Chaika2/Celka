/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLG {
    public Object[] id_class;
    private static boolean[] id_byte;
    public static Object[] id_break;
    private static short[] id_protected;

    private static void id_byte() {
        id_protected = new short[4];
    }

    public rrLG() {
        this.id_break();
    }

    static {
        rrLG.ntfClinit();
    }

    public static rrLG id_class(SC sC) {
        SC sC2 = sC;
        ((rrLG)rrLG.id_break[rrLG.id_protected[0]]).id_class[rrLG.id_protected[1]] = sC2;
        return (rrLG)id_break[id_protected[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, -30, -62, 66, 77, -57, -103, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public SC id_class() {
        return (SC)this.id_class[id_protected[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA7E4BB9C8EDD82E0L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C539904;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLG()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLG.id_protected();
        rrLG.id_byte();
        rrLG.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

