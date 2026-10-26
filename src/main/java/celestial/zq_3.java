/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.JC;
import celestial.Jq_1;
import celestial.Wt_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rpa_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class zq_3
extends xd_3 {
    public static final rCN id_volatile = Wt_1.id_new;
    public static final rCN id_final = Wt_1.id_volatile;
    public static final rCN id_package = Wt_1.id_final;
    public static final rCN id_int = Wt_1.id_package;
    public static final rCN id_new = Wt_1.id_int;
    public static final Map<rpr_3, rCN> id_continue = Wt_1.id_super.entrySet().stream().filter(entry -> entry.getKey() != rpr_3.DOWN).collect(rqR_2.id_class());
    private static final rjC_2 id_super = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final rjC_2 id_else = xd_3.id_class(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final rjC_2 id_synchronized = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final rjC_2 id_return = xd_3.id_class(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    private final Map<xc_3, rjC_2> id_public;

    public zq_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_final, false)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, false));
        this.id_public = ImmutableMap.copyOf(this.id_abstract.id_class().stream().collect(Collectors.toMap(Function.identity(), zq_3::id_private)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package, id_int, id_new);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class());
        boolean bl = xc_32.id_class(this);
        xc_3 xc_33 = bl ? xc_32 : this.id_continue();
        for (rpr_3 rpr_32 : rxx_32.id_throws()) {
            boolean bl2;
            if (rpr_32 == rpr_3.DOWN) continue;
            rCN rCN2 = zq_3.id_class(rpr_32);
            boolean bl3 = bl2 = bl && xc_32.id_byte(rCN2) != false;
            if (bl2 || !this.id_break(rxx_32.id_int(), rxx_32.id_class(), rpr_32)) continue;
            return (xc_3)xc_33.id_class(rCN2, true);
        }
        return bl ? xc_33 : null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        xc_3 xc_33 = rxx_32.id_int().id_byte(rxx_32.id_class());
        if (xc_33.id_class(this)) {
            return this.id_volatile(xc_33) < id_continue.size();
        }
        return super.id_class(xc_32, rxx_32);
    }

    private boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        int n = 4;
        Iterable<rfH_2> iterable = rfH_2.id_break(rfH_22.b_() - 4, rfH_22.c_() - 1, rfH_22.d_() - 4, rfH_22.b_() + 4, rfH_22.c_() + 1, rfH_22.d_() + 4);
        int n2 = 5;
        for (rfH_2 rfH_23 : iterable) {
            if (!rRq_12.id_byte(rfH_23).id_class(this) || --n2 > 0) continue;
            return false;
        }
        return true;
    }

    private xc_3 id_class(xc_3 xc_32, xc_3 xc_33, Random random) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rCN rCN2;
            if (!random.nextBoolean() || !xc_32.id_byte(rCN2 = zq_3.id_class(rpr_32)).booleanValue()) continue;
            xc_33 = (xc_3)xc_33.id_class(rCN2, true);
        }
        return xc_33;
    }

    public static rCN id_class(rpr_3 rpr_32) {
        return id_continue.get(rpr_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        switch (rpa_32) {
            case LEFT_RIGHT: {
                return (xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_final));
            }
            case FRONT_BACK: {
                return (xc_3)((xc_3)xc_32.id_class(id_package, xc_32.id_byte(id_new))).id_class(id_new, xc_32.id_byte(id_package));
            }
        }
        return super.id_class(xc_32, rpa_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        switch (rqd_32) {
            case CLOCKWISE_180: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_int))).id_class(id_package, xc_32.id_byte(id_new))).id_class(id_int, xc_32.id_byte(id_final))).id_class(id_new, xc_32.id_byte(id_package));
            }
            case COUNTERCLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_package))).id_class(id_package, xc_32.id_byte(id_int))).id_class(id_int, xc_32.id_byte(id_new))).id_class(id_new, xc_32.id_byte(id_final));
            }
            case CLOCKWISE_90: {
                return (xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_final, xc_32.id_byte(id_new))).id_class(id_package, xc_32.id_byte(id_final))).id_class(id_int, xc_32.id_byte(id_package))).id_class(id_new, xc_32.id_byte(id_int));
            }
        }
        return xc_32;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_public.get(xc_32);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return this.id_implements(this.id_catch(xc_32, rRR2, rfH_22));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == rpr_3.DOWN) {
            return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        xc_3 xc_34 = this.id_catch(xc_32, rRg_12, rfH_22);
        return !this.id_implements(xc_34) ? xu_3.id_class.id_continue() : xc_34;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_int.nextInt(4) == 0) {
            rpr_3 rpr_32 = rpr_3.id_class(random);
            rfH_2 rfH_23 = rfH_22.id_final();
            if (rpr_32.id_final().id_protected() && !xc_32.id_byte(zq_3.id_class(rpr_32)).booleanValue()) {
                if (this.id_class((rRq_1)rrEm_12, rfH_22)) {
                    rfH_2 rfH_24 = rfH_22.id_break(rpr_32);
                    xc_3 xc_33 = rrEm_12.id_byte(rfH_24);
                    if (xc_33.id_catch()) {
                        rpr_3 rpr_33 = rpr_32.id_catch();
                        rpr_3 rpr_34 = rpr_32.id_private();
                        boolean bl = xc_32.id_byte(zq_3.id_class(rpr_33));
                        boolean bl2 = xc_32.id_byte(zq_3.id_class(rpr_34));
                        rfH_2 rfH_25 = rfH_24.id_break(rpr_33);
                        rfH_2 rfH_26 = rfH_24.id_break(rpr_34);
                        if (bl && zq_3.id_class((rRq_1)rrEm_12, rfH_25, rpr_33)) {
                            rrEm_12.id_class(rfH_24, (xc_3)this.id_continue().id_class(zq_3.id_class(rpr_33), true), 2);
                        } else if (bl2 && zq_3.id_class((rRq_1)rrEm_12, rfH_26, rpr_34)) {
                            rrEm_12.id_class(rfH_24, (xc_3)this.id_continue().id_class(zq_3.id_class(rpr_34), true), 2);
                        } else {
                            rpr_3 rpr_35 = rpr_32.id_case();
                            if (bl && rrEm_12.id_finally(rfH_25) && zq_3.id_class((rRq_1)rrEm_12, rfH_22.id_break(rpr_33), rpr_35)) {
                                rrEm_12.id_class(rfH_25, (xc_3)this.id_continue().id_class(zq_3.id_class(rpr_35), true), 2);
                            } else if (bl2 && rrEm_12.id_finally(rfH_26) && zq_3.id_class((rRq_1)rrEm_12, rfH_22.id_break(rpr_34), rpr_35)) {
                                rrEm_12.id_class(rfH_26, (xc_3)this.id_continue().id_class(zq_3.id_class(rpr_35), true), 2);
                            } else if ((double)rrEm_12.id_int.nextFloat() < 0.05 && zq_3.id_class((rRq_1)rrEm_12, rfH_24.id_final(), rpr_3.UP)) {
                                rrEm_12.id_class(rfH_24, (xc_3)this.id_continue().id_class(id_volatile, true), 2);
                            }
                        }
                    } else if (zq_3.id_class((rRq_1)rrEm_12, rfH_24, rpr_32)) {
                        rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(zq_3.id_class(rpr_32), true), 2);
                    }
                }
            } else {
                xc_3 xc_34;
                xc_3 xc_35;
                rfH_2 rfH_27;
                xc_3 xc_36;
                if (rpr_32 == rpr_3.UP && rfH_22.c_() < 255) {
                    if (this.id_break(rrEm_12, rfH_22, rpr_32)) {
                        rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 2);
                        return;
                    }
                    if (rrEm_12.id_finally(rfH_23)) {
                        if (!this.id_class((rRq_1)rrEm_12, rfH_22)) {
                            return;
                        }
                        xc_3 xc_37 = xc_32;
                        for (rpr_3 rpr_36 : rpb_3.HORIZONTAL) {
                            if (!random.nextBoolean() && zq_3.id_class((rRq_1)rrEm_12, rfH_23.id_break(rpr_36), rpr_3.UP)) continue;
                            xc_37 = (xc_3)xc_37.id_class(zq_3.id_class(rpr_36), false);
                        }
                        if (this.id_final(xc_37)) {
                            rrEm_12.id_class(rfH_23, xc_37, 2);
                        }
                        return;
                    }
                }
                if (rfH_22.c_() > 0 && ((xc_36 = rrEm_12.id_byte(rfH_27 = rfH_22.id_break())).id_catch() || xc_36.id_class(this)) && (xc_35 = xc_36.id_catch() ? this.id_continue() : xc_36) != (xc_34 = this.id_class(xc_32, xc_35, random)) && this.id_final(xc_34)) {
                    rrEm_12.id_class(rfH_27, xc_34, 2);
                }
            }
        }
    }

    public static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        return xd_3.id_class(xc_32.id_extends(rRq_12, rfH_22), rpr_32.id_case());
    }

    private boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (rpr_32 == rpr_3.DOWN) {
            return false;
        }
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        if (zq_3.id_class(rRq_12, rfH_23, rpr_32)) {
            return true;
        }
        if (rpr_32.id_final() == rpB_2.Y) {
            return false;
        }
        rCN rCN2 = id_continue.get(rpr_32);
        xc_3 xc_32 = rRq_12.id_byte(rfH_22.id_final());
        return xc_32.id_class(this) && xc_32.id_byte(rCN2) != false;
    }

    private xc_3 id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            xc_32 = (xc_3)xc_32.id_class(id_volatile, zq_3.id_class(rRq_12, rfH_23, rpr_3.DOWN));
        }
        JC jC = null;
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rCN rCN2 = zq_3.id_class(rpr_32);
            if (!xc_32.id_byte(rCN2).booleanValue()) continue;
            boolean bl = this.id_break(rRq_12, rfH_22, rpr_32);
            if (!bl) {
                if (jC == null) {
                    jC = rRq_12.id_byte(rfH_23);
                }
                bl = jC.id_class(this) && jC.id_byte(rCN2) != false;
            }
            xc_32 = (xc_3)xc_32.id_class(rCN2, bl);
        }
        return xc_32;
    }

    private boolean id_implements(xc_3 xc_32) {
        return this.id_volatile(xc_32) > 0;
    }

    private static rjC_2 id_private(xc_3 xc_32) {
        rjC_2 rjC_22 = rjw_3.id_class();
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rjC_22 = id_super;
        }
        if (xc_32.id_byte(id_final).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_synchronized);
        }
        if (xc_32.id_byte(id_int).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_return);
        }
        if (xc_32.id_byte(id_package).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_else);
        }
        if (xc_32.id_byte(id_new).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_this);
        }
        return rjC_22;
    }

    private boolean id_final(xc_3 xc_32) {
        return xc_32.id_byte(id_final) != false || xc_32.id_byte(id_package) != false || xc_32.id_byte(id_int) != false || xc_32.id_byte(id_new) != false;
    }

    private int id_volatile(xc_3 xc_32) {
        int n = 0;
        for (rCN rCN2 : id_continue.values()) {
            if (!xc_32.id_byte(rCN2).booleanValue()) continue;
            ++n;
        }
        return n;
    }
}

