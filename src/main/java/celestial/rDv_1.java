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

import celestial.rDQ;
import celestial.rKi_1;
import celestial.rKv_1;
import celestial.rUv_1;
import celestial.rrPR;
import celestial.rrsN_2;
import celestial.rrsk_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rDv_1
implements rUv_1 {
    public static final Codec<rDv_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rKi_1.id_break.fieldOf("trunk_provider").forGetter(rDv_12 -> rDv_12.id_break), (App)rKi_1.id_break.fieldOf("leaves_provider").forGetter(rDv_12 -> rDv_12.id_byte), (App)rrPR.id_protected.fieldOf("foliage_placer").forGetter(rDv_12 -> rDv_12.id_case), (App)rrsN_2.id_class.fieldOf("trunk_placer").forGetter(rDv_12 -> rDv_12.id_catch), (App)rDQ.id_class.fieldOf("minimum_size").forGetter(rDv_12 -> rDv_12.id_private), (App)rrsk_3.id_byte.listOf().fieldOf("decorators").forGetter(rDv_12 -> rDv_12.id_protected), (App)Codec.INT.fieldOf("max_water_depth").orElse((Object)0).forGetter(rDv_12 -> rDv_12.id_implements), (App)Codec.BOOL.fieldOf("ignore_vines").orElse((Object)false).forGetter(rDv_12 -> rDv_12.id_finally), (App)rKv_1.field_236078_g_.fieldOf("heightmap").forGetter(rDv_12 -> rDv_12.id_extends)).apply((Applicative)instance, rDv_1::new));
    public final rKi_1 id_break;
    public final rKi_1 id_byte;
    public final List<rrsk_3> id_protected;
    public transient boolean id_throws;
    public final rrPR id_case;
    public final rrsN_2 id_catch;
    public final rDQ id_private;
    public final int id_implements;
    public final boolean id_finally;
    public final rKv_1 id_extends;

    protected rDv_1(rKi_1 rKi_12, rKi_1 rKi_13, rrPR rrPR2, rrsN_2 rrsN_22, rDQ rDQ2, List<rrsk_3> list, int n, boolean bl, rKv_1 rKv_12) {
        this.id_break = rKi_12;
        this.id_byte = rKi_13;
        this.id_protected = list;
        this.id_case = rrPR2;
        this.id_private = rDQ2;
        this.id_catch = rrsN_22;
        this.id_implements = n;
        this.id_finally = bl;
        this.id_extends = rKv_12;
    }

    public void id_class() {
        this.id_throws = true;
    }

    public rDv_1 id_class(List<rrsk_3> list) {
        return new rDv_1(this.id_break, this.id_byte, this.id_case, this.id_catch, this.id_private, list, this.id_implements, this.id_finally, this.id_extends);
    }
}

