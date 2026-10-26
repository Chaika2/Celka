/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrpv_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpZ_2 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public int id_byte() {
        return (Integer)this.id_class[id_protected[5]];
    }

    public rrpZ_2(UUID uUID, int n) {
        this.id_private();
        UUID uUID2 = uUID;
        this.id_class[rrpZ_2.id_protected[0]] = uUID2;
        Integer n2 = n;
        this.id_class[rrpZ_2.id_protected[1]] = n2;
    }

    static {
        rrpZ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{88, -59, -29, -95, 59, 95, -116, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5B4DE573;
    }

    public void id_class(rrpv_3 rrpv_32, int n) {
        rrpv_3 rrpv_33 = rrpv_32;
        this.id_class[rrpZ_2.id_protected[2]] = rrpv_33;
        Integer n2 = n;
        this.id_class[rrpZ_2.id_protected[3]] = n2;
    }

    public UUID id_class() {
        return (UUID)this.id_class[id_protected[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x98B947D98C484519L;
    }

    public rrpv_3 id_break() {
        return (rrpv_3)((Object)this.id_class[id_protected[6]]);
    }

    private static void id_throws() {
        id_byte = new byte[]{4, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpZ_2.id_catch();
        rrpZ_2.id_case();
        rrpZ_2.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_break = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        id_protected = sArray;
    }

    public int id_protected() {
        return (Integer)this.id_class[id_protected[7]];
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[1] = 0;
            this.id_class[3] = 0;
        }
    }
}

