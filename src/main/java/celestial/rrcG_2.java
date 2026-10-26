/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcE_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcG_2
extends rrfI_2<Boolean> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcG_2(rrcE_2 rrcE_22, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_case();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcG_2.id_byte[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcG_2.id_byte[1]] = rrNd_13;
    }

    static {
        rrcG_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 7, 60, 97, 29, -96, 85, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x217EAAD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x25A6DF61321D586EL;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public Boolean id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class();
        return rdn_32.id_char() >= ((rrNd_1)this.id_class[id_byte[4]]).id_native() ? id_break[0] : id_break[1];
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcG_2.id_protected();
        rrcG_2.id_catch();
        rrcG_2.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[4] = 1;
        id_byte = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }
}

