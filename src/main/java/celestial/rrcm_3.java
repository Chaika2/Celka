/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcu_3;
import celestial.rrfI_2;
import celestial.rrjS_2;
import celestial.util.FuntimeEnchantment;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcm_3
extends rrfI_2<Boolean> {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcm_3(rrcu_3 rrcu_32, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_throws();
        rrcu_3 rrcu_33 = rrcu_32;
        this.id_class[rrcm_3.id_protected[0]] = rrcu_33;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcm_3.id_protected[1]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcm_3.id_protected[2]] = rrNd_13;
    }

    static {
        rrcm_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x12E9EE7B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -104, -19, -52, -25, 53, 5, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE8E4BC03EBBC1A4AL;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public Boolean id_break() {
        rdn_3 rdn_32;
        this.id_throws();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[3]]).id_throws();
        rdn_3 rdn_33 = rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_protected[4]]).id_protected() : rJY2.id_class();
        if (rdn_32 == null) {
            return id_byte[0];
        }
        List<FuntimeEnchantment> list = rrjS_2.id_class(rdn_32);
        if (list == null) {
            return id_byte[1];
        }
        if (!((rrcu_3)this.id_class[id_protected[5]]).id_class((rrNd_1)this.id_class[id_protected[6]], rdn_32, list)) {
            return id_byte[2];
        }
        if (!((rrcu_3)this.id_class[id_protected[7]]).id_break((rrNd_1)this.id_class[id_protected[8]], list)) {
            return id_byte[3];
        }
        if (!((rrcu_3)this.id_class[id_protected[9]]).id_class((rrNd_1)this.id_class[id_protected[10]], list)) {
            return id_byte[4];
        }
        return id_byte[5];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcm_3.id_catch();
        rrcm_3.id_case();
        rrcm_3.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[5] = true;
        id_byte = blArray;
    }

    private static void id_case() {
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

    private static void id_protected() {
        id_break = new byte[]{3};
    }
}

