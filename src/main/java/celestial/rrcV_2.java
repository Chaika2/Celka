/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcg_3;
import celestial.rrcj_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcV_2
extends rrfI_2<rrcg_3> {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;

    @Override
    public boolean id_byte() {
        return this.id_break().equals((Object)((rrcg_3)((Object)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[id_byte[9]])));
    }

    public rrcV_2(rrcj_3 rrcj_32, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_case();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcV_2.id_byte[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcV_2.id_byte[1]] = rrNd_13;
    }

    static {
        rrcV_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{64, -30, 2, -15, 53, 76, 2, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA444E71A;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFBA958AFCEC243F3L;
    }

    public rrcg_3 id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class();
        int n = ((rrNw_1)this.id_class[id_byte[4]]).id_case();
        if (n > ((rrNd_1)this.id_class[id_byte[5]]).id_else() * rdn_32.id_char()) {
            return (rrcg_3)((Object)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[id_byte[6]]);
        }
        if ((long)n > C_throws.id_byte().id_native().id_byte()) {
            return (rrcg_3)((Object)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[id_byte[7]]);
        }
        return (rrcg_3)((Object)rrcg_3.staticFields9e7054085b8332b2a0d7ffdb908291c6[id_byte[8]]);
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcV_2.id_protected();
        rrcV_2.id_throws();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        id_byte = sArray;
    }
}

