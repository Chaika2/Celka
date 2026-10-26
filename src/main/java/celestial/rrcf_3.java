/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcI_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcf_3
extends rrfI_2<Boolean> {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcf_3(rrcI_2 rrcI_22, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_protected();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcf_3.id_byte[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcf_3.id_byte[1]] = rrNd_13;
    }

    static {
        rrcf_3.ntfClinit();
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 39, 57, 77, -6, -30, -120, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3FF19EF3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF47041694DAE20FBL;
    }

    public Boolean id_break() {
        this.id_protected();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[2]]).id_throws();
        rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class();
        List<String> list = ((rrNd_1)this.id_class[id_byte[4]]).id_protected();
        List<String> list2 = ((rrNd_1)this.id_class[id_byte[5]]).id_char();
        if (!rdn_32.id_final()) {
            return id_protected[0];
        }
        if (list2 != null && !list2.isEmpty()) {
            for (String string : list2) {
                if (!rdn_32.id_protected(string)) continue;
                return id_protected[1];
            }
        }
        if (list != null && !list.isEmpty()) {
            for (String string : list) {
                if (rdn_32.id_protected(string)) continue;
                return id_protected[2];
            }
        }
        return id_protected[3];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcf_3.id_throws();
        rrcf_3.id_catch();
        rrcf_3.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        id_byte = sArray;
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

