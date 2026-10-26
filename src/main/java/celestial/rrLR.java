/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLR
extends Om_1 {
    public Object[] id_class;
    private static boolean[] id_byte;
    public static Object[] id_break;
    private static short[] id_protected;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x81842D60;
    }

    public rrLR() {
        this.id_protected();
    }

    static {
        rrLR.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B98E86B908B988BL;
    }

    public void id_class(int n) {
        this.id_protected();
        Integer n2 = n;
        this.id_class[rrLR.id_protected[5]] = n2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, 14, 124, -56, -97, -59, 17, -9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        this.id_protected();
        return (Integer)this.id_class[id_protected[4]];
    }

    public static rrLR id_break(int n) {
        Integer n2 = n;
        ((rrLR)rrLR.id_break[rrLR.id_protected[0]]).id_class[rrLR.id_protected[1]] = n2;
        ((rrLR)id_break[id_protected[2]]).id_class(id_byte[0]);
        return (rrLR)id_break[id_protected[3]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLR()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLR.id_break();
        rrLR.id_case();
        rrLR.id_throws();
    }

    private static void id_case() {
        id_protected = new short[6];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rrLR.id_byte[3]] = id_byte[4];
        }
    }
}

