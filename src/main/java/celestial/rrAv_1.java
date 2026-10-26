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

public class rrAv_1
extends Om_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;

    public void id_byte(String string) {
        this.id_protected();
        String string2 = string;
        this.id_break[rrAv_1.id_byte[5]] = string2;
    }

    public rrAv_1() {
        this.id_protected();
    }

    static {
        rrAv_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9414F76EBB07D046L;
    }

    public String id_class() {
        this.id_protected();
        return (String)this.id_break[id_byte[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, 63, -70, -33, 81, 18, -50, 9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3AB65538;
    }

    private static void id_break() {
        id_byte = new short[6];
    }

    public static rrAv_1 id_break(String string) {
        String string2 = string;
        ((rrAv_1)rrAv_1.id_class[rrAv_1.id_byte[0]]).id_break[rrAv_1.id_byte[1]] = string2;
        ((rrAv_1)id_class[id_byte[2]]).id_class(id_protected[0]);
        return (rrAv_1)id_class[id_byte[3]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAv_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAv_1.id_case();
        rrAv_1.id_break();
        rrAv_1.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }
}

