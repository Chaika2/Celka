/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qU_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wH_2;
import java.util.HashMap;
import java.util.Map;

public class rrhf_3
extends rrMi_1 {
    private static Map<String, Integer> id_class = rrhf_3.id_catch();

    public rrhf_3() {
        super(aI_2.w, "strider", 0.5f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wH_2)) {
            return null;
        }
        wH_2 wH_22 = (wH_2)in_1;
        if (id_class.containsKey(string)) {
            int n = id_class.get(string);
            return (Iq_1)rrxr_3.id_class((Object)wH_22, rrxr_3.Ec, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qU_2 qU_22 = new qU_2(pg_32);
        qU_22.id_throws = (wH_2)in_1;
        qU_22.id_byte = f;
        return qU_22;
    }

    @Override
    public In_1 id_throws() {
        return new wH_2();
    }

    private static Map<String, Integer> id_catch() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("right_leg", 0);
        hashMap.put("left_leg", 1);
        hashMap.put("body", 2);
        hashMap.put("hair_right_bottom", 3);
        hashMap.put("hair_right_middle", 4);
        hashMap.put("hair_right_top", 5);
        hashMap.put("hair_left_top", 6);
        hashMap.put("hair_left_middle", 7);
        hashMap.put("hair_left_bottom", 8);
        return hashMap;
    }

    @Override
    public String[] id_case() {
        return id_class.keySet().toArray(new String[0]);
    }
}

