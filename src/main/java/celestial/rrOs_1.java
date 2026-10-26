/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pu_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tk_3;
import java.util.HashMap;
import java.util.Map;

public class rrOs_1
extends rrMi_1 {
    private static Map<String, Integer> id_class = rrOs_1.id_catch();

    public rrOs_1() {
        super(aI_2.id_throws, "bee", 0.4f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tk_3)) {
            return null;
        }
        tk_3 tk_32 = (tk_3)in_1;
        if (id_class.containsKey(string)) {
            int n = id_class.get(string);
            return (Iq_1)rrxr_3.id_class((Object)tk_32, rrxr_3.SC, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pu_3 pu_32 = new pu_3(pg_32);
        pu_32.id_throws = (tk_3)in_1;
        pu_32.id_byte = f;
        return pu_32;
    }

    @Override
    public In_1 id_throws() {
        return new tk_3();
    }

    private static Map<String, Integer> id_catch() {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("body", 0);
        hashMap.put("torso", 1);
        hashMap.put("right_wing", 2);
        hashMap.put("left_wing", 3);
        hashMap.put("front_legs", 4);
        hashMap.put("middle_legs", 5);
        hashMap.put("back_legs", 6);
        hashMap.put("stinger", 7);
        hashMap.put("left_antenna", 8);
        hashMap.put("right_antenna", 9);
        return hashMap;
    }

    @Override
    public String[] id_case() {
        return id_class.keySet().toArray(new String[0]);
    }
}

