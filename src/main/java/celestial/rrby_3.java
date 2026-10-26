/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hz_1;
import celestial.IC;
import celestial.IJ;
import celestial.IN;
import celestial.MT;
import celestial.ev_3;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.iB_2;
import celestial.rAC;
import celestial.rAI;
import celestial.rLR;
import celestial.rVL;
import celestial.rXQ;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdU_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrMH;
import celestial.rrWN;
import celestial.rrbH_2;
import celestial.rrbb_3;
import celestial.rrbp_3;
import celestial.rrbq_3;
import celestial.rrdL;
import celestial.rrdZ;
import celestial.rrxh_3;
import celestial.rrzE_2;
import celestial.rrzM_2;
import celestial.rrzX_2;
import celestial.rxS_2;
import celestial.rxy_3;
import celestial.tp_3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class rrby_3 {
    private static rrbH_2[][] id_finally = null;
    private static rrbH_2[][] id_extends = null;
    private static Map id_native = null;
    private static IN id_volatile = new IN();
    private static boolean id_final = true;
    private static boolean id_package = false;
    public static final int id_class = 16384;
    public static final int id_break = 63;
    public static final int id_byte = 64;
    public static final String id_protected = "texture.potion_overlay";
    public static final String id_throws = "texture.potion_bottle_splash";
    public static final String id_case = "texture.potion_bottle_drinkable";
    public static final String id_catch = "item/potion_overlay";
    public static final String id_private = "item/potion_bottle_splash";
    public static final String id_implements = "item/potion_bottle_drinkable";
    private static final int[][] id_int = new int[0][];
    private static final Map<String, Integer> id_new = rrby_3.id_private();
    private static final String id_continue = "normal";
    private static final String id_super = "splash";
    private static final String id_this = "linger";

    private static int[][] id_byte(rdn_3 rdn_32) {
        rcy_3 rcy_32;
        Object object;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 == rdy_3.dm) {
            object = (rxy_3)rdy_3.dm;
            rcy_32 = rxy_3.id_protected(rdn_32);
        } else {
            rcy_32 = rdn_32.id_new();
        }
        object = rcy_32;
        if (object != null && ((rcy_3)object).size() > 0) {
            int[][] nArray = new int[((rcy_3)object).size()][2];
            for (int i = 0; i < ((rcy_3)object).size(); ++i) {
                int n;
                rcd_3 rcd_32 = ((rcy_3)object).id_class(i);
                String string = rcd_32.id_native("id");
                int n2 = rcd_32.id_private("lvl");
                ev_3 ev_32 = rrWN.id_class(string);
                if (ev_32 == null) continue;
                nArray[i][0] = n = rVL.id_boolean.id_class(ev_32);
                nArray[i][1] = n2;
            }
            return nArray;
        }
        return id_int;
    }

    public static boolean id_byte() {
        return id_final;
    }

    public static IJ id_class(rdn_3 rdn_32, IJ iJ, rqO_2 rqO_22, boolean bl) {
        if (!bl && iJ.id_break()) {
            return iJ;
        }
        if (id_finally == null) {
            return iJ;
        }
        rrbH_2 rrbH_22 = rrby_3.id_class(rdn_32, 1);
        if (rrbH_22 == null) {
            return iJ;
        }
        IJ iJ2 = rrbH_22.id_class(rqO_22, bl);
        return iJ2 != null ? iJ2 : iJ;
    }

    public static rqO_2 id_class(rdn_3 rdn_32, rXQ rXQ2, String string, rqO_2 rqO_22) {
        if (id_finally == null) {
            return rqO_22;
        }
        rqO_2 rqO_23 = rrby_3.id_class(rdn_32, rXQ2, string);
        return rqO_23 == null ? rqO_22 : rqO_23;
    }

    private static rqO_2 id_class(rdn_3 rdn_32, rXQ rXQ2, String string) {
        String string2;
        rqO_2 rqO_22;
        rrbH_2 rrbH_22 = rrby_3.id_class(rdn_32, 3);
        if (rrbH_22 == null) {
            return null;
        }
        if (rrbH_22.id_public == null) {
            return rrbH_22.id_return;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        if (!(rdb_32 instanceof rxS_2)) {
            return null;
        }
        rxS_2 rxS_22 = (rxS_2)rdb_32;
        String string3 = rxS_22.id_throws().id_protected();
        int n = rXQ2 == rXQ.LEGS ? 2 : 1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("texture.");
        stringBuffer.append(string3);
        stringBuffer.append("_layer_");
        stringBuffer.append(n);
        if (string != null) {
            stringBuffer.append("_");
            stringBuffer.append(string);
        }
        return (rqO_22 = (rqO_2)rrbH_22.id_public.get(string2 = stringBuffer.toString())) == null ? rrbH_22.id_return : rqO_22;
    }

    public static rqO_2 id_class(rdn_3 rdn_32, rqO_2 rqO_22) {
        if (id_finally == null) {
            return rqO_22;
        }
        rrbH_2 rrbH_22 = rrby_3.id_class(rdn_32, 4);
        if (rrbH_22 == null) {
            return rqO_22;
        }
        return rrbH_22.id_return == null ? rqO_22 : rrbH_22.id_return;
    }

    private static rrbH_2[][] id_class(List list) {
        rrbH_2[][] rrbH_2Array = new rrbH_2[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            rrbH_2[] rrbH_2Array2 = list2.toArray(new rrbH_2[list2.size()]);
            Arrays.sort(rrbH_2Array2, new rrbq_3());
            rrbH_2Array[i] = rrbH_2Array2;
        }
        return rrbH_2Array;
    }

    private static void id_class(rAC rAC2) {
        int n;
        Object object;
        Object[] objectArray;
        Collection<Object> collection;
        Object[] objectArray2 = rrzM_2.id_class(rAC2, "optifine/cit/", ".properties", (String[])null);
        Map<String, rrbH_2> map = rrby_3.id_break(rAC2);
        if (map.size() > 0) {
            collection = map.keySet();
            objectArray = collection.toArray(new String[collection.size()]);
            objectArray2 = (String[])rrbb_3.id_class(objectArray2, objectArray);
        }
        Arrays.sort(objectArray2);
        collection = rrby_3.id_class(id_finally);
        objectArray = rrby_3.id_class(id_extends);
        for (int i = 0; i < objectArray2.length; ++i) {
            Object object2 = objectArray2[i];
            rrbb_3.id_byte("CustomItems: " + (String)object2);
            try {
                object = null;
                if (map.containsKey(object2)) {
                    object = map.get(object2);
                }
                if (object == null) {
                    rqO_2 rqO_22 = new rqO_2((String)object2);
                    InputStream inputStream = rAC2.id_class(rAI.CLIENT_RESOURCES, rqO_22);
                    if (inputStream == null) {
                        rrbb_3.id_protected("CustomItems file not found: " + (String)object2);
                        continue;
                    }
                    rrzE_2 rrzE_22 = new rrzE_2();
                    rrzE_22.load(inputStream);
                    inputStream.close();
                    object = new rrbH_2(rrzE_22, (String)object2);
                }
                if (!object.id_class((String)object2)) continue;
                rrby_3.id_class((rrbH_2)object, collection);
                rrby_3.id_break((rrbH_2)object, (List<List<rrbH_2>>)objectArray);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                rrbb_3.id_protected("CustomItems file not found: " + (String)object2);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        id_finally = rrby_3.id_class(collection);
        id_extends = rrby_3.id_class((List)objectArray);
        Comparator comparator = rrby_3.id_protected();
        for (n = 0; n < id_finally.length; ++n) {
            object = id_finally[n];
            if (object == null) continue;
            Arrays.sort(object, comparator);
        }
        for (n = 0; n < id_extends.length; ++n) {
            object = id_extends[n];
            if (object == null) continue;
            Arrays.sort(object, comparator);
        }
    }

    public static void id_class() {
        id_finally = null;
        id_extends = null;
        id_final = true;
        if (rrbb_3.rd()) {
            rrby_3.id_class("optifine/cit.properties");
            rAC[] rACArray = rrbb_3.d();
            for (int i = rACArray.length - 1; i >= 0; --i) {
                rAC rAC2 = rACArray[i];
                rrby_3.id_class(rAC2);
            }
            rrby_3.id_class(rrbb_3.W());
            if (id_finally.length <= 0) {
                id_finally = null;
            }
            if (id_extends.length <= 0) {
                id_extends = null;
            }
        }
    }

    private static void id_class(rrbH_2 rrbH_22, List<List<rrbH_2>> list, int n) {
        while (n >= list.size()) {
            list.add(null);
        }
        List<rrbH_2> list2 = list.get(n);
        if (list2 == null) {
            list2 = new ArrayList<rrbH_2>();
            list.set(n, list2);
        }
        list2.add(rrbH_22);
    }

    public static boolean id_class(iB_2 iB_22, rdn_3 rdn_32, tp_3 tp_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        rrbH_2[][] rrbH_2Array = id_extends;
        if (rrbH_2Array == null) {
            return false;
        }
        if (rrbb_3.rs() && rrdZ.id_new) {
            return false;
        }
        if (rdn_32 == null) {
            return false;
        }
        int[][] nArray = rrby_3.id_byte(rdn_32);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet<Integer> hashSet = null;
        boolean bl = false;
        fY_2 fY_22 = rrbb_3.J();
        for (int i = 0; i < nArray.length; ++i) {
            rrbH_2[] rrbH_2Array2;
            int n = nArray[i][0];
            if (n < 0 || n >= rrbH_2Array.length || (rrbH_2Array2 = rrbH_2Array[n]) == null) continue;
            for (int j = 0; j < rrbH_2Array2.length; ++j) {
                rrbH_2 rrbH_22 = rrbH_2Array2[j];
                if (hashSet == null) {
                    hashSet = new HashSet<Integer>();
                }
                if (!hashSet.add(n) || !rrby_3.id_class(rrbH_22, rdn_32, nArray) || rrbH_22.id_return == null) continue;
                fY_22.id_class(rrbH_22.id_return);
                float f8 = rrbH_22.id_class(fY_22);
                if (!bl) {
                    bl = true;
                    if (rrbb_3.rs()) {
                        rrdL.id_else();
                    }
                    MT.id_package();
                    MT.id_break(514);
                    MT.id_class(false);
                }
                rrxh_3.id_class(rrbH_22.id_new, 1.0f);
                MT.id_catch();
                MT.id_return(5890);
                MT.id_boolean();
                MT.id_byte(rrbH_22.id_super, 0.0f, 0.0f, 1.0f);
                float f9 = f8 / 8.0f;
                MT.id_break(f9, f9 / 2.0f, f9);
                float f10 = rrbH_22.id_continue * (float)(rqR_2.id_break() % 3000L) / 3000.0f / 8.0f;
                MT.id_byte(0.0f, f10, 0.0f);
                MT.id_return(5888);
            }
        }
        if (bl) {
            MT.id_throws();
            MT.id_package();
            MT.id_break(770, 771);
            MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
            MT.id_return(5890);
            MT.id_boolean();
            MT.id_return(5888);
            MT.id_case();
            MT.id_class(true);
            MT.id_break(515);
            MT.id_final();
            if (rrbb_3.rs()) {
                rrdL.id_synchronized();
            }
        }
        return bl;
    }

    private static void id_class(String string, int n, boolean bl, Map<String, Integer> map) {
        if (bl) {
            n |= 0x2000;
        }
        map.put("minecraft:" + string, n);
        if (bl) {
            int n2 = n | 0x20;
            map.put("minecraft:strong_" + string, n2);
            int n3 = n | 0x40;
            map.put("minecraft:long_" + string, n3);
        }
    }

    private static void id_class(String string) {
        try {
            rqO_2 rqO_22 = new rqO_2(string);
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return;
            }
            rrbb_3.id_byte("CustomItems: Loading " + string);
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            id_final = rrbb_3.id_class(rrzE_22.getProperty("useGlint"), true);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static boolean id_class(Hz_1 hz_1, rdn_3 rdn_32, IJ iJ) {
        rrbH_2[][] rrbH_2Array = id_extends;
        if (rrbH_2Array == null) {
            return false;
        }
        if (rdn_32 == null) {
            return false;
        }
        int[][] nArray = rrby_3.id_byte(rdn_32);
        if (nArray.length <= 0) {
            return false;
        }
        HashSet<Integer> hashSet = null;
        boolean bl = false;
        fY_2 fY_22 = rrbb_3.J();
        for (int i = 0; i < nArray.length; ++i) {
            rrbH_2[] rrbH_2Array2;
            int n = nArray[i][0];
            if (n < 0 || n >= rrbH_2Array.length || (rrbH_2Array2 = rrbH_2Array[n]) == null) continue;
            for (int j = 0; j < rrbH_2Array2.length; ++j) {
                rrbH_2 rrbH_22 = rrbH_2Array2[j];
                if (hashSet == null) {
                    hashSet = new HashSet<Integer>();
                }
                if (!hashSet.add(n) || !rrby_3.id_class(rrbH_22, rdn_32, nArray) || rrbH_22.id_return == null) continue;
                fY_22.id_class(rrbH_22.id_return);
                float f = rrbH_22.id_class(fY_22);
                if (!bl) {
                    bl = true;
                    MT.id_class(false);
                    MT.id_break(514);
                    MT.id_catch();
                    MT.id_return(5890);
                }
                rrxh_3.id_class(rrbH_22.id_new, 1.0f);
                MT.id_transient();
                MT.id_break(f, f, f);
                float f2 = rrbH_22.id_continue * (float)(rqR_2.id_break() % 3000L) / 3000.0f / 8.0f;
                MT.id_byte(f2, 0.0f, 0.0f);
                MT.id_byte(rrbH_22.id_super, 0.0f, 0.0f, 1.0f);
                MT.id_for();
            }
        }
        if (bl) {
            MT.id_throws();
            MT.id_package();
            MT.id_break(770, 771);
            MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
            MT.id_return(5888);
            MT.id_case();
            MT.id_break(515);
            MT.id_class(true);
            fY_22.id_class(fJ_2.id_class);
        }
        return bl;
    }

    private static int id_class(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return rdb_32 instanceof rdU_2 ? rrby_3.id_break(rdn_32) : rdn_32.id_catch();
    }

    private static boolean id_class(rrbH_2 rrbH_22, rdn_3 rdn_32, int[][] nArray) {
        int n;
        int n2;
        int n3;
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rrbH_22.id_implements != null) {
            int n4 = rrby_3.id_class(rdn_32);
            if (n4 < 0) {
                return false;
            }
            if (rrbH_22.id_extends != 0) {
                n4 &= rrbH_22.id_extends;
            }
            if (rrbH_22.id_finally) {
                n3 = rdb_32.id_finally();
                n4 = (int)((double)(n4 * 100) / (double)n3);
            }
            if (!rrbH_22.id_implements.id_class(n4)) {
                return false;
            }
        }
        if (rrbH_22.id_native != null && !rrbH_22.id_native.id_class(rdn_32.id_char())) {
            return false;
        }
        int[][] nArray2 = nArray;
        if (rrbH_22.id_volatile != null) {
            if (nArray == null) {
                nArray2 = rrby_3.id_byte(rdn_32);
            }
            n3 = 0;
            for (n2 = 0; n2 < nArray2.length; ++n2) {
                n = nArray2[n2][0];
                if (!rrbb_3.id_class(n, rrbH_22.id_volatile)) continue;
                n3 = 1;
                break;
            }
            if (n3 == 0) {
                return false;
            }
        }
        if (rrbH_22.id_final != null) {
            if (nArray2 == null) {
                nArray2 = rrby_3.id_byte(rdn_32);
            }
            n3 = 0;
            for (n2 = 0; n2 < nArray2.length; ++n2) {
                n = nArray2[n2][1];
                if (!rrbH_22.id_final.id_class(n)) continue;
                n3 = 1;
                break;
            }
            if (n3 == 0) {
                return false;
            }
        }
        if (rrbH_22.id_package != null) {
            rcd_3 rcd_32 = rdn_32.id_package();
            for (n2 = 0; n2 < rrbH_22.id_package.length; ++n2) {
                rrMH rrMH2 = rrbH_22.id_package[n2];
                if (rrMH2.id_class(rcd_32)) continue;
                return false;
            }
        }
        if (rrbH_22.id_int != 0) {
            if (rrbH_22.id_int == 1 && id_package) {
                return false;
            }
            if (rrbH_22.id_int == 2 && !id_package) {
                return false;
            }
        }
        return true;
    }

    private static rrbH_2 id_class(rdn_3 rdn_32, int n) {
        rrbH_2[] rrbH_2Array;
        rrbH_2[][] rrbH_2Array2 = id_finally;
        if (rrbH_2Array2 == null) {
            return null;
        }
        if (rdn_32 == null) {
            return null;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        int n2 = rdb_3.id_class(rdb_32);
        if (n2 >= 0 && n2 < rrbH_2Array2.length && (rrbH_2Array = rrbH_2Array2[n2]) != null) {
            for (int i = 0; i < rrbH_2Array.length; ++i) {
                rrbH_2 rrbH_22 = rrbH_2Array[i];
                if (rrbH_22.id_byte != n || !rrby_3.id_class(rrbH_22, rdn_32, (int[][])null)) continue;
                return rrbH_22;
            }
        }
        return null;
    }

    private static Properties id_class(String string, String string2, rqO_2 rqO_22, String string3) {
        int n;
        if (rrzX_2.id_break(string, new String[]{"_n", "_s"})) {
            return null;
        }
        if (string.equals("empty") && string2.equals(id_continue)) {
            rqO_22 = rVL.id_for.id_break(rdy_3.Jn);
            rrzE_2 rrzE_22 = new rrzE_2();
            ((Properties)rrzE_22).put("type", "item");
            ((Properties)rrzE_22).put("items", rqO_22.toString());
            return rrzE_22;
        }
        int[] nArray = (int[])rrby_3.id_case().get(string);
        if (nArray == null) {
            rrbb_3.id_protected("Potion not found for image: " + string3);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n = 0; n < nArray.length; ++n) {
            int n2 = nArray[n];
            if (string2.equals(id_super)) {
                n2 |= 0x4000;
            }
            if (n > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(n2);
        }
        n = 16447;
        if (string.equals("water") || string.equals("mundane")) {
            n |= 0x40;
        }
        rrzE_2 rrzE_23 = new rrzE_2();
        ((Properties)rrzE_23).put("type", "item");
        ((Properties)rrzE_23).put("items", rqO_22.toString());
        ((Properties)rrzE_23).put("damage", stringBuffer.toString());
        ((Properties)rrzE_23).put("damageMask", "" + n);
        if (string2.equals(id_super)) {
            ((Properties)rrzE_23).put(id_throws, string);
        } else {
            ((Properties)rrzE_23).put(id_case, string);
        }
        return rrzE_23;
    }

    private static Map<String, rrbH_2> id_class(rAC rAC2, String string, rqO_2 rqO_22) {
        HashMap<String, rrbH_2> hashMap = new HashMap<String, rrbH_2>();
        String string2 = string + "/";
        String[] stringArray = new String[]{"optifine/cit/potion/" + string2, "optifine/cit/Potion/" + string2};
        String[] stringArray2 = new String[]{".png"};
        String[] stringArray3 = rrzM_2.id_class(rAC2, stringArray, stringArray2);
        for (int i = 0; i < stringArray3.length; ++i) {
            String string3 = stringArray3[i];
            String string4 = rrzX_2.id_class(string3, stringArray, stringArray2);
            Properties properties = rrby_3.id_class(string4, string, rqO_22, string3);
            if (properties == null) continue;
            String string5 = rrzX_2.id_byte(string3, stringArray2) + ".properties";
            rrbH_2 rrbH_22 = new rrbH_2(properties, string5);
            hashMap.put(string5, rrbH_22);
        }
        return hashMap;
    }

    private static void id_class(rrbH_2 rrbH_22, List<List<rrbH_2>> list) {
        if (rrbH_22.id_protected != null) {
            for (int i = 0; i < rrbH_22.id_protected.length; ++i) {
                int n = rrbH_22.id_protected[i];
                if (n <= 0) {
                    rrbb_3.id_protected("Invalid item ID: " + n);
                    continue;
                }
                rrby_3.id_class(rrbH_22, list, n);
            }
        }
    }

    private static void id_class(rrbH_2[][] rrbH_2Array, List<rrbH_2> list) {
        if (rrbH_2Array != null) {
            for (int i = 0; i < rrbH_2Array.length; ++i) {
                rrbH_2[] rrbH_2Array2 = rrbH_2Array[i];
                if (rrbH_2Array2 == null) continue;
                for (int j = 0; j < rrbH_2Array2.length; ++j) {
                    rrbH_2 rrbH_22 = rrbH_2Array2[j];
                    if (rrbH_22 == null) continue;
                    list.add(rrbH_22);
                }
            }
        }
    }

    public static void id_class(IC iC) {
        for (rrbH_2 rrbH_22 : rrby_3.id_throws()) {
            rrbH_22.id_class(iC);
        }
    }

    public static void id_class(fJ_2 fJ_22) {
        for (rrbH_2 rrbH_22 : rrby_3.id_throws()) {
            rrbH_22.id_class(fJ_22);
        }
    }

    private static List<List<rrbH_2>> id_class(rrbH_2[][] rrbH_2Array) {
        ArrayList<List<rrbH_2>> arrayList = new ArrayList<List<rrbH_2>>();
        if (rrbH_2Array != null) {
            for (int i = 0; i < rrbH_2Array.length; ++i) {
                rrbH_2[] rrbH_2Array2 = rrbH_2Array[i];
                ArrayList<rrbH_2> arrayList2 = null;
                if (rrbH_2Array2 != null) {
                    arrayList2 = new ArrayList<rrbH_2>(Arrays.asList(rrbH_2Array2));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static int[] id_class(int n, int n2) {
        return new int[]{n + n2 * 16};
    }

    private static int[] id_class(int n) {
        return new int[]{n, n + 16, n + 32, n + 48};
    }

    public static void id_class(boolean bl) {
        id_package = bl;
    }

    public static void id_break(fJ_2 fJ_22) {
        for (rrbH_2 rrbH_22 : rrby_3.id_throws()) {
            rrbH_22.id_break(fJ_22);
        }
    }

    private static int id_break(String string) {
        String string2 = "effect." + string;
        for (rqO_2 rqO_22 : rVL.id_const.id_protected()) {
            rLR rLR2;
            String string3;
            if (!rVL.id_const.id_byte(rqO_22) || !string2.equals(string3 = (rLR2 = rVL.id_const.id_class(rqO_22)).id_byte())) continue;
            return rLR.id_class(rLR2);
        }
        return -1;
    }

    private static Map<String, rrbH_2> id_break(rAC rAC2) {
        HashMap<String, rrbH_2> hashMap = new HashMap<String, rrbH_2>();
        hashMap.putAll(rrby_3.id_class(rAC2, id_continue, rVL.id_for.id_break(rdy_3.JA)));
        hashMap.putAll(rrby_3.id_class(rAC2, id_super, rVL.id_for.id_break(rdy_3.kk)));
        hashMap.putAll(rrby_3.id_class(rAC2, id_this, rVL.id_for.id_break(rdy_3.kQ)));
        return hashMap;
    }

    private static void id_break(rrbH_2 rrbH_22, List<List<rrbH_2>> list) {
        if (rrbH_22.id_byte == 2 && rrbH_22.id_volatile != null) {
            int n = rrby_3.id_catch() + 1;
            for (int i = 0; i < n; ++i) {
                if (!rrbb_3.id_class(i, rrbH_22.id_volatile)) continue;
                rrby_3.id_class(rrbH_22, list, i);
            }
        }
    }

    public static void id_break() {
        for (rrbH_2 rrbH_22 : rrby_3.id_throws()) {
            if (rrbH_22.id_byte != 1) continue;
            fJ_2 fJ_22 = rrbb_3.rF();
            rrbH_22.id_class(fJ_22, id_volatile);
            rrbH_22.id_class();
        }
    }

    private static int id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 == null) {
            return 0;
        }
        String string = rcd_32.id_native("Potion");
        if (string != null && !string.equals("")) {
            Integer n = id_new.get(string);
            if (n == null) {
                return -1;
            }
            int n2 = n;
            if (rdn_32.id_break() == rdy_3.kk) {
                n2 |= 0x4000;
            }
            return n2;
        }
        return 0;
    }

    private static List<rrbH_2> id_throws() {
        ArrayList<rrbH_2> arrayList = new ArrayList<rrbH_2>();
        rrby_3.id_class(id_finally, arrayList);
        rrby_3.id_class(id_extends, arrayList);
        return arrayList;
    }

    private static int id_catch() {
        int n = 0;
        ev_3 ev_32;
        while ((ev_32 = (ev_3)rVL.id_boolean.id_class(n)) != null) {
            ++n;
        }
        return n;
    }

    private static Map id_case() {
        if (id_native == null) {
            id_native = new LinkedHashMap();
            id_native.put("water", rrby_3.id_class(0, 0));
            id_native.put("awkward", rrby_3.id_class(0, 1));
            id_native.put("thick", rrby_3.id_class(0, 2));
            id_native.put("potent", rrby_3.id_class(0, 3));
            id_native.put("regeneration", rrby_3.id_class(1));
            id_native.put("movespeed", rrby_3.id_class(2));
            id_native.put("fireresistance", rrby_3.id_class(3));
            id_native.put("poison", rrby_3.id_class(4));
            id_native.put("heal", rrby_3.id_class(5));
            id_native.put("nightvision", rrby_3.id_class(6));
            id_native.put("clear", rrby_3.id_class(7, 0));
            id_native.put("bungling", rrby_3.id_class(7, 1));
            id_native.put("charming", rrby_3.id_class(7, 2));
            id_native.put("rank", rrby_3.id_class(7, 3));
            id_native.put("weakness", rrby_3.id_class(8));
            id_native.put("damageboost", rrby_3.id_class(9));
            id_native.put("moveslowdown", rrby_3.id_class(10));
            id_native.put("leaping", rrby_3.id_class(11));
            id_native.put("harm", rrby_3.id_class(12));
            id_native.put("waterbreathing", rrby_3.id_class(13));
            id_native.put("invisibility", rrby_3.id_class(14));
            id_native.put("thin", rrby_3.id_class(15, 0));
            id_native.put("debonair", rrby_3.id_class(15, 1));
            id_native.put("sparkling", rrby_3.id_class(15, 2));
            id_native.put("stinky", rrby_3.id_class(15, 3));
            id_native.put("mundane", rrby_3.id_class(0, 4));
            id_native.put("speed", id_native.get("movespeed"));
            id_native.put("fire_resistance", id_native.get("fireresistance"));
            id_native.put("instant_health", id_native.get("heal"));
            id_native.put("night_vision", id_native.get("nightvision"));
            id_native.put("strength", id_native.get("damageboost"));
            id_native.put("slowness", id_native.get("moveslowdown"));
            id_native.put("instant_damage", id_native.get("harm"));
            id_native.put("water_breathing", id_native.get("waterbreathing"));
        }
        return id_native;
    }

    private static Comparator id_protected() {
        return new rrbp_3();
    }

    private static Map<String, Integer> id_private() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        rrby_3.id_class("water", 0, false, hashMap);
        rrby_3.id_class("awkward", 16, false, hashMap);
        rrby_3.id_class("thick", 32, false, hashMap);
        rrby_3.id_class("mundane", 64, false, hashMap);
        rrby_3.id_class("regeneration", 1, true, hashMap);
        rrby_3.id_class("swiftness", 2, true, hashMap);
        rrby_3.id_class("fire_resistance", 3, true, hashMap);
        rrby_3.id_class("poison", 4, true, hashMap);
        rrby_3.id_class("healing", 5, true, hashMap);
        rrby_3.id_class("night_vision", 6, true, hashMap);
        rrby_3.id_class("weakness", 8, true, hashMap);
        rrby_3.id_class("strength", 9, true, hashMap);
        rrby_3.id_class("slowness", 10, true, hashMap);
        rrby_3.id_class("leaping", 11, true, hashMap);
        rrby_3.id_class("harming", 12, true, hashMap);
        rrby_3.id_class("water_breathing", 13, true, hashMap);
        rrby_3.id_class("invisibility", 14, true, hashMap);
        return hashMap;
    }
}

