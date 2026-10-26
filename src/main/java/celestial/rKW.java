/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rVA;
import celestial.rVL;
import celestial.rVy_1;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrSI;
import celestial.rrST;
import celestial.rrSq_1;
import celestial.rrSt_1;
import celestial.rrSw_1;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class rKW {
    public static final Codec<rKW> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rrSq_1.id_class.fieldOf("structures").forGetter(rKW::id_class), (App)rrST.id_class.fieldOf("noise").forGetter(rKW::id_break), (App)xc_3.id_break.fieldOf("default_block").forGetter(rKW::id_byte), (App)xc_3.id_break.fieldOf("default_fluid").forGetter(rKW::id_protected), (App)Codec.intRange((int)-20, (int)276).fieldOf("bedrock_roof_position").forGetter(rKW::id_throws), (App)Codec.intRange((int)-20, (int)276).fieldOf("bedrock_floor_position").forGetter(rKW::id_case), (App)Codec.intRange((int)0, (int)255).fieldOf("sea_level").forGetter(rKW::id_catch), (App)Codec.BOOL.fieldOf("disable_mob_generation").forGetter(rKW::id_private)).apply((Applicative)instance, rKW::new));
    public static final Codec<Supplier<rKW>> id_break = rVA.id_class(rVL.u, id_class);
    private final rrSq_1 id_implements;
    private final rrST id_finally;
    private final xc_3 id_extends;
    private final xc_3 id_native;
    private final int id_volatile;
    private final int id_final;
    private final int id_package;
    private final boolean id_int;
    public static final rqM_2<rKW> id_byte = rqM_2.id_class(rVL.u, new rqO_2("overworld"));
    public static final rqM_2<rKW> id_protected = rqM_2.id_class(rVL.u, new rqO_2("amplified"));
    public static final rqM_2<rKW> id_throws = rqM_2.id_class(rVL.u, new rqO_2("nether"));
    public static final rqM_2<rKW> id_case = rqM_2.id_class(rVL.u, new rqO_2("end"));
    public static final rqM_2<rKW> id_catch = rqM_2.id_class(rVL.u, new rqO_2("caves"));
    public static final rqM_2<rKW> id_private = rqM_2.id_class(rVL.u, new rqO_2("floating_islands"));
    private static final rKW id_new = rKW.id_class(id_byte, rKW.id_class(new rrSq_1(true), false, id_byte.id_class()));

    public xc_3 id_byte() {
        return this.id_extends;
    }

    private rKW(rrSq_1 rrSq_12, rrST rrST2, xc_3 xc_32, xc_3 xc_33, int n, int n2, int n3, boolean bl) {
        this.id_implements = rrSq_12;
        this.id_finally = rrST2;
        this.id_extends = xc_32;
        this.id_native = xc_33;
        this.id_volatile = n;
        this.id_final = n2;
        this.id_package = n3;
        this.id_int = bl;
    }

    static {
        rKW.id_class(id_protected, rKW.id_class(new rrSq_1(true), true, id_protected.id_class()));
        rKW.id_class(id_throws, rKW.id_class(new rrSq_1(false), xu_3.PR.id_continue(), xu_3.id_instanceof.id_continue(), id_throws.id_class()));
        rKW.id_class(id_case, rKW.id_class(new rrSq_1(false), xu_3.Sh.id_continue(), xu_3.id_class.id_continue(), id_case.id_class(), true, true));
        rKW.id_class(id_catch, rKW.id_class(new rrSq_1(true), xu_3.id_break.id_continue(), xu_3.id_try.id_continue(), id_catch.id_class()));
        rKW.id_class(id_private, rKW.id_class(new rrSq_1(true), xu_3.id_break.id_continue(), xu_3.id_try.id_continue(), id_private.id_class(), false, false));
    }

    private static rKW id_class(rrSq_1 rrSq_12, xc_3 xc_32, xc_3 xc_33, rqO_2 rqO_22) {
        HashMap hashMap = Maps.newHashMap(rrSq_1.id_break);
        hashMap.put(rrrZ.id_private, new rrSI(25, 10, 34222645));
        return new rKW(new rrSq_1(Optional.ofNullable(rrSq_12.id_break()), hashMap), new rrST(128, new rrSt_1(1.0, 3.0, 80.0, 60.0), new rrSw_1(120, 3, 0), new rrSw_1(320, 4, -1), 1, 2, 0.0, 0.019921875, false, false, false, false), xc_32, xc_33, 0, 0, 32, false);
    }

    private static rKW id_class(rrSq_1 rrSq_12, xc_3 xc_32, xc_3 xc_33, rqO_2 rqO_22, boolean bl, boolean bl2) {
        return new rKW(rrSq_12, new rrST(128, new rrSt_1(2.0, 1.0, 80.0, 160.0), new rrSw_1(-3000, 64, -46), new rrSw_1(-30, 7, 1), 2, 1, 0.0, 0.0, true, false, bl2, false), xc_32, xc_33, -10, -10, 0, bl);
    }

    public rrSq_1 id_class() {
        return this.id_implements;
    }

    public boolean id_class(rqM_2<rKW> rqM_22) {
        return Objects.equals(this, rVy_1.id_finally.id_class(rqM_22));
    }

    private static rKW id_class(rqM_2<rKW> rqM_22, rKW rKW2) {
        rVy_1.id_class(rVy_1.id_finally, rqM_22.id_class(), rKW2);
        return rKW2;
    }

    private static rKW id_class(rrSq_1 rrSq_12, boolean bl, rqO_2 rqO_22) {
        double d = 0.9999999814507745;
        return new rKW(rrSq_12, new rrST(256, new rrSt_1(0.9999999814507745, 0.9999999814507745, 80.0, 160.0), new rrSw_1(-10, 3, 0), new rrSw_1(-30, 0, 0), 1, 2, 1.0, -0.46875, true, true, false, bl), xu_3.id_break.id_continue(), xu_3.id_try.id_continue(), -10, 0, 63, false);
    }

    public rrST id_break() {
        return this.id_finally;
    }

    public int id_throws() {
        return this.id_volatile;
    }

    public int id_catch() {
        return this.id_package;
    }

    public int id_case() {
        return this.id_final;
    }

    public static rKW id_implements() {
        return id_new;
    }

    public xc_3 id_protected() {
        return this.id_native;
    }

    @Deprecated
    protected boolean id_private() {
        return this.id_int;
    }
}

