/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
package celestial;

import celestial.Jq_1;
import celestial.dq_3;
import celestial.kK_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zf_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class zw_3
extends xd_3
implements kd_3 {
    public static final rCN id_volatile = rCT.id_long;
    public static final rCu_1<zf_3> id_final = rCT.id_double;
    public static final rCu_1<zf_3> id_package = rCT.id_switch;
    public static final rCu_1<zf_3> id_int = rCT.r;
    public static final rCu_1<zf_3> id_new = rCT.P;
    public static final rCN id_continue = rCT.id_throw;
    private final Map<xc_3, rjC_2> id_super;
    private final Map<xc_3, rjC_2> id_this;
    private static final rjC_2 id_else = xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
    private static final rjC_2 id_synchronized = xd_3.id_class(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
    private static final rjC_2 id_return = xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
    private static final rjC_2 id_public = xd_3.id_class(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
    private static final rjC_2 id_goto = xd_3.id_class(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

    public zw_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true)).id_class(id_package, zf_3.NONE)).id_class(id_final, zf_3.NONE)).id_class(id_int, zf_3.NONE)).id_class(id_new, zf_3.NONE)).id_class(id_continue, false));
        this.id_super = this.id_class(4.0f, 3.0f, 16.0f, 0.0f, 14.0f, 16.0f);
        this.id_this = this.id_class(4.0f, 3.0f, 24.0f, 0.0f, 24.0f, 24.0f);
    }

    private xc_3 id_class(xc_3 xc_32, boolean bl, boolean bl2, boolean bl3, boolean bl4, rjC_2 rjC_22) {
        return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_package, this.id_class(bl, rjC_22, id_synchronized))).id_class(id_final, this.id_class(bl2, rjC_22, id_goto))).id_class(id_int, this.id_class(bl3, rjC_22, id_return))).id_class(id_new, this.id_class(bl4, rjC_22, id_public));
    }

    private boolean id_class(xc_3 xc_32, xc_3 xc_33, rjC_2 rjC_22) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4 = bl3 = xc_33.id_break() instanceof zw_3 && xc_33.id_byte(id_volatile) != false;
        if (bl3) {
            return true;
        }
        zf_3 zf_32 = xc_32.id_byte(id_package);
        zf_3 zf_33 = xc_32.id_byte(id_int);
        zf_3 zf_34 = xc_32.id_byte(id_final);
        zf_3 zf_35 = xc_32.id_byte(id_new);
        boolean bl5 = zf_33 == zf_3.NONE;
        boolean bl6 = zf_35 == zf_3.NONE;
        boolean bl7 = zf_34 == zf_3.NONE;
        boolean bl8 = zf_32 == zf_3.NONE;
        boolean bl9 = bl2 = bl8 && bl5 && bl6 && bl7 || bl8 != bl5 || bl6 != bl7;
        if (bl2) {
            return true;
        }
        boolean bl10 = bl = zf_32 == zf_3.TALL && zf_33 == zf_3.TALL || zf_34 == zf_3.TALL && zf_35 == zf_3.TALL;
        if (bl) {
            return false;
        }
        return xc_33.id_break().id_class(rls_3.v) || zw_3.id_class(rjC_22, id_else);
    }

    private xc_3 id_class(rRR rRR2, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        rjC_2 rjC_22 = xc_33.id_extends(rRR2, rfH_22).id_class(rpr_3.DOWN);
        xc_3 xc_34 = this.id_class(xc_32, bl, bl2, bl3, bl4, rjC_22);
        return (xc_3)xc_34.id_class(id_volatile, this.id_class(xc_34, xc_33, rjC_22));
    }

    private xc_3 id_class(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32, rfH_2 rfH_23, xc_3 xc_33, rpr_3 rpr_32) {
        rpr_3 rpr_33 = rpr_32.id_case();
        boolean bl = rpr_32 == rpr_3.NORTH ? this.id_class(xc_33, xc_33.id_protected(rRR2, rfH_23, rpr_33), rpr_33) : zw_3.id_class(xc_32, id_package);
        boolean bl2 = rpr_32 == rpr_3.EAST ? this.id_class(xc_33, xc_33.id_protected(rRR2, rfH_23, rpr_33), rpr_33) : zw_3.id_class(xc_32, id_final);
        boolean bl3 = rpr_32 == rpr_3.SOUTH ? this.id_class(xc_33, xc_33.id_protected(rRR2, rfH_23, rpr_33), rpr_33) : zw_3.id_class(xc_32, id_int);
        boolean bl4 = rpr_32 == rpr_3.WEST ? this.id_class(xc_33, xc_33.id_protected(rRR2, rfH_23, rpr_33), rpr_33) : zw_3.id_class(xc_32, id_new);
        rfH_2 rfH_24 = rfH_22.id_final();
        xc_3 xc_34 = rRR2.id_byte(rfH_24);
        return this.id_class(rRR2, xc_32, rfH_24, xc_34, bl, bl2, bl3, bl4);
    }

    private static rjC_2 id_class(rjC_2 rjC_22, zf_3 zf_32, rjC_2 rjC_23, rjC_2 rjC_24) {
        if (zf_32 == zf_3.TALL) {
            return rjw_3.id_class(rjC_22, rjC_24);
        }
        return zf_32 == zf_3.LOW ? rjw_3.id_class(rjC_22, rjC_23) : rjC_22;
    }

    private xc_3 id_class(rRR rRR2, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33) {
        boolean bl = zw_3.id_class(xc_32, id_package);
        boolean bl2 = zw_3.id_class(xc_32, id_final);
        boolean bl3 = zw_3.id_class(xc_32, id_int);
        boolean bl4 = zw_3.id_class(xc_32, id_new);
        return this.id_class(rRR2, xc_32, rfH_22, xc_33, bl, bl2, bl3, bl4);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        switch (rpa_32) {
            case LEFT_RIGHT: {
                return (xc_3)((xc_3)xc_32.id_class(id_package, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_package));
            }
            case FRONT_BACK: {
                return (xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_new))).id_class(id_new, xc_32.id_byte(id_final));
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_package, xc_32.id_byte(id_int))).id_class(id_final, xc_32.id_byte(id_new))).id_class(id_int, xc_32.id_byte(id_package))).id_class(id_new, xc_32.id_byte(id_final));
            }
            case COUNTERCLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_package, xc_32.id_byte(id_final))).id_class(id_final, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_new))).id_class(id_new, xc_32.id_byte(id_package));
            }
            case CLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_package, xc_32.id_byte(id_new))).id_class(id_final, xc_32.id_byte(id_package))).id_class(id_int, xc_32.id_byte(id_final))).id_class(id_new, xc_32.id_byte(id_int));
            }
        }
        return xc_32;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_package, id_final, id_new, id_int, id_continue);
    }

    private zf_3 id_class(boolean bl, rjC_2 rjC_22, rjC_2 rjC_23) {
        if (bl) {
            return zw_3.id_class(rjC_22, rjC_23) ? zf_3.TALL : zf_3.LOW;
        }
        return zf_3.NONE;
    }

    private boolean id_class(xc_3 xc_32, boolean bl, rpr_3 rpr_32) {
        xd_3 xd_32 = xc_32.id_break();
        boolean bl2 = xd_32 instanceof dq_3 && dq_3.id_class(xc_32, rpr_32);
        return xc_32.id_class(rls_3.id_abstract) || !zw_3.id_byte(xd_32) && bl || xd_32 instanceof kK_2 || bl2;
    }

    private Map<xc_3, rjC_2> id_class(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 8.0f - f;
        float f8 = 8.0f + f;
        float f9 = 8.0f - f2;
        float f10 = 8.0f + f2;
        rjC_2 rjC_22 = xd_3.id_class(f7, 0.0, f7, f8, f3, f8);
        rjC_2 rjC_23 = xd_3.id_class(f9, f4, 0.0, f10, f5, f10);
        rjC_2 rjC_24 = xd_3.id_class(f9, f4, f9, f10, f5, 16.0);
        rjC_2 rjC_25 = xd_3.id_class(0.0, f4, f9, f10, f5, f10);
        rjC_2 rjC_26 = xd_3.id_class(f9, f4, f9, 16.0, f5, f10);
        rjC_2 rjC_27 = xd_3.id_class(f9, f4, 0.0, f10, f6, f10);
        rjC_2 rjC_28 = xd_3.id_class(f9, f4, f9, f10, f6, 16.0);
        rjC_2 rjC_29 = xd_3.id_class(0.0, f4, f9, f10, f6, f10);
        rjC_2 rjC_210 = xd_3.id_class(f9, f4, f9, 16.0, f6, f10);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Boolean bl : id_volatile.id_class()) {
            for (zf_3 zf_32 : id_final.id_class()) {
                for (zf_3 zf_33 : id_package.id_class()) {
                    for (zf_3 zf_34 : id_new.id_class()) {
                        for (zf_3 zf_35 : id_int.id_class()) {
                            rjC_2 rjC_211 = rjw_3.id_class();
                            rjC_211 = zw_3.id_class(rjC_211, zf_32, rjC_26, rjC_210);
                            rjC_211 = zw_3.id_class(rjC_211, zf_34, rjC_25, rjC_29);
                            rjC_211 = zw_3.id_class(rjC_211, zf_33, rjC_23, rjC_27);
                            rjC_211 = zw_3.id_class(rjC_211, zf_35, rjC_24, rjC_28);
                            if (bl.booleanValue()) {
                                rjC_211 = rjw_3.id_class(rjC_211, rjC_22);
                            }
                            xc_3 xc_32 = (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_volatile, bl)).id_class(id_final, zf_32)).id_class(id_new, zf_34)).id_class(id_package, zf_33)).id_class(id_int, zf_35);
                            builder.put((Object)((xc_3)xc_32.id_class(id_continue, false)), (Object)rjC_211);
                            builder.put((Object)((xc_3)xc_32.id_class(id_continue, true)), (Object)rjC_211);
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_super.get(xc_32);
    }

    private static boolean id_class(rjC_2 rjC_22, rjC_2 rjC_23) {
        return !rjw_3.id_byte(rjC_23, rjC_22, rjN_2.id_throws);
    }

    private static boolean id_class(xc_3 xc_32, rCZ<zf_3> rCZ2) {
        return xc_32.id_byte(rCZ2) != zf_3.NONE;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_continue).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        if (rpr_32 == rpr_3.DOWN) {
            return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        return rpr_32 == rpr_3.UP ? this.id_class((rRR)rRg_12, xc_32, rfH_23, xc_33) : this.id_class(rRg_12, rfH_22, xc_32, rfH_23, xc_33, rpr_32);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        rfH_2 rfH_23 = rfH_22.id_private();
        rfH_2 rfH_24 = rfH_22.id_extends();
        rfH_2 rfH_25 = rfH_22.id_protected();
        rfH_2 rfH_26 = rfH_22.id_byte();
        rfH_2 rfH_27 = rfH_22.id_final();
        xc_3 xc_32 = rYB2.id_byte(rfH_23);
        xc_3 xc_33 = rYB2.id_byte(rfH_24);
        xc_3 xc_34 = rYB2.id_byte(rfH_25);
        xc_3 xc_35 = rYB2.id_byte(rfH_26);
        xc_3 xc_36 = rYB2.id_byte(rfH_27);
        boolean bl = this.id_class(xc_32, xc_32.id_protected(rYB2, rfH_23, rpr_3.SOUTH), rpr_3.SOUTH);
        boolean bl2 = this.id_class(xc_33, xc_33.id_protected(rYB2, rfH_24, rpr_3.WEST), rpr_3.WEST);
        boolean bl3 = this.id_class(xc_34, xc_34.id_protected(rYB2, rfH_25, rpr_3.NORTH), rpr_3.NORTH);
        boolean bl4 = this.id_class(xc_35, xc_35.id_protected(rYB2, rfH_26, rpr_3.EAST), rpr_3.EAST);
        xc_3 xc_37 = (xc_3)this.id_continue().id_class(id_continue, rXE2.id_class() == rXG.id_byte);
        return this.id_class(rYB2, xc_37, rfH_27, xc_36, bl, bl2, bl3, bl4);
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_this.get(xc_32);
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_continue) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_byte(id_continue) == false;
    }
}

