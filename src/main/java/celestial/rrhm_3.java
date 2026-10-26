/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qp_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wW_2;
import java.util.HashMap;
import java.util.Map;

public class rrhm_3
extends rrMi_1 {
    private static Map<String, Integer> id_class = null;

    public rrhm_3() {
        super(aI_2.c, "rabbit", 0.3f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wW_2)) {
            return null;
        }
        wW_2 wW_22 = (wW_2)in_1;
        Map<String, Integer> map = rrhm_3.id_catch();
        if (map.containsKey(string)) {
            int n = map.get(string);
            return (Iq_1)rrxr_3.id_class((Object)wW_22, rrxr_3.sK, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qp_3 qp_32 = new qp_3(pg_32);
        qp_32.id_throws = (wW_2)in_1;
        qp_32.id_byte = f;
        return qp_32;
    }

    @Override
    public In_1 id_throws() {
        return new wW_2();
    }

    private static Map<String, Integer> id_catch() {
        if (id_class != null) {
            return id_class;
        }
        id_class = new HashMap<String, Integer>();
        id_class.put("left_foot", 0);
        id_class.put("right_foot", 1);
        id_class.put("left_thigh", 2);
        id_class.put("right_thigh", 3);
        id_class.put("body", 4);
        id_class.put("left_arm", 5);
        id_class.put("right_arm", 6);
        id_class.put("head", 7);
        id_class.put("right_ear", 8);
        id_class.put("left_ear", 9);
        id_class.put("tail", 10);
        id_class.put("nose", 11);
        return id_class;
    }

    @Override
    public String[] id_case() {
        return new String[]{"left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"};
    }
}

