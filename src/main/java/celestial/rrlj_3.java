/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rxK_2;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlj_3
implements Comparator<Pair<rdn_3, Integer>> {
    private static boolean[] id_class;
    private static byte[] id_break;

    static {
        rrlj_3.ntfClinit();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((Pair<rdn_3, Integer>)((Pair)object), (Pair<rdn_3, Integer>)((Pair)object2));
    }

    public int id_class(Pair<rdn_3, Integer> pair, Pair<rdn_3, Integer> pair2) {
        rdn_3 rdn_32 = (rdn_3)pair.getLeft();
        rdn_3 rdn_33 = (rdn_3)pair2.getLeft();
        rdb_3 rdb_32 = rdn_32.id_break();
        rdb_3 rdb_33 = rdn_33.id_break();
        rxK_2 rxK_22 = rdb_32.id_this();
        rxK_2 rxK_23 = rdb_33.id_this();
        return ComparisonChain.start().compare(this.id_class(rdb_33), this.id_class(rdb_32)).compareTrueFirst(rxK_22.id_catch(), rxK_23.id_catch()).compare(rxK_22.id_class(), rxK_23.id_class()).compare(rxK_22.id_break(), rxK_23.id_break()).compare(rdn_32.id_short(), rdn_33.id_short()).result();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7D79A40C;
    }

    private int id_class(rdb_3 rdb_32) {
        if (rdb_32 == rdy_3.hp) {
            return id_break[0];
        }
        if (rdb_32 == rdy_3.hy) {
            return id_class[0];
        }
        return id_class[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-63, 95, 14, 23, -42, 83, -55, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new byte[]{2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x20188E02E1397F43L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlj_3.id_break();
        rrlj_3.id_class();
    }
}

