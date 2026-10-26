/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rFx_1;
import celestial.rRu_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqn_3;
import celestial.rsS_2;
import celestial.rsh_3;
import celestial.ruS_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class rsO_2
extends rsS_2 {
    public rsh_3 id_catch;

    public rsO_2(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32, rsh_3 rsh_32) {
        this(rYB2, rfH_22, rpr_32);
        this.id_catch = rsh_32;
        this.id_class(rpr_32);
    }

    public rsO_2(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        super(aI_2.O, rYB2, rfH_22);
        rsh_3 rsh_32;
        ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        Iterator<Object> iterator = rVL.P.iterator();
        while (iterator.hasNext()) {
            this.id_catch = rsh_32 = (rsh_3)iterator.next();
            this.id_class(rpr_32);
            if (!this.id_throws()) continue;
            arrayList.add(rsh_32);
            int n2 = rsh_32.id_class() * rsh_32.id_break();
            if (n2 <= n) continue;
            n = n2;
        }
        if (!arrayList.isEmpty()) {
            iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                rsh_32 = (rsh_3)iterator.next();
                if (rsh_32.id_class() * rsh_32.id_break() >= n) continue;
                iterator.remove();
            }
            this.id_catch = (rsh_3)arrayList.get(((Random)this.id_throws[40]).nextInt(arrayList.size()));
        }
        this.id_class(rpr_32);
    }

    public rsO_2(aI_2<? extends rsO_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rsS_2>)aI_22, rYB2);
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2) {
        this.id_new(d, d2, d3);
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        rfH_2 rfH_22 = this.id_break.id_byte(d - this.rx(), d2 - this.re(), d3 - this.BO());
        this.id_new(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    @Override
    public void id_class(an_3 an_32) {
        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            this.id_class(rqn_3.Mj, 1.0f, 1.0f);
            if (an_32 instanceof rhd_3) {
                rhd_3 rhd_32 = (rhd_3)an_32;
                if (((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    return;
                }
            }
            this.id_class(rdy_3.hH);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Motive", rVL.P.id_break(this.id_catch).toString());
        rcd_32.id_class("Facing", (byte)this.id_protected.id_protected());
        super.id_class(rcd_32);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_catch = rVL.P.id_class(rqO_2.id_break(rcd_32.id_native("Motive")));
        this.id_protected = rpr_3.id_break(rcd_32.id_case("Facing"));
        super.id_break(rcd_32);
        this.id_class(this.id_protected);
    }

    @Override
    public int id_catch() {
        return this.id_catch == null ? 1 : this.id_catch.id_break();
    }

    @Override
    public int id_case() {
        return this.id_catch == null ? 1 : this.id_catch.id_class();
    }

    @Override
    public void id_private() {
        this.id_class(rqn_3.MV, 1.0f, 1.0f);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFx_1(this);
    }
}

