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

import celestial.JC;
import celestial.rKY;
import celestial.rKi_1;
import celestial.rUv_1;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class rDH
implements rUv_1 {
    public static final Codec<rDH> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rKi_1.id_break.fieldOf("state_provider").forGetter(rDH2 -> rDH2.id_break), (App)rKY.id_class.fieldOf("block_placer").forGetter(rDH2 -> rDH2.id_byte), (App)xc_3.id_break.listOf().fieldOf("whitelist").forGetter(rDH2 -> rDH2.id_protected.stream().map(xd_3::id_continue).collect(Collectors.toList())), (App)xc_3.id_break.listOf().fieldOf("blacklist").forGetter(rDH2 -> ImmutableList.copyOf(rDH2.id_throws)), (App)Codec.INT.fieldOf("tries").orElse((Object)128).forGetter(rDH2 -> rDH2.id_case), (App)Codec.INT.fieldOf("xspread").orElse((Object)7).forGetter(rDH2 -> rDH2.id_catch), (App)Codec.INT.fieldOf("yspread").orElse((Object)3).forGetter(rDH2 -> rDH2.id_private), (App)Codec.INT.fieldOf("zspread").orElse((Object)7).forGetter(rDH2 -> rDH2.id_implements), (App)Codec.BOOL.fieldOf("can_replace").orElse((Object)false).forGetter(rDH2 -> rDH2.id_finally), (App)Codec.BOOL.fieldOf("project").orElse((Object)true).forGetter(rDH2 -> rDH2.id_extends), (App)Codec.BOOL.fieldOf("need_water").orElse((Object)false).forGetter(rDH2 -> rDH2.id_native)).apply((Applicative)instance, rDH::new));
    public final rKi_1 id_break;
    public final rKY id_byte;
    public final Set<xd_3> id_protected;
    public final Set<xc_3> id_throws;
    public final int id_case;
    public final int id_catch;
    public final int id_private;
    public final int id_implements;
    public final boolean id_finally;
    public final boolean id_extends;
    public final boolean id_native;

    private rDH(rKi_1 rKi_12, rKY rKY2, List<xc_3> list, List<xc_3> list2, int n, int n2, int n3, int n4, boolean bl, boolean bl2, boolean bl3) {
        this(rKi_12, rKY2, list.stream().map(JC::id_break).collect(Collectors.toSet()), (Set<xc_3>)ImmutableSet.copyOf(list2), n, n2, n3, n4, bl, bl2, bl3);
    }

    public rDH(rKi_1 rKi_12, rKY rKY2, Set<xd_3> set, Set<xc_3> set2, int n, int n2, int n3, int n4, boolean bl, boolean bl2, boolean bl3) {
        this.id_break = rKi_12;
        this.id_byte = rKY2;
        this.id_protected = set;
        this.id_throws = set2;
        this.id_case = n;
        this.id_catch = n2;
        this.id_private = n3;
        this.id_implements = n4;
        this.id_finally = bl;
        this.id_extends = bl2;
        this.id_native = bl3;
    }
}

