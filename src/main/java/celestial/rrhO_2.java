/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qm_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wB_2;
import java.util.HashMap;
import java.util.Map;

public class rrhO_2
extends rrMi_1 {
    private static Map<String, Integer> id_class = null;

    public rrhO_2() {
        super(aI_2.M, "ocelot", 0.4f);
    }

    protected rrhO_2(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wB_2)) {
            return null;
        }
        wB_2 wB_22 = (wB_2)in_1;
        Map<String, Integer> map = rrhO_2.id_catch();
        if (map.containsKey(string)) {
            int n = map.get(string);
            return (Iq_1)rrxr_3.id_class((Object)wB_22, rrxr_3.sy, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qm_3 qm_32 = new qm_3(pg_32);
        qm_32.id_throws = (wB_2)in_1;
        qm_32.id_byte = f;
        return qm_32;
    }

    @Override
    public In_1 id_throws() {
        return new wB_2(0.0f);
    }

    private static Map<String, Integer> id_catch() {
        if (id_class != null) {
            return id_class;
        }
        id_class = new HashMap<String, Integer>();
        id_class.put("back_left_leg", 0);
        id_class.put("back_right_leg", 1);
        id_class.put("front_left_leg", 2);
        id_class.put("front_right_leg", 3);
        id_class.put("tail", 4);
        id_class.put("tail2", 5);
        id_class.put("head", 6);
        id_class.put("body", 7);
        return id_class;
    }

    @Override
    public String[] id_case() {
        return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
    }
}

