/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.aL_2;
import celestial.aW_2;
import celestial.an_3;
import celestial.eL_2;
import celestial.eY_2;
import celestial.en_3;
import celestial.ev_3;
import celestial.iB_2;
import celestial.rTE;
import celestial.rVL;
import celestial.rXQ;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rxy_3;
import celestial.rye_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;

public class eA_2 {
    public static int id_byte(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_new, iB_22);
    }

    public static int id_byte(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_throw, rdn_32);
    }

    public static rdn_3 id_class(Random random, rdn_3 rdn_32, int n, boolean bl) {
        boolean bl2;
        List<eL_2> list = eA_2.id_break(random, rdn_32, n, bl);
        boolean bl3 = bl2 = rdn_32.id_break() == rdy_3.XM;
        if (bl2) {
            rdn_32 = new rdn_3(rdy_3.dm);
        }
        for (eL_2 eL_22 : list) {
            if (bl2) {
                rxy_3.id_class(rdn_32, eL_22);
                continue;
            }
            rdn_32.id_class(eL_22.id_class, eL_22.id_break);
        }
        return rdn_32;
    }

    public static int id_class(Random random, int n, int n2, rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        int n3 = rdb_32.id_protected();
        if (n3 <= 0) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        int n4 = random.nextInt(8) + 1 + (n2 >> 1) + random.nextInt(n2 + 1);
        if (n == 0) {
            return Math.max(n4 / 3, 1);
        }
        return n == 1 ? n4 * 2 / 3 + 1 : Math.max(n4, n2 * 2);
    }

    public static Map.Entry<rXQ, rdn_3> id_class(ev_3 ev_32, iB_2 iB_22, Predicate<rdn_3> predicate) {
        Map<rXQ, rdn_3> map = ev_32.id_class(iB_22);
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<rXQ, rdn_3> entry : map.entrySet()) {
            rdn_3 rdn_32 = entry.getValue();
            if (rdn_32.id_class() || eA_2.id_class(ev_32, rdn_32) <= 0 || !predicate.test(rdn_32)) continue;
            arrayList.add(entry);
        }
        return arrayList.isEmpty() ? null : (Map.Entry)arrayList.get(iB_22.Sa().nextInt(arrayList.size()));
    }

    public static boolean id_class(Collection<ev_3> collection, ev_3 ev_32) {
        for (ev_3 ev_33 : collection) {
            if (ev_33.id_break(ev_32)) continue;
            return false;
        }
        return true;
    }

    public static List<eL_2> id_class(int n, rdn_3 rdn_32, boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        rdb_3 rdb_32 = rdn_32.id_break();
        boolean bl2 = rdn_32.id_break() == rdy_3.XM;
        block0: for (ev_3 ev_32 : rVL.id_boolean) {
            if (ev_32.id_break() && !bl || !ev_32.id_implements() || !ev_32.id_break.id_class(rdb_32) && !bl2) continue;
            for (int i = ev_32.id_class(); i > ev_32.id_throws() - 1; --i) {
                if (n < ev_32.id_class(i) || n > ev_32.id_break(i)) continue;
                arrayList.add(new eL_2(ev_32, i));
                continue block0;
            }
        }
        return arrayList;
    }

    public static void id_class(List<eL_2> list, eL_2 eL_22) {
        Iterator<eL_2> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (eL_22.id_class.id_break(iterator.next().id_class)) continue;
            iterator.remove();
        }
    }

    private static void id_class(en_3 en_32, Iterable<rdn_3> iterable) {
        for (rdn_3 rdn_32 : iterable) {
            eA_2.id_class(en_32, rdn_32);
        }
    }

    private static void id_class(en_3 en_32, rdn_3 rdn_32) {
        if (!rdn_32.id_class()) {
            rcy_3 rcy_32 = rdn_32.id_new();
            for (int i = 0; i < rcy_32.size(); ++i) {
                String string = rcy_32.id_class(i).id_native("id");
                int n = rcy_32.id_class(i).id_private("lvl");
                rVL.id_boolean.id_break(rqO_2.id_break(string)).ifPresent(ev_32 -> en_32.accept((ev_3)ev_32, n));
            }
        }
    }

    public static void id_class(iB_2 iB_22, an_3 an_32) {
        en_3 en_32 = (ev_32, n) -> ev_32.id_break(iB_22, an_32, n);
        if (iB_22 != null) {
            eA_2.id_class(en_32, iB_22.PY());
        }
        if (an_32 instanceof rhd_3) {
            eA_2.id_class(en_32, iB_22.ss());
        }
    }

    public static void id_class(Map<ev_3, Integer> map, rdn_3 rdn_32) {
        rcy_3 rcy_32 = new rcy_3();
        for (Map.Entry<ev_3, Integer> entry : map.entrySet()) {
            ev_3 ev_32 = entry.getKey();
            if (ev_32 == null) continue;
            int n = entry.getValue();
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("id", String.valueOf(rVL.id_boolean.id_break(ev_32)));
            rcd_32.id_class("lvl", (short)n);
            rcy_32.add(rcd_32);
            if (rdn_32.id_break() != rdy_3.dm) continue;
            rxy_3.id_class(rdn_32, new eL_2(ev_32, n));
        }
        if (rcy_32.isEmpty()) {
            rdn_32.id_byte("Enchantments");
        } else if (rdn_32.id_break() != rdy_3.dm) {
            rdn_32.id_class("Enchantments", rcy_32);
        }
    }

    public static int id_class(Iterable<rdn_3> iterable, rye_3 rye_32) {
        MutableInt mutableInt = new MutableInt();
        eA_2.id_class((ev_3 ev_32, int n) -> mutableInt.add(ev_32.id_class(n, rye_32)), iterable);
        return mutableInt.intValue();
    }

    public static float id_class(rdn_3 rdn_32, aL_2 aL_22) {
        MutableFloat mutableFloat = new MutableFloat();
        eA_2.id_class((ev_3 ev_32, int n) -> mutableFloat.add(ev_32.id_class(n, aL_22)), rdn_32);
        return mutableFloat.floatValue();
    }

    public static float id_class(iB_2 iB_22) {
        int n = eA_2.id_class(eY_2.id_super, iB_22);
        return n > 0 ? aW_2.id_throws(n) : 0.0f;
    }

    public static Map<ev_3, Integer> id_class(rdn_3 rdn_32, List<ev_3> list) {
        rcy_3 rcy_32 = rdn_32.id_break() == rdy_3.dm ? rxy_3.id_protected(rdn_32) : rdn_32.id_new();
        return eA_2.id_class(rcy_32, list);
    }

    public static int id_class(ev_3 ev_32, rdn_3 rdn_32) {
        if (rdn_32 == null || rdn_32.id_class()) {
            return 0;
        }
        rqO_2 rqO_22 = rVL.id_boolean.id_break(ev_32);
        rcy_3 rcy_32 = rdn_32.id_new();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rqO_2 rqO_23 = rqO_2.id_break(rcd_32.id_native("id"));
            if (rqO_23 == null || !rqO_23.equals(rqO_22)) continue;
            return rfU_2.id_class(rcd_32.id_private("lvl"), 0, 255);
        }
        return 0;
    }

    public static Map<ev_3, Integer> id_class(rdn_3 rdn_32) {
        rcy_3 rcy_32 = rdn_32.id_break() == rdy_3.dm ? rxy_3.id_protected(rdn_32) : rdn_32.id_new();
        return eA_2.id_class(rcy_32);
    }

    public static int id_class(ev_3 ev_32, iB_2 iB_22) {
        Collection<rdn_3> collection = ev_32.id_class(iB_22).values();
        if (collection == null) {
            return 0;
        }
        int n = 0;
        for (rdn_3 rdn_32 : collection) {
            int n2 = eA_2.id_class(ev_32, rdn_32);
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public static Map<ev_3, Integer> id_class(rcy_3 rcy_32) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rVL.id_boolean.id_break(rqO_2.id_break(rcd_32.id_native("id"))).ifPresent(ev_32 -> linkedHashMap.put(ev_32, rcd_32.id_private("lvl")));
        }
        return linkedHashMap;
    }

    public static Map<ev_3, Integer> id_class(rcy_3 rcy_32, List<ev_3> list) {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rVL.id_boolean.id_break(rqO_2.id_break(rcd_32.id_native("id"))).ifPresent(ev_32 -> {
                if (list.contains(ev_32)) {
                    linkedHashMap.put(ev_32, rcd_32.id_private("lvl"));
                }
            });
        }
        return linkedHashMap;
    }

    public static Map.Entry<rXQ, rdn_3> id_break(ev_3 ev_32, iB_2 iB_22) {
        return eA_2.id_class(ev_32, iB_22, (rdn_3 rdn_32) -> true);
    }

    public static List<eL_2> id_break(Random random, rdn_3 rdn_32, int n, boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        rdb_3 rdb_32 = rdn_32.id_break();
        int n2 = rdb_32.id_protected();
        if (n2 <= 0) {
            return arrayList;
        }
        n = n + 1 + random.nextInt(n2 / 4 + 1) + random.nextInt(n2 / 4 + 1);
        float f = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f;
        List<eL_2> list = eA_2.id_class(n = rfU_2.id_class(Math.round((float)n + (float)n * f), 1, Integer.MAX_VALUE), rdn_32, bl);
        if (!list.isEmpty()) {
            arrayList.add(rTE.id_class(random, list));
            while (random.nextInt(50) <= n) {
                eA_2.id_class(list, (eL_2)rqR_2.id_class(arrayList));
                if (list.isEmpty()) break;
                arrayList.add(rTE.id_class(random, list));
                n /= 2;
            }
        }
        return arrayList;
    }

    public static int id_break(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_instanceof, rdn_32);
    }

    public static void id_break(iB_2 iB_22, an_3 an_32) {
        en_3 en_32 = (ev_32, n) -> ev_32.id_class(iB_22, an_32, n);
        if (iB_22 != null) {
            eA_2.id_class(en_32, iB_22.PY());
        }
        if (iB_22 instanceof rhd_3) {
            eA_2.id_class(en_32, iB_22.ss());
        }
    }

    public static int id_break(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_int, iB_22);
    }

    public static boolean id_throws(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_short, rdn_32) > 0;
    }

    public static int id_throws(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_implements, iB_22);
    }

    public static boolean id_finally(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_native, iB_22) > 0;
    }

    public static int id_catch(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_continue, iB_22);
    }

    public static int id_catch(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_abstract, rdn_32);
    }

    public static int id_case(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_interface, rdn_32);
    }

    public static int id_case(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_this, iB_22);
    }

    public static boolean id_implements(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_finally, iB_22) > 0;
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_extends, rdn_32) > 0;
    }

    public static int id_protected(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_case, iB_22);
    }

    public static boolean id_private(iB_2 iB_22) {
        return eA_2.id_class(eY_2.id_catch, iB_22) > 0;
    }

    public static boolean id_private(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_long, rdn_32) > 0;
    }
}

