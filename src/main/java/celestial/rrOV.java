/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qB_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tc_3;
import java.util.HashMap;
import java.util.Map;

public class rrOV
extends rrMi_1 {
    private static Map<String, Integer> id_class = rrOV.id_catch();

    public rrOV() {
        super(aI_2.id_long, "hoglin", 0.7f);
    }

    public rrOV(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tc_3)) {
            return null;
        }
        tc_3 tc_32 = (tc_3)in_1;
        if (id_class.containsKey(string)) {
            int n = id_class.get(string);
            return (Iq_1)rrxr_3.id_class((Object)tc_32, rrxr_3.Sq, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qB_2 qB_22 = new qB_2(pg_32);
        qB_22.id_throws = (tc_3)in_1;
        qB_22.id_byte = f;
        return qB_22;
    }

    @Override
    public In_1 id_throws() {
        return new tc_3();
    }

    private static Map<String, Integer> id_catch() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("head", 0);
        hashMap.put("right_ear", 1);
        hashMap.put("left_ear", 2);
        hashMap.put("body", 3);
        hashMap.put("front_right_leg", 4);
        hashMap.put("front_left_leg", 5);
        hashMap.put("back_right_leg", 6);
        hashMap.put("back_left_leg", 7);
        hashMap.put("mane", 8);
        return hashMap;
    }

    @Override
    public String[] id_case() {
        return id_class.keySet().toArray(new String[0]);
    }
}

