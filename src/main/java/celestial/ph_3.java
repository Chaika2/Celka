/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HU;
import celestial.Hh_1;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.gm_3;
import celestial.ly_3;
import celestial.rRJ;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.yD_2;
import celestial.yX_2;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class ph_3
implements yD_2 {
    private final QY id_class;
    private final Map<rRJ, Map<String, rfi_3>> id_break = Maps.newIdentityHashMap();
    private final Map<rRJ, Map<String, rfi_3>> id_byte = Maps.newIdentityHashMap();
    private final Map<rRJ, Map<String, Boolean>> id_protected = Maps.newIdentityHashMap();

    public ph_3(QY qY) {
        this.id_class = qY;
    }

    @Override
    public void id_class() {
        this.id_break.clear();
        this.id_byte.clear();
        this.id_protected.clear();
    }

    public void id_class(rfi_3 rfi_32, List<rfi_3> list, List<Boolean> list2, rRJ rRJ2) {
        if (!this.id_break.containsKey(rRJ2)) {
            this.id_break.put(rRJ2, Maps.newHashMap());
        }
        if (!this.id_byte.containsKey(rRJ2)) {
            this.id_byte.put(rRJ2, Maps.newHashMap());
            this.id_protected.put(rRJ2, Maps.newHashMap());
        }
        this.id_break.get(rRJ2).put(rfi_32.toString(), rfi_32);
        for (int i = 0; i < list.size(); ++i) {
            rfi_3 rfi_33 = list.get(i);
            Boolean bl = list2.get(i);
            this.id_byte.get(rRJ2).put(rfi_33.toString(), rfi_33);
            this.id_protected.get(rRJ2).put(rfi_33.toString(), bl);
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        ly_3 ly_32 = ((Hh_1)this.id_class.id_class[16]).id_finally();
        gm_3 gm_32 = (gm_3)this.id_class.id_class[56];
        rRJ rRJ2 = gm_32.id_default();
        rfH_2 rfH_22 = new rfH_2(ly_32.id_break().id_break, 0.0, ly_32.id_break().id_protected);
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_return());
        if (this.id_break.containsKey(rRJ2)) {
            for (rfi_3 object : this.id_break.get(rRJ2).values()) {
                if (!rfH_22.id_class(object.id_catch(), 500.0)) continue;
                yX_2.id_class(ml_1, ok_1, (double)object.id_class - d, (double)object.id_break - d2, (double)object.id_byte - d3, (double)(object.id_protected + 1) - d, (double)(object.id_throws + 1) - d2, (double)(object.id_case + 1) - d3, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (this.id_byte.containsKey(rRJ2)) {
            for (Map.Entry entry : this.id_byte.get(rRJ2).entrySet()) {
                String string = (String)entry.getKey();
                rfi_3 rfi_32 = (rfi_3)entry.getValue();
                Boolean bl = this.id_protected.get(rRJ2).get(string);
                if (!rfH_22.id_class(rfi_32.id_catch(), 500.0)) continue;
                if (bl.booleanValue()) {
                    yX_2.id_class(ml_1, ok_1, (double)rfi_32.id_class - d, (double)rfi_32.id_break - d2, (double)rfi_32.id_byte - d3, (double)(rfi_32.id_protected + 1) - d, (double)(rfi_32.id_throws + 1) - d2, (double)(rfi_32.id_case + 1) - d3, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
                    continue;
                }
                yX_2.id_class(ml_1, ok_1, (double)rfi_32.id_class - d, (double)rfi_32.id_break - d2, (double)rfi_32.id_byte - d3, (double)(rfi_32.id_protected + 1) - d, (double)(rfi_32.id_throws + 1) - d2, (double)(rfi_32.id_case + 1) - d3, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }
}

