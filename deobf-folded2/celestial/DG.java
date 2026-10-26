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
   final Consumer<Dt_1> id_class;
   final BiConsumer<rqO_2, Supplier<JsonElement>> id_break;
   private final Consumer<rdb_3> id_byte;

   private void id_boolean() {
      rqO_2 var1 = DK.id_class(xu_3.bK);
      rqO_2 var2 = DK.id_class(xu_3.bK, "_on");
      this.id_class.accept(Dp_1.id_class(xu_3.bK).id_class(id_class(rCT.id_return, var2, var1)).id_class(id_throws()));
   }

   private void id_char() {
      List var1 = this.id_this(xu_3.rK);
      List var2 = this.id_else(xu_3.rK);
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.rK)
               .id_class(id_class(var1, var0 -> var0))
               .id_class(id_class(var2, var0 -> var0))
               .id_class(id_class(var2, var0 -> var0.id_class(Ds_1.id_break, DE.R90)))
               .id_class(id_class(var2, var0 -> var0.id_class(Ds_1.id_break, DE.R180)))
               .id_class(id_class(var2, var0 -> var0.id_class(Ds_1.id_break, DE.R270)))
         );
   }

   private void id_byte(xd_3 var1, xd_3 var2) {
      this.id_class(var1.id_case());
      Do_1 var3 = Do_1.id_catch(var1);
      Do_1 var4 = Do_1.id_class(var1, var2);
      rqO_2 var5 = Uh_1.c.id_class(var2, var4, this.id_break);
      this.id_class
         .accept(
            Dp_1.id_class(var2, DS.id_class().id_class(Ds_1.id_byte, var5))
               .id_class(
                  Dd_1.id_class(rCT.id_strictfp)
                     .id_class(rpr_3.WEST, DS.id_class())
                     .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R270))
                     .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R180))
               )
         );
      this.id_class
         .accept(
            Dp_1.id_class(var1)
               .id_class(Dd_1.id_class(rCT.d).id_class(var3x -> DS.id_class().id_class(Ds_1.id_byte, Uh_1.N[var3x].id_class(var1, var3, this.id_break))))
         );
   }

   private static Dd_1 id_byte() {
      return Dd_1.id_class(rCT.id_strictfp)
         .id_class(rpr_3.SOUTH, DS.id_class())
         .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R270));
   }

   static Dt_1 id_byte(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dl_1.id_class(var0)
         .id_class(DS.id_class().id_class(Ds_1.id_byte, var1))
         .id_class(DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_protected, true))
         .id_class(
            DI.id_class().id_class(rCT.id_static, true),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.id_import, true),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.id_short, true),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
         );
   }

   private void id_byte(xd_3 var1) {
      rqO_2 var2 = Uk_1.id_class.id_class(var1, this.id_break);
      rqO_2 var3 = Uk_1.id_break.id_class(var1, this.id_break);
      this.id_class.accept(id_class(var1, var2, var3));
   }

   private static Dt_1 id_byte(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.id_else)
               .id_class(rpr_3.NORTH, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180))
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90))
               .id_class(rpr_3.WEST, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270))
               .id_class(rpr_3.NORTH, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpr_3.SOUTH, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180))
               .id_class(rpr_3.EAST, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90))
               .id_class(rpr_3.WEST, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270))
               .id_class(rpr_3.NORTH, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
               .id_class(rpr_3.WEST, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
               .id_class(
                  rpr_3.NORTH, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180)
               )
               .id_class(
                  rpr_3.SOUTH, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R0)
               )
               .id_class(
                  rpr_3.EAST, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270)
               )
               .id_class(
                  rpr_3.WEST, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90)
               )
         );
   }

   static Dp_1 id_byte(xd_3 var0, rqO_2 var1) {
      return Dp_1.id_class(var0, DS.id_class().id_class(Ds_1.id_byte, var1));
   }

   private void id_byte(xd_3 var1, UW var2) {
      this.id_class.accept(id_byte(var1, var2.id_class(var1, this.id_break)));
   }

   private void id_byte(xd_3 var1, DX var2) {
      this.id_class(var1, "_top");
      rqO_2 var3 = this.id_class(var1, "_top", var2.id_class(), Do_1::id_byte);
      rqO_2 var4 = this.id_class(var1, "_bottom", var2.id_class(), Do_1::id_byte);
      this.id_case(var1, var3, var4);
   }

   private void id_int(xd_3 var1) {
      rqO_2 var2 = Uh_1.V.id_class(var1, Do_1.id_break(var1), this.id_break);
      rqO_2 var3 = DK.id_class("mushroom_block_inside");
      this.id_class
         .accept(
            Dl_1.id_class(var1)
               .id_class(DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(
                  DI.id_class().id_class(rCT.id_static, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_import, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_short, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_long, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_float, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(DI.id_class().id_class(rCT.id_void, false), DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(
                  DI.id_class().id_class(rCT.id_static, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, false)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_import, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, false)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, false)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_long, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, false)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_float, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, false)
               )
         );
      this.id_class(var1, Uk_1.id_class.id_class(var1, "_inventory", this.id_break));
   }

   private void id_int() {
      this.id_class(rdy_3.OP);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.sL)
               .id_class(id_byte())
               .id_class(
                  Dd_1.id_class(rCT.I, rCT.id_return)
                     .id_class(rCw_1.COMPARE, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL)))
                     .id_class(rCw_1.COMPARE, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_on")))
                     .id_class(rCw_1.SUBTRACT, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_subtract")))
                     .id_class(rCw_1.SUBTRACT, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.sL, "_on_subtract")))
               )
         );
   }

   private void id_long() {
      rqO_2 var1 = Do_1.id_throw(xu_3.id_finally);
      Do_1 var2 = new Do_1()
         .id_class(UX.id_throws, var1)
         .id_class(UX.id_throws, UX.id_byte)
         .id_class(UX.id_case, Do_1.id_class(xu_3.id_implements, "_top"))
         .id_class(UX.id_implements, Do_1.id_class(xu_3.id_implements, "_snow"));
      DS var3 = DS.id_class().id_class(Ds_1.id_byte, Uh_1.id_private.id_class(xu_3.id_implements, "_snow", var2, this.id_break));
      this.id_class(xu_3.id_implements, DK.id_class(xu_3.id_implements), var3);
      rqO_2 var4 = Uk_1.id_throws.get(xu_3.Bi).id_class(var1x -> var1x.id_class(UX.id_throws, var1)).id_class(xu_3.Bi, this.id_break);
      this.id_class(xu_3.Bi, var4, var3);
      rqO_2 var5 = Uk_1.id_throws.get(xu_3.id_native).id_class(var1x -> var1x.id_class(UX.id_throws, var1)).id_class(xu_3.id_native, this.id_break);
      this.id_class(xu_3.id_native, var5, var3);
   }

   private void id_float() {
      this.id_class(rdy_3.Xv);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Sx)
               .id_class(
                  Dd_1.id_class(rCT.X)
                     .id_class(0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage0")))
                     .id_class(1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage1")))
                     .id_class(2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sx, "_stage2")))
               )
               .id_class(id_byte())
         );
   }

   private void id_double() {
      rqO_2 var1 = DK.id_class(xu_3.hU, "_stable");
      rqO_2 var2 = DK.id_class(xu_3.hU, "_unstable");
      this.id_class(xu_3.hU, var1);
      this.id_class.accept(Dp_1.id_class(xu_3.hU).id_class(id_class(rCT.id_break, var2, var1)));
   }

   public DG(Consumer<Dt_1> var1, BiConsumer<rqO_2, Supplier<JsonElement>> var2, Consumer<rdb_3> var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   private void B() {
      this.id_class(rdy_3.D);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.hr)
               .id_class(
                  Dd_1.id_class(rCT.l, rCT.id_throw)
                     .id_class(1, false, Arrays.asList(id_class(DK.id_class("dead_sea_pickle"))))
                     .id_class(2, false, Arrays.asList(id_class(DK.id_class("two_dead_sea_pickles"))))
                     .id_class(3, false, Arrays.asList(id_class(DK.id_class("three_dead_sea_pickles"))))
                     .id_class(4, false, Arrays.asList(id_class(DK.id_class("four_dead_sea_pickles"))))
                     .id_class(1, true, Arrays.asList(id_class(DK.id_class("sea_pickle"))))
                     .id_class(2, true, Arrays.asList(id_class(DK.id_class("two_sea_pickles"))))
                     .id_class(3, true, Arrays.asList(id_class(DK.id_class("three_sea_pickles"))))
                     .id_class(4, true, Arrays.asList(id_class(DK.id_class("four_sea_pickles"))))
               )
         );
   }

   private void J() {
      rqO_2 var1 = DK.id_class(xu_3.id_break);
      rqO_2 var2 = DK.id_class(xu_3.id_break, "_mirrored");
      this.id_class.accept(id_class(xu_3.Bl, var1, var2));
      this.id_class(xu_3.Bl, var1);
   }

   private void S() {
      Do_1 var1 = Do_1.id_class(xu_3.Pq);
      rqO_2 var2 = Uh_1.id_byte.id_class(xu_3.Pt, var1, this.id_break);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Pq)
               .id_class(
                  Dd_1.id_class(rCT.m).id_class(var1x -> DS.id_class().id_class(Ds_1.id_byte, var1x < 8 ? DK.id_class(xu_3.Pq, "_height" + var1x * 2) : var2))
               )
         );
      this.id_class(xu_3.Pq, DK.id_class(xu_3.Pq, "_height2"));
      this.id_class.accept(id_byte(xu_3.Pt, var2));
   }

   private void id_this() {
      Do_1 var1 = new Do_1()
         .id_class(UX.id_byte, Do_1.id_class(xu_3.XP, "_side3"))
         .id_class(UX.id_package, Do_1.id_throw(xu_3.id_super))
         .id_class(UX.id_final, Do_1.id_class(xu_3.XP, "_top"))
         .id_class(UX.id_finally, Do_1.id_class(xu_3.XP, "_side3"))
         .id_class(UX.id_native, Do_1.id_class(xu_3.XP, "_side3"))
         .id_class(UX.id_extends, Do_1.id_class(xu_3.XP, "_side1"))
         .id_class(UX.id_volatile, Do_1.id_class(xu_3.XP, "_side2"));
      this.id_class.accept(id_byte(xu_3.XP, Uh_1.id_class.id_class(xu_3.XP, var1, this.id_break)));
   }

   private List<rqO_2> id_this(xd_3 var1) {
      rqO_2 var2 = Uh_1.Z.id_class(DK.id_class(var1, "_floor0"), Do_1.id_continue(var1), this.id_break);
      rqO_2 var3 = Uh_1.Z.id_class(DK.id_class(var1, "_floor1"), Do_1.id_super(var1), this.id_break);
      return ImmutableList.of(var2, var3);
   }

   private void b() {
      this.id_class(rdy_3.Oa);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.SQ)
               .id_class(
                  Dd_1.id_class(rCT.id_class, rCT.id_static, rCT.id_void, rCT.id_import, rCT.id_short)
                     .id_class(false, false, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns")))
                     .id_class(
                        false, true, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(false, false, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")))
                     .id_class(
                        false, false, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        false, false, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_n")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(false, true, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")))
                     .id_class(
                        false, true, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, false, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        false, false, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ne")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(false, false, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns")))
                     .id_class(
                        false, true, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_ns")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(false, true, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")))
                     .id_class(
                        false, true, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, false, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        false, true, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nse")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(false, true, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_nsew")))
                     .id_class(true, false, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns")))
                     .id_class(true, false, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")))
                     .id_class(
                        true,
                        false,
                        false,
                        true,
                        false,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true,
                        true,
                        false,
                        false,
                        false,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        true,
                        false,
                        false,
                        false,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_n")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")))
                     .id_class(
                        true,
                        true,
                        false,
                        true,
                        false,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        true,
                        false,
                        false,
                        true,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true,
                        false,
                        true,
                        false,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ne")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, false, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns")))
                     .id_class(
                        true,
                        true,
                        false,
                        false,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_ns")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(true, true, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")))
                     .id_class(
                        true,
                        true,
                        false,
                        true,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        true,
                        false,
                        true,
                        true,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true,
                        true,
                        true,
                        false,
                        true,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nse")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.SQ, "_attached_nsew")))
               )
         );
   }

   private void x() {
      rqO_2 var1 = Do_1.id_class(xu_3.Jk, "_bottom");
      rqO_2 var2 = Do_1.id_class(xu_3.Jk, "_top_off");
      rqO_2 var3 = Do_1.id_class(xu_3.Jk, "_top");
      rqO_2[] var4 = new rqO_2[5];

      for (int var5 = 0; var5 < 5; var5++) {
         Do_1 var6 = new Do_1()
            .id_class(UX.id_throws, var1)
            .id_class(UX.id_case, var5 == 0 ? var2 : var3)
            .id_class(UX.id_implements, Do_1.id_class(xu_3.Jk, "_side" + var5));
         var4[var5] = Uh_1.id_private.id_class(xu_3.Jk, "_" + var5, var6, this.id_break);
      }

      this.id_class.accept(Dp_1.id_class(xu_3.Jk).id_class(Dd_1.id_class(rCT.q).id_class(var1x -> DS.id_class().id_class(Ds_1.id_byte, var4[var1x]))));
      this.id_class(rdy_3.Wo, var4[0]);
   }

   private void s() {
      this.id_class.accept(Dp_1.id_class(xu_3.XG, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.XG))).id_class(id_break()));
   }

   private void h() {
      this.id_break(xu_3.BD);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.BD)
               .id_class(
                  Dd_1.id_class(rCT.id_static, rCT.id_void, rCT.id_import, rCT.id_long, rCT.id_short)
                     .id_class(false, false, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")))
                     .id_class(false, false, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")))
                     .id_class(
                        false, false, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, true, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true, false, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, false, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")))
                     .id_class(
                        true, false, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, false, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        false, true, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, false, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2_opposite")))
                     .id_class(
                        false,
                        true,
                        true,
                        false,
                        false,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2_opposite")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(true, true, true, false, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")))
                     .id_class(true, false, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R90))
                     .id_class(
                        false, true, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true, true, false, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, true, false, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_4")))
                     .id_class(false, false, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_u")))
                     .id_class(false, false, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")))
                     .id_class(
                        false, false, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, true, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true, false, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_1u")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, false, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")))
                     .id_class(
                        true, false, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(
                        false, false, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        false, true, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, false, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u_opposite")))
                     .id_class(
                        false,
                        true,
                        true,
                        true,
                        false,
                        DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_2u_opposite")).id_class(Ds_1.id_break, DE.R90)
                     )
                     .id_class(true, true, true, true, false, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")))
                     .id_class(true, false, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R90))
                     .id_class(
                        false, true, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R180)
                     )
                     .id_class(
                        true, true, false, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_3u")).id_class(Ds_1.id_break, DE.R270)
                     )
                     .id_class(true, true, true, true, true, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BD, "_4u")))
               )
         );
   }

   private void d() {
      rqO_2 var1 = Do_1.id_class(xu_3.JE, "_top");
      rqO_2 var2 = Do_1.id_class(xu_3.JE, "_bottom");
      rqO_2 var3 = Do_1.id_class(xu_3.JE, "_side");
      rqO_2 var4 = Do_1.id_class(xu_3.JE, "_lock");
      Do_1 var5 = new Do_1()
         .id_class(UX.id_package, var3)
         .id_class(UX.id_volatile, var3)
         .id_class(UX.id_native, var3)
         .id_class(UX.id_byte, var1)
         .id_class(UX.id_finally, var1)
         .id_class(UX.id_extends, var2)
         .id_class(UX.id_final, var4);
      rqO_2 var6 = Uh_1.id_break.id_class(xu_3.JE, var5, this.id_break);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.JE, DS.id_class().id_class(Ds_1.id_byte, var6))
               .id_class(Dd_1.id_class(rCT.id_boolean).id_class(var1x -> this.id_class(var1x, DS.id_class())))
         );
   }

   private void id_interface() {
      Dj_1 var1 = DI.id_class()
         .id_class(rCT.id_void, false)
         .id_class(rCT.id_static, false)
         .id_class(rCT.id_import, false)
         .id_class(rCT.id_short, false)
         .id_class(rCT.id_long, false);
      List var2 = this.id_this(xu_3.ro);
      List var3 = this.id_else(xu_3.ro);
      List var4 = this.id_synchronized(xu_3.ro);
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.ro)
               .id_class(var1, id_class(var2, var0 -> var0))
               .id_class(DI.id_class(DI.id_class().id_class(rCT.id_void, true), var1), id_class(var3, var0 -> var0))
               .id_class(DI.id_class(DI.id_class().id_class(rCT.id_static, true), var1), id_class(var3, var0 -> var0.id_class(Ds_1.id_break, DE.R90)))
               .id_class(DI.id_class(DI.id_class().id_class(rCT.id_import, true), var1), id_class(var3, var0 -> var0.id_class(Ds_1.id_break, DE.R180)))
               .id_class(DI.id_class(DI.id_class().id_class(rCT.id_short, true), var1), id_class(var3, var0 -> var0.id_class(Ds_1.id_break, DE.R270)))
               .id_class(DI.id_class().id_class(rCT.id_long, true), id_class(var4, var0 -> var0))
         );
   }

   private DO id_class(rqO_2 var1, xd_3 var2) {
      return new DO(this, var1, var2);
   }

   private void id_class(xd_3 var1, rqO_2 var2, DS var3) {
      List var4 = Arrays.asList(id_class(var2));
      this.id_class.accept(Dp_1.id_class(var1).id_class(Dd_1.id_class(rCT.id_while).id_class(true, var3).id_class(false, var4)));
   }

   private List<DS> id_class(int var1) {
      String var2 = "_age" + var1;
      return IntStream.range(1, 5).mapToObj(var1x -> DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, var1x + var2))).collect(Collectors.toList());
   }

   private void id_class(xd_3 var1, rdb_3 var2) {
      rqO_2 var3 = Uh_1.id_abstract.id_class(var1, Do_1.id_class(var2), this.id_break);
      this.id_class.accept(id_byte(var1, var3));
   }

   private static <T extends Comparable<T>> Dd_1 id_class(rCZ<T> var0, T var1, rqO_2 var2, rqO_2 var3) {
      DS var4 = DS.id_class().id_class(Ds_1.id_byte, var2);
      DS var5 = DS.id_class().id_class(Ds_1.id_byte, var3);
      return Dd_1.id_class(var0).id_class(var3x -> {
         boolean var4x = var3x.compareTo(var1) >= 0;
         return var4x ? var4 : var5;
      });
   }

   private void id_class(UW var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         rqO_2 var7 = var1.id_class(var6, this.id_break);
         this.id_class.accept(id_break(var6, var7));
      }
   }

   private void id_class(xd_3 var1, rCZ<Integer> var2, int... var3) {
      if (var2.id_class().size() != var3.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectOpenHashMap var4 = new Int2ObjectOpenHashMap();
         Dd_1 var5 = Dd_1.<Integer>id_class(var2).id_class(var4x -> {
            int var5x = var3[var4x];
            rqO_2 var6 = (rqO_2)var4.computeIfAbsent(var5x, var3xx -> this.id_class(var1, "_stage" + var5x, Uh_1.u, Do_1::id_case));
            return DS.id_class().id_class(Ds_1.id_byte, var6);
         });
         this.id_class(var1.id_case());
         this.id_class.accept(Dp_1.id_class(var1).id_class(var5));
      }
   }

   private void id_class(xd_3... var1) {
      rqO_2 var2 = DK.id_class("campfire_off");

      for (xd_3 var6 : var1) {
         rqO_2 var7 = Uh_1.n.id_class(var6, Do_1.id_try(var6), this.id_break);
         this.id_class(var6.id_case());
         this.id_class.accept(Dp_1.id_class(var6).id_class(id_class(rCT.id_continue, var7, var2)).id_class(id_byte()));
      }
   }

   private void id_class(xd_3 var1, xd_3 var2, BiFunction<xd_3, xd_3, Do_1> var3) {
      Do_1 var4 = (Do_1)var3.apply(var1, var2);
      this.id_class.accept(id_byte(var1, Uh_1.id_class.id_class(var1, var4, this.id_break)));
   }

   private static List<DS> id_class(List<rqO_2> var0, UnaryOperator<DS> var1) {
      return var0.stream().map(var0x -> DS.id_class().id_class(Ds_1.id_byte, var0x)).map(var1).collect(Collectors.toList());
   }

   private void id_class(xd_3 var1, Do_1 var2) {
      rqO_2 var3 = Uh_1.id_implements.id_class(var1, var2.id_break(UX.id_catch, Do_1.id_throw(var1)), this.id_break);
      this.id_class.accept(Dp_1.id_class(var1, DS.id_class().id_class(Ds_1.id_byte, var3)).id_class(id_break()));
   }

   private void id_class(xd_3 var1, Function<xd_3, Do_1> var2) {
      Do_1 var3 = ((Do_1)var2.apply(var1)).id_class(UX.id_implements, UX.id_byte);
      Do_1 var4 = var3.id_break(UX.id_catch, Do_1.id_class(var1, "_front_honey"));
      rqO_2 var5 = Uh_1.id_finally.id_class(var1, var3, this.id_break);
      rqO_2 var6 = Uh_1.id_finally.id_class(var1, "_honey", var4, this.id_break);
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_break()).id_class(id_class(rCT.L, 5, var6, var5)));
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
      this.id_byte(xu_3.sy, Uk_1.id_byte.id_class(var0 -> var0.id_class(UX.id_implements, Do_1.id_throw(xu_3.sy))));
      this.id_byte(xu_3.BC, Uk_1.id_class);
      this.id_catch(xu_3.L, xu_3.F);
      this.id_catch(xu_3.Gf, xu_3.GI);
      this.id_byte(xu_3.Jn, Uk_1.id_class);
      this.id_private(xu_3.sv, xu_3.rt);
      this.id_private(xu_3.sF, xu_3.rw);
      this.id_final();
      this.id_continue();
      this.id_super();
      this.id_class(xu_3.Xh, xu_3.XX);
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
      this.id_class(DK.id_class("banner"), xu_3.id_final)
         .id_class(
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
         .id_break(
            xu_3.Gm, xu_3.GZ, xu_3.Gv, xu_3.GF, xu_3.GL, xu_3.GA, xu_3.Gn, xu_3.GC, xu_3.Gl, xu_3.GH, xu_3.Gy, xu_3.Gp, xu_3.Gq, xu_3.GT, xu_3.Gt, xu_3.Gw
         );
      this.id_class(DK.id_class("bed"), xu_3.id_final)
         .id_break(xu_3.C, xu_3.l, xu_3.H, xu_3.y, xu_3.p, xu_3.q, xu_3.T, xu_3.t, xu_3.w, xu_3.I, xu_3.f, xu_3.j, xu_3.V, xu_3.g, xu_3.R, xu_3.Y);
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
      this.id_class(DK.id_class("skull"), xu_3.PY)
         .id_class(Uh_1.U, xu_3.sW, xu_3.sd, xu_3.sJ, xu_3.sM, xu_3.sh)
         .id_class(xu_3.sQ)
         .id_break(xu_3.sz, xu_3.sN, xu_3.sk, xu_3.sx, xu_3.sO, xu_3.sX);
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
      this.id_class(
         Uk_1.id_class,
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
      this.id_break(
         Uk_1.id_finally,
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
      this.id_case(xu_3.id_continue)
         .id_class(xu_3.sG)
         .id_byte(xu_3.bu)
         .id_protected(xu_3.bW)
         .id_throws(xu_3.Pn)
         .id_class(xu_3.PM, xu_3.PQ)
         .id_case(xu_3.GK)
         .id_catch(xu_3.Ez);
      this.id_catch(xu_3.bL);
      this.id_private(xu_3.Bv);
      this.id_finally(xu_3.id_const).id_byte(xu_3.id_const).id_class(xu_3.E);
      this.id_finally(xu_3.id_double).id_byte(xu_3.id_double).id_class(xu_3.X);
      this.id_class(xu_3.id_public, xu_3.Sy, DX.NOT_TINTED);
      this.id_byte(xu_3.z, Uk_1.id_final);
      this.id_case(xu_3.id_int)
         .id_class(xu_3.ss)
         .id_byte(xu_3.bN)
         .id_protected(xu_3.bd)
         .id_throws(xu_3.PL)
         .id_class(xu_3.Pb, xu_3.Pz)
         .id_case(xu_3.GY)
         .id_catch(xu_3.Su);
      this.id_catch(xu_3.bv);
      this.id_private(xu_3.Bm);
      this.id_finally(xu_3.id_short).id_byte(xu_3.id_short).id_class(xu_3.S);
      this.id_finally(xu_3.id_transient).id_byte(xu_3.id_transient).id_class(xu_3.O);
      this.id_class(xu_3.id_synchronized, xu_3.Sl, DX.NOT_TINTED);
      this.id_byte(xu_3.k, Uk_1.id_final);
      this.id_case(xu_3.id_final)
         .id_class(xu_3.sB)
         .id_byte(xu_3.PV)
         .id_protected(xu_3.BU)
         .id_throws(xu_3.Pv)
         .id_class(xu_3.PE, xu_3.Pk)
         .id_case(xu_3.Gg)
         .id_case(xu_3.br)
         .id_catch(xu_3.rU);
      this.id_catch(xu_3.PX);
      this.id_implements(xu_3.Bc);
      this.id_finally(xu_3.id_static).id_byte(xu_3.id_static).id_class(xu_3.P);
      this.id_finally(xu_3.r).id_byte(xu_3.r).id_class(xu_3.b);
      this.id_class(xu_3.id_this, xu_3.Sn, DX.NOT_TINTED);
      this.id_byte(xu_3.x, Uk_1.id_final);
      this.id_case(xu_3.id_package)
         .id_class(xu_3.sS)
         .id_byte(xu_3.bQ)
         .id_protected(xu_3.bx)
         .id_throws(xu_3.PF)
         .id_class(xu_3.PG, xu_3.PW)
         .id_case(xu_3.GR)
         .id_catch(xu_3.Sc);
      this.id_catch(xu_3.bZ);
      this.id_private(xu_3.Bu);
      this.id_finally(xu_3.id_import).id_byte(xu_3.id_import).id_class(xu_3.B);
      this.id_finally(xu_3.id_boolean).id_byte(xu_3.id_boolean).id_class(xu_3.M);
      this.id_class(xu_3.id_else, xu_3.SC, DX.NOT_TINTED);
      this.id_byte(xu_3.d, Uk_1.id_final);
      this.id_case(xu_3.id_super)
         .id_class(xu_3.sb)
         .id_byte(xu_3.bm)
         .id_protected(xu_3.bz)
         .id_throws(xu_3.PC)
         .id_class(xu_3.Ph, xu_3.Pc)
         .id_case(xu_3.GD)
         .id_catch(xu_3.EQ);
      this.id_catch(xu_3.bA);
      this.id_implements(xu_3.BF);
      this.id_finally(xu_3.id_strictfp).id_byte(xu_3.id_strictfp).id_class(xu_3.G);
      this.id_finally(xu_3.id_switch).id_byte(xu_3.id_switch).id_class(xu_3.J);
      this.id_class(xu_3.id_goto, xu_3.Sp, DX.NOT_TINTED);
      this.id_byte(xu_3.Q, Uk_1.id_final);
      this.id_case(xu_3.id_new)
         .id_class(xu_3.sE)
         .id_byte(xu_3.bc)
         .id_protected(xu_3.bk)
         .id_throws(xu_3.PA)
         .id_class(xu_3.PO, xu_3.PN)
         .id_case(xu_3.Go)
         .id_catch(xu_3.Sm);
      this.id_catch(xu_3.bF);
      this.id_private(xu_3.BZ);
      this.id_finally(xu_3.id_default).id_byte(xu_3.id_default).id_class(xu_3.s);
      this.id_finally(xu_3.id_for).id_byte(xu_3.id_for).id_class(xu_3.h);
      this.id_class(xu_3.id_return, xu_3.SH, DX.NOT_TINTED);
      this.id_byte(xu_3.W, Uk_1.id_final);
      this.id_case(xu_3.Xq)
         .id_class(xu_3.XU)
         .id_byte(xu_3.Xj)
         .id_protected(xu_3.XY)
         .id_throws(xu_3.XI)
         .id_class(xu_3.Jr, xu_3.JB)
         .id_case(xu_3.Xt)
         .id_catch(xu_3.XK);
      this.id_catch(xu_3.Xa);
      this.id_private(xu_3.Xg);
      this.id_finally(xu_3.Xm).id_break(xu_3.Xm).id_class(xu_3.Xv);
      this.id_finally(xu_3.XZ).id_break(xu_3.XZ).id_class(xu_3.XF);
      this.id_class(xu_3.XA, xu_3.JW, DX.NOT_TINTED);
      this.id_native(xu_3.Xp, xu_3.JQ);
      this.id_case(xu_3.XT)
         .id_class(xu_3.Xe)
         .id_byte(xu_3.XV)
         .id_protected(xu_3.Xo)
         .id_throws(xu_3.Xf)
         .id_class(xu_3.JP, xu_3.JS)
         .id_case(xu_3.Xw)
         .id_catch(xu_3.XD);
      this.id_catch(xu_3.Xi);
      this.id_private(xu_3.XR);
      this.id_finally(xu_3.Xx).id_break(xu_3.Xx).id_class(xu_3.Xk);
      this.id_finally(xu_3.Xd).id_break(xu_3.Xd).id_class(xu_3.XW);
      this.id_class(xu_3.XQ, xu_3.Jz, DX.NOT_TINTED);
      this.id_native(xu_3.Xc, xu_3.JN);
      this.id_break(xu_3.Xu, DX.NOT_TINTED);
      this.id_class(rdy_3.ry);
      this.id_class(Do_1.id_class(xu_3.id_break)).id_class(var1 -> {
         rqO_2 var2 = Uh_1.id_byte.id_class(xu_3.id_break, var1, this.id_break);
         rqO_2 var3 = Uh_1.id_protected.id_class(xu_3.id_break, var1, this.id_break);
         this.id_class.accept(id_class(xu_3.id_break, var2, var3));
         return var2;
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
      this.id_class(xu_3.A, Uk_1.id_byte.get(xu_3.F).id_class(var0 -> var0.id_class(UX.id_implements, Do_1.id_throw(xu_3.A)))).id_case(xu_3.Gi);
      this.id_protected(xu_3.GI, Uk_1.id_this).id_break(xu_3.hI).id_catch(xu_3.GV).id_case(xu_3.bG);
      this.id_class(xu_3.bJ, Uk_1.id_class(Do_1.id_class(xu_3.GI, "_top"))).id_case(xu_3.hv).id_catch(xu_3.hh);
      this.id_class(xu_3.Gj, Uk_1.id_byte.get(xu_3.GI).id_class(var0 -> var0.id_class(UX.id_implements, Do_1.id_throw(xu_3.Gj)))).id_case(xu_3.bb);
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
      rkO_2.id_catch().forEach(var1 -> this.id_class(var1, DK.id_break("template_spawn_egg")));
   }

   private DS id_class(rec_3 var1, DS var2) {
      switch (var1) {
         case DOWN_NORTH:
            return var2.id_class(Ds_1.id_class, DE.R90);
         case DOWN_SOUTH:
            return var2.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180);
         case DOWN_WEST:
            return var2.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270);
         case DOWN_EAST:
            return var2.id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90);
         case UP_NORTH:
            return var2.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R180);
         case UP_SOUTH:
            return var2.id_class(Ds_1.id_class, DE.R270);
         case UP_WEST:
            return var2.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R90);
         case UP_EAST:
            return var2.id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_break, DE.R270);
         case NORTH_UP:
            return var2;
         case SOUTH_UP:
            return var2.id_class(Ds_1.id_break, DE.R180);
         case WEST_UP:
            return var2.id_class(Ds_1.id_break, DE.R270);
         case EAST_UP:
            return var2.id_class(Ds_1.id_break, DE.R90);
         default:
            throw new UnsupportedOperationException("Rotation " + var1 + " can't be expressed with existing x and y values");
      }
   }

   private rqO_2 id_class(Integer var1, Integer var2) {
      switch (var2) {
         case 0:
            return this.id_class(var1.intValue(), "", Do_1.id_break(Do_1.id_throw(xu_3.OX)));
         case 1:
            return this.id_class(var1.intValue(), "slightly_cracked_", Do_1.id_break(Do_1.id_class(xu_3.OX, "_slightly_cracked")));
         case 2:
            return this.id_class(var1.intValue(), "very_cracked_", Do_1.id_break(Do_1.id_class(xu_3.OX, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private rqO_2 id_class(int var1, String var2, Do_1 var3) {
      switch (var1) {
         case 1:
            return Uh_1.w.id_class(DK.id_class(var2 + "turtle_egg"), var3, this.id_break);
         case 2:
            return Uh_1.I.id_class(DK.id_class("two_" + var2 + "turtle_eggs"), var3, this.id_break);
         case 3:
            return Uh_1.f.id_class(DK.id_class("three_" + var2 + "turtle_eggs"), var3, this.id_break);
         case 4:
            return Uh_1.j.id_class(DK.id_class("four_" + var2 + "turtle_eggs"), var3, this.id_break);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void id_class(xd_3 var1, rqO_2 var2, Do_1 var3) {
      rqO_2 var4 = Uh_1.p.id_class(var1, var3, this.id_break);
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_class(rCT.id_catch, var2, var4)).id_class(id_throws()));
   }

   private void id_class(rdb_3 var1, rqO_2 var2) {
      this.id_break.accept(DK.id_class(var1), new DJ(var2));
   }

   private void id_class(xd_3 var1, xd_3 var2) {
      this.id_class.accept(id_byte(var1, DK.id_class(var2)));
   }

   void id_class(xd_3 var1, rqO_2 var2) {
      this.id_break.accept(DK.id_class(var1.id_case()), new DJ(var2));
   }

   private void id_class(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.id_class(var1, this.id_break);
      this.id_class.accept(id_protected(var1, var3));
   }

   private void id_class(xd_3 var1, xd_3 var2, xd_3 var3, xd_3 var4, xd_3 var5, xd_3 var6, xd_3 var7, xd_3 var8) {
      this.id_class(var1, DX.NOT_TINTED);
      this.id_class(var2, DX.NOT_TINTED);
      this.id_throws(var3);
      this.id_throws(var4);
      this.id_break(var5, var7);
      this.id_break(var6, var8);
   }

   private void id_class(xd_3 var1, UW var2, UW var3) {
      rqO_2 var4 = var2.id_class(var1, this.id_break);
      rqO_2 var5 = var3.id_class(var1, this.id_break);
      this.id_class.accept(id_protected(var1, var4, var5));
   }

   private static Dp_1 id_class(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.id_class(
         var0,
         DS.id_class().id_class(Ds_1.id_byte, var1),
         DS.id_class().id_class(Ds_1.id_byte, var2),
         DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180),
         DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180)
      );
   }

   private void id_class(xd_3 var1, DX var2) {
      this.id_break(var1);
      this.id_break(var1, var2);
   }

   private static DW<rpr_3, rCf_1, rCI, Boolean> id_class(DW<rpr_3, rCf_1, rCI, Boolean> var0, rCf_1 var1, rqO_2 var2, rqO_2 var3) {
      return var0.id_class(rpr_3.EAST, var1, rCI.LEFT, false, DS.id_class().id_class(Ds_1.id_byte, var2))
         .id_class(rpr_3.SOUTH, var1, rCI.LEFT, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.WEST, var1, rCI.LEFT, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.NORTH, var1, rCI.LEFT, false, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.EAST, var1, rCI.RIGHT, false, DS.id_class().id_class(Ds_1.id_byte, var3))
         .id_class(rpr_3.SOUTH, var1, rCI.RIGHT, false, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.WEST, var1, rCI.RIGHT, false, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.NORTH, var1, rCI.RIGHT, false, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.EAST, var1, rCI.LEFT, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.SOUTH, var1, rCI.LEFT, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.WEST, var1, rCI.LEFT, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.NORTH, var1, rCI.LEFT, true, DS.id_class().id_class(Ds_1.id_byte, var3))
         .id_class(rpr_3.EAST, var1, rCI.RIGHT, true, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.SOUTH, var1, rCI.RIGHT, true, DS.id_class().id_class(Ds_1.id_byte, var2))
         .id_class(rpr_3.WEST, var1, rCI.RIGHT, true, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.NORTH, var1, rCI.RIGHT, true, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180));
   }

   private void id_class(xd_3 var1, DX var2, Do_1 var3) {
      this.id_break(var1);
      this.id_break(var1, var2, var3);
   }

   private static Dt_1 id_class(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4) {
      return Dp_1.id_class(var0)
         .id_class(id_class(id_class(Dd_1.id_class(rCT.id_strictfp, rCT.G, rCT.f, rCT.id_else), rCf_1.LOWER, var1, var2), rCf_1.UPPER, var3, var4));
   }

   static Dt_1 id_class(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dl_1.id_class(var0)
         .id_class(DI.id_class().id_class(rCT.id_long, true), DS.id_class().id_class(Ds_1.id_byte, var1))
         .id_class(DI.id_class().id_class(rCT.id_switch, zf_3.LOW), DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_protected, true))
         .id_class(
            DI.id_class().id_class(rCT.id_double, zf_3.LOW),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.r, zf_3.LOW),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.P, zf_3.LOW),
            DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
         )
         .id_class(DI.id_class().id_class(rCT.id_switch, zf_3.TALL), DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_protected, true))
         .id_class(
            DI.id_class().id_class(rCT.id_double, zf_3.TALL),
            DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.r, zf_3.TALL),
            DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
         )
         .id_class(
            DI.id_class().id_class(rCT.P, zf_3.TALL),
            DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
         );
   }

   private static Dd_1 id_class(rCN var0, rqO_2 var1, rqO_2 var2) {
      return Dd_1.id_class(var0).id_class(true, DS.id_class().id_class(Ds_1.id_byte, var1)).id_class(false, DS.id_class().id_class(Ds_1.id_byte, var2));
   }

   private void id_class(xd_3 var1, xd_3 var2, DX var3) {
      this.id_class(var1, var3);
      Do_1 var4 = Do_1.id_protected(var1);
      rqO_2 var5 = var3.id_break().id_class(var2, var4, this.id_break);
      this.id_class.accept(id_byte(var2, var5));
   }

   private void id_class(xd_3 var1, Do_1 var2, DD var3) {
      rqO_2 var4 = var3.id_class(var1, var2, this.id_break);
      this.id_class.accept(id_byte(var1, var4));
   }

   private DM id_class(xd_3 var1, Uk_1 var2) {
      return new DM(this, var2.id_break()).id_class(var1, var2.id_class());
   }

   void id_class(xd_3 var1) {
      this.id_byte.accept(var1.id_case());
   }

   void id_class(rdb_3 var1) {
      Uh_1.g.id_class(DK.id_class(var1), Do_1.id_break(var1), this.id_break);
   }

   private static DS[] id_class(rqO_2 var0) {
      return new DS[]{
         DS.id_class().id_class(Ds_1.id_byte, var0),
         DS.id_class().id_class(Ds_1.id_byte, var0).id_class(Ds_1.id_break, DE.R90),
         DS.id_class().id_class(Ds_1.id_byte, var0).id_class(Ds_1.id_break, DE.R180),
         DS.id_class().id_class(Ds_1.id_byte, var0).id_class(Ds_1.id_break, DE.R270)
      };
   }

   private DM id_class(Do_1 var1) {
      return new DM(this, var1);
   }

   private void id_class(xd_3 var1, String var2) {
      rdb_3 var3 = var1.id_case();
      Uh_1.g.id_class(DK.id_class(var3), Do_1.id_implements(Do_1.id_class(var1, var2)), this.id_break);
   }

   private rqO_2 id_class(xd_3 var1, String var2, DD var3, Function<rqO_2, Do_1> var4) {
      return var3.id_class(var1, var2, (Do_1)var4.apply(Do_1.id_class(var1, var2)), this.id_break);
   }

   private void id_default() {
      this.id_break(xu_3.Sr);
      this.id_class.accept(id_break(xu_3.Sr, DK.id_class(xu_3.Sr)));
   }

   private void id_short() {
      rqO_2 var1 = DK.id_class(xu_3.Pu);
      rqO_2 var2 = DK.id_class(xu_3.Pu, "_on");
      this.id_break(xu_3.Pu);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Pu)
               .id_class(id_class(rCT.id_return, var1, var2))
               .id_class(
                  Dd_1.id_class(rCT.id_transient, rCT.id_strictfp)
                     .id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180))
                     .id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class())
                     .id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270))
                     .id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90))
                     .id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270))
               )
         );
   }

   private void id_void() {
      this.id_class.accept(id_break(xu_3.bt, DK.id_class(xu_3.bt)));
   }

   private void r() {
      Do_1 var1 = Do_1.id_else(xu_3.PH);
      Do_1 var2 = Do_1.id_private(Do_1.id_class(xu_3.PH, "_off"));
      rqO_2 var3 = Uh_1.H.id_class(xu_3.PH, var1, this.id_break);
      rqO_2 var4 = Uh_1.H.id_class(xu_3.PH, "_off", var2, this.id_break);
      this.id_class.accept(Dp_1.id_class(xu_3.PH).id_class(id_class(rCT.id_continue, var3, var4)));
      rqO_2 var5 = Uh_1.y.id_class(xu_3.Py, var1, this.id_break);
      rqO_2 var6 = Uh_1.y.id_class(xu_3.Py, "_off", var2, this.id_break);
      this.id_class.accept(Dp_1.id_class(xu_3.Py).id_class(id_class(rCT.id_continue, var5, var6)).id_class(id_protected()));
      this.id_break(xu_3.PH);
      this.id_class(xu_3.Py);
   }

   static Dt_1 id_break(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3, rqO_2 var4) {
      return Dp_1.id_class(var0, DS.id_class().id_class(Ds_1.id_protected, true))
         .id_class(id_byte())
         .id_class(
            Dd_1.id_class(rCT.id_new, rCT.id_else)
               .id_class(false, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(true, false, DS.id_class().id_class(Ds_1.id_byte, var4))
               .id_class(false, true, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(true, true, DS.id_class().id_class(Ds_1.id_byte, var3))
         );
   }

   private void id_break(xd_3 var1) {
      rdb_3 var2 = var1.id_case();
      if (var2 != rdy_3.id_class) {
         Uh_1.g.id_class(DK.id_class(var2), Do_1.id_instanceof(var1), this.id_break);
      }
   }

   private void id_break(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.id_class(var1, this.id_break);
      this.id_class.accept(Dp_1.id_class(var1, DS.id_class().id_class(Ds_1.id_byte, var3)).id_class(id_break()));
   }

   private static Dd_1 id_break() {
      return Dd_1.id_class(rCT.id_strictfp)
         .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.NORTH, DS.id_class());
   }

   private void id_break(xd_3 var1, xd_3 var2, DX var3) {
      this.id_break(var1, var3);
      this.id_break(var2, var3);
   }

   static Dt_1 id_break(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.R)
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.STRAIGHT, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(
                  rpr_3.WEST,
                  rCj_1.BOTTOM,
                  rCK.STRAIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.BOTTOM,
                  rCK.STRAIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.BOTTOM,
                  rCK.STRAIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.OUTER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(
                  rpr_3.WEST,
                  rCj_1.BOTTOM,
                  rCK.OUTER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.BOTTOM,
                  rCK.OUTER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.BOTTOM,
                  rCK.OUTER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.BOTTOM,
                  rCK.OUTER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.BOTTOM,
                  rCK.OUTER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.OUTER_LEFT, DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.BOTTOM,
                  rCK.OUTER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, rCK.INNER_RIGHT, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(
                  rpr_3.WEST,
                  rCj_1.BOTTOM,
                  rCK.INNER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.BOTTOM,
                  rCK.INNER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.BOTTOM,
                  rCK.INNER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.BOTTOM,
                  rCK.INNER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.BOTTOM,
                  rCK.INNER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, rCK.INNER_LEFT, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.BOTTOM,
                  rCK.INNER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var2)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R180)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.STRAIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var2)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R270)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var3)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R270)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var3)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R180)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.OUTER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var3)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R180)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.OUTER_LEFT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var3)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R270)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var1)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R270)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var1)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R180)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.INNER_RIGHT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.EAST,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.WEST,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var1)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R180)
                     .id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.SOUTH,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  rpr_3.NORTH,
                  rCj_1.TOP,
                  rCK.INNER_LEFT,
                  DS.id_class()
                     .id_class(Ds_1.id_byte, var1)
                     .id_class(Ds_1.id_class, DE.R180)
                     .id_class(Ds_1.id_break, DE.R270)
                     .id_class(Ds_1.id_protected, true)
               )
         );
   }

   static Dt_1 id_break(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.id_return).id_class(false, DS.id_class().id_class(Ds_1.id_byte, var1)).id_class(true, DS.id_class().id_class(Ds_1.id_byte, var2))
         )
         .id_class(
            Dd_1.id_class(rCT.id_transient, rCT.id_strictfp)
               .id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90))
               .id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270))
               .id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
               .id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class())
               .id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true))
               .id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true))
               .id_class(
                  rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true))
               .id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R180))
               .id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R180))
               .id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180))
               .id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R180))
         );
   }

   private void id_break(xd_3 var1, xd_3 var2) {
      Uk_1 var3 = Uk_1.id_extends.get(var1);
      rqO_2 var4 = var3.id_class(var1, this.id_break);
      this.id_class.accept(id_byte(var1, var4));
      rqO_2 var5 = Uh_1.M.id_class(var2, var3.id_break(), this.id_break);
      this.id_class.accept(Dp_1.id_class(var2, DS.id_class().id_class(Ds_1.id_byte, var5)).id_class(id_break()));
      this.id_break(var1);
   }

   private void id_break(UW var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         rqO_2 var7 = var1.id_class(var6, this.id_break);
         this.id_class.accept(Dp_1.id_class(var6, DS.id_class().id_class(Ds_1.id_byte, var7)).id_class(id_byte()));
      }
   }

   private static Dp_1 id_break(xd_3 var0, rqO_2 var1) {
      return Dp_1.id_class(var0, id_class(var1));
   }

   private void id_break(xd_3 var1, DX var2) {
      Do_1 var3 = Do_1.id_byte(var1);
      this.id_break(var1, var2, var3);
   }

   private void id_break(xd_3 var1, DX var2, Do_1 var3) {
      rqO_2 var4 = var2.id_class().id_class(var1, var3, this.id_break);
      this.id_class.accept(id_byte(var1, var4));
   }

   private void id_throws(xd_3 var1) {
      this.id_byte(var1, Uk_1.id_class);
   }

   static Dt_1 id_throws(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.id_class(var0).id_class(id_class(rCT.id_return, var2, var1));
   }

   private void id_throws(xd_3 var1, UW var2) {
      rqO_2 var3 = var2.id_class(var1, this.id_break);
      rqO_2 var4 = Do_1.id_class(var1, "_front_on");
      rqO_2 var5 = var2.get(var1).id_class(var1x -> var1x.id_class(UX.id_catch, var4)).id_class(var1, "_on", this.id_break);
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_class(rCT.id_continue, var5, var3)).id_class(id_break()));
   }

   private void id_throws(xd_3 var1, xd_3 var2) {
      this.id_byte(var1, Uk_1.id_class);
      rqO_2 var3 = Uk_1.id_implements.get(var1).id_class(var2, this.id_break);
      this.id_class.accept(id_byte(var2, var3));
   }

   private static Dd_1 id_throws() {
      return Dd_1.id_class(rCT.id_default)
         .id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_class, DE.R90))
         .id_class(rpr_3.UP, DS.id_class().id_class(Ds_1.id_class, DE.R270))
         .id_class(rpr_3.NORTH, DS.id_class())
         .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90));
   }

   static Dt_1 id_throws(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.g)
               .id_class(rCo_1.BOTTOM, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rCo_1.TOP, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rCo_1.DOUBLE, DS.id_class().id_class(Ds_1.id_byte, var3))
         );
   }

   private void id_throws(xd_3 var1, rqO_2 var2) {
      this.id_class.accept(id_protected(var1, var2));
   }

   private void M() {
      this.id_break(xu_3.Sz);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Sz)
               .id_class(
                  Dd_1.id_class(rCT.id_class, rCT.id_return)
                     .id_class((var0, var1) -> DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.Sz, (var0 ? "_attached" : "") + (var1 ? "_on" : ""))))
               )
               .id_class(id_break())
         );
   }

   private void P() {
      this.id_class(rdy_3.Or);
      this.id_class.accept(Dp_1.id_class(xu_3.BS).id_class(Dd_1.id_class(rCT.Q, rCT.id_super, rCT.id_return).id_class((var0, var1, var2) -> {
         StringBuilder var3 = new StringBuilder();
         var3.append('_').append(var0).append("tick");
         if (var2) {
            var3.append("_on");
         }

         if (var1) {
            var3.append("_locked");
         }

         return DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.BS, var3.toString()));
      })).id_class(id_byte()));
   }

   private void id_finally(xd_3 var1, xd_3 var2) {
      Do_1 var3 = Do_1.id_else(var1);
      this.id_class.accept(id_byte(var1, Uh_1.H.id_class(var1, var3, this.id_break)));
      this.id_class.accept(Dp_1.id_class(var2, DS.id_class().id_class(Ds_1.id_byte, Uh_1.y.id_class(var2, var3, this.id_break))).id_class(id_protected()));
      this.id_break(var1);
      this.id_class(var2);
   }

   private Dh_1 id_finally(xd_3 var1) {
      return new Dh_1(this, Do_1.id_native(var1));
   }

   private Dd_1 id_finally() {
      return Dd_1.id_class(rCT.id_default)
         .id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_class, DE.R180))
         .id_class(rpr_3.UP, DS.id_class())
         .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90))
         .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270))
         .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90));
   }

   private void id_catch(xd_3 var1, xd_3 var2) {
      Do_1 var3 = new Do_1().id_class(UX.id_protected, Do_1.id_class(var2, "_top")).id_class(UX.id_implements, Do_1.id_throw(var1));
      this.id_class(var1, var3, Uh_1.id_throws);
   }

   private void id_catch(xd_3 var1) {
      Do_1 var2 = Do_1.id_int(var1);
      rqO_2 var3 = Uh_1.id_package.id_class(var1, var2, this.id_break);
      rqO_2 var4 = Uh_1.id_int.id_class(var1, var2, this.id_break);
      rqO_2 var5 = Uh_1.id_new.id_class(var1, var2, this.id_break);
      rqO_2 var6 = Uh_1.id_continue.id_class(var1, var2, this.id_break);
      this.id_class(var1.id_case());
      this.id_class.accept(id_class(var1, var3, var4, var5, var6));
   }

   private void id_catch() {
      this.id_class(xu_3.Gr, "_front");
      rqO_2 var1 = DK.id_class(xu_3.Gr, "_top");
      rqO_2 var2 = this.id_class(xu_3.Gr, "_bottom", DX.NOT_TINTED.id_class(), Do_1::id_byte);
      this.id_case(xu_3.Gr, var1, var2);
   }

   private void G() {
      this.id_class(rdy_3.WQ);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.XJ)
               .id_class(
                  Dd_1.id_class(rCT.J)
                     .id_class(var1 -> DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.XJ, "_stage" + var1, Uh_1.id_double, Do_1::id_byte)))
               )
         );
   }

   private void O() {
      this.id_class(rdy_3.bq);
      this.id_class
         .accept(Dp_1.id_class(xu_3.OX).id_class(Dd_1.id_class(rCT.c, rCT.u).id_break((var1, var2) -> Arrays.asList(id_class(this.id_class(var1, var2))))));
   }

   private void id_extends(xd_3 var1, xd_3 var2) {
      Uh_1.K.id_class(DK.id_class(var1.id_case()), Do_1.id_new(var2), this.id_break);
   }

   private void id_extends(xd_3 var1) {
      this.id_class(var1, var1);
   }

   private void id_extends() {
      rqO_2 var1 = Do_1.id_class(xu_3.ha, "_top_open");
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.ha)
               .id_class(this.id_finally())
               .id_class(
                  Dd_1.id_class(rCT.id_else)
                     .id_class(false, DS.id_class().id_class(Ds_1.id_byte, Uk_1.id_throws.id_class(xu_3.ha, this.id_break)))
                     .id_class(
                        true,
                        DS.id_class()
                           .id_class(
                              Ds_1.id_byte,
                              Uk_1.id_throws.get(xu_3.ha).id_class(var1x -> var1x.id_class(UX.id_case, var1)).id_class(xu_3.ha, "_open", this.id_break)
                           )
                     )
               )
         );
   }

   private void id_goto(xd_3 var1) {
      this.id_byte(var1, Uk_1.id_native);
      Uh_1.o.id_class(DK.id_class(var1.id_case()), Do_1.id_new(var1), this.id_break);
   }

   private void id_goto() {
      rqO_2 var1 = DK.id_class(xu_3.SO);
      rqO_2 var2 = DK.id_class(xu_3.SO, "_filled");
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.SO)
               .id_class(
                  Dd_1.id_class(rCT.id_private)
                     .id_class(false, DS.id_class().id_class(Ds_1.id_byte, var1))
                     .id_class(true, DS.id_class().id_class(Ds_1.id_byte, var2))
               )
               .id_class(id_byte())
         );
   }

   private void id_case(xd_3 var1, rqO_2 var2) {
      rqO_2 var3 = Uh_1.id_abstract.id_class(var1, Do_1.id_catch(var2), this.id_break);
      this.id_class.accept(id_byte(var1, var3));
   }

   private DM id_case(xd_3 var1) {
      return this.id_protected(var1, Uk_1.id_class);
   }

   private void id_case(xd_3 var1, rqO_2 var2, rqO_2 var3) {
      this.id_class
         .accept(
            Dp_1.id_class(var1)
               .id_class(
                  Dd_1.id_class(rCT.G)
                     .id_class(rCf_1.LOWER, DS.id_class().id_class(Ds_1.id_byte, var3))
                     .id_class(rCf_1.UPPER, DS.id_class().id_class(Ds_1.id_byte, var2))
               )
         );
   }

   private void id_case(xd_3 var1, xd_3 var2) {
      this.id_throws(var1);
      Do_1 var3 = Do_1.id_break(var1, var2);
      rqO_2 var4 = Uh_1.d.id_class(var2, var3, this.id_break);
      rqO_2 var5 = Uh_1.k.id_class(var2, var3, this.id_break);
      rqO_2 var6 = Uh_1.W.id_class(var2, var3, this.id_break);
      rqO_2 var7 = Uh_1.J.id_class(var2, var3, this.id_break);
      rqO_2 var8 = Uh_1.x.id_class(var2, var3, this.id_break);
      rdb_3 var9 = var2.id_case();
      Uh_1.g.id_class(DK.id_class(var9), Do_1.id_instanceof(var1), this.id_break);
      this.id_class
         .accept(
            Dl_1.id_class(var2)
               .id_class(DS.id_class().id_class(Ds_1.id_byte, var4))
               .id_class(DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, var5))
               .id_class(DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R90))
               .id_class(DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, var6))
               .id_class(DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, var6).id_class(Ds_1.id_break, DE.R90))
               .id_class(DI.id_class().id_class(rCT.id_void, false), DS.id_class().id_class(Ds_1.id_byte, var7))
               .id_class(DI.id_class().id_class(rCT.id_static, false), DS.id_class().id_class(Ds_1.id_byte, var8))
               .id_class(DI.id_class().id_class(rCT.id_import, false), DS.id_class().id_class(Ds_1.id_byte, var8).id_class(Ds_1.id_break, DE.R90))
               .id_class(DI.id_class().id_class(rCT.id_short, false), DS.id_class().id_class(Ds_1.id_byte, var7).id_class(Ds_1.id_break, DE.R270))
         );
   }

   private static Dd_1 id_case() {
      return Dd_1.id_class(rCT.id_abstract)
         .id_class(rpB_2.Y, DS.id_class())
         .id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_class, DE.R90))
         .id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90));
   }

   private void id_const() {
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Pi)
               .id_class(
                  Dd_1.id_class(rCT.id_char)
                     .id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Pi, "_ns")))
                     .id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Pi, "_ew")))
               )
         );
   }

   private void id_continue() {
      this.id_class(rdy_3.Jp);
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.SG)
               .id_class(DS.id_class().id_class(Ds_1.id_byte, Do_1.id_throw(xu_3.SG)))
               .id_class(DI.id_class().id_class(rCT.id_extends, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle0")))
               .id_class(DI.id_class().id_class(rCT.id_native, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle1")))
               .id_class(DI.id_class().id_class(rCT.id_volatile, true), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_bottle2")))
               .id_class(DI.id_class().id_class(rCT.id_extends, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty0")))
               .id_class(DI.id_class().id_class(rCT.id_native, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty1")))
               .id_class(DI.id_class().id_class(rCT.id_volatile, false), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.SG, "_empty2")))
         );
   }

   private void id_continue(xd_3 var1) {
      Do_1 var2 = new Do_1()
         .id_class(UX.id_throws, Do_1.id_throw(xu_3.PR))
         .id_class(UX.id_case, Do_1.id_throw(var1))
         .id_class(UX.id_implements, Do_1.id_class(var1, "_side"));
      this.id_class.accept(id_byte(var1, Uh_1.id_private.id_class(var1, var2, this.id_break)));
   }

   private void id_else() {
      Do_1 var1 = new Do_1()
         .id_class(UX.id_byte, Do_1.id_class(xu_3.XE, "_front"))
         .id_class(UX.id_package, Do_1.id_class(xu_3.XE, "_bottom"))
         .id_class(UX.id_final, Do_1.id_class(xu_3.XE, "_top"))
         .id_class(UX.id_finally, Do_1.id_class(xu_3.XE, "_front"))
         .id_class(UX.id_extends, Do_1.id_class(xu_3.XE, "_front"))
         .id_class(UX.id_native, Do_1.id_class(xu_3.XE, "_side"))
         .id_class(UX.id_volatile, Do_1.id_class(xu_3.XE, "_side"));
      this.id_class.accept(id_byte(xu_3.XE, Uh_1.id_class.id_class(xu_3.XE, var1, this.id_break)));
   }

   private List<rqO_2> id_else(xd_3 var1) {
      rqO_2 var2 = Uh_1.v.id_class(DK.id_class(var1, "_side0"), Do_1.id_continue(var1), this.id_break);
      rqO_2 var3 = Uh_1.v.id_class(DK.id_class(var1, "_side1"), Do_1.id_super(var1), this.id_break);
      rqO_2 var4 = Uh_1.F.id_class(DK.id_class(var1, "_side_alt0"), Do_1.id_continue(var1), this.id_break);
      rqO_2 var5 = Uh_1.F.id_class(DK.id_class(var1, "_side_alt1"), Do_1.id_super(var1), this.id_break);
      return ImmutableList.of(var2, var3, var4, var5);
   }

   private void id_for() {
      Do_1 var1 = new Do_1().id_class(UX.id_abstract, Do_1.id_class(xu_3.rB, "_top")).id_class(UX.id_implements, Do_1.id_class(xu_3.rB, "_side"));
      Do_1 var2 = var1.id_break(UX.id_char, Do_1.id_class(xu_3.rB, "_top_sticky"));
      Do_1 var3 = var1.id_break(UX.id_char, Do_1.id_class(xu_3.rB, "_top"));
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.rS)
               .id_class(
                  Dd_1.id_class(rCT.id_public, rCT.V)
                     .id_class(false, rCg_1.DEFAULT, DS.id_class().id_class(Ds_1.id_byte, Uh_1.q.id_class(xu_3.rB, "_head", var3, this.id_break)))
                     .id_class(false, rCg_1.STICKY, DS.id_class().id_class(Ds_1.id_byte, Uh_1.q.id_class(xu_3.rB, "_head_sticky", var2, this.id_break)))
                     .id_class(true, rCg_1.DEFAULT, DS.id_class().id_class(Ds_1.id_byte, Uh_1.T.id_class(xu_3.rB, "_head_short", var3, this.id_break)))
                     .id_class(true, rCg_1.STICKY, DS.id_class().id_class(Ds_1.id_byte, Uh_1.T.id_class(xu_3.rB, "_head_short_sticky", var2, this.id_break)))
               )
               .id_class(id_throws())
         );
   }

   private void id_implements() {
      this.id_class(xu_3.hs);
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.hs)
               .id_class(DI.id_class().id_class(rCT.h, 0), this.id_class(0))
               .id_class(DI.id_class().id_class(rCT.h, 1), this.id_class(1))
               .id_class(DI.id_class().id_class(rCT.o, rCy_1.SMALL), DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, "_small_leaves")))
               .id_class(DI.id_class().id_class(rCT.o, rCy_1.LARGE), DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.hs, "_large_leaves")))
         );
   }

   private void id_implements(xd_3 var1, xd_3 var2) {
      rqO_2 var3 = DK.id_class(var1);
      this.id_class.accept(Dp_1.id_class(var2, DS.id_class().id_class(Ds_1.id_byte, var3)));
      this.id_class(var2, var3);
   }

   private void id_implements(xd_3 var1) {
      Do_1 var2 = Do_1.id_break(var1);
      rqO_2 var3 = Uh_1.id_default.id_class(var1, var2, this.id_break);
      rqO_2 var4 = Uh_1.id_const.id_class(var1, var2, this.id_break);
      rqO_2 var5 = Uh_1.id_strictfp.id_class(var1, var2, this.id_break);
      this.id_class.accept(id_protected(var1, var3, var4, var5));
      this.id_class(var1, var4);
   }

   private void id_import() {
      rqO_2 var1 = DK.id_class(xu_3.Bf, "_post_ends");
      rqO_2 var2 = DK.id_class(xu_3.Bf, "_post");
      rqO_2 var3 = DK.id_class(xu_3.Bf, "_cap");
      rqO_2 var4 = DK.id_class(xu_3.Bf, "_cap_alt");
      rqO_2 var5 = DK.id_class(xu_3.Bf, "_side");
      rqO_2 var6 = DK.id_class(xu_3.Bf, "_side_alt");
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.Bf)
               .id_class(DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(
                  DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var2)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_void, true).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, true).id_class(rCT.id_import, false).id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, true).id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var4)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_void, false).id_class(rCT.id_static, false).id_class(rCT.id_import, false).id_class(rCT.id_short, true),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R90)
               )
               .id_class(DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, var5))
               .id_class(DI.id_class().id_class(rCT.id_static, true), DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R90))
               .id_class(DI.id_class().id_class(rCT.id_import, true), DS.id_class().id_class(Ds_1.id_byte, var6))
               .id_class(DI.id_class().id_class(rCT.id_short, true), DS.id_class().id_class(Ds_1.id_byte, var6).id_class(Ds_1.id_break, DE.R90))
         );
      this.id_break(xu_3.Bf);
   }

   private void id_instanceof() {
      rqO_2 var1 = Do_1.id_class(xu_3.sA, "_side");
      Do_1 var2 = new Do_1().id_class(UX.id_case, Do_1.id_class(xu_3.sA, "_top")).id_class(UX.id_implements, var1);
      Do_1 var3 = new Do_1().id_class(UX.id_case, Do_1.id_class(xu_3.sA, "_inverted_top")).id_class(UX.id_implements, var1);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.sA)
               .id_class(
                  Dd_1.id_class(rCT.id_int)
                     .id_class(false, DS.id_class().id_class(Ds_1.id_byte, Uh_1.X.id_class(xu_3.sA, var2, this.id_break)))
                     .id_class(true, DS.id_class().id_class(Ds_1.id_byte, Uh_1.X.id_class(DK.id_class(xu_3.sA, "_inverted"), var3, this.id_break)))
               )
         );
   }

   private void id_new() {
      Do_1 var1 = Do_1.id_class(xu_3.bO);
      Do_1 var2 = Do_1.id_class(Do_1.id_class(xu_3.Ge, "_side"), var1.id_class(UX.id_case));
      rqO_2 var3 = Uh_1.id_long.id_class(xu_3.Ge, var2, this.id_break);
      rqO_2 var4 = Uh_1.id_float.id_class(xu_3.Ge, var2, this.id_break);
      rqO_2 var5 = Uh_1.id_throws.id_break(xu_3.Ge, "_double", var2, this.id_break);
      this.id_class.accept(id_throws(xu_3.Ge, var3, var4, var5));
      this.id_class.accept(id_byte(xu_3.bO, Uh_1.id_byte.id_class(xu_3.bO, var1, this.id_break)));
   }

   private void id_new(xd_3 var1) {
      Do_1 var2 = new Do_1()
         .id_class(UX.id_case, Do_1.id_class(xu_3.Ps, "_top"))
         .id_class(UX.id_implements, Do_1.id_class(xu_3.Ps, "_side"))
         .id_class(UX.id_catch, Do_1.id_class(var1, "_front"));
      Do_1 var3 = new Do_1().id_class(UX.id_implements, Do_1.id_class(xu_3.Ps, "_top")).id_class(UX.id_catch, Do_1.id_class(var1, "_front_vertical"));
      rqO_2 var4 = Uh_1.id_implements.id_class(var1, var2, this.id_break);
      rqO_2 var5 = Uh_1.id_extends.id_class(var1, var3, this.id_break);
      this.id_class
         .accept(
            Dp_1.id_class(var1)
               .id_class(
                  Dd_1.id_class(rCT.id_default)
                     .id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_class, DE.R180))
                     .id_class(rpr_3.UP, DS.id_class().id_class(Ds_1.id_byte, var5))
                     .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_byte, var4))
                     .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R270))
               )
         );
   }

   private void id_package(xd_3 var1) {
      rqO_2 var2 = Uk_1.id_volatile.id_class(var1, this.id_break);
      this.id_class.accept(id_byte(var1, var2).id_class(id_byte()));
   }

   private void id_package() {
      this.id_class(rdy_3.hD);
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.ra)
               .id_class(
                  DI.id_class(
                     DI.id_class().id_class(rCT.S, rCY.NONE).id_class(rCT.B, rCY.NONE).id_class(rCT.s, rCY.NONE).id_class(rCT.E, rCY.NONE),
                     DI.id_class().id_class(rCT.S, rCY.SIDE, rCY.UP).id_class(rCT.B, rCY.SIDE, rCY.UP),
                     DI.id_class().id_class(rCT.B, rCY.SIDE, rCY.UP).id_class(rCT.s, rCY.SIDE, rCY.UP),
                     DI.id_class().id_class(rCT.s, rCY.SIDE, rCY.UP).id_class(rCT.E, rCY.SIDE, rCY.UP),
                     DI.id_class().id_class(rCT.E, rCY.SIDE, rCY.UP).id_class(rCT.S, rCY.SIDE, rCY.UP)
                  ),
                  DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_dot"))
               )
               .id_class(DI.id_class().id_class(rCT.S, rCY.SIDE, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side0")))
               .id_class(DI.id_class().id_class(rCT.s, rCY.SIDE, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side_alt0")))
               .id_class(
                  DI.id_class().id_class(rCT.B, rCY.SIDE, rCY.UP),
                  DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side_alt1")).id_class(Ds_1.id_break, DE.R270)
               )
               .id_class(
                  DI.id_class().id_class(rCT.E, rCY.SIDE, rCY.UP),
                  DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_side1")).id_class(Ds_1.id_break, DE.R270)
               )
               .id_class(DI.id_class().id_class(rCT.S, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")))
               .id_class(
                  DI.id_class().id_class(rCT.B, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R90)
               )
               .id_class(
                  DI.id_class().id_class(rCT.s, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R180)
               )
               .id_class(
                  DI.id_class().id_class(rCT.E, rCY.UP), DS.id_class().id_class(Ds_1.id_byte, DK.id_class("redstone_dust_up")).id_class(Ds_1.id_break, DE.R270)
               )
         );
   }

   private void id_return(xd_3 var1) {
      rqO_2 var2 = Uk_1.id_package.id_class(var1, this.id_break);
      rqO_2 var3 = Uk_1.id_int.id_class(var1, this.id_break);
      this.id_class(var1.id_case());
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_class(rCT.id_finally, var3, var2)));
   }

   private void id_return() {
      this.id_class(rdy_3.Jq);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Sb)
               .id_class(
                  Dd_1.id_class(rCT.Z)
                     .id_class(0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb)))
                     .id_class(1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level1")))
                     .id_class(2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level2")))
                     .id_class(3, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.Sb, "_level3")))
               )
         );
   }

   private void id_super() {
      this.id_class(rdy_3.Xo);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.BB)
               .id_class(
                  Dd_1.id_class(rCT.z)
                     .id_class(0, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB)))
                     .id_class(1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice1")))
                     .id_class(2, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice2")))
                     .id_class(3, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice3")))
                     .id_class(4, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice4")))
                     .id_class(5, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice5")))
                     .id_class(6, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.BB, "_slice6")))
               )
         );
   }

   private void id_super(xd_3 var1) {
      this.id_class.accept(Dp_1.id_class(var1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(var1))).id_class(this.id_finally()));
   }

   private void id_switch() {
      rqO_2 var1 = Uk_1.id_class.id_class(xu_3.SJ, this.id_break);
      rqO_2 var2 = this.id_class(xu_3.SJ, "_on", Uh_1.id_byte, Do_1::id_break);
      this.id_class.accept(Dp_1.id_class(xu_3.SJ).id_class(id_class(rCT.id_continue, var2, var1)));
   }

   private void id_throw() {
      Do_1 var1 = new Do_1().id_class(UX.id_instanceof, Do_1.id_throw(xu_3.id_finally)).id_class(UX.id_case, Do_1.id_throw(xu_3.PS));
      Do_1 var2 = new Do_1().id_class(UX.id_instanceof, Do_1.id_throw(xu_3.id_finally)).id_class(UX.id_case, Do_1.id_class(xu_3.PS, "_moist"));
      rqO_2 var3 = Uh_1.m.id_class(xu_3.PS, var1, this.id_break);
      rqO_2 var4 = Uh_1.m.id_class(Do_1.id_class(xu_3.PS, "_moist"), var2, this.id_break);
      this.id_class.accept(Dp_1.id_class(xu_3.PS).id_class(id_class(rCT.n, 7, var4, var3)));
   }

   private void id_try() {
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.JG)
               .id_class(DS.id_class().id_class(Ds_1.id_byte, Do_1.id_throw(xu_3.JG)))
               .id_class(DI.id_class().id_class(rCT.v, 1), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents1")))
               .id_class(DI.id_class().id_class(rCT.v, 2), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents2")))
               .id_class(DI.id_class().id_class(rCT.v, 3), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents3")))
               .id_class(DI.id_class().id_class(rCT.v, 4), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents4")))
               .id_class(DI.id_class().id_class(rCT.v, 5), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents5")))
               .id_class(DI.id_class().id_class(rCT.v, 6), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents6")))
               .id_class(DI.id_class().id_class(rCT.v, 7), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents7")))
               .id_class(DI.id_class().id_class(rCT.v, 8), DS.id_class().id_class(Ds_1.id_byte, Do_1.id_class(xu_3.JG, "_contents_ready")))
         );
   }

   private void id_while() {
      rqO_2 var1 = DK.id_class(xu_3.bC, "_side");
      rqO_2 var2 = DK.id_class(xu_3.bC, "_noside");
      rqO_2 var3 = DK.id_class(xu_3.bC, "_noside1");
      rqO_2 var4 = DK.id_class(xu_3.bC, "_noside2");
      rqO_2 var5 = DK.id_class(xu_3.bC, "_noside3");
      this.id_class
         .accept(
            Dl_1.id_class(xu_3.bC)
               .id_class(DI.id_class().id_class(rCT.id_void, true), DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(
                  DI.id_class().id_class(rCT.id_static, true),
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_import, true),
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_short, true),
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_long, true),
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_float, true),
                  DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_void, false),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2),
                  DS.id_class().id_class(Ds_1.id_byte, var3),
                  DS.id_class().id_class(Ds_1.id_byte, var4),
                  DS.id_class().id_class(Ds_1.id_byte, var5)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_static, false),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_import, false),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_short, false),
                  DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_long, false),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_class, DE.R270).id_class(Ds_1.id_protected, true)
               )
               .id_class(
                  DI.id_class().id_class(rCT.id_float, false),
                  DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true),
                  DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_throws, 2).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_protected, true)
               )
         );
   }

   private void id_static() {
      rqO_2 var1 = DK.id_class(xu_3.sl);
      rqO_2 var2 = DK.id_class(xu_3.sl, "_side");
      this.id_class(rdy_3.sz);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.sl)
               .id_class(
                  Dd_1.id_class(rCT.id_const)
                     .id_class(rpr_3.DOWN, DS.id_class().id_class(Ds_1.id_byte, var1))
                     .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_byte, var2))
                     .id_class(rpr_3.EAST, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270))
               )
         );
   }

   private void id_public() {
      Do_1 var1 = Do_1.id_break(xu_3.bl);
      rqO_2 var2 = Uh_1.h.id_class(xu_3.bl, var1, this.id_break);
      rqO_2 var3 = this.id_class(xu_3.bl, "_dead", Uh_1.h, var1x -> var1.id_break(UX.id_break, var1x));
      this.id_class.accept(Dp_1.id_class(xu_3.bl).id_class(id_class(rCT.x, 5, var3, var2)));
   }

   private void id_public(xd_3 var1) {
      this.id_class.accept(Dp_1.id_class(var1, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(var1))).id_class(id_break()));
   }

   private static Dt_1 id_protected(xd_3 var0, rqO_2 var1, rqO_2 var2, rqO_2 var3) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.id_strictfp, rCT.b, rCT.id_else)
               .id_class(rpr_3.NORTH, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rpr_3.WEST, rCj_1.BOTTOM, false, DS.id_class().id_class(Ds_1.id_byte, var2))
               .id_class(rpr_3.NORTH, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpr_3.SOUTH, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpr_3.EAST, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpr_3.WEST, rCj_1.TOP, false, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpr_3.NORTH, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(rpr_3.SOUTH, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
               .id_class(rpr_3.EAST, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
               .id_class(rpr_3.WEST, rCj_1.BOTTOM, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
               .id_class(rpr_3.NORTH, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3))
               .id_class(rpr_3.SOUTH, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
               .id_class(rpr_3.EAST, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
               .id_class(rpr_3.WEST, rCj_1.TOP, true, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
         );
   }

   private static Dd_1 id_protected() {
      return Dd_1.id_class(rCT.id_strictfp)
         .id_class(rpr_3.EAST, DS.id_class())
         .id_class(rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R90))
         .id_class(rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R180))
         .id_class(rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_break, DE.R270));
   }

   static Dt_1 id_protected(xd_3 var0, rqO_2 var1, rqO_2 var2) {
      return Dp_1.id_class(var0)
         .id_class(
            Dd_1.id_class(rCT.id_abstract)
               .id_class(rpB_2.Y, DS.id_class().id_class(Ds_1.id_byte, var1))
               .id_class(rpB_2.Z, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R90))
               .id_class(rpB_2.X, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90))
         );
   }

   private DM id_protected(xd_3 var1, UW var2) {
      Uk_1 var3 = var2.get(var1);
      return new DM(this, var3.id_break()).id_class(var1, var3.id_class());
   }

   private DO id_protected(xd_3 var1, xd_3 var2) {
      return new DO(this, DK.id_class(var1), var2);
   }

   private void id_protected(xd_3 var1) {
      rqO_2 var2 = Uk_1.id_class.id_class(var1, this.id_break);
      this.id_class.accept(id_break(var1, var2));
   }

   static Dt_1 id_protected(xd_3 var0, rqO_2 var1) {
      return Dp_1.id_class(var0, DS.id_class().id_class(Ds_1.id_byte, var1)).id_class(id_case());
   }

   private void id_private(xd_3 var1, xd_3 var2) {
      Do_1 var3 = Do_1.id_break(var2);
      rqO_2 var4 = Uh_1.id_interface.id_class(var1, var3, this.id_break);
      rqO_2 var5 = Uh_1.id_char.id_class(var1, var3, this.id_break);
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_class(rCT.H, 1, var5, var4)));
   }

   private void id_private(xd_3 var1) {
      Do_1 var2 = Do_1.id_break(var1);
      rqO_2 var3 = Uh_1.id_boolean.id_class(var1, var2, this.id_break);
      rqO_2 var4 = Uh_1.id_transient.id_class(var1, var2, this.id_break);
      rqO_2 var5 = Uh_1.id_for.id_class(var1, var2, this.id_break);
      this.id_class.accept(id_byte(var1, var3, var4, var5));
      this.id_class(var1, var4);
   }

   private void id_private() {
      rqO_2 var1 = this.id_class(xu_3.rP, "_top", Uh_1.t, Do_1::id_class);
      rqO_2 var2 = this.id_class(xu_3.rP, "_bottom", Uh_1.t, Do_1::id_class);
      this.id_case(xu_3.rP, var1, var2);
   }

   private void id_abstract() {
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.bj)
               .id_class(
                  Dd_1.id_class(rCT.J)
                     .id_class(0, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_0", Uh_1.id_byte, Do_1::id_break)))
                     .id_class(1, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_1", Uh_1.id_byte, Do_1::id_break)))
                     .id_class(2, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_2", Uh_1.id_byte, Do_1::id_break)))
                     .id_class(3, DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.bj, "_3", Uh_1.id_byte, Do_1::id_break)))
               )
         );
   }

   private void id_final() {
      Do_1 var1 = Do_1.id_class(Do_1.id_throw(xu_3.rj), Do_1.id_throw(xu_3.id_final));
      rqO_2 var2 = Uh_1.id_throws.id_class(xu_3.rj, var1, this.id_break);
      this.id_class.accept(id_byte(xu_3.rj, var2));
   }

   private void id_final(xd_3 var1) {
      Do_1 var2 = Do_1.id_synchronized(var1);
      rqO_2 var3 = Uh_1.z.id_class(var1, var2, this.id_break);
      rqO_2 var4 = this.id_class(var1, "_conditional", Uh_1.z, var1x -> var2.id_break(UX.id_implements, var1x));
      this.id_class.accept(Dp_1.id_class(var1).id_class(id_class(rCT.id_byte, var4, var3)).id_class(id_throws()));
   }

   private void id_transient() {
      Do_1 var1 = new Do_1().id_class(UX.id_throws, Do_1.id_class(xu_3.rB, "_bottom")).id_class(UX.id_implements, Do_1.id_class(xu_3.rB, "_side"));
      rqO_2 var2 = Do_1.id_class(xu_3.rB, "_top_sticky");
      rqO_2 var3 = Do_1.id_class(xu_3.rB, "_top");
      Do_1 var4 = var1.id_break(UX.id_char, var2);
      Do_1 var5 = var1.id_break(UX.id_char, var3);
      rqO_2 var6 = DK.id_class(xu_3.rB, "_base");
      this.id_class(xu_3.rB, var6, var5);
      this.id_class(xu_3.D, var6, var4);
      rqO_2 var7 = Uh_1.id_private.id_class(xu_3.rB, "_inventory", var1.id_break(UX.id_case, var3), this.id_break);
      rqO_2 var8 = Uh_1.id_private.id_class(xu_3.D, "_inventory", var1.id_break(UX.id_case, var2), this.id_break);
      this.id_class(xu_3.rB, var7);
      this.id_class(xu_3.D, var8);
   }

   private void id_volatile(xd_3 var1) {
      rqO_2 var2 = this.id_class(var1, "", Uh_1.B, Do_1::id_throws);
      rqO_2 var3 = this.id_class(var1, "", Uh_1.s, Do_1::id_throws);
      rqO_2 var4 = this.id_class(var1, "", Uh_1.E, Do_1::id_throws);
      rqO_2 var5 = this.id_class(var1, "_on", Uh_1.B, Do_1::id_throws);
      rqO_2 var6 = this.id_class(var1, "_on", Uh_1.s, Do_1::id_throws);
      rqO_2 var7 = this.id_class(var1, "_on", Uh_1.E, Do_1::id_throws);
      Dd_1 var8 = Dd_1.id_class(rCT.id_return, rCT.O).id_class((var6x, var7x) -> {
         switch (var7x) {
            case NORTH_SOUTH:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var5 : var2);
            case EAST_WEST:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var5 : var2).id_class(Ds_1.id_break, DE.R90);
            case ASCENDING_EAST:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var6 : var3).id_class(Ds_1.id_break, DE.R90);
            case ASCENDING_WEST:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var7 : var4).id_class(Ds_1.id_break, DE.R90);
            case ASCENDING_NORTH:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var6 : var3);
            case ASCENDING_SOUTH:
               return DS.id_class().id_class(Ds_1.id_byte, var6x ? var7 : var4);
            default:
               throw new UnsupportedOperationException("Fix you generator!");
         }
      });
      this.id_break(var1);
      this.id_class.accept(Dp_1.id_class(var1).id_class(var8));
   }

   private void id_volatile() {
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.XS, DS.id_class().id_class(Ds_1.id_byte, DK.id_class(xu_3.XS)))
               .id_class(
                  Dd_1.id_class(rCT.id_transient, rCT.id_strictfp)
                     .id_class(rCH.FLOOR, rpr_3.NORTH, DS.id_class())
                     .id_class(rCH.FLOOR, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.FLOOR, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.FLOOR, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_break, DE.R270))
                     .id_class(rCH.WALL, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R90))
                     .id_class(rCH.WALL, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.WALL, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.WALL, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R90).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rCH.CEILING, rpr_3.SOUTH, DS.id_class().id_class(Ds_1.id_class, DE.R180))
                     .id_class(rCH.CEILING, rpr_3.WEST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCH.CEILING, rpr_3.NORTH, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCH.CEILING, rpr_3.EAST, DS.id_class().id_class(Ds_1.id_class, DE.R180).id_class(Ds_1.id_break, DE.R270))
               )
         );
   }

   private List<rqO_2> id_synchronized(xd_3 var1) {
      rqO_2 var2 = Uh_1.L.id_class(DK.id_class(var1, "_up0"), Do_1.id_continue(var1), this.id_break);
      rqO_2 var3 = Uh_1.L.id_class(DK.id_class(var1, "_up1"), Do_1.id_super(var1), this.id_break);
      rqO_2 var4 = Uh_1.A.id_class(DK.id_class(var1, "_up_alt0"), Do_1.id_continue(var1), this.id_break);
      rqO_2 var5 = Uh_1.A.id_class(DK.id_class(var1, "_up_alt1"), Do_1.id_super(var1), this.id_break);
      return ImmutableList.of(var2, var3, var4, var5);
   }

   private void id_synchronized() {
      Do_1 var1 = Do_1.id_finally(xu_3.Pg);
      this.id_class.accept(id_byte(xu_3.Pg, DK.id_class(xu_3.Pg)));
      this.id_class(xu_3.Br, var1);
      this.id_class(xu_3.BP, var1);
   }

   private void id_native(xd_3 var1) {
      Do_1 var2 = Do_1.id_throws(var1);
      Do_1 var3 = Do_1.id_throws(Do_1.id_class(var1, "_corner"));
      rqO_2 var4 = Uh_1.B.id_class(var1, var2, this.id_break);
      rqO_2 var5 = Uh_1.S.id_class(var1, var3, this.id_break);
      rqO_2 var6 = Uh_1.s.id_class(var1, var2, this.id_break);
      rqO_2 var7 = Uh_1.E.id_class(var1, var2, this.id_break);
      this.id_break(var1);
      this.id_class
         .accept(
            Dp_1.id_class(var1)
               .id_class(
                  Dd_1.id_class(rCT.M)
                     .id_class(rCR.NORTH_SOUTH, DS.id_class().id_class(Ds_1.id_byte, var4))
                     .id_class(rCR.EAST_WEST, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCR.ASCENDING_EAST, DS.id_class().id_class(Ds_1.id_byte, var6).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCR.ASCENDING_WEST, DS.id_class().id_class(Ds_1.id_byte, var7).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCR.ASCENDING_NORTH, DS.id_class().id_class(Ds_1.id_byte, var6))
                     .id_class(rCR.ASCENDING_SOUTH, DS.id_class().id_class(Ds_1.id_byte, var7))
                     .id_class(rCR.SOUTH_EAST, DS.id_class().id_class(Ds_1.id_byte, var5))
                     .id_class(rCR.SOUTH_WEST, DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rCR.NORTH_WEST, DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rCR.NORTH_EAST, DS.id_class().id_class(Ds_1.id_byte, var5).id_class(Ds_1.id_break, DE.R270))
               )
         );
   }

   private void id_native(xd_3 var1, xd_3 var2) {
      this.id_class(var1, DX.NOT_TINTED);
      Do_1 var3 = Do_1.id_protected(Do_1.id_class(var1, "_pot"));
      rqO_2 var4 = DX.NOT_TINTED.id_break().id_class(var2, var3, this.id_break);
      this.id_class.accept(id_byte(var2, var4));
   }

   private void id_native() {
      rqO_2 var1 = DK.id_class(xu_3.Xb, "_floor");
      rqO_2 var2 = DK.id_class(xu_3.Xb, "_ceiling");
      rqO_2 var3 = DK.id_class(xu_3.Xb, "_wall");
      rqO_2 var4 = DK.id_class(xu_3.Xb, "_between_walls");
      this.id_class(rdy_3.Wk);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Xb)
               .id_class(
                  Dd_1.id_class(rCT.id_strictfp, rCT.id_for)
                     .id_class(rpr_3.NORTH, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, var1))
                     .id_class(rpr_3.SOUTH, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rpr_3.EAST, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.WEST, rCq_1.FLOOR, DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rpr_3.NORTH, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, var2))
                     .id_class(rpr_3.SOUTH, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rpr_3.EAST, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.WEST, rCq_1.CEILING, DS.id_class().id_class(Ds_1.id_byte, var2).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rpr_3.NORTH, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rpr_3.SOUTH, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.EAST, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var3))
                     .id_class(rpr_3.WEST, rCq_1.SINGLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var3).id_class(Ds_1.id_break, DE.R180))
                     .id_class(rpr_3.SOUTH, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R90))
                     .id_class(rpr_3.NORTH, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R270))
                     .id_class(rpr_3.EAST, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var4))
                     .id_class(rpr_3.WEST, rCq_1.DOUBLE_WALL, DS.id_class().id_class(Ds_1.id_byte, var4).id_class(Ds_1.id_break, DE.R180))
               )
         );
   }

   private void id_strictfp() {
      rqO_2 var1 = Uk_1.id_class.id_class(xu_3.PR, this.id_break);
      this.id_class
         .accept(
            Dp_1.id_class(
               xu_3.PR,
               DS.id_class().id_class(Ds_1.id_byte, var1),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R90),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R180),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_class, DE.R270),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R90),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R180),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R90).id_class(Ds_1.id_class, DE.R270),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R90),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R180),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R180).id_class(Ds_1.id_class, DE.R270),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R90),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R180),
               DS.id_class().id_class(Ds_1.id_byte, var1).id_class(Ds_1.id_break, DE.R270).id_class(Ds_1.id_class, DE.R270)
            )
         );
   }

   private void E() {
      rqO_2 var1 = Uk_1.id_class.id_class(xu_3.Js, this.id_break);
      this.id_class(xu_3.Js, var1);
      this.id_class
         .accept(
            Dp_1.id_class(xu_3.Js)
               .id_class(
                  Dd_1.id_class(rCT.Y)
                     .id_class(var1x -> DS.id_class().id_class(Ds_1.id_byte, this.id_class(xu_3.Js, "_" + var1x.id_class(), Uh_1.id_byte, Do_1::id_break)))
               )
         );
   }

   private void X() {
      this.id_class.accept(id_byte(xu_3.bV, Uh_1.id_byte.id_class(xu_3.bV, Do_1.id_break(DK.id_class("magma")), this.id_break)));
   }
}
