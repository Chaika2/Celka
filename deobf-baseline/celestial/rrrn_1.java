package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrrn_1 {
   protected static final xc_3 id_volatile = xu_3.hb.id_continue();
   protected rfi_3 id_final;
   private rpr_3 id_class;
   private rpa_3 id_break;
   private rqd_3 id_byte;
   protected int id_package;
   private final raF_2 id_protected;
   private static final Set<xd_3> id_throws = ImmutableSet.builder()
      .add(xu_3.SB)
      .add(xu_3.rR)
      .add(xu_3.rY)
      .add(xu_3.PV)
      .add(xu_3.bQ)
      .add(xu_3.bm)
      .add(xu_3.bu)
      .add(xu_3.bN)
      .add(xu_3.bc)
      .add(xu_3.PJ)
      .add(xu_3.Bf)
      .build();

   protected rrrn_1(raF_2 var1, int var2) {
      this.id_protected = var1;
      this.id_package = var2;
   }

   public rrrn_1(raF_2 var1, rcd_3 var2) {
      this(var1, var2.id_private("GD"));
      if (var2.id_throws("BB")) {
         this.id_final = new rfi_3(var2.id_final("BB"));
      }

      int var3 = var2.id_private("O");
      this.id_class(var3 == -1 ? null : rpr_3.id_break(var3));
   }

   protected void id_class(
      rRI var1,
      rfi_3 var2,
      Random var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      xc_3 var11,
      xc_3 var12,
      boolean var13,
      boolean var14
   ) {
      for (int var15 = var6; var15 <= var9; var15++) {
         for (int var16 = var5; var16 <= var8; var16++) {
            for (int var17 = var7; var17 <= var10; var17++) {
               if (!(var3.nextFloat() > var4)
                  && (!var13 || !this.id_class((rRq_1)var1, var16, var15, var17, var2).id_catch())
                  && (!var14 || this.id_class((rRR)var1, var16, var15, var17, var2))) {
                  if (var15 != var6 && var15 != var9 && var16 != var5 && var16 != var8 && var17 != var7 && var17 != var10) {
                     this.id_class(var1, var12, var16, var15, var17, var2);
                  } else {
                     this.id_class(var1, var11, var16, var15, var17, var2);
                  }
               }
            }
         }
      }
   }

   protected void id_class(rRI var1, rfi_3 var2, Random var3, float var4, int var5, int var6, int var7, xc_3 var8) {
      if (var3.nextFloat() < var4) {
         this.id_class(var1, var8, var5, var6, var7, var2);
      }
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9, boolean var10) {
      float var11 = (float)(var6 - var3 + 1);
      float var12 = (float)(var7 - var4 + 1);
      float var13 = (float)(var8 - var5 + 1);
      float var14 = (float)var3 + var11 / 2.0F;
      float var15 = (float)var5 + var13 / 2.0F;

      for (int var16 = var4; var16 <= var7; var16++) {
         float var17 = (float)(var16 - var4) / var12;

         for (int var18 = var3; var18 <= var6; var18++) {
            float var19 = ((float)var18 - var14) / (var11 * 0.5F);

            for (int var20 = var5; var20 <= var8; var20++) {
               float var21 = ((float)var20 - var15) / (var13 * 0.5F);
               if (!var10 || !this.id_class((rRq_1)var1, var18, var16, var20, var2).id_catch()) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if (var22 <= 1.05F) {
                     this.id_class(var1, var9, var18, var16, var20, var2);
                  }
               }
            }
         }
      }
   }

   protected boolean id_class(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rqO_2 var7) {
      rfH_2 var8 = new rfH_2(this.id_class(var4, var6), this.id_class(var5), this.id_break(var4, var6));
      return this.id_class(var1, var2, var3, var8, var7, (xc_3)null);
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, rrrl_1 var11) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (!var9 || !this.id_class((rRq_1)var1, var13, var12, var14, var2).id_catch()) {
                  var11.id_class(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.id_class(var1, var11.id_class(), var13, var12, var14, var2);
               }
            }
         }
      }
   }

   protected void id_class(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9, xc_3 var10, boolean var11) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (!var11 || !this.id_class((rRq_1)var1, var13, var12, var14, var2).id_catch()) {
                  if (var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.id_class(var1, var10, var13, var12, var14, var2);
                  } else {
                     this.id_class(var1, var9, var13, var12, var14, var2);
                  }
               }
            }
         }
      }
   }

   protected boolean id_class(rRR var1, int var2, int var3, int var4, rfi_3 var5) {
      int var6 = this.id_class(var2, var4);
      int var7 = this.id_class(var3 + 1);
      int var8 = this.id_break(var2, var4);
      rfH_2 var9 = new rfH_2(var6, var7, var8);
      return !var5.id_break(var9) ? false : var7 < var1.id_class(rKv_1.OCEAN_FLOOR_WG, var6, var8);
   }

   public rqd_3 id_class() {
      return this.id_byte;
   }

   public void id_class(rpr_3 var1) {
      this.id_class = var1;
      if (var1 == null) {
         this.id_byte = rqd_3.NONE;
         this.id_break = rpa_3.NONE;
      } else {
         switch (var1) {
            case SOUTH:
               this.id_break = rpa_3.LEFT_RIGHT;
               this.id_byte = rqd_3.NONE;
               break;
            case WEST:
               this.id_break = rpa_3.LEFT_RIGHT;
               this.id_byte = rqd_3.CLOCKWISE_90;
               break;
            case EAST:
               this.id_break = rpa_3.NONE;
               this.id_byte = rqd_3.CLOCKWISE_90;
               break;
            default:
               this.id_break = rpa_3.NONE;
               this.id_byte = rqd_3.NONE;
         }
      }
   }

   public void id_class(int var1, int var2, int var3) {
      this.id_final.id_class(var1, var2, var3);
   }

   protected boolean id_class(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rpr_3 var7, rqO_2 var8) {
      rfH_2 var9 = new rfH_2(this.id_class(var4, var6), this.id_class(var5), this.id_break(var4, var6));
      if (var2.id_break(var9) && !var1.id_byte(var9).id_class(xu_3.v)) {
         this.id_class(var1, xu_3.v.id_continue().id_class(dQ_2.id_volatile, var7), var4, var5, var6, var2);
         ryO_2 var10 = var1.id_class(var9);
         if (var10 instanceof rHC) {
            ((rHC)var10).id_class(var8, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean id_class(rRf_1 var1, rfi_3 var2, Random var3, rfH_2 var4, rqO_2 var5, xc_3 var6) {
      if (var2.id_break(var4) && !var1.id_byte(var4).id_class(xu_3.re)) {
         if (var6 == null) {
            var6 = id_class(var1, var4, xu_3.re.id_continue());
         }

         var1.id_class(var4, var6, 2);
         ryO_2 var7 = var1.id_class(var4);
         if (var7 instanceof rHu_1) {
            ((rHu_1)var7).id_class(var5, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public static xc_3 id_class(rRq_1 var0, rfH_2 var1, xc_3 var2) {
      rpr_3 var3 = null;

      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         rfH_2 var6 = var1.id_break(var5);
         xc_3 var7 = var0.id_byte(var6);
         if (var7.id_class(xu_3.re)) {
            return var2;
         }

         if (var7.id_implements(var0, var6)) {
            if (var3 != null) {
               var3 = null;
               break;
            }

            var3 = var5;
         }
      }

      if (var3 != null) {
         return var2.id_class(kE_2.p, var3.id_case());
      } else {
         rpr_3 var8 = var2.id_byte(kE_2.p);
         rfH_2 var9 = var1.id_break(var8);
         if (var0.id_byte(var9).id_implements(var0, var9)) {
            var8 = var8.id_case();
            var9 = var1.id_break(var8);
         }

         if (var0.id_byte(var9).id_implements(var0, var9)) {
            var8 = var8.id_catch();
            var9 = var1.id_break(var8);
         }

         if (var0.id_byte(var9).id_implements(var0, var9)) {
            var8 = var8.id_case();
            var1.id_break(var8);
         }

         return var2.id_class(kE_2.p, var8);
      }
   }

   protected boolean id_class(rRq_1 var1, rfi_3 var2) {
      int var3 = Math.max(this.id_final.id_class - 1, var2.id_class);
      int var4 = Math.max(this.id_final.id_break - 1, var2.id_break);
      int var5 = Math.max(this.id_final.id_byte - 1, var2.id_byte);
      int var6 = Math.min(this.id_final.id_protected + 1, var2.id_protected);
      int var7 = Math.min(this.id_final.id_throws + 1, var2.id_throws);
      int var8 = Math.min(this.id_final.id_case + 1, var2.id_case);
      rfw_3 var9 = new rfw_3();

      for (int var10 = var3; var10 <= var6; var10++) {
         for (int var11 = var5; var11 <= var8; var11++) {
            if (var1.id_byte(var9.id_class(var10, var4, var11)).id_byte().id_class()) {
               return true;
            }

            if (var1.id_byte(var9.id_class(var10, var7, var11)).id_byte().id_class()) {
               return true;
            }
         }
      }

      for (int var12 = var3; var12 <= var6; var12++) {
         for (int var14 = var4; var14 <= var7; var14++) {
            if (var1.id_byte(var9.id_class(var12, var14, var5)).id_byte().id_class()) {
               return true;
            }

            if (var1.id_byte(var9.id_class(var12, var14, var8)).id_byte().id_class()) {
               return true;
            }
         }
      }

      for (int var13 = var5; var13 <= var8; var13++) {
         for (int var15 = var4; var15 <= var7; var15++) {
            if (var1.id_byte(var9.id_class(var3, var15, var13)).id_byte().id_class()) {
               return true;
            }

            if (var1.id_byte(var9.id_class(var6, var15, var13)).id_byte().id_class()) {
               return true;
            }
         }
      }

      return false;
   }

   public static rrrn_1 id_class(List<rrrn_1> var0, rfi_3 var1) {
      for (rrrn_1 var3 : var0) {
         if (var3.id_catch() != null && var3.id_catch().id_class(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean id_class(rfj_3 var1, int var2) {
      int var3 = var1.id_break << 4;
      int var4 = var1.id_byte << 4;
      return this.id_final.id_class(var3 - var2, var4 - var2, var3 + 15 + var2, var4 + 15 + var2);
   }

   public abstract boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7);

   public void id_class(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
   }

   protected abstract void id_class(rcd_3 var1);

   protected xc_3 id_class(rRq_1 var1, int var2, int var3, int var4, rfi_3 var5) {
      int var6 = this.id_class(var2, var4);
      int var7 = this.id_class(var3);
      int var8 = this.id_break(var2, var4);
      rfH_2 var9 = new rfH_2(var6, var7, var8);
      return !var5.id_break(var9) ? xu_3.id_class.id_continue() : var1.id_byte(var9);
   }

   protected void id_class(rRI var1, xc_3 var2, int var3, int var4, int var5, rfi_3 var6) {
      rfH_2 var7 = new rfH_2(this.id_class(var3, var5), this.id_class(var4), this.id_break(var3, var5));
      if (var6.id_break(var7)) {
         if (this.id_break != rpa_3.NONE) {
            var2 = var2.id_class(this.id_break);
         }

         if (this.id_byte != rqd_3.NONE) {
            var2 = var2.id_class(this.id_byte);
         }

         var1.id_class(var7, var2, 2);
         rXE var8 = var1.id_break(var7);
         if (!var8.id_byte()) {
            var1.id_extends().id_class(var7, var8.id_class(), 0);
         }

         if (id_throws.contains(var2.id_break())) {
            var1.id_volatile(var7).id_extends(var7);
         }
      }
   }

   protected int id_class(int var1) {
      return this.id_implements() == null ? var1 : var1 + this.id_final.id_break;
   }

   protected int id_class(int var1, int var2) {
      rpr_3 var3 = this.id_implements();
      if (var3 == null) {
         return var1;
      } else {
         switch (var3) {
            case NORTH:
            case SOUTH:
               return this.id_final.id_class + var1;
            case WEST:
               return this.id_final.id_protected - var2;
            case EAST:
               return this.id_final.id_class + var2;
            default:
               return var1;
         }
      }
   }

   protected void id_break(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var4; var9 <= var7; var9++) {
         for (int var10 = var3; var10 <= var6; var10++) {
            for (int var11 = var5; var11 <= var8; var11++) {
               this.id_class(var1, xu_3.id_class.id_continue(), var10, var9, var11, var2);
            }
         }
      }
   }

   protected void id_break(rRI var1, xc_3 var2, int var3, int var4, int var5, rfi_3 var6) {
      int var7 = this.id_class(var3, var5);
      int var8 = this.id_class(var4);
      int var9 = this.id_break(var3, var5);
      if (var6.id_break(new rfH_2(var7, var8, var9))) {
         while ((var1.id_finally(new rfH_2(var7, var8, var9)) || var1.id_byte(new rfH_2(var7, var8, var9)).id_byte().id_class()) && var8 > 1) {
            var1.id_class(new rfH_2(var7, var8, var9), var2, 2);
            var8--;
         }
      }
   }

   protected int id_break(int var1, int var2) {
      rpr_3 var3 = this.id_implements();
      if (var3 == null) {
         return var2;
      } else {
         switch (var3) {
            case NORTH:
               return this.id_final.id_case - var2;
            case SOUTH:
               return this.id_final.id_byte + var2;
            case WEST:
            case EAST:
               return this.id_final.id_byte + var1;
            default:
               return var2;
         }
      }
   }

   public raF_2 id_finally() {
      return this.id_protected;
   }

   public rfi_3 id_catch() {
      return this.id_final;
   }

   public final rcd_3 id_case() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("id", rVL.I.id_break(this.id_finally()).toString());
      var1.id_class("BB", this.id_final.id_private());
      rpr_3 var2 = this.id_implements();
      var1.id_break("O", var2 == null ? -1 : var2.id_protected());
      var1.id_break("GD", this.id_package);
      this.id_class(var1);
      return var1;
   }

   public rpr_3 id_implements() {
      return this.id_class;
   }

   public int id_private() {
      return this.id_package;
   }
}
