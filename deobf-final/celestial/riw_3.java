package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class riw_3 extends rrrw_1 {
   private static final Logger protected_ = LogManager.getLogger();
   private final rqO_2 throws_;
   private final rqd_3 case_;
   private final rpa_3 catch_;
   private final riI_2 private_;
   private final rif_3 implements_;

   private void byte_(Random var1, rRg_1 var2, rfH_2 var3) {
      rfw_3 var4 = var3.new_();
      this.protected_(var1, var2, var4);
      int var5 = 8;

      while (var5 > 0 && var1.nextFloat() < 0.5F) {
         var4.class_(rpr_3.DOWN);
         var5--;
         this.protected_(var1, var2, var4);
      }
   }

   public riw_3(rfH_2 var1, riI_2 var2, rif_3 var3, rqO_2 var4, rrPl_1 var5, rqd_3 var6, rpa_3 var7, rfH_2 var8) {
      super(raF_2.static_, 0);
      this.byte_ = var1;
      this.throws_ = var4;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var2;
      this.implements_ = var3;
      this.class_(var5, var8);
   }

   public riw_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.static_, var2);
      this.throws_ = new rqO_2(var2.native_("Template"));
      this.case_ = rqd_3.valueOf(var2.native_("Rotation"));
      this.catch_ = rpa_3.valueOf(var2.native_("Mirror"));
      this.private_ = riI_2.class_(var2.native_("VerticalPlacement"));
      this.implements_ = (rif_3)rif_3.class_.parse(new Dynamic(rcf_3.class_, var2.byte_("Properties"))).getOrThrow(true, protected_::error);
      rrPl_1 var3 = var1.class_(this.throws_);
      this.class_(var3, new rfH_2(var3.class_().b_() / 2, 0, var3.class_().d_() / 2));
   }

   public static rKv_1 class_(riI_2 var0) {
      return var0 == riI_2.ON_OCEAN_FLOOR ? rKv_1.OCEAN_FLOOR_WG : rKv_1.WORLD_SURFACE_WG;
   }

   private static int class_(rRg_1 var0, int var1, int var2, riI_2 var3) {
      return var0.class_(class_(var3), var1, var2) - 1;
   }

   private boolean class_(rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var1.byte_(var2);
      return !var3.class_(xu_3.class_)
         && !var3.class_(xu_3.rg)
         && !var3.class_(xu_3.re)
         && (this.private_ == riI_2.IN_NETHER || !var3.class_(xu_3.instanceof_));
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Template", this.throws_.toString());
      var1.class_("Rotation", this.case_.name());
      var1.class_("Mirror", this.catch_.name());
      var1.class_("VerticalPlacement", this.private_.class_());
      rif_3.class_.encodeStart(rcf_3.class_, this.implements_).resultOrPartial(protected_::error).ifPresent(var1x -> var1.class_("Properties", var1x));
   }

   private static rrPv_1 class_(xd_3 var0, xd_3 var1) {
      return new rrPv_1(new rrPb_1(var0), rrPB.break_, var1.continue_());
   }

   private static rrPv_1 class_(xd_3 var0, float var1, xd_3 var2) {
      return new rrPv_1(new rrPm_1(var0, var1), rrPB.break_, var2.continue_());
   }

   private void class_(Random var1, rRg_1 var2, rfH_2 var3) {
      xc_3 var4 = var2.byte_(var3);
      if (!var4.catch_() && !var4.class_(xu_3.BD)) {
         rpr_3 var5 = rpb_3.HORIZONTAL.class_(var1);
         rfH_2 var6 = var3.break_(var5);
         xc_3 var7 = var2.byte_(var6);
         if (var7.catch_() && xd_3.class_(var4.extends_(var2, var3), var5)) {
            rCN var8 = zq_3.class_(var5.case_());
            var2.class_(var6, xu_3.BD.continue_().class_(var8, Boolean.valueOf(true)), 3);
         }
      }
   }

   @Override
   protected void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (!var5.break_(this.byte_)) {
         return true;
      } else {
         var5.break_(this.class_.break_(this.break_, this.byte_));
         boolean var8 = super.class_(var1, var2, var3, var4, var5, var6, var7);
         this.break_(var4, var1);
         this.class_(var4, var1);
         if (this.implements_.case_ || this.implements_.throws_) {
            rfH_2.class_(this.catch_()).forEach(var3x -> {
               if (this.implements_.case_) {
                  this.class_(var4, (rRg_1)var1, var3x);
               }

               if (this.implements_.throws_) {
                  this.break_(var4, var1, var3x);
               }
            });
         }

         return var8;
      }
   }

   private void class_(rrPl_1 var1, rfH_2 var2) {
      rrPG var3 = this.implements_.protected_ ? rrPG.break_ : rrPG.protected_;
      ArrayList var4 = Lists.newArrayList();
      var4.add(class_(xu_3.rt, 0.3F, xu_3.class_));
      var4.add(this.break_());
      if (!this.implements_.break_) {
         var4.add(class_(xu_3.PR, 0.07F, xu_3.bV));
      }

      rrPN var5 = new rrPN()
         .class_(this.case_)
         .class_(this.catch_)
         .class_(var2)
         .class_(var3)
         .class_(new rrPF(var4))
         .class_(new rrPM(this.implements_.byte_))
         .class_(new rrPW());
      if (this.implements_.catch_) {
         var5.class_(rrPE.break_);
      }

      this.class_(var1, this.byte_, var5);
   }

   private void class_(Random var1, rRg_1 var2) {
      for (int var3 = this.final_.class_ + 1; var3 < this.final_.protected_; var3++) {
         for (int var4 = this.final_.byte_ + 1; var4 < this.final_.case_; var4++) {
            rfH_2 var5 = new rfH_2(var3, this.final_.break_, var4);
            if (var2.byte_(var5).class_(xu_3.PR)) {
               this.byte_(var1, var2, var5.break_());
            }
         }
      }
   }

   private void break_(Random var1, rRg_1 var2) {
      boolean var3 = this.private_ == riI_2.ON_LAND_SURFACE || this.private_ == riI_2.ON_OCEAN_FLOOR;
      rja_3 var4 = this.final_.catch_();
      int var5 = var4.b_();
      int var6 = var4.d_();
      float[] var7 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int var8 = var7.length;
      int var9 = (this.final_.protected_() + this.final_.case_()) / 2;
      int var10 = var1.nextInt(Math.max(1, 8 - var9 / 2));
      byte var11 = 3;
      rfw_3 var12 = rfH_2.protected_.new_();

      for (int var13 = var5 - var8; var13 <= var5 + var8; var13++) {
         for (int var14 = var6 - var8; var14 <= var6 + var8; var14++) {
            int var15 = Math.abs(var13 - var5) + Math.abs(var14 - var6);
            int var16 = Math.max(0, var15 + var10);
            if (var16 < var8) {
               float var17 = var7[var16];
               if (var1.nextDouble() < (double)var17) {
                  int var18 = class_(var2, var13, var14, this.private_);
                  int var19 = var3 ? var18 : Math.min(this.final_.break_, var18);
                  var12.class_(var13, var19, var14);
                  if (Math.abs(var19 - this.final_.break_) <= 3 && this.class_(var2, var12)) {
                     this.protected_(var1, var2, var12);
                     if (this.implements_.throws_) {
                        this.break_(var1, var2, var12);
                     }

                     this.byte_(var1, var2, var12.break_());
                  }
               }
            }
         }
      }
   }

   private rrPv_1 break_() {
      if (this.private_ == riI_2.ON_OCEAN_FLOOR) {
         return class_(xu_3.instanceof_, xu_3.bV);
      } else {
         return this.implements_.break_ ? class_(xu_3.instanceof_, xu_3.PR) : class_(xu_3.instanceof_, 0.2F, xu_3.bV);
      }
   }

   private void break_(Random var1, rRg_1 var2, rfH_2 var3) {
      if (var1.nextFloat() < 0.5F && var2.byte_(var3).class_(xu_3.PR) && var2.byte_(var3.final_()).catch_()) {
         var2.class_(var3.final_(), xu_3.W.continue_().class_(kZ_2.final_, Boolean.valueOf(true)), 3);
      }
   }

   private void protected_(Random var1, rRg_1 var2, rfH_2 var3) {
      if (!this.implements_.break_ && var1.nextFloat() < 0.07F) {
         var2.class_(var3, xu_3.bV.continue_(), 3);
      } else {
         var2.class_(var3, xu_3.PR.continue_(), 3);
      }
   }
}
