/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.VD;
import celestial.dB_2;
import celestial.dz_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rJr_1;
import celestial.rRq_1;
import celestial.rVi_1;
import celestial.rXC;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbW_2;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqZ_2;
import celestial.rqd_3;
import celestial.rqs_3;
import celestial.rsE_2;
import celestial.rxL_2;
import celestial.rxx_3;
import celestial.ryB_2;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.ryr_3;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzr_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.List;
import java.util.function.Consumer;

public class Wp_1
extends dB_2 {
    public static final rCu_1<rpr_3> id_volatile = dz_3.id_volatile;
    public static final rqO_2 id_final = new rqO_2("contents");
    private final rxL_2 id_package;

    public Wp_1(rxL_2 rxL_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_package = rxL_22;
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.UP));
    }

    public static rxL_2 id_class(xd_3 xd_32) {
        return xd_32 instanceof Wp_1 ? ((Wp_1)xd_32).id_break() : null;
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        rdn_3 rdn_32 = super.id_class(rRq_12, rfH_22, xc_32);
        ryr_3 ryr_32 = (ryr_3)rRq_12.id_class(rfH_22);
        rcd_3 rcd_32 = ryr_32.id_throws(new rcd_3());
        if (!rcd_32.id_case()) {
            rdn_32.id_class("BlockEntityTag", rcd_32);
        }
        return rdn_32;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        return ryO_22 instanceof ryr_3 ? rjw_3.id_class(((ryr_3)ryO_22).id_class(xc_32, 1.0f)) : rjw_3.id_break();
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new ryr_3(this.id_package);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rRq_1 rRq_12, List<rgP_2> list, VD vD) {
        super.id_class(rdn_32, rRq_12, list, vD);
        rcd_3 rcd_32 = rdn_32.id_break("BlockEntityTag");
        if (rcd_32 != null) {
            if (rcd_32.id_byte("LootTable", 8)) {
                list.add(new rgN_2("???????"));
            }
            if (rcd_32.id_byte("Items", 9)) {
                rqs_3<rdn_3> rqs_32 = rqs_3.id_class(27, rdn_3.id_break);
                rXC.id_break(rcd_32, rqs_32);
                int n = 0;
                int n2 = 0;
                for (rdn_3 rdn_33 : rqs_32) {
                    if (rdn_33.id_class()) continue;
                    ++n2;
                    if (n > 4) continue;
                    ++n;
                    rVi_1 rVi_12 = rdn_33.id_continue().id_case();
                    rVi_12.id_break(" x").id_break(String.valueOf(rdn_33.id_char()));
                    list.add(rVi_12);
                }
                if (n2 - n > 0) {
                    list.add(new rgn_3("container.shulkerBox.more", n2 - n).id_class(rgF_2.ITALIC));
                }
            }
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    public static xd_3 id_class(rxL_2 rxL_22) {
        if (rxL_22 == null) {
            return xu_3.bD;
        }
        switch (rxL_22) {
            case WHITE: {
                return xu_3.bU;
            }
            case ORANGE: {
                return xu_3.be;
            }
            case MAGENTA: {
                return xu_3.ba;
            }
            case LIGHT_BLUE: {
                return xu_3.bi;
            }
            case YELLOW: {
                return xu_3.Mr;
            }
            case LIME: {
                return xu_3.MP;
            }
            case PINK: {
                return xu_3.MB;
            }
            case GRAY: {
                return xu_3.MS;
            }
            case LIGHT_GRAY: {
                return xu_3.Ms;
            }
            case CYAN: {
                return xu_3.ME;
            }
            default: {
                return xu_3.MG;
            }
            case BLUE: {
                return xu_3.Mb;
            }
            case BROWN: {
                return xu_3.MM;
            }
            case GREEN: {
                return xu_3.MO;
            }
            case RED: {
                return xu_3.Mh;
            }
            case BLACK: 
        }
        return xu_3.MX;
    }

    @Override
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        ryO_2 ryO_22 = rzP_22.id_break(rzQ_2.id_private);
        if (ryO_22 instanceof ryr_3) {
            ryr_3 ryr_32 = (ryr_3)ryO_22;
            rzP_22 = rzP_22.id_class(id_final, (rzr_3 rzr_32, Consumer<rdn_3> consumer) -> {
                for (int i = 0; i < ryr_32.id_else(); ++i) {
                    consumer.accept(ryr_32.id_extends(i));
                }
            });
        }
        return super.id_class(xc_32, rzP_22);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof ryr_3) {
            ryr_3 ryr_32 = (ryr_3)ryO_22;
            if (!rYB2.id_continue && rhd_32.id_implements() && !ryr_32.id_return()) {
                rdn_3 rdn_32 = Wp_1.id_break(this.id_break());
                rcd_3 rcd_32 = ryr_32.id_throws(new rcd_3());
                if (!rcd_32.id_case()) {
                    rdn_32.id_class("BlockEntityTag", rcd_32);
                }
                if (ryr_32.Bk()) {
                    rdn_32.id_class(ryr_32.rD());
                }
                rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rdn_32);
                rsE_22.id_private();
                rYB2.a_(rsE_22);
            } else {
                ryr_32.id_protected(rhd_32);
            }
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_finally());
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        if (rhd_32.id_native()) {
            return ryZ_2.CONSUME;
        }
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof ryr_3) {
            boolean bl;
            ryr_3 ryr_32 = (ryr_3)ryO_22;
            if (ryr_32.id_private() == ryB_2.CLOSED) {
                rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
                bl = rYB2.id_break(rqZ_2.id_class(rfH_22, rpr_32));
            } else {
                bl = true;
            }
            if (bl) {
                rhd_32.id_class(ryr_32);
                rhd_32.id_break(rlB_2.u);
                rbW_2.id_class(rhd_32, true);
            }
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof ryr_3) {
            ((ryr_3)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    public static rdn_3 id_break(rxL_2 rxL_22) {
        return new rdn_3(Wp_1.id_class(rxL_22));
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof ryr_3) {
                rYB2.id_byte(rfH_22, xc_32.id_break());
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    public static rxL_2 id_break(rdb_3 rdb_32) {
        return Wp_1.id_class(xd_3.id_class(rdb_32));
    }

    public rxL_2 id_break() {
        return this.id_package;
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return rJr_1.id_break((rXu_1)((Object)rYB2.id_class(rfH_22)));
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.DESTROY;
    }
}

