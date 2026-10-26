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

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcy_3;
import celestial.reJ_2;
import celestial.rek_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rel_3
extends rrrn_1 {
    private static final Logger id_protected = LogManager.getLogger();
    protected final rev_3 id_class;
    protected rfH_2 id_break;
    private final int id_throws;
    protected final rqd_3 id_byte;
    private final List<rek_3> id_case = Lists.newArrayList();
    private final rrPt_1 id_catch;

    public rfH_2 id_byte() {
        return this.id_break;
    }

    public rel_3(rrPt_1 rrPt_12, rev_3 rev_32, rfH_2 rfH_22, int n, rqd_3 rqd_32, rfi_3 rfi_32) {
        super(raF_2.O, 0);
        this.id_catch = rrPt_12;
        this.id_class = rev_32;
        this.id_break = rfH_22;
        this.id_throws = n;
        this.id_byte = rqd_32;
        this.id_final = rfi_32;
    }

    public rel_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.O, rcd_32);
        this.id_catch = rrPt_12;
        this.id_break = new rfH_2(rcd_32.id_private("PosX"), rcd_32.id_private("PosY"), rcd_32.id_private("PosZ"));
        this.id_throws = rcd_32.id_private("ground_level_delta");
        this.id_class = rev_3.id_byte.parse((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_int("pool_element")).resultOrPartial(arg_0 -> ((Logger)id_protected).error(arg_0)).orElse(reJ_2.id_break);
        this.id_byte = rqd_3.valueOf(rcd_32.id_native("rotation"));
        this.id_final = this.id_class.id_class(rrPt_12, this.id_break, this.id_byte);
        rcy_3 rcy_32 = rcd_32.id_protected("junctions", 10);
        this.id_case.clear();
        rcy_32.forEach(rcZ_22 -> this.id_case.add(rek_3.id_class(new Dynamic((DynamicOps)rcf_3.id_class, rcZ_22))));
    }

    public String toString() {
        return String.format("<%s | %s | %s | %s>", new Object[]{this.getClass().getSimpleName(), this.id_break, this.id_byte, this.id_class});
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("PosX", this.id_break.b_());
        rcd_32.id_break("PosY", this.id_break.c_());
        rcd_32.id_break("PosZ", this.id_break.d_());
        rcd_32.id_break("ground_level_delta", this.id_throws);
        rev_3.id_byte.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.id_class).resultOrPartial(arg_0 -> ((Logger)id_protected).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("pool_element", (rcZ_2)rcZ_22));
        rcd_32.id_class("rotation", this.id_byte.name());
        rcy_3 rcy_32 = new rcy_3();
        for (rek_3 rek_32 : this.id_case) {
            rcy_32.add((rcZ_2)rek_32.id_class(rcf_3.id_class).getValue());
        }
        rcd_32.id_class("junctions", rcy_32);
    }

    public void id_class(rek_3 rek_32) {
        this.id_case.add(rek_32);
    }

    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfH_2 rfH_22, boolean bl) {
        return this.id_class.id_class(this.id_catch, rRI2, rrrA2, rKd_12, this.id_break, rfH_22, this.id_byte, rfi_32, random, bl);
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        this.id_break = this.id_break.id_break(n, n2, n3);
    }

    @Override
    public rqd_3 id_class() {
        return this.id_byte;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        return this.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfH_22, false);
    }

    public rev_3 id_break() {
        return this.id_class;
    }

    public List<rek_3> id_throws() {
        return this.id_case;
    }

    public int id_protected() {
        return this.id_throws;
    }
}

