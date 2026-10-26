/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 */
package celestial;

import celestial.IZ;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rrWx_1;
import celestial.rrbb_3;
import celestial.rrbe_3;
import celestial.rrxr_3;
import com.google.common.primitives.Floats;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rrbU_2 {
    private rrbe_3[] id_break;
    private Map<rrWx_1, Integer> id_byte = new HashMap<rrWx_1, Integer>();
    public static final Integer id_class = new Integer(-1);

    public rrbU_2(rrbe_3[] rrbe_3Array) {
        this.id_break = rrbe_3Array;
    }

    public String toString() {
        return "properties: " + this.id_break.length + ", modelIndexes: " + this.id_byte.size();
    }

    public static rrbU_2 id_class(List<IZ> list) {
        Object object;
        Object object22;
        if (list.isEmpty()) {
            return null;
        }
        if (!rrxr_3.Sx.id_protected()) {
            return null;
        }
        LinkedHashMap<Object, HashSet<Object>> linkedHashMap = new LinkedHashMap<Object, HashSet<Object>>();
        for (IZ rrbe_3Array2 : list) {
            object22 = (Map)rrxr_3.id_class(rrbe_3Array2, rrxr_3.Sx);
            for (Object object3 : object22.keySet()) {
                object = (Float)object22.get(object3);
                if (object == null) continue;
                HashSet<Object> hashSet = (HashSet<Object>)linkedHashMap.get(object3);
                if (hashSet == null) {
                    hashSet = new HashSet<Object>();
                    linkedHashMap.put(object3, hashSet);
                }
                hashSet.add(object);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object object22 : linkedHashMap.keySet()) {
            Object object3;
            Set set = (Set)linkedHashMap.get(object22);
            object3 = Floats.toArray((Collection)set);
            object = new rrbe_3((rqO_2)object22, (float[])object3);
            arrayList.add(object);
        }
        rrbe_3[] rrbe_3Array = arrayList.toArray(new rrbe_3[arrayList.size()]);
        object22 = new rrbU_2(rrbe_3Array);
        rrbU_2.id_class(rrbe_3Array, list);
        return object22;
    }

    private static void id_class(rrbe_3[] rrbe_3Array, List<IZ> list) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < rrbe_3Array.length; ++i) {
            rrbe_3 rrbe_32 = rrbe_3Array[i];
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(rrbe_32.id_class() + "=" + rrbe_32.id_break().length);
        }
        if (list.size() > 0) {
            stringBuffer.append(" -> " + list.get(0).id_class() + " ...");
        }
        rrbb_3.id_byte("ItemOverrideCache: " + stringBuffer.toString());
    }

    public Integer id_class(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        rrWx_1 rrWx_12 = this.id_break(rdn_32, gm_32, iB_22);
        return rrWx_12 == null ? null : this.id_byte.get(rrWx_12);
    }

    public void id_class(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22, Integer n) {
        rrWx_1 rrWx_12 = this.id_break(rdn_32, gm_32, iB_22);
        if (rrWx_12 != null) {
            this.id_byte.put(rrWx_12, n);
        }
    }

    private rrWx_1 id_break(rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        Object[] objectArray = new Integer[this.id_break.length];
        for (int i = 0; i < objectArray.length; ++i) {
            Integer n = this.id_break[i].id_class(rdn_32, gm_32, iB_22);
            if (n == null) {
                return null;
            }
            objectArray[i] = n;
        }
        return new rrWx_1(objectArray);
    }
}

