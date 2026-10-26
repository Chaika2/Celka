/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNt_1;
import celestial.rrNw_1;
import celestial.rrcC_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcl_3
extends rrfI_2<Boolean> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static short[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcl_3(rrcC_2 rrcC_22, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_throws();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcl_3.id_protected[0]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcl_3.id_protected[1]] = rrNd_13;
    }

    static {
        rrcl_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC25BB126;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{57, -70, -66, 47, -2, -67, -69, 35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE3C629BCFAAFA2E6L;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public Boolean id_break() {
        this.id_throws();
        if ((rrNw_1)this.id_class[id_protected[2]] instanceof rrNt_1) {
            rrNt_1 rrNt_12 = (rrNt_1)((rrNw_1)this.id_class[id_protected[3]]);
            List<rrNt_1> list = rrNt_12.id_break();
            int n = rrNt_12.id_case();
            String string = rrcC_2.id_class(list, rrNt_12);
            if (string != null) {
                return id_break[0];
            }
        }
        return id_break[1];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcl_3.id_case();
        rrcl_3.id_protected();
        rrcl_3.id_catch();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        id_protected = sArray;
    }
}

