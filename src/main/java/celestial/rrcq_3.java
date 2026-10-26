/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdb_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcp_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcq_3
extends rrfI_2<Boolean> {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcq_3(rrcp_3 rrcp_32, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_case();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcq_3.id_byte[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcq_3.id_byte[1]] = rrNd_13;
    }

    static {
        rrcq_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{26, -37, 124, -87, 43, -57, -37, -6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x48C16116;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x26520977E1E53791L;
    }

    public Boolean id_break() {
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        rdb_3 rdb_32 = ((rrNd_1)this.id_class[id_byte[3]]).id_catch();
        rdb_3 rdb_33 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[4]]).id_protected().id_break() : rJY2.id_class().id_break();
        return rdb_32.equals(rdb_33);
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcq_3.id_protected();
        rrcq_3.id_throws();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }
}

