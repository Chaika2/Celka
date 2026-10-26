/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bF_2;
import celestial.bL_2;
import celestial.bv_3;
import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bA_2
extends bv_3 {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_break;

    public bA_2(rfl_3 rfl_32, bL_2[] bL_2Array, int n, bF_2 bF_22, bF_2 bF_23) {
        super(rfl_32, bL_2Array, n);
        this.id_native();
        bF_2 bF_24 = bF_22;
        this.id_break[bA_2.id_protected[0]] = bF_24;
        bF_2 bF_25 = bF_23;
        this.id_break[bA_2.id_protected[1]] = bF_25;
    }

    static {
        bA_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6E9EEDA0;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1B8AC57BF85504C8L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -73, -126, 65, -61, 17, 24, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        bA_2.id_extends();
        bA_2.id_finally();
    }

    private static void id_finally() {
        id_byte = new byte[]{2};
    }

    private static void id_extends() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_protected = sArray;
    }

    public bF_2 id_implements() {
        this.id_native();
        return (bF_2)this.id_break[id_protected[3]];
    }

    public bF_2 id_private() {
        this.id_native();
        return (bF_2)this.id_break[id_protected[2]];
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

