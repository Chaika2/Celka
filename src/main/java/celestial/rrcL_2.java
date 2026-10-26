/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rrNt_1;
import celestial.rrNw_1;
import celestial.rrcA_2;
import celestial.rrcF_2;
import celestial.rrcn_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcL_2
extends rrfI_2<Boolean> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcL_2(rrcF_2 rrcF_22, rrNw_1 rrNw_12) {
        this.id_protected();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcL_2.id_byte[0]] = rrNw_13;
    }

    static {
        rrcL_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3A2EB0E6;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, -88, 45, -65, 45, 48, -85, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5EC5E791258CE764L;
    }

    public Boolean id_break() {
        this.id_protected();
        if ((rrNw_1)this.id_class[id_byte[1]] instanceof rrNt_1) {
            rrNt_1 rrNt_12 = (rrNt_1)((rrNw_1)this.id_class[id_byte[2]]);
            rJY rJY2 = rrNt_12.id_throws();
            int n = rrNt_12.id_case();
            rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_byte[3]]).id_protected() : rJY2.id_class();
            rdb_3 rdb_32 = rdn_32.id_break();
            for (rrcA_2 rrcA_22 : (Set)rrcF_2.id_class[id_byte[4]]) {
                if (rrcA_22.id_break() != rdb_32) continue;
                rrcn_3[] rrcn_3Array = rrcA_22.id_class();
                int n2 = rrcn_3Array.length;
                for (int i = id_break[0]; i < n2; ++i) {
                    int n3;
                    rrcn_3 rrcn_32 = rrcn_3Array[i];
                    Predicate<rJY> predicate = rrcn_32.id_class();
                    if (predicate != null && !predicate.test(rJY2) || n != (n3 = rrcn_32.id_break())) continue;
                    return id_break[1];
                }
            }
        }
        return id_break[2];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcL_2.id_throws();
        rrcL_2.id_case();
    }

    private static void id_case() {
        id_byte = new short[5];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
        }
    }
}

