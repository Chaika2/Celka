/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ev_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfA_2 {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private rrfA_2(ev_3 ev_32, int n) {
        this.id_throws();
        ev_3 ev_33 = ev_32;
        this.id_class[rrfA_2.id_break[0]] = ev_33;
        Integer n2 = n;
        this.id_class[rrfA_2.id_break[1]] = n2;
    }

    static {
        rrfA_2.ntfClinit();
    }

    public static rrfA_2 id_class(ev_3 ev_32, int n) {
        return new rrfA_2(ev_32, n);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x15635F02;
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[3]];
    }

    public static rrfA_2 id_class(ev_3 ev_32) {
        return rrfA_2.id_class(ev_32, ev_32.id_throws());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -96, 55, 13, 55, -59, -55, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x40A2DFA06404C92FL;
    }

    public ev_3 id_break() {
        return (ev_3)this.id_class[id_break[2]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = 0;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrfA_2.id_case();
        rrfA_2.id_byte();
        rrfA_2.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

