/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qL_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wb_3;
import java.util.HashMap;
import java.util.Map;

public class rrhJ_2
extends rrMi_1 {
    private static Map<String, Integer> id_class = null;

    public rrhJ_2() {
        super(aI_2.J, "phantom", 0.75f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        int n;
        Iq_1 iq_1;
        if (!(in_1 instanceof wb_3)) {
            return null;
        }
        wb_3 wb_32 = (wb_3)in_1;
        Map<String, Integer> map = rrhJ_2.id_catch();
        if (map.containsKey(string)) {
            int n2 = map.get(string);
            return (Iq_1)rrxr_3.id_class((Object)wb_32, rrxr_3.sq, n2);
        }
        if (string.equals("head") && (iq_1 = (Iq_1)rrxr_3.id_class((Object)wb_32, rrxr_3.sq, n = map.get("body").intValue())) != null) {
            return iq_1.id_class(1);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qL_2 qL_22 = new qL_2(pg_32);
        qL_22.id_throws = (wb_3)in_1;
        qL_22.id_byte = f;
        return qL_22;
    }

    @Override
    public In_1 id_throws() {
        return new wb_3();
    }

    private static Map<String, Integer> id_catch() {
        if (id_class != null) {
            return id_class;
        }
        id_class = new HashMap<String, Integer>();
        id_class.put("body", 0);
        id_class.put("left_wing", 1);
        id_class.put("left_wing_tip", 2);
        id_class.put("right_wing", 3);
        id_class.put("right_wing_tip", 4);
        id_class.put("tail", 5);
        id_class.put("tail2", 6);
        return id_class;
    }

    @Override
    public String[] id_case() {
        return rrhJ_2.id_catch().keySet().toArray(new String[0]);
    }
}

