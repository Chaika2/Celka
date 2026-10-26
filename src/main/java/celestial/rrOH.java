/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pa_3;
import celestial.pg_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.tT_2;
import java.util.HashMap;
import java.util.Map;

public class rrOH
extends rrMi_1 {
    private static Map<String, Integer> id_class = null;

    public rrOH() {
        super(aI_2.id_throw, "fox", 0.4f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tT_2)) {
            return null;
        }
        tT_2 tT_22 = (tT_2)in_1;
        Map<String, Integer> map = rrOH.id_catch();
        if (map.containsKey(string)) {
            int n = map.get(string);
            return (Iq_1)rrxr_3.id_class((Object)tT_22, rrxr_3.sz, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pa_3 pa_32 = new pa_3(pg_32);
        pa_32.id_throws = (tT_2)in_1;
        pa_32.id_byte = f;
        return pa_32;
    }

    @Override
    public In_1 id_throws() {
        return new tT_2();
    }

    private static Map<String, Integer> id_catch() {
        if (id_class != null) {
            return id_class;
        }
        id_class = new HashMap<String, Integer>();
        id_class.put("head", 0);
        id_class.put("body", 4);
        id_class.put("leg1", 5);
        id_class.put("leg2", 6);
        id_class.put("leg3", 7);
        id_class.put("leg4", 8);
        id_class.put("tail", 9);
        return id_class;
    }

    @Override
    public String[] id_case() {
        return rrOH.id_catch().keySet().toArray(new String[0]);
    }
}

