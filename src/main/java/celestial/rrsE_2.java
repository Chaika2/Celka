/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rVL;
import celestial.rYG;
import celestial.roC_2;
import celestial.rrSD;
import celestial.rrSK;
import celestial.rrSR;
import celestial.rrSU;
import celestial.rrSV;
import celestial.rrSa_1;
import celestial.rrSe_1;
import celestial.rrSg_1;
import celestial.rrSi_1;
import celestial.rrSo_1;
import celestial.rrsB_2;
import celestial.rrsG_2;
import celestial.rrsO_2;
import celestial.rrsP_2;
import celestial.rrsS_2;
import celestial.rrsb_3;
import celestial.rrsr_3;
import celestial.rrss_3;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class rrsE_2<C extends rrSa_1> {
    private static final xc_3 id_class = xu_3.id_finally.id_continue();
    private static final xc_3 id_break = xu_3.id_implements.id_continue();
    private static final xc_3 id_byte = xu_3.id_native.id_continue();
    private static final xc_3 id_protected = xu_3.id_char.id_continue();
    private static final xc_3 id_throws = xu_3.id_break.id_continue();
    private static final xc_3 id_import = xu_3.id_extends.id_continue();
    private static final xc_3 id_short = xu_3.id_throw.id_continue();
    private static final xc_3 id_default = xu_3.id_interface.id_continue();
    private static final xc_3 id_const = xu_3.sw.id_continue();
    private static final xc_3 id_strictfp = xu_3.Bi.id_continue();
    private static final xc_3 id_boolean = xu_3.PY.id_continue();
    private static final xc_3 id_transient = xu_3.PR.id_continue();
    private static final xc_3 id_for = xu_3.Sh.id_continue();
    private static final xc_3 id_double = xu_3.XL.id_continue();
    private static final xc_3 id_switch = xu_3.Xz.id_continue();
    private static final xc_3 r = xu_3.bg.id_continue();
    private static final xc_3 P = xu_3.XN.id_continue();
    private static final xc_3 B = xu_3.Ju.id_continue();
    private static final xc_3 S = xu_3.PK.id_continue();
    private static final xc_3 s = xu_3.bV.id_continue();
    public static final rrsG_2 id_case = new rrsG_2(id_byte, id_class, id_protected);
    public static final rrsG_2 id_catch = new rrsG_2(id_protected, id_protected, id_protected);
    public static final rrsG_2 id_private = new rrsG_2(id_break, id_class, id_protected);
    public static final rrsG_2 id_implements = new rrsG_2(id_throws, id_throws, id_protected);
    public static final rrsG_2 id_finally = new rrsG_2(id_import, id_class, id_protected);
    public static final rrsG_2 id_extends = new rrsG_2(id_short, id_short, id_protected);
    public static final rrsG_2 id_native = new rrsG_2(id_break, id_class, id_short);
    public static final rrsG_2 id_volatile = new rrsG_2(id_short, id_short, id_short);
    public static final rrsG_2 id_final = new rrsG_2(id_default, id_const, id_protected);
    public static final rrsG_2 id_package = new rrsG_2(id_strictfp, id_class, id_protected);
    public static final rrsG_2 id_int = new rrsG_2(id_transient, id_transient, id_transient);
    public static final rrsG_2 id_new = new rrsG_2(id_boolean, id_boolean, id_boolean);
    public static final rrsG_2 id_continue = new rrsG_2(id_for, id_for, id_for);
    public static final rrsG_2 id_super = new rrsG_2(id_double, id_transient, r);
    public static final rrsG_2 id_this = new rrsG_2(id_switch, id_transient, P);
    public static final rrsG_2 id_else = new rrsG_2(B, S, s);
    public static final rrsE_2<rrsG_2> id_synchronized = rrsE_2.id_class("id_default", new rrSo_1(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_return = rrsE_2.id_class("mountain", new rrSi_1(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_public = rrsE_2.id_class("shattered_savanna", new rrsS_2(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_goto = rrsE_2.id_class("gravelly_mountain", new rrSe_1(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_while = rrsE_2.id_class("giant_tree_taiga", new rrSU(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_try = rrsE_2.id_class("swamp", new rrsb_3(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_instanceof = rrsE_2.id_class("badlands", new rrSV(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_throw = rrsE_2.id_class("wooded_badlands", new rrsO_2(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_interface = rrsE_2.id_class("eroded_badlands", new rrSK(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_char = rrsE_2.id_class("frozen_ocean", new rrSD(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_abstract = rrsE_2.id_class("nether", new rrsP_2(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_long = rrsE_2.id_class("nether_forest", new rrsr_3(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_float = rrsE_2.id_class("soul_sand_valley", new rrss_3(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_void = rrsE_2.id_class("basalt_deltas", new rrSg_1(rrsG_2.id_class));
    public static final rrsE_2<rrsG_2> id_static = rrsE_2.id_class("nope", new rrsB_2(rrsG_2.id_class));
    private final Codec<rrSR<C>> E;

    public rrsE_2(Codec<C> codec) {
        this.E = codec.fieldOf("config").xmap(this::id_class, rrSR::id_class).codec();
    }

    public void id_class(long l) {
    }

    public abstract void id_class(Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, C var14);

    private static <C extends rrSa_1, F extends rrsE_2<C>> F id_class(String string, F f) {
        return (F)rVL.id_class(rVL.l, string, f);
    }

    public rrSR<C> id_class(C c) {
        return new rrSR<C>(this, c);
    }

    public Codec<rrSR<C>> id_protected() {
        return this.E;
    }
}

