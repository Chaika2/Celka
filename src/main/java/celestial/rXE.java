/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
package celestial;

import celestial.rCZ;
import celestial.rCn_1;
import celestial.rLx_1;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rlb_3;
import celestial.rpr_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Random;

public final class rXE
extends rCn_1<rXs_1, rXE> {
    public static final Codec<rXE> id_class = rXE.id_class(rVL.id_default, rXs_1::id_private).stable();

    public boolean id_byte() {
        return this.id_class().id_break();
    }

    public rjU_2 id_byte(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class().id_class(rRq_12, rfH_22, this);
    }

    public rXE(rXs_1 rXs_12, ImmutableMap<rCZ<?>, Comparable<?>> immutableMap, MapCodec<rXE> mapCodec) {
        super(rXs_12, immutableMap, mapCodec);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22) {
        this.id_class().id_class(rYB2, rfH_22, this);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, Random random) {
        this.id_class().id_class(rYB2, rfH_22, this, random);
    }

    public rXs_1 id_class() {
        return (rXs_1)this.id_byte;
    }

    @Override
    public boolean id_class(rlb_3<rXs_1> rlb_32) {
        return this.id_class().id_class(rlb_32);
    }

    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rXs_1 rXs_12, rpr_3 rpr_32) {
        return this.id_class().id_class(this, rRq_12, rfH_22, rXs_12, rpr_32);
    }

    public float id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class().id_class(this, rRq_12, rfH_22);
    }

    public boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                rfH_2 rfH_23 = rfH_22.id_break(i, 0, j);
                rXE rXE2 = rRq_12.id_break(rfH_23);
                if (rXE2.id_class().id_class(this.id_class()) || rRq_12.id_byte(rfH_23).id_implements(rRq_12, rfH_23)) continue;
                return true;
            }
        }
        return false;
    }

    public void id_break(rYB rYB2, rfH_2 rfH_22, Random random) {
        this.id_class().id_break(rYB2, rfH_22, this, random);
    }

    public boolean id_break() {
        return this.id_class().id_byte(this);
    }

    public int id_throws() {
        return this.id_class().id_protected(this);
    }

    public xc_3 id_catch() {
        return this.id_class().id_break(this);
    }

    public boolean id_case() {
        return this.id_class().id_finally();
    }

    public float id_implements() {
        return this.id_class().id_byte();
    }

    public rjC_2 id_protected(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class().id_break(this, rRq_12, rfH_22);
    }

    public float id_protected() {
        return this.id_class().id_class(this);
    }

    public rLx_1 id_private() {
        return this.id_class().id_implements();
    }
}

