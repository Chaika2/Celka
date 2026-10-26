/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rVL;
import celestial.rVn_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rYl_1;
import celestial.rqM_2;
import celestial.rrBJ;
import celestial.rrBx_1;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rYi_1
extends rYY {
    public static final Codec<rYi_1> id_throws = RecordCodecBuilder.create(instance -> instance.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(rYi_12 -> rYi_12.id_private), (App)Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", (Object)false, Lifecycle.stable()).forGetter(rYi_12 -> rYi_12.id_implements), (App)Codec.BOOL.fieldOf("large_biomes").orElse((Object)false).stable().forGetter(rYi_12 -> rYi_12.id_finally), (App)rVn_1.id_class(rVL.n).forGetter(rYi_12 -> rYi_12.id_extends)).apply((Applicative)instance, instance.stable(rYi_1::new)));
    private final rrBJ id_case;
    private static final List<rqM_2<rYG>> id_catch = ImmutableList.of(rYl_1.id_class, rYl_1.id_break, rYl_1.id_byte, rYl_1.id_protected, rYl_1.id_throws, rYl_1.id_case, rYl_1.id_catch, rYl_1.id_private, rYl_1.id_extends, rYl_1.id_native, rYl_1.id_volatile, rYl_1.id_final, (Object[])new rqM_2[]{rYl_1.id_package, rYl_1.id_int, rYl_1.id_new, rYl_1.id_continue, rYl_1.id_super, rYl_1.id_this, rYl_1.id_else, rYl_1.id_synchronized, rYl_1.id_return, rYl_1.id_public, rYl_1.id_goto, rYl_1.id_while, rYl_1.id_try, rYl_1.id_instanceof, rYl_1.id_throw, rYl_1.id_interface, rYl_1.id_char, rYl_1.id_abstract, rYl_1.id_long, rYl_1.id_float, rYl_1.id_void, rYl_1.id_static, rYl_1.id_import, rYl_1.id_short, rYl_1.id_default, rYl_1.id_const, rYl_1.id_double, rYl_1.id_switch, rYl_1.r, rYl_1.P, rYl_1.B, rYl_1.S, rYl_1.s, rYl_1.G, rYl_1.b, rYl_1.M, rYl_1.O, rYl_1.h, rYl_1.X, rYl_1.J, rYl_1.x, rYl_1.d, rYl_1.k, rYl_1.W, rYl_1.z, rYl_1.Q, rYl_1.N, rYl_1.c, rYl_1.u, rYl_1.m, rYl_1.Z, rYl_1.v, rYl_1.F, rYl_1.L});
    private final long id_private;
    private final boolean id_implements;
    private final boolean id_finally;
    private final rVL<rYG> id_extends;

    public rYi_1(long l, boolean bl, boolean bl2, rVL<rYG> rVL2) {
        super(id_catch.stream().map(rqM_22 -> () -> (rYG)rVL2.id_byte((rqM_2<rYG>)rqM_22)));
        this.id_private = l;
        this.id_implements = bl;
        this.id_finally = bl2;
        this.id_extends = rVL2;
        this.id_case = rrBx_1.id_class(l, bl, bl2 ? 6 : 4, 4);
    }

    @Override
    protected Codec<? extends rYY> id_class() {
        return id_throws;
    }

    @Override
    public rYY id_class(long l) {
        return new rYi_1(l, this.id_implements, this.id_finally, this.id_extends);
    }

    @Override
    public rYG id_protected(int n, int n2, int n3) {
        return this.id_case.id_class(this.id_extends, n, n3);
    }
}

