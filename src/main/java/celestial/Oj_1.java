/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.OD;
import celestial.OK;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Oj_1
implements Comparable<Oj_1> {
    public final Map<String, OD> id_class = Maps.newHashMap();
    private String[][] id_break = new String[0][];

    public OD id_byte(String string) {
        return this.id_class.get(string);
    }

    public float id_byte() {
        if (this.id_class.isEmpty()) {
            return 0.0f;
        }
        float f = this.id_break.length;
        float f2 = this.id_private();
        return f2 / f;
    }

    public String toString() {
        return "AdvancementProgress{criteria=" + this.id_class + ", requirements=" + Arrays.deepToString((Object[])this.id_break) + "}";
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.id_class((Oj_1)object);
    }

    public int id_class(Oj_1 oj_1) {
        Date date = this.id_catch();
        Date date2 = oj_1.id_catch();
        if (date == null && date2 != null) {
            return 1;
        }
        if (date != null && date2 == null) {
            return -1;
        }
        return date == null && date2 == null ? 0 : date.compareTo(date2);
    }

    public void id_class(Map<String, OK> map, String[][] stringArray) {
        Set<String> set = map.keySet();
        this.id_class.entrySet().removeIf(entry -> !set.contains(entry.getKey()));
        for (String string : set) {
            if (this.id_class.containsKey(string)) continue;
            this.id_class.put(string, new OD());
        }
        this.id_break = stringArray;
    }

    public boolean id_class() {
        if (this.id_break.length == 0) {
            return false;
        }
        for (String[] stringArray : this.id_break) {
            boolean bl = false;
            for (String string : stringArray) {
                OD oD = this.id_byte(string);
                if (oD == null || !oD.id_class()) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    public boolean id_class(String string) {
        OD oD = this.id_class.get(string);
        if (oD != null && !oD.id_class()) {
            oD.id_break();
            return true;
        }
        return false;
    }

    public void id_class(ruu_3 ruu_32) {
        ruu_32.id_protected(this.id_class.size());
        for (Map.Entry<String, OD> entry : this.id_class.entrySet()) {
            ruu_32.id_class(entry.getKey());
            entry.getValue().id_class(ruu_32);
        }
    }

    public boolean id_break() {
        for (OD oD : this.id_class.values()) {
            if (!oD.id_class()) continue;
            return true;
        }
        return false;
    }

    public static Oj_1 id_break(ruu_3 ruu_32) {
        Oj_1 oj_1 = new Oj_1();
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            oj_1.id_class.put(ruu_32.id_throws(Short.MAX_VALUE), OD.id_break(ruu_32));
        }
        return oj_1;
    }

    public boolean id_break(String string) {
        OD oD = this.id_class.get(string);
        if (oD != null && oD.id_class()) {
            oD.id_byte();
            return true;
        }
        return false;
    }

    public Iterable<String> id_throws() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<String, OD> entry : this.id_class.entrySet()) {
            if (entry.getValue().id_class()) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    public Date id_catch() {
        Date date = null;
        for (OD oD : this.id_class.values()) {
            if (!oD.id_class() || date != null && !oD.id_protected().before(date)) continue;
            date = oD.id_protected();
        }
        return date;
    }

    public Iterable<String> id_case() {
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry<String, OD> entry : this.id_class.entrySet()) {
            if (!entry.getValue().id_class()) continue;
            arrayList.add(entry.getKey());
        }
        return arrayList;
    }

    public String id_protected() {
        if (this.id_class.isEmpty()) {
            return null;
        }
        int n = this.id_break.length;
        if (n <= 1) {
            return null;
        }
        int n2 = this.id_private();
        return n2 + "/" + n;
    }

    private int id_private() {
        int n = 0;
        for (String[] stringArray : this.id_break) {
            boolean bl = false;
            for (String string : stringArray) {
                OD oD = this.id_byte(string);
                if (oD == null || !oD.id_class()) continue;
                bl = true;
                break;
            }
            if (!bl) continue;
            ++n;
        }
        return n;
    }
}

