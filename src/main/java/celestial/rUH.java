/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rUv_1;
import celestial.rVL;
import celestial.rXE;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public class rUH
implements rUv_1 {
    public static final Codec<rUH> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rXE.id_class.fieldOf("state").forGetter(rUH2 -> rUH2.id_break), (App)Codec.BOOL.fieldOf("requires_block_below").orElse((Object)true).forGetter(rUH2 -> rUH2.id_byte), (App)Codec.INT.fieldOf("rock_count").orElse((Object)4).forGetter(rUH2 -> rUH2.id_protected), (App)Codec.INT.fieldOf("hole_count").orElse((Object)1).forGetter(rUH2 -> rUH2.id_throws), (App)rVL.id_strictfp.listOf().fieldOf("valid_blocks").xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(rUH2 -> rUH2.id_case)).apply((Applicative)instance, rUH::new));
    public final rXE id_break;
    public final boolean id_byte;
    public final int id_protected;
    public final int id_throws;
    public final Set<xd_3> id_case;

    public rUH(rXE rXE2, boolean bl, int n, int n2, Set<xd_3> set) {
        this.id_break = rXE2;
        this.id_byte = bl;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = set;
    }
}

