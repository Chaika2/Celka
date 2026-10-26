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

public class rrAu_1
extends Om_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8D0E2E3D;
    }

    public rrAu_1() {
        this.id_break();
    }

    static {
        rrAu_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, 127, 5, 54, -33, 82, -85, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        this.id_break();
        return (Integer)this.id_class[id_protected[4]];
    }

    public void id_class(int n) {
        this.id_break();
        Integer n2 = n;
        this.id_class[rrAu_1.id_protected[5]] = n2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8329F35F0D39461CL;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rrAu_1.id_byte[3]] = id_byte[4];
        }
    }

    public static rrAu_1 id_break(int n) {
        Integer n2 = n;
        ((rrAu_1)rrAu_1.id_break[rrAu_1.id_protected[0]]).id_class[rrAu_1.id_protected[1]] = n2;
        ((rrAu_1)id_break[id_protected[2]]).id_class(id_byte[0]);
        return (rrAu_1)id_break[id_protected[3]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAu_1()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAu_1.id_protected();
        rrAu_1.id_case();
        rrAu_1.id_throws();
    }

    private static void id_case() {
        id_protected = new short[6];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[5] = true;
        id_byte = blArray;
    }
}

