/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhy_3;
import celestial.rqR_2;
import celestial.rrD_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rsq_3;
import celestial.rxL_2;
import celestial.rxV_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class rrJ_2
extends rPm_1<rsq_3> {
    private rrEr_1 id_class;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        Random random = rsq_32.Sa();
        if (random.nextInt(100) == 0) {
            rsq_32.sJ();
        }
        if (random.nextInt(200) == 0 && rrD_2.id_class(rrEm_12, rsq_32, rsq_32.Bs())) {
            rxL_2 rxL_22 = rqR_2.id_class(rxL_2.values(), random);
            int n = random.nextInt(3);
            rdn_3 rdn_32 = this.id_class(rxL_22, n);
            rhy_3 rhy_32 = new rhy_3((rYB)rsq_32.id_throws[7], rsq_32, rsq_32.rx(), rsq_32.rH(), rsq_32.BO(), rdn_32);
            ((rYB)rsq_32.id_throws[7]).a_(rhy_32);
        }
    }

    public rrJ_2(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(), n, n2);
    }

    private rdn_3 id_class(rxL_2 rxL_22, int n) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.dc, 1);
        rdn_3 rdn_33 = new rdn_3(rdy_3.du);
        rcd_3 rcd_32 = rdn_33.id_class("Explosion");
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(rxL_22.id_case());
        rcd_32.id_class("Colors", arrayList);
        rcd_32.id_class("Type", (byte)rxV_2.BURST.id_class());
        rcd_3 rcd_33 = rdn_32.id_class("Fireworks");
        rcy_3 rcy_32 = new rcy_3();
        rcd_3 rcd_34 = rdn_33.id_break("Explosion");
        if (rcd_34 != null) {
            rcy_32.add(rcd_34);
        }
        rcd_33.id_class("Flight", (byte)n);
        if (!rcy_32.isEmpty()) {
            rcd_33.id_class("Explosions", rcy_32);
        }
        return rdn_32;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        rfH_2 rfH_22 = rsq_32.Bs();
        this.id_class = rrEm_12.id_interface(rfH_22);
        return this.id_class != null && this.id_class.id_throws() && rrD_2.id_class(rrEm_12, rsq_32, rfH_22);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_class != null && !this.id_class.id_protected();
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        this.id_class = null;
        rsq_32.SF().id_class(rrEm_12.P(), rrEm_12.r());
    }
}

