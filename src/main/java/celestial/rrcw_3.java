/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrct_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcw_3
extends rrfI_2<Boolean> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcw_3(rrct_3 rrct_32, rrNw_1 rrNw_12, rrNd_1 rrNd_12) {
        this.id_protected();
        rrct_3 rrct_33 = rrct_32;
        this.id_class[rrcw_3.id_byte[0]] = rrct_33;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcw_3.id_byte[1]] = rrNw_13;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrcw_3.id_byte[2]] = rrNd_13;
    }

    static {
        rrcw_3.ntfClinit();
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, 66, -30, 94, -79, 6, 90, 26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8D69075D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAA2E3BA4C09D9B02L;
    }

    public Boolean id_break() {
        rdn_3 rdn_32;
        this.id_protected();
        rJY rJY2 = ((rrNw_1)this.id_class[id_byte[3]]).id_throws();
        rdn_3 rdn_33 = rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[4]]).id_protected() : rJY2.id_class();
        if (rdn_32 == null || rdn_32.id_package() == null) {
            return id_break[0];
        }
        List<String> list = ((rrct_3)this.id_class[id_byte[5]]).id_class(rdn_32);
        if (!((rrct_3)this.id_class[id_byte[6]]).id_class((rrNd_1)this.id_class[id_byte[7]], list)) {
            return id_break[1];
        }
        if (!((rrct_3)this.id_class[id_byte[8]]).id_break((rrNd_1)this.id_class[id_byte[9]], list)) {
            return id_break[2];
        }
        return ((rrct_3)this.id_class[id_byte[10]]).id_byte((rrNd_1)this.id_class[id_byte[11]], list);
    }

    private static void id_throws() {
        id_protected = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcw_3.id_case();
        rrcw_3.id_catch();
        rrcw_3.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[12];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[5] = 2;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        sArray[11] = 1;
        id_byte = sArray;
    }

    private static void id_case() {
        id_break = new boolean[3];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

