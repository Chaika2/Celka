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

public class rrLb_1
extends Om_1 {
    public static Object[] id_class;
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, -49, -12, -12, 43, 60, -6, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrLb_1() {
        this.id_break();
    }

    static {
        rrLb_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1377A2B4D00850BL;
    }

    public String id_class() {
        this.id_break();
        return (String)this.id_break[id_byte[3]];
    }

    public static rrLb_1 id_class(String string) {
        String string2 = string;
        ((rrLb_1)rrLb_1.id_class[rrLb_1.id_byte[0]]).id_break[rrLb_1.id_byte[1]] = string2;
        return (rrLb_1)id_class[id_byte[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB22C0516;
    }

    public void id_break(String string) {
        this.id_break();
        String string2 = string;
        this.id_break[rrLb_1.id_byte[4]] = string2;
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLb_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLb_1.id_case();
        rrLb_1.id_protected();
        rrLb_1.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_byte = new short[5];
    }
}

