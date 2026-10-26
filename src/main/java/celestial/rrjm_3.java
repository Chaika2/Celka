/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjm_3 {
    public static Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    static {
        rrjm_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, 104, 90, 79, 75, 83, 61, 61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static List<rdn_3> id_class(rdn_3 rdn_32) {
        rcy_3 rcy_32;
        boolean bl;
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 == null) {
            return Collections.emptyList();
        }
        boolean bl2 = bl = (rrfq_3)((Object)rrfp_3.id_class[id_break[0]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[1]]) && rdn_32.id_protected(id_protected[0]) ? id_throws[0] : id_throws[1];
        if (bl) {
            rcy_32 = rcd_32.id_protected(id_protected[1], id_byte[0]);
        } else {
            rcd_3 rcd_33 = rcd_32.id_int(id_protected[2]);
            if (!rcd_33.id_throws(id_protected[3])) {
                return Collections.emptyList();
            }
            rcy_32 = rcd_33.id_protected(id_protected[4], id_byte[1]);
        }
        int n = rcy_32.size();
        if (n == 0) {
            return Collections.emptyList();
        }
        ArrayList<rdn_3> arrayList = new ArrayList<rdn_3>(n);
        for (int i = id_throws[2]; i < n; ++i) {
            rcd_3 rcd_34 = rcy_32.id_class(i);
            rdn_3 rdn_33 = rdn_3.id_class(!bl ? rcd_34 : rcd_34.id_int(id_protected[5]));
            arrayList.add(rdn_33);
        }
        return arrayList;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x66126B2A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAC1FA07E9235991CL;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{id_protected[6], id_protected[7], 10};
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new byte[]{10, 10, 3, 2, 10};
    }

    private static void id_throws() {
        id_break = new short[]{1, 6};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjm_3.id_byte();
        rrjm_3.id_protected();
        rrjm_3.id_throws();
        rrjm_3.id_break();
        rrjm_3.id_class();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("backpack-inventory"), new String("backpack-inventory"), new String("BlockEntityTag"), new String("Items"), new String("Items"), new String("item"), new String("BlockEntityTag"), new String("Items")};
    }
}

