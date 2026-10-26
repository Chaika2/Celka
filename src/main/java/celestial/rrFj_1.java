/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.an_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFj_1
extends Om_1 {
    public Object[] id_class;
    private static short[] id_byte;
    public static Object[] id_break;
    private static boolean[] id_protected;

    public rrFj_1() {
        this.id_break();
    }

    static {
        rrFj_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x83D93B9A;
    }

    public static rrFj_1 id_class(an_3 an_32) {
        an_3 an_33 = an_32;
        ((rrFj_1)rrFj_1.id_break[rrFj_1.id_byte[0]]).id_class[rrFj_1.id_byte[1]] = an_33;
        ((rrFj_1)id_break[id_byte[2]]).id_class(id_protected[0]);
        return (rrFj_1)id_break[id_byte[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-47, -61, 64, 103, -16, -38, -124, -69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public an_3 id_class() {
        this.id_break();
        return (an_3)this.id_class[id_byte[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x673C65116D6568D8L;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }

    private static void id_throws() {
        id_byte = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrFj_1.id_case();
        rrFj_1.id_throws();
        rrFj_1.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrFj_1()};
        id_break = objectArray;
    }
}

