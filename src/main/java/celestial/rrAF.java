/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAF {
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_break;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
            objectArray[rrAF.id_byte[2]] = id_byte[3];
        }
    }

    public rrAF() {
        this.id_byte();
    }

    static {
        rrAF.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x23B81D28;
    }

    public boolean id_class() {
        return (Boolean)this.id_break[id_protected[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB7AA94A1A95C1BEAL;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrAF.id_protected[4]] = bl2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-119, 93, -29, 105, 81, 95, -25, 99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAF id_break(boolean bl) {
        Boolean bl2 = bl;
        ((rrAF)rrAF.id_class[rrAF.id_protected[0]]).id_break[rrAF.id_protected[1]] = bl2;
        return (rrAF)id_class[id_protected[2]];
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrAF()};
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAF.id_throws();
        rrAF.id_protected();
        rrAF.id_break();
    }

    private static void id_protected() {
        id_protected = new short[5];
    }
}

