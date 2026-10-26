/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package celestial;

import celestial.rrqB_2;
import celestial.rrqP_2;
import celestial.rrqS_2;
import celestial.rrqr_3;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqb_3
implements Comparator<rrqr_3> {
    private static short[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_class = new short[]{1, 1};
    }

    static {
        rrqb_3.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rrqr_3)object, (rrqr_3)object2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3EBCEB62156740E8L;
    }

    public int id_class(rrqr_3 rrqr_32, rrqr_3 rrqr_33) {
        boolean bl = rrqr_32.id_throws();
        boolean bl2 = rrqr_33.id_throws();
        if (bl && !bl2) {
            return id_break[0];
        }
        if (!bl && bl2) {
            return id_byte[0];
        }
        rrqP_2 rrqP_22 = (rrqP_2)rrqr_32;
        rrqP_2 rrqP_23 = (rrqP_2)rrqr_33;
        int n = rrqB_2.id_class(rrqP_22.id_case());
        int n2 = rrqB_2.id_class(rrqP_23.id_case());
        return ComparisonChain.start().compareTrueFirst(rrqP_22.id_finally().id_byte() == (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_class[0]]) ? id_byte[1] : id_byte[2], rrqP_23.id_finally().id_byte() == (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_class[1]]) ? id_byte[3] : id_byte[4]).compare(n, n2).result();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, -104, 64, 84, 0, 79, -126, 63}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5DBB8023;
    }

    private static void id_class() {
        id_break = new byte[]{-1};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqb_3.id_break();
        rrqb_3.id_byte();
        rrqb_3.id_class();
    }
}

