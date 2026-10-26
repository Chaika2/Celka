/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap
 */
package celestial;

import celestial.lf_3;
import celestial.lj_3;
import celestial.rRp_1;
import celestial.rfH_2;
import celestial.rqR_2;
import celestial.xc_3;
import celestial.yX_2;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public class lI_2 {
    private boolean id_class;
    private final Long2IntLinkedOpenHashMap id_break = rqR_2.id_class(() -> {
        lf_3 lf_32 = new lf_3(this, 100, 0.25f);
        lf_32.defaultReturnValue(Integer.MAX_VALUE);
        return lf_32;
    });
    private final Long2FloatLinkedOpenHashMap id_byte = rqR_2.id_class(() -> {
        lj_3 lj_32 = new lj_3(this, 100, 0.25f);
        lj_32.defaultReturnValue(Float.NaN);
        return lj_32;
    });

    public int id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        int n;
        long l = rfH_22.id_package();
        if (this.id_class && (n = this.id_break.get(l)) != Integer.MAX_VALUE) {
            return n;
        }
        n = yX_2.id_class(rRp_12, xc_32, rfH_22);
        if (this.id_class) {
            if (this.id_break.size() == 100) {
                this.id_break.removeFirstInt();
            }
            this.id_break.put(l, n);
        }
        return n;
    }

    public void id_class() {
        this.id_class = true;
    }

    public void id_break() {
        this.id_class = false;
        this.id_break.clear();
        this.id_byte.clear();
    }

    public float id_break(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22) {
        float f;
        long l = rfH_22.id_package();
        if (this.id_class && !Float.isNaN(f = this.id_byte.get(l))) {
            return f;
        }
        f = xc_32.id_case(rRp_12, rfH_22);
        if (this.id_class) {
            if (this.id_byte.size() == 100) {
                this.id_byte.removeFirstFloat();
            }
            this.id_byte.put(l, f);
        }
        return f;
    }
}

