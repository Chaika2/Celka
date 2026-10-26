/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.module.combat.AutoSwap;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrCh_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrCd_1
implements rrCh_1 {
    private static boolean[] id_class;
    private static byte[] id_break;
    private static String[] id_byte;

    @Override
    public Comparator<Pair<rdn_3, Integer>> id_byte(AutoSwap autoSwap) {
        return Comparator.comparingInt(pair -> {
            rdn_3 rdn_32 = (rdn_3)pair.getLeft();
            if (autoSwap.id_try()) {
                if (rdn_32.id_protected(id_byte[0])) {
                    return id_break[0];
                }
                if (rdn_32.id_public()) {
                    return id_class[2];
                }
                return id_class[3];
            }
            if (rdn_32.id_protected(id_byte[1])) {
                return id_break[1];
            }
            if (rdn_32.id_public()) {
                return id_class[4];
            }
            return id_class[5];
        });
    }

    private static void id_byte() {
        id_break = new byte[]{-1, 2};
    }

    static {
        rrCd_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x82542023207E647FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB600EDEE;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, -13, 36, 3, -64, -61, 118, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.kL;
    }

    @Override
    public boolean id_class(AutoSwap autoSwap) {
        if (autoSwap.id_try()) {
            return id_class[0];
        }
        return id_class[1];
    }

    @Override
    public Predicate<rdn_3> id_break(AutoSwap autoSwap) {
        return rdn_32 -> rdn_32.id_break() == this.id_class() ? id_class[6] : id_class[7];
    }

    private static void id_break() {
        id_byte = new String[]{new String("AttributeModifiers"), new String("AttributeModifiers")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrCd_1.id_protected();
        rrCd_1.id_break();
        rrCd_1.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_class = blArray;
    }
}

