/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rrMn_1;
import celestial.rrMz_1;
import celestial.rrbb_3;
import celestial.rrxA_2;
import celestial.rrxt_3;
import celestial.rrzE_2;
import celestial.rrzM_2;
import celestial.xc_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class rrbW_2 {
    private static HU[] id_break = null;
    public static boolean id_class = false;

    private static void id_class(String string, Properties properties, List<HU> list) {
        rrbb_3.id_byte("CustomBlockLayers: " + string);
        rrbW_2.id_class("solid", rrxA_2.id_class, properties, list);
        rrbW_2.id_class("cutout", rrxA_2.id_byte, properties, list);
        rrbW_2.id_class("cutout_mipped", rrxA_2.id_break, properties, list);
        rrbW_2.id_class("translucent", rrxA_2.id_protected, properties, list);
    }

    private static void id_class(String string, HU hU, Properties properties, List<HU> list) {
        rrMz_1 rrMz_12;
        rrMn_1[] rrMn_1Array;
        String string2 = "layer." + string;
        String string3 = properties.getProperty(string2);
        if (string3 != null && (rrMn_1Array = (rrMz_12 = new rrMz_1("CustomBlockLayers")).id_byte(string3)) != null) {
            for (int i = 0; i < rrMn_1Array.length; ++i) {
                rrMn_1 rrMn_12 = rrMn_1Array[i];
                int n = rrMn_12.id_class();
                if (n <= 0) continue;
                while (list.size() < n + 1) {
                    list.add(null);
                }
                if (list.get(n) != null) {
                    rrbb_3.id_protected("CustomBlockLayers: Block layer is already set, block: " + n + ", layer: " + string);
                }
                list.set(n, hU);
            }
        }
    }

    public static HU id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22) {
        if (id_break == null) {
            return null;
        }
        if (xc_32.id_implements(rRq_12, rfH_22)) {
            return null;
        }
        int n = xc_32.id_continue();
        return n > 0 && n < id_break.length ? id_break[n] : null;
    }

    public static void id_class() {
        rrzE_2 rrzE_22;
        id_break = null;
        id_class = false;
        ArrayList<HU> arrayList = new ArrayList<HU>();
        String string = "optifine/block.properties";
        Properties properties = rrzM_2.id_break(string, "CustomBlockLayers");
        if (properties != null) {
            rrbW_2.id_class(string, properties, arrayList);
        }
        if (rrbb_3.rs() && (rrzE_22 = rrxt_3.id_byte()) != null) {
            String string2 = "shaders/block.properties";
            rrbW_2.id_class(string2, rrzE_22, arrayList);
        }
        if (!arrayList.isEmpty()) {
            id_break = arrayList.toArray(new HU[arrayList.size()]);
            id_class = true;
        }
    }

    public static boolean id_break() {
        return id_class;
    }
}

