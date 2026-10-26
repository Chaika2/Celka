/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.aI_2;
import celestial.rCZ;
import celestial.rVL;
import celestial.rVu_1;
import celestial.rdb_3;
import celestial.rpH_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrMC;
import celestial.rrMH;
import celestial.rrMN;
import celestial.rrMQ;
import celestial.rrMZ;
import celestial.rrMk_1;
import celestial.rrMn_1;
import celestial.rrMp_1;
import celestial.rrMq_1;
import celestial.rrMt_1;
import celestial.rrWP;
import celestial.rrWT;
import celestial.rrWc_1;
import celestial.rrWr_1;
import celestial.rrbM_2;
import celestial.rrbb_3;
import celestial.rsT_2;
import celestial.rxL_2;
import celestial.xc_3;
import celestial.xd_3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class rrMz_1 {
    private String id_byte = null;
    public static final rrMC[] id_class = new rrMC[0];
    public static final rxL_2[] id_break = new rxL_2[0];
    private static Map<rqO_2, rrMk_1> id_protected = null;
    private static final rrMZ<Enum> id_throws = new rrMQ();
    private static final rrMZ<rxL_2> id_case = new rrMN();

    public static int id_byte(String string, int n) {
        if (string == null) {
            return n;
        }
        string = string.trim();
        try {
            return (int)(Long.parseLong(string, 16) & 0xFFFFFFFFFFFFFFFFL);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public rrMn_1[] id_byte(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<rrMn_1> arrayList = new ArrayList<rrMn_1>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrMn_1[] rrMn_1Array = this.id_protected(string2);
            if (rrMn_1Array == null) continue;
            arrayList.addAll(Arrays.asList(rrMn_1Array));
        }
        return arrayList.toArray(new rrMn_1[arrayList.size()]);
    }

    public int[] id_int(String string) {
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rqO_2 rqO_22 = new rqO_2(string2);
            aI_2 aI_22 = rrWc_1.id_class(rqO_22);
            if (aI_22 == null) {
                this.id_extends("Entity not found: " + string2);
                continue;
            }
            int n = rVL.id_transient.id_class(aI_22);
            if (n < 0) {
                this.id_extends("Entity has no ID: " + aI_22 + ", name: " + string2);
                continue;
            }
            treeSet.add(new Integer(n));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        return rrbb_3.id_class(integerArray);
    }

    public rrMz_1(String string) {
        this.id_byte = string;
    }

    public <T> T[] id_class(String string, T[] TArray, rrMZ rrMZ2, String string2, T[] TArray2) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase().trim();
        String[] stringArray = rrbb_3.id_class(string, " ");
        Object[] objectArray = (Object[])Array.newInstance(TArray.getClass().getComponentType(), stringArray.length);
        for (int i = 0; i < stringArray.length; ++i) {
            String string3 = stringArray[i];
            T t = this.id_class(string3, TArray, rrMZ2, string2);
            if (t == null) {
                return TArray2;
            }
            objectArray[i] = t;
        }
        return objectArray;
    }

    public boolean[] id_class(String string, boolean[] blArray) {
        if (string == null) {
            return blArray;
        }
        EnumSet<rpr_3> enumSet = EnumSet.allOf(rpr_3.class);
        String[] stringArray = rrbb_3.id_class(string, " ,");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.equals("sides")) {
                enumSet.add(rpr_3.NORTH);
                enumSet.add(rpr_3.SOUTH);
                enumSet.add(rpr_3.WEST);
                enumSet.add(rpr_3.EAST);
                continue;
            }
            if (string2.equals("all")) {
                enumSet.addAll(Arrays.asList(rpr_3.VALUES));
                continue;
            }
            rpr_3 rpr_32 = this.id_implements(string2);
            if (rpr_32 == null) continue;
            enumSet.add(rpr_32);
        }
        boolean[] blArray2 = new boolean[rpr_3.VALUES.length];
        for (int i = 0; i < blArray2.length; ++i) {
            blArray2[i] = enumSet.contains(rpr_3.VALUES[i]);
        }
        return blArray2;
    }

    public String id_class(String string) {
        int n;
        String string2 = string;
        int n2 = string.lastIndexOf(47);
        if (n2 >= 0) {
            string2 = string.substring(n2 + 1);
        }
        if ((n = string2.lastIndexOf(46)) >= 0) {
            string2 = string2.substring(0, n);
        }
        return string2;
    }

    public int id_class(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = rrbb_3.id_class(string = string.trim(), -1);
        if (n2 < 0) {
            this.id_extends("Invalid number: " + string);
            return n;
        }
        return n2;
    }

    public Enum id_class(String string, Enum[] enumArray, String string2) {
        return this.id_class(string, enumArray, id_throws, string2);
    }

    public Enum[] id_class(String string, Enum[] enumArray, String string2, Enum[] enumArray2) {
        return this.id_class(string, enumArray, id_throws, string2, enumArray2);
    }

    public rrMt_1[] id_class(String string, String string2, rrMt_1[] rrMt_1Array) {
        return this.id_class(string, rrMt_1.values(), id_throws, string2, rrMt_1Array);
    }

    public boolean id_class(String string, boolean bl) {
        if (string == null) {
            return bl;
        }
        String string2 = string.toLowerCase().trim();
        if (string2.equals("true")) {
            return true;
        }
        if (string2.equals("false")) {
            return false;
        }
        this.id_extends("Invalid boolean: " + string);
        return bl;
    }

    public HU id_class(String string, HU hU) {
        if (string == null) {
            return hU;
        }
        string = string.toLowerCase().trim();
        HU[] hUArray = HU.s;
        for (int i = 0; i < hUArray.length; ++i) {
            HU hU2 = hUArray[i];
            if (!string.equals(hU2.id_byte().toLowerCase())) continue;
            return hU2;
        }
        return hU;
    }

    public <T> T id_class(String string, T[] TArray, rrMZ rrMZ2, String string2) {
        if (string == null) {
            return null;
        }
        String string3 = string.toLowerCase().trim();
        for (int i = 0; i < TArray.length; ++i) {
            T t = TArray[i];
            String string4 = rrMZ2.id_class(t);
            if (string4 == null || !string4.toLowerCase().equals(string3)) continue;
            return t;
        }
        this.id_extends("Invalid " + string2 + ": " + string);
        return null;
    }

    public xc_3 id_class(String string, xc_3 xc_32) {
        rrMn_1[] rrMn_1Array = this.id_protected(string);
        if (rrMn_1Array == null) {
            return xc_32;
        }
        if (rrMn_1Array.length != 1) {
            return xc_32;
        }
        rrMn_1 rrMn_12 = rrMn_1Array[0];
        int n = rrMn_12.id_class();
        xd_3 xd_32 = rVL.id_strictfp.id_class(n);
        return xd_32.id_continue();
    }

    public static Comparable id_class(rCZ rCZ2, String string) {
        Class clazz = rCZ2.id_case();
        Comparable comparable = rrMz_1.id_class(string, clazz);
        if (comparable == null) {
            Collection collection = rCZ2.id_class();
            comparable = rrMz_1.id_class(string, collection);
        }
        return comparable;
    }

    public int[] id_class(xd_3 xd_32, String[] stringArray) {
        Object object;
        if (stringArray.length <= 0) {
            return null;
        }
        xc_3 xc_32 = xd_32.id_continue();
        Collection<rCZ> collection = xc_32.id_public();
        HashMap<rCZ, List<Comparable>> hashMap = new HashMap<rCZ, List<Comparable>>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (string.length() <= 0) continue;
            String[] stringArray2 = rrbb_3.id_class(string, "=");
            if (stringArray2.length != 2) {
                this.id_extends("Invalid block property: " + string);
                return null;
            }
            object = stringArray2[0];
            String string2 = stringArray2[1];
            rCZ rCZ2 = rrbM_2.id_class((String)object, collection);
            if (rCZ2 == null) {
                this.id_extends("Property not found: " + (String)object + ", block: " + xd_32);
                return null;
            }
            ArrayList<Comparable> arrayList = (ArrayList<Comparable>)hashMap.get(object);
            if (arrayList == null) {
                arrayList = new ArrayList<Comparable>();
                hashMap.put(rCZ2, arrayList);
            }
            String[] stringArray3 = rrbb_3.id_class(string2, ",");
            for (int j = 0; j < stringArray3.length; ++j) {
                String string3 = stringArray3[j];
                Comparable comparable = rrMz_1.id_class(rCZ2, string3);
                if (comparable == null) {
                    this.id_extends("Property value not found: " + string3 + ", property: " + (String)object + ", block: " + xd_32);
                    return null;
                }
                arrayList.add(comparable);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = rrWP.id_break(xd_32);
        for (int i = 0; i < n; ++i) {
            try {
                object = rrWP.id_class(xd_32, i);
                if (!this.id_class((xc_3)object, hashMap)) continue;
                arrayList.add(i);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (arrayList.size() == n) {
            return null;
        }
        int[] nArray = new int[arrayList.size()];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = (Integer)arrayList.get(i);
        }
        return nArray;
    }

    public xd_3[] id_class(String string, String string2) {
        String string3 = string + ":" + string2;
        rqO_2 rqO_22 = new rqO_2(string3);
        xd_3 xd_32 = rrWP.id_class(rqO_22);
        if (xd_32 == null) {
            this.id_extends("Block not found for name: " + string3);
            return null;
        }
        return new xd_3[]{xd_32};
    }

    public boolean id_class(String[] stringArray) {
        if (stringArray.length <= 1) {
            return false;
        }
        String string = stringArray[1];
        if (string.length() < 1) {
            return false;
        }
        return !string.contains("=");
    }

    public rxL_2[] id_class(String string, String string2, rxL_2[] rxL_2Array) {
        return this.id_class(string, rxL_2.values(), id_case, string2, rxL_2Array);
    }

    public boolean id_class(xc_3 xc_32, Map<rCZ, List<Comparable>> map) {
        for (rCZ rCZ2 : map.keySet()) {
            List<Comparable> list = map.get(rCZ2);
            Object t = xc_32.id_byte(rCZ2);
            if (t == null) {
                return false;
            }
            if (list.contains(t)) continue;
            return false;
        }
        return true;
    }

    public static Comparable id_class(String string, Class clazz) {
        if (clazz == String.class) {
            return string;
        }
        if (clazz == Boolean.class) {
            return Boolean.valueOf(string);
        }
        if (clazz == Float.class) {
            return Float.valueOf(string);
        }
        if (clazz == Double.class) {
            return Double.valueOf(string);
        }
        if (clazz == Integer.class) {
            return Integer.valueOf(string);
        }
        return clazz == Long.class ? Long.valueOf(string) : null;
    }

    private static Object id_class(Comparable comparable) {
        if (comparable instanceof rpH_2) {
            rpH_2 rpH_22 = (rpH_2)((Object)comparable);
            return rpH_22.id_class();
        }
        return comparable.toString();
    }

    public static Comparable id_class(String string, Collection collection) {
        for (Comparable comparable : (Set)collection) {
            if (!rrMz_1.id_class(comparable).equals(string)) continue;
            return comparable;
        }
        return null;
    }

    public static int id_break(String string, int n) {
        if (string == null) {
            return n;
        }
        string = string.trim();
        try {
            return Integer.parseInt(string, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public String id_break(String string) {
        int n = string.lastIndexOf(47);
        return n < 0 ? "" : string.substring(0, n);
    }

    public rrMH id_break(String string, String string2) {
        return string != null && string2 != null ? new rrMH(string, string2) : null;
    }

    public boolean id_throws(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() < 1) {
            return false;
        }
        char c = string.charAt(0);
        return Character.isDigit(c);
    }

    public void id_finally(String string) {
        rrbb_3.id_byte(this.id_byte + ": " + string);
    }

    public rrMk_1 id_catch(String string) {
        rqO_2 rqO_22 = new rqO_2(string = string.toLowerCase());
        rrMk_1 rrMk_12 = rrWr_1.id_break(rqO_22);
        if (rrMk_12 != null) {
            return rrMk_12;
        }
        String string2 = string.replace(" ", "").replace("_", "");
        rqO_2 rqO_23 = new rqO_2(string2);
        if (id_protected == null) {
            id_protected = new HashMap<rqO_2, rrMk_1>();
            for (rqO_2 rqO_24 : rrWr_1.id_break()) {
                rrMk_1 rrMk_13 = rrWr_1.id_break(rqO_24);
                if (rrMk_13 == null) continue;
                String string3 = rqO_24.id_break().replace(" ", "").replace("_", "").toLowerCase();
                rqO_2 rqO_25 = new rqO_2(rqO_24.id_byte(), string3);
                id_protected.put(rqO_25, rrMk_13);
            }
        }
        return (rrMk_12 = id_protected.get(rqO_23)) != null ? rrMk_12 : null;
    }

    public void id_extends(String string) {
        rrbb_3.id_protected(this.id_byte + ": " + string);
    }

    public rrMk_1[] id_case(String string) {
        if (string == null) {
            return null;
        }
        string = string.trim();
        boolean bl = false;
        if (string.startsWith("!")) {
            bl = true;
            string = string.substring(1);
        }
        String[] stringArray = rrbb_3.id_class(string, " ");
        List<rrMk_1> list = new ArrayList<rrMk_1>();
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrMk_1 rrMk_12 = this.id_catch(string2);
            if (rrMk_12 == null) {
                this.id_extends("Biome not found: " + (String)string2);
                continue;
            }
            list.add(rrMk_12);
        }
        if (bl) {
            HashSet<rqO_2> hashSet = new HashSet<rqO_2>(rrWr_1.id_break());
            for (rrMk_1 rrMk_12 : list) {
                hashSet.remove(rrMk_12.id_break());
            }
            list = rrWr_1.id_class(hashSet);
        }
        return list.toArray(new rrMk_1[list.size()]);
    }

    private rrMC id_continue(String string) {
        Object object;
        Object object2;
        Object object3 = string;
        Object object4 = null;
        int n = string.lastIndexOf(58);
        if (n >= 0) {
            object2 = string.substring(0, n);
            object = string.substring(n + 1);
            if (((String)object).isEmpty() || ((String)object).matches("[0-9].*")) {
                object3 = object2;
                object4 = object;
            }
        }
        if ((object2 = this.id_super((String)object3)) == null) {
            return null;
        }
        object = this.id_private((String)object4);
        return new rrMC((rsT_2)object2, (int[])object);
    }

    public rpr_3 id_implements(String string) {
        if (!(string = string.toLowerCase()).equals("bottom") && !string.equals("down")) {
            if (!string.equals("top") && !string.equals("up")) {
                if (string.equals("north")) {
                    return rpr_3.NORTH;
                }
                if (string.equals("south")) {
                    return rpr_3.SOUTH;
                }
                if (string.equals("east")) {
                    return rpr_3.EAST;
                }
                if (string.equals("west")) {
                    return rpr_3.WEST;
                }
                rrbb_3.id_protected("Unknown face: " + string);
                return null;
            }
            return rpr_3.UP;
        }
        return rpr_3.DOWN;
    }

    private rrMp_1 id_new(String string) {
        if (string == null) {
            return null;
        }
        if (string.indexOf(45) >= 0) {
            String[] stringArray = rrbb_3.id_class(string, "-");
            if (stringArray.length != 2) {
                this.id_extends("Invalid range: " + string);
                return null;
            }
            int n = rrbb_3.id_class(stringArray[0], -1);
            int n2 = rrbb_3.id_class(stringArray[1], -1);
            if (n >= 0 && n2 >= 0) {
                return new rrMp_1(n, n2);
            }
            this.id_extends("Invalid range: " + string);
            return null;
        }
        int n = rrbb_3.id_class(string, -1);
        if (n < 0) {
            this.id_extends("Invalid integer: " + string);
            return null;
        }
        return new rrMp_1(n, n);
    }

    public int[] id_package(String string) {
        string = string.trim();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rqO_2 rqO_22 = new rqO_2(string2);
            rdb_3 rdb_32 = rrWT.id_class(rqO_22);
            if (rdb_32 == null) {
                this.id_extends("Item not found: " + string2);
                continue;
            }
            int n = rrWT.id_class(rdb_32);
            if (n < 0) {
                this.id_extends("Item has no ID: " + rdb_32 + ", name: " + string2);
                continue;
            }
            treeSet.add(new Integer(n));
        }
        Integer[] integerArray = treeSet.toArray(new Integer[treeSet.size()]);
        return rrbb_3.id_class(integerArray);
    }

    private rsT_2 id_super(String string) {
        if (string == null) {
            return null;
        }
        rVu_1<rsT_2> rVu_12 = rVL.J;
        rqO_2 rqO_22 = new rqO_2(string = string.toLowerCase());
        return !((rVL)rVu_12).id_byte(rqO_22) ? null : (rsT_2)((rVL)rVu_12).id_class(rqO_22);
    }

    public rrMn_1[] id_protected(String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).length() <= 0) {
            return null;
        }
        String[] stringArray = rrbb_3.id_class(string, ":");
        String string2 = "minecraft";
        int n = 0;
        if (stringArray.length > 1 && this.id_class(stringArray)) {
            string2 = stringArray[0];
            n = 1;
        } else {
            string2 = "minecraft";
            n = 0;
        }
        String string3 = stringArray[n];
        String[] stringArray2 = Arrays.copyOfRange(stringArray, n + 1, stringArray.length);
        xd_3[] xd_3Array = this.id_class(string2, string3);
        if (xd_3Array == null) {
            return null;
        }
        rrMn_1[] rrMn_1Array = new rrMn_1[xd_3Array.length];
        for (int i = 0; i < xd_3Array.length; ++i) {
            rrMn_1 rrMn_12;
            xd_3 xd_32 = xd_3Array[i];
            int n2 = rVL.id_strictfp.id_class(xd_32);
            int[] nArray = null;
            if (stringArray2.length > 0 && (nArray = this.id_class(xd_32, stringArray2)) == null) {
                return null;
            }
            rrMn_1Array[i] = rrMn_12 = new rrMn_1(n2, nArray);
        }
        return rrMn_1Array;
    }

    public int[] id_private(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String[] stringArray = rrbb_3.id_class(string, " ,");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (string2.contains("-")) {
                String[] stringArray2 = rrbb_3.id_class(string2, "-");
                if (stringArray2.length != 2) {
                    this.id_extends("Invalid interval: " + string2 + ", when parsing: " + string);
                    continue;
                }
                int n = rrbb_3.id_class(stringArray2[0], -1);
                int n2 = rrbb_3.id_class(stringArray2[1], -1);
                if (n >= 0 && n2 >= 0 && n <= n2) {
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(j);
                    }
                    continue;
                }
                this.id_extends("Invalid interval: " + string2 + ", when parsing: " + string);
                continue;
            }
            int n = rrbb_3.id_class(string2, -1);
            if (n < 0) {
                this.id_extends("Invalid number: " + string2 + ", when parsing: " + string);
                continue;
            }
            arrayList.add(n);
        }
        int[] nArray = new int[arrayList.size()];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = (Integer)arrayList.get(i);
        }
        return nArray;
    }

    public rrMC[] id_final(String string) {
        if (string == null) {
            return null;
        }
        ArrayList<rrMC> arrayList = new ArrayList<rrMC>();
        String[] stringArray = rrbb_3.id_class(string, " ");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrMC rrMC2 = this.id_continue(string2);
            if (rrMC2 == null) {
                this.id_extends("Invalid profession: " + string2);
                return id_class;
            }
            arrayList.add(rrMC2);
        }
        return arrayList.isEmpty() ? null : arrayList.toArray(new rrMC[arrayList.size()]);
    }

    public Boolean id_volatile(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.toLowerCase().trim();
        if (string2.equals("true")) {
            return Boolean.TRUE;
        }
        if (string2.equals("false")) {
            return Boolean.FALSE;
        }
        this.id_extends("Invalid boolean: " + string);
        return null;
    }

    public rrMq_1 id_native(String string) {
        if (string == null) {
            return null;
        }
        rrMq_1 rrMq_12 = new rrMq_1();
        String[] stringArray = rrbb_3.id_class(string, " ,");
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rrMp_1 rrMp_12 = this.id_new(string2);
            if (rrMp_12 == null) {
                return null;
            }
            rrMq_12.id_class(rrMp_12);
        }
        return rrMq_12;
    }
}

