/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.kZ_2;
import celestial.rCN;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.raF_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.riI_2;
import celestial.rif_3;
import celestial.rja_3;
import celestial.rpa_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPB;
import celestial.rrPE;
import celestial.rrPF;
import celestial.rrPG;
import celestial.rrPM;
import celestial.rrPN;
import celestial.rrPW;
import celestial.rrPb_1;
import celestial.rrPl_1;
import celestial.rrPm_1;
import celestial.rrPt_1;
import celestial.rrPv_1;
import celestial.rrrA;
import celestial.rrrw_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zq_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class riw_3
extends rrrw_1 {
    private static final Logger id_protected = LogManager.getLogger();
    private final rqO_2 id_throws;
    private final rqd_3 id_case;
    private final rpa_3 id_catch;
    private final riI_2 id_private;
    private final rif_3 id_implements;

    private void id_byte(Random random, rRg_1 rRg_12, rfH_2 rfH_22) {
        rfw_3 rfw_32 = rfH_22.id_new();
        this.id_protected(random, rRg_12, rfw_32);
        for (int i = 8; i > 0 && random.nextFloat() < 0.5f; --i) {
            rfw_32.id_class(rpr_3.DOWN);
            this.id_protected(random, rRg_12, rfw_32);
        }
    }

    public riw_3(rfH_2 rfH_22, riI_2 riI_22, rif_3 rif_32, rqO_2 rqO_22, rrPl_1 rrPl_12, rqd_3 rqd_32, rpa_3 rpa_32, rfH_2 rfH_23) {
        super(raF_2.id_static, 0);
        this.id_byte = rfH_22;
        this.id_throws = rqO_22;
        this.id_case = rqd_32;
        this.id_catch = rpa_32;
        this.id_private = riI_22;
        this.id_implements = rif_32;
        this.id_class(rrPl_12, rfH_23);
    }

    public riw_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_static, rcd_32);
        this.id_throws = new rqO_2(rcd_32.id_native("Template"));
        this.id_case = rqd_3.valueOf(rcd_32.id_native("Rotation"));
        this.id_catch = rpa_3.valueOf(rcd_32.id_native("Mirror"));
        this.id_private = riI_2.id_class(rcd_32.id_native("VerticalPlacement"));
        this.id_implements = (rif_3)rif_3.id_class.parse(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("Properties"))).getOrThrow(true, arg_0 -> ((Logger)id_protected).error(arg_0));
        rrPl_1 rrPl_12 = rrPt_12.id_class(this.id_throws);
        this.id_class(rrPl_12, new rfH_2(rrPl_12.id_class().b_() / 2, 0, rrPl_12.id_class().d_() / 2));
    }

    public static rKv_1 id_class(riI_2 riI_22) {
        return riI_22 == riI_2.ON_OCEAN_FLOOR ? rKv_1.OCEAN_FLOOR_WG : rKv_1.WORLD_SURFACE_WG;
    }

    private static int id_class(rRg_1 rRg_12, int n, int n2, riI_2 riI_22) {
        return rRg_12.id_class(riw_3.id_class(riI_22), n, n2) - 1;
    }

    private boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rRg_12.id_byte(rfH_22);
        return !xc_32.id_class(xu_3.id_class) && !xc_32.id_class(xu_3.rg) && !xc_32.id_class(xu_3.re) && (this.id_private == riI_2.IN_NETHER || !xc_32.id_class(xu_3.id_instanceof));
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_throws.toString());
        rcd_32.id_class("Rotation", this.id_case.name());
        rcd_32.id_class("Mirror", this.id_catch.name());
        rcd_32.id_class("VerticalPlacement", this.id_private.id_class());
        rif_3.id_class.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.id_implements).resultOrPartial(arg_0 -> ((Logger)id_protected).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("Properties", (rcZ_2)rcZ_22));
    }

    private static rrPv_1 id_class(xd_3 xd_32, xd_3 xd_33) {
        return new rrPv_1(new rrPb_1(xd_32), rrPB.id_break, xd_33.id_continue());
    }

    private static rrPv_1 id_class(xd_3 xd_32, float f, xd_3 xd_33) {
        return new rrPv_1(new rrPm_1(xd_32, f), rrPB.id_break, xd_33.id_continue());
    }

    private void id_class(Random random, rRg_1 rRg_12, rfH_2 rfH_22) {
        rpr_3 rpr_32;
        rfH_2 rfH_23;
        xc_3 xc_32;
        xc_3 xc_33 = rRg_12.id_byte(rfH_22);
        if (!xc_33.id_catch() && !xc_33.id_class(xu_3.BD) && (xc_32 = rRg_12.id_byte(rfH_23 = rfH_22.id_break(rpr_32 = rpb_3.HORIZONTAL.id_class(random)))).id_catch() && xd_3.id_class(xc_33.id_extends(rRg_12, rfH_22), rpr_32)) {
            rCN rCN2 = zq_3.id_class(rpr_32.id_case());
            rRg_12.id_class(rfH_23, (xc_3)xu_3.BD.id_continue().id_class(rCN2, true), 3);
        }
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_23) {
        if (!rfi_32.id_break(this.id_byte)) {
            return true;
        }
        rfi_32.id_break(this.id_class.id_break(this.id_break, this.id_byte));
        boolean bl = super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_23);
        this.id_break(random, rRI2);
        this.id_class(random, rRI2);
        if (this.id_implements.id_case || this.id_implements.id_throws) {
            rfH_2.id_class(this.id_catch()).forEach(rfH_22 -> {
                if (this.id_implements.id_case) {
                    this.id_class(random, (rRg_1)rRI2, (rfH_2)rfH_22);
                }
                if (this.id_implements.id_throws) {
                    this.id_break(random, rRI2, (rfH_2)rfH_22);
                }
            });
        }
        return bl;
    }

    private void id_class(rrPl_1 rrPl_12, rfH_2 rfH_22) {
        rrPG rrPG2 = this.id_implements.id_protected ? rrPG.id_break : rrPG.id_protected;
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(riw_3.id_class(xu_3.rt, 0.3f, xu_3.id_class));
        arrayList.add(this.id_break());
        if (!this.id_implements.id_break) {
            arrayList.add(riw_3.id_class(xu_3.PR, 0.07f, xu_3.bV));
        }
        rrPN rrPN2 = new rrPN().id_class(this.id_case).id_class(this.id_catch).id_class(rfH_22).id_class(rrPG2).id_class(new rrPF(arrayList)).id_class(new rrPM(this.id_implements.id_byte)).id_class(new rrPW());
        if (this.id_implements.id_catch) {
            rrPN2.id_class(rrPE.id_break);
        }
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }

    private void id_class(Random random, rRg_1 rRg_12) {
        for (int i = this.id_final.id_class + 1; i < this.id_final.id_protected; ++i) {
            for (int j = this.id_final.id_byte + 1; j < this.id_final.id_case; ++j) {
                rfH_2 rfH_22 = new rfH_2(i, this.id_final.id_break, j);
                if (!rRg_12.id_byte(rfH_22).id_class(xu_3.PR)) continue;
                this.id_byte(random, rRg_12, rfH_22.id_break());
            }
        }
    }

    private void id_break(Random random, rRg_1 rRg_12) {
        boolean bl = this.id_private == riI_2.ON_LAND_SURFACE || this.id_private == riI_2.ON_OCEAN_FLOOR;
        rja_3 rja_32 = this.id_final.id_catch();
        int n = rja_32.b_();
        int n2 = rja_32.d_();
        float[] fArray = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f, 0.9f, 0.8f, 0.7f, 0.6f, 0.4f, 0.2f};
        int n3 = fArray.length;
        int n4 = (this.id_final.id_protected() + this.id_final.id_case()) / 2;
        int n5 = random.nextInt(Math.max(1, 8 - n4 / 2));
        int n6 = 3;
        rfw_3 rfw_32 = rfH_2.id_protected.id_new();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                int n7 = Math.abs(i - n) + Math.abs(j - n2);
                int n8 = Math.max(0, n7 + n5);
                if (n8 >= n3) continue;
                float f = fArray[n8];
                if (!(random.nextDouble() < (double)f)) continue;
                int n9 = riw_3.id_class(rRg_12, i, j, this.id_private);
                int n10 = bl ? n9 : Math.min(this.id_final.id_break, n9);
                rfw_32.id_class(i, n10, j);
                if (Math.abs(n10 - this.id_final.id_break) > 3 || !this.id_class(rRg_12, (rfH_2)rfw_32)) continue;
                this.id_protected(random, rRg_12, rfw_32);
                if (this.id_implements.id_throws) {
                    this.id_break(random, rRg_12, rfw_32);
                }
                this.id_byte(random, rRg_12, rfw_32.id_break());
            }
        }
    }

    private rrPv_1 id_break() {
        if (this.id_private == riI_2.ON_OCEAN_FLOOR) {
            return riw_3.id_class(xu_3.id_instanceof, xu_3.bV);
        }
        return this.id_implements.id_break ? riw_3.id_class(xu_3.id_instanceof, xu_3.PR) : riw_3.id_class(xu_3.id_instanceof, 0.2f, xu_3.bV);
    }

    private void id_break(Random random, rRg_1 rRg_12, rfH_2 rfH_22) {
        if (random.nextFloat() < 0.5f && rRg_12.id_byte(rfH_22).id_class(xu_3.PR) && rRg_12.id_byte(rfH_22.id_final()).id_catch()) {
            rRg_12.id_class(rfH_22.id_final(), (xc_3)xu_3.W.id_continue().id_class(kZ_2.id_final, true), 3);
        }
    }

    private void id_protected(Random random, rRg_1 rRg_12, rfH_2 rfH_22) {
        if (!this.id_implements.id_break && random.nextFloat() < 0.07f) {
            rRg_12.id_class(rfH_22, xu_3.bV.id_continue(), 3);
        } else {
            rRg_12.id_class(rfH_22, xu_3.PR.id_continue(), 3);
        }
    }
}

