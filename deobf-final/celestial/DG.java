package celestial;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
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
   final Consumer<Dt_1> class_;
   final BiConsumer<rqO_2, Supplier<JsonElement>> break_;
   private final Consumer<rdb_3> byte_;

   private void boolean_() {
      rqO_2 var1 = DK.class_(xu_3.bK);
      rqO_2 var2 = DK.class_(xu_3.bK, "_on");
      this.class_.accept(Dp_1.class_(xu_3.bK).class_(class_(rCT.return_, var2, var1)).class_(throws_()));
   }

   private void char_() {
      List var1 = this.this_(xu_3.rK);
      List var2 = this.else_(xu_3.rK);
      this.class_
         .accept(
            Dl_1.class_(xu_3.rK)
               .class_(class_(var1, var0 -> var0))
               .class_(class_(var2, var0 -> var0))
               .class_(class_(var2, var0 -> var0.class_(Ds_1.break_, DE.R90)))
               .class_(class_(var2, var0 -> var0.class_(Ds_1.break_, DE.R180)))
               .class_(class_(var2, var0 -> var0.class_(Ds_1.break_, DE.R270)))
         );
   }

   private void byte_(xd_3 var1, xd_3 var2) {
      this.class_(var1.case_());
      Do_1 var3 = Do_1.catch_(var1);
      Do_1 var4 = Do_1.class_(var1, var2);
      rqO_2 var5 = Uh_1.c.class_(var2, var4, this.break_);
      this.class_
         .accept(
            Dp_1.class_(var2, DS.class_().class_(Ds_1.byte_, var5))
               .class_(
                  Dd_1.class_(rCT.strictfp_)
                     .class_(rpr_3.WEST, DS.class_())
                     .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R270))
                     .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R180))
               )
         );
      this.class_
         .accept(Dp_1.class_(var1).class_(Dd_1.class_(rCT.d).class_(var3x -> DS.class_().class_(Ds_1.byte_, Uh_1.N[var3x].class_(var1, var3, this.break_)))));
   }

   private static Dd_1 byte_() {
      return Dd_1.class_(rCT.strictfp_)
         .class_(rpr_3.SOUTH, DS.class_())
         .class_(rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R270));
   }

   static Dt_1 byte_(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dl_1.class_(var0)
         .class_(DS.class_().class_(Ds_1.byte_, var1))
         .class_(DI.class_().class_(rCT.void_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.static_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.import_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.short_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true));
   }

   private void byte_(xd_3 var1) {
      rqO_2 var2 = Uk_1.class_.class_(var1, this.break_);
      rqO_2 var3 = Uk_1.break_.class_(var1, this.break_);
      this.class_.accept(class_(var1, var2, var3));
   }

   private static Dt_1 byte_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.class_(var0)
         .class_(
            Dd_1.class_(rCT.strictfp_, rCT.b, rCT.else_)
               .class_(rpr_3.NORTH, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.EAST, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90))
               .class_(rpr_3.WEST, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270))
               .class_(rpr_3.NORTH, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpr_3.SOUTH, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.EAST, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90))
               .class_(rpr_3.WEST, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270))
               .class_(rpr_3.NORTH, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.EAST, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
               .class_(rpr_3.WEST, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
               .class_(rpr_3.NORTH, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.SOUTH, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R0))
               .class_(rpr_3.EAST, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270))
               .class_(rpr_3.WEST, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90))
         );
   }

   static Dp_1 byte_(xd_3 var0, rqO_2 var1) {
      return Dp_1.class_(var0, DS.class_().class_(Ds_1.byte_, var1));
   }

   private void byte_(xd_3 var1, UW var2) {
      this.class_.accept(byte_(var1, var2.class_(var1, this.break_)));
   }

   private void byte_(xd_3 var1, DX var2) {
      this.class_(var1, "_top");
      rqO_2 var3 = this.class_(var1, "_top", var2.class_(), Do_1::byte_);
      rqO_2 var4 = this.class_(var1, "_bottom", var2.class_(), Do_1::byte_);
      this.case_(var1, var3, var4);
   }

   private void int_(xd_3 var1) {
      rqO_2 var2 = Uh_1.V.class_(var1, Do_1.break_(var1), this.break_);
      rqO_2 var3 = DK.class_("mushroom_block_inside");
      this.class_
         .accept(
            Dl_1.class_(var1)
               .class_(DI.class_().class_(rCT.void_, true), DS.class_().class_(Ds_1.byte_, var2))
               .class_(DI.class_().class_(rCT.static_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.import_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.short_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.long_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.float_, true), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.void_, false), DS.class_().class_(Ds_1.byte_, var3))
               .class_(DI.class_().class_(rCT.static_, false), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, false))
               .class_(DI.class_().class_(rCT.import_, false), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, false))
               .class_(DI.class_().class_(rCT.short_, false), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, false))
               .class_(DI.class_().class_(rCT.long_, false), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, false))
               .class_(DI.class_().class_(rCT.float_, false), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, false))
         );
      this.class_(var1, Uk_1.class_.class_(var1, "_inventory", this.break_));
   }

   private void int_() {
      this.class_(rdy_3.OP);
      this.class_
         .accept(
            Dp_1.class_(xu_3.sL)
               .class_(byte_())
               .class_(
                  Dd_1.class_(rCT.I, rCT.return_)
                     .class_(rCw_1.COMPARE, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.sL)))
                     .class_(rCw_1.COMPARE, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.sL, "_on")))
                     .class_(rCw_1.SUBTRACT, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.sL, "_subtract")))
                     .class_(rCw_1.SUBTRACT, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.sL, "_on_subtract")))
               )
         );
   }

   private void long_() {
      rqO_2 var1 = Do_1.throw_(xu_3.finally_);
      Do_1 var2 = new Do_1()
         .class_(UX.throws_, var1)
         .class_(UX.throws_, UX.byte_)
         .class_(UX.case_, Do_1.class_(xu_3.implements_, "_top"))
         .class_(UX.implements_, Do_1.class_(xu_3.implements_, "_snow"));
      DS var3 = DS.class_().class_(Ds_1.byte_, Uh_1.private_.class_(xu_3.implements_, "_snow", var2, this.break_));
      this.class_(xu_3.implements_, DK.class_(xu_3.implements_), var3);
      rqO_2 var4 = Uk_1.throws_.get(xu_3.Bi).class_(var1x -> var1x.class_(UX.throws_, var1)).class_(xu_3.Bi, this.break_);
      this.class_(xu_3.Bi, var4, var3);
      rqO_2 var5 = Uk_1.throws_.get(xu_3.native_).class_(var1x -> var1x.class_(UX.throws_, var1)).class_(xu_3.native_, this.break_);
      this.class_(xu_3.native_, var5, var3);
   }

   private void float_() {
      this.class_(rdy_3.Xv);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Sx)
               .class_(
                  Dd_1.class_(rCT.X)
                     .class_(0, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sx, "_stage0")))
                     .class_(1, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sx, "_stage1")))
                     .class_(2, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sx, "_stage2")))
               )
               .class_(byte_())
         );
   }

   private void double_() {
      rqO_2 var1 = DK.class_(xu_3.hU, "_stable");
      rqO_2 var2 = DK.class_(xu_3.hU, "_unstable");
      this.class_(xu_3.hU, var1);
      this.class_.accept(Dp_1.class_(xu_3.hU).class_(class_(rCT.break_, var2, var1)));
   }

   public DG(Consumer<Dt_1> var1, BiConsumer<rqO_2, Supplier<JsonElement>> var2, Consumer<rdb_3> var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   private void B() {
      this.class_(rdy_3.D);
      this.class_
         .accept(
            Dp_1.class_(xu_3.hr)
               .class_(
                  Dd_1.class_(rCT.l, rCT.throw_)
                     .class_(1, false, Arrays.asList(class_(DK.class_("dead_sea_pickle"))))
                     .class_(2, false, Arrays.asList(class_(DK.class_("two_dead_sea_pickles"))))
                     .class_(3, false, Arrays.asList(class_(DK.class_("three_dead_sea_pickles"))))
                     .class_(4, false, Arrays.asList(class_(DK.class_("four_dead_sea_pickles"))))
                     .class_(1, true, Arrays.asList(class_(DK.class_("sea_pickle"))))
                     .class_(2, true, Arrays.asList(class_(DK.class_("two_sea_pickles"))))
                     .class_(3, true, Arrays.asList(class_(DK.class_("three_sea_pickles"))))
                     .class_(4, true, Arrays.asList(class_(DK.class_("four_sea_pickles"))))
               )
         );
   }

   private void J() {
      rqO_2 var1 = DK.class_(xu_3.break_);
      rqO_2 var2 = DK.class_(xu_3.break_, "_mirrored");
      this.class_.accept(class_(xu_3.Bl, var1, var2));
      this.class_(xu_3.Bl, var1);
   }

   private void S() {
      Do_1 var1 = Do_1.class_(xu_3.Pq);
      rqO_2 var2 = Uh_1.byte_.class_(xu_3.Pt, var1, this.break_);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Pq)
               .class_(Dd_1.class_(rCT.m).class_(var1x -> DS.class_().class_(Ds_1.byte_, var1x < 8 ? DK.class_(xu_3.Pq, "_height" + var1x * 2) : var2)))
         );
      this.class_(xu_3.Pq, DK.class_(xu_3.Pq, "_height2"));
      this.class_.accept(byte_(xu_3.Pt, var2));
   }

   private void this_() {
      Do_1 var1 = new Do_1()
         .class_(UX.byte_, Do_1.class_(xu_3.XP, "_side3"))
         .class_(UX.package_, Do_1.throw_(xu_3.super_))
         .class_(UX.final_, Do_1.class_(xu_3.XP, "_top"))
         .class_(UX.finally_, Do_1.class_(xu_3.XP, "_side3"))
         .class_(UX.native_, Do_1.class_(xu_3.XP, "_side3"))
         .class_(UX.extends_, Do_1.class_(xu_3.XP, "_side1"))
         .class_(UX.volatile_, Do_1.class_(xu_3.XP, "_side2"));
      this.class_.accept(byte_(xu_3.XP, Uh_1.class_.class_(xu_3.XP, var1, this.break_)));
   }

   private List<rqO_2> this_(xd_3 var1) {
      rqO_2 var2 = Uh_1.Z.class_(DK.class_(var1, "_floor0"), Do_1.continue_(var1), this.break_);
      rqO_2 var3 = Uh_1.Z.class_(DK.class_(var1, "_floor1"), Do_1.super_(var1), this.break_);
      return ImmutableList.of(var2, var3);
   }

   private void b() {
      this.class_(rdy_3.Oa);
      this.class_
         .accept(
            Dp_1.class_(xu_3.SQ)
               .class_(
                  Dd_1.class_(rCT.class_, rCT.static_, rCT.void_, rCT.import_, rCT.short_)
                     .class_(false, false, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ns")))
                     .class_(false, true, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_n")).class_(Ds_1.break_, DE.R90))
                     .class_(false, false, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_n")))
                     .class_(false, false, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_n")).class_(Ds_1.break_, DE.R180))
                     .class_(false, false, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_n")).class_(Ds_1.break_, DE.R270))
                     .class_(false, true, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ne")))
                     .class_(false, true, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ne")).class_(Ds_1.break_, DE.R90))
                     .class_(false, false, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ne")).class_(Ds_1.break_, DE.R180))
                     .class_(false, false, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ne")).class_(Ds_1.break_, DE.R270))
                     .class_(false, false, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ns")))
                     .class_(false, true, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_ns")).class_(Ds_1.break_, DE.R90))
                     .class_(false, true, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_nse")))
                     .class_(false, true, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_nse")).class_(Ds_1.break_, DE.R90))
                     .class_(false, false, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_nse")).class_(Ds_1.break_, DE.R180))
                     .class_(false, true, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_nse")).class_(Ds_1.break_, DE.R270))
                     .class_(false, true, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_nsew")))
                     .class_(true, false, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ns")))
                     .class_(true, false, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_n")))
                     .class_(true, false, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_n")).class_(Ds_1.break_, DE.R180))
                     .class_(true, true, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_n")).class_(Ds_1.break_, DE.R90))
                     .class_(true, false, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_n")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ne")))
                     .class_(true, true, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ne")).class_(Ds_1.break_, DE.R90))
                     .class_(true, false, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ne")).class_(Ds_1.break_, DE.R180))
                     .class_(true, false, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ne")).class_(Ds_1.break_, DE.R270))
                     .class_(true, false, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ns")))
                     .class_(true, true, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_ns")).class_(Ds_1.break_, DE.R90))
                     .class_(true, true, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_nse")))
                     .class_(true, true, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_nse")).class_(Ds_1.break_, DE.R90))
                     .class_(true, false, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_nse")).class_(Ds_1.break_, DE.R180))
                     .class_(true, true, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_nse")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.SQ, "_attached_nsew")))
               )
         );
   }

   private void x() {
      rqO_2 var1 = Do_1.class_(xu_3.Jk, "_bottom");
      rqO_2 var2 = Do_1.class_(xu_3.Jk, "_top_off");
      rqO_2 var3 = Do_1.class_(xu_3.Jk, "_top");
      rqO_2[] var4 = new rqO_2[5];

      for (int var5 = 0; var5 < 5; var5++) {
         Do_1 var6 = new Do_1().class_(UX.throws_, var1).class_(UX.case_, var5 == 0 ? var2 : var3).class_(UX.implements_, Do_1.class_(xu_3.Jk, "_side" + var5));
         var4[var5] = Uh_1.private_.class_(xu_3.Jk, "_" + var5, var6, this.break_);
      }

      this.class_.accept(Dp_1.class_(xu_3.Jk).class_(Dd_1.class_(rCT.q).class_(var1x -> DS.class_().class_(Ds_1.byte_, var4[var1x]))));
      this.class_(rdy_3.Wo, var4[0]);
   }

   private void s() {
      this.class_.accept(Dp_1.class_(xu_3.XG, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.XG))).class_(break_()));
   }

   private void h() {
      this.break_(xu_3.BD);
      this.class_
         .accept(
            Dp_1.class_(xu_3.BD)
               .class_(
                  Dd_1.class_(rCT.static_, rCT.void_, rCT.import_, rCT.long_, rCT.short_)
                     .class_(false, false, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1")))
                     .class_(false, false, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1")))
                     .class_(false, false, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1")).class_(Ds_1.break_, DE.R90))
                     .class_(false, true, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1")).class_(Ds_1.break_, DE.R180))
                     .class_(true, false, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, false, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2")))
                     .class_(true, false, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2")).class_(Ds_1.break_, DE.R90))
                     .class_(false, false, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2")).class_(Ds_1.break_, DE.R180))
                     .class_(false, true, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2")).class_(Ds_1.break_, DE.R270))
                     .class_(true, false, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2_opposite")))
                     .class_(false, true, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2_opposite")).class_(Ds_1.break_, DE.R90))
                     .class_(true, true, true, false, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3")))
                     .class_(true, false, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3")).class_(Ds_1.break_, DE.R90))
                     .class_(false, true, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3")).class_(Ds_1.break_, DE.R180))
                     .class_(true, true, false, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, true, false, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_4")))
                     .class_(false, false, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_u")))
                     .class_(false, false, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1u")))
                     .class_(false, false, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1u")).class_(Ds_1.break_, DE.R90))
                     .class_(false, true, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1u")).class_(Ds_1.break_, DE.R180))
                     .class_(true, false, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_1u")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, false, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u")))
                     .class_(true, false, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u")).class_(Ds_1.break_, DE.R90))
                     .class_(false, false, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u")).class_(Ds_1.break_, DE.R180))
                     .class_(false, true, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u")).class_(Ds_1.break_, DE.R270))
                     .class_(true, false, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u_opposite")))
                     .class_(false, true, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_2u_opposite")).class_(Ds_1.break_, DE.R90))
                     .class_(true, true, true, true, false, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3u")))
                     .class_(true, false, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3u")).class_(Ds_1.break_, DE.R90))
                     .class_(false, true, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3u")).class_(Ds_1.break_, DE.R180))
                     .class_(true, true, false, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_3u")).class_(Ds_1.break_, DE.R270))
                     .class_(true, true, true, true, true, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BD, "_4u")))
               )
         );
   }

   private void d() {
      rqO_2 var1 = Do_1.class_(xu_3.JE, "_top");
      rqO_2 var2 = Do_1.class_(xu_3.JE, "_bottom");
      rqO_2 var3 = Do_1.class_(xu_3.JE, "_side");
      rqO_2 var4 = Do_1.class_(xu_3.JE, "_lock");
      Do_1 var5 = new Do_1()
         .class_(UX.package_, var3)
         .class_(UX.volatile_, var3)
         .class_(UX.native_, var3)
         .class_(UX.byte_, var1)
         .class_(UX.finally_, var1)
         .class_(UX.extends_, var2)
         .class_(UX.final_, var4);
      rqO_2 var6 = Uh_1.break_.class_(xu_3.JE, var5, this.break_);
      this.class_
         .accept(Dp_1.class_(xu_3.JE, DS.class_().class_(Ds_1.byte_, var6)).class_(Dd_1.class_(rCT.boolean_).class_(var1x -> this.class_(var1x, DS.class_()))));
   }

   private void interface_() {
      Dj_1 var1 = DI.class_().class_(rCT.void_, false).class_(rCT.static_, false).class_(rCT.import_, false).class_(rCT.short_, false).class_(rCT.long_, false);
      List var2 = this.this_(xu_3.ro);
      List var3 = this.else_(xu_3.ro);
      List var4 = this.synchronized_(xu_3.ro);
      this.class_
         .accept(
            Dl_1.class_(xu_3.ro)
               .class_(var1, class_(var2, var0 -> var0))
               .class_(DI.class_(DI.class_().class_(rCT.void_, true), var1), class_(var3, var0 -> var0))
               .class_(DI.class_(DI.class_().class_(rCT.static_, true), var1), class_(var3, var0 -> var0.class_(Ds_1.break_, DE.R90)))
               .class_(DI.class_(DI.class_().class_(rCT.import_, true), var1), class_(var3, var0 -> var0.class_(Ds_1.break_, DE.R180)))
               .class_(DI.class_(DI.class_().class_(rCT.short_, true), var1), class_(var3, var0 -> var0.class_(Ds_1.break_, DE.R270)))
               .class_(DI.class_().class_(rCT.long_, true), class_(var4, var0 -> var0))
         );
   }

   private DO class_(rqO_2 var1, xd_3 var2) {
      return new DO(this, var1, var2);
   }

   private void class_(xd_3 var1, rqO_2 var2, DS var3) {
      List var4 = Arrays.asList(class_(var2));
      this.class_.accept(Dp_1.class_(var1).class_(Dd_1.class_(rCT.while_).class_(true, var3).class_(false, var4)));
   }

   private List<DS> class_(int var1) {
      String var2 = "_age" + var1;
      return IntStream.range(1, 5).mapToObj(var1x -> DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.hs, var1x + var2))).collect(Collectors.toList());
   }

   private void class_(xd_3 var1, rdb_3 var2) {
      rqO_2 var3 = Uh_1.abstract_.class_(var1, Do_1.class_(var2), this.break_);
      this.class_.accept(byte_(var1, var3));
   }

   private static <T extends Comparable<T>> Dd_1 class_(rCZ<T> var0, T var1, rqO_2 var2, rqO_2 var3) {
      DS var4 = DS.class_().class_(Ds_1.byte_, var2);
      DS var5 = DS.class_().class_(Ds_1.byte_, var3);
      return Dd_1.class_(var0).class_(var3x -> {
         boolean var4x = var3x.compareTo(var1) >= 0;
         return var4x ? var4 : var5;
      });
   }

   private void class_(UW var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         rqO_2 var7 = var1.class_(var6, this.break_);
         this.class_.accept(break_(var6, var7));
      }
   }

   private void class_(xd_3 var1, rCZ<Integer> var2, int... var3) {
      if (var2.class_().size() != var3.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectOpenHashMap var4 = new Int2ObjectOpenHashMap();
         Dd_1 var5 = Dd_1.<Integer>class_(var2).class_(var4x -> {
            int var5x = var3[var4x];
            rqO_2 var6 = (rqO_2)var4.computeIfAbsent(var5x, var3xx -> this.class_(var1, "_stage" + var5x, Uh_1.u, Do_1::case_));
            return DS.class_().class_(Ds_1.byte_, var6);
         });
         this.class_(var1.case_());
         this.class_.accept(Dp_1.class_(var1).class_(var5));
      }
   }

   private void class_(xd_3... var1) {
      rqO_2 var2 = DK.class_("campfire_off");

      for (xd_3 var6 : var1) {
         rqO_2 var7 = Uh_1.n.class_(var6, Do_1.try_(var6), this.break_);
         this.class_(var6.case_());
         this.class_.accept(Dp_1.class_(var6).class_(class_(rCT.continue_, var7, var2)).class_(byte_()));
      }
   }

   private void class_(xd_3 var1, xd_3 var2, BiFunction<xd_3, xd_3, Do_1> var3) {
      Do_1 var4 = (Do_1)var3.apply(var1, var2);
      this.class_.accept(byte_(var1, Uh_1.class_.class_(var1, var4, this.break_)));
   }

   private static List<DS> class_(List<rqO_2> var0, UnaryOperator<DS> var1) {
      return var0.stream().map(var0x -> DS.class_().class_(Ds_1.byte_, var0x)).map(var1).collect(Collectors.toList());
   }

   private void class_(xd_3 var1, Do_1 var2) {
      rqO_2 var3 = Uh_1.implements_.class_(var1, var2.break_(UX.catch_, Do_1.throw_(var1)), this.break_);
      this.class_.accept(Dp_1.class_(var1, DS.class_().class_(Ds_1.byte_, var3)).class_(break_()));
   }

   private void class_(xd_3 var1, Function<xd_3, Do_1> var2) {
      Do_1 var3 = ((Do_1)var2.apply(var1)).class_(UX.implements_, UX.byte_);
      Do_1 var4 = var3.break_(UX.catch_, Do_1.class_(var1, "_front_honey"));
      rqO_2 var5 = Uh_1.finally_.class_(var1, var3, this.break_);
      rqO_2 var6 = Uh_1.finally_.class_(var1, "_honey", var4, this.break_);
      this.class_.accept(Dp_1.class_(var1).class_(break_()).class_(class_(rCT.L, 5, var6, var5)));
   }

   public void class_() {
      this.extends_(xu_3.class_);
      this.class_(xu_3.hb, xu_3.class_);
      this.class_(xu_3.hG, xu_3.class_);
      this.extends_(xu_3.Sv);
      this.extends_(xu_3.Pw);
      this.class_(xu_3.hM, xu_3.try_);
      this.extends_(xu_3.SX);
      this.extends_(xu_3.Oh);
      this.extends_(xu_3.SE);
      this.extends_(xu_3.SA);
      this.class_(rdy_3.dS);
      this.extends_(xu_3.Jh);
      this.extends_(xu_3.try_);
      this.extends_(xu_3.instanceof_);
      this.extends_(xu_3.EN);
      this.class_(rdy_3.BK);
      this.extends_(xu_3.hE);
      this.extends_(xu_3.Si);
      this.class_(xu_3.Ec, rdy_3.sV);
      this.class_(rdy_3.sV);
      this.class_(xu_3.bo, rdy_3.GN);
      this.class_(rdy_3.GN);
      this.case_(xu_3.rc, Do_1.class_(xu_3.rB, "_side"));
      this.byte_(xu_3.float_, Uk_1.class_);
      this.byte_(xu_3.Ea, Uk_1.class_);
      this.byte_(xu_3.ri, Uk_1.class_);
      this.byte_(xu_3.Pr, Uk_1.class_);
      this.byte_(xu_3.Sk, Uk_1.class_);
      this.byte_(xu_3.SN, Uk_1.class_);
      this.byte_(xu_3.abstract_, Uk_1.class_);
      this.byte_(xu_3.void_, Uk_1.class_);
      this.byte_(xu_3.rt, Uk_1.class_);
      this.byte_(xu_3.long_, Uk_1.class_);
      this.byte_(xu_3.rw, Uk_1.class_);
      this.byte_(xu_3.Jx, Uk_1.byte_);
      this.byte_(xu_3.JJ, Uk_1.class_);
      this.byte_(xu_3.m, Uk_1.class_);
      this.byte_(xu_3.Z, Uk_1.class_);
      this.byte_(xu_3.sC, Uk_1.class_);
      this.byte_(xu_3.Pl, Uk_1.class_);
      this.byte_(xu_3.sn, Uk_1.class_);
      this.byte_(xu_3.Jy, Uk_1.class_);
      this.byte_(xu_3.hP, Uk_1.class_);
      this.byte_(xu_3.JI, Uk_1.class_);
      this.byte_(xu_3.PI, Uk_1.class_);
      this.byte_(xu_3.extends_, Uk_1.class_);
      this.byte_(xu_3.Jf, Uk_1.class_);
      this.byte_(xu_3.Bn, Uk_1.class_);
      this.byte_(xu_3.Jd, Uk_1.class_);
      this.byte_(xu_3.Sh, Uk_1.class_);
      this.byte_(xu_3.Pa, Uk_1.class_);
      this.byte_(xu_3.char_, Uk_1.class_);
      this.byte_(xu_3.JX, Uk_1.class_);
      this.byte_(xu_3.PT, Uk_1.class_);
      this.byte_(xu_3.Pj, Uk_1.case_);
      this.byte_(xu_3.Jc, Uk_1.byte_);
      this.byte_(xu_3.Bg, Uk_1.byte_);
      this.byte_(xu_3.bg, Uk_1.class_);
      this.byte_(xu_3.n, Uk_1.class_);
      this.byte_(xu_3.Ei, Uk_1.class_);
      this.byte_(xu_3.rg, Uk_1.class_);
      this.byte_(xu_3.Jj, Uk_1.class_);
      this.byte_(xu_3.EH, Uk_1.class_);
      this.byte_(xu_3.Xn, Uk_1.class_);
      this.byte_(xu_3.PY, Uk_1.class_);
      this.byte_(xu_3.Po, Uk_1.class_);
      this.byte_(xu_3.rD, Uk_1.class_);
      this.byte_(xu_3.N, Uk_1.class_);
      this.byte_(xu_3.rr, Uk_1.new_);
      this.class_(rdy_3.K);
      this.byte_(xu_3.rf, Uk_1.throws_);
      this.byte_(xu_3.Jb, Uk_1.byte_);
      this.byte_(xu_3.XN, Uk_1.class_);
      this.byte_(xu_3.c, Uk_1.class_);
      this.byte_(xu_3.JA, Uk_1.class_);
      this.byte_(xu_3.sy, Uk_1.byte_.class_(var0 -> var0.class_(UX.implements_, Do_1.throw_(xu_3.sy))));
      this.byte_(xu_3.BC, Uk_1.class_);
      this.catch_(xu_3.L, xu_3.F);
      this.catch_(xu_3.Gf, xu_3.GI);
      this.byte_(xu_3.Jn, Uk_1.class_);
      this.private_(xu_3.sv, xu_3.rt);
      this.private_(xu_3.sF, xu_3.rw);
      this.final_();
      this.continue_();
      this.super_();
      this.class_(xu_3.Xh, xu_3.XX);
      this.this_();
      this.return_();
      this.public_();
      this.while_();
      this.try_();
      this.instanceof_();
      this.goto_();
      this.super_(xu_3.bn);
      this.throw_();
      this.interface_();
      this.char_();
      this.abstract_();
      this.long_();
      this.float_();
      this.void_();
      this.volatile_();
      this.static_();
      this.import_();
      this.short_();
      this.default_();
      this.const_();
      this.strictfp_();
      this.boolean_();
      this.transient_();
      this.for_();
      this.double_();
      this.r();
      this.switch_();
      this.P();
      this.B();
      this.else_();
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
      this.public_(xu_3.PJ);
      this.break_(xu_3.PJ);
      this.public_(xu_3.Xs);
      this.finally_(xu_3.rR, xu_3.rY);
      this.finally_(xu_3.PU, xu_3.Pe);
      this.class_(xu_3.PP, xu_3.final_, Do_1::byte_);
      this.class_(xu_3.XB, xu_3.int_, Do_1::protected_);
      this.continue_(xu_3.XL);
      this.continue_(xu_3.Xz);
      this.new_(xu_3.v);
      this.new_(xu_3.st);
      this.return_(xu_3.XM);
      this.return_(xu_3.XO);
      this.throws_(xu_3.Bj, DK.class_(xu_3.Bj));
      this.class_(xu_3.PK, Uk_1.byte_);
      this.class_(xu_3.PD, Uk_1.byte_);
      this.class_(xu_3.bY, Uk_1.byte_);
      this.protected_(xu_3.finally_);
      this.protected_(xu_3.throw_);
      this.protected_(xu_3.interface_);
      this.byte_(xu_3.while_);
      this.class_(xu_3.Ey, Uk_1.byte_, Uk_1.protected_);
      this.class_(xu_3.by, Uk_1.continue_, Uk_1.super_);
      this.class_(xu_3.sp, Uk_1.continue_, Uk_1.super_);
      this.break_(xu_3.he, Uk_1.private_);
      this.synchronized_();
      this.class_(xu_3.JM, Do_1::return_);
      this.class_(xu_3.JO, Do_1::goto_);
      this.class_(xu_3.bT, rCT.J, 0, 1, 2, 3);
      this.class_(xu_3.sr, rCT.d, 0, 0, 1, 1, 2, 2, 2, 3);
      this.class_(xu_3.Ss, rCT.J, 0, 1, 1, 2);
      this.class_(xu_3.sP, rCT.d, 0, 0, 1, 1, 2, 2, 2, 3);
      this.class_(xu_3.PB, rCT.d, 0, 1, 2, 3, 4, 5, 6, 7);
      this.class_(DK.class_("banner"), xu_3.final_)
         .class_(
            Uh_1.D,
            xu_3.GG,
            xu_3.Gb,
            xu_3.GM,
            xu_3.GO,
            xu_3.Gh,
            xu_3.GX,
            xu_3.GJ,
            xu_3.Gx,
            xu_3.Gd,
            xu_3.Gk,
            xu_3.GW,
            xu_3.Gz,
            xu_3.GQ,
            xu_3.GN,
            xu_3.Gc,
            xu_3.Gu
         )
         .break_(xu_3.Gm, xu_3.GZ, xu_3.Gv, xu_3.GF, xu_3.GL, xu_3.GA, xu_3.Gn, xu_3.GC, xu_3.Gl, xu_3.GH, xu_3.Gy, xu_3.Gp, xu_3.Gq, xu_3.GT, xu_3.Gt, xu_3.Gw);
      this.class_(DK.class_("bed"), xu_3.final_)
         .break_(xu_3.C, xu_3.l, xu_3.H, xu_3.y, xu_3.p, xu_3.q, xu_3.T, xu_3.t, xu_3.w, xu_3.I, xu_3.f, xu_3.j, xu_3.V, xu_3.g, xu_3.R, xu_3.Y);
      this.extends_(xu_3.C, xu_3.rs);
      this.extends_(xu_3.l, xu_3.rE);
      this.extends_(xu_3.H, xu_3.rG);
      this.extends_(xu_3.y, xu_3.rb);
      this.extends_(xu_3.p, xu_3.rM);
      this.extends_(xu_3.q, xu_3.rO);
      this.extends_(xu_3.T, xu_3.rh);
      this.extends_(xu_3.t, xu_3.rX);
      this.extends_(xu_3.w, xu_3.rJ);
      this.extends_(xu_3.I, xu_3.rx);
      this.extends_(xu_3.f, xu_3.rd);
      this.extends_(xu_3.j, xu_3.rk);
      this.extends_(xu_3.V, xu_3.rW);
      this.extends_(xu_3.g, xu_3.rz);
      this.extends_(xu_3.R, xu_3.rQ);
      this.extends_(xu_3.Y, xu_3.rN);
      this.class_(DK.class_("skull"), xu_3.PY)
         .class_(Uh_1.U, xu_3.sW, xu_3.sd, xu_3.sJ, xu_3.sM, xu_3.sh)
         .class_(xu_3.sQ)
         .break_(xu_3.sz, xu_3.sN, xu_3.sk, xu_3.sx, xu_3.sO, xu_3.sX);
      this.goto_(xu_3.bD);
      this.goto_(xu_3.bU);
      this.goto_(xu_3.be);
      this.goto_(xu_3.ba);
      this.goto_(xu_3.bi);
      this.goto_(xu_3.Mr);
      this.goto_(xu_3.MP);
      this.goto_(xu_3.MB);
      this.goto_(xu_3.MS);
      this.goto_(xu_3.Ms);
      this.goto_(xu_3.ME);
      this.goto_(xu_3.MG);
      this.goto_(xu_3.Mb);
      this.goto_(xu_3.MM);
      this.goto_(xu_3.MO);
      this.goto_(xu_3.Mh);
      this.goto_(xu_3.MX);
      this.byte_(xu_3.hB, Uk_1.native_);
      this.class_(xu_3.hB);
      this.class_(DK.class_("chest"), xu_3.final_).break_(xu_3.re, xu_3.sZ);
      this.class_(DK.class_("ender_chest"), xu_3.rg).break_(xu_3.SW);
      this.protected_(xu_3.SM, xu_3.rg).class_(xu_3.SM, xu_3.bw);
      this.throws_(xu_3.Mn);
      this.throws_(xu_3.MC);
      this.throws_(xu_3.Ml);
      this.throws_(xu_3.MH);
      this.throws_(xu_3.My);
      this.throws_(xu_3.Mp);
      this.throws_(xu_3.Mq);
      this.throws_(xu_3.MT);
      this.throws_(xu_3.Mt);
      this.throws_(xu_3.Mw);
      this.throws_(xu_3.MI);
      this.throws_(xu_3.Mf);
      this.throws_(xu_3.Mj);
      this.throws_(xu_3.MV);
      this.throws_(xu_3.Mg);
      this.throws_(xu_3.MR);
      this.class_(
         Uk_1.class_,
         xu_3.MY,
         xu_3.Mo,
         xu_3.MK,
         xu_3.MD,
         xu_3.MU,
         xu_3.Me,
         xu_3.Ma,
         xu_3.Mi,
         xu_3.Or,
         xu_3.OP,
         xu_3.OB,
         xu_3.OS,
         xu_3.Os,
         xu_3.OE,
         xu_3.OG,
         xu_3.Ob
      );
      this.throws_(xu_3.Ee);
      this.throws_(xu_3.sw);
      this.throws_(xu_3.sI);
      this.throws_(xu_3.sf);
      this.throws_(xu_3.sj);
      this.throws_(xu_3.sV);
      this.throws_(xu_3.sg);
      this.throws_(xu_3.sR);
      this.throws_(xu_3.sY);
      this.throws_(xu_3.so);
      this.throws_(xu_3.sK);
      this.throws_(xu_3.sD);
      this.throws_(xu_3.sU);
      this.throws_(xu_3.se);
      this.throws_(xu_3.sa);
      this.throws_(xu_3.si);
      this.throws_(xu_3.Er);
      this.case_(xu_3.u, xu_3.BV);
      this.case_(xu_3.Bs, xu_3.EP);
      this.case_(xu_3.BE, xu_3.EB);
      this.case_(xu_3.BG, xu_3.ES);
      this.case_(xu_3.Bb, xu_3.Es);
      this.case_(xu_3.BM, xu_3.EE);
      this.case_(xu_3.BO, xu_3.EG);
      this.case_(xu_3.Bh, xu_3.Eb);
      this.case_(xu_3.BX, xu_3.EM);
      this.case_(xu_3.BJ, xu_3.EO);
      this.case_(xu_3.Bx, xu_3.Eh);
      this.case_(xu_3.Bd, xu_3.EX);
      this.case_(xu_3.Bk, xu_3.EJ);
      this.case_(xu_3.BW, xu_3.Ex);
      this.case_(xu_3.Bz, xu_3.Ed);
      this.case_(xu_3.BQ, xu_3.Ek);
      this.case_(xu_3.BN, xu_3.EW);
      this.break_(
         Uk_1.finally_,
         xu_3.MJ,
         xu_3.Mx,
         xu_3.Md,
         xu_3.Mk,
         xu_3.MW,
         xu_3.Mz,
         xu_3.MQ,
         xu_3.MN,
         xu_3.Mc,
         xu_3.Mu,
         xu_3.Mm,
         xu_3.MZ,
         xu_3.Mv,
         xu_3.MF,
         xu_3.ML,
         xu_3.MA
      );
      this.throws_(xu_3.rs, xu_3.Ep);
      this.throws_(xu_3.rE, xu_3.Eq);
      this.throws_(xu_3.rG, xu_3.ET);
      this.throws_(xu_3.rb, xu_3.Et);
      this.throws_(xu_3.rM, xu_3.Ew);
      this.throws_(xu_3.rO, xu_3.EI);
      this.throws_(xu_3.rh, xu_3.Ef);
      this.throws_(xu_3.rX, xu_3.Ej);
      this.throws_(xu_3.rJ, xu_3.EV);
      this.throws_(xu_3.rx, xu_3.Eg);
      this.throws_(xu_3.rd, xu_3.ER);
      this.throws_(xu_3.rk, xu_3.EY);
      this.throws_(xu_3.rW, xu_3.Eo);
      this.throws_(xu_3.rz, xu_3.EK);
      this.throws_(xu_3.rQ, xu_3.ED);
      this.throws_(xu_3.rN, xu_3.EU);
      this.class_(xu_3.a, xu_3.Sq, DX.TINTED);
      this.class_(xu_3.ru, xu_3.ST, DX.NOT_TINTED);
      this.class_(xu_3.rm, xu_3.St, DX.NOT_TINTED);
      this.class_(xu_3.rZ, xu_3.Sw, DX.NOT_TINTED);
      this.class_(xu_3.rv, xu_3.SI, DX.NOT_TINTED);
      this.class_(xu_3.rF, xu_3.Sf, DX.NOT_TINTED);
      this.class_(xu_3.rL, xu_3.Sj, DX.NOT_TINTED);
      this.class_(xu_3.rA, xu_3.SV, DX.NOT_TINTED);
      this.class_(xu_3.rn, xu_3.Sg, DX.NOT_TINTED);
      this.class_(xu_3.rC, xu_3.SR, DX.NOT_TINTED);
      this.class_(xu_3.rl, xu_3.SY, DX.NOT_TINTED);
      this.class_(xu_3.rH, xu_3.So, DX.NOT_TINTED);
      this.class_(xu_3.rp, xu_3.SK, DX.NOT_TINTED);
      this.class_(xu_3.ry, xu_3.SD, DX.NOT_TINTED);
      this.class_(xu_3.rT, xu_3.SU, DX.NOT_TINTED);
      this.class_(xu_3.rq, xu_3.Se, DX.NOT_TINTED);
      this.class_(xu_3.i, xu_3.Sa, DX.NOT_TINTED);
      this.int_(xu_3.Bt);
      this.int_(xu_3.Bw);
      this.int_(xu_3.BI);
      this.class_(xu_3.e, DX.TINTED);
      this.break_(xu_3.Pf, DX.TINTED);
      this.class_(rdy_3.rT);
      this.break_(xu_3.OM, xu_3.OO, DX.TINTED);
      this.class_(rdy_3.rt);
      this.class_(xu_3.OO);
      this.break_(xu_3.XC, xu_3.Xl, DX.NOT_TINTED);
      this.break_(xu_3.XH, xu_3.Xy, DX.NOT_TINTED);
      this.class_(xu_3.XC, "_plant");
      this.class_(xu_3.Xl);
      this.class_(xu_3.XH, "_plant");
      this.class_(xu_3.Xy);
      this.class_(xu_3.hS, DX.TINTED, Do_1.byte_(Do_1.class_(xu_3.hs, "_stage0")));
      this.implements_();
      this.class_(xu_3.U, DX.NOT_TINTED);
      this.byte_(xu_3.GP, DX.NOT_TINTED);
      this.byte_(xu_3.GB, DX.NOT_TINTED);
      this.byte_(xu_3.GS, DX.NOT_TINTED);
      this.byte_(xu_3.Gs, DX.TINTED);
      this.byte_(xu_3.GE, DX.TINTED);
      this.catch_();
      this.private_();
      this.class_(xu_3.OA, xu_3.Om, xu_3.Oz, xu_3.OJ, xu_3.Ow, xu_3.Oy, xu_3.OD, xu_3.Og);
      this.class_(xu_3.On, xu_3.OZ, xu_3.OQ, xu_3.Ox, xu_3.OI, xu_3.Op, xu_3.OU, xu_3.OR);
      this.class_(xu_3.OC, xu_3.Ov, xu_3.ON, xu_3.Od, xu_3.Of, xu_3.Oq, xu_3.Oe, xu_3.OY);
      this.class_(xu_3.Ol, xu_3.OF, xu_3.Oc, xu_3.Ok, xu_3.Oj, xu_3.OT, xu_3.Oa, xu_3.Oo);
      this.class_(xu_3.OH, xu_3.OL, xu_3.Ou, xu_3.OW, xu_3.OV, xu_3.Ot, xu_3.Oi, xu_3.OK);
      this.byte_(xu_3.BK, xu_3.BY);
      this.byte_(xu_3.Bo, xu_3.BR);
      this.case_(xu_3.continue_).class_(xu_3.sG).byte_(xu_3.bu).protected_(xu_3.bW).throws_(xu_3.Pn).class_(xu_3.PM, xu_3.PQ).case_(xu_3.GK).catch_(xu_3.Ez);
      this.catch_(xu_3.bL);
      this.private_(xu_3.Bv);
      this.finally_(xu_3.const_).byte_(xu_3.const_).class_(xu_3.E);
      this.finally_(xu_3.double_).byte_(xu_3.double_).class_(xu_3.X);
      this.class_(xu_3.public_, xu_3.Sy, DX.NOT_TINTED);
      this.byte_(xu_3.z, Uk_1.final_);
      this.case_(xu_3.int_).class_(xu_3.ss).byte_(xu_3.bN).protected_(xu_3.bd).throws_(xu_3.PL).class_(xu_3.Pb, xu_3.Pz).case_(xu_3.GY).catch_(xu_3.Su);
      this.catch_(xu_3.bv);
      this.private_(xu_3.Bm);
      this.finally_(xu_3.short_).byte_(xu_3.short_).class_(xu_3.S);
      this.finally_(xu_3.transient_).byte_(xu_3.transient_).class_(xu_3.O);
      this.class_(xu_3.synchronized_, xu_3.Sl, DX.NOT_TINTED);
      this.byte_(xu_3.k, Uk_1.final_);
      this.case_(xu_3.final_)
         .class_(xu_3.sB)
         .byte_(xu_3.PV)
         .protected_(xu_3.BU)
         .throws_(xu_3.Pv)
         .class_(xu_3.PE, xu_3.Pk)
         .case_(xu_3.Gg)
         .case_(xu_3.br)
         .catch_(xu_3.rU);
      this.catch_(xu_3.PX);
      this.implements_(xu_3.Bc);
      this.finally_(xu_3.static_).byte_(xu_3.static_).class_(xu_3.P);
      this.finally_(xu_3.r).byte_(xu_3.r).class_(xu_3.b);
      this.class_(xu_3.this_, xu_3.Sn, DX.NOT_TINTED);
      this.byte_(xu_3.x, Uk_1.final_);
      this.case_(xu_3.package_).class_(xu_3.sS).byte_(xu_3.bQ).protected_(xu_3.bx).throws_(xu_3.PF).class_(xu_3.PG, xu_3.PW).case_(xu_3.GR).catch_(xu_3.Sc);
      this.catch_(xu_3.bZ);
      this.private_(xu_3.Bu);
      this.finally_(xu_3.import_).byte_(xu_3.import_).class_(xu_3.B);
      this.finally_(xu_3.boolean_).byte_(xu_3.boolean_).class_(xu_3.M);
      this.class_(xu_3.else_, xu_3.SC, DX.NOT_TINTED);
      this.byte_(xu_3.d, Uk_1.final_);
      this.case_(xu_3.super_).class_(xu_3.sb).byte_(xu_3.bm).protected_(xu_3.bz).throws_(xu_3.PC).class_(xu_3.Ph, xu_3.Pc).case_(xu_3.GD).catch_(xu_3.EQ);
      this.catch_(xu_3.bA);
      this.implements_(xu_3.BF);
      this.finally_(xu_3.strictfp_).byte_(xu_3.strictfp_).class_(xu_3.G);
      this.finally_(xu_3.switch_).byte_(xu_3.switch_).class_(xu_3.J);
      this.class_(xu_3.goto_, xu_3.Sp, DX.NOT_TINTED);
      this.byte_(xu_3.Q, Uk_1.final_);
      this.case_(xu_3.new_).class_(xu_3.sE).byte_(xu_3.bc).protected_(xu_3.bk).throws_(xu_3.PA).class_(xu_3.PO, xu_3.PN).case_(xu_3.Go).catch_(xu_3.Sm);
      this.catch_(xu_3.bF);
      this.private_(xu_3.BZ);
      this.finally_(xu_3.default_).byte_(xu_3.default_).class_(xu_3.s);
      this.finally_(xu_3.for_).byte_(xu_3.for_).class_(xu_3.h);
      this.class_(xu_3.return_, xu_3.SH, DX.NOT_TINTED);
      this.byte_(xu_3.W, Uk_1.final_);
      this.case_(xu_3.Xq).class_(xu_3.XU).byte_(xu_3.Xj).protected_(xu_3.XY).throws_(xu_3.XI).class_(xu_3.Jr, xu_3.JB).case_(xu_3.Xt).catch_(xu_3.XK);
      this.catch_(xu_3.Xa);
      this.private_(xu_3.Xg);
      this.finally_(xu_3.Xm).break_(xu_3.Xm).class_(xu_3.Xv);
      this.finally_(xu_3.XZ).break_(xu_3.XZ).class_(xu_3.XF);
      this.class_(xu_3.XA, xu_3.JW, DX.NOT_TINTED);
      this.native_(xu_3.Xp, xu_3.JQ);
      this.case_(xu_3.XT).class_(xu_3.Xe).byte_(xu_3.XV).protected_(xu_3.Xo).throws_(xu_3.Xf).class_(xu_3.JP, xu_3.JS).case_(xu_3.Xw).catch_(xu_3.XD);
      this.catch_(xu_3.Xi);
      this.private_(xu_3.XR);
      this.finally_(xu_3.Xx).break_(xu_3.Xx).class_(xu_3.Xk);
      this.finally_(xu_3.Xd).break_(xu_3.Xd).class_(xu_3.XW);
      this.class_(xu_3.XQ, xu_3.Jz, DX.NOT_TINTED);
      this.native_(xu_3.Xc, xu_3.JN);
      this.break_(xu_3.Xu, DX.NOT_TINTED);
      this.class_(rdy_3.ry);
      this.class_(Do_1.class_(xu_3.break_)).class_(var1 -> {
         rqO_2 var2 = Uh_1.byte_.class_(xu_3.break_, var1, this.break_);
         rqO_2 var3 = Uh_1.protected_.class_(xu_3.break_, var1, this.break_);
         this.class_.accept(class_(xu_3.break_, var2, var3));
         return var2;
      }).case_(xu_3.GU).throws_(xu_3.Pm).class_(xu_3.Pp).catch_(xu_3.hk);
      this.catch_(xu_3.PZ);
      this.implements_(xu_3.Eu);
      this.case_(xu_3.BL).break_(xu_3.hV).catch_(xu_3.Ba).case_(xu_3.bS);
      this.case_(xu_3.BA).break_(xu_3.hf).catch_(xu_3.hX).case_(xu_3.hF);
      this.case_(xu_3.volatile_).break_(xu_3.SF).catch_(xu_3.Pd).case_(xu_3.bP);
      this.case_(xu_3.rV).break_(xu_3.SL).catch_(xu_3.hx).case_(xu_3.hA);
      this.case_(xu_3.Em).break_(xu_3.hw).catch_(xu_3.EF).case_(xu_3.En);
      this.case_(xu_3.EZ).catch_(xu_3.EL).case_(xu_3.EC);
      this.case_(xu_3.Ev).catch_(xu_3.EA).case_(xu_3.El);
      this.protected_(xu_3.F, Uk_1.this_).break_(xu_3.ho).catch_(xu_3.Sd).case_(xu_3.Ga);
      this.class_(xu_3.bh, Uk_1.class_(Do_1.class_(xu_3.F, "_top"))).case_(xu_3.hC).catch_(xu_3.hW);
      this.class_(xu_3.A, Uk_1.byte_.get(xu_3.F).class_(var0 -> var0.class_(UX.implements_, Do_1.throw_(xu_3.A)))).case_(xu_3.Gi);
      this.protected_(xu_3.GI, Uk_1.this_).break_(xu_3.hI).catch_(xu_3.GV).case_(xu_3.bG);
      this.class_(xu_3.bJ, Uk_1.class_(Do_1.class_(xu_3.GI, "_top"))).case_(xu_3.hv).catch_(xu_3.hh);
      this.class_(xu_3.Gj, Uk_1.byte_.get(xu_3.GI).class_(var0 -> var0.class_(UX.implements_, Do_1.throw_(xu_3.Gj)))).case_(xu_3.bb);
      this.case_(xu_3.rI).break_(xu_3.ht).catch_(xu_3.Be).case_(xu_3.bB);
      this.case_(xu_3.SP).byte_(xu_3.SB).break_(xu_3.hg).catch_(xu_3.SS).case_(xu_3.bs);
      this.case_(xu_3.bH).catch_(xu_3.bp).case_(xu_3.bM);
      this.case_(xu_3.throws_).break_(xu_3.hD).catch_(xu_3.hm).case_(xu_3.hT);
      this.case_(xu_3.case_).catch_(xu_3.hJ).case_(xu_3.hL);
      this.case_(xu_3.byte_).break_(xu_3.hj).catch_(xu_3.hQ).case_(xu_3.hH);
      this.case_(xu_3.protected_).catch_(xu_3.hO).case_(xu_3.hZ);
      this.case_(xu_3.catch_).break_(xu_3.hR).catch_(xu_3.hN).case_(xu_3.hy);
      this.case_(xu_3.private_).catch_(xu_3.hu).case_(xu_3.hq);
      this.case_(xu_3.bq).break_(xu_3.hK).catch_(xu_3.hd).case_(xu_3.hn);
      this.protected_(xu_3.sH, Uk_1.byte_).catch_(xu_3.sq).case_(xu_3.bE);
      this.class_(xu_3.bX, Uk_1.class_(Do_1.class_(xu_3.sH, "_bottom"))).catch_(xu_3.hz).case_(xu_3.hl);
      this.case_(xu_3.bR).case_(xu_3.hp).catch_(xu_3.hc).break_(xu_3.hY);
      this.protected_(xu_3.Ju, Uk_1.else_).break_(xu_3.JZ).catch_(xu_3.Jm).case_(xu_3.Jv);
      this.case_(xu_3.JL).break_(xu_3.JH).catch_(xu_3.Jl).case_(xu_3.JC);
      this.case_(xu_3.JF).break_(xu_3.Jw).throws_(xu_3.JT).class_(xu_3.Jt).catch_(xu_3.Jp).case_(xu_3.Jq);
      this.new_();
      this.native_(xu_3.Px);
      this.volatile_(xu_3.o);
      this.volatile_(xu_3.K);
      this.volatile_(xu_3.sT);
      this.int_();
      this.final_(xu_3.SZ);
      this.final_(xu_3.bI);
      this.final_(xu_3.bf);
      this.package_(xu_3.sc);
      this.package_(xu_3.su);
      this.package_(xu_3.sm);
      this.extends_();
      this.native_();
      this.throws_(xu_3.Ps, Uk_1.catch_);
      this.throws_(xu_3.Xr, Uk_1.catch_);
      this.throws_(xu_3.hi, Uk_1.private_);
      this.package_();
      this.x();
      this.implements_(xu_3.BC, xu_3.BT);
      this.implements_(xu_3.volatile_, xu_3.BH);
      this.implements_(xu_3.Bn, xu_3.Bq);
      this.implements_(xu_3.BA, xu_3.Bp);
      this.J();
      this.implements_(xu_3.BL, xu_3.By);
      rkO_2.catch_().forEach(var1 -> this.class_(var1, DK.break_("template_spawn_egg")));
   }

   private DS class_(rec_3 var1, DS var2) {
      switch (var1) {
         case DOWN_NORTH:
            return var2.class_(Ds_1.class_, DE.R90);
         case DOWN_SOUTH:
            return var2.class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R180);
         case DOWN_WEST:
            return var2.class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R270);
         case DOWN_EAST:
            return var2.class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90);
         case UP_NORTH:
            return var2.class_(Ds_1.class_, DE.R270).class_(Ds_1.break_, DE.R180);
         case UP_SOUTH:
            return var2.class_(Ds_1.class_, DE.R270);
         case UP_WEST:
            return var2.class_(Ds_1.class_, DE.R270).class_(Ds_1.break_, DE.R90);
         case UP_EAST:
            return var2.class_(Ds_1.class_, DE.R270).class_(Ds_1.break_, DE.R270);
         case NORTH_UP:
            return var2;
         case SOUTH_UP:
            return var2.class_(Ds_1.break_, DE.R180);
         case WEST_UP:
            return var2.class_(Ds_1.break_, DE.R270);
         case EAST_UP:
            return var2.class_(Ds_1.break_, DE.R90);
         default:
            throw new UnsupportedOperationException("Rotation " + var1 + " can't be expressed with existing x and y values");
      }
   }

   private rqO_2 class_(Integer var1, Integer var2) {
      switch (var2) {
         case 0:
            return this.class_(var1.intValue(), "", Do_1.break_(Do_1.throw_(xu_3.OX)));
         case 1:
            return this.class_(var1.intValue(), "slightly_cracked_", Do_1.break_(Do_1.class_(xu_3.OX, "_slightly_cracked")));
         case 2:
            return this.class_(var1.intValue(), "very_cracked_", Do_1.break_(Do_1.class_(xu_3.OX, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private rqO_2 class_(int var1, String var2, Do_1 var3) {
      switch (var1) {
         case 1:
            return Uh_1.w.class_(DK.class_(var2 + "turtle_egg"), var3, this.break_);
         case 2:
            return Uh_1.I.class_(DK.class_("two_" + var2 + "turtle_eggs"), var3, this.break_);
         case 3:
            return Uh_1.f.class_(DK.class_("three_" + var2 + "turtle_eggs"), var3, this.break_);
         case 4:
            return Uh_1.j.class_(DK.class_("four_" + var2 + "turtle_eggs"), var3, this.break_);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void class_(xd_3 var1, rqO_2 var2, Do_1 var3) {
      rqO_2 var4 = Uh_1.p.class_(var1, var3, this.break_);
      this.class_.accept(Dp_1.class_(var1).class_(class_(rCT.catch_, var2, var4)).class_(throws_()));
   }

   private void class_(rdb_3 var1, rqO_2 var2) {
      this.break_.accept(DK.class_(var1), new DJ(var2));
   }

   private void class_(xd_3 var1, xd_3 var2) {
      this.class_.accept(byte_(var1, DK.class_(var2)));
   }

   void class_(xd_3 var1, rqO_2 var2) {
      this.break_.accept(DK.class_(var1.case_()), new DJ(var2));
   }

   private void class_(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.class_(var1, this.break_);
      this.class_.accept(protected_(var1, var3));
   }

   private void class_(xd_3 var1, xd_3 var2, xd_3 var3, xd_3 var4, xd_3 var5, xd_3 var6, xd_3 var7, xd_3 var8) {
      this.class_(var1, DX.NOT_TINTED);
      this.class_(var2, DX.NOT_TINTED);
      this.throws_(var3);
      this.throws_(var4);
      this.break_(var5, var7);
      this.break_(var6, var8);
   }

   private void class_(xd_3 var1, UW var2, UW var3) {
      rqO_2 var4 = var2.class_(var1, this.break_);
      rqO_2 var5 = var3.class_(var1, this.break_);
      this.class_.accept(protected_(var1, var4, var5));
   }

   private static Dp_1 class_(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.class_(
         var0,
         DS.class_().class_(Ds_1.byte_, var1),
         DS.class_().class_(Ds_1.byte_, var2),
         DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180),
         DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180)
      );
   }

   private void class_(xd_3 var1, DX var2) {
      this.break_(var1);
      this.break_(var1, var2);
   }

   private static DW<rpr_3, rCf_1, rCI, Boolean> class_(DW<rpr_3, rCf_1, rCI, Boolean> var0, rCf_1 var1, rqO_2 var2, rqO_2 var3) {
      return var0.class_(rpr_3.EAST, var1, rCI.LEFT, false, DS.class_().class_(Ds_1.byte_, var2))
         .class_(rpr_3.SOUTH, var1, rCI.LEFT, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.WEST, var1, rCI.LEFT, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.NORTH, var1, rCI.LEFT, false, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.EAST, var1, rCI.RIGHT, false, DS.class_().class_(Ds_1.byte_, var3))
         .class_(rpr_3.SOUTH, var1, rCI.RIGHT, false, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.WEST, var1, rCI.RIGHT, false, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.NORTH, var1, rCI.RIGHT, false, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.EAST, var1, rCI.LEFT, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.SOUTH, var1, rCI.LEFT, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.WEST, var1, rCI.LEFT, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.NORTH, var1, rCI.LEFT, true, DS.class_().class_(Ds_1.byte_, var3))
         .class_(rpr_3.EAST, var1, rCI.RIGHT, true, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.SOUTH, var1, rCI.RIGHT, true, DS.class_().class_(Ds_1.byte_, var2))
         .class_(rpr_3.WEST, var1, rCI.RIGHT, true, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.NORTH, var1, rCI.RIGHT, true, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180));
   }

   private void class_(xd_3 var1, DX var2, Do_1 var3) {
      this.break_(var1);
      this.break_(var1, var2, var3);
   }

   private static Dt_1 class_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4) {
      return Dp_1.class_(var0).class_(class_(class_(Dd_1.class_(rCT.strictfp_, rCT.G, rCT.f, rCT.else_), rCf_1.LOWER, var1, var2), rCf_1.UPPER, var3, var4));
   }

   static Dt_1 class_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dl_1.class_(var0)
         .class_(DI.class_().class_(rCT.long_, true), DS.class_().class_(Ds_1.byte_, var1))
         .class_(DI.class_().class_(rCT.switch_, zf_3.LOW), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.double_, zf_3.LOW), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.r, zf_3.LOW), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.P, zf_3.LOW), DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.switch_, zf_3.TALL), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.double_, zf_3.TALL), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.r, zf_3.TALL), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
         .class_(DI.class_().class_(rCT.P, zf_3.TALL), DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true));
   }

   private static Dd_1 class_(rCN var0, rqO_2 var1, rqO_2 var2) {
      return Dd_1.class_(var0).class_(true, DS.class_().class_(Ds_1.byte_, var1)).class_(false, DS.class_().class_(Ds_1.byte_, var2));
   }

   private void class_(xd_3 var1, xd_3 var2, DX var3) {
      this.class_(var1, var3);
      Do_1 var4 = Do_1.protected_(var1);
      rqO_2 var5 = var3.break_().class_(var2, var4, this.break_);
      this.class_.accept(byte_(var2, var5));
   }

   private void class_(xd_3 var1, Do_1 var2, DD var3) {
      rqO_2 var4 = var3.class_(var1, var2, this.break_);
      this.class_.accept(byte_(var1, var4));
   }

   private DM class_(xd_3 var1, Uk_1 var2) {
      return new DM(this, var2.break_()).class_(var1, var2.class_());
   }

   void class_(xd_3 var1) {
      this.byte_.accept(var1.case_());
   }

   void class_(rdb_3 var1) {
      Uh_1.g.class_(DK.class_(var1), Do_1.break_(var1), this.break_);
   }

   private static DS[] class_(rqO_2 var0) {
      return new DS[]{
         DS.class_().class_(Ds_1.byte_, var0),
         DS.class_().class_(Ds_1.byte_, var0).class_(Ds_1.break_, DE.R90),
         DS.class_().class_(Ds_1.byte_, var0).class_(Ds_1.break_, DE.R180),
         DS.class_().class_(Ds_1.byte_, var0).class_(Ds_1.break_, DE.R270)
      };
   }

   private DM class_(Do_1 var1) {
      return new DM(this, var1);
   }

   private void class_(xd_3 var1, String var2) {
      rdb_3 var3 = var1.case_();
      Uh_1.g.class_(DK.class_(var3), Do_1.implements_(Do_1.class_(var1, var2)), this.break_);
   }

   private rqO_2 class_(xd_3 var1, String var2, DD var3, Function<rqO_2, Do_1> var4) {
      return var3.class_(var1, var2, (Do_1)var4.apply(Do_1.class_(var1, var2)), this.break_);
   }

   private void default_() {
      this.break_(xu_3.Sr);
      this.class_.accept(break_(xu_3.Sr, DK.class_(xu_3.Sr)));
   }

   private void short_() {
      rqO_2 var1 = DK.class_(xu_3.Pu);
      rqO_2 var2 = DK.class_(xu_3.Pu, "_on");
      this.break_(xu_3.Pu);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Pu)
               .class_(class_(rCT.return_, var1, var2))
               .class_(
                  Dd_1.class_(rCT.transient_, rCT.strictfp_)
                     .class_(rCH.CEILING, rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180))
                     .class_(rCH.CEILING, rpr_3.EAST, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270))
                     .class_(rCH.CEILING, rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R180))
                     .class_(rCH.CEILING, rpr_3.WEST, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90))
                     .class_(rCH.FLOOR, rpr_3.NORTH, DS.class_())
                     .class_(rCH.FLOOR, rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90))
                     .class_(rCH.FLOOR, rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180))
                     .class_(rCH.FLOOR, rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270))
                     .class_(rCH.WALL, rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R90))
                     .class_(rCH.WALL, rpr_3.EAST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90))
                     .class_(rCH.WALL, rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R180))
                     .class_(rCH.WALL, rpr_3.WEST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R270))
               )
         );
   }

   private void void_() {
      this.class_.accept(break_(xu_3.bt, DK.class_(xu_3.bt)));
   }

   private void r() {
      Do_1 var1 = Do_1.else_(xu_3.PH);
      Do_1 var2 = Do_1.private_(Do_1.class_(xu_3.PH, "_off"));
      rqO_2 var3 = Uh_1.H.class_(xu_3.PH, var1, this.break_);
      rqO_2 var4 = Uh_1.H.class_(xu_3.PH, "_off", var2, this.break_);
      this.class_.accept(Dp_1.class_(xu_3.PH).class_(class_(rCT.continue_, var3, var4)));
      rqO_2 var5 = Uh_1.y.class_(xu_3.Py, var1, this.break_);
      rqO_2 var6 = Uh_1.y.class_(xu_3.Py, "_off", var2, this.break_);
      this.class_.accept(Dp_1.class_(xu_3.Py).class_(class_(rCT.continue_, var5, var6)).class_(protected_()));
      this.break_(xu_3.PH);
      this.class_(xu_3.Py);
   }

   static Dt_1 break_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4) {
      return Dp_1.class_(var0, DS.class_().class_(Ds_1.protected_, true))
         .class_(byte_())
         .class_(
            Dd_1.class_(rCT.new_, rCT.else_)
               .class_(false, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(true, false, DS.class_().class_(Ds_1.byte_, var4))
               .class_(false, true, DS.class_().class_(Ds_1.byte_, var1))
               .class_(true, true, DS.class_().class_(Ds_1.byte_, var3))
         );
   }

   private void break_(xd_3 var1) {
      rdb_3 var2 = var1.case_();
      if (var2 != rdy_3.class_) {
         Uh_1.g.class_(DK.class_(var2), Do_1.instanceof_(var1), this.break_);
      }
   }

   private void break_(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.class_(var1, this.break_);
      this.class_.accept(Dp_1.class_(var1, DS.class_().class_(Ds_1.byte_, var3)).class_(break_()));
   }

   private static Dd_1 break_() {
      return Dd_1.class_(rCT.strictfp_)
         .class_(rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.NORTH, DS.class_());
   }

   private void break_(xd_3 var1, xd_3 var2, DX var3) {
      this.break_(var1, var3);
      this.break_(var2, var3);
   }

   static Dt_1 break_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.class_(var0)
         .class_(
            Dd_1.class_(rCT.strictfp_, rCT.b, rCT.R)
               .class_(rpr_3.EAST, rCj_1.BOTTOM, rCK.STRAIGHT, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.WEST, rCj_1.BOTTOM, rCK.STRAIGHT, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.STRAIGHT, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rpr_3.NORTH, rCj_1.BOTTOM, rCK.STRAIGHT, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true))
               .class_(rpr_3.EAST, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.class_().class_(Ds_1.byte_, var3))
               .class_(
                  rpr_3.WEST, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.NORTH, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.EAST, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.WEST, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.class_().class_(Ds_1.byte_, var3))
               .class_(
                  rpr_3.NORTH, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.EAST, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.class_().class_(Ds_1.byte_, var1))
               .class_(
                  rpr_3.WEST, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.NORTH, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.EAST, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.WEST, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.class_().class_(Ds_1.byte_, var1))
               .class_(
                  rpr_3.NORTH, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.EAST, rCj_1.TOP, rCK.STRAIGHT, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R180).class_(Ds_1.protected_, true))
               .class_(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.NORTH, rCj_1.TOP, rCK.OUTER_RIGHT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.protected_, true))
               .class_(rpr_3.EAST, rCj_1.TOP, rCK.OUTER_LEFT, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.protected_, true))
               .class_(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(rpr_3.NORTH, rCj_1.TOP, rCK.INNER_RIGHT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.protected_, true))
               .class_(rpr_3.EAST, rCj_1.TOP, rCK.INNER_LEFT, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.protected_, true))
               .class_(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
         );
   }

   static Dt_1 break_(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.class_(var0)
         .class_(Dd_1.class_(rCT.return_).class_(false, DS.class_().class_(Ds_1.byte_, var1)).class_(true, DS.class_().class_(Ds_1.byte_, var2)))
         .class_(
            Dd_1.class_(rCT.transient_, rCT.strictfp_)
               .class_(rCH.FLOOR, rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90))
               .class_(rCH.FLOOR, rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270))
               .class_(rCH.FLOOR, rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180))
               .class_(rCH.FLOOR, rpr_3.NORTH, DS.class_())
               .class_(rCH.WALL, rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rCH.WALL, rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rCH.WALL, rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rCH.WALL, rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(rCH.CEILING, rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R270).class_(Ds_1.class_, DE.R180))
               .class_(rCH.CEILING, rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R90).class_(Ds_1.class_, DE.R180))
               .class_(rCH.CEILING, rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R180))
               .class_(rCH.CEILING, rpr_3.NORTH, DS.class_().class_(Ds_1.break_, DE.R180).class_(Ds_1.class_, DE.R180))
         );
   }

   private void break_(xd_3 var1, xd_3 var2) {
      Uk_1 var3 = Uk_1.extends_.get(var1);
      rqO_2 var4 = var3.class_(var1, this.break_);
      this.class_.accept(byte_(var1, var4));
      rqO_2 var5 = Uh_1.M.class_(var2, var3.break_(), this.break_);
      this.class_.accept(Dp_1.class_(var2, DS.class_().class_(Ds_1.byte_, var5)).class_(break_()));
      this.break_(var1);
   }

   private void break_(UW var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         rqO_2 var7 = var1.class_(var6, this.break_);
         this.class_.accept(Dp_1.class_(var6, DS.class_().class_(Ds_1.byte_, var7)).class_(byte_()));
      }
   }

   private static Dp_1 break_(xd_3 var0, rqO_2 var1) {
      return Dp_1.class_(var0, class_(var1));
   }

   private void break_(xd_3 var1, DX var2) {
      Do_1 var3 = Do_1.byte_(var1);
      this.break_(var1, var2, var3);
   }

   private void break_(xd_3 var1, DX var2, Do_1 var3) {
      rqO_2 var4 = var2.class_().class_(var1, var3, this.break_);
      this.class_.accept(byte_(var1, var4));
   }

   private void throws_(xd_3 var1) {
      this.byte_(var1, Uk_1.class_);
   }

   static Dt_1 throws_(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.class_(var0).class_(class_(rCT.return_, var2, var1));
   }

   private void throws_(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.class_(var1, this.break_);
      rqO_2 var4 = Do_1.class_(var1, "_front_on");
      rqO_2 var5 = var2.get(var1).class_(var1x -> var1x.class_(UX.catch_, var4)).class_(var1, "_on", this.break_);
      this.class_.accept(Dp_1.class_(var1).class_(class_(rCT.continue_, var5, var3)).class_(break_()));
   }

   private void throws_(xd_3 var1, xd_3 var2) {
      this.byte_(var1, Uk_1.class_);
      rqO_2 var3 = Uk_1.implements_.get(var1).class_(var2, this.break_);
      this.class_.accept(byte_(var2, var3));
   }

   private static Dd_1 throws_() {
      return Dd_1.class_(rCT.default_)
         .class_(rpr_3.DOWN, DS.class_().class_(Ds_1.class_, DE.R90))
         .class_(rpr_3.UP, DS.class_().class_(Ds_1.class_, DE.R270))
         .class_(rpr_3.NORTH, DS.class_())
         .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90));
   }

   static Dt_1 throws_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.class_(var0)
         .class_(
            Dd_1.class_(rCT.g)
               .class_(rCo_1.BOTTOM, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rCo_1.TOP, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rCo_1.DOUBLE, DS.class_().class_(Ds_1.byte_, var3))
         );
   }

   private void throws_(xd_3 var1, rqO_2 var2) {
      this.class_.accept(protected_(var1, var2));
   }

   private void M() {
      this.break_(xu_3.Sz);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Sz)
               .class_(
                  Dd_1.class_(rCT.class_, rCT.return_)
                     .class_((var0, var1) -> DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.Sz, (var0 ? "_attached" : "") + (var1 ? "_on" : ""))))
               )
               .class_(break_())
         );
   }

   private void P() {
      this.class_(rdy_3.Or);
      this.class_.accept(Dp_1.class_(xu_3.BS).class_(Dd_1.class_(rCT.Q, rCT.super_, rCT.return_).class_((var0, var1, var2) -> {
         StringBuilder var3 = new StringBuilder();
         var3.append('_').append(var0).append("tick");
         if (var2) {
            var3.append("_on");
         }

         if (var1) {
            var3.append("_locked");
         }

         return DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.BS, var3.toString()));
      })).class_(byte_()));
   }

   private void finally_(xd_3 var1, xd_3 var2) {
      Do_1 var3 = Do_1.else_(var1);
      this.class_.accept(byte_(var1, Uh_1.H.class_(var1, var3, this.break_)));
      this.class_.accept(Dp_1.class_(var2, DS.class_().class_(Ds_1.byte_, Uh_1.y.class_(var2, var3, this.break_))).class_(protected_()));
      this.break_(var1);
      this.class_(var2);
   }

   private Dh_1 finally_(xd_3 var1) {
      return new Dh_1(this, Do_1.native_(var1));
   }

   private Dd_1 finally_() {
      return Dd_1.class_(rCT.default_)
         .class_(rpr_3.DOWN, DS.class_().class_(Ds_1.class_, DE.R180))
         .class_(rpr_3.UP, DS.class_())
         .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R90))
         .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.WEST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R270))
         .class_(rpr_3.EAST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90));
   }

   private void catch_(xd_3 var1, xd_3 var2) {
      Do_1 var3 = new Do_1().class_(UX.protected_, Do_1.class_(var2, "_top")).class_(UX.implements_, Do_1.throw_(var1));
      this.class_(var1, var3, Uh_1.throws_);
   }

   private void catch_(xd_3 var1) {
      Do_1 var2 = Do_1.int_(var1);
      rqO_2 var3 = Uh_1.package_.class_(var1, var2, this.break_);
      rqO_2 var4 = Uh_1.int_.class_(var1, var2, this.break_);
      rqO_2 var5 = Uh_1.new_.class_(var1, var2, this.break_);
      rqO_2 var6 = Uh_1.continue_.class_(var1, var2, this.break_);
      this.class_(var1.case_());
      this.class_.accept(class_(var1, var3, var4, var5, var6));
   }

   private void catch_() {
      this.class_(xu_3.Gr, "_front");
      rqO_2 var1 = DK.class_(xu_3.Gr, "_top");
      rqO_2 var2 = this.class_(xu_3.Gr, "_bottom", DX.NOT_TINTED.class_(), Do_1::byte_);
      this.case_(xu_3.Gr, var1, var2);
   }

   private void G() {
      this.class_(rdy_3.WQ);
      this.class_
         .accept(
            Dp_1.class_(xu_3.XJ)
               .class_(Dd_1.class_(rCT.J).class_(var1 -> DS.class_().class_(Ds_1.byte_, this.class_(xu_3.XJ, "_stage" + var1, Uh_1.double_, Do_1::byte_))))
         );
   }

   private void O() {
      this.class_(rdy_3.bq);
      this.class_.accept(Dp_1.class_(xu_3.OX).class_(Dd_1.class_(rCT.c, rCT.u).break_((var1, var2) -> Arrays.asList(class_(this.class_(var1, var2))))));
   }

   private void extends_(xd_3 var1, xd_3 var2) {
      Uh_1.K.class_(DK.class_(var1.case_()), Do_1.new_(var2), this.break_);
   }

   private void extends_(xd_3 var1) {
      this.class_(var1, var1);
   }

   private void extends_() {
      rqO_2 var1 = Do_1.class_(xu_3.ha, "_top_open");
      this.class_
         .accept(
            Dp_1.class_(xu_3.ha)
               .class_(this.finally_())
               .class_(
                  Dd_1.class_(rCT.else_)
                     .class_(false, DS.class_().class_(Ds_1.byte_, Uk_1.throws_.class_(xu_3.ha, this.break_)))
                     .class_(
                        true,
                        DS.class_()
                           .class_(Ds_1.byte_, Uk_1.throws_.get(xu_3.ha).class_(var1x -> var1x.class_(UX.case_, var1)).class_(xu_3.ha, "_open", this.break_))
                     )
               )
         );
   }

   private void goto_(xd_3 var1) {
      this.byte_(var1, Uk_1.native_);
      Uh_1.o.class_(DK.class_(var1.case_()), Do_1.new_(var1), this.break_);
   }

   private void goto_() {
      rqO_2 var1 = DK.class_(xu_3.SO);
      rqO_2 var2 = DK.class_(xu_3.SO, "_filled");
      this.class_
         .accept(
            Dp_1.class_(xu_3.SO)
               .class_(Dd_1.class_(rCT.private_).class_(false, DS.class_().class_(Ds_1.byte_, var1)).class_(true, DS.class_().class_(Ds_1.byte_, var2)))
               .class_(byte_())
         );
   }

   private void case_(xd_3 var1, rqO_2 var2) {
      rqO_2 var3 = Uh_1.abstract_.class_(var1, Do_1.catch_(var2), this.break_);
      this.class_.accept(byte_(var1, var3));
   }

   private DM case_(xd_3 var1) {
      return this.protected_(var1, Uk_1.class_);
   }

   private void case_(xd_3 var1, rqO_2 var2, rqO_2 var3) {
      this.class_
         .accept(
            Dp_1.class_(var1)
               .class_(Dd_1.class_(rCT.G).class_(rCf_1.LOWER, DS.class_().class_(Ds_1.byte_, var3)).class_(rCf_1.UPPER, DS.class_().class_(Ds_1.byte_, var2)))
         );
   }

   private void case_(xd_3 var1, xd_3 var2) {
      this.throws_(var1);
      Do_1 var3 = Do_1.break_(var1, var2);
      rqO_2 var4 = Uh_1.d.class_(var2, var3, this.break_);
      rqO_2 var5 = Uh_1.k.class_(var2, var3, this.break_);
      rqO_2 var6 = Uh_1.W.class_(var2, var3, this.break_);
      rqO_2 var7 = Uh_1.J.class_(var2, var3, this.break_);
      rqO_2 var8 = Uh_1.x.class_(var2, var3, this.break_);
      rdb_3 var9 = var2.case_();
      Uh_1.g.class_(DK.class_(var9), Do_1.instanceof_(var1), this.break_);
      this.class_
         .accept(
            Dl_1.class_(var2)
               .class_(DS.class_().class_(Ds_1.byte_, var4))
               .class_(DI.class_().class_(rCT.void_, true), DS.class_().class_(Ds_1.byte_, var5))
               .class_(DI.class_().class_(rCT.static_, true), DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R90))
               .class_(DI.class_().class_(rCT.import_, true), DS.class_().class_(Ds_1.byte_, var6))
               .class_(DI.class_().class_(rCT.short_, true), DS.class_().class_(Ds_1.byte_, var6).class_(Ds_1.break_, DE.R90))
               .class_(DI.class_().class_(rCT.void_, false), DS.class_().class_(Ds_1.byte_, var7))
               .class_(DI.class_().class_(rCT.static_, false), DS.class_().class_(Ds_1.byte_, var8))
               .class_(DI.class_().class_(rCT.import_, false), DS.class_().class_(Ds_1.byte_, var8).class_(Ds_1.break_, DE.R90))
               .class_(DI.class_().class_(rCT.short_, false), DS.class_().class_(Ds_1.byte_, var7).class_(Ds_1.break_, DE.R270))
         );
   }

   private static Dd_1 case_() {
      return Dd_1.class_(rCT.abstract_)
         .class_(rpB_2.Y, DS.class_())
         .class_(rpB_2.Z, DS.class_().class_(Ds_1.class_, DE.R90))
         .class_(rpB_2.X, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90));
   }

   private void const_() {
      this.class_
         .accept(
            Dp_1.class_(xu_3.Pi)
               .class_(
                  Dd_1.class_(rCT.char_)
                     .class_(rpB_2.X, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Pi, "_ns")))
                     .class_(rpB_2.Z, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Pi, "_ew")))
               )
         );
   }

   private void continue_() {
      this.class_(rdy_3.Jp);
      this.class_
         .accept(
            Dl_1.class_(xu_3.SG)
               .class_(DS.class_().class_(Ds_1.byte_, Do_1.throw_(xu_3.SG)))
               .class_(DI.class_().class_(rCT.extends_, true), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_bottle0")))
               .class_(DI.class_().class_(rCT.native_, true), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_bottle1")))
               .class_(DI.class_().class_(rCT.volatile_, true), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_bottle2")))
               .class_(DI.class_().class_(rCT.extends_, false), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_empty0")))
               .class_(DI.class_().class_(rCT.native_, false), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_empty1")))
               .class_(DI.class_().class_(rCT.volatile_, false), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.SG, "_empty2")))
         );
   }

   private void continue_(xd_3 var1) {
      Do_1 var2 = new Do_1().class_(UX.throws_, Do_1.throw_(xu_3.PR)).class_(UX.case_, Do_1.throw_(var1)).class_(UX.implements_, Do_1.class_(var1, "_side"));
      this.class_.accept(byte_(var1, Uh_1.private_.class_(var1, var2, this.break_)));
   }

   private void else_() {
      Do_1 var1 = new Do_1()
         .class_(UX.byte_, Do_1.class_(xu_3.XE, "_front"))
         .class_(UX.package_, Do_1.class_(xu_3.XE, "_bottom"))
         .class_(UX.final_, Do_1.class_(xu_3.XE, "_top"))
         .class_(UX.finally_, Do_1.class_(xu_3.XE, "_front"))
         .class_(UX.extends_, Do_1.class_(xu_3.XE, "_front"))
         .class_(UX.native_, Do_1.class_(xu_3.XE, "_side"))
         .class_(UX.volatile_, Do_1.class_(xu_3.XE, "_side"));
      this.class_.accept(byte_(xu_3.XE, Uh_1.class_.class_(xu_3.XE, var1, this.break_)));
   }

   private List<rqO_2> else_(xd_3 var1) {
      rqO_2 var2 = Uh_1.v.class_(DK.class_(var1, "_side0"), Do_1.continue_(var1), this.break_);
      rqO_2 var3 = Uh_1.v.class_(DK.class_(var1, "_side1"), Do_1.super_(var1), this.break_);
      rqO_2 var4 = Uh_1.F.class_(DK.class_(var1, "_side_alt0"), Do_1.continue_(var1), this.break_);
      rqO_2 var5 = Uh_1.F.class_(DK.class_(var1, "_side_alt1"), Do_1.super_(var1), this.break_);
      return ImmutableList.of(var2, var3, var4, var5);
   }

   private void for_() {
      Do_1 var1 = new Do_1().class_(UX.abstract_, Do_1.class_(xu_3.rB, "_top")).class_(UX.implements_, Do_1.class_(xu_3.rB, "_side"));
      Do_1 var2 = var1.break_(UX.char_, Do_1.class_(xu_3.rB, "_top_sticky"));
      Do_1 var3 = var1.break_(UX.char_, Do_1.class_(xu_3.rB, "_top"));
      this.class_
         .accept(
            Dp_1.class_(xu_3.rS)
               .class_(
                  Dd_1.class_(rCT.public_, rCT.V)
                     .class_(false, rCg_1.DEFAULT, DS.class_().class_(Ds_1.byte_, Uh_1.q.class_(xu_3.rB, "_head", var3, this.break_)))
                     .class_(false, rCg_1.STICKY, DS.class_().class_(Ds_1.byte_, Uh_1.q.class_(xu_3.rB, "_head_sticky", var2, this.break_)))
                     .class_(true, rCg_1.DEFAULT, DS.class_().class_(Ds_1.byte_, Uh_1.T.class_(xu_3.rB, "_head_short", var3, this.break_)))
                     .class_(true, rCg_1.STICKY, DS.class_().class_(Ds_1.byte_, Uh_1.T.class_(xu_3.rB, "_head_short_sticky", var2, this.break_)))
               )
               .class_(throws_())
         );
   }

   private void implements_() {
      this.class_(xu_3.hs);
      this.class_
         .accept(
            Dl_1.class_(xu_3.hs)
               .class_(DI.class_().class_(rCT.h, 0), this.class_(0))
               .class_(DI.class_().class_(rCT.h, 1), this.class_(1))
               .class_(DI.class_().class_(rCT.o, rCy_1.SMALL), DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.hs, "_small_leaves")))
               .class_(DI.class_().class_(rCT.o, rCy_1.LARGE), DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.hs, "_large_leaves")))
         );
   }

   private void implements_(xd_3 var1, xd_3 var2) {
      rqO_2 var3 = DK.class_(var1);
      this.class_.accept(Dp_1.class_(var2, DS.class_().class_(Ds_1.byte_, var3)));
      this.class_(var2, var3);
   }

   private void implements_(xd_3 var1) {
      Do_1 var2 = Do_1.break_(var1);
      rqO_2 var3 = Uh_1.default_.class_(var1, var2, this.break_);
      rqO_2 var4 = Uh_1.const_.class_(var1, var2, this.break_);
      rqO_2 var5 = Uh_1.strictfp_.class_(var1, var2, this.break_);
      this.class_.accept(protected_(var1, var3, var4, var5));
      this.class_(var1, var4);
   }

   private void import_() {
      rqO_2 var1 = DK.class_(xu_3.Bf, "_post_ends");
      rqO_2 var2 = DK.class_(xu_3.Bf, "_post");
      rqO_2 var3 = DK.class_(xu_3.Bf, "_cap");
      rqO_2 var4 = DK.class_(xu_3.Bf, "_cap_alt");
      rqO_2 var5 = DK.class_(xu_3.Bf, "_side");
      rqO_2 var6 = DK.class_(xu_3.Bf, "_side_alt");
      this.class_
         .accept(
            Dl_1.class_(xu_3.Bf)
               .class_(DS.class_().class_(Ds_1.byte_, var1))
               .class_(
                  DI.class_().class_(rCT.void_, false).class_(rCT.static_, false).class_(rCT.import_, false).class_(rCT.short_, false),
                  DS.class_().class_(Ds_1.byte_, var2)
               )
               .class_(
                  DI.class_().class_(rCT.void_, true).class_(rCT.static_, false).class_(rCT.import_, false).class_(rCT.short_, false),
                  DS.class_().class_(Ds_1.byte_, var3)
               )
               .class_(
                  DI.class_().class_(rCT.void_, false).class_(rCT.static_, true).class_(rCT.import_, false).class_(rCT.short_, false),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90)
               )
               .class_(
                  DI.class_().class_(rCT.void_, false).class_(rCT.static_, false).class_(rCT.import_, true).class_(rCT.short_, false),
                  DS.class_().class_(Ds_1.byte_, var4)
               )
               .class_(
                  DI.class_().class_(rCT.void_, false).class_(rCT.static_, false).class_(rCT.import_, false).class_(rCT.short_, true),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R90)
               )
               .class_(DI.class_().class_(rCT.void_, true), DS.class_().class_(Ds_1.byte_, var5))
               .class_(DI.class_().class_(rCT.static_, true), DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R90))
               .class_(DI.class_().class_(rCT.import_, true), DS.class_().class_(Ds_1.byte_, var6))
               .class_(DI.class_().class_(rCT.short_, true), DS.class_().class_(Ds_1.byte_, var6).class_(Ds_1.break_, DE.R90))
         );
      this.break_(xu_3.Bf);
   }

   private void instanceof_() {
      rqO_2 var1 = Do_1.class_(xu_3.sA, "_side");
      Do_1 var2 = new Do_1().class_(UX.case_, Do_1.class_(xu_3.sA, "_top")).class_(UX.implements_, var1);
      Do_1 var3 = new Do_1().class_(UX.case_, Do_1.class_(xu_3.sA, "_inverted_top")).class_(UX.implements_, var1);
      this.class_
         .accept(
            Dp_1.class_(xu_3.sA)
               .class_(
                  Dd_1.class_(rCT.int_)
                     .class_(false, DS.class_().class_(Ds_1.byte_, Uh_1.X.class_(xu_3.sA, var2, this.break_)))
                     .class_(true, DS.class_().class_(Ds_1.byte_, Uh_1.X.class_(DK.class_(xu_3.sA, "_inverted"), var3, this.break_)))
               )
         );
   }

   private void new_() {
      Do_1 var1 = Do_1.class_(xu_3.bO);
      Do_1 var2 = Do_1.class_(Do_1.class_(xu_3.Ge, "_side"), var1.class_(UX.case_));
      rqO_2 var3 = Uh_1.long_.class_(xu_3.Ge, var2, this.break_);
      rqO_2 var4 = Uh_1.float_.class_(xu_3.Ge, var2, this.break_);
      rqO_2 var5 = Uh_1.throws_.break_(xu_3.Ge, "_double", var2, this.break_);
      this.class_.accept(throws_(xu_3.Ge, var3, var4, var5));
      this.class_.accept(byte_(xu_3.bO, Uh_1.byte_.class_(xu_3.bO, var1, this.break_)));
   }

   private void new_(xd_3 var1) {
      Do_1 var2 = new Do_1()
         .class_(UX.case_, Do_1.class_(xu_3.Ps, "_top"))
         .class_(UX.implements_, Do_1.class_(xu_3.Ps, "_side"))
         .class_(UX.catch_, Do_1.class_(var1, "_front"));
      Do_1 var3 = new Do_1().class_(UX.implements_, Do_1.class_(xu_3.Ps, "_top")).class_(UX.catch_, Do_1.class_(var1, "_front_vertical"));
      rqO_2 var4 = Uh_1.implements_.class_(var1, var2, this.break_);
      rqO_2 var5 = Uh_1.extends_.class_(var1, var3, this.break_);
      this.class_
         .accept(
            Dp_1.class_(var1)
               .class_(
                  Dd_1.class_(rCT.default_)
                     .class_(rpr_3.DOWN, DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.class_, DE.R180))
                     .class_(rpr_3.UP, DS.class_().class_(Ds_1.byte_, var5))
                     .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.byte_, var4))
                     .class_(rpr_3.EAST, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R180))
                     .class_(rpr_3.WEST, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R270))
               )
         );
   }

   private void package_(xd_3 var1) {
      rqO_2 var2 = Uk_1.volatile_.class_(var1, this.break_);
      this.class_.accept(byte_(var1, var2).class_(byte_()));
   }

   private void package_() {
      this.class_(rdy_3.hD);
      this.class_
         .accept(
            Dl_1.class_(xu_3.ra)
               .class_(
                  DI.class_(
                     DI.class_().class_(rCT.S, rCY.NONE).class_(rCT.B, rCY.NONE).class_(rCT.s, rCY.NONE).class_(rCT.E, rCY.NONE),
                     DI.class_().class_(rCT.S, rCY.SIDE, rCY.UP).class_(rCT.B, rCY.SIDE, rCY.UP),
                     DI.class_().class_(rCT.B, rCY.SIDE, rCY.UP).class_(rCT.s, rCY.SIDE, rCY.UP),
                     DI.class_().class_(rCT.s, rCY.SIDE, rCY.UP).class_(rCT.E, rCY.SIDE, rCY.UP),
                     DI.class_().class_(rCT.E, rCY.SIDE, rCY.UP).class_(rCT.S, rCY.SIDE, rCY.UP)
                  ),
                  DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_dot"))
               )
               .class_(DI.class_().class_(rCT.S, rCY.SIDE, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_side0")))
               .class_(DI.class_().class_(rCT.s, rCY.SIDE, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_side_alt0")))
               .class_(
                  DI.class_().class_(rCT.B, rCY.SIDE, rCY.UP),
                  DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_side_alt1")).class_(Ds_1.break_, DE.R270)
               )
               .class_(
                  DI.class_().class_(rCT.E, rCY.SIDE, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_side1")).class_(Ds_1.break_, DE.R270)
               )
               .class_(DI.class_().class_(rCT.S, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_up")))
               .class_(DI.class_().class_(rCT.B, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_up")).class_(Ds_1.break_, DE.R90))
               .class_(DI.class_().class_(rCT.s, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_up")).class_(Ds_1.break_, DE.R180))
               .class_(DI.class_().class_(rCT.E, rCY.UP), DS.class_().class_(Ds_1.byte_, DK.class_("redstone_dust_up")).class_(Ds_1.break_, DE.R270))
         );
   }

   private void return_(xd_3 var1) {
      rqO_2 var2 = Uk_1.package_.class_(var1, this.break_);
      rqO_2 var3 = Uk_1.int_.class_(var1, this.break_);
      this.class_(var1.case_());
      this.class_.accept(Dp_1.class_(var1).class_(class_(rCT.finally_, var3, var2)));
   }

   private void return_() {
      this.class_(rdy_3.Jq);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Sb)
               .class_(
                  Dd_1.class_(rCT.Z)
                     .class_(0, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sb)))
                     .class_(1, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sb, "_level1")))
                     .class_(2, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sb, "_level2")))
                     .class_(3, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.Sb, "_level3")))
               )
         );
   }

   private void super_() {
      this.class_(rdy_3.Xo);
      this.class_
         .accept(
            Dp_1.class_(xu_3.BB)
               .class_(
                  Dd_1.class_(rCT.z)
                     .class_(0, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB)))
                     .class_(1, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice1")))
                     .class_(2, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice2")))
                     .class_(3, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice3")))
                     .class_(4, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice4")))
                     .class_(5, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice5")))
                     .class_(6, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.BB, "_slice6")))
               )
         );
   }

   private void super_(xd_3 var1) {
      this.class_.accept(Dp_1.class_(var1, DS.class_().class_(Ds_1.byte_, DK.class_(var1))).class_(this.finally_()));
   }

   private void switch_() {
      rqO_2 var1 = Uk_1.class_.class_(xu_3.SJ, this.break_);
      rqO_2 var2 = this.class_(xu_3.SJ, "_on", Uh_1.byte_, Do_1::break_);
      this.class_.accept(Dp_1.class_(xu_3.SJ).class_(class_(rCT.continue_, var2, var1)));
   }

   private void throw_() {
      Do_1 var1 = new Do_1().class_(UX.instanceof_, Do_1.throw_(xu_3.finally_)).class_(UX.case_, Do_1.throw_(xu_3.PS));
      Do_1 var2 = new Do_1().class_(UX.instanceof_, Do_1.throw_(xu_3.finally_)).class_(UX.case_, Do_1.class_(xu_3.PS, "_moist"));
      rqO_2 var3 = Uh_1.m.class_(xu_3.PS, var1, this.break_);
      rqO_2 var4 = Uh_1.m.class_(Do_1.class_(xu_3.PS, "_moist"), var2, this.break_);
      this.class_.accept(Dp_1.class_(xu_3.PS).class_(class_(rCT.n, 7, var4, var3)));
   }

   private void try_() {
      this.class_
         .accept(
            Dl_1.class_(xu_3.JG)
               .class_(DS.class_().class_(Ds_1.byte_, Do_1.throw_(xu_3.JG)))
               .class_(DI.class_().class_(rCT.v, 1), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents1")))
               .class_(DI.class_().class_(rCT.v, 2), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents2")))
               .class_(DI.class_().class_(rCT.v, 3), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents3")))
               .class_(DI.class_().class_(rCT.v, 4), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents4")))
               .class_(DI.class_().class_(rCT.v, 5), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents5")))
               .class_(DI.class_().class_(rCT.v, 6), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents6")))
               .class_(DI.class_().class_(rCT.v, 7), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents7")))
               .class_(DI.class_().class_(rCT.v, 8), DS.class_().class_(Ds_1.byte_, Do_1.class_(xu_3.JG, "_contents_ready")))
         );
   }

   private void while_() {
      rqO_2 var1 = DK.class_(xu_3.bC, "_side");
      rqO_2 var2 = DK.class_(xu_3.bC, "_noside");
      rqO_2 var3 = DK.class_(xu_3.bC, "_noside1");
      rqO_2 var4 = DK.class_(xu_3.bC, "_noside2");
      rqO_2 var5 = DK.class_(xu_3.bC, "_noside3");
      this.class_
         .accept(
            Dl_1.class_(xu_3.bC)
               .class_(DI.class_().class_(rCT.void_, true), DS.class_().class_(Ds_1.byte_, var1))
               .class_(DI.class_().class_(rCT.static_, true), DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.import_, true), DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.short_, true), DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.long_, true), DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true))
               .class_(DI.class_().class_(rCT.float_, true), DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true))
               .class_(
                  DI.class_().class_(rCT.void_, false),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2),
                  DS.class_().class_(Ds_1.byte_, var3),
                  DS.class_().class_(Ds_1.byte_, var4),
                  DS.class_().class_(Ds_1.byte_, var5)
               )
               .class_(
                  DI.class_().class_(rCT.static_, false),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2).class_(Ds_1.break_, DE.R90).class_(Ds_1.protected_, true)
               )
               .class_(
                  DI.class_().class_(rCT.import_, false),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180).class_(Ds_1.protected_, true)
               )
               .class_(
                  DI.class_().class_(rCT.short_, false),
                  DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  DI.class_().class_(rCT.long_, false),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.class_, DE.R270).class_(Ds_1.protected_, true)
               )
               .class_(
                  DI.class_().class_(rCT.float_, false),
                  DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true),
                  DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.throws_, 2).class_(Ds_1.class_, DE.R90).class_(Ds_1.protected_, true)
               )
         );
   }

   private void static_() {
      rqO_2 var1 = DK.class_(xu_3.sl);
      rqO_2 var2 = DK.class_(xu_3.sl, "_side");
      this.class_(rdy_3.sz);
      this.class_
         .accept(
            Dp_1.class_(xu_3.sl)
               .class_(
                  Dd_1.class_(rCT.const_)
                     .class_(rpr_3.DOWN, DS.class_().class_(Ds_1.byte_, var1))
                     .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.byte_, var2))
                     .class_(rpr_3.EAST, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180))
                     .class_(rpr_3.WEST, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270))
               )
         );
   }

   private void public_() {
      Do_1 var1 = Do_1.break_(xu_3.bl);
      rqO_2 var2 = Uh_1.h.class_(xu_3.bl, var1, this.break_);
      rqO_2 var3 = this.class_(xu_3.bl, "_dead", Uh_1.h, var1x -> var1.break_(UX.break_, var1x));
      this.class_.accept(Dp_1.class_(xu_3.bl).class_(class_(rCT.x, 5, var3, var2)));
   }

   private void public_(xd_3 var1) {
      this.class_.accept(Dp_1.class_(var1, DS.class_().class_(Ds_1.byte_, DK.class_(var1))).class_(break_()));
   }

   private static Dt_1 protected_(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.class_(var0)
         .class_(
            Dd_1.class_(rCT.strictfp_, rCT.b, rCT.else_)
               .class_(rpr_3.NORTH, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.EAST, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.WEST, rCj_1.BOTTOM, false, DS.class_().class_(Ds_1.byte_, var2))
               .class_(rpr_3.NORTH, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpr_3.SOUTH, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpr_3.EAST, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpr_3.WEST, rCj_1.TOP, false, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpr_3.NORTH, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3))
               .class_(rpr_3.SOUTH, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.EAST, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
               .class_(rpr_3.WEST, rCj_1.BOTTOM, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
               .class_(rpr_3.NORTH, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3))
               .class_(rpr_3.SOUTH, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
               .class_(rpr_3.EAST, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
               .class_(rpr_3.WEST, rCj_1.TOP, true, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
         );
   }

   private static Dd_1 protected_() {
      return Dd_1.class_(rCT.strictfp_)
         .class_(rpr_3.EAST, DS.class_())
         .class_(rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R90))
         .class_(rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R180))
         .class_(rpr_3.NORTH, DS.class_().class_(Ds_1.break_, DE.R270));
   }

   static Dt_1 protected_(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.class_(var0)
         .class_(
            Dd_1.class_(rCT.abstract_)
               .class_(rpB_2.Y, DS.class_().class_(Ds_1.byte_, var1))
               .class_(rpB_2.Z, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R90))
               .class_(rpB_2.X, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90))
         );
   }

   private DM protected_(xd_3 var1, UW var2) {
      Uk_1 var3 = var2.get(var1);
      return new DM(this, var3.break_()).class_(var1, var3.class_());
   }

   private DO protected_(xd_3 var1, xd_3 var2) {
      return new DO(this, DK.class_(var1), var2);
   }

   private void protected_(xd_3 var1) {
      rqO_2 var2 = Uk_1.class_.class_(var1, this.break_);
      this.class_.accept(break_(var1, var2));
   }

   static Dt_1 protected_(xd_3 var0, rqO_2 var1) {
      return Dp_1.class_(var0, DS.class_().class_(Ds_1.byte_, var1)).class_(case_());
   }

   private void private_(xd_3 var1, xd_3 var2) {
      Do_1 var3 = Do_1.break_(var2);
      rqO_2 var4 = Uh_1.interface_.class_(var1, var3, this.break_);
      rqO_2 var5 = Uh_1.char_.class_(var1, var3, this.break_);
      this.class_.accept(Dp_1.class_(var1).class_(class_(rCT.H, 1, var5, var4)));
   }

   private void private_(xd_3 var1) {
      Do_1 var2 = Do_1.break_(var1);
      rqO_2 var3 = Uh_1.boolean_.class_(var1, var2, this.break_);
      rqO_2 var4 = Uh_1.transient_.class_(var1, var2, this.break_);
      rqO_2 var5 = Uh_1.for_.class_(var1, var2, this.break_);
      this.class_.accept(byte_(var1, var3, var4, var5));
      this.class_(var1, var4);
   }

   private void private_() {
      rqO_2 var1 = this.class_(xu_3.rP, "_top", Uh_1.t, Do_1::class_);
      rqO_2 var2 = this.class_(xu_3.rP, "_bottom", Uh_1.t, Do_1::class_);
      this.case_(xu_3.rP, var1, var2);
   }

   private void abstract_() {
      this.class_
         .accept(
            Dp_1.class_(xu_3.bj)
               .class_(
                  Dd_1.class_(rCT.J)
                     .class_(0, DS.class_().class_(Ds_1.byte_, this.class_(xu_3.bj, "_0", Uh_1.byte_, Do_1::break_)))
                     .class_(1, DS.class_().class_(Ds_1.byte_, this.class_(xu_3.bj, "_1", Uh_1.byte_, Do_1::break_)))
                     .class_(2, DS.class_().class_(Ds_1.byte_, this.class_(xu_3.bj, "_2", Uh_1.byte_, Do_1::break_)))
                     .class_(3, DS.class_().class_(Ds_1.byte_, this.class_(xu_3.bj, "_3", Uh_1.byte_, Do_1::break_)))
               )
         );
   }

   private void final_() {
      Do_1 var1 = Do_1.class_(Do_1.throw_(xu_3.rj), Do_1.throw_(xu_3.final_));
      rqO_2 var2 = Uh_1.throws_.class_(xu_3.rj, var1, this.break_);
      this.class_.accept(byte_(xu_3.rj, var2));
   }

   private void final_(xd_3 var1) {
      Do_1 var2 = Do_1.synchronized_(var1);
      rqO_2 var3 = Uh_1.z.class_(var1, var2, this.break_);
      rqO_2 var4 = this.class_(var1, "_conditional", Uh_1.z, var1x -> var2.break_(UX.implements_, var1x));
      this.class_.accept(Dp_1.class_(var1).class_(class_(rCT.byte_, var4, var3)).class_(throws_()));
   }

   private void transient_() {
      Do_1 var1 = new Do_1().class_(UX.throws_, Do_1.class_(xu_3.rB, "_bottom")).class_(UX.implements_, Do_1.class_(xu_3.rB, "_side"));
      rqO_2 var2 = Do_1.class_(xu_3.rB, "_top_sticky");
      rqO_2 var3 = Do_1.class_(xu_3.rB, "_top");
      Do_1 var4 = var1.break_(UX.char_, var2);
      Do_1 var5 = var1.break_(UX.char_, var3);
      rqO_2 var6 = DK.class_(xu_3.rB, "_base");
      this.class_(xu_3.rB, var6, var5);
      this.class_(xu_3.D, var6, var4);
      rqO_2 var7 = Uh_1.private_.class_(xu_3.rB, "_inventory", var1.break_(UX.case_, var3), this.break_);
      rqO_2 var8 = Uh_1.private_.class_(xu_3.D, "_inventory", var1.break_(UX.case_, var2), this.break_);
      this.class_(xu_3.rB, var7);
      this.class_(xu_3.D, var8);
   }

   private void volatile_(xd_3 var1) {
      rqO_2 var2 = this.class_(var1, "", Uh_1.B, Do_1::throws_);
      rqO_2 var3 = this.class_(var1, "", Uh_1.s, Do_1::throws_);
      rqO_2 var4 = this.class_(var1, "", Uh_1.E, Do_1::throws_);
      rqO_2 var5 = this.class_(var1, "_on", Uh_1.B, Do_1::throws_);
      rqO_2 var6 = this.class_(var1, "_on", Uh_1.s, Do_1::throws_);
      rqO_2 var7 = this.class_(var1, "_on", Uh_1.E, Do_1::throws_);
      Dd_1 var8 = Dd_1.class_(rCT.return_, rCT.O).class_((var6x, var7x) -> {
         switch (var7x) {
            case NORTH_SOUTH:
               return DS.class_().class_(Ds_1.byte_, var6x ? var5 : var2);
            case EAST_WEST:
               return DS.class_().class_(Ds_1.byte_, var6x ? var5 : var2).class_(Ds_1.break_, DE.R90);
            case ASCENDING_EAST:
               return DS.class_().class_(Ds_1.byte_, var6x ? var6 : var3).class_(Ds_1.break_, DE.R90);
            case ASCENDING_WEST:
               return DS.class_().class_(Ds_1.byte_, var6x ? var7 : var4).class_(Ds_1.break_, DE.R90);
            case ASCENDING_NORTH:
               return DS.class_().class_(Ds_1.byte_, var6x ? var6 : var3);
            case ASCENDING_SOUTH:
               return DS.class_().class_(Ds_1.byte_, var6x ? var7 : var4);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.break_(var1);
      this.class_.accept(Dp_1.class_(var1).class_(var8));
   }

   private void volatile_() {
      this.class_
         .accept(
            Dp_1.class_(xu_3.XS, DS.class_().class_(Ds_1.byte_, DK.class_(xu_3.XS)))
               .class_(
                  Dd_1.class_(rCT.transient_, rCT.strictfp_)
                     .class_(rCH.FLOOR, rpr_3.NORTH, DS.class_())
                     .class_(rCH.FLOOR, rpr_3.EAST, DS.class_().class_(Ds_1.break_, DE.R90))
                     .class_(rCH.FLOOR, rpr_3.SOUTH, DS.class_().class_(Ds_1.break_, DE.R180))
                     .class_(rCH.FLOOR, rpr_3.WEST, DS.class_().class_(Ds_1.break_, DE.R270))
                     .class_(rCH.WALL, rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R90))
                     .class_(rCH.WALL, rpr_3.EAST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R90))
                     .class_(rCH.WALL, rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R180))
                     .class_(rCH.WALL, rpr_3.WEST, DS.class_().class_(Ds_1.class_, DE.R90).class_(Ds_1.break_, DE.R270))
                     .class_(rCH.CEILING, rpr_3.SOUTH, DS.class_().class_(Ds_1.class_, DE.R180))
                     .class_(rCH.CEILING, rpr_3.WEST, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R90))
                     .class_(rCH.CEILING, rpr_3.NORTH, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R180))
                     .class_(rCH.CEILING, rpr_3.EAST, DS.class_().class_(Ds_1.class_, DE.R180).class_(Ds_1.break_, DE.R270))
               )
         );
   }

   private List<rqO_2> synchronized_(xd_3 var1) {
      rqO_2 var2 = Uh_1.L.class_(DK.class_(var1, "_up0"), Do_1.continue_(var1), this.break_);
      rqO_2 var3 = Uh_1.L.class_(DK.class_(var1, "_up1"), Do_1.super_(var1), this.break_);
      rqO_2 var4 = Uh_1.A.class_(DK.class_(var1, "_up_alt0"), Do_1.continue_(var1), this.break_);
      rqO_2 var5 = Uh_1.A.class_(DK.class_(var1, "_up_alt1"), Do_1.super_(var1), this.break_);
      return ImmutableList.of(var2, var3, var4, var5);
   }

   private void synchronized_() {
      Do_1 var1 = Do_1.finally_(xu_3.Pg);
      this.class_.accept(byte_(xu_3.Pg, DK.class_(xu_3.Pg)));
      this.class_(xu_3.Br, var1);
      this.class_(xu_3.BP, var1);
   }

   private void native_(xd_3 var1) {
      Do_1 var2 = Do_1.throws_(var1);
      Do_1 var3 = Do_1.throws_(Do_1.class_(var1, "_corner"));
      rqO_2 var4 = Uh_1.B.class_(var1, var2, this.break_);
      rqO_2 var5 = Uh_1.S.class_(var1, var3, this.break_);
      rqO_2 var6 = Uh_1.s.class_(var1, var2, this.break_);
      rqO_2 var7 = Uh_1.E.class_(var1, var2, this.break_);
      this.break_(var1);
      this.class_
         .accept(
            Dp_1.class_(var1)
               .class_(
                  Dd_1.class_(rCT.M)
                     .class_(rCR.NORTH_SOUTH, DS.class_().class_(Ds_1.byte_, var4))
                     .class_(rCR.EAST_WEST, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R90))
                     .class_(rCR.ASCENDING_EAST, DS.class_().class_(Ds_1.byte_, var6).class_(Ds_1.break_, DE.R90))
                     .class_(rCR.ASCENDING_WEST, DS.class_().class_(Ds_1.byte_, var7).class_(Ds_1.break_, DE.R90))
                     .class_(rCR.ASCENDING_NORTH, DS.class_().class_(Ds_1.byte_, var6))
                     .class_(rCR.ASCENDING_SOUTH, DS.class_().class_(Ds_1.byte_, var7))
                     .class_(rCR.SOUTH_EAST, DS.class_().class_(Ds_1.byte_, var5))
                     .class_(rCR.SOUTH_WEST, DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R90))
                     .class_(rCR.NORTH_WEST, DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R180))
                     .class_(rCR.NORTH_EAST, DS.class_().class_(Ds_1.byte_, var5).class_(Ds_1.break_, DE.R270))
               )
         );
   }

   private void native_(xd_3 var1, xd_3 var2) {
      this.class_(var1, DX.NOT_TINTED);
      Do_1 var3 = Do_1.protected_(Do_1.class_(var1, "_pot"));
      rqO_2 var4 = DX.NOT_TINTED.break_().class_(var2, var3, this.break_);
      this.class_.accept(byte_(var2, var4));
   }

   private void native_() {
      rqO_2 var1 = DK.class_(xu_3.Xb, "_floor");
      rqO_2 var2 = DK.class_(xu_3.Xb, "_ceiling");
      rqO_2 var3 = DK.class_(xu_3.Xb, "_wall");
      rqO_2 var4 = DK.class_(xu_3.Xb, "_between_walls");
      this.class_(rdy_3.Wk);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Xb)
               .class_(
                  Dd_1.class_(rCT.strictfp_, rCT.for_)
                     .class_(rpr_3.NORTH, rCq_1.FLOOR, DS.class_().class_(Ds_1.byte_, var1))
                     .class_(rpr_3.SOUTH, rCq_1.FLOOR, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180))
                     .class_(rpr_3.EAST, rCq_1.FLOOR, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.WEST, rCq_1.FLOOR, DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270))
                     .class_(rpr_3.NORTH, rCq_1.CEILING, DS.class_().class_(Ds_1.byte_, var2))
                     .class_(rpr_3.SOUTH, rCq_1.CEILING, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R180))
                     .class_(rpr_3.EAST, rCq_1.CEILING, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.WEST, rCq_1.CEILING, DS.class_().class_(Ds_1.byte_, var2).class_(Ds_1.break_, DE.R270))
                     .class_(rpr_3.NORTH, rCq_1.SINGLE_WALL, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R270))
                     .class_(rpr_3.SOUTH, rCq_1.SINGLE_WALL, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.EAST, rCq_1.SINGLE_WALL, DS.class_().class_(Ds_1.byte_, var3))
                     .class_(rpr_3.WEST, rCq_1.SINGLE_WALL, DS.class_().class_(Ds_1.byte_, var3).class_(Ds_1.break_, DE.R180))
                     .class_(rpr_3.SOUTH, rCq_1.DOUBLE_WALL, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R90))
                     .class_(rpr_3.NORTH, rCq_1.DOUBLE_WALL, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R270))
                     .class_(rpr_3.EAST, rCq_1.DOUBLE_WALL, DS.class_().class_(Ds_1.byte_, var4))
                     .class_(rpr_3.WEST, rCq_1.DOUBLE_WALL, DS.class_().class_(Ds_1.byte_, var4).class_(Ds_1.break_, DE.R180))
               )
         );
   }

   private void strictfp_() {
      rqO_2 var1 = Uk_1.class_.class_(xu_3.PR, this.break_);
      this.class_
         .accept(
            Dp_1.class_(
               xu_3.PR,
               DS.class_().class_(Ds_1.byte_, var1),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R90),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R180),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.class_, DE.R270),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.class_, DE.R90),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.class_, DE.R180),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R90).class_(Ds_1.class_, DE.R270),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.class_, DE.R90),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.class_, DE.R180),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R180).class_(Ds_1.class_, DE.R270),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.class_, DE.R90),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.class_, DE.R180),
               DS.class_().class_(Ds_1.byte_, var1).class_(Ds_1.break_, DE.R270).class_(Ds_1.class_, DE.R270)
            )
         );
   }

   private void E() {
      rqO_2 var1 = Uk_1.class_.class_(xu_3.Js, this.break_);
      this.class_(xu_3.Js, var1);
      this.class_
         .accept(
            Dp_1.class_(xu_3.Js)
               .class_(Dd_1.class_(rCT.Y).class_(var1x -> DS.class_().class_(Ds_1.byte_, this.class_(xu_3.Js, "_" + var1x.class_(), Uh_1.byte_, Do_1::break_))))
         );
   }

   private void X() {
      this.class_.accept(byte_(xu_3.bV, Uh_1.byte_.class_(xu_3.bV, Do_1.break_(DK.class_("magma")), this.break_)));
   }
}
