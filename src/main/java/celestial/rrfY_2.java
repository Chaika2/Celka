/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.rJY;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhz_3;
import celestial.rrfH_2;
import celestial.rrjc_3;
import celestial.rxH_2;
import celestial.rxJ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfY_2
implements MinecraftAccessor {
    private static byte[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x481B34C3;
    }

    public static int id_byte() {
        for (int i = id_byte[1]; i < id_class[4]; ++i) {
            if (!((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[4]]).id_implements[id_break[5]]).id_extends(i).id_class()) continue;
            return i;
        }
        return id_class[5];
    }

    static {
        rrfY_2.ntfClinit();
    }

    public static int id_class(Class<?> clazz) {
        if (clazz.isInstance(((cb_3)rrfY_2.id_import.id_class[id_break[14]]).ss().id_break())) {
            return id_class[15];
        }
        if (clazz.isInstance(((cb_3)rrfY_2.id_import.id_class[id_break[15]]).Sn().id_break())) {
            return id_class[16];
        }
        for (int i = id_byte[6]; i < id_class[17]; ++i) {
            if (!clazz.isInstance(((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[16]]).id_implements[id_break[17]]).id_extends(i).id_break())) continue;
            return i;
        }
        return id_class[18];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{88, 126, 89, -113, 97, 115, 35, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static boolean id_class(rdb_3 rdb_32) {
        return ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[34]]).id_implements[id_break[35]]).id_finally().id_break() == rdb_32 ? id_byte[11] : id_byte[12];
    }

    public static int id_class(rdb_3 rdb_32, Predicate<rdn_3> predicate) {
        int n = id_byte[3];
        for (int i = id_byte[4]; i < id_class[11]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[10]]).id_implements[id_break[11]]).id_extends(i);
            if (rdn_32.id_break() != rdb_32 || !predicate.test(rdn_32)) continue;
            ++n;
        }
        return n;
    }

    public static int id_class(boolean bl, boolean bl2) {
        int n;
        if (bl2) {
            if (((cb_3)rrfY_2.id_import.id_class[id_break[26]]).ss().id_break() == rdy_3.kc) {
                if (!rxH_2.id_protected(((cb_3)rrfY_2.id_import.id_class[id_break[27]]).ss())) {
                    return id_class[30];
                }
                return id_class[31];
            }
            if (((cb_3)rrfY_2.id_import.id_class[id_break[28]]).Sn().id_break() == rdy_3.kc) {
                if (!rxH_2.id_protected(((cb_3)rrfY_2.id_import.id_class[id_break[29]]).Sn())) {
                    return id_class[32];
                }
                return id_class[33];
            }
        }
        int n2 = n = bl ? id_class[34] : id_byte[9];
        while (n < id_class[35]) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[30]]).id_implements[id_break[31]]).id_extends(n);
            if (rdn_32.id_break() == rdy_3.kc && rxH_2.id_protected(rdn_32)) {
                return n;
            }
            ++n;
        }
        return id_class[36];
    }

    public static int id_class(boolean bl) {
        rxJ_2 rxJ_22;
        rdb_3 rdb_32 = ((cb_3)rrfY_2.id_import.id_class[id_break[22]]).ss().id_break();
        if (rdb_32 instanceof rxJ_2) {
            rxJ_2 rxJ_23 = (rxJ_2)rdb_32;
            if (rrjc_3.id_class(rxJ_23.id_catch())) {
                return id_class[24];
            }
        } else {
            rdb_32 = ((cb_3)rrfY_2.id_import.id_class[id_break[23]]).Sn().id_break();
            if (rdb_32 instanceof rxJ_2 && rrjc_3.id_class((rxJ_22 = (rxJ_2)rdb_32).id_catch())) {
                return id_class[25];
            }
        }
        for (int i = bl ? id_byte[8] : id_class[26]; i < (bl ? id_class[27] : id_class[28]); ++i) {
            rdb_32 = ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[24]]).id_implements[id_break[25]]).id_extends(i).id_break();
            if (!(rdb_32 instanceof rxJ_2) || !rrjc_3.id_class((rxJ_22 = (rxJ_2)rdb_32).id_catch())) continue;
            return i;
        }
        return id_class[29];
    }

    public static int id_class(int n) {
        return n >= id_class[41] && n <= id_class[42] ? n - id_class[43] : n;
    }

    public static int id_class() {
        for (int i = id_byte[10]; i < id_class[37]; ++i) {
            if (!((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[32]]).id_implements[id_break[33]]).id_extends(i).id_class()) continue;
            return i;
        }
        return id_class[38];
    }

    public static int id_class(rdb_3 rdb_32, boolean bl, boolean bl2) {
        int n;
        if (bl2) {
            if (((cb_3)rrfY_2.id_import.id_class[id_break[6]]).ss().id_break() == rdb_32) {
                return id_class[6];
            }
            if (((cb_3)rrfY_2.id_import.id_class[id_break[7]]).Sn().id_break() == rdb_32) {
                return id_class[7];
            }
        }
        int n2 = n = bl ? id_class[8] : id_byte[2];
        while (n < id_class[9]) {
            if (((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[8]]).id_implements[id_break[9]]).id_extends(n).id_break() == rdb_32) {
                return n;
            }
            ++n;
        }
        return id_class[10];
    }

    public static boolean id_class(List<rJY> list, boolean bl) {
        boolean bl2 = id_byte[14];
        for (rJY rJY2 : list) {
            if (bl && (rJY2.id_protected < id_class[46] || rJY2.id_protected > id_class[47]) || !rJY2.id_break()) continue;
            bl2 = id_byte[15];
            break;
        }
        return bl2;
    }

    public static int id_class(Class<?> clazz, boolean bl) {
        int n;
        if (clazz.isInstance(((cb_3)rrfY_2.id_import.id_class[id_break[18]]).ss().id_break())) {
            return id_class[19];
        }
        if (clazz.isInstance(((cb_3)rrfY_2.id_import.id_class[id_break[19]]).Sn().id_break())) {
            return id_class[20];
        }
        int n2 = n = bl ? id_class[21] : id_byte[7];
        while (n < id_class[22]) {
            if (clazz.isInstance(((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[20]]).id_implements[id_break[21]]).id_extends(n).id_break())) {
                return n;
            }
            ++n;
        }
        return id_class[23];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x522FF8CA116B8567L;
    }

    public static int id_class(rdn_3 rdn_32, rdb_3 rdb_32, Set<String> set) {
        if (rdn_32 == null) {
            return id_class[12];
        }
        for (int i = id_byte[5]; i < id_class[13]; ++i) {
            rdn_3 rdn_33 = ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[12]]).id_implements[id_break[13]]).id_extends(i);
            if (rdn_33.id_break() != rdb_32 || !rdn_3.id_break(rdn_33, rdn_32, set)) continue;
            return i;
        }
        return id_class[14];
    }

    public static int id_break(rdb_3 rdb_32) {
        if (((cb_3)rrfY_2.id_import.id_class[id_break[0]]).ss().id_break() == rdb_32) {
            return id_class[0];
        }
        if (((cb_3)rrfY_2.id_import.id_class[id_break[1]]).Sn().id_break() == rdb_32) {
            return id_class[1];
        }
        for (int i = id_byte[0]; i < id_class[2]; ++i) {
            if (((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[2]]).id_implements[id_break[3]]).id_extends(i).id_break() != rdb_32) continue;
            return i;
        }
        return id_class[3];
    }

    public static int id_break() {
        for (int i = id_byte[13]; i < id_class[44]; ++i) {
            rdn_3 rdn_32 = ((rhz_3)((cb_3)rrfY_2.id_import.id_class[rrfY_2.id_break[36]]).id_implements[id_break[37]]).id_extends(i);
            rdb_3 rdb_32 = rdn_32.id_break();
            if (!rrfH_2.id_class(rdn_32) || rdb_32.id_throws(rdn_32)) continue;
            return i;
        }
        return id_class[45];
    }

    public static int id_break(int n) {
        return n >= 0 && n < id_class[39] ? n + id_class[40] : n;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[16];
        blArray[11] = true;
        blArray[15] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfY_2.id_throws();
        rrfY_2.id_case();
        rrfY_2.id_protected();
    }

    private static void id_case() {
        id_break = new short[]{57, 57, 57, 1, 57, 1, 57, 57, 57, 1, 57, 1, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 1, 57, 57, 57, 57, 57, 1, 57, 1, 57, 1, 57, 1};
    }

    private static void id_protected() {
        id_class = new byte[]{-2, -3, 9, -1, 9, -1, -2, -3, 9, 45, -1, 45, -1, 45, -1, -2, -3, 9, -1, -2, -3, 9, 45, -1, -2, -3, 9, 9, 45, -1, -1, -2, -1, -3, 9, 45, -1, 36, -1, 9, 36, 36, 44, 36, 45, -1, 9, 44};
    }
}

