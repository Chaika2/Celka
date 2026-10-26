/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package celestial;

import celestial.PI;
import celestial.Pf_1;
import celestial.Wg_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cq_3;
import celestial.gm_3;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rpr_3;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjs_3;
import celestial.rrjx_3;
import celestial.rxJ_2;
import celestial.util.FuntimeEnchantment;
import celestial.util.MinecraftAccessor;
import celestial.xC_2;
import celestial.xd_3;
import celestial.zG_2;
import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjS_2
implements MinecraftAccessor {
    private static String[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_class;

    public static boolean id_byte() {
        return rrjS_2.id_break(id_break[9]);
    }

    public static boolean id_byte(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.K ? id_throws[5] : id_throws[6];
    }

    private static List<? extends rrjx_3> id_byte(String string) {
        List<rrjs_3> list = rrjS_2.id_private();
        if (list.get(id_throws[13]).id_class().equalsIgnoreCase(string)) {
            return list;
        }
        return null;
    }

    static {
        rrjS_2.ntfClinit();
    }

    private static int id_class(List<? extends rrjx_3> list, PI pI) {
        if (pI == null || pI.id_class() == null) {
            return id_protected[3];
        }
        String string = pI.id_class().id_class();
        String string2 = pI.id_break();
        int n = id_protected[4];
        for (int i = id_throws[11]; i < list.size(); ++i) {
            rrjx_3 rrjx_32 = list.get(i);
            if (String.valueOf(rrjx_32.id_break()).equals(string2)) {
                String[] stringArray = rrjx_32.id_byte();
                int n2 = stringArray.length;
                for (int j = id_throws[12]; j < n2; ++j) {
                    String string3 = stringArray[j];
                    if (!string3.equalsIgnoreCase(string)) continue;
                    n = i;
                    break;
                }
            }
            if (n != id_protected[5]) break;
        }
        return n;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 36, 115, -107, -3, 25, 74, -103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x371FF5E;
    }

    public static boolean id_class(rdn_3 rdn_32, xd_3 xd_32, rfH_2 rfH_22, rpr_3 rpr_32) {
        rxJ_2 rxJ_22;
        if (rpr_32 != rpr_3.UP) {
            return id_throws[3];
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxJ_2 && ((Predicate)id_class[id_byte[0]]).test((rxJ_22 = (rxJ_2)rdb_32).id_catch())) {
            return id_throws[4];
        }
        return ((Predicate)id_class[id_byte[1]]).test(xd_32);
    }

    public static rrjx_3 id_class(PI pI) {
        if (pI == null || pI.id_class() == null) {
            return null;
        }
        Pf_1 pf_1 = pI.id_class();
        if (pf_1 == (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_byte[5]])) {
            return null;
        }
        String string = pI.id_break();
        String string2 = pf_1.id_class();
        List<? extends rrjx_3> list = rrjS_2.id_byte(string2);
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (rrjx_3 rrjx_32 : list) {
            if (!String.valueOf(rrjx_32.id_break()).equals(string)) continue;
            String[] stringArray = rrjx_32.id_byte();
            int n = stringArray.length;
            for (int i = id_throws[10]; i < n; ++i) {
                String string3 = stringArray[i];
                if (!string3.equalsIgnoreCase(string2)) continue;
                return rrjx_32;
            }
        }
        return null;
    }

    public static boolean id_class() {
        return rrjS_2.id_break(id_break[10]);
    }

    public static rrjx_3 id_class(PI pI, int n) {
        if (pI == null || pI.id_class() == null || n == 0) {
            return null;
        }
        Pf_1 pf_1 = pI.id_class();
        if (pf_1 == (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_byte[4]])) {
            return null;
        }
        String string = pf_1.id_class();
        List<? extends rrjx_3> list = rrjS_2.id_byte(string);
        if (list == null || list.isEmpty()) {
            return null;
        }
        int n2 = rrjS_2.id_class(list, pI);
        if (n2 != id_protected[2]) {
            int n3 = (n2 + n) % list.size();
            return list.get(n3);
        }
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA19E2E36E5D7F17EL;
    }

    public static List<FuntimeEnchantment> id_class(rdn_3 rdn_32) {
        if (rdn_32.id_protected(id_break[3])) {
            ArrayList<FuntimeEnchantment> arrayList = new ArrayList<FuntimeEnchantment>();
            String string = rdn_32.id_package().id_native(id_break[4]);
            arrayList.add(new FuntimeEnchantment(string, id_throws[7]));
            return arrayList;
        }
        if (rdn_32.id_protected(id_break[5])) {
            ArrayList<FuntimeEnchantment> arrayList = new ArrayList<FuntimeEnchantment>();
            rcy_3 rcy_32 = rdn_32.id_package().id_protected(id_break[6], id_protected[0]);
            for (int i = id_throws[8]; i < rcy_32.size(); ++i) {
                rcd_3 rcd_32 = rcy_32.id_class(i);
                String string = rcd_32.id_native(id_break[7]);
                int n = rcd_32.id_private(id_break[8]);
                arrayList.add(new FuntimeEnchantment(string, n));
            }
            return arrayList;
        }
        return null;
    }

    public static List<? extends rrjx_3> id_break(PI pI, int n) {
        if (pI == null || pI.id_class() == null || n == 0) {
            return null;
        }
        Pf_1 pf_1 = pI.id_class();
        if (pf_1 == (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_byte[3]])) {
            return null;
        }
        String string = pf_1.id_class();
        List<? extends rrjx_3> list = rrjS_2.id_byte(string);
        if (list == null || list.isEmpty()) {
            return null;
        }
        int n2 = rrjS_2.id_class(list, pI);
        if (n2 != id_protected[1]) {
            ArrayList<rrjx_3> arrayList = new ArrayList<rrjx_3>();
            int n3 = list.size();
            for (int i = id_throws[9]; i <= n; ++i) {
                int n4 = (n2 + i) % n3;
                arrayList.add(list.get(n4));
            }
            return arrayList;
        }
        return null;
    }

    public static boolean id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.dJ) {
            return rdn_32.id_protected(id_break[0]) || rdn_32.id_protected(id_break[1]) ? id_throws[0] : id_throws[1];
        }
        return id_throws[2];
    }

    public static boolean id_break(String string) {
        if ((gm_3)rrjS_2.id_import.id_class[id_byte[10]] == null) {
            return id_throws[14];
        }
        rqM_2<rYB> rqM_22 = ((gm_3)rrjS_2.id_import.id_class[id_byte[11]]).E();
        if (rqM_22 == null) {
            return id_throws[15];
        }
        rqO_2 rqO_22 = rqM_22.id_class();
        if (rqO_22 == null) {
            return id_throws[16];
        }
        return string.equals(rqO_22.id_break());
    }

    public static an_3 id_break() {
        an_3 an_32 = null;
        for (an_3 an_33 : ((gm_3)rrjS_2.id_import.id_class[id_byte[2]]).id_byte()) {
            String string;
            if (an_33.BC() != aI_2.id_break || !(string = an_33.L_().getString()).equals(id_break[2])) continue;
            an_32 = an_33;
            break;
        }
        return an_32;
    }

    private static void id_throws() {
        id_protected = new byte[]{10, -1, -1, -1, -1, -1, -46, 87, 22, -67, 77, 2, 3, 28, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 4, 50, 101, 102, 2, 103, 3, 104, 4, 105, 5, 106, 6, 107, 7, 108, 8, 109, 9, 110, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 5, 6, 7, 8, 9, 10, 4, 6, 5, 7, 8, 6, 8, 7, 11};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjS_2.id_finally();
        rrjS_2.id_case();
        rrjS_2.id_catch();
        rrjS_2.id_throws();
        rrjS_2.id_implements();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[33];
        blArray[0] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[32] = true;
        id_throws = blArray;
    }

    private static void id_catch() {
        id_byte = new short[]{10, 10, 56, 2, 2, 2, 1, 4, 7, 6, 56, 56, 1, 4, 19, 1001, 1002, 1003, 1004, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 3001, 3002, 3003, 3004, 3005, 3006, 5001, 5002, 5003, 6001, 6002, 6003, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 301, 302, 303, 304, 305, 306, 307, 308, 501, 502, 503, 504, 505, 506, 601, 602, 603, 604, 605, 606};
    }

    private static void id_case() {
        id_break = new String[]{new String("don-item"), new String("tslevel"), new String("\u2692 \u0410\u0432\u0442\u043e-\u0428\u0430\u0445\u0442\u0430 \u2692"), new String("spooky-item"), new String("spooky-item"), new String("custom-enchantments"), new String("custom-enchantments"), new String("type"), new String("level"), new String("duels"), new String("lobby"), new String("\u0412\u0440\u0435\u043c\u044f \u0431\u043e\u044f: "), new String("\u041f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a: "), new String("\u0421\u043b\u0435\u0434\u0443\u044e\u0449\u0430\u044f: (.*)"), new String("(\\d{2}):(\\d{2})")};
    }

    private static void id_implements() {
        Object[] objectArray = new Object[11];
        objectArray[0] = new Gson();
        objectArray[1] = new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        objectArray[2] = Pattern.compile(id_break[13], 0);
        objectArray[3] = Pattern.compile(id_break[14]);
        Object[] objectArray2 = new Object[]{1001, 1002, 1003, 1004, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 3001, 3002, 3003, 3004, 3005, 3006, 5001, 5002, 5003, 6001, 6002, 6003};
        objectArray[4] = List.of(objectArray2);
        Integer[] integerArray = new Integer[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 301, 302, 303, 304, 305, 306, 307, 308, 501, 502, 503, 504, 505, 506, 601, 602, 603, 604, 605, 606};
        objectArray[5] = List.of((Object[])integerArray);
        ArrayList<rrjs_3> arrayList = new ArrayList<rrjs_3>(33);
        arrayList.add(new rrjs_3(1001));
        arrayList.add(new rrjs_3(1002));
        arrayList.add(new rrjs_3(1003));
        arrayList.add(new rrjs_3(1004));
        arrayList.add(new rrjs_3(2001));
        arrayList.add(new rrjs_3(2002));
        arrayList.add(new rrjs_3(2003));
        arrayList.add(new rrjs_3(2004));
        arrayList.add(new rrjs_3(2005));
        arrayList.add(new rrjs_3(2006));
        arrayList.add(new rrjs_3(2007));
        arrayList.add(new rrjs_3(2008));
        arrayList.add(new rrjs_3(2009));
        arrayList.add(new rrjs_3(2010));
        arrayList.add(new rrjs_3(2011));
        arrayList.add(new rrjs_3(2012));
        arrayList.add(new rrjs_3(3001));
        arrayList.add(new rrjs_3(3002));
        arrayList.add(new rrjs_3(3003));
        arrayList.add(new rrjs_3(3004));
        arrayList.add(new rrjs_3(3005));
        arrayList.add(new rrjs_3(3006));
        arrayList.add(new rrjs_3(5001));
        arrayList.add(new rrjs_3(5002));
        arrayList.add(new rrjs_3(5003));
        arrayList.add(new rrjs_3(6001));
        arrayList.add(new rrjs_3(6002));
        arrayList.add(new rrjs_3(6003));
        objectArray[6] = arrayList;
        ArrayList<rrjs_3> arrayList2 = new ArrayList<rrjs_3>(73);
        arrayList2.add(new rrjs_3(101));
        arrayList2.add(new rrjs_3(102));
        arrayList2.add(new rrjs_3(103));
        arrayList2.add(new rrjs_3(104));
        arrayList2.add(new rrjs_3(105));
        arrayList2.add(new rrjs_3(106));
        arrayList2.add(new rrjs_3(107));
        arrayList2.add(new rrjs_3(108));
        arrayList2.add(new rrjs_3(109));
        arrayList2.add(new rrjs_3(110));
        arrayList2.add(new rrjs_3(201));
        arrayList2.add(new rrjs_3(202));
        arrayList2.add(new rrjs_3(203));
        arrayList2.add(new rrjs_3(204));
        arrayList2.add(new rrjs_3(205));
        arrayList2.add(new rrjs_3(206));
        arrayList2.add(new rrjs_3(207));
        arrayList2.add(new rrjs_3(208));
        arrayList2.add(new rrjs_3(209));
        arrayList2.add(new rrjs_3(210));
        arrayList2.add(new rrjs_3(211));
        arrayList2.add(new rrjs_3(212));
        arrayList2.add(new rrjs_3(213));
        arrayList2.add(new rrjs_3(214));
        arrayList2.add(new rrjs_3(215));
        arrayList2.add(new rrjs_3(216));
        arrayList2.add(new rrjs_3(217));
        arrayList2.add(new rrjs_3(218));
        arrayList2.add(new rrjs_3(219));
        arrayList2.add(new rrjs_3(220));
        arrayList2.add(new rrjs_3(301));
        arrayList2.add(new rrjs_3(302));
        arrayList2.add(new rrjs_3(303));
        arrayList2.add(new rrjs_3(304));
        arrayList2.add(new rrjs_3(305));
        arrayList2.add(new rrjs_3(306));
        arrayList2.add(new rrjs_3(307));
        arrayList2.add(new rrjs_3(308));
        arrayList2.add(new rrjs_3(501));
        arrayList2.add(new rrjs_3(502));
        arrayList2.add(new rrjs_3(503));
        arrayList2.add(new rrjs_3(504));
        arrayList2.add(new rrjs_3(505));
        arrayList2.add(new rrjs_3(506));
        arrayList2.add(new rrjs_3(601));
        arrayList2.add(new rrjs_3(602));
        arrayList2.add(new rrjs_3(603));
        arrayList2.add(new rrjs_3(604));
        arrayList2.add(new rrjs_3(605));
        arrayList2.add(new rrjs_3(606));
        objectArray[7] = arrayList2;
        Object[] objectArray3 = new Object[]{new rrjs_3(1001), new rrjs_3(1002), new rrjs_3(1003), new rrjs_3(1004), new rrjs_3(2001), new rrjs_3(2002), new rrjs_3(2003), new rrjs_3(2004), new rrjs_3(2005), new rrjs_3(2006), new rrjs_3(2007), new rrjs_3(2008), new rrjs_3(2009), new rrjs_3(2010), new rrjs_3(2011), new rrjs_3(2012), new rrjs_3(3001), new rrjs_3(3002), new rrjs_3(3003), new rrjs_3(3004), new rrjs_3(3005), new rrjs_3(3006), new rrjs_3(5001), new rrjs_3(5002), new rrjs_3(5003), new rrjs_3(6001), new rrjs_3(6002), new rrjs_3(6003), new rrjs_3(101), new rrjs_3(102), new rrjs_3(103), new rrjs_3(104), new rrjs_3(105), new rrjs_3(106), new rrjs_3(107), new rrjs_3(108), new rrjs_3(109), new rrjs_3(110), new rrjs_3(201), new rrjs_3(202), new rrjs_3(203), new rrjs_3(204), new rrjs_3(205), new rrjs_3(206), new rrjs_3(207), new rrjs_3(208), new rrjs_3(209), new rrjs_3(210), new rrjs_3(211), new rrjs_3(212), new rrjs_3(213), new rrjs_3(214), new rrjs_3(215), new rrjs_3(216), new rrjs_3(217), new rrjs_3(218), new rrjs_3(219), new rrjs_3(220), new rrjs_3(301), new rrjs_3(302), new rrjs_3(303), new rrjs_3(304), new rrjs_3(305), new rrjs_3(306), new rrjs_3(307), new rrjs_3(308), new rrjs_3(501), new rrjs_3(502), new rrjs_3(503), new rrjs_3(504), new rrjs_3(505), new rrjs_3(506), new rrjs_3(601), new rrjs_3(602), new rrjs_3(603), new rrjs_3(604), new rrjs_3(605), new rrjs_3(606)};
        ArrayList<Object> arrayList3 = new ArrayList<Object>(78);
        arrayList3.clear();
        arrayList3.addAll(Arrays.asList(objectArray3));
        objectArray[8] = arrayList3;
        objectArray[9] = new ArrayList();
        objectArray[10] = xd_32 -> xd_32 instanceof zG_2 || xd_32 instanceof Wg_1 || xd_32 instanceof xC_2 ? id_throws[24] : id_throws[25];
        id_class = objectArray;
    }

    public static boolean id_protected() {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_byte[12]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[13]])) {
            return id_throws[17];
        }
        boolean bl = id_throws[18];
        boolean bl2 = id_throws[19];
        for (String string : ((cq_3)rrjS_2.id_import.id_class[id_byte[14]]).id_new()) {
            if (string.contains(id_break[11])) {
                bl = id_throws[20];
            } else if (string.contains(id_break[12])) {
                bl2 = id_throws[21];
            }
            if (!bl || !bl2) continue;
            return id_throws[22];
        }
        return id_throws[23];
    }

    private static List<rrjs_3> id_private() {
        return (rrfq_3)((Object)rrfp_3.id_class[id_byte[6]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[7]]) ? (List)id_class[id_byte[8]] : (List)id_class[id_byte[9]];
    }
}

