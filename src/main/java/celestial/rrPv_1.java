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

import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rrPL;
import celestial.rrPS;
import celestial.rrPc_1;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Random;

public class rrPv_1 {
    public static final Codec<rrPv_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rrPL.id_byte.fieldOf("input_predicate").forGetter(rrPv_12 -> rrPv_12.id_break), (App)rrPL.id_byte.fieldOf("location_predicate").forGetter(rrPv_12 -> rrPv_12.id_byte), (App)rrPc_1.id_byte.optionalFieldOf("position_predicate", (Object)rrPS.id_break).forGetter(rrPv_12 -> rrPv_12.id_protected), (App)xc_3.id_break.fieldOf("output_state").forGetter(rrPv_12 -> rrPv_12.id_throws), (App)rcd_3.id_class.optionalFieldOf("output_nbt").forGetter(rrPv_12 -> Optional.ofNullable(rrPv_12.id_case))).apply((Applicative)instance, rrPv_1::new));
    private final rrPL id_break;
    private final rrPL id_byte;
    private final rrPc_1 id_protected;
    private final xc_3 id_throws;
    private final rcd_3 id_case;

    public rrPv_1(rrPL rrPL2, rrPL rrPL3, rrPc_1 rrPc_12, xc_3 xc_32, Optional<rcd_3> optional) {
        this.id_break = rrPL2;
        this.id_byte = rrPL3;
        this.id_protected = rrPc_12;
        this.id_throws = xc_32;
        this.id_case = optional.orElse(null);
    }

    public rrPv_1(rrPL rrPL2, rrPL rrPL3, rrPc_1 rrPc_12, xc_3 xc_32) {
        this(rrPL2, rrPL3, rrPc_12, xc_32, Optional.empty());
    }

    public rrPv_1(rrPL rrPL2, rrPL rrPL3, xc_3 xc_32) {
        this(rrPL2, rrPL3, rrPS.id_break, xc_32, Optional.empty());
    }

    public xc_3 id_class() {
        return this.id_throws;
    }

    public boolean id_class(xc_3 xc_32, xc_3 xc_33, rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, Random random) {
        return this.id_break.id_class(xc_32, random) && this.id_byte.id_class(xc_33, random) && this.id_protected.id_class(rfH_22, rfH_23, rfH_24, random);
    }

    public rcd_3 id_break() {
        return this.id_case;
    }
}

