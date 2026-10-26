/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BN;
import celestial.an_3;
import celestial.rdn_3;
import celestial.rjU_2;
import celestial.rqR_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BQ {
    private static byte[] id_break;
    private static short[] id_byte;
    private static long[] id_protected;
    public Object[] id_class;

    public an_3 id_byte() {
        return (an_3)this.id_class[id_byte[5]];
    }

    public BQ(an_3 an_32, rjU_2 rjU_22, rdn_3 rdn_32, List<BN> list) {
        List<BN> list2;
        this.id_case();
        an_3 an_33 = an_32;
        this.id_class[BQ.id_byte[0]] = an_33;
        rjU_2 rjU_23 = rjU_22;
        this.id_class[BQ.id_byte[1]] = rjU_23;
        rdn_3 rdn_33 = rdn_32;
        this.id_class[BQ.id_byte[2]] = rdn_33;
        this.id_class[BQ.id_byte[3]] = list2 = list;
        Long l = rqR_2.id_break();
        this.id_class[BQ.id_byte[4]] = l;
    }

    static {
        BQ.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-18, -20, 67, 77, 27, 113, -74, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA97C014A359A559EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3E1F3396;
    }

    public long id_class() {
        return (Long)this.id_class[id_byte[9]];
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_class[id_byte[7]];
    }

    public rdn_3 id_throws() {
        return (rdn_3)this.id_class[id_byte[6]];
    }

    private static /* synthetic */ void ntfClinit() {
        BQ.id_catch();
        BQ.id_implements();
        BQ.id_private();
    }

    private static void id_catch() {
        id_protected = new long[1];
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[BQ.id_break[1]] = id_protected[0];
        }
    }

    private static void id_implements() {
        short[] sArray = new short[10];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        id_byte = sArray;
    }

    public List<BN> id_protected() {
        return (List)this.id_class[id_byte[8]];
    }

    private static void id_private() {
        id_break = new byte[]{5, 4};
    }
}

