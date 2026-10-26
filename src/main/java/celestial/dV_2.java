/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.Jq_1;
import celestial.Wt_1;
import celestial.kd_3;
import celestial.rCN;
import celestial.rCT;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.xc_3;
import celestial.xd_3;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class dV_2
extends xd_3
implements kd_3 {
    public static final rCN id_volatile = Wt_1.id_volatile;
    public static final rCN id_final = Wt_1.id_final;
    public static final rCN id_package = Wt_1.id_package;
    public static final rCN id_int = Wt_1.id_int;
    public static final rCN id_new = rCT.id_throw;
    protected static final Map<rpr_3, rCN> id_continue = Wt_1.id_super.entrySet().stream().filter(entry -> ((rpr_3)entry.getKey()).id_final().id_protected()).collect(rqR_2.id_class());
    protected final rjC_2[] id_super;
    protected final rjC_2[] id_this;
    private final Object2IntMap<xc_3> id_else = new Object2IntOpenHashMap();

    protected dV_2(float f, float f2, float f3, float f4, float f5, Jq_1 jq_1) {
        super(jq_1);
        this.id_super = this.id_class(f, f2, f5, 0.0f, f5);
        this.id_this = this.id_class(f, f2, f3, 0.0f, f4);
        for (xc_3 xc_32 : this.id_abstract.id_class()) {
            this.id_private(xc_32);
        }
    }

    protected rjC_2[] id_class(float f, float f2, float f3, float f4, float f5) {
        float f6 = 8.0f - f;
        float f7 = 8.0f + f;
        float f8 = 8.0f - f2;
        float f9 = 8.0f + f2;
        rjC_2 rjC_22 = xd_3.id_class(f6, 0.0, f6, f7, f3, f7);
        rjC_2 rjC_23 = xd_3.id_class(f8, f4, 0.0, f9, f5, f9);
        rjC_2 rjC_24 = xd_3.id_class(f8, f4, f8, f9, f5, 16.0);
        rjC_2 rjC_25 = xd_3.id_class(0.0, f4, f8, f9, f5, f9);
        rjC_2 rjC_26 = xd_3.id_class(f8, f4, f8, 16.0, f5, f9);
        rjC_2 rjC_27 = rjw_3.id_class(rjC_23, rjC_26);
        rjC_2 rjC_28 = rjw_3.id_class(rjC_24, rjC_25);
        rjC_2[] rjC_2Array = new rjC_2[]{rjw_3.id_class(), rjC_24, rjC_25, rjC_28, rjC_23, rjw_3.id_class(rjC_24, rjC_23), rjw_3.id_class(rjC_25, rjC_23), rjw_3.id_class(rjC_28, rjC_23), rjC_26, rjw_3.id_class(rjC_24, rjC_26), rjw_3.id_class(rjC_25, rjC_26), rjw_3.id_class(rjC_28, rjC_26), rjC_27, rjw_3.id_class(rjC_24, rjC_27), rjw_3.id_class(rjC_25, rjC_27), rjw_3.id_class(rjC_28, rjC_27)};
        for (int i = 0; i < 16; ++i) {
            rjC_2Array[i] = rjw_3.id_class(rjC_22, rjC_2Array[i]);
        }
        return rjC_2Array;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        switch (rpa_32) {
            case LEFT_RIGHT: {
                return (xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_package))).id_class(id_package, xc_32.id_byte(id_volatile));
            }
            case FRONT_BACK: {
                return (xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_final));
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_package))).id_class(id_final, xc_32.id_byte(id_int))).id_class(id_package, xc_32.id_byte(id_volatile))).id_class(id_int, xc_32.id_byte(id_final));
            }
            case COUNTERCLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_final))).id_class(id_final, xc_32.id_byte(id_package))).id_class(id_package, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_volatile));
            }
            case CLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_volatile, xc_32.id_byte(id_int))).id_class(id_final, xc_32.id_byte(id_volatile))).id_class(id_package, xc_32.id_byte(id_final))).id_class(id_int, xc_32.id_byte(id_package));
            }
        }
        return xc_32;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_this[this.id_private(xc_32)];
    }

    private static int id_class(rpr_3 rpr_32) {
        return 1 << rpr_32.id_protected();
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_super[this.id_private(xc_32)];
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_new) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    protected int id_private(xc_3 xc_33) {
        return this.id_else.computeIntIfAbsent((Object)xc_33, xc_32 -> {
            int n = 0;
            if (xc_32.id_byte(id_volatile).booleanValue()) {
                n |= dV_2.id_class(rpr_3.NORTH);
            }
            if (xc_32.id_byte(id_final).booleanValue()) {
                n |= dV_2.id_class(rpr_3.EAST);
            }
            if (xc_32.id_byte(id_package).booleanValue()) {
                n |= dV_2.id_class(rpr_3.SOUTH);
            }
            if (xc_32.id_byte(id_int).booleanValue()) {
                n |= dV_2.id_class(rpr_3.WEST);
            }
            return n;
        });
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_byte(id_new) == false;
    }
}

