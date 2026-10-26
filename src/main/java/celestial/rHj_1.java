/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.kW_2;
import celestial.rFy_1;
import celestial.rHV;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rcd_3;
import celestial.reA_2;
import celestial.reW_2;
import celestial.rel_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rHj_1
extends ryO_2 {
    private rqO_2 id_class = new rqO_2("empty");
    private rqO_2 id_break = new rqO_2("empty");
    private rqO_2 id_byte = new rqO_2("empty");
    private rHV id_protected = rHV.ROLLABLE;
    private String id_throws = "minecraft:air";

    public void id_byte(rqO_2 rqO_22) {
        this.id_byte = rqO_22;
    }

    public rHj_1(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public rHj_1() {
        this(ryW_2.id_char);
    }

    public void id_class(rHV rHV2) {
        this.id_protected = rHV2;
    }

    public void id_class(rrEm_1 rrEm_12, int n, boolean bl) {
        rKd_1 rKd_12 = rrEm_12.id_else().id_implements();
        rrPt_1 rrPt_12 = rrEm_12.O();
        rrrA rrrA2 = rrEm_12.id_protected();
        Random random = rrEm_12.id_long();
        rfH_2 rfH_22 = this.id_char();
        ArrayList arrayList = Lists.newArrayList();
        rrPl_1 rrPl_12 = new rrPl_1();
        rrPl_12.id_class(rrEm_12, rfH_22, new rfH_2(1, 1, 1), false, null);
        reA_2 reA_22 = new reA_2(rrPl_12);
        rel_3 rel_32 = new rel_3(rrPt_12, reA_22, rfH_22, 1, rqd_3.NONE, new rfi_3(rfH_22, rfH_22));
        reW_2.id_class(rrEm_12.id_new(), rel_32, n, rel_3::new, rKd_12, rrPt_12, arrayList, random);
        for (rel_3 rel_33 : arrayList) {
            rel_33.id_class((rRI)rrEm_12, rrrA2, rKd_12, random, rfi_3.id_break(), rfH_22, bl);
        }
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("name", this.id_class.toString());
        rcd_32.id_class("target", this.id_break.toString());
        rcd_32.id_class("pool", this.id_byte.toString());
        rcd_32.id_class("final_state", this.id_throws);
        rcd_32.id_class("joint", this.id_protected.id_class());
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = new rqO_2(rcd_32.id_native("name"));
        this.id_break = new rqO_2(rcd_32.id_native("target"));
        this.id_byte = new rqO_2(rcd_32.id_native("pool"));
        this.id_throws = rcd_32.id_native("final_state");
        this.id_protected = rHV.id_class(rcd_32.id_native("joint")).orElseGet(() -> kW_2.id_private(xc_32).id_final().id_protected() ? rHV.ALIGNED : rHV.ROLLABLE);
    }

    public void id_class(String string) {
        this.id_throws = string;
    }

    public void id_class(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    public void id_break(rqO_2 rqO_22) {
        this.id_break = rqO_22;
    }

    public rqO_2 id_throws() {
        return this.id_class;
    }

    public String id_finally() {
        return this.id_throws;
    }

    public rqO_2 id_catch() {
        return this.id_break;
    }

    public rHV id_extends() {
        return this.id_protected;
    }

    public rqO_2 id_private() {
        return this.id_byte;
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 12, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

