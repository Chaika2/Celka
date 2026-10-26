/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rrAw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAt_1
extends Om_1 {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    public Object[] id_break;

    public rrAt_1() {
        this.id_throws();
    }

    static {
        rrAt_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAE54C960;
    }

    public rrAw_1 id_class() {
        this.id_throws();
        return (rrAw_1)((Object)this.id_break[id_byte[4]]);
    }

    public static rrAt_1 id_class(rrAw_1 rrAw_12) {
        rrAw_1 rrAw_13 = rrAw_12;
        ((rrAt_1)rrAt_1.id_class[rrAt_1.id_byte[0]]).id_break[rrAt_1.id_byte[1]] = rrAw_13;
        ((rrAt_1)id_class[id_byte[2]]).id_class(id_protected[0]);
        return (rrAt_1)id_class[id_byte[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, 29, -68, 76, 40, 76, -51, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6A13D0F054CDEF1AL;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrAt_1()};
        id_class = objectArray;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAt_1.id_case();
        rrAt_1.id_protected();
        rrAt_1.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_byte = new short[5];
    }
}

