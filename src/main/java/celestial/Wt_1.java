/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Jq_1;
import celestial.rCN;
import celestial.rCT;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Maps;
import java.util.Map;

public class Wt_1
extends xd_3 {
    private static final rpr_3[] id_else = rpr_3.values();
    public static final rCN id_volatile = rCT.id_void;
    public static final rCN id_final = rCT.id_static;
    public static final rCN id_package = rCT.id_import;
    public static final rCN id_int = rCT.id_short;
    public static final rCN id_new = rCT.id_long;
    public static final rCN id_continue = rCT.id_float;
    public static final Map<rpr_3, rCN> id_super = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), (T enumMap) -> {
        enumMap.put(rpr_3.NORTH, id_volatile);
        enumMap.put(rpr_3.EAST, id_final);
        enumMap.put(rpr_3.SOUTH, id_package);
        enumMap.put(rpr_3.WEST, id_int);
        enumMap.put(rpr_3.UP, id_new);
        enumMap.put(rpr_3.DOWN, id_continue);
    });
    protected final rjC_2[] id_this;

    protected Wt_1(float f, Jq_1 jq_1) {
        super(jq_1);
        this.id_this = this.id_class(f);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_this[this.id_private(xc_32)];
    }

    private rjC_2[] id_class(float f) {
        float f2 = 0.5f - f;
        float f3 = 0.5f + f;
        rjC_2 rjC_22 = xd_3.id_class(f2 * 16.0f, f2 * 16.0f, f2 * 16.0f, f3 * 16.0f, f3 * 16.0f, f3 * 16.0f);
        rjC_2[] rjC_2Array = new rjC_2[id_else.length];
        for (int i = 0; i < id_else.length; ++i) {
            rpr_3 rpr_32 = id_else[i];
            rjC_2Array[i] = rjw_3.id_class(0.5 + Math.min((double)(-f), (double)rpr_32.id_implements() * 0.5), 0.5 + Math.min((double)(-f), (double)rpr_32.id_finally() * 0.5), 0.5 + Math.min((double)(-f), (double)rpr_32.id_extends() * 0.5), 0.5 + Math.max((double)f, (double)rpr_32.id_implements() * 0.5), 0.5 + Math.max((double)f, (double)rpr_32.id_finally() * 0.5), 0.5 + Math.max((double)f, (double)rpr_32.id_extends() * 0.5));
        }
        rjC_2[] rjC_2Array2 = new rjC_2[64];
        for (int i = 0; i < 64; ++i) {
            rjC_2 rjC_23 = rjC_22;
            for (int j = 0; j < id_else.length; ++j) {
                if ((i & 1 << j) == 0) continue;
                rjC_23 = rjw_3.id_class(rjC_23, rjC_2Array[j]);
            }
            rjC_2Array2[i] = rjC_23;
        }
        return rjC_2Array2;
    }

    protected int id_private(xc_3 xc_32) {
        int n = 0;
        for (int i = 0; i < id_else.length; ++i) {
            if (!((Boolean)xc_32.id_byte(id_super.get(id_else[i]))).booleanValue()) continue;
            n |= 1 << i;
        }
        return n;
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return false;
    }
}

