/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonElement
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.DD;
import celestial.DE;
import celestial.DI;
import celestial.DJ;
import celestial.DK;
import celestial.DM;
import celestial.DO;
import celestial.DS;
import celestial.DW;
import celestial.DX;
import celestial.Dd_1;
import celestial.Dh_1;
import celestial.Dj_1;
import celestial.Dl_1;
import celestial.Do_1;
import celestial.Dp_1;
import celestial.Ds_1;
import celestial.Dt_1;
import celestial.UW;
import celestial.UX;
import celestial.Uh_1;
import celestial.Uk_1;
import celestial.rCH;
import celestial.rCI;
import celestial.rCK;
import celestial.rCN;
import celestial.rCR;
import celestial.rCT;
import celestial.rCY;
import celestial.rCZ;
import celestial.rCf_1;
import celestial.rCg_1;
import celestial.rCj_1;
import celestial.rCo_1;
import celestial.rCq_1;
import celestial.rCw_1;
import celestial.rCy_1;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rec_3;
import celestial.rkO_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zf_3;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DG {
    public final Consumer<Dt_1> id_class;
    public final BiConsumer<rqO_2, Supplier<JsonElement>> id_break;
    private final Consumer<rdb_3> id_byte;

    private void id_boolean() {
        rqO_2 rqO_22 = DK.id_class(xu_3.bK);
        rqO_2 rqO_23 = DK.id_class(xu_3.bK, "_on");
        this.id_class.accept(Dp_1.id_class(xu_3.bK).id_class(DG.id_class(rCT.id_return, rqO_23, rqO_22)).id_class(DG.id_throws()));
    }

    private void id_char() {
        List<rqO_2> list = this.id_this(xu_3.rK);
        List<rqO_2> list2 = this.id_else(xu_3.rK);
        this.id_class.accept(Dl_1.id_class(xu_3.rK).id_class(DG.id_class(list, dS -> dS)).id_class(DG.id_class(list2, dS -> dS)).id_class(DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R90))).id_class(DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R180))).id_class(DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R270))));
    }

    private void id_byte(xd_3 xd_32, xd_3 xd_33) {
        this.id_class(xd_32.id_case());
        Do_1 do_1 = Do_1.id_catch(xd_32);
        Do_1 do_12 = Do_1.id_class(xd_32, xd_33);
        rqO_2 rqO_22 = Uh_1.c.id_class(xd_33, do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_33, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(Dd_1.id_class(rCT.id_strictfp).id_class(rpr_3.WEST, DS.id_class()).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R180))));
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.d).id_class((T1 n) -> DS.id_class().id_class(Ds_1.id_byte, Uh_1.N[n].id_class(xd_32, do_1, this.id_break)))));
    }

    private static Dd_1 id_byte() {
        return Dd_1.id_class(rCT.id_strictfp).id_class(rpr_3.SOUTH, DS.id_class()).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R270));
    }

    public static Dt_1 id_byte(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dl_1.id_class(xd_32).id_class(DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true));
    }

    private void id_byte(xd_3 xd_32) {
        rqO_2 rqO_22 = Uk_1.id_class.id_class(xd_32, this.id_break);
        rqO_2 rqO_23 = Uk_1.id_break.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_class(xd_32, rqO_22, rqO_23));
    }

    private static Dt_1 id_byte(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.id_else).id_class(rpr_3.NORTH, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.SOUTH, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.SOUTH, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R0)).id_class(rpr_3.EAST, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.WEST, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90)));
    }

    public static Dp_1 id_byte(xd_3 xd_32, rqO_2 rqO_22) {
        return Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22));
    }

    private void id_byte(xd_3 xd_32, UW uW) {
        this.id_class.accept(DG.id_byte(xd_32, uW.id_class(xd_32, this.id_break)));
    }

    private void id_byte(xd_3 xd_32, DX dX) {
        this.id_class(xd_32, "_top");
        rqO_2 rqO_22 = this.id_class(xd_32, "_top", dX.id_class(), Do_1::id_byte);
        rqO_2 rqO_23 = this.id_class(xd_32, "_bottom", dX.id_class(), Do_1::id_byte);
        this.id_case(xd_32, rqO_22, rqO_23);
    }

    private void id_int(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.V.id_class(xd_32, Do_1.id_break(xd_32), this.id_break);
        rqO_2 rqO_23 = DK.id_class("mushroom_block_inside");
        this.id_class.accept(Dl_1.id_class(xd_32).id_class((DI)DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_long, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_float, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_void, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class((DI)DI.id_class().id_class(rCT.id_static, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, false)).id_class((DI)DI.id_class().id_class(rCT.id_import, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, false)).id_class((DI)DI.id_class().id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, false)).id_class((DI)DI.id_class().id_class(rCT.id_long, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, false)).id_class((DI)DI.id_class().id_class(rCT.id_float, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, false)));
        this.id_class(xd_32, Uk_1.id_class.id_class(xd_32, "_inventory", this.id_break));
    }

    private void id_int() {
        this.id_class(rdy_3.OP);
        this.id_class.accept(Dp_1.id_class(xu_3.sL).id_class(DG.id_byte()).id_class(Dd_1.id_class(rCT.I, rCT.id_return).id_class(rCw_1.COMPARE, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL))).id_class(rCw_1.COMPARE, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_on"))).id_class(rCw_1.SUBTRACT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_subtract"))).id_class(rCw_1.SUBTRACT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_on_subtract")))));
    }

    private void id_long() {
        rqO_2 rqO_22 = Do_1.id_throw(xu_3.id_finally);
        Do_1 do_12 = new Do_1().id_class(UX.id_throws, rqO_22).id_class(UX.id_throws, UX.id_byte).id_class(UX.id_case, Do_1.id_class(xu_3.id_implements, "_top")).id_class(UX.id_implements, Do_1.id_class(xu_3.id_implements, "_snow"));
        DS dS = DS.id_class().id_class(Ds_1.id_byte, Uh_1.id_private.id_class(xu_3.id_implements, "_snow", do_12, this.id_break));
        this.id_class(xu_3.id_implements, DK.id_class(xu_3.id_implements), dS);
        rqO_2 rqO_23 = Uk_1.id_throws.get(xu_3.Bi).id_class((Do_1 do_1) -> do_1.id_class(UX.id_throws, rqO_22)).id_class(xu_3.Bi, this.id_break);
        this.id_class(xu_3.Bi, rqO_23, dS);
        rqO_2 rqO_24 = Uk_1.id_throws.get(xu_3.id_native).id_class((Do_1 do_1) -> do_1.id_class(UX.id_throws, rqO_22)).id_class(xu_3.id_native, this.id_break);
        this.id_class(xu_3.id_native, rqO_24, dS);
    }

    private void id_float() {
        this.id_class(rdy_3.Xv);
        this.id_class.accept(Dp_1.id_class(xu_3.Sx).id_class(Dd_1.id_class(rCT.X).id_class((Integer)0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage0"))).id_class((Integer)1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage1"))).id_class((Integer)2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage2")))).id_class(DG.id_byte()));
    }

    private void id_double() {
        rqO_2 rqO_22 = DK.id_class(xu_3.hU, "_stable");
        rqO_2 rqO_23 = DK.id_class(xu_3.hU, "_unstable");
        this.id_class(xu_3.hU, rqO_22);
        this.id_class.accept(Dp_1.id_class(xu_3.hU).id_class(DG.id_class(rCT.id_break, rqO_23, rqO_22)));
    }

    public DG(Consumer<Dt_1> consumer, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer, Consumer<rdb_3> consumer2) {
        this.id_class = consumer;
        this.id_break = biConsumer;
        this.id_byte = consumer2;
    }

    private void B() {
        this.id_class(rdy_3.D);
        this.id_class.accept(Dp_1.id_class(xu_3.hr).id_class(Dd_1.id_class(rCT.l, rCT.id_throw).id_class((Integer)1, (Boolean)false, Arrays.asList(DG.id_class(DK.id_class("dead_sea_pickle")))).id_class((Integer)2, (Boolean)false, Arrays.asList(DG.id_class(DK.id_class("two_dead_sea_pickles")))).id_class((Integer)3, (Boolean)false, Arrays.asList(DG.id_class(DK.id_class("three_dead_sea_pickles")))).id_class((Integer)4, (Boolean)false, Arrays.asList(DG.id_class(DK.id_class("four_dead_sea_pickles")))).id_class((Integer)1, (Boolean)true, Arrays.asList(DG.id_class(DK.id_class("sea_pickle")))).id_class((Integer)2, (Boolean)true, Arrays.asList(DG.id_class(DK.id_class("two_sea_pickles")))).id_class((Integer)3, (Boolean)true, Arrays.asList(DG.id_class(DK.id_class("three_sea_pickles")))).id_class((Integer)4, (Boolean)true, Arrays.asList(DG.id_class(DK.id_class("four_sea_pickles"))))));
    }

    private void J() {
        rqO_2 rqO_22 = DK.id_class(xu_3.id_break);
        rqO_2 rqO_23 = DK.id_class(xu_3.id_break, "_mirrored");
        this.id_class.accept(DG.id_class(xu_3.Bl, rqO_22, rqO_23));
        this.id_class(xu_3.Bl, rqO_22);
    }

    private void S() {
        Do_1 do_1 = Do_1.id_class(xu_3.Pq);
        rqO_2 rqO_22 = Uh_1.id_byte.id_class(xu_3.Pt, do_1, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.Pq).id_class(Dd_1.id_class(rCT.m).id_class((T1 n) -> DS.id_class().id_class(Ds_1.id_byte, n < 8 ? DK.id_class(xu_3.Pq, "_height" + n * 2) : rqO_22))));
        this.id_class(xu_3.Pq, DK.id_class(xu_3.Pq, "_height2"));
        this.id_class.accept(DG.id_byte(xu_3.Pt, rqO_22));
    }

    private void id_this() {
        Do_1 do_1 = new Do_1().id_class(UX.id_byte, Do_1.id_class(xu_3.XP, "_side3")).id_class(UX.id_package, Do_1.id_throw(xu_3.id_super)).id_class(UX.id_final, Do_1.id_class(xu_3.XP, "_top")).id_class(UX.id_finally, Do_1.id_class(xu_3.XP, "_side3")).id_class(UX.id_native, Do_1.id_class(xu_3.XP, "_side3")).id_class(UX.id_extends, Do_1.id_class(xu_3.XP, "_side1")).id_class(UX.id_volatile, Do_1.id_class(xu_3.XP, "_side2"));
        this.id_class.accept(DG.id_byte(xu_3.XP, Uh_1.id_class.id_class(xu_3.XP, do_1, this.id_break)));
    }

    private List<rqO_2> id_this(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.Z.id_class(DK.id_class(xd_32, "_floor0"), Do_1.id_continue(xd_32), this.id_break);
        rqO_2 rqO_23 = Uh_1.Z.id_class(DK.id_class(xd_32, "_floor1"), Do_1.id_super(xd_32), this.id_break);
        return ImmutableList.of((Object)rqO_22, (Object)rqO_23);
    }

    private void b() {
        this.id_class(rdy_3.Oa);
        this.id_class.accept(Dp_1.id_class(xu_3.SQ).id_class(Dd_1.id_class(rCT.id_class, rCT.id_static, rCT.id_void, rCT.id_import, rCT.id_short).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns"))).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n"))).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne"))).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns"))).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse"))).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nsew"))).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns"))).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n"))).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne"))).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns"))).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse"))).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nsew")))));
    }

    private void x() {
        rqO_2 rqO_22 = Do_1.id_class(xu_3.Jk, "_bottom");
        rqO_2 rqO_23 = Do_1.id_class(xu_3.Jk, "_top_off");
        rqO_2 rqO_24 = Do_1.id_class(xu_3.Jk, "_top");
        rqO_2[] rqO_2Array = new rqO_2[5];
        for (int i = 0; i < 5; ++i) {
            Do_1 do_1 = new Do_1().id_class(UX.id_throws, rqO_22).id_class(UX.id_case, i == 0 ? rqO_23 : rqO_24).id_class(UX.id_implements, Do_1.id_class(xu_3.Jk, "_side" + i));
            rqO_2Array[i] = Uh_1.id_private.id_class(xu_3.Jk, "_" + i, do_1, this.id_break);
        }
        this.id_class.accept(Dp_1.id_class(xu_3.Jk).id_class(Dd_1.id_class(rCT.q).id_class((T1 n) -> DS.id_class().id_class(Ds_1.id_byte, rqO_2Array[n]))));
        this.id_class(rdy_3.Wo, rqO_2Array[0]);
    }

    private void s() {
        this.id_class.accept(Dp_1.id_class(xu_3.XG, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.XG))).id_class(DG.id_break()));
    }

    private void h() {
        this.id_break(xu_3.BD);
        this.id_class.accept(Dp_1.id_class(xu_3.BD).id_class(Dd_1.id_class(rCT.id_static, rCT.id_void, rCT.id_import, rCT.id_long, rCT.id_short).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1"))).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1"))).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2"))).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2_opposite"))).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2_opposite")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3"))).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_4"))).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_u"))).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u"))).id_class((Boolean)false, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u"))).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)false, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)false, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u_opposite"))).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u_opposite")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u"))).id_class((Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R90)).id_class((Boolean)false, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R180)).id_class((Boolean)true, (Boolean)true, (Boolean)false, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R270)).id_class((Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_4u")))));
    }

    private void d() {
        rqO_2 rqO_22 = Do_1.id_class(xu_3.JE, "_top");
        rqO_2 rqO_23 = Do_1.id_class(xu_3.JE, "_bottom");
        rqO_2 rqO_24 = Do_1.id_class(xu_3.JE, "_side");
        rqO_2 rqO_25 = Do_1.id_class(xu_3.JE, "_lock");
        Do_1 do_1 = new Do_1().id_class(UX.id_package, rqO_24).id_class(UX.id_volatile, rqO_24).id_class(UX.id_native, rqO_24).id_class(UX.id_byte, rqO_22).id_class(UX.id_finally, rqO_22).id_class(UX.id_extends, rqO_23).id_class(UX.id_final, rqO_25);
        rqO_2 rqO_26 = Uh_1.id_break.id_class(xu_3.JE, do_1, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.JE, DS.id_class().id_class(Ds_1.id_byte, rqO_26)).id_class(Dd_1.id_class(rCT.id_boolean).id_class((T1 rec_32) -> this.id_class((rec_3)rec_32, DS.id_class()))));
    }

    private void id_interface() {
        Dj_1 dj_1 = DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, false).id_class(rCT.id_long, false);
        List<rqO_2> list = this.id_this(xu_3.ro);
        List<rqO_2> list2 = this.id_else(xu_3.ro);
        List<rqO_2> list3 = this.id_synchronized(xu_3.ro);
        this.id_class.accept(Dl_1.id_class(xu_3.ro).id_class((DI)dj_1, DG.id_class(list, dS -> dS)).id_class(DI.id_class(DI.id_class().id_class(rCT.id_void, true), dj_1), DG.id_class(list2, dS -> dS)).id_class(DI.id_class(DI.id_class().id_class(rCT.id_static, true), dj_1), DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R90))).id_class(DI.id_class(DI.id_class().id_class(rCT.id_import, true), dj_1), DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R180))).id_class(DI.id_class(DI.id_class().id_class(rCT.id_short, true), dj_1), DG.id_class(list2, dS -> dS.id_class(Ds_1.id_break, DE.R270))).id_class((DI)DI.id_class().id_class(rCT.id_long, true), DG.id_class(list3, dS -> dS)));
    }

    private DO id_class(rqO_2 rqO_22, xd_3 xd_32) {
        return new DO(this, rqO_22, xd_32);
    }

    private void id_class(xd_3 xd_32, rqO_2 rqO_22, DS dS) {
        List<DS> list = Arrays.asList(DG.id_class(rqO_22));
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_while).id_class((Boolean)true, dS).id_class((Boolean)false, list)));
    }

    private List<DS> id_class(int n2) {
        String string = "_age" + n2;
        return IntStream.range(1, 5).mapToObj(n -> DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, n + string))).collect(Collectors.toList());
    }

    private void id_class(xd_3 xd_32, rdb_3 rdb_32) {
        rqO_2 rqO_22 = Uh_1.id_abstract.id_class(xd_32, Do_1.id_class(rdb_32), this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22));
    }

    private static <T extends Comparable<T>> Dd_1 id_class(rCZ<T> rCZ2, T t, rqO_2 rqO_22, rqO_2 rqO_23) {
        DS dS = DS.id_class().id_class(Ds_1.id_byte, rqO_22);
        DS dS2 = DS.id_class().id_class(Ds_1.id_byte, rqO_23);
        return Dd_1.id_class(rCZ2).id_class((T1 comparable2) -> {
            boolean bl = comparable2.compareTo(t) >= 0;
            return bl ? dS : dS2;
        });
    }

    private void id_class(UW uW, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
            this.id_class.accept(DG.id_break(xd_32, rqO_22));
        }
    }

    private void id_class(xd_3 xd_32, rCZ<Integer> rCZ2, int ... nArray) {
        if (rCZ2.id_class().size() != nArray.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        Dd_1 dd_1 = Dd_1.id_class(rCZ2).id_class(arg_0 -> this.id_class(nArray, (Int2ObjectMap)int2ObjectOpenHashMap, xd_32, arg_0));
        this.id_class(xd_32.id_case());
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(dd_1));
    }

    private void id_class(xd_3 ... xd_3Array) {
        rqO_2 rqO_22 = DK.id_class("campfire_off");
        for (xd_3 xd_32 : xd_3Array) {
            rqO_2 rqO_23 = Uh_1.n.id_class(xd_32, Do_1.id_try(xd_32), this.id_break);
            this.id_class(xd_32.id_case());
            this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_continue, rqO_23, rqO_22)).id_class(DG.id_byte()));
        }
    }

    private void id_class(xd_3 xd_32, xd_3 xd_33, BiFunction<xd_3, xd_3, Do_1> biFunction) {
        Do_1 do_1 = biFunction.apply(xd_32, xd_33);
        this.id_class.accept(DG.id_byte(xd_32, Uh_1.id_class.id_class(xd_32, do_1, this.id_break)));
    }

    private static List<DS> id_class(List<rqO_2> list, UnaryOperator<DS> unaryOperator) {
        return list.stream().map(rqO_22 -> DS.id_class().id_class(Ds_1.id_byte, rqO_22)).map(unaryOperator).collect(Collectors.toList());
    }

    private void id_class(xd_3 xd_32, Do_1 do_1) {
        rqO_2 rqO_22 = Uh_1.id_implements.id_class(xd_32, do_1.id_break(UX.id_catch, Do_1.id_throw(xd_32)), this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(DG.id_break()));
    }

    private void id_class(xd_3 xd_32, Function<xd_3, Do_1> function) {
        Do_1 do_1 = function.apply(xd_32).id_class(UX.id_implements, UX.id_byte);
        Do_1 do_12 = do_1.id_break(UX.id_catch, Do_1.id_class(xd_32, "_front_honey"));
        rqO_2 rqO_22 = Uh_1.id_finally.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_finally.id_class(xd_32, "_honey", do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_break()).id_class(DG.id_class(rCT.L, 5, rqO_23, rqO_22)));
    }

    private /* synthetic */ DS id_class(int[] nArray, Int2ObjectMap int2ObjectMap, xd_3 xd_32, Integer n) {
        int n3 = nArray[n];
        rqO_2 rqO_22 = (rqO_2)int2ObjectMap.computeIfAbsent(n3, n2 -> this.id_class(xd_32, "_stage" + n3, Uh_1.u, Do_1::id_case));
        return DS.id_class().id_class(Ds_1.id_byte, rqO_22);
    }

    public void id_class() {
        this.id_extends(xu_3.id_class);
        this.id_class(xu_3.hb, xu_3.id_class);
        this.id_class(xu_3.hG, xu_3.id_class);
        this.id_extends(xu_3.Sv);
        this.id_extends(xu_3.Pw);
        this.id_class(xu_3.hM, xu_3.id_try);
        this.id_extends(xu_3.SX);
        this.id_extends(xu_3.Oh);
        this.id_extends(xu_3.SE);
        this.id_extends(xu_3.SA);
        this.id_class(rdy_3.dS);
        this.id_extends(xu_3.Jh);
        this.id_extends(xu_3.id_try);
        this.id_extends(xu_3.id_instanceof);
        this.id_extends(xu_3.EN);
        this.id_class(rdy_3.BK);
        this.id_extends(xu_3.hE);
        this.id_extends(xu_3.Si);
        this.id_class(xu_3.Ec, rdy_3.sV);
        this.id_class(rdy_3.sV);
        this.id_class(xu_3.bo, rdy_3.GN);
        this.id_class(rdy_3.GN);
        this.id_case(xu_3.rc, Do_1.id_class(xu_3.rB, "_side"));
        this.id_byte(xu_3.id_float, Uk_1.id_class);
        this.id_byte(xu_3.Ea, Uk_1.id_class);
        this.id_byte(xu_3.ri, Uk_1.id_class);
        this.id_byte(xu_3.Pr, Uk_1.id_class);
        this.id_byte(xu_3.Sk, Uk_1.id_class);
        this.id_byte(xu_3.SN, Uk_1.id_class);
        this.id_byte(xu_3.id_abstract, Uk_1.id_class);
        this.id_byte(xu_3.id_void, Uk_1.id_class);
        this.id_byte(xu_3.rt, Uk_1.id_class);
        this.id_byte(xu_3.id_long, Uk_1.id_class);
        this.id_byte(xu_3.rw, Uk_1.id_class);
        this.id_byte(xu_3.Jx, Uk_1.id_byte);
        this.id_byte(xu_3.JJ, Uk_1.id_class);
        this.id_byte(xu_3.m, Uk_1.id_class);
        this.id_byte(xu_3.Z, Uk_1.id_class);
        this.id_byte(xu_3.sC, Uk_1.id_class);
        this.id_byte(xu_3.Pl, Uk_1.id_class);
        this.id_byte(xu_3.sn, Uk_1.id_class);
        this.id_byte(xu_3.Jy, Uk_1.id_class);
        this.id_byte(xu_3.hP, Uk_1.id_class);
        this.id_byte(xu_3.JI, Uk_1.id_class);
        this.id_byte(xu_3.PI, Uk_1.id_class);
        this.id_byte(xu_3.id_extends, Uk_1.id_class);
        this.id_byte(xu_3.Jf, Uk_1.id_class);
        this.id_byte(xu_3.Bn, Uk_1.id_class);
        this.id_byte(xu_3.Jd, Uk_1.id_class);
        this.id_byte(xu_3.Sh, Uk_1.id_class);
        this.id_byte(xu_3.Pa, Uk_1.id_class);
        this.id_byte(xu_3.id_char, Uk_1.id_class);
        this.id_byte(xu_3.JX, Uk_1.id_class);
        this.id_byte(xu_3.PT, Uk_1.id_class);
        this.id_byte(xu_3.Pj, Uk_1.id_case);
        this.id_byte(xu_3.Jc, Uk_1.id_byte);
        this.id_byte(xu_3.Bg, Uk_1.id_byte);
        this.id_byte(xu_3.bg, Uk_1.id_class);
        this.id_byte(xu_3.n, Uk_1.id_class);
        this.id_byte(xu_3.Ei, Uk_1.id_class);
        this.id_byte(xu_3.rg, Uk_1.id_class);
        this.id_byte(xu_3.Jj, Uk_1.id_class);
        this.id_byte(xu_3.EH, Uk_1.id_class);
        this.id_byte(xu_3.Xn, Uk_1.id_class);
        this.id_byte(xu_3.PY, Uk_1.id_class);
        this.id_byte(xu_3.Po, Uk_1.id_class);
        this.id_byte(xu_3.rD, Uk_1.id_class);
        this.id_byte(xu_3.N, Uk_1.id_class);
        this.id_byte(xu_3.rr, Uk_1.id_new);
        this.id_class(rdy_3.K);
        this.id_byte(xu_3.rf, Uk_1.id_throws);
        this.id_byte(xu_3.Jb, Uk_1.id_byte);
        this.id_byte(xu_3.XN, Uk_1.id_class);
        this.id_byte(xu_3.c, Uk_1.id_class);
        this.id_byte(xu_3.JA, Uk_1.id_class);
        this.id_byte(xu_3.sy, Uk_1.id_byte.id_class((Do_1 do_1) -> do_1.id_class(UX.id_implements, Do_1.id_throw(xu_3.sy))));
        this.id_byte(xu_3.BC, Uk_1.id_class);
        this.id_catch(xu_3.L, xu_3.F);
        this.id_catch(xu_3.Gf, xu_3.GI);
        this.id_byte(xu_3.Jn, Uk_1.id_class);
        this.id_private(xu_3.sv, xu_3.rt);
        this.id_private(xu_3.sF, xu_3.rw);
        this.id_final();
        this.id_continue();
        this.id_super();
        this.id_class(new xd_3[]{xu_3.Xh, xu_3.XX});
        this.id_this();
        this.id_return();
        this.id_public();
        this.id_while();
        this.id_try();
        this.id_instanceof();
        this.id_goto();
        this.id_super(xu_3.bn);
        this.id_throw();
        this.id_interface();
        this.id_char();
        this.id_abstract();
        this.id_long();
        this.id_float();
        this.id_void();
        this.id_volatile();
        this.id_static();
        this.id_import();
        this.id_short();
        this.id_default();
        this.id_const();
        this.id_strictfp();
        this.id_boolean();
        this.id_transient();
        this.id_for();
        this.id_double();
        this.r();
        this.id_switch();
        this.P();
        this.B();
        this.id_else();
        this.S();
        this.s();
        this.E();
        this.G();
        this.b();
        this.M();
        this.O();
        this.h();
        this.X();
        this.d();
        this.id_public(xu_3.PJ);
        this.id_break(xu_3.PJ);
        this.id_public(xu_3.Xs);
        this.id_finally(xu_3.rR, xu_3.rY);
        this.id_finally(xu_3.PU, xu_3.Pe);
        this.id_class(xu_3.PP, xu_3.id_final, Do_1::id_byte);
        this.id_class(xu_3.XB, xu_3.id_int, Do_1::id_protected);
        this.id_continue(xu_3.XL);
        this.id_continue(xu_3.Xz);
        this.id_new(xu_3.v);
        this.id_new(xu_3.st);
        this.id_return(xu_3.XM);
        this.id_return(xu_3.XO);
        this.id_throws(xu_3.Bj, DK.id_class(xu_3.Bj));
        this.id_class(xu_3.PK, Uk_1.id_byte);
        this.id_class(xu_3.PD, Uk_1.id_byte);
        this.id_class(xu_3.bY, Uk_1.id_byte);
        this.id_protected(xu_3.id_finally);
        this.id_protected(xu_3.id_throw);
        this.id_protected(xu_3.id_interface);
        this.id_byte(xu_3.id_while);
        this.id_class(xu_3.Ey, Uk_1.id_byte, Uk_1.id_protected);
        this.id_class(xu_3.by, Uk_1.id_continue, Uk_1.id_super);
        this.id_class(xu_3.sp, Uk_1.id_continue, Uk_1.id_super);
        this.id_break(xu_3.he, Uk_1.id_private);
        this.id_synchronized();
        this.id_class(xu_3.JM, Do_1::id_return);
        this.id_class(xu_3.JO, Do_1::id_goto);
        this.id_class(xu_3.bT, rCT.J, 0, 1, 2, 3);
        this.id_class(xu_3.sr, rCT.d, 0, 0, 1, 1, 2, 2, 2, 3);
        this.id_class(xu_3.Ss, rCT.J, 0, 1, 1, 2);
        this.id_class(xu_3.sP, rCT.d, 0, 0, 1, 1, 2, 2, 2, 3);
        this.id_class(xu_3.PB, rCT.d, 0, 1, 2, 3, 4, 5, 6, 7);
        this.id_class(DK.id_class("banner"), xu_3.id_final).id_class(Uh_1.D, xu_3.GG, xu_3.Gb, xu_3.GM, xu_3.GO, xu_3.Gh, xu_3.GX, xu_3.GJ, xu_3.Gx, xu_3.Gd, xu_3.Gk, xu_3.GW, xu_3.Gz, xu_3.GQ, xu_3.GN, xu_3.Gc, xu_3.Gu).id_break(xu_3.Gm, xu_3.GZ, xu_3.Gv, xu_3.GF, xu_3.GL, xu_3.GA, xu_3.Gn, xu_3.GC, xu_3.Gl, xu_3.GH, xu_3.Gy, xu_3.Gp, xu_3.Gq, xu_3.GT, xu_3.Gt, xu_3.Gw);
        this.id_class(DK.id_class("bed"), xu_3.id_final).id_break(xu_3.C, xu_3.l, xu_3.H, xu_3.y, xu_3.p, xu_3.q, xu_3.T, xu_3.t, xu_3.w, xu_3.I, xu_3.f, xu_3.j, xu_3.V, xu_3.g, xu_3.R, xu_3.Y);
        this.id_extends(xu_3.C, xu_3.rs);
        this.id_extends(xu_3.l, xu_3.rE);
        this.id_extends(xu_3.H, xu_3.rG);
        this.id_extends(xu_3.y, xu_3.rb);
        this.id_extends(xu_3.p, xu_3.rM);
        this.id_extends(xu_3.q, xu_3.rO);
        this.id_extends(xu_3.T, xu_3.rh);
        this.id_extends(xu_3.t, xu_3.rX);
        this.id_extends(xu_3.w, xu_3.rJ);
        this.id_extends(xu_3.I, xu_3.rx);
        this.id_extends(xu_3.f, xu_3.rd);
        this.id_extends(xu_3.j, xu_3.rk);
        this.id_extends(xu_3.V, xu_3.rW);
        this.id_extends(xu_3.g, xu_3.rz);
        this.id_extends(xu_3.R, xu_3.rQ);
        this.id_extends(xu_3.Y, xu_3.rN);
        this.id_class(DK.id_class("skull"), xu_3.PY).id_class(Uh_1.U, xu_3.sW, xu_3.sd, xu_3.sJ, xu_3.sM, xu_3.sh).id_class(xu_3.sQ).id_break(xu_3.sz, xu_3.sN, xu_3.sk, xu_3.sx, xu_3.sO, xu_3.sX);
        this.id_goto(xu_3.bD);
        this.id_goto(xu_3.bU);
        this.id_goto(xu_3.be);
        this.id_goto(xu_3.ba);
        this.id_goto(xu_3.bi);
        this.id_goto(xu_3.Mr);
        this.id_goto(xu_3.MP);
        this.id_goto(xu_3.MB);
        this.id_goto(xu_3.MS);
        this.id_goto(xu_3.Ms);
        this.id_goto(xu_3.ME);
        this.id_goto(xu_3.MG);
        this.id_goto(xu_3.Mb);
        this.id_goto(xu_3.MM);
        this.id_goto(xu_3.MO);
        this.id_goto(xu_3.Mh);
        this.id_goto(xu_3.MX);
        this.id_byte(xu_3.hB, Uk_1.id_native);
        this.id_class(xu_3.hB);
        this.id_class(DK.id_class("chest"), xu_3.id_final).id_break(xu_3.re, xu_3.sZ);
        this.id_class(DK.id_class("ender_chest"), xu_3.rg).id_break(xu_3.SW);
        this.id_protected(xu_3.SM, xu_3.rg).id_class(xu_3.SM, xu_3.bw);
        this.id_throws(xu_3.Mn);
        this.id_throws(xu_3.MC);
        this.id_throws(xu_3.Ml);
        this.id_throws(xu_3.MH);
        this.id_throws(xu_3.My);
        this.id_throws(xu_3.Mp);
        this.id_throws(xu_3.Mq);
        this.id_throws(xu_3.MT);
        this.id_throws(xu_3.Mt);
        this.id_throws(xu_3.Mw);
        this.id_throws(xu_3.MI);
        this.id_throws(xu_3.Mf);
        this.id_throws(xu_3.Mj);
        this.id_throws(xu_3.MV);
        this.id_throws(xu_3.Mg);
        this.id_throws(xu_3.MR);
        this.id_class(Uk_1.id_class, xu_3.MY, xu_3.Mo, xu_3.MK, xu_3.MD, xu_3.MU, xu_3.Me, xu_3.Ma, xu_3.Mi, xu_3.Or, xu_3.OP, xu_3.OB, xu_3.OS, xu_3.Os, xu_3.OE, xu_3.OG, xu_3.Ob);
        this.id_throws(xu_3.Ee);
        this.id_throws(xu_3.sw);
        this.id_throws(xu_3.sI);
        this.id_throws(xu_3.sf);
        this.id_throws(xu_3.sj);
        this.id_throws(xu_3.sV);
        this.id_throws(xu_3.sg);
        this.id_throws(xu_3.sR);
        this.id_throws(xu_3.sY);
        this.id_throws(xu_3.so);
        this.id_throws(xu_3.sK);
        this.id_throws(xu_3.sD);
        this.id_throws(xu_3.sU);
        this.id_throws(xu_3.se);
        this.id_throws(xu_3.sa);
        this.id_throws(xu_3.si);
        this.id_throws(xu_3.Er);
        this.id_case(xu_3.u, xu_3.BV);
        this.id_case(xu_3.Bs, xu_3.EP);
        this.id_case(xu_3.BE, xu_3.EB);
        this.id_case(xu_3.BG, xu_3.ES);
        this.id_case(xu_3.Bb, xu_3.Es);
        this.id_case(xu_3.BM, xu_3.EE);
        this.id_case(xu_3.BO, xu_3.EG);
        this.id_case(xu_3.Bh, xu_3.Eb);
        this.id_case(xu_3.BX, xu_3.EM);
        this.id_case(xu_3.BJ, xu_3.EO);
        this.id_case(xu_3.Bx, xu_3.Eh);
        this.id_case(xu_3.Bd, xu_3.EX);
        this.id_case(xu_3.Bk, xu_3.EJ);
        this.id_case(xu_3.BW, xu_3.Ex);
        this.id_case(xu_3.Bz, xu_3.Ed);
        this.id_case(xu_3.BQ, xu_3.Ek);
        this.id_case(xu_3.BN, xu_3.EW);
        this.id_break(Uk_1.id_finally, xu_3.MJ, xu_3.Mx, xu_3.Md, xu_3.Mk, xu_3.MW, xu_3.Mz, xu_3.MQ, xu_3.MN, xu_3.Mc, xu_3.Mu, xu_3.Mm, xu_3.MZ, xu_3.Mv, xu_3.MF, xu_3.ML, xu_3.MA);
        this.id_throws(xu_3.rs, xu_3.Ep);
        this.id_throws(xu_3.rE, xu_3.Eq);
        this.id_throws(xu_3.rG, xu_3.ET);
        this.id_throws(xu_3.rb, xu_3.Et);
        this.id_throws(xu_3.rM, xu_3.Ew);
        this.id_throws(xu_3.rO, xu_3.EI);
        this.id_throws(xu_3.rh, xu_3.Ef);
        this.id_throws(xu_3.rX, xu_3.Ej);
        this.id_throws(xu_3.rJ, xu_3.EV);
        this.id_throws(xu_3.rx, xu_3.Eg);
        this.id_throws(xu_3.rd, xu_3.ER);
        this.id_throws(xu_3.rk, xu_3.EY);
        this.id_throws(xu_3.rW, xu_3.Eo);
        this.id_throws(xu_3.rz, xu_3.EK);
        this.id_throws(xu_3.rQ, xu_3.ED);
        this.id_throws(xu_3.rN, xu_3.EU);
        this.id_class(xu_3.a, xu_3.Sq, DX.TINTED);
        this.id_class(xu_3.ru, xu_3.ST, DX.NOT_TINTED);
        this.id_class(xu_3.rm, xu_3.St, DX.NOT_TINTED);
        this.id_class(xu_3.rZ, xu_3.Sw, DX.NOT_TINTED);
        this.id_class(xu_3.rv, xu_3.SI, DX.NOT_TINTED);
        this.id_class(xu_3.rF, xu_3.Sf, DX.NOT_TINTED);
        this.id_class(xu_3.rL, xu_3.Sj, DX.NOT_TINTED);
        this.id_class(xu_3.rA, xu_3.SV, DX.NOT_TINTED);
        this.id_class(xu_3.rn, xu_3.Sg, DX.NOT_TINTED);
        this.id_class(xu_3.rC, xu_3.SR, DX.NOT_TINTED);
        this.id_class(xu_3.rl, xu_3.SY, DX.NOT_TINTED);
        this.id_class(xu_3.rH, xu_3.So, DX.NOT_TINTED);
        this.id_class(xu_3.rp, xu_3.SK, DX.NOT_TINTED);
        this.id_class(xu_3.ry, xu_3.SD, DX.NOT_TINTED);
        this.id_class(xu_3.rT, xu_3.SU, DX.NOT_TINTED);
        this.id_class(xu_3.rq, xu_3.Se, DX.NOT_TINTED);
        this.id_class(xu_3.i, xu_3.Sa, DX.NOT_TINTED);
        this.id_int(xu_3.Bt);
        this.id_int(xu_3.Bw);
        this.id_int(xu_3.BI);
        this.id_class(xu_3.e, DX.TINTED);
        this.id_break(xu_3.Pf, DX.TINTED);
        this.id_class(rdy_3.rT);
        this.id_break(xu_3.OM, xu_3.OO, DX.TINTED);
        this.id_class(rdy_3.rt);
        this.id_class(xu_3.OO);
        this.id_break(xu_3.XC, xu_3.Xl, DX.NOT_TINTED);
        this.id_break(xu_3.XH, xu_3.Xy, DX.NOT_TINTED);
        this.id_class(xu_3.XC, "_plant");
        this.id_class(xu_3.Xl);
        this.id_class(xu_3.XH, "_plant");
        this.id_class(xu_3.Xy);
        this.id_class(xu_3.hS, DX.TINTED, Do_1.id_byte(Do_1.id_class(xu_3.hs, "_stage0")));
        this.id_implements();
        this.id_class(xu_3.U, DX.NOT_TINTED);
        this.id_byte(xu_3.GP, DX.NOT_TINTED);
        this.id_byte(xu_3.GB, DX.NOT_TINTED);
        this.id_byte(xu_3.GS, DX.NOT_TINTED);
        this.id_byte(xu_3.Gs, DX.TINTED);
        this.id_byte(xu_3.GE, DX.TINTED);
        this.id_catch();
        this.id_private();
        this.id_class(xu_3.OA, xu_3.Om, xu_3.Oz, xu_3.OJ, xu_3.Ow, xu_3.Oy, xu_3.OD, xu_3.Og);
        this.id_class(xu_3.On, xu_3.OZ, xu_3.OQ, xu_3.Ox, xu_3.OI, xu_3.Op, xu_3.OU, xu_3.OR);
        this.id_class(xu_3.OC, xu_3.Ov, xu_3.ON, xu_3.Od, xu_3.Of, xu_3.Oq, xu_3.Oe, xu_3.OY);
        this.id_class(xu_3.Ol, xu_3.OF, xu_3.Oc, xu_3.Ok, xu_3.Oj, xu_3.OT, xu_3.Oa, xu_3.Oo);
        this.id_class(xu_3.OH, xu_3.OL, xu_3.Ou, xu_3.OW, xu_3.OV, xu_3.Ot, xu_3.Oi, xu_3.OK);
        this.id_byte(xu_3.BK, xu_3.BY);
        this.id_byte(xu_3.Bo, xu_3.BR);
        this.id_case(xu_3.id_continue).id_class(xu_3.sG).id_byte(xu_3.bu).id_protected(xu_3.bW).id_throws(xu_3.Pn).id_class(xu_3.PM, xu_3.PQ).id_case(xu_3.GK).id_catch(xu_3.Ez);
        this.id_catch(xu_3.bL);
        this.id_private(xu_3.Bv);
        this.id_finally(xu_3.id_const).id_byte(xu_3.id_const).id_class(xu_3.E);
        this.id_finally(xu_3.id_double).id_byte(xu_3.id_double).id_class(xu_3.X);
        this.id_class(xu_3.id_public, xu_3.Sy, DX.NOT_TINTED);
        this.id_byte(xu_3.z, Uk_1.id_final);
        this.id_case(xu_3.id_int).id_class(xu_3.ss).id_byte(xu_3.bN).id_protected(xu_3.bd).id_throws(xu_3.PL).id_class(xu_3.Pb, xu_3.Pz).id_case(xu_3.GY).id_catch(xu_3.Su);
        this.id_catch(xu_3.bv);
        this.id_private(xu_3.Bm);
        this.id_finally(xu_3.id_short).id_byte(xu_3.id_short).id_class(xu_3.S);
        this.id_finally(xu_3.id_transient).id_byte(xu_3.id_transient).id_class(xu_3.O);
        this.id_class(xu_3.id_synchronized, xu_3.Sl, DX.NOT_TINTED);
        this.id_byte(xu_3.k, Uk_1.id_final);
        this.id_case(xu_3.id_final).id_class(xu_3.sB).id_byte(xu_3.PV).id_protected(xu_3.BU).id_throws(xu_3.Pv).id_class(xu_3.PE, xu_3.Pk).id_case(xu_3.Gg).id_case(xu_3.br).id_catch(xu_3.rU);
        this.id_catch(xu_3.PX);
        this.id_implements(xu_3.Bc);
        this.id_finally(xu_3.id_static).id_byte(xu_3.id_static).id_class(xu_3.P);
        this.id_finally(xu_3.r).id_byte(xu_3.r).id_class(xu_3.b);
        this.id_class(xu_3.id_this, xu_3.Sn, DX.NOT_TINTED);
        this.id_byte(xu_3.x, Uk_1.id_final);
        this.id_case(xu_3.id_package).id_class(xu_3.sS).id_byte(xu_3.bQ).id_protected(xu_3.bx).id_throws(xu_3.PF).id_class(xu_3.PG, xu_3.PW).id_case(xu_3.GR).id_catch(xu_3.Sc);
        this.id_catch(xu_3.bZ);
        this.id_private(xu_3.Bu);
        this.id_finally(xu_3.id_import).id_byte(xu_3.id_import).id_class(xu_3.B);
        this.id_finally(xu_3.id_boolean).id_byte(xu_3.id_boolean).id_class(xu_3.M);
        this.id_class(xu_3.id_else, xu_3.SC, DX.NOT_TINTED);
        this.id_byte(xu_3.d, Uk_1.id_final);
        this.id_case(xu_3.id_super).id_class(xu_3.sb).id_byte(xu_3.bm).id_protected(xu_3.bz).id_throws(xu_3.PC).id_class(xu_3.Ph, xu_3.Pc).id_case(xu_3.GD).id_catch(xu_3.EQ);
        this.id_catch(xu_3.bA);
        this.id_implements(xu_3.BF);
        this.id_finally(xu_3.id_strictfp).id_byte(xu_3.id_strictfp).id_class(xu_3.G);
        this.id_finally(xu_3.id_switch).id_byte(xu_3.id_switch).id_class(xu_3.J);
        this.id_class(xu_3.id_goto, xu_3.Sp, DX.NOT_TINTED);
        this.id_byte(xu_3.Q, Uk_1.id_final);
        this.id_case(xu_3.id_new).id_class(xu_3.sE).id_byte(xu_3.bc).id_protected(xu_3.bk).id_throws(xu_3.PA).id_class(xu_3.PO, xu_3.PN).id_case(xu_3.Go).id_catch(xu_3.Sm);
        this.id_catch(xu_3.bF);
        this.id_private(xu_3.BZ);
        this.id_finally(xu_3.id_default).id_byte(xu_3.id_default).id_class(xu_3.s);
        this.id_finally(xu_3.id_for).id_byte(xu_3.id_for).id_class(xu_3.h);
        this.id_class(xu_3.id_return, xu_3.SH, DX.NOT_TINTED);
        this.id_byte(xu_3.W, Uk_1.id_final);
        this.id_case(xu_3.Xq).id_class(xu_3.XU).id_byte(xu_3.Xj).id_protected(xu_3.XY).id_throws(xu_3.XI).id_class(xu_3.Jr, xu_3.JB).id_case(xu_3.Xt).id_catch(xu_3.XK);
        this.id_catch(xu_3.Xa);
        this.id_private(xu_3.Xg);
        this.id_finally(xu_3.Xm).id_break(xu_3.Xm).id_class(xu_3.Xv);
        this.id_finally(xu_3.XZ).id_break(xu_3.XZ).id_class(xu_3.XF);
        this.id_class(xu_3.XA, xu_3.JW, DX.NOT_TINTED);
        this.id_native(xu_3.Xp, xu_3.JQ);
        this.id_case(xu_3.XT).id_class(xu_3.Xe).id_byte(xu_3.XV).id_protected(xu_3.Xo).id_throws(xu_3.Xf).id_class(xu_3.JP, xu_3.JS).id_case(xu_3.Xw).id_catch(xu_3.XD);
        this.id_catch(xu_3.Xi);
        this.id_private(xu_3.XR);
        this.id_finally(xu_3.Xx).id_break(xu_3.Xx).id_class(xu_3.Xk);
        this.id_finally(xu_3.Xd).id_break(xu_3.Xd).id_class(xu_3.XW);
        this.id_class(xu_3.XQ, xu_3.Jz, DX.NOT_TINTED);
        this.id_native(xu_3.Xc, xu_3.JN);
        this.id_break(xu_3.Xu, DX.NOT_TINTED);
        this.id_class(rdy_3.ry);
        this.id_class(Do_1.id_class(xu_3.id_break)).id_class((Do_1 do_1) -> {
            rqO_2 rqO_22 = Uh_1.id_byte.id_class(xu_3.id_break, (Do_1)do_1, this.id_break);
            rqO_2 rqO_23 = Uh_1.id_protected.id_class(xu_3.id_break, (Do_1)do_1, this.id_break);
            this.id_class.accept(DG.id_class(xu_3.id_break, rqO_22, rqO_23));
            return rqO_22;
        }).id_case(xu_3.GU).id_throws(xu_3.Pm).id_class(xu_3.Pp).id_catch(xu_3.hk);
        this.id_catch(xu_3.PZ);
        this.id_implements(xu_3.Eu);
        this.id_case(xu_3.BL).id_break(xu_3.hV).id_catch(xu_3.Ba).id_case(xu_3.bS);
        this.id_case(xu_3.BA).id_break(xu_3.hf).id_catch(xu_3.hX).id_case(xu_3.hF);
        this.id_case(xu_3.id_volatile).id_break(xu_3.SF).id_catch(xu_3.Pd).id_case(xu_3.bP);
        this.id_case(xu_3.rV).id_break(xu_3.SL).id_catch(xu_3.hx).id_case(xu_3.hA);
        this.id_case(xu_3.Em).id_break(xu_3.hw).id_catch(xu_3.EF).id_case(xu_3.En);
        this.id_case(xu_3.EZ).id_catch(xu_3.EL).id_case(xu_3.EC);
        this.id_case(xu_3.Ev).id_catch(xu_3.EA).id_case(xu_3.El);
        this.id_protected(xu_3.F, Uk_1.id_this).id_break(xu_3.ho).id_catch(xu_3.Sd).id_case(xu_3.Ga);
        this.id_class(xu_3.bh, Uk_1.id_class(Do_1.id_class(xu_3.F, "_top"))).id_case(xu_3.hC).id_catch(xu_3.hW);
        this.id_class(xu_3.A, Uk_1.id_byte.get(xu_3.F).id_class((Do_1 do_1) -> do_1.id_class(UX.id_implements, Do_1.id_throw(xu_3.A)))).id_case(xu_3.Gi);
        this.id_protected(xu_3.GI, Uk_1.id_this).id_break(xu_3.hI).id_catch(xu_3.GV).id_case(xu_3.bG);
        this.id_class(xu_3.bJ, Uk_1.id_class(Do_1.id_class(xu_3.GI, "_top"))).id_case(xu_3.hv).id_catch(xu_3.hh);
        this.id_class(xu_3.Gj, Uk_1.id_byte.get(xu_3.GI).id_class((Do_1 do_1) -> do_1.id_class(UX.id_implements, Do_1.id_throw(xu_3.Gj)))).id_case(xu_3.bb);
        this.id_case(xu_3.rI).id_break(xu_3.ht).id_catch(xu_3.Be).id_case(xu_3.bB);
        this.id_case(xu_3.SP).id_byte(xu_3.SB).id_break(xu_3.hg).id_catch(xu_3.SS).id_case(xu_3.bs);
        this.id_case(xu_3.bH).id_catch(xu_3.bp).id_case(xu_3.bM);
        this.id_case(xu_3.id_throws).id_break(xu_3.hD).id_catch(xu_3.hm).id_case(xu_3.hT);
        this.id_case(xu_3.id_case).id_catch(xu_3.hJ).id_case(xu_3.hL);
        this.id_case(xu_3.id_byte).id_break(xu_3.hj).id_catch(xu_3.hQ).id_case(xu_3.hH);
        this.id_case(xu_3.id_protected).id_catch(xu_3.hO).id_case(xu_3.hZ);
        this.id_case(xu_3.id_catch).id_break(xu_3.hR).id_catch(xu_3.hN).id_case(xu_3.hy);
        this.id_case(xu_3.id_private).id_catch(xu_3.hu).id_case(xu_3.hq);
        this.id_case(xu_3.bq).id_break(xu_3.hK).id_catch(xu_3.hd).id_case(xu_3.hn);
        this.id_protected(xu_3.sH, Uk_1.id_byte).id_catch(xu_3.sq).id_case(xu_3.bE);
        this.id_class(xu_3.bX, Uk_1.id_class(Do_1.id_class(xu_3.sH, "_bottom"))).id_catch(xu_3.hz).id_case(xu_3.hl);
        this.id_case(xu_3.bR).id_case(xu_3.hp).id_catch(xu_3.hc).id_break(xu_3.hY);
        this.id_protected(xu_3.Ju, Uk_1.id_else).id_break(xu_3.JZ).id_catch(xu_3.Jm).id_case(xu_3.Jv);
        this.id_case(xu_3.JL).id_break(xu_3.JH).id_catch(xu_3.Jl).id_case(xu_3.JC);
        this.id_case(xu_3.JF).id_break(xu_3.Jw).id_throws(xu_3.JT).id_class(xu_3.Jt).id_catch(xu_3.Jp).id_case(xu_3.Jq);
        this.id_new();
        this.id_native(xu_3.Px);
        this.id_volatile(xu_3.o);
        this.id_volatile(xu_3.K);
        this.id_volatile(xu_3.sT);
        this.id_int();
        this.id_final(xu_3.SZ);
        this.id_final(xu_3.bI);
        this.id_final(xu_3.bf);
        this.id_package(xu_3.sc);
        this.id_package(xu_3.su);
        this.id_package(xu_3.sm);
        this.id_extends();
        this.id_native();
        this.id_throws(xu_3.Ps, Uk_1.id_catch);
        this.id_throws(xu_3.Xr, Uk_1.id_catch);
        this.id_throws(xu_3.hi, Uk_1.id_private);
        this.id_package();
        this.x();
        this.id_implements(xu_3.BC, xu_3.BT);
        this.id_implements(xu_3.id_volatile, xu_3.BH);
        this.id_implements(xu_3.Bn, xu_3.Bq);
        this.id_implements(xu_3.BA, xu_3.Bp);
        this.J();
        this.id_implements(xu_3.BL, xu_3.By);
        rkO_2.id_catch().forEach(rkO_22 -> this.id_class((rdb_3)rkO_22, DK.id_break("template_spawn_egg")));
    }

    private DS id_class(rec_3 rec_32, DS dS) {
        switch (rec_32) {
            case DOWN_NORTH: {
                return dS.id_class(Ds_1.id_class, DE.R90);
            }
            case DOWN_SOUTH: {
                return dS.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180);
            }
            case DOWN_WEST: {
                return dS.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270);
            }
            case DOWN_EAST: {
                return dS.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90);
            }
            case UP_NORTH: {
                return dS.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R180);
            }
            case UP_SOUTH: {
                return dS.id_class(Ds_1.id_class, DE.R270);
            }
            case UP_WEST: {
                return dS.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R90);
            }
            case UP_EAST: {
                return dS.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R270);
            }
            case NORTH_UP: {
                return dS;
            }
            case SOUTH_UP: {
                return dS.id_class(Ds_1.id_break, DE.R180);
            }
            case WEST_UP: {
                return dS.id_class(Ds_1.id_break, DE.R270);
            }
            case EAST_UP: {
                return dS.id_class(Ds_1.id_break, DE.R90);
            }
        }
        throw new UnsupportedOperationException("Rotation " + rec_32 + " can't be expressed with existing x and y values");
    }

    private rqO_2 id_class(Integer n, Integer n2) {
        switch (n2) {
            case 0: {
                return this.id_class(n, "", Do_1.id_break(Do_1.id_throw(xu_3.OX)));
            }
            case 1: {
                return this.id_class(n, "slightly_cracked_", Do_1.id_break(Do_1.id_class(xu_3.OX, "_slightly_cracked")));
            }
            case 2: {
                return this.id_class(n, "very_cracked_", Do_1.id_break(Do_1.id_class(xu_3.OX, "_very_cracked")));
            }
        }
        throw new UnsupportedOperationException();
    }

    private rqO_2 id_class(int n, String string, Do_1 do_1) {
        switch (n) {
            case 1: {
                return Uh_1.w.id_class(DK.id_class(string + "turtle_egg"), do_1, this.id_break);
            }
            case 2: {
                return Uh_1.I.id_class(DK.id_class("two_" + string + "turtle_eggs"), do_1, this.id_break);
            }
            case 3: {
                return Uh_1.f.id_class(DK.id_class("three_" + string + "turtle_eggs"), do_1, this.id_break);
            }
            case 4: {
                return Uh_1.j.id_class(DK.id_class("four_" + string + "turtle_eggs"), do_1, this.id_break);
            }
        }
        throw new UnsupportedOperationException();
    }

    private void id_class(xd_3 xd_32, rqO_2 rqO_22, Do_1 do_1) {
        rqO_2 rqO_23 = Uh_1.p.id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_catch, rqO_22, rqO_23)).id_class(DG.id_throws()));
    }

    private void id_class(rdb_3 rdb_32, rqO_2 rqO_22) {
        this.id_break.accept(DK.id_class(rdb_32), new DJ(rqO_22));
    }

    private void id_class(xd_3 xd_32, xd_3 xd_33) {
        this.id_class.accept(DG.id_byte(xd_32, DK.id_class(xd_33)));
    }

    public void id_class(xd_3 xd_32, rqO_2 rqO_22) {
        this.id_break.accept(DK.id_class(xd_32.id_case()), new DJ(rqO_22));
    }

    private void id_class(xd_3 xd_32, UW uW) {
        rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_protected(xd_32, rqO_22));
    }

    private void id_class(xd_3 xd_32, xd_3 xd_33, xd_3 xd_34, xd_3 xd_35, xd_3 xd_36, xd_3 xd_37, xd_3 xd_38, xd_3 xd_39) {
        this.id_class(xd_32, DX.NOT_TINTED);
        this.id_class(xd_33, DX.NOT_TINTED);
        this.id_throws(xd_34);
        this.id_throws(xd_35);
        this.id_break(xd_36, xd_38);
        this.id_break(xd_37, xd_39);
    }

    private void id_class(xd_3 xd_32, UW uW, UW uW2) {
        rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
        rqO_2 rqO_23 = uW2.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_protected(xd_32, rqO_22, rqO_23));
    }

    private static Dp_1 id_class(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22), DS.id_class().id_class(Ds_1.id_byte, rqO_23), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180));
    }

    private void id_class(xd_3 xd_32, DX dX) {
        this.id_break(xd_32);
        this.id_break(xd_32, dX);
    }

    private static DW<rpr_3, rCf_1, rCI, Boolean> id_class(DW<rpr_3, rCf_1, rCI, Boolean> dW, rCf_1 rCf_12, rqO_2 rqO_22, rqO_2 rqO_23) {
        return dW.id_class(rpr_3.EAST, rCf_12, rCI.LEFT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.SOUTH, rCf_12, rCI.LEFT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCf_12, rCI.LEFT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.NORTH, rCf_12, rCI.LEFT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.EAST, rCf_12, rCI.RIGHT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.SOUTH, rCf_12, rCI.RIGHT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCf_12, rCI.RIGHT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.NORTH, rCf_12, rCI.RIGHT, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.EAST, rCf_12, rCI.LEFT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.SOUTH, rCf_12, rCI.LEFT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, rCf_12, rCI.LEFT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCf_12, rCI.LEFT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.EAST, rCf_12, rCI.RIGHT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.SOUTH, rCf_12, rCI.RIGHT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.WEST, rCf_12, rCI.RIGHT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.NORTH, rCf_12, rCI.RIGHT, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180));
    }

    private void id_class(xd_3 xd_32, DX dX, Do_1 do_1) {
        this.id_break(xd_32);
        this.id_break(xd_32, dX, do_1);
    }

    private static Dt_1 id_class(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24, rqO_2 rqO_25) {
        return Dp_1.id_class(xd_32).id_class(DG.id_class(DG.id_class(Dd_1.id_class(rCT.id_strictfp, rCT.G, rCT.f, rCT.id_else), rCf_1.LOWER, rqO_22, rqO_23), rCf_1.UPPER, rqO_24, rqO_25));
    }

    public static Dt_1 id_class(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24) {
        return Dl_1.id_class(xd_32).id_class((DI)DI.id_class().id_class(rCT.id_long, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_switch, zf_3.LOW), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_double, zf_3.LOW), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.r, zf_3.LOW), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.P, zf_3.LOW), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_switch, zf_3.TALL), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_double, zf_3.TALL), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.r, zf_3.TALL), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.P, zf_3.TALL), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true));
    }

    private static Dd_1 id_class(rCN rCN2, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dd_1.id_class(rCN2).id_class((Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23));
    }

    private void id_class(xd_3 xd_32, xd_3 xd_33, DX dX) {
        this.id_class(xd_32, dX);
        Do_1 do_1 = Do_1.id_protected(xd_32);
        rqO_2 rqO_22 = dX.id_break().id_class(xd_33, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xd_33, rqO_22));
    }

    private void id_class(xd_3 xd_32, Do_1 do_1, DD dD) {
        rqO_2 rqO_22 = dD.id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22));
    }

    private DM id_class(xd_3 xd_32, Uk_1 uk_1) {
        return new DM(this, uk_1.id_break()).id_class(xd_32, uk_1.id_class());
    }

    public void id_class(xd_3 xd_32) {
        this.id_byte.accept(xd_32.id_case());
    }

    public void id_class(rdb_3 rdb_32) {
        Uh_1.g.id_class(DK.id_class(rdb_32), Do_1.id_break(rdb_32), this.id_break);
    }

    private static DS[] id_class(rqO_2 rqO_22) {
        return new DS[]{DS.id_class().id_class(Ds_1.id_byte, rqO_22), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270)};
    }

    private DM id_class(Do_1 do_1) {
        return new DM(this, do_1);
    }

    private void id_class(xd_3 xd_32, String string) {
        rdb_3 rdb_32 = xd_32.id_case();
        Uh_1.g.id_class(DK.id_class(rdb_32), Do_1.id_implements(Do_1.id_class(xd_32, string)), this.id_break);
    }

    private rqO_2 id_class(xd_3 xd_32, String string, DD dD, Function<rqO_2, Do_1> function) {
        return dD.id_class(xd_32, string, function.apply(Do_1.id_class(xd_32, string)), this.id_break);
    }

    private void id_default() {
        this.id_break(xu_3.Sr);
        this.id_class.accept(DG.id_break(xu_3.Sr, DK.id_class(xu_3.Sr)));
    }

    private void id_short() {
        rqO_2 rqO_22 = DK.id_class(xu_3.Pu);
        rqO_2 rqO_23 = DK.id_class(xu_3.Pu, "_on");
        this.id_break(xu_3.Pu);
        this.id_class.accept(Dp_1.id_class(xu_3.Pu).id_class(DG.id_class(rCT.id_return, rqO_22, rqO_23)).id_class(Dd_1.id_class(rCT.id_transient, rCT.id_strictfp).id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180)).id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270)).id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180)).id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90)).id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class()).id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90)).id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90)).id_class(rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180)).id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270))));
    }

    private void id_void() {
        this.id_class.accept(DG.id_break(xu_3.bt, DK.id_class(xu_3.bt)));
    }

    private void r() {
        Do_1 do_1 = Do_1.id_else(xu_3.PH);
        Do_1 do_12 = Do_1.id_private(Do_1.id_class(xu_3.PH, "_off"));
        rqO_2 rqO_22 = Uh_1.H.id_class(xu_3.PH, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.H.id_class(xu_3.PH, "_off", do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.PH).id_class(DG.id_class(rCT.id_continue, rqO_22, rqO_23)));
        rqO_2 rqO_24 = Uh_1.y.id_class(xu_3.Py, do_1, this.id_break);
        rqO_2 rqO_25 = Uh_1.y.id_class(xu_3.Py, "_off", do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.Py).id_class(DG.id_class(rCT.id_continue, rqO_24, rqO_25)).id_class(DG.id_protected()));
        this.id_break(xu_3.PH);
        this.id_class(xu_3.Py);
    }

    public static Dt_1 id_break(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24, rqO_2 rqO_25) {
        return Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_protected, true)).id_class(DG.id_byte()).id_class(Dd_1.id_class(rCT.id_new, rCT.id_else).id_class((Boolean)false, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class((Boolean)true, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_25)).id_class((Boolean)false, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((Boolean)true, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24)));
    }

    private void id_break(xd_3 xd_32) {
        rdb_3 rdb_32 = xd_32.id_case();
        if (rdb_32 != rdy_3.id_class) {
            Uh_1.g.id_class(DK.id_class(rdb_32), Do_1.id_instanceof(xd_32), this.id_break);
        }
    }

    private void id_break(xd_3 xd_32, UW uW) {
        rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(DG.id_break()));
    }

    private static Dd_1 id_break() {
        return Dd_1.id_class(rCT.id_strictfp).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, DS.id_class());
    }

    private void id_break(xd_3 xd_32, xd_3 xd_33, DX dX) {
        this.id_break(xd_32, dX);
        this.id_break(xd_33, dX);
    }

    public static Dt_1 id_break(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.R).id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.WEST, rCj_1.BOTTOM, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.WEST, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.WEST, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.TOP, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.TOP, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.TOP, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.TOP, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.TOP, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.TOP, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.TOP, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.TOP, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.TOP, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.TOP, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.TOP, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.TOP, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.TOP, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.TOP, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.TOP, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.TOP, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.EAST, rCj_1.TOP, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.WEST, rCj_1.TOP, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class(rpr_3.SOUTH, rCj_1.TOP, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rpr_3.NORTH, rCj_1.TOP, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)));
    }

    public static Dt_1 id_break(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_return).id_class((Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23))).id_class(Dd_1.id_class(rCT.id_transient, rCT.id_strictfp).id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class()).id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R180)).id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R180)).id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180)).id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R180)));
    }

    private void id_break(xd_3 xd_32, xd_3 xd_33) {
        Uk_1 uk_1 = Uk_1.id_extends.get(xd_32);
        rqO_2 rqO_22 = uk_1.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22));
        rqO_2 rqO_23 = Uh_1.M.id_class(xd_33, uk_1.id_break(), this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_33, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(DG.id_break()));
        this.id_break(xd_32);
    }

    private void id_break(UW uW, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
            this.id_class.accept(Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(DG.id_byte()));
        }
    }

    private static Dp_1 id_break(xd_3 xd_32, rqO_2 rqO_22) {
        return Dp_1.id_class(xd_32, DG.id_class(rqO_22));
    }

    private void id_break(xd_3 xd_32, DX dX) {
        Do_1 do_1 = Do_1.id_byte(xd_32);
        this.id_break(xd_32, dX, do_1);
    }

    private void id_break(xd_3 xd_32, DX dX, Do_1 do_1) {
        rqO_2 rqO_22 = dX.id_class().id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22));
    }

    private void id_throws(xd_3 xd_32) {
        this.id_byte(xd_32, Uk_1.id_class);
    }

    public static Dt_1 id_throws(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_return, rqO_23, rqO_22));
    }

    private void id_throws(xd_3 xd_32, UW uW) {
        rqO_2 rqO_22 = uW.id_class(xd_32, this.id_break);
        rqO_2 rqO_23 = Do_1.id_class(xd_32, "_front_on");
        rqO_2 rqO_24 = uW.get(xd_32).id_class((Do_1 do_1) -> do_1.id_class(UX.id_catch, rqO_23)).id_class(xd_32, "_on", this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_continue, rqO_24, rqO_22)).id_class(DG.id_break()));
    }

    private void id_throws(xd_3 xd_32, xd_3 xd_33) {
        this.id_byte(xd_32, Uk_1.id_class);
        rqO_2 rqO_22 = Uk_1.id_implements.get(xd_32).id_class(xd_33, this.id_break);
        this.id_class.accept(DG.id_byte(xd_33, rqO_22));
    }

    private static Dd_1 id_throws() {
        return Dd_1.id_class(rCT.id_default).id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_class, DE.R90)).id_class(rpr_3.UP, DS.id_class().id_class(Ds_1.id_class, DE.R270)).id_class(rpr_3.NORTH, DS.id_class()).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90));
    }

    public static Dt_1 id_throws(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.g).id_class(rCo_1.BOTTOM, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rCo_1.TOP, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rCo_1.DOUBLE, DS.id_class().id_class(Ds_1.id_byte, rqO_24)));
    }

    private void id_throws(xd_3 xd_32, rqO_2 rqO_22) {
        this.id_class.accept(DG.id_protected(xd_32, rqO_22));
    }

    private void M() {
        this.id_break(xu_3.Sz);
        this.id_class.accept(Dp_1.id_class(xu_3.Sz).id_class(Dd_1.id_class(rCT.id_class, rCT.id_return).id_class((T1 bl, T2 bl2) -> DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.Sz, (bl != false ? "_attached" : "") + (bl2 != false ? "_on" : ""))))).id_class(DG.id_break()));
    }

    private void P() {
        this.id_class(rdy_3.Or);
        this.id_class.accept(Dp_1.id_class(xu_3.BS).id_class(Dd_1.id_class(rCT.Q, rCT.id_super, rCT.id_return).id_class((T1 n, T2 bl, T3 bl2) -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('_').append(n).append("tick");
            if (bl2.booleanValue()) {
                stringBuilder.append("_on");
            }
            if (bl.booleanValue()) {
                stringBuilder.append("_locked");
            }
            return DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.BS, stringBuilder.toString()));
        })).id_class(DG.id_byte()));
    }

    private void id_finally(xd_3 xd_32, xd_3 xd_33) {
        Do_1 do_1 = Do_1.id_else(xd_32);
        this.id_class.accept(DG.id_byte(xd_32, Uh_1.H.id_class(xd_32, do_1, this.id_break)));
        this.id_class.accept(Dp_1.id_class(xd_33, DS.id_class().id_class(Ds_1.id_byte, Uh_1.y.id_class(xd_33, do_1, this.id_break))).id_class(DG.id_protected()));
        this.id_break(xd_32);
        this.id_class(xd_33);
    }

    private Dh_1 id_finally(xd_3 xd_32) {
        return new Dh_1(this, Do_1.id_native(xd_32));
    }

    private Dd_1 id_finally() {
        return Dd_1.id_class(rCT.id_default).id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_class, DE.R180)).id_class(rpr_3.UP, DS.id_class()).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90)).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90));
    }

    private void id_catch(xd_3 xd_32, xd_3 xd_33) {
        Do_1 do_1 = new Do_1().id_class(UX.id_protected, Do_1.id_class(xd_33, "_top")).id_class(UX.id_implements, Do_1.id_throw(xd_32));
        this.id_class(xd_32, do_1, Uh_1.id_throws);
    }

    private void id_catch(xd_3 xd_32) {
        Do_1 do_1 = Do_1.id_int(xd_32);
        rqO_2 rqO_22 = Uh_1.id_package.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_int.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_24 = Uh_1.id_new.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_25 = Uh_1.id_continue.id_class(xd_32, do_1, this.id_break);
        this.id_class(xd_32.id_case());
        this.id_class.accept(DG.id_class(xd_32, rqO_22, rqO_23, rqO_24, rqO_25));
    }

    private void id_catch() {
        this.id_class(xu_3.Gr, "_front");
        rqO_2 rqO_22 = DK.id_class(xu_3.Gr, "_top");
        rqO_2 rqO_23 = this.id_class(xu_3.Gr, "_bottom", DX.NOT_TINTED.id_class(), Do_1::id_byte);
        this.id_case(xu_3.Gr, rqO_22, rqO_23);
    }

    private void G() {
        this.id_class(rdy_3.WQ);
        this.id_class.accept(Dp_1.id_class(xu_3.XJ).id_class(Dd_1.id_class(rCT.J).id_class((T1 n) -> DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.XJ, "_stage" + n, Uh_1.id_double, Do_1::id_byte)))));
    }

    private void O() {
        this.id_class(rdy_3.bq);
        this.id_class.accept(Dp_1.id_class(xu_3.OX).id_class(Dd_1.id_class(rCT.c, rCT.u).id_break((T1 n, T2 n2) -> Arrays.asList(DG.id_class(this.id_class((Integer)n, (Integer)n2))))));
    }

    private void id_extends(xd_3 xd_32, xd_3 xd_33) {
        Uh_1.K.id_class(DK.id_class(xd_32.id_case()), Do_1.id_new(xd_33), this.id_break);
    }

    private void id_extends(xd_3 xd_32) {
        this.id_class(xd_32, xd_32);
    }

    private void id_extends() {
        rqO_2 rqO_22 = Do_1.id_class(xu_3.ha, "_top_open");
        this.id_class.accept(Dp_1.id_class(xu_3.ha).id_class(this.id_finally()).id_class(Dd_1.id_class(rCT.id_else).id_class((Boolean)false, DS.id_class().id_class(Ds_1.id_byte, Uk_1.id_throws.id_class(xu_3.ha, this.id_break))).id_class((Boolean)true, DS.id_class().id_class(Ds_1.id_byte, Uk_1.id_throws.get(xu_3.ha).id_class((Do_1 do_1) -> do_1.id_class(UX.id_case, rqO_22)).id_class(xu_3.ha, "_open", this.id_break)))));
    }

    private void id_goto(xd_3 xd_32) {
        this.id_byte(xd_32, Uk_1.id_native);
        Uh_1.o.id_class(DK.id_class(xd_32.id_case()), Do_1.id_new(xd_32), this.id_break);
    }

    private void id_goto() {
        rqO_2 rqO_22 = DK.id_class(xu_3.SO);
        rqO_2 rqO_23 = DK.id_class(xu_3.SO, "_filled");
        this.id_class.accept(Dp_1.id_class(xu_3.SO).id_class(Dd_1.id_class(rCT.id_private).id_class((Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_23))).id_class(DG.id_byte()));
    }

    private void id_case(xd_3 xd_32, rqO_2 rqO_22) {
        rqO_2 rqO_23 = Uh_1.id_abstract.id_class(xd_32, Do_1.id_catch(rqO_22), this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_23));
    }

    private DM id_case(xd_3 xd_32) {
        return this.id_protected(xd_32, Uk_1.id_class);
    }

    private void id_case(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.G).id_class(rCf_1.LOWER, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rCf_1.UPPER, DS.id_class().id_class(Ds_1.id_byte, rqO_22))));
    }

    private void id_case(xd_3 xd_32, xd_3 xd_33) {
        this.id_throws(xd_32);
        Do_1 do_1 = Do_1.id_break(xd_32, xd_33);
        rqO_2 rqO_22 = Uh_1.d.id_class(xd_33, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.k.id_class(xd_33, do_1, this.id_break);
        rqO_2 rqO_24 = Uh_1.W.id_class(xd_33, do_1, this.id_break);
        rqO_2 rqO_25 = Uh_1.J.id_class(xd_33, do_1, this.id_break);
        rqO_2 rqO_26 = Uh_1.x.id_class(xd_33, do_1, this.id_break);
        rdb_3 rdb_32 = xd_33.id_case();
        Uh_1.g.id_class(DK.id_class(rdb_32), Do_1.id_instanceof(xd_32), this.id_break);
        this.id_class.accept(Dl_1.id_class(xd_33).id_class(DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class((DI)DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class((DI)DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_void, false), DS.id_class().id_class(Ds_1.id_byte, rqO_25)).id_class((DI)DI.id_class().id_class(rCT.id_static, false), DS.id_class().id_class(Ds_1.id_byte, rqO_26)).id_class((DI)DI.id_class().id_class(rCT.id_import, false), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R270)));
    }

    private static Dd_1 id_case() {
        return Dd_1.id_class(rCT.id_abstract).id_class(rpB_2.Y, DS.id_class()).id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_class, DE.R90)).id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90));
    }

    private void id_const() {
        this.id_class.accept(Dp_1.id_class(xu_3.Pi).id_class(Dd_1.id_class(rCT.id_char).id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Pi, "_ns"))).id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Pi, "_ew")))));
    }

    private void id_continue() {
        this.id_class(rdy_3.Jp);
        this.id_class.accept(Dl_1.id_class(xu_3.SG).id_class(DS.id_class().id_class(Ds_1.id_byte, Do_1.id_throw(xu_3.SG))).id_class((DI)DI.id_class().id_class(rCT.id_extends, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle0"))).id_class((DI)DI.id_class().id_class(rCT.id_native, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle1"))).id_class((DI)DI.id_class().id_class(rCT.id_volatile, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle2"))).id_class((DI)DI.id_class().id_class(rCT.id_extends, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty0"))).id_class((DI)DI.id_class().id_class(rCT.id_native, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty1"))).id_class((DI)DI.id_class().id_class(rCT.id_volatile, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty2"))));
    }

    private void id_continue(xd_3 xd_32) {
        Do_1 do_1 = new Do_1().id_class(UX.id_throws, Do_1.id_throw(xu_3.PR)).id_class(UX.id_case, Do_1.id_throw(xd_32)).id_class(UX.id_implements, Do_1.id_class(xd_32, "_side"));
        this.id_class.accept(DG.id_byte(xd_32, Uh_1.id_private.id_class(xd_32, do_1, this.id_break)));
    }

    private void id_else() {
        Do_1 do_1 = new Do_1().id_class(UX.id_byte, Do_1.id_class(xu_3.XE, "_front")).id_class(UX.id_package, Do_1.id_class(xu_3.XE, "_bottom")).id_class(UX.id_final, Do_1.id_class(xu_3.XE, "_top")).id_class(UX.id_finally, Do_1.id_class(xu_3.XE, "_front")).id_class(UX.id_extends, Do_1.id_class(xu_3.XE, "_front")).id_class(UX.id_native, Do_1.id_class(xu_3.XE, "_side")).id_class(UX.id_volatile, Do_1.id_class(xu_3.XE, "_side"));
        this.id_class.accept(DG.id_byte(xu_3.XE, Uh_1.id_class.id_class(xu_3.XE, do_1, this.id_break)));
    }

    private List<rqO_2> id_else(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.v.id_class(DK.id_class(xd_32, "_side0"), Do_1.id_continue(xd_32), this.id_break);
        rqO_2 rqO_23 = Uh_1.v.id_class(DK.id_class(xd_32, "_side1"), Do_1.id_super(xd_32), this.id_break);
        rqO_2 rqO_24 = Uh_1.F.id_class(DK.id_class(xd_32, "_side_alt0"), Do_1.id_continue(xd_32), this.id_break);
        rqO_2 rqO_25 = Uh_1.F.id_class(DK.id_class(xd_32, "_side_alt1"), Do_1.id_super(xd_32), this.id_break);
        return ImmutableList.of((Object)rqO_22, (Object)rqO_23, (Object)rqO_24, (Object)rqO_25);
    }

    private void id_for() {
        Do_1 do_1 = new Do_1().id_class(UX.id_abstract, Do_1.id_class(xu_3.rB, "_top")).id_class(UX.id_implements, Do_1.id_class(xu_3.rB, "_side"));
        Do_1 do_12 = do_1.id_break(UX.id_char, Do_1.id_class(xu_3.rB, "_top_sticky"));
        Do_1 do_13 = do_1.id_break(UX.id_char, Do_1.id_class(xu_3.rB, "_top"));
        this.id_class.accept(Dp_1.id_class(xu_3.rS).id_class(Dd_1.id_class(rCT.id_public, rCT.V).id_class((Boolean)false, rCg_1.DEFAULT, DS.id_class().id_class(Ds_1.id_byte, Uh_1.q.id_class(xu_3.rB, "_head", do_13, this.id_break))).id_class((Boolean)false, rCg_1.STICKY, DS.id_class().id_class(Ds_1.id_byte, Uh_1.q.id_class(xu_3.rB, "_head_sticky", do_12, this.id_break))).id_class((Boolean)true, rCg_1.DEFAULT, DS.id_class().id_class(Ds_1.id_byte, Uh_1.T.id_class(xu_3.rB, "_head_short", do_13, this.id_break))).id_class((Boolean)true, rCg_1.STICKY, DS.id_class().id_class(Ds_1.id_byte, Uh_1.T.id_class(xu_3.rB, "_head_short_sticky", do_12, this.id_break)))).id_class(DG.id_throws()));
    }

    private void id_implements() {
        this.id_class(xu_3.hs);
        this.id_class.accept(Dl_1.id_class(xu_3.hs).id_class((DI)DI.id_class().id_class(rCT.h, 0), this.id_class(0)).id_class((DI)DI.id_class().id_class(rCT.h, 1), this.id_class(1)).id_class((DI)DI.id_class().id_class(rCT.o, rCy_1.SMALL), DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, "_small_leaves"))).id_class((DI)DI.id_class().id_class(rCT.o, rCy_1.LARGE), DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, "_large_leaves"))));
    }

    private void id_implements(xd_3 xd_32, xd_3 xd_33) {
        rqO_2 rqO_22 = DK.id_class(xd_32);
        this.id_class.accept(Dp_1.id_class(xd_33, DS.id_class().id_class(Ds_1.id_byte, rqO_22)));
        this.id_class(xd_33, rqO_22);
    }

    private void id_implements(xd_3 xd_32) {
        Do_1 do_1 = Do_1.id_break(xd_32);
        rqO_2 rqO_22 = Uh_1.id_default.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_const.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_24 = Uh_1.id_strictfp.id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(DG.id_protected(xd_32, rqO_22, rqO_23, rqO_24));
        this.id_class(xd_32, rqO_23);
    }

    private void id_import() {
        rqO_2 rqO_22 = DK.id_class(xu_3.Bf, "_post_ends");
        rqO_2 rqO_23 = DK.id_class(xu_3.Bf, "_post");
        rqO_2 rqO_24 = DK.id_class(xu_3.Bf, "_cap");
        rqO_2 rqO_25 = DK.id_class(xu_3.Bf, "_cap_alt");
        rqO_2 rqO_26 = DK.id_class(xu_3.Bf, "_side");
        rqO_2 rqO_27 = DK.id_class(xu_3.Bf, "_side_alt");
        this.id_class.accept(Dl_1.id_class(xu_3.Bf).id_class(DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class((DI)DI.id_class().id_class(rCT.id_void, true).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class((DI)DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, true).id_class(rCT.id_import, false).id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, true).id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_25)).id_class((DI)DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, rqO_26)).id_class((DI)DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, rqO_27)).id_class((DI)DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_27).id_class(Ds_1.id_break, DE.R90)));
        this.id_break(xu_3.Bf);
    }

    private void id_instanceof() {
        rqO_2 rqO_22 = Do_1.id_class(xu_3.sA, "_side");
        Do_1 do_1 = new Do_1().id_class(UX.id_case, Do_1.id_class(xu_3.sA, "_top")).id_class(UX.id_implements, rqO_22);
        Do_1 do_12 = new Do_1().id_class(UX.id_case, Do_1.id_class(xu_3.sA, "_inverted_top")).id_class(UX.id_implements, rqO_22);
        this.id_class.accept(Dp_1.id_class(xu_3.sA).id_class(Dd_1.id_class(rCT.id_int).id_class((Boolean)false, DS.id_class().id_class(Ds_1.id_byte, Uh_1.X.id_class(xu_3.sA, do_1, this.id_break))).id_class((Boolean)true, DS.id_class().id_class(Ds_1.id_byte, Uh_1.X.id_class(DK.id_class(xu_3.sA, "_inverted"), do_12, this.id_break)))));
    }

    private void id_new() {
        Do_1 do_1 = Do_1.id_class(xu_3.bO);
        Do_1 do_12 = Do_1.id_class(Do_1.id_class(xu_3.Ge, "_side"), do_1.id_class(UX.id_case));
        rqO_2 rqO_22 = Uh_1.id_long.id_class(xu_3.Ge, do_12, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_float.id_class(xu_3.Ge, do_12, this.id_break);
        rqO_2 rqO_24 = Uh_1.id_throws.id_break(xu_3.Ge, "_double", do_12, this.id_break);
        this.id_class.accept(DG.id_throws(xu_3.Ge, rqO_22, rqO_23, rqO_24));
        this.id_class.accept(DG.id_byte(xu_3.bO, Uh_1.id_byte.id_class(xu_3.bO, do_1, this.id_break)));
    }

    private void id_new(xd_3 xd_32) {
        Do_1 do_1 = new Do_1().id_class(UX.id_case, Do_1.id_class(xu_3.Ps, "_top")).id_class(UX.id_implements, Do_1.id_class(xu_3.Ps, "_side")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front"));
        Do_1 do_12 = new Do_1().id_class(UX.id_implements, Do_1.id_class(xu_3.Ps, "_top")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front_vertical"));
        rqO_2 rqO_22 = Uh_1.id_implements.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_extends.id_class(xd_32, do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_default).id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R180)).id_class(rpr_3.UP, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270))));
    }

    private void id_package(xd_3 xd_32) {
        rqO_2 rqO_22 = Uk_1.id_volatile.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22).id_class(DG.id_byte()));
    }

    private void id_package() {
        this.id_class(rdy_3.hD);
        this.id_class.accept(Dl_1.id_class(xu_3.ra).id_class(DI.id_class(DI.id_class().id_class(rCT.S, rCY.NONE).id_class(rCT.B, rCY.NONE).id_class(rCT.s, rCY.NONE).id_class(rCT.E, rCY.NONE), DI.id_class().id_class(rCT.S, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}).id_class(rCT.B, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DI.id_class().id_class(rCT.B, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}).id_class(rCT.s, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DI.id_class().id_class(rCT.s, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}).id_class(rCT.E, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DI.id_class().id_class(rCT.E, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}).id_class(rCT.S, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP})), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_dot"))).id_class((DI)DI.id_class().id_class(rCT.S, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side0"))).id_class((DI)DI.id_class().id_class(rCT.s, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side_alt0"))).id_class((DI)DI.id_class().id_class(rCT.B, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side_alt1")).id_class(Ds_1.id_break, DE.R270)).id_class((DI)DI.id_class().id_class(rCT.E, (Comparable)((Object)rCY.SIDE), (Comparable[])new rCY[]{rCY.UP}), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side1")).id_class(Ds_1.id_break, DE.R270)).id_class((DI)DI.id_class().id_class(rCT.S, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up"))).id_class((DI)DI.id_class().id_class(rCT.B, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R90)).id_class((DI)DI.id_class().id_class(rCT.s, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R180)).id_class((DI)DI.id_class().id_class(rCT.E, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R270)));
    }

    private void id_return(xd_3 xd_32) {
        rqO_2 rqO_22 = Uk_1.id_package.id_class(xd_32, this.id_break);
        rqO_2 rqO_23 = Uk_1.id_int.id_class(xd_32, this.id_break);
        this.id_class(xd_32.id_case());
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_finally, rqO_23, rqO_22)));
    }

    private void id_return() {
        this.id_class(rdy_3.Jq);
        this.id_class.accept(Dp_1.id_class(xu_3.Sb).id_class(Dd_1.id_class(rCT.Z).id_class((Integer)0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb))).id_class((Integer)1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level1"))).id_class((Integer)2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level2"))).id_class((Integer)3, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level3")))));
    }

    private void id_super() {
        this.id_class(rdy_3.Xo);
        this.id_class.accept(Dp_1.id_class(xu_3.BB).id_class(Dd_1.id_class(rCT.z).id_class((Integer)0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB))).id_class((Integer)1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice1"))).id_class((Integer)2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice2"))).id_class((Integer)3, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice3"))).id_class((Integer)4, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice4"))).id_class((Integer)5, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice5"))).id_class((Integer)6, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice6")))));
    }

    private void id_super(xd_3 xd_32) {
        this.id_class.accept(Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xd_32))).id_class(this.id_finally()));
    }

    private void id_switch() {
        rqO_2 rqO_22 = Uk_1.id_class.id_class(xu_3.SJ, this.id_break);
        rqO_2 rqO_23 = this.id_class(xu_3.SJ, "_on", Uh_1.id_byte, Do_1::id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.SJ).id_class(DG.id_class(rCT.id_continue, rqO_23, rqO_22)));
    }

    private void id_throw() {
        Do_1 do_1 = new Do_1().id_class(UX.id_instanceof, Do_1.id_throw(xu_3.id_finally)).id_class(UX.id_case, Do_1.id_throw(xu_3.PS));
        Do_1 do_12 = new Do_1().id_class(UX.id_instanceof, Do_1.id_throw(xu_3.id_finally)).id_class(UX.id_case, Do_1.id_class(xu_3.PS, "_moist"));
        rqO_2 rqO_22 = Uh_1.m.id_class(xu_3.PS, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.m.id_class(Do_1.id_class(xu_3.PS, "_moist"), do_12, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.PS).id_class(DG.id_class(rCT.n, 7, rqO_23, rqO_22)));
    }

    private void id_try() {
        this.id_class.accept(Dl_1.id_class(xu_3.JG).id_class(DS.id_class().id_class(Ds_1.id_byte, Do_1.id_throw(xu_3.JG))).id_class((DI)DI.id_class().id_class(rCT.v, 1), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents1"))).id_class((DI)DI.id_class().id_class(rCT.v, 2), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents2"))).id_class((DI)DI.id_class().id_class(rCT.v, 3), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents3"))).id_class((DI)DI.id_class().id_class(rCT.v, 4), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents4"))).id_class((DI)DI.id_class().id_class(rCT.v, 5), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents5"))).id_class((DI)DI.id_class().id_class(rCT.v, 6), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents6"))).id_class((DI)DI.id_class().id_class(rCT.v, 7), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents7"))).id_class((DI)DI.id_class().id_class(rCT.v, 8), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents_ready"))));
    }

    private void id_while() {
        rqO_2 rqO_22 = DK.id_class(xu_3.bC, "_side");
        rqO_2 rqO_23 = DK.id_class(xu_3.bC, "_noside");
        rqO_2 rqO_24 = DK.id_class(xu_3.bC, "_noside1");
        rqO_2 rqO_25 = DK.id_class(xu_3.bC, "_noside2");
        rqO_2 rqO_26 = DK.id_class(xu_3.bC, "_noside3");
        this.id_class.accept(Dl_1.id_class(xu_3.bC).id_class((DI)DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class((DI)DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_long, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_float, true), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_void, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2), DS.id_class().id_class(Ds_1.id_byte, rqO_24), DS.id_class().id_class(Ds_1.id_byte, rqO_25), DS.id_class().id_class(Ds_1.id_byte, rqO_26)).id_class((DI)DI.id_class().id_class(rCT.id_static, false), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_import, false), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_long, false), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)).id_class((DI)DI.id_class().id_class(rCT.id_float, false), DS.id_class().id_class(Ds_1.id_byte, rqO_26).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true), DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)));
    }

    private void id_static() {
        rqO_2 rqO_22 = DK.id_class(xu_3.sl);
        rqO_2 rqO_23 = DK.id_class(xu_3.sl, "_side");
        this.id_class(rdy_3.sz);
        this.id_class.accept(Dp_1.id_class(xu_3.sl).id_class(Dd_1.id_class(rCT.id_const).id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270))));
    }

    private void id_public() {
        Do_1 do_1 = Do_1.id_break(xu_3.bl);
        rqO_2 rqO_23 = Uh_1.h.id_class(xu_3.bl, do_1, this.id_break);
        rqO_2 rqO_24 = this.id_class(xu_3.bl, "_dead", Uh_1.h, (rqO_2 rqO_22) -> do_1.id_break(UX.id_break, (rqO_2)rqO_22));
        this.id_class.accept(Dp_1.id_class(xu_3.bl).id_class(DG.id_class(rCT.x, 5, rqO_24, rqO_23)));
    }

    private void id_public(xd_3 xd_32) {
        this.id_class.accept(Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xd_32))).id_class(DG.id_break()));
    }

    private static Dt_1 id_protected(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23, rqO_2 rqO_24) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.id_else).id_class(rpr_3.NORTH, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.EAST, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.WEST, rCj_1.BOTTOM, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.NORTH, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.SOUTH, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.EAST, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.WEST, rCj_1.TOP, (Boolean)false, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.NORTH, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.SOUTH, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCj_1.BOTTOM, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.SOUTH, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCj_1.TOP, (Boolean)true, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270)));
    }

    private static Dd_1 id_protected() {
        return Dd_1.id_class(rCT.id_strictfp).id_class(rpr_3.EAST, DS.id_class()).id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R270));
    }

    public static Dt_1 id_protected(xd_3 xd_32, rqO_2 rqO_22, rqO_2 rqO_23) {
        return Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.id_abstract).id_class(rpB_2.Y, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R90)).id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90)));
    }

    private DM id_protected(xd_3 xd_32, UW uW) {
        Uk_1 uk_1 = uW.get(xd_32);
        return new DM(this, uk_1.id_break()).id_class(xd_32, uk_1.id_class());
    }

    private DO id_protected(xd_3 xd_32, xd_3 xd_33) {
        return new DO(this, DK.id_class(xd_32), xd_33);
    }

    private void id_protected(xd_3 xd_32) {
        rqO_2 rqO_22 = Uk_1.id_class.id_class(xd_32, this.id_break);
        this.id_class.accept(DG.id_break(xd_32, rqO_22));
    }

    public static Dt_1 id_protected(xd_3 xd_32, rqO_2 rqO_22) {
        return Dp_1.id_class(xd_32, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(DG.id_case());
    }

    private void id_private(xd_3 xd_32, xd_3 xd_33) {
        Do_1 do_1 = Do_1.id_break(xd_33);
        rqO_2 rqO_22 = Uh_1.id_interface.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_char.id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.H, 1, rqO_23, rqO_22)));
    }

    private void id_private(xd_3 xd_32) {
        Do_1 do_1 = Do_1.id_break(xd_32);
        rqO_2 rqO_22 = Uh_1.id_boolean.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.id_transient.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_24 = Uh_1.id_for.id_class(xd_32, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xd_32, rqO_22, rqO_23, rqO_24));
        this.id_class(xd_32, rqO_23);
    }

    private void id_private() {
        rqO_2 rqO_22 = this.id_class(xu_3.rP, "_top", Uh_1.t, Do_1::id_class);
        rqO_2 rqO_23 = this.id_class(xu_3.rP, "_bottom", Uh_1.t, Do_1::id_class);
        this.id_case(xu_3.rP, rqO_22, rqO_23);
    }

    private void id_abstract() {
        this.id_class.accept(Dp_1.id_class(xu_3.bj).id_class(Dd_1.id_class(rCT.J).id_class((Integer)0, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_0", Uh_1.id_byte, Do_1::id_break))).id_class((Integer)1, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_1", Uh_1.id_byte, Do_1::id_break))).id_class((Integer)2, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_2", Uh_1.id_byte, Do_1::id_break))).id_class((Integer)3, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_3", Uh_1.id_byte, Do_1::id_break)))));
    }

    private void id_final() {
        Do_1 do_1 = Do_1.id_class(Do_1.id_throw(xu_3.rj), Do_1.id_throw(xu_3.id_final));
        rqO_2 rqO_22 = Uh_1.id_throws.id_class(xu_3.rj, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xu_3.rj, rqO_22));
    }

    private void id_final(xd_3 xd_32) {
        Do_1 do_1 = Do_1.id_synchronized(xd_32);
        rqO_2 rqO_23 = Uh_1.z.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_24 = this.id_class(xd_32, "_conditional", Uh_1.z, (rqO_2 rqO_22) -> do_1.id_break(UX.id_implements, (rqO_2)rqO_22));
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(DG.id_class(rCT.id_byte, rqO_24, rqO_23)).id_class(DG.id_throws()));
    }

    private void id_transient() {
        Do_1 do_1 = new Do_1().id_class(UX.id_throws, Do_1.id_class(xu_3.rB, "_bottom")).id_class(UX.id_implements, Do_1.id_class(xu_3.rB, "_side"));
        rqO_2 rqO_22 = Do_1.id_class(xu_3.rB, "_top_sticky");
        rqO_2 rqO_23 = Do_1.id_class(xu_3.rB, "_top");
        Do_1 do_12 = do_1.id_break(UX.id_char, rqO_22);
        Do_1 do_13 = do_1.id_break(UX.id_char, rqO_23);
        rqO_2 rqO_24 = DK.id_class(xu_3.rB, "_base");
        this.id_class(xu_3.rB, rqO_24, do_13);
        this.id_class(xu_3.D, rqO_24, do_12);
        rqO_2 rqO_25 = Uh_1.id_private.id_class(xu_3.rB, "_inventory", do_1.id_break(UX.id_case, rqO_23), this.id_break);
        rqO_2 rqO_26 = Uh_1.id_private.id_class(xu_3.D, "_inventory", do_1.id_break(UX.id_case, rqO_22), this.id_break);
        this.id_class(xu_3.rB, rqO_25);
        this.id_class(xu_3.D, rqO_26);
    }

    private void id_volatile(xd_3 xd_32) {
        rqO_2 rqO_22 = this.id_class(xd_32, "", Uh_1.B, Do_1::id_throws);
        rqO_2 rqO_23 = this.id_class(xd_32, "", Uh_1.s, Do_1::id_throws);
        rqO_2 rqO_24 = this.id_class(xd_32, "", Uh_1.E, Do_1::id_throws);
        rqO_2 rqO_25 = this.id_class(xd_32, "_on", Uh_1.B, Do_1::id_throws);
        rqO_2 rqO_26 = this.id_class(xd_32, "_on", Uh_1.s, Do_1::id_throws);
        rqO_2 rqO_27 = this.id_class(xd_32, "_on", Uh_1.E, Do_1::id_throws);
        Dd_1 dd_1 = Dd_1.id_class(rCT.id_return, rCT.O).id_class((T1 bl, T2 rCR2) -> {
            switch (rCR2) {
                case NORTH_SOUTH: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_25 : rqO_22);
                }
                case EAST_WEST: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_25 : rqO_22).id_class(Ds_1.id_break, DE.R90);
                }
                case ASCENDING_EAST: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_26 : rqO_23).id_class(Ds_1.id_break, DE.R90);
                }
                case ASCENDING_WEST: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_27 : rqO_24).id_class(Ds_1.id_break, DE.R90);
                }
                case ASCENDING_NORTH: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_26 : rqO_23);
                }
                case ASCENDING_SOUTH: {
                    return DS.id_class().id_class(Ds_1.id_byte, bl != false ? rqO_27 : rqO_24);
                }
            }
            throw new UnsupportedOperationException("Fix you generator!");
        });
        this.id_break(xd_32);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(dd_1));
    }

    private void id_volatile() {
        this.id_class.accept(Dp_1.id_class(xu_3.XS, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.XS))).id_class(Dd_1.id_class(rCT.id_transient, rCT.id_strictfp).id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class()).id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90)).id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180)).id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270)).id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90)).id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90)).id_class(rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180)).id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270)).id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180)).id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90)).id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180)).id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270))));
    }

    private List<rqO_2> id_synchronized(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.L.id_class(DK.id_class(xd_32, "_up0"), Do_1.id_continue(xd_32), this.id_break);
        rqO_2 rqO_23 = Uh_1.L.id_class(DK.id_class(xd_32, "_up1"), Do_1.id_super(xd_32), this.id_break);
        rqO_2 rqO_24 = Uh_1.A.id_class(DK.id_class(xd_32, "_up_alt0"), Do_1.id_continue(xd_32), this.id_break);
        rqO_2 rqO_25 = Uh_1.A.id_class(DK.id_class(xd_32, "_up_alt1"), Do_1.id_super(xd_32), this.id_break);
        return ImmutableList.of((Object)rqO_22, (Object)rqO_23, (Object)rqO_24, (Object)rqO_25);
    }

    private void id_synchronized() {
        Do_1 do_1 = Do_1.id_finally(xu_3.Pg);
        this.id_class.accept(DG.id_byte(xu_3.Pg, DK.id_class(xu_3.Pg)));
        this.id_class(xu_3.Br, do_1);
        this.id_class(xu_3.BP, do_1);
    }

    private void id_native(xd_3 xd_32) {
        Do_1 do_1 = Do_1.id_throws(xd_32);
        Do_1 do_12 = Do_1.id_throws(Do_1.id_class(xd_32, "_corner"));
        rqO_2 rqO_22 = Uh_1.B.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_23 = Uh_1.S.id_class(xd_32, do_12, this.id_break);
        rqO_2 rqO_24 = Uh_1.s.id_class(xd_32, do_1, this.id_break);
        rqO_2 rqO_25 = Uh_1.E.id_class(xd_32, do_1, this.id_break);
        this.id_break(xd_32);
        this.id_class.accept(Dp_1.id_class(xd_32).id_class(Dd_1.id_class(rCT.M).id_class(rCR.NORTH_SOUTH, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rCR.EAST_WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rCR.ASCENDING_EAST, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class(rCR.ASCENDING_WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R90)).id_class(rCR.ASCENDING_NORTH, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rCR.ASCENDING_SOUTH, DS.id_class().id_class(Ds_1.id_byte, rqO_25)).id_class(rCR.SOUTH_EAST, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rCR.SOUTH_WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rCR.NORTH_WEST, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rCR.NORTH_EAST, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270))));
    }

    private void id_native(xd_3 xd_32, xd_3 xd_33) {
        this.id_class(xd_32, DX.NOT_TINTED);
        Do_1 do_1 = Do_1.id_protected(Do_1.id_class(xd_32, "_pot"));
        rqO_2 rqO_22 = DX.NOT_TINTED.id_break().id_class(xd_33, do_1, this.id_break);
        this.id_class.accept(DG.id_byte(xd_33, rqO_22));
    }

    private void id_native() {
        rqO_2 rqO_22 = DK.id_class(xu_3.Xb, "_floor");
        rqO_2 rqO_23 = DK.id_class(xu_3.Xb, "_ceiling");
        rqO_2 rqO_24 = DK.id_class(xu_3.Xb, "_wall");
        rqO_2 rqO_25 = DK.id_class(xu_3.Xb, "_between_walls");
        this.id_class(rdy_3.Wk);
        this.id_class.accept(Dp_1.id_class(xu_3.Xb).id_class(Dd_1.id_class(rCT.id_strictfp, rCT.id_for).id_class(rpr_3.NORTH, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, rqO_22)).id_class(rpr_3.SOUTH, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, rqO_23)).id_class(rpr_3.SOUTH, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.EAST, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.WEST, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, rqO_23).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.NORTH, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.SOUTH, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.EAST, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_24)).id_class(rpr_3.WEST, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_24).id_class(Ds_1.id_break, DE.R180)).id_class(rpr_3.SOUTH, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R90)).id_class(rpr_3.NORTH, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R270)).id_class(rpr_3.EAST, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_25)).id_class(rpr_3.WEST, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, rqO_25).id_class(Ds_1.id_break, DE.R180))));
    }

    private void id_strictfp() {
        rqO_2 rqO_22 = Uk_1.id_class.id_class(xu_3.PR, this.id_break);
        this.id_class.accept(Dp_1.id_class(xu_3.PR, DS.id_class().id_class(Ds_1.id_byte, rqO_22), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_class, DE.R270), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R270), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R270), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R90), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R180), DS.id_class().id_class(Ds_1.id_byte, rqO_22).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R270)));
    }

    private void E() {
        rqO_2 rqO_22 = Uk_1.id_class.id_class(xu_3.Js, this.id_break);
        this.id_class(xu_3.Js, rqO_22);
        this.id_class.accept(Dp_1.id_class(xu_3.Js).id_class(Dd_1.id_class(rCT.Y).id_class((T1 rCD2) -> DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.Js, "_" + rCD2.id_class(), Uh_1.id_byte, Do_1::id_break)))));
    }

    private void X() {
        this.id_class.accept(DG.id_byte(xu_3.bV, Uh_1.id_byte.id_class(xu_3.bV, Do_1.id_break(DK.id_class("magma")), this.id_break)));
    }
}

