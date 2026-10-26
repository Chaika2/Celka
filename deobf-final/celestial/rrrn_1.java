package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrrn_1 {
   protected static final xc_3 volatile_ = xu_3.hb.continue_();
   protected rfi_3 final_;
   private rpr_3 class_;
   private rpa_3 break_;
   private rqd_3 byte_;
   protected int package_;
   private final raF_2 protected_;
   private static final Set<xd_3> throws_ = ImmutableSet.builder()
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
      this.protected_ = var1;
      this.package_ = var2;
   }

   public rrrn_1(raF_2 var1, rcd_3 var2) {
      this(var1, var2.private_("GD"));
      if (var2.throws_("BB")) {
         this.final_ = new rfi_3(var2.final_("BB"));
      }

      int var3 = var2.private_("O");
      this.class_(var3 == -1 ? null : rpr_3.break_(var3));
   }

   protected void class_(
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
                  && (!var13 || !this.class_((rRq_1)var1, var16, var15, var17, var2).catch_())
                  && (!var14 || this.class_((rRR)var1, var16, var15, var17, var2))) {
                  if (var15 != var6 && var15 != var9 && var16 != var5 && var16 != var8 && var17 != var7 && var17 != var10) {
                     this.class_(var1, var12, var16, var15, var17, var2);
                  } else {
                     this.class_(var1, var11, var16, var15, var17, var2);
                  }
               }
            }
         }
      }
   }

   protected void class_(rRI var1, rfi_3 var2, Random var3, float var4, int var5, int var6, int var7, xc_3 var8) {
      if (var3.nextFloat() < var4) {
         this.class_(var1, var8, var5, var6, var7, var2);
      }
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9, boolean var10) {
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
               if (!var10 || !this.class_((rRq_1)var1, var18, var16, var20, var2).catch_()) {
                  float var22 = var19 * var19 + var17 * var17 + var21 * var21;
                  if (var22 <= 1.05F) {
                     this.class_(var1, var9, var18, var16, var20, var2);
                  }
               }
            }
         }
      }
   }

   protected boolean class_(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rqO_2 var7) {
      rfH_2 var8 = new rfH_2(this.class_(var4, var6), this.class_(var5), this.break_(var4, var6));
      return this.class_(var1, var2, var3, var8, var7, (xc_3)null);
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, rrrl_1 var11) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (!var9 || !this.class_((rRq_1)var1, var13, var12, var14, var2).catch_()) {
                  var11.class_(var10, var13, var12, var14, var12 == var4 || var12 == var7 || var13 == var3 || var13 == var6 || var14 == var5 || var14 == var8);
                  this.class_(var1, var11.class_(), var13, var12, var14, var2);
               }
            }
         }
      }
   }

   protected void class_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8, xc_3 var9, xc_3 var10, boolean var11) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (!var11 || !this.class_((rRq_1)var1, var13, var12, var14, var2).catch_()) {
                  if (var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
                     this.class_(var1, var10, var13, var12, var14, var2);
                  } else {
                     this.class_(var1, var9, var13, var12, var14, var2);
                  }
               }
            }
         }
      }
   }

   protected boolean class_(rRR var1, int var2, int var3, int var4, rfi_3 var5) {
      int var6 = this.class_(var2, var4);
      int var7 = this.class_(var3 + 1);
      int var8 = this.break_(var2, var4);
      rfH_2 var9 = new rfH_2(var6, var7, var8);
      return !var5.break_(var9) ? false : var7 < var1.class_(rKv_1.OCEAN_FLOOR_WG, var6, var8);
   }

   public rqd_3 class_() {
      return this.byte_;
   }

   public void class_(rpr_3 var1) {
      this.class_ = var1;
      if (var1 == null) {
         this.byte_ = rqd_3.NONE;
         this.break_ = rpa_3.NONE;
      } else {
         switch (var1) {
            case SOUTH:
               this.break_ = rpa_3.LEFT_RIGHT;
               this.byte_ = rqd_3.NONE;
               break;
            case WEST:
               this.break_ = rpa_3.LEFT_RIGHT;
               this.byte_ = rqd_3.CLOCKWISE_90;
               break;
            case EAST:
               this.break_ = rpa_3.NONE;
               this.byte_ = rqd_3.CLOCKWISE_90;
               break;
            default:
               this.break_ = rpa_3.NONE;
               this.byte_ = rqd_3.NONE;
         }
      }
   }

   public void class_(int var1, int var2, int var3) {
      this.final_.class_(var1, var2, var3);
   }

   protected boolean class_(rRI var1, rfi_3 var2, Random var3, int var4, int var5, int var6, rpr_3 var7, rqO_2 var8) {
      rfH_2 var9 = new rfH_2(this.class_(var4, var6), this.class_(var5), this.break_(var4, var6));
      if (var2.break_(var9) && !var1.byte_(var9).class_(xu_3.v)) {
         this.class_(var1, xu_3.v.continue_().class_(dQ_2.volatile_, var7), var4, var5, var6, var2);
         ryO_2 var10 = var1.class_(var9);
         if (var10 instanceof rHC) {
            ((rHC)var10).class_(var8, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean class_(rRf_1 var1, rfi_3 var2, Random var3, rfH_2 var4, rqO_2 var5, xc_3 var6) {
      if (var2.break_(var4) && !var1.byte_(var4).class_(xu_3.re)) {
         if (var6 == null) {
            var6 = class_(var1, var4, xu_3.re.continue_());
         }

         var1.class_(var4, var6, 2);
         ryO_2 var7 = var1.class_(var4);
         if (var7 instanceof rHu_1) {
            ((rHu_1)var7).class_(var5, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public static xc_3 class_(rRq_1 var0, rfH_2 var1, xc_3 var2) {
      rpr_3 var3 = null;

      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         rfH_2 var6 = var1.break_(var5);
         xc_3 var7 = var0.byte_(var6);
         if (var7.class_(xu_3.re)) {
            return var2;
         }

         if (var7.implements_(var0, var6)) {
            if (var3 != null) {
               var3 = null;
               break;
            }

            var3 = var5;
         }
      }

      if (var3 != null) {
         return var2.class_(kE_2.p, var3.case_());
      } else {
         rpr_3 var8 = var2.byte_(kE_2.p);
         rfH_2 var9 = var1.break_(var8);
         if (var0.byte_(var9).implements_(var0, var9)) {
            var8 = var8.case_();
            var9 = var1.break_(var8);
         }

         if (var0.byte_(var9).implements_(var0, var9)) {
            var8 = var8.catch_();
            var9 = var1.break_(var8);
         }

         if (var0.byte_(var9).implements_(var0, var9)) {
            var8 = var8.case_();
            var1.break_(var8);
         }

         return var2.class_(kE_2.p, var8);
      }
   }

   protected boolean class_(rRq_1 var1, rfi_3 var2) {
      int var3 = Math.max(this.final_.class_ - 1, var2.class_);
      int var4 = Math.max(this.final_.break_ - 1, var2.break_);
      int var5 = Math.max(this.final_.byte_ - 1, var2.byte_);
      int var6 = Math.min(this.final_.protected_ + 1, var2.protected_);
      int var7 = Math.min(this.final_.throws_ + 1, var2.throws_);
      int var8 = Math.min(this.final_.case_ + 1, var2.case_);
      rfw_3 var9 = new rfw_3();

      for (int var10 = var3; var10 <= var6; var10++) {
         for (int var11 = var5; var11 <= var8; var11++) {
            if (var1.byte_(var9.class_(var10, var4, var11)).byte_().class_()) {
               return true;
            }

            if (var1.byte_(var9.class_(var10, var7, var11)).byte_().class_()) {
               return true;
            }
         }
      }

      for (int var12 = var3; var12 <= var6; var12++) {
         for (int var14 = var4; var14 <= var7; var14++) {
            if (var1.byte_(var9.class_(var12, var14, var5)).byte_().class_()) {
               return true;
            }

            if (var1.byte_(var9.class_(var12, var14, var8)).byte_().class_()) {
               return true;
            }
         }
      }

      for (int var13 = var5; var13 <= var8; var13++) {
         for (int var15 = var4; var15 <= var7; var15++) {
            if (var1.byte_(var9.class_(var3, var15, var13)).byte_().class_()) {
               return true;
            }

            if (var1.byte_(var9.class_(var6, var15, var13)).byte_().class_()) {
               return true;
            }
         }
      }

      return false;
   }

   public static rrrn_1 class_(List<rrrn_1> var0, rfi_3 var1) {
      for (rrrn_1 var3 : var0) {
         if (var3.catch_() != null && var3.catch_().class_(var1)) {
            return var3;
         }
      }

      return null;
   }

   public boolean class_(rfj_3 var1, int var2) {
      int var3 = var1.break_ << 4;
      int var4 = var1.byte_ << 4;
      return this.final_.class_(var3 - var2, var4 - var2, var3 + 15 + var2, var4 + 15 + var2);
   }

   public abstract boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7);

   public void class_(rrrn_1 var1, List<rrrn_1> var2, Random var3) {
   }

   protected abstract void class_(rcd_3 var1);

   protected xc_3 class_(rRq_1 var1, int var2, int var3, int var4, rfi_3 var5) {
      int var6 = this.class_(var2, var4);
      int var7 = this.class_(var3);
      int var8 = this.break_(var2, var4);
      rfH_2 var9 = new rfH_2(var6, var7, var8);
      return !var5.break_(var9) ? xu_3.class_.continue_() : var1.byte_(var9);
   }

   protected void class_(rRI var1, xc_3 var2, int var3, int var4, int var5, rfi_3 var6) {
      rfH_2 var7 = new rfH_2(this.class_(var3, var5), this.class_(var4), this.break_(var3, var5));
      if (var6.break_(var7)) {
         if (this.break_ != rpa_3.NONE) {
            var2 = var2.class_(this.break_);
         }

         if (this.byte_ != rqd_3.NONE) {
            var2 = var2.class_(this.byte_);
         }

         var1.class_(var7, var2, 2);
         rXE var8 = var1.break_(var7);
         if (!var8.byte_()) {
            var1.extends_().class_(var7, var8.class_(), 0);
         }

         if (throws_.contains(var2.break_())) {
            var1.volatile_(var7).extends_(var7);
         }
      }
   }

   protected int class_(int var1) {
      return this.implements_() == null ? var1 : var1 + this.final_.break_;
   }

   protected int class_(int var1, int var2) {
      rpr_3 var3 = this.implements_();
      if (var3 == null) {
         return var1;
      } else {
         switch (var3) {
            case NORTH:
            case SOUTH:
               return this.final_.class_ + var1;
            case WEST:
               return this.final_.protected_ - var2;
            case EAST:
               return this.final_.class_ + var2;
            default:
               return var1;
         }
      }
   }

   protected void break_(rRI var1, rfi_3 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var9 = var4; var9 <= var7; var9++) {
         for (int var10 = var3; var10 <= var6; var10++) {
            for (int var11 = var5; var11 <= var8; var11++) {
               this.class_(var1, xu_3.class_.continue_(), var10, var9, var11, var2);
            }
         }
      }
   }

   protected void break_(rRI var1, xc_3 var2, int var3, int var4, int var5, rfi_3 var6) {
      int var7 = this.class_(var3, var5);
      int var8 = this.class_(var4);
      int var9 = this.break_(var3, var5);
      if (var6.break_(new rfH_2(var7, var8, var9))) {
         while ((var1.finally_(new rfH_2(var7, var8, var9)) || var1.byte_(new rfH_2(var7, var8, var9)).byte_().class_()) && var8 > 1) {
            var1.class_(new rfH_2(var7, var8, var9), var2, 2);
            var8--;
         }
      }
   }

   protected int break_(int var1, int var2) {
      rpr_3 var3 = this.implements_();
      if (var3 == null) {
         return var2;
      } else {
         switch (var3) {
            case NORTH:
               return this.final_.case_ - var2;
            case SOUTH:
               return this.final_.byte_ + var2;
            case WEST:
            case EAST:
               return this.final_.byte_ + var1;
            default:
               return var2;
         }
      }
   }

   public raF_2 finally_() {
      return this.protected_;
   }

   public rfi_3 catch_() {
      return this.final_;
   }

   public final rcd_3 case_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("id", rVL.I.break_(this.finally_()).toString());
      var1.class_("BB", this.final_.private_());
      rpr_3 var2 = this.implements_();
      var1.break_("O", var2 == null ? -1 : var2.protected_());
      var1.break_("GD", this.package_);
      this.class_(var1);
      return var1;
   }

   public rpr_3 implements_() {
      return this.class_;
   }

   public int private_() {
      return this.package_;
   }
}
