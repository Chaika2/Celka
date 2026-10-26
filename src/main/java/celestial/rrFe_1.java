/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rrFa_1;
import celestial.rrNV;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFe_1 {
    public static Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[8] = 1;
        id_byte = sArray;
    }

    public rrFe_1() {
        this.id_protected();
    }

    static {
        rrFe_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3EC9EF0088004BDBL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{39, -34, 112, -69, 36, 117, -83, -103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rrNV rrNV2, rrFa_1 rrFa_12) {
        rrFe_1 rrFe_12 = rrFe_1.id_break(rrNV2, rrFa_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[5]]).id_finally().id_class(rrFe_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[6]]).id_class(rrFe_12);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD1CD2F32;
    }

    public rrNV id_class() {
        return (rrNV)this.id_break[id_byte[7]];
    }

    public rrFa_1 id_break() {
        return (rrFa_1)((Object)this.id_break[id_byte[8]]);
    }

    private static rrFe_1 id_break(rrNV rrNV2, rrFa_1 rrFa_12) {
        rrNV rrNV3 = rrNV2;
        ((rrFe_1)rrFe_1.id_class[rrFe_1.id_byte[0]]).id_break[rrFe_1.id_byte[1]] = rrNV3;
        rrFa_1 rrFa_13 = rrFa_12;
        ((rrFe_1)rrFe_1.id_class[rrFe_1.id_byte[2]]).id_break[rrFe_1.id_byte[3]] = rrFa_13;
        return (rrFe_1)id_class[id_byte[4]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFe_1.id_throws();
        rrFe_1.id_byte();
        rrFe_1.id_case();
        rrFe_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrFe_1()};
        id_class = objectArray;
    }

    private static void id_case() {
        id_protected = new byte[]{2};
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

