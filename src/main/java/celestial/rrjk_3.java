/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wp_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rxJ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjk_3
implements MinecraftAccessor {
    private static boolean[] id_class;
    private static String[] id_break;

    public static boolean id_byte(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.kh || !rdn_32.id_final()) {
            return id_class[4];
        }
        return rdn_32.id_package().id_int(id_break[12]).id_native(id_break[13]).equals(id_break[14]);
    }

    static {
        rrjk_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, -12, 19, -89, -52, -61, -124, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF4951F90;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x48A098D31F25E4EEL;
    }

    private static void id_class() {
        id_break = new String[]{new String("kringeItems"), new String("type"), new String("SnowBall"), new String("kringeItems"), new String("type"), new String("ExplosiveStuff"), new String("pyrotechnic-item"), new String("name"), new String("STUN_STAR"), new String("pyrotechnic-item"), new String("name"), new String("EXPLOSIVE_TRAP"), new String("pyrotechnic-item"), new String("name"), new String("ALTERNATIVE_TRAP"), new String("backpack-inventory")};
    }

    public static boolean id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.dA || !rdn_32.id_final()) {
            return id_class[3];
        }
        return rdn_32.id_package().id_int(id_break[9]).id_native(id_break[10]).equals(id_break[11]);
    }

    public static boolean id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.xa || !rdn_32.id_final()) {
            return id_class[1];
        }
        return rdn_32.id_package().id_int(id_break[3]).id_native(id_break[4]).equals(id_break[5]);
    }

    private static void id_break() {
        id_class = new boolean[6];
    }

    public static boolean id_throws(rdn_3 rdn_32) {
        rxJ_2 rxJ_22;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (!(rdb_32 instanceof rxJ_2) || !((rxJ_22 = (rxJ_2)rdb_32).id_catch() instanceof Wp_1)) {
            return id_class[5];
        }
        return rdn_32.id_protected(id_break[15]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjk_3.id_break();
        rrjk_3.id_class();
    }

    public static boolean id_case(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.hU || !rdn_32.id_final()) {
            return id_class[0];
        }
        return rdn_32.id_package().id_int(id_break[0]).id_native(id_break[1]).equals(id_break[2]);
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.dQ || !rdn_32.id_final()) {
            return id_class[2];
        }
        return rdn_32.id_package().id_int(id_break[6]).id_native(id_break[7]).equals(id_break[8]);
    }
}

