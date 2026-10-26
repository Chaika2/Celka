/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bd_1;
import celestial.C_class;
import celestial.Pv_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rrLF;
import celestial.rrLv_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bx_1
extends Pv_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_break;
    private static String[] id_case;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new Bd_1(), Map.of(id_case[2], id_case[3]), Map.of(id_case[4], id_case[5], id_case[6], id_case[7])};
        id_break = objectArray;
    }

    public Bx_1(C_class c_class) {
        super(c_class);
    }

    static {
        Bx_1.ntfClinit();
    }

    @Override
    public void id_class(rrLF rrLF2) {
        if (!this.id_case()) {
            return;
        }
        rnB_2 rnB_22 = rrLF2.id_break();
        rgP_2 rgP_22 = rrLF2.id_class();
        String string = rgP_22.getString();
        if (rnB_22.id_class() != null && rnB_22.id_class().contains(id_case[1])) {
            return;
        }
        if (!rgP_22.id_protected().isEmpty()) {
            return;
        }
        for (Map.Entry entry : ((Map)id_break[id_protected[2]]).entrySet()) {
            String string2 = (String)entry.getKey();
            String string3 = (String)entry.getValue();
            if (!string.equals(string2)) continue;
            string = string.replace(string2, string3);
        }
        rrLF2.id_class(string.isEmpty() ? rgN_2.id_byte : new rgN_2(string));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF53A0C54EDBFB1B2L;
    }

    private static void id_class() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        id_protected = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2B704818;
    }

    @Override
    public void id_class(rrLv_1 rrLv_12) {
        Object object;
        if (!this.id_case()) {
            return;
        }
        rnB_2 rnB_22 = rrLv_12.id_break();
        rgP_2 rgP_22 = rrLv_12.id_class();
        String string = rgP_22.getString();
        if (string.isEmpty() || rnB_22.id_class() != null && rnB_22.id_class().contains(id_case[0])) {
            return;
        }
        rVi_1 rVi_12 = rgP_22.id_throws();
        if (rVi_12 instanceof rgN_2) {
            rgN_2 rgN_22 = (rgN_2)rVi_12;
            object = rgN_22.id_private();
            for (Map.Entry entry : ((Map)id_break[id_protected[0]]).entrySet()) {
                String string2 = (String)entry.getKey();
                String string3 = (String)entry.getValue();
                if (!((String)object).contains(string2)) continue;
                object = ((String)object).replace(string2, string3);
            }
            rVi_12 = new rgN_2((String)object);
        }
        for (int i = id_throws[0]; i < rgP_22.id_protected().size(); ++i) {
            object = rgP_22.id_protected().get(i);
            String string4 = object.getString();
            if (string4.isBlank() || ((Map)id_break[id_protected[1]]).containsKey(string4)) continue;
            rVi_12.id_class((rgP_2)object);
            rVi_12.id_class(object.id_class());
        }
        rrLv_12.id_class(rVi_12);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, 6, 109, -9, -98, -45, 55, 36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_case = new String[]{new String("-"), new String("-"), new String("\u25cf"), new String(""), new String(" \u00a7e"), new String(""), new String(" \u00a7r"), new String("")};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Bx_1.id_throws();
        Bx_1.id_break();
        Bx_1.id_class();
        Bx_1.id_protected();
        Bx_1.id_byte();
    }

    private boolean id_case() {
        return (rrfq_3)((Object)rrfp_3.id_class[id_protected[3]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[4]]) || (rrfq_3)((Object)rrfp_3.id_class[id_protected[5]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[6]]) ? id_throws[1] : id_throws[2];
    }

    private static void id_protected() {
        id_byte = new byte[]{2, 3};
    }
}

