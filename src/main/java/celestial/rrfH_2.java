/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.ev_3;
import celestial.iB_2;
import celestial.rAB;
import celestial.rLD;
import celestial.rLY;
import celestial.rXQ;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rpm_3;
import celestial.rxE_2;
import celestial.rxS_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfH_2
implements MinecraftAccessor {
    private static boolean[] id_class;
    private static byte[] id_break;
    private static double[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2};
    }

    public static boolean id_byte(rdb_3 rdb_32) {
        return rdb_32.id_super() || rdb_32.id_synchronized() || rdb_32 == rdy_3.JA || rdb_32 == rdy_3.hi || rdb_32 == rdy_3.OM || rdb_32 == rdy_3.kU || rdb_32 == rdy_3.kN || rdb_32 == rdy_3.dc ? id_class[13] : id_class[14];
    }

    public static double id_byte(rdn_3 rdn_32) {
        double d = id_byte[0];
        Object object = rdn_32.id_break();
        if (object instanceof rxS_2) {
            rxS_2 rxS_22 = (rxS_2)object;
            object = rxS_22.id_throws();
            d += (double)object.id_case();
        }
        return d;
    }

    static {
        rrfH_2.ntfClinit();
    }

    public static Pair<rdn_3, rpm_3> id_class(iB_2 iB_22, Predicate<rdn_3> predicate) {
        rpm_3[] rpm_3Array = rpm_3.values();
        int n = rpm_3Array.length;
        for (int i = id_class[1]; i < n; ++i) {
            rpm_3 rpm_32 = rpm_3Array[i];
            rdn_3 rdn_32 = iB_22.id_protected(rpm_32);
            if (!predicate.test(rdn_32)) continue;
            return Pair.of((Object)rdn_32, (Object)((Object)rpm_32));
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9311F836;
    }

    public static rpm_3 id_class(iB_2 iB_22, rdb_3 rdb_32) {
        rpm_3[] rpm_3Array = rpm_3.values();
        int n = rpm_3Array.length;
        for (int i = id_class[0]; i < n; ++i) {
            rpm_3 rpm_32 = rpm_3Array[i];
            if (iB_22.id_protected(rpm_32).id_break() != rdb_32) continue;
            return rpm_32;
        }
        return null;
    }

    public static rdb_3 id_class(rdb_3 rdb_32, rXQ rXQ2) {
        rxS_2 rxS_22;
        return rdb_32 instanceof rxS_2 && (rxS_22 = (rxS_2)rdb_32).id_byte() == rXQ2 ? rdb_32 : null;
    }

    public static rpm_3 id_class(iB_2 iB_22, rdb_3 ... rdb_3Array) {
        rpm_3[] rpm_3Array = rpm_3.values();
        int n = rpm_3Array.length;
        for (int i = id_class[2]; i < n; ++i) {
            rpm_3 rpm_32 = rpm_3Array[i];
            rdb_3[] rdb_3Array2 = rdb_3Array;
            int n2 = rdb_3Array2.length;
            for (int j = id_class[3]; j < n2; ++j) {
                rdb_3 rdb_32 = rdb_3Array2[j];
                if (iB_22.id_protected(rpm_32).id_break() != rdb_32) continue;
                return rpm_32;
            }
        }
        return null;
    }

    public static rdn_3[] id_class(iB_2 iB_22) {
        rdn_3[] rdn_3Array = new rdn_3[id_break[0]];
        rdn_3Array[rrfH_2.id_class[4]] = iB_22.ss();
        rdn_3Array[rrfH_2.id_class[5]] = iB_22.Sn();
        return rdn_3Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -26, -85, -95, -60, 43, 33, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new double[1];
    }

    public static boolean id_class(rdb_3 rdb_32) {
        rxS_2 rxS_22;
        return rdb_32 instanceof rxS_2 && (rxS_22 = (rxS_2)rdb_32).id_throws() == rxE_2.NETHERITE ? id_class[15] : id_class[16];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA68208D886D680F3L;
    }

    @SafeVarargs
    public static boolean id_class(rdn_3 rdn_32, Pair<Integer, ev_3> ... pairArray) {
        if (!rdn_32.id_public()) {
            return id_class[17];
        }
        Pair<Integer, ev_3>[] pairArray2 = pairArray;
        int n = pairArray2.length;
        for (int i = id_class[18]; i < n; ++i) {
            Pair<Integer, ev_3> pair = pairArray2[i];
            for (Map.Entry<ev_3, Integer> entry : rdn_32.id_static().entrySet()) {
                if (entry.getKey() != pair.getRight() || entry.getValue() < (Integer)pair.getLeft()) continue;
                return id_class[19];
            }
        }
        return id_class[20];
    }

    public static boolean id_class(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32 == rdy_3.hy || rdb_32 == rdy_3.hp ? id_class[6] : id_class[7];
    }

    public static boolean id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.JA) {
            return id_class[10];
        }
        for (rLY rLY2 : rAB.id_class(rdn_32)) {
            if (rLY2.id_class() != rLD.id_case) continue;
            return id_class[11];
        }
        return id_class[12];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[21];
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[19] = true;
        id_class = blArray;
    }

    public static boolean id_break(rdb_3 rdb_32) {
        return rdb_32 == rdy_3.kk ? id_class[8] : id_class[9];
    }

    private static /* synthetic */ void ntfClinit() {
        rrfH_2.id_break();
        rrfH_2.id_class();
        rrfH_2.id_byte();
    }
}

