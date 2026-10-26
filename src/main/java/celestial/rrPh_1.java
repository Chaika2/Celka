/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKv_1;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrPh_1
extends rrPA {
    public static final Codec<rrPh_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rKv_1.field_236078_g_.fieldOf("heightmap").orElse((Object)rKv_1.WORLD_SURFACE_WG).forGetter(rrPh_12 -> rrPh_12.id_break), (App)Codec.INT.fieldOf("offset").orElse((Object)0).forGetter(rrPh_12 -> rrPh_12.id_byte)).apply((Applicative)instance, rrPh_1::new));
    private final rKv_1 id_break;
    private final int id_byte;

    public rrPh_1(rKv_1 rKv_12, int n) {
        this.id_break = rKv_12;
        this.id_byte = n;
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        rKv_1 rKv_12 = rRR2 instanceof rrEm_1 ? (this.id_break == rKv_1.WORLD_SURFACE_WG ? rKv_1.WORLD_SURFACE : (this.id_break == rKv_1.OCEAN_FLOOR_WG ? rKv_1.OCEAN_FLOOR : this.id_break)) : this.id_break;
        int n = rRR2.id_class(rKv_12, rrPp_13.id_class.b_(), rrPp_13.id_class.d_()) + this.id_byte;
        int n2 = rrPp_12.id_class.c_();
        return new rrPp_1(new rfH_2(rrPp_13.id_class.b_(), n + n2, rrPp_13.id_class.d_()), rrPp_13.id_break, rrPp_13.id_byte);
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_byte;
    }
}

