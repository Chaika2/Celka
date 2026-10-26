/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcm_3;
import celestial.rrfI_2;
import celestial.util.FuntimeEnchantment;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcu_3
implements rrcT_2<Boolean> {
    private static boolean[] id_class;
    private static String[] id_break;

    static {
        rrcu_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25D0531B;
    }

    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcm_3(this, rrNw_12, rrNd_12);
    }

    public boolean id_class(rrNd_1 rrNd_12, rdn_3 rdn_32, List<FuntimeEnchantment> list) {
        List<FuntimeEnchantment> list2 = rrNd_12.id_throw();
        if (list2 == null || list2.isEmpty()) {
            return id_class[0];
        }
        if (list.isEmpty()) {
            return id_class[1];
        }
        if (list2.size() != list.size()) {
            return id_class[2];
        }
        if (rdn_32.id_protected(id_break[0])) {
            return id_class[3];
        }
        for (FuntimeEnchantment funtimeEnchantment : list2) {
            boolean bl = id_class[4];
            for (FuntimeEnchantment funtimeEnchantment2 : list) {
                if (!funtimeEnchantment2.id_class().equals(funtimeEnchantment.id_class()) || funtimeEnchantment2.id_break() < funtimeEnchantment.id_break()) continue;
                bl = id_class[5];
                break;
            }
            if (bl) continue;
            return id_class[6];
        }
        return id_class[7];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, -109, -82, -78, -10, 25, -70, 102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB96213E58AD45E7L;
    }

    public boolean id_class(rrNd_1 rrNd_12, List<FuntimeEnchantment> list) {
        List<FuntimeEnchantment> list2 = rrNd_12.id_interface();
        if (list2 == null || list2.isEmpty()) {
            return id_class[10];
        }
        if (list.isEmpty()) {
            return id_class[11];
        }
        for (FuntimeEnchantment funtimeEnchantment : list2) {
            String string = funtimeEnchantment.id_class();
            int n = funtimeEnchantment.id_break();
            boolean bl = id_class[12];
            for (FuntimeEnchantment funtimeEnchantment2 : list) {
                if (!funtimeEnchantment2.id_class().equals(string) || funtimeEnchantment2.id_break() < n) continue;
                bl = id_class[13];
                break;
            }
            if (bl) continue;
            return id_class[14];
        }
        return id_class[15];
    }

    private static void id_class() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[15] = true;
        id_class = blArray;
    }

    private static void id_break() {
        id_break = new String[]{new String("StoredEnchantments")};
    }

    public boolean id_break(rrNd_1 rrNd_12, List<FuntimeEnchantment> list) {
        List<FuntimeEnchantment> list2 = rrNd_12.id_this();
        if (list2 != null && !list2.isEmpty()) {
            for (FuntimeEnchantment funtimeEnchantment : list2) {
                String string = funtimeEnchantment.id_class();
                int n = funtimeEnchantment.id_break();
                for (FuntimeEnchantment funtimeEnchantment2 : list) {
                    if (!funtimeEnchantment2.id_class().equals(string) || funtimeEnchantment2.id_break() < n) continue;
                    return id_class[8];
                }
            }
        }
        return id_class[9];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcu_3.id_class();
        rrcu_3.id_break();
    }
}

