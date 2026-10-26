/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAG {
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrAG() {
        this.id_break();
    }

    static {
        rrAG.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, -19, -46, -36, 47, -113, 78, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFA932D;
    }

    public rjU_2 id_class() {
        return (rjU_2)this.id_class[id_protected[3]];
    }

    public static rrAG id_class(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        ((rrAG)rrAG.id_break[rrAG.id_protected[0]]).id_class[rrAG.id_protected[1]] = rjU_23;
        return (rrAG)id_break[id_protected[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B2652A32D8213D6L;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_throws() {
        id_protected = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAG.id_byte();
        rrAG.id_throws();
        rrAG.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAG()};
        id_break = objectArray;
    }
}

