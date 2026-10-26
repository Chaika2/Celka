package celestial;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rni_3 {
   private static final Logger byte_ = LogManager.getLogger();
   public rrEm_1 class_;
   public rhN_2 break_;
   private rRl_1 protected_ = rRl_1.NOT_SET;
   private rRl_1 throws_ = rRl_1.NOT_SET;
   private boolean case_;
   private int catch_;
   private rfH_2 private_ = rfH_2.protected_;
   private int implements_;
   private boolean finally_;
   private rfH_2 extends_ = rfH_2.protected_;
   private int native_;
   private int volatile_ = -1;

   public rRl_1 byte_() {
      return this.throws_;
   }

   public rni_3(rrEm_1 var1) {
      this.class_ = var1;
   }

   public boolean class_(rfH_2 var1) {
      xc_3 var2 = this.class_.byte_(var1);
      if (!this.break_.ss().break_().class_(var2, this.class_, var1, this.break_)) {
         return false;
      } else {
         ryO_2 var3 = this.class_.class_(var1);
         xd_3 var4 = var2.break_();
         if ((var4 instanceof xK_2 || var4 instanceof zx_3 || var4 instanceof kW_2) && !this.break_.sU()) {
            this.class_.class_(var1, var2, var2, 3);
            return false;
         } else if (this.break_.class_(this.class_, var1, this.protected_)) {
            return false;
         } else {
            var4.class_(this.class_, var1, var2, this.break_);
            boolean var5 = this.class_.class_(var1, false);
            if (var5) {
               var4.class_((rRg_1)this.class_, var1, var2);
            }

            if (this.throws_()) {
               return true;
            } else {
               rdn_3 var6 = this.break_.ss();
               rdn_3 var7 = var6.implements_();
               boolean var8 = this.break_.byte_(var2);
               var6.class_(this.class_, var2, var1, this.break_);
               if (var5 && var8) {
                  var4.class_(this.class_, this.break_, var1, var2, var3, var7);
               }

               return true;
            }
         }
      }
   }

   public void class_(rfH_2 var1, rZM var2, String var3) {
      if (this.class_(var1)) {
         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, true, var3));
      } else {
         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, false, var3));
      }
   }

   public void class_() {
      this.implements_++;
      if (this.finally_) {
         xc_3 var1 = this.class_.byte_(this.extends_);
         if (var1.catch_()) {
            this.finally_ = false;
         } else {
            float var2 = this.class_(var1, this.extends_, this.native_);
            if (var2 >= 1.0F) {
               this.finally_ = false;
               this.class_(this.extends_);
            }
         }
      } else if (this.case_) {
         xc_3 var3 = this.class_.byte_(this.private_);
         if (var3.catch_()) {
            this.class_.class_(this.break_.V(), this.private_, -1);
            this.volatile_ = -1;
            this.case_ = false;
         } else {
            this.class_(var3, this.private_, this.catch_);
         }
      }
   }

   private float class_(xc_3 var1, rfH_2 var2, int var3) {
      int var4 = this.implements_ - var3;
      float var5 = var1.class_(this.break_, (rYB)this.break_.throws_[7], var2) * (float)(var4 + 1);
      int var6 = (int)(var5 * 10.0F);
      if (var6 != this.volatile_) {
         this.class_.class_(this.break_.V(), var2, var6);
         this.volatile_ = var6;
      }

      return var5;
   }

   public ryZ_2 class_(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4) {
      if (this.protected_ == rRl_1.SPECTATOR) {
         return ryZ_2.PASS;
      } else if (var1.sK().class_(var3.break_())) {
         return ryZ_2.PASS;
      } else {
         int var5 = var3.char_();
         int var6 = var3.catch_();
         rym_3 var7 = var3.class_(var2, var1, var4);
         rdn_3 var8 = (rdn_3)var7.break_();
         if (var8 == var3 && var8.char_() == var5 && var8.extends_() <= 0 && var8.catch_() == var6) {
            return var7.class_();
         } else if (var7.class_() == ryZ_2.FAIL && var8.extends_() > 0 && !var1.return_()) {
            return var7.class_();
         } else {
            var1.class_(var4, var8);
            if (this.throws_()) {
               var8.throws_(var5);
               if (var8.throws_() && var8.catch_() != var6) {
                  var8.break_(var6);
               }
            }

            if (var8.class_()) {
               var1.class_(var4, rdn_3.break_);
            }

            if (!var1.return_()) {
               var1.class_((rJT)var1.implements_[3]);
            }

            return var7.class_();
         }
      }
   }

   public ryZ_2 class_(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4, rff_3 var5) {
      rfH_2 var6 = var5.class_();
      xc_3 var7 = var2.byte_(var6);
      if (this.protected_ == rRl_1.SPECTATOR) {
         rJZ var14 = var7.break_(var2, var6);
         if (var14 != null) {
            var1.class_(var14);
            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.PASS;
         }
      } else {
         boolean var8 = !var1.ss().class_() || !var1.Sn().class_();
         boolean var9 = var1.sN() && var8;
         rdn_3 var10 = var3.implements_();
         if (!var9) {
            ryZ_2 var11 = var7.class_(var2, var1, var4, var5);
            if (var11.class_()) {
               Oo_1.default_.class_(var1, var6, var10);
               return var11;
            }
         }

         if (!var3.class_() && !var1.sK().class_(var3.break_())) {
            rdH_2 var15 = new rdH_2(var1, var4, var5);
            ryZ_2 var12;
            if (this.throws_()) {
               int var13 = var3.char_();
               var12 = var3.class_(var15);
               var3.throws_(var13);
            } else {
               var12 = var3.class_(var15);
            }

            if (var12.class_()) {
               Oo_1.default_.class_(var1, var6, var10);
            }

            return var12;
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   public void class_(rrEm_1 var1) {
      this.class_ = var1;
   }

   public void class_(rRl_1 var1, rRl_1 var2) {
      this.throws_ = var2;
      this.protected_ = var1;
      var1.class_((rhx_3)this.break_.implements_[18]);
      this.break_.G();
      this.break_.break_.x().class_(new rvg_3(rvY_2.UPDATE_GAME_MODE, this.break_));
      this.class_.private_();
   }

   public void class_(rfH_2 var1, rZM var2, rpr_3 var3, int var4) {
      double var5 = this.break_.rx() - ((double)var1.b_() + 0.5);
      double var7 = this.break_.re() - ((double)var1.c_() + 0.5) + 1.5;
      double var9 = this.break_.BO() - ((double)var1.d_() + 0.5);
      double var11 = var5 * var5 + var7 * var7 + var9 * var9;
      if (var11 > 36.0) {
         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, false, "too far"));
      } else if (var1.c_() >= var4) {
         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, false, "too high"));
      } else if (var2 == rZM.START_DESTROY_BLOCK) {
         if (!this.class_.class_(this.break_, var1)) {
            this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, false, "may not interact"));
            return;
         }

         if (this.throws_()) {
            this.class_(var1, var2, "creative destroy");
            return;
         }

         if (this.break_.class_(this.class_, var1, this.protected_)) {
            this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, false, "block action restricted"));
            return;
         }

         this.catch_ = this.implements_;
         float var13 = 1.0F;
         xc_3 var14 = this.class_.byte_(var1);
         if (!var14.catch_()) {
            var14.class_(this.class_, var1, this.break_);
            var13 = var14.class_(this.break_, (rYB)this.break_.throws_[7], var1);
         }

         if (!var14.catch_() && var13 >= 1.0F) {
            this.class_(var1, var2, "insta mine");
         } else {
            if (this.case_) {
               this.break_
                  .class_
                  .class_(
                     new rvj_3(
                        this.private_,
                        this.class_.byte_(this.private_),
                        rZM.START_DESTROY_BLOCK,
                        false,
                        "abort destroying since another started (client insta mine, server disagreed)"
                     )
                  );
            }

            this.case_ = true;
            this.private_ = var1.int_();
            int var15 = (int)(var13 * 10.0F);
            this.class_.class_(this.break_.V(), var1, var15);
            this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, true, "actual start of destroying"));
            this.volatile_ = var15;
         }
      } else if (var2 == rZM.STOP_DESTROY_BLOCK) {
         if (var1.equals(this.private_)) {
            int var16 = this.implements_ - this.catch_;
            xc_3 var17 = this.class_.byte_(var1);
            if (!var17.catch_()) {
               float var18 = var17.class_(this.break_, (rYB)this.break_.throws_[7], var1) * (float)(var16 + 1);
               if (var18 >= 0.7F) {
                  this.case_ = false;
                  this.class_.class_(this.break_.V(), var1, -1);
                  this.class_(var1, var2, "destroyed");
                  return;
               }

               if (!this.finally_) {
                  this.case_ = false;
                  this.finally_ = true;
                  this.extends_ = var1;
                  this.native_ = this.catch_;
               }
            }
         }

         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, true, "stopped destroying"));
      } else if (var2 == rZM.ABORT_DESTROY_BLOCK) {
         this.case_ = false;
         if (!Objects.equals(this.private_, var1)) {
            byte_.warn("Mismatch in destroy block pos: " + this.private_ + " " + var1);
            this.class_.class_(this.break_.V(), this.private_, -1);
            this.break_.class_.class_(new rvj_3(this.private_, this.class_.byte_(this.private_), var2, true, "aborted mismatched destroying"));
         }

         this.class_.class_(this.break_.V(), var1, -1);
         this.break_.class_.class_(new rvj_3(var1, this.class_.byte_(var1), var2, true, "aborted destroying"));
      }
   }

   public void class_(rRl_1 var1) {
      this.class_(var1, var1 != this.protected_ ? this.protected_ : this.throws_);
   }

   public rRl_1 break_() {
      return this.protected_;
   }

   public void break_(rRl_1 var1) {
      if (this.protected_ == rRl_1.NOT_SET) {
         this.protected_ = var1;
      }

      this.class_(this.protected_);
   }

   public boolean throws_() {
      return this.protected_.throws_();
   }

   public boolean protected_() {
      return this.protected_.case_();
   }
}
