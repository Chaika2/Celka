/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.kW_2;
import celestial.rDg_1;
import celestial.rHV;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rec_3;
import celestial.red_3;
import celestial.rem_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrPp_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class rex_3
extends rev_3 {
    public static final Codec<rex_3> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rDg_1.id_break.fieldOf("feature").forGetter(rex_32 -> rex_32.id_break), rex_3.id_break()).apply((Applicative)instance, rex_3::new));
    private final Supplier<rDg_1<?, ?>> id_break;
    private final rcd_3 id_protected;

    protected rex_3(Supplier<rDg_1<?, ?>> supplier, rem_3 rem_32) {
        super(rem_32);
        this.id_break = supplier;
        this.id_protected = this.id_case();
    }

    public String toString() {
        return "Feature[" + rVL.q.id_break((rUO<?>)this.id_break.get().id_break()) + "]";
    }

    @Override
    public red_3<?> id_class() {
        return red_3.id_byte;
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rfi_3 rfi_32, Random random, boolean bl) {
        return this.id_break.get().id_class(rRI2, rKd_12, random, rfH_22);
    }

    public rfH_2 id_class(rrPt_1 rrPt_12, rqd_3 rqd_32) {
        return rfH_2.id_protected;
    }

    @Override
    public rfi_3 id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32) {
        rfH_2 rfH_23 = this.id_class(rrPt_12, rqd_32);
        return new rfi_3(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_22.b_() + rfH_23.b_(), rfH_22.c_() + rfH_23.c_(), rfH_22.d_() + rfH_23.d_());
    }

    @Override
    public List<rrPp_1> id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, Random random) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rrPp_1(rfH_22, (xc_3)xu_3.JE.id_continue().id_class(kW_2.id_volatile, rec_3.id_class(rpr_3.DOWN, rpr_3.SOUTH)), this.id_protected));
        return arrayList;
    }

    private rcd_3 id_case() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("name", "minecraft:bottom");
        rcd_32.id_class("final_state", "minecraft:air");
        rcd_32.id_class("pool", "minecraft:empty");
        rcd_32.id_class("target", "minecraft:empty");
        rcd_32.id_class("joint", rHV.ROLLABLE.id_class());
        return rcd_32;
    }
}

