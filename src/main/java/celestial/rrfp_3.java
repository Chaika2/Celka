/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ak_1;
import celestial.Aq_1;
import celestial.Aw_1;
import celestial.C_throws;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rrfq_3;
import celestial.rud_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfp_3
implements MinecraftAccessor {
    private static boolean[] id_break;
    private static short[] id_byte;
    public static Object[] id_class;
    private static String[] id_protected;
    private static byte[] id_throws;

    public static int id_byte() {
        Aq_1 aq_1 = id_import.id_void();
        if ((cb_3)rrfp_3.id_import.id_class[id_byte[0]] == null || aq_1 == null || aq_1.id_class(((cb_3)rrfp_3.id_import.id_class[id_byte[1]]).ro()) == null) {
            return id_break[6];
        }
        return aq_1.id_class(((cb_3)rrfp_3.id_import.id_class[id_byte[2]]).ro()).id_byte();
    }

    static {
        rrfp_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8D64559C;
    }

    public static boolean id_class(String ... stringArray) {
        String string;
        String string2 = string = id_import.S() == null ? null : rrfp_3.id_import.S().id_break;
        if (string == null) {
            return id_break[1];
        }
        if (id_import.id_finally()) {
            return id_break[2];
        }
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        for (int i = id_break[3]; i < n; ++i) {
            String string3 = stringArray2[i];
            if (!string.contains(string3)) continue;
            return id_break[4];
        }
        return id_break[5];
    }

    public static boolean id_class(Aw_1 aw_1) {
        for (Aw_1 aw_12 : id_import.id_void().id_throws()) {
            if (!aw_12.id_class().getName().equals(aw_1.id_class().getName())) continue;
            return id_break[7];
        }
        return id_break[8];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x809FD21728D51C11L;
    }

    public static void id_class(rrfq_3 rrfq_32, rud_3 rud_32) {
    }

    public static Aw_1 id_class(String string) {
        for (Aw_1 aw_1 : ((Aq_1)((cb_3)rrfp_3.id_import.id_class[rrfp_3.id_byte[3]]).id_break[id_byte[4]]).id_throws()) {
            if (!aw_1.id_class().getName().equalsIgnoreCase(string)) continue;
            return aw_1;
        }
        return null;
    }

    public static boolean id_class() {
        return ((gm_3)rrfp_3.id_import.id_class[id_byte[8]]).E().id_class().id_break().equals(id_protected[0]);
    }

    public static void id_break(rrfq_3 rrfq_32, rud_3 rud_32) {
        if ((rrfq_3)((Object)id_class[id_byte[9]]) != rrfq_32) {
            rrfq_3 rrfq_33 = rrfq_32;
            rrfp_3.id_class[rrfp_3.id_byte[10]] = rrfq_33;
            if ((rrfq_3)((Object)id_class[id_byte[11]]) != null) {
                rrfp_3.id_class(rrfq_32, rud_32);
            }
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, -122, -82, -82, 125, 68, -114, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrfq_3 id_break() {
        rrfq_3[] rrfq_3Array = rrfq_3.values();
        int n = rrfq_3Array.length;
        for (int i = id_break[0]; i < n; ++i) {
            rrfq_3 rrfq_32 = rrfq_3Array[i];
            if (!rrfp_3.id_class(rrfq_32.id_class())) continue;
            return rrfq_32;
        }
        return null;
    }

    public static String id_throws() {
        if (id_import.id_finally()) {
            return id_protected[1];
        }
        Ak_1 ak_1 = id_import.S();
        return ak_1 == null ? null : ak_1.id_break;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfp_3.id_private();
        rrfp_3.id_extends();
        rrfp_3.id_finally();
        rrfp_3.id_implements();
        rrfp_3.id_catch();
    }

    private static void id_finally() {
        short[] sArray = new short[14];
        sArray[0] = 57;
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[6] = 57;
        sArray[8] = 56;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 4;
        id_byte = sArray;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[2];
        id_class = objectArray;
    }

    private static void id_extends() {
        id_protected = new String[]{new String("world_spawn"), new String("localhost"), new String("Via Version"), new String("\u041f\u043e\u0436\u0430\u043b\u0443\u0439\u0441\u0442\u0430, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u0432\u0435\u0440\u0441\u0438\u044e 1.16 \u0434\u043b\u044f \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u043a \u044d\u0442\u043e\u043c\u0443 \u0441\u0435\u0440\u0432\u0435\u0440\u0443")};
    }

    public static List<rrZk_1> id_case() {
        Map<String, rrZk_1> map = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_byte[5]]).id_class();
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<rrZk_1> arrayList = new ArrayList<rrZk_1>();
        for (Aw_1 aw_1 : ((Aq_1)((cb_3)rrfp_3.id_import.id_class[rrfp_3.id_byte[6]]).id_break[id_byte[7]]).id_throws()) {
            String string = aw_1.id_class().getName().toLowerCase();
            rrZk_1 rrZk_12 = map.get(string);
            if (rrZk_12 == null) continue;
            arrayList.add(rrZk_12);
        }
        return arrayList;
    }

    private static void id_implements() {
        id_throws = new byte[]{2};
    }

    public static String id_protected() {
        return C_throws.id_byte().id_continue().id_byte();
    }

    private static void id_private() {
        boolean[] blArray = new boolean[9];
        blArray[4] = true;
        blArray[7] = true;
        id_break = blArray;
    }
}

