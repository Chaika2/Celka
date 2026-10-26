/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLf_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;
    public static Object[] id_break;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLf_1()};
        id_break = objectArray;
    }

    public rrLf_1() {
        this.id_protected();
    }

    static {
        rrLf_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD601E651;
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_class[id_throws[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{124, -124, -30, -71, -66, 32, 52, 60}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x847EA907B96362D2L;
    }

    public static void id_class(iB_2 iB_22, rdn_3 rdn_32) {
        rrLf_1 rrLf_12 = rrLf_1.id_break(iB_22, rdn_32);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[5]]).id_class(rrLf_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(rrLf_12);
    }

    private static rrLf_1 id_break(iB_2 iB_22, rdn_3 rdn_32) {
        iB_2 iB_23 = iB_22;
        ((rrLf_1)rrLf_1.id_break[rrLf_1.id_throws[0]]).id_class[rrLf_1.id_throws[1]] = iB_23;
        rdn_3 rdn_33 = rdn_32;
        ((rrLf_1)rrLf_1.id_break[rrLf_1.id_throws[2]]).id_class[rrLf_1.id_throws[3]] = rdn_33;
        return (rrLf_1)id_break[id_throws[4]];
    }

    public iB_2 id_break() {
        return (iB_2)this.id_class[id_throws[7]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLf_1.id_catch();
        rrLf_1.id_case();
        rrLf_1.id_throws();
        rrLf_1.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[8] = 1;
        id_throws = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

