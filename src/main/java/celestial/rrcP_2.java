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
import celestial.rrcr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrcP_2
implements rrNi_1<String> {
    private static String[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("Shulker"), new String("Shulker"), new String("Shulker")};
    }

    public rrcP_2(BiFunction<rrNw_1, rdn_3, Integer> biFunction) {
        BiFunction<rrNw_1, rdn_3, Integer> biFunction2;
        this.id_class();
        this.id_class[rrcP_2.id_byte[1]] = biFunction2 = biFunction;
    }

    static {
        rrcP_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x92716DAA965C2B63L;
    }

    @Override
    public boolean id_class(String string, List<rrNw_1> list, List<rrNd_1> list2, rrcr_3 rrcr_32) {
        Map<String, Pair<rrNw_1, Integer>> map = this.id_class(list);
        if (map.isEmpty()) {
            return id_protected[0];
        }
        boolean bl = id_protected[1];
        for (rrNd_1 rrNd_12 : list2) {
            Pair<rrNw_1, Integer> pair = map.get(id_break[0]);
            if (pair == null) continue;
            rrcr_32.accept(rrNd_12, (rrNw_1)pair.getLeft(), (Integer)pair.getRight());
            bl = id_protected[2];
        }
        return bl;
    }

    @Override
    public Map<String, Pair<rrNw_1, Integer>> id_class(List<rrNw_1> list) {
        HashMap<String, Pair<rrNw_1, Integer>> hashMap = new HashMap<String, Pair<rrNw_1, Integer>>();
        for (rrNw_1 rrNw_12 : list) {
            Pair pair;
            rdn_3 rdn_32;
            int n = (Integer)((BiFunction)this.id_class[id_byte[0]]).apply(rrNw_12, rdn_32 = rrNw_12.id_protected());
            if (n <= 0 || (pair = (Pair)hashMap.get(id_break[1])) != null && (Integer)pair.getRight() <= n) continue;
            hashMap.put(id_break[2], (Pair<rrNw_1, Integer>)Pair.of((Object)rrNw_12, (Object)n));
        }
        return hashMap;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[3]];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDF75DD05;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, -91, 69, 68, 22, -6, -52, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcP_2.id_protected();
        rrcP_2.id_byte();
        rrcP_2.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }
}

