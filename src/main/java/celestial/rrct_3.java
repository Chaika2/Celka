/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcw_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrct_3
implements rrcT_2<Boolean> {
    private static String[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    public boolean id_byte(rrNd_1 rrNd_12, List<String> list) {
        List<String> list2 = rrNd_12.id_extends();
        if (list2 == null || list2.isEmpty()) {
            return id_break[11];
        }
        if (list == null || list.isEmpty()) {
            return id_break[12];
        }
        for (String string : list2) {
            boolean bl = id_break[13];
            for (String string2 : list) {
                if (!string2.equalsIgnoreCase(string)) continue;
                bl = id_break[14];
                break;
            }
            if (bl) continue;
            return id_break[15];
        }
        return id_break[16];
    }

    private static void id_byte() {
        id_class = new String[]{new String("display"), new String("Lore"), new String("Lore")};
    }

    static {
        rrct_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB3A9ADF;
    }

    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcw_3(this, rrNw_12, rrNd_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE2B83C9ED0804F1L;
    }

    public boolean id_class(rrNd_1 rrNd_12, List<String> list) {
        List<String> list2 = rrNd_12.id_try();
        if (list2 == null || list2.isEmpty()) {
            return id_break[0];
        }
        if (list == null || list.isEmpty()) {
            return id_break[1];
        }
        if (list2.size() != list.size()) {
            return id_break[2];
        }
        for (String string : list2) {
            boolean bl = id_break[3];
            for (String string2 : list) {
                if (!string2.equalsIgnoreCase(string)) continue;
                bl = id_break[4];
                break;
            }
            if (bl) continue;
            return id_break[5];
        }
        return id_break[6];
    }

    private static void id_class() {
        id_byte = new byte[]{9, 8};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, -128, -23, 114, -54, 106, 75, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<String> id_class(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        rcd_3 rcd_33 = rcd_32.id_int(id_class[0]);
        if (rcd_33.id_protected(id_class[1]) != id_byte[0]) {
            return null;
        }
        rcy_3 rcy_32 = rcd_33.id_protected(id_class[2], id_byte[1]);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = id_break[17]; i < rcy_32.size(); ++i) {
            String string = rrct_3.id_break(rcy_32.id_implements(i));
            if (string == null) continue;
            arrayList.add(string.toLowerCase());
        }
        return arrayList;
    }

    private static String id_break(String string) {
        try {
            rVi_1 rVi_12 = rgB_2.id_class(string);
            return rVi_12.id_byte();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public boolean id_break(rrNd_1 rrNd_12, List<String> list) {
        List<String> list2 = rrNd_12.id_int();
        if (list2 == null || list2.isEmpty()) {
            return id_break[7];
        }
        if (list == null || list.isEmpty()) {
            return id_break[8];
        }
        for (String string : list2) {
            for (String string2 : list) {
                if (!string2.contains(string.toLowerCase())) continue;
                return id_break[9];
            }
        }
        return id_break[10];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[18];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrct_3.id_break();
        rrct_3.id_byte();
        rrct_3.id_class();
    }
}

