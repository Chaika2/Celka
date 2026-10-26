/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ev_3;
import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcN_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcc_3
extends rrfI_2<Boolean> {
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcc_3(rrcN_2 rrcN_22, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_case();
        rrcN_2 rrcN_23 = rrcN_22;
        this.id_class[rrcc_3.id_protected[0]] = rrcN_23;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcc_3.id_protected[1]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcc_3.id_protected[2]] = rrNd_13;
    }

    static {
        rrcc_3.ntfClinit();
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5DF6624A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{15, -101, 58, -33, -87, 124, -82, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE66450654B91B2D5L;
    }

    public Boolean id_break() {
        rdn_3 rdn_32;
        this.id_case();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[3]]).id_throws();
        rdn_3 rdn_33 = rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_protected[4]]).id_protected() : rJY2.id_class();
        if (rdn_32 == null) {
            return id_byte[0];
        }
        Map<ev_3, Integer> map = rdn_32.id_static();
        if (!((rrcN_2)this.id_class[id_protected[5]]).id_class((rrNd_1)this.id_class[id_protected[6]], rdn_32, map)) {
            return id_byte[1];
        }
        if (!((rrcN_2)this.id_class[id_protected[7]]).id_class((rrNd_1)this.id_class[id_protected[8]], map)) {
            return id_byte[2];
        }
        if (!((rrcN_2)this.id_class[id_protected[9]]).id_break((rrNd_1)this.id_class[id_protected[10]], map)) {
            return id_byte[3];
        }
        return id_byte[4];
    }

    private static void id_throws() {
        short[] sArray = new short[11];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcc_3.id_catch();
        rrcc_3.id_throws();
        rrcc_3.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[4] = true;
        id_byte = blArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_protected() {
        id_break = new byte[]{3};
    }
}

