/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNi_1;
import celestial.rrNw_1;
import celestial.rrcr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrNR
implements rrNi_1<rdb_3> {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrNR(BiFunction<rrNw_1, rdn_3, Integer> biFunction, Predicate<rrNw_1> predicate) {
        Predicate<rrNw_1> predicate2;
        BiFunction<rrNw_1, rdn_3, Integer> biFunction2;
        this.id_case();
        this.id_class[rrNR.id_break[5]] = biFunction2 = biFunction;
        this.id_class[rrNR.id_break[6]] = predicate2 = predicate;
    }

    static {
        rrNR.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{45, 76, 78, 50, 73, 56, 39, -62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Map<rdb_3, Pair<rrNw_1, Integer>> id_class(List<rrNw_1> list) {
        HashMap<rdb_3, Pair<rrNw_1, Integer>> hashMap = new HashMap<rdb_3, Pair<rrNw_1, Integer>>();
        for (rrNw_1 rrNw_12 : list) {
            Pair pair;
            if ((Predicate)this.id_class[id_break[0]] != null && !((Predicate)this.id_class[id_break[1]]).test(rrNw_12)) continue;
            rdn_3 rdn_32 = rrNw_12.id_protected();
            rdb_3 rdb_32 = rdn_32.id_break();
            int n = (Integer)((BiFunction)this.id_class[id_break[2]]).apply(rrNw_12, rdn_32);
            if (n <= 0 || (pair = (Pair)hashMap.get(rdb_32)) != null && (Integer)pair.getRight() <= n) continue;
            hashMap.put(rdb_32, (Pair<rrNw_1, Integer>)Pair.of((Object)rrNw_12, (Object)n));
        }
        return hashMap;
    }

    @Override
    public boolean id_class(String string, List<rrNw_1> list, List<rrNd_1> list2, rrcr_3 rrcr_32) {
        Map<rdb_3, Pair<rrNw_1, Integer>> map = this.id_class(list);
        if (map.isEmpty()) {
            return id_protected[0];
        }
        boolean bl = id_protected[1];
        for (rrNd_1 rrNd_12 : list2) {
            rdb_3 rdb_32 = rrNd_12.id_catch();
            Pair<rrNw_1, Integer> pair = map.get(rdb_32);
            if (pair == null) continue;
            rrcr_32.accept(rrNd_12, (rrNw_1)pair.getLeft(), (Integer)pair.getRight());
            bl = id_protected[2];
        }
        return bl;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5FE4C8D3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6DCE44B3CF113DF1L;
    }

    public BiFunction<rrNw_1, rdn_3, Integer> id_class() {
        return (BiFunction)this.id_class[id_break[3]];
    }

    public Predicate<rrNw_1> id_break() {
        return (Predicate)this.id_class[id_break[4]];
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNR.id_protected();
        rrNR.id_throws();
        rrNR.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }
}

