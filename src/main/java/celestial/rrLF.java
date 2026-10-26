/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLF {
    public Object[] id_class;
    private static boolean[] id_byte;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static short[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public rrLF() {
        this.id_byte();
    }

    static {
        rrLF.ntfClinit();
    }

    public static rrLF id_class(rnB_2 rnB_22, rgP_2 rgP_22) {
        rrLF rrLF2 = rrLF.id_break(rnB_22, rgP_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(rrLF2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[6]]).id_class(rrLF2);
        return rrLF2;
    }

    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_throws[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, 116, -27, 122, -103, 62, 68, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rgP_2 rgP_22) {
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrLF.id_throws[9]] = rgP_23;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFED8A8123BB31F4CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC79416A;
    }

    public static rrLF id_break(rnB_2 rnB_22, rgP_2 rgP_22) {
        rnB_2 rnB_23 = rnB_22;
        ((rrLF)rrLF.id_break[rrLF.id_throws[0]]).id_class[rrLF.id_throws[1]] = rnB_23;
        rgP_2 rgP_23 = rgP_22;
        ((rrLF)rrLF.id_break[rrLF.id_throws[2]]).id_class[rrLF.id_throws[3]] = rgP_23;
        return (rrLF)id_break[id_throws[4]];
    }

    public rnB_2 id_break() {
        return (rnB_2)this.id_class[id_throws[7]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLF.id_throws();
        rrLF.id_case();
        rrLF.id_protected();
        rrLF.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLF()};
        id_break = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

