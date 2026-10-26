/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNi_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcX_2;
import celestial.rrcr_3;
import celestial.rrfM_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrNK
implements rrNi_1<rrfM_2> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new short[3];
    }

    public rrNK(BiFunction<rrNw_1, rdn_3, Integer> biFunction) {
        BiFunction<rrNw_1, rdn_3, Integer> biFunction2;
        this.id_protected();
        this.id_class[rrNK.id_byte[2]] = biFunction2 = biFunction;
    }

    static {
        rrNK.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{31, -25, 81, -53, -113, -55, 49, 31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9EBA7F984C870D9L;
    }

    @Override
    public boolean id_class(String string, List<rrNw_1> list, List<rrNd_1> list2, rrcr_3 rrcr_32) {
        Map<rrfM_2, Pair<rrNw_1, Integer>> map = this.id_class(list);
        if (map.isEmpty()) {
            return id_break[0];
        }
        boolean bl = id_break[1];
        for (rrNd_1 rrNd_12 : list2) {
            rrfM_2 rrfM_22 = null;
            Iterator<rrcT_2<?>> iterator = rrNd_12.id_instanceof().iterator();
            while (iterator.hasNext()) {
                rrcT_2<?> rrcT_22 = iterator.next();
                if (!(rrcT_22 instanceof rrcX_2)) continue;
                rrcX_2 rrcX_22 = (rrcX_2)rrcT_22;
                rrfM_22 = rrcX_22.id_class();
                break;
            }
            if (rrfM_22 == null || (iterator = map.get((Object)rrfM_22)) == null) continue;
            rrcr_32.accept(rrNd_12, (rrNw_1)iterator.getLeft(), (Integer)iterator.getRight());
            bl = id_break[2];
        }
        return bl;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x835AEE79;
    }

    public BiFunction<rrNw_1, rdn_3, Integer> id_class() {
        return (BiFunction)this.id_class[id_byte[1]];
    }

    @Override
    public Map<rrfM_2, Pair<rrNw_1, Integer>> id_class(List<rrNw_1> list) {
        HashMap<rrfM_2, Pair<rrNw_1, Integer>> hashMap = new HashMap<rrfM_2, Pair<rrNw_1, Integer>>();
        for (rrNw_1 rrNw_12 : list) {
            Pair pair;
            int n;
            rdn_3 rdn_32 = rrNw_12.id_protected();
            rrfM_2 rrfM_22 = rrfM_2.id_class(rdn_32);
            if (rrfM_22 == null || (n = ((Integer)((BiFunction)this.id_class[id_byte[0]]).apply(rrNw_12, rdn_32)).intValue()) <= 0 || (pair = (Pair)hashMap.get((Object)rrfM_22)) != null && (Integer)pair.getRight() <= n) continue;
            hashMap.put(rrfM_22, (Pair<rrNw_1, Integer>)Pair.of((Object)rrNw_12, (Object)n));
        }
        return hashMap;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNK.id_break();
        rrNK.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[3]];
        }
    }
}

