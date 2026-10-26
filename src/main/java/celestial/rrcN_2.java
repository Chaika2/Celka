/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eY_2;
import celestial.ev_3;
import celestial.rdn_3;
import celestial.rrIk_1;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcc_3;
import celestial.rrfA_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcN_2
implements rrcT_2<Boolean> {
    private static boolean[] id_class;
    private static String[] id_break;

    static {
        rrcN_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5AD3BC4;
    }

    public boolean id_class(rrNd_1 rrNd_12, rdn_3 rdn_32, Map<ev_3, Integer> map) {
        List<rrfA_2> list = rrNd_12.id_super();
        if (list == null || list.isEmpty()) {
            return id_class[0];
        }
        if (map.isEmpty()) {
            return id_class[1];
        }
        if (list.size() != map.size()) {
            return id_class[2];
        }
        if (rdn_32.id_protected(id_break[0])) {
            return id_class[3];
        }
        for (rrfA_2 rrfA_22 : list) {
            Integer n = map.get(rrfA_22.id_break());
            if (n != null && n.intValue() == rrfA_22.id_class()) continue;
            return id_class[4];
        }
        return id_class[5];
    }

    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcc_3(this, rrNw_12, rrNd_12);
    }

    private static void id_class() {
        id_break = new String[]{new String("custom-enchantments")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -92, -52, 41, 117, -122, -98, 89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(rrNd_1 rrNd_12, Map<ev_3, Integer> map) {
        List<rrfA_2> list = rrNd_12.id_goto();
        if (list != null && !list.isEmpty()) {
            for (rrfA_2 rrfA_22 : list) {
                rrIk_1 rrIk_12;
                ev_3 ev_32 = rrfA_22.id_break();
                int n = rrfA_22.id_class();
                if (ev_32 == eY_2.id_private && (rrIk_12 = rrNd_12.id_final()) != null && rrIk_12.id_class().booleanValue() || !map.containsKey(ev_32) || map.get(ev_32) < n) continue;
                return id_class[6];
            }
        }
        return id_class[7];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCDC8DFD923D37C96L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[12] = true;
        id_class = blArray;
    }

    public boolean id_break(rrNd_1 rrNd_12, Map<ev_3, Integer> map) {
        List<rrfA_2> list = rrNd_12.id_new();
        if (list == null || list.isEmpty()) {
            return id_class[8];
        }
        if (map.isEmpty()) {
            return id_class[9];
        }
        for (rrfA_2 rrfA_22 : list) {
            ev_3 ev_32 = rrfA_22.id_break();
            int n = rrfA_22.id_class();
            if (map.containsKey(ev_32)) {
                int n2 = map.get(ev_32);
                if (n2 >= n) continue;
                return id_class[10];
            }
            return id_class[11];
        }
        return id_class[12];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcN_2.id_break();
        rrcN_2.id_class();
    }
}

