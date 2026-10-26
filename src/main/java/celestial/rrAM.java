/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.cb_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAM {
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    public static Object[] id_break;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    public rrAM() {
        this.id_byte();
    }

    static {
        rrAM.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD914CA6F6C465506L;
    }

    public static rrAM id_class(cb_3 cb_32) {
        cb_3 cb_33 = cb_32;
        ((rrAM)rrAM.id_break[rrAM.id_protected[0]]).id_class[rrAM.id_protected[1]] = cb_33;
        return (rrAM)id_break[id_protected[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{64, -3, -116, 105, 120, -13, -12, 39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3F7FD808;
    }

    public cb_3 id_class() {
        return (cb_3)this.id_class[id_protected[5]];
    }

    public static void id_break(cb_3 cb_32) {
        rrAM rrAM2 = rrAM.id_class(cb_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[3]]).id_finally().id_class(rrAM2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[4]]).id_class(rrAM2);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        id_protected = new short[6];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAM.id_break();
        rrAM.id_throws();
        rrAM.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAM()};
        id_break = objectArray;
    }
}

