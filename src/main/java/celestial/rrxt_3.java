/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package celestial;

import celestial.QY;
import celestial.dj_3;
import celestial.rCZ;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rrMn_1;
import celestial.rrMz_1;
import celestial.rrWP;
import celestial.rrbM_2;
import celestial.rrbb_3;
import celestial.rrdN;
import celestial.rrdT;
import celestial.rrdZ;
import celestial.rrxT_2;
import celestial.rrxi_3;
import celestial.rrxr_3;
import celestial.rrzE_2;
import celestial.rrzX_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

public class rrxt_3 {
    private static rrxT_2[][] id_class = null;
    private static boolean id_break = false;
    private static rrzE_2 id_byte = null;
    private static boolean id_protected;
    private static List<List<rrxT_2>> id_throws;

    public static rrzE_2 id_byte() {
        return id_byte;
    }

    public static int id_byte(xc_3 xc_32) {
        if (id_break) {
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof dj_3) {
                return 1;
            }
            xN_2 xN_22 = xc_32.id_private();
            return xN_22 != xN_2.ENTITYBLOCK_ANIMATED && xN_22 != xN_2.MODEL ? xN_22.ordinal() : xN_22.ordinal() + 1;
        }
        return xc_32.id_private().ordinal();
    }

    private static rrMn_1 id_class(xd_3 xd_32, int n, Map<rCZ, Comparable> map) {
        ArrayList<xc_3> arrayList = new ArrayList<xc_3>();
        Set<rCZ> set = map.keySet();
        for (xc_3 integerArray2 : rrWP.id_byte(xd_32)) {
            boolean xc_32 = true;
            for (rCZ rCZ2 : set) {
                Object t;
                if (!integerArray2.id_break(rCZ2)) {
                    xc_32 = false;
                    break;
                }
                Comparable comparable = map.get(rCZ2);
                if (comparable.equals(t = integerArray2.id_byte(rCZ2))) continue;
                xc_32 = false;
                break;
            }
            if (!xc_32) continue;
            arrayList.add(integerArray2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (xc_3 xc_32 : arrayList) {
            linkedHashSet.add(xc_32.id_super());
        }
        Integer[] integerArray = linkedHashSet.toArray(new Integer[linkedHashSet.size()]);
        int[] nArray = rrbb_3.id_class(integerArray);
        rrMn_1 rrMn_12 = new rrMn_1(n, nArray);
        return rrMn_12;
    }

    private static void id_class(List<rrxT_2> list, int n, int n2, rrMn_1 rrMn_12) {
        for (rrxT_2 rrxT_22 : list) {
            if (rrxT_22.id_class() != n || rrxT_22.id_break() != n2) continue;
            rrMn_1[] rrMn_1Array = rrxT_22.id_byte();
            for (int i = 0; i < rrMn_1Array.length; ++i) {
                rrMn_1 rrMn_13 = rrMn_1Array[i];
                if (rrMn_13.id_class() != rrMn_12.id_class()) continue;
                rrMn_13.id_class(rrMn_12.id_break());
                return;
            }
        }
        rrxT_2 rrxT_23 = new rrxT_2(n, n2, new rrMn_1[]{rrMn_12});
        list.add(rrxT_23);
    }

    private static void id_class(String string, int n, List<List<rrxT_2>> list) {
        String[] stringArray = rrbb_3.id_class(string, " ");
        if (stringArray.length != 4) {
            rrbb_3.id_protected("Invalid flattening line: " + string);
        } else {
            String string2 = stringArray[0];
            String string3 = stringArray[1];
            int n2 = rrbb_3.id_class(stringArray[2], Integer.MIN_VALUE);
            int n3 = rrbb_3.id_class(stringArray[3], Integer.MIN_VALUE);
            if (n2 >= 0 && n3 >= 0) {
                try {
                    Object object;
                    List<rrxT_2> list22;
                    JsonParser jsonParser = new JsonParser();
                    JsonObject jsonObject = jsonParser.parse(string2).getAsJsonObject();
                    String string4 = jsonObject.get("Name").getAsString();
                    rqO_2 rqO_22 = new rqO_2(string4);
                    xd_3 xd_32 = rrWP.id_class(rqO_22);
                    if (xd_32 == null) {
                        rrbb_3.id_protected("Invalid block name (" + n + "): " + string4);
                        return;
                    }
                    xc_3 xc_32 = xd_32.id_continue();
                    Collection<rCZ> collection = xc_32.id_public();
                    LinkedHashMap<rCZ, Comparable> linkedHashMap = new LinkedHashMap<rCZ, Comparable>();
                    JsonObject jsonObject2 = (JsonObject)jsonObject.get("Properties");
                    if (jsonObject2 != null) {
                        for (List<rrxT_2> list22 : jsonObject2.entrySet()) {
                            object = (String)list22.getKey();
                            String string5 = ((JsonElement)list22.getValue()).getAsString();
                            rCZ rCZ2 = rrbM_2.id_class((String)object, collection);
                            if (rCZ2 == null) {
                                rrbb_3.id_protected("Invalid property (" + n + "): " + (String)object);
                                continue;
                            }
                            Comparable comparable = rrMz_1.id_class(rCZ2, string5);
                            if (comparable == null) {
                                rrbb_3.id_protected("Invalid property value (" + n + "): " + string5);
                                continue;
                            }
                            linkedHashMap.put(rCZ2, comparable);
                        }
                    }
                    int n4 = xc_32.id_continue();
                    while (list.size() <= n4) {
                        list.add(null);
                    }
                    list22 = list.get(n4);
                    if (list22 == null) {
                        list22 = new ArrayList<rrxT_2>(rrWP.id_break(xd_32));
                        list.set(n4, list22);
                    }
                    object = rrxt_3.id_class(xc_32.id_break(), xc_32.id_continue(), linkedHashMap);
                    rrxt_3.id_class(list22, n2, n3, (rrMn_1)object);
                }
                catch (Exception exception) {
                    rrbb_3.id_protected("Error parsing: " + string);
                }
            } else {
                rrbb_3.id_protected("Invalid blockID or metadata (" + n + "): " + n2 + ":" + n3);
            }
        }
    }

    private static rrxT_2[][] id_class(List<List<rrxT_2>> list) {
        rrxT_2[][] rrxT_2Array = new rrxT_2[list.size()][];
        for (int i = 0; i < rrxT_2Array.length; ++i) {
            List<rrxT_2> list2 = list.get(i);
            if (list2 == null) continue;
            rrxT_2Array[i] = list2.toArray(new rrxT_2[list2.size()]);
        }
        return rrxT_2Array;
    }

    public static boolean id_class() {
        return id_break;
    }

    public static int id_class(xc_3 xc_32) {
        int n;
        int n2 = xc_32.id_continue();
        rrxT_2 rrxT_22 = rrxt_3.id_class(n2, n = xc_32.id_super());
        return rrxT_22 != null ? rrxT_22.id_class() : -1;
    }

    public static void id_class(rrxi_3 rrxi_32) {
        rrxt_3.id_protected();
        if (rrxi_32 != null && !(rrxi_32 instanceof rrdN)) {
            if (rrxr_3.Bx.id_byte() && QY.id_instanceof().F() == null) {
                rrbb_3.id_byte("[Shaders] Delayed loading of block mappings after resources are loaded");
                id_protected = true;
            } else {
                List<List<rrxT_2>> list = new ArrayList<List<rrxT_2>>();
                String string = "/shaders/block.properties";
                InputStream inputStream = rrxi_32.id_class(string);
                if (inputStream != null) {
                    rrxt_3.id_class(inputStream, string, list);
                }
                if (list.size() <= 0) {
                    list = rrxt_3.id_throws();
                    id_break = true;
                }
                id_class = rrxt_3.id_class(list);
            }
        }
    }

    public static rrxT_2[] id_class(int n) {
        if (id_class == null) {
            return null;
        }
        return n >= 0 && n < id_class.length ? id_class[n] : null;
    }

    private static void id_class(List<List<rrxT_2>> list, rrxT_2 rrxT_22) {
        int[] nArray = rrxT_22.id_protected();
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            while (n >= list.size()) {
                list.add(null);
            }
            List<rrxT_2> list2 = list.get(n);
            if (list2 == null) {
                list2 = new ArrayList<rrxT_2>();
                list.set(n, list2);
            }
            rrxT_2 rrxT_23 = new rrxT_2(rrxT_22.id_class(), rrxT_22.id_class(n));
            list2.add(rrxT_23);
        }
    }

    public static rrxT_2 id_class(int n, int n2) {
        if (id_class == null) {
            return null;
        }
        if (n >= 0 && n < id_class.length) {
            rrxT_2[] rrxT_2Array = id_class[n];
            if (rrxT_2Array == null) {
                return null;
            }
            for (int i = 0; i < rrxT_2Array.length; ++i) {
                rrxT_2 rrxT_22 = rrxT_2Array[i];
                if (!rrxT_22.id_class(n, n2)) continue;
                return rrxT_22;
            }
            return null;
        }
        return null;
    }

    private static void id_class(InputStream inputStream, String string, List<List<rrxT_2>> list) {
        if (inputStream != null) {
            try {
                inputStream = rrdT.id_class(inputStream, string, true);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrbb_3.id_byte("[Shaders] Parsing block mappings: " + string);
                rrMz_1 rrMz_12 = new rrMz_1("Shaders");
                for (String string2 : ((Properties)rrzE_22).keySet()) {
                    String string3 = rrzE_22.getProperty(string2);
                    if (string2.startsWith("layer.")) {
                        if (id_byte == null) {
                            id_byte = new rrzE_2();
                        }
                        id_byte.put(string2, string3);
                        continue;
                    }
                    String string4 = "block.";
                    if (!string2.startsWith(string4)) {
                        rrbb_3.id_protected("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    String string5 = rrzX_2.id_protected(string2, string4);
                    int n = rrbb_3.id_class(string5, -1);
                    if (n < 0) {
                        rrbb_3.id_protected("[Shaders] Invalid block ID: " + string2);
                        continue;
                    }
                    rrMn_1[] rrMn_1Array = rrMz_12.id_byte(string3);
                    if (rrMn_1Array != null && rrMn_1Array.length >= 1) {
                        rrxT_2 rrxT_22 = new rrxT_2(n, rrMn_1Array);
                        rrxt_3.id_class(list, rrxT_22);
                        continue;
                    }
                    rrbb_3.id_protected("[Shaders] Invalid block ID mapping: " + string2 + "=" + string3);
                }
            }
            catch (IOException iOException) {
                rrbb_3.id_protected("[Shaders] Error reading: " + string);
            }
        }
    }

    public static void id_break() {
        if (id_protected) {
            id_protected = false;
            rrxt_3.id_class(rrdZ.id_protected());
        }
    }

    public static int id_break(xc_3 xc_32) {
        int n;
        if (!id_break) {
            return 0;
        }
        int n2 = xc_32.id_continue();
        rrxT_2 rrxT_22 = rrxt_3.id_class(n2, n = xc_32.id_super());
        return rrxT_22 != null ? rrxT_22.id_break() : 0;
    }

    private static List<List<rrxT_2>> id_throws() {
        if (id_throws == null) {
            id_throws = rrxt_3.id_case();
        }
        return id_throws;
    }

    private static void id_catch() {
        for (rqO_2 rqO_22 : rVL.id_strictfp.id_protected()) {
            xd_3 xd_32 = rVL.id_strictfp.id_class(rqO_22);
            int n = xd_32.id_continue().id_continue();
            rrxT_2[] rrxT_2Array = rrxt_3.id_class(n);
            if (rrxT_2Array == null) {
                rrbb_3.id_protected("Block has no alias: " + xd_32);
                continue;
            }
            for (xc_3 xc_32 : rrWP.id_byte(xd_32)) {
                int n2 = xc_32.id_super();
                rrxT_2 rrxT_22 = rrxt_3.id_class(n, n2);
                if (rrxT_22 != null) continue;
                rrbb_3.id_protected("State has no alias: " + xc_32);
            }
        }
    }

    private static List<List<rrxT_2>> id_case() {
        try {
            String string = "flattening_ids.txt";
            rrbb_3.id_byte("Using legacy block aliases: " + string);
            ArrayList<List<rrxT_2>> arrayList = new ArrayList<List<rrxT_2>>();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            int n = 0;
            InputStream inputStream = rrbb_3.id_class("/" + string);
            if (inputStream == null) {
                return arrayList;
            }
            String[] stringArray = rrbb_3.id_class(inputStream);
            for (int i = 0; i < stringArray.length; ++i) {
                int n2 = i + 1;
                String string3 = stringArray[i];
                if (string3.trim().length() <= 0) continue;
                arrayList2.add(string3);
                if (string3.startsWith("#")) continue;
                if (string3.startsWith("alias")) {
                    String[] stringArray2 = rrbb_3.id_class(string3, " ");
                    String string4 = stringArray2[1];
                    String string5 = stringArray2[2];
                    String string6 = "{Name:'" + string5 + "'";
                    List list = arrayList2.stream().filter(string2 -> string2.startsWith(string6)).collect(Collectors.toList());
                    if (list.size() <= 0) {
                        rrbb_3.id_protected("Block not processed: " + string3);
                        continue;
                    }
                    for (String string7 : list) {
                        String string8 = "{Name:'" + string4 + "'";
                        String string9 = string7.replace(string6, string8);
                        arrayList2.add(string9);
                        rrxt_3.id_class(string9, n2, arrayList);
                        ++n;
                    }
                    continue;
                }
                rrxt_3.id_class(string3, n2, arrayList);
                ++n;
            }
            rrbb_3.id_byte("Legacy block aliases: " + n);
            return arrayList;
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("Error loading legacy block aliases: " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return new ArrayList<List<rrxT_2>>();
        }
    }

    public static void id_protected() {
        id_class = null;
        id_break = false;
        id_byte = null;
    }
}

