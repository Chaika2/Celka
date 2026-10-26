/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qq_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrxr_3;
import celestial.wz_3;
import java.util.HashMap;
import java.util.Map;

public class rrhZ_2
extends rrMi_1 {
    private static Map<String, Integer> id_class = null;

    public rrhZ_2() {
        super(aI_2.u, "ravager", 1.1f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wz_3)) {
            return null;
        }
        wz_3 wz_32 = (wz_3)in_1;
        Map<String, Integer> map = rrhZ_2.id_catch();
        if (map.containsKey(string)) {
            int n = map.get(string);
            return (Iq_1)rrxr_3.id_class((Object)wz_32, rrxr_3.sU, n);
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qq_3 qq_32 = new qq_3(pg_32);
        qq_32.id_throws = (wz_3)in_1;
        qq_32.id_byte = f;
        return qq_32;
    }

    @Override
    public In_1 id_throws() {
        return new wz_3();
    }

    private static Map<String, Integer> id_catch() {
        if (id_class != null) {
            return id_class;
        }
        id_class = new HashMap<String, Integer>();
        id_class.put("head", 0);
        id_class.put("jaw", 1);
        id_class.put("body", 2);
        id_class.put("leg1", 3);
        id_class.put("leg2", 4);
        id_class.put("leg3", 5);
        id_class.put("leg4", 6);
        id_class.put("neck", 7);
        return id_class;
    }

    @Override
    public String[] id_case() {
        return rrhZ_2.id_catch().keySet().toArray(new String[0]);
    }
}

