package celestial;

import java.util.Random;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rsG_2 extends rsS_2 {
   private static final Logger catch_ = LogManager.getLogger();
   private static final rut_3<rdn_3> private_ = rmE_2.class_(rsG_2.class, ruw_3.catch_);
   private static final rut_3<Integer> implements_ = rmE_2.class_(rsG_2.class, ruw_3.break_);
   private float finally_ = 1.0F;
   private boolean extends_;

   private void byte_(rdn_3 var1) {
      if (var1.break_() == rdy_3.JX) {
         rrGb_1 var2 = rxI_2.break_(var1, (rYB)this.throws_[7]);
         var2.class_(this.break_, this.V());
         var2.class_(true);
      }

      var1.class_((an_3)null);
   }

   public int int_() {
      return this.final_().class_() ? 0 : this.package_() % 8 + 1;
   }

   public rsG_2(aI_2<? extends rsG_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsG_2(rYB var1, rfH_2 var2, rpr_3 var3) {
      super(aI_2.default_, var1, var2);
      this.class_(var3);
   }

   @Override
   public float f() {
      return 0.0F;
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      boolean var4 = !this.final_().class_();
      boolean var5 = !var3.class_();
      if (this.extends_) {
         return ryZ_2.PASS;
      } else if (!((rYB)this.throws_[7]).continue_) {
         if (!var4) {
            if (var5 && !(Boolean)this.throws_[27]) {
               this.break_(var3);
               if (!((rhx_3)var1.implements_[18]).protected_) {
                  var3.catch_(1);
               }
            }
         } else {
            this.class_(rqn_3.EV, 1.0F, 1.0F);
            this.class_(this.package_() + 1);
         }

         return ryZ_2.CONSUME;
      } else {
         return !var4 && !var5 ? ryZ_2.PASS : ryZ_2.SUCCESS;
      }
   }

   @Override
   public boolean class_(double var1) {
      double var3 = 16.0;
      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void class_(rdn_3 var1, boolean var2) {
      if (!var1.class_()) {
         var1 = var1.implements_();
         var1.throws_(1);
         var1.class_(this);
      }

      this.BQ().break_(private_, var1);
      if (!var1.class_()) {
         this.class_(rqn_3.Ew, 1.0F, 1.0F);
      }

      if (var2 && this.break_ != null) {
         ((rYB)this.throws_[7]).byte_(this.break_, xu_3.class_);
      }
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      if (var1 == 0) {
         this.break_(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void class_(an_3 var1) {
      this.class_(rqn_3.EI, 1.0F, 1.0F);
      this.break_(var1, true);
   }

   @Override
   protected void class_(rpr_3 var1) {
      Validate.notNull(var1);
      this.protected_ = var1;
      if (var1.final_().protected_()) {
         Float var6 = 0.0F;
         this.throws_[16] = var6;
         Float var7 = (float)(this.protected_.protected_() * 90);
         this.throws_[15] = var7;
      } else {
         Float var8 = (float)(-90 * var1.throws_().class_());
         this.throws_[16] = var8;
         Float var9 = 0.0F;
         this.throws_[15] = var9;
      }

      Float var10 = (Float)this.throws_[16];
      this.throws_[18] = var10;
      Float var11 = (Float)this.throws_[15];
      this.throws_[17] = var11;
      this.protected_();
   }

   @Override
   protected float class_(iM_2 var1, ap_3 var2) {
      return 0.0F;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.final_().class_()) {
         var1.class_("Item", this.final_().break_(new rcd_3()));
         var1.class_("ItemRotation", (byte)this.package_());
         var1.class_("ItemDropChance", this.finally_);
      }

      var1.class_("Facing", (byte)this.protected_.byte_());
      var1.class_("Invisible", this.Pp());
      var1.class_("Fixed", this.extends_);
   }

   private void class_(int var1, boolean var2) {
      this.BQ().break_(implements_, var1 % 8);
      if (var2 && this.break_ != null) {
         ((rYB)this.throws_[7]).byte_(this.break_, xu_3.class_);
      }
   }

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      if (!this.extends_) {
         super.class_(var1, var2);
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (var1.equals(private_)) {
         rdn_3 var2 = this.final_();
         if (!var2.class_() && var2.while_() != this) {
            var2.class_(this);
         }
      }
   }

   public void class_(int var1) {
      this.class_(var1, true);
   }

   @Override
   public void j() {
      this.byte_(this.final_());
      super.j();
   }

   public void break_(rdn_3 var1) {
      this.class_(var1, true);
   }

   private void break_(an_3 var1, boolean var2) {
      if (!this.extends_) {
         rdn_3 var3 = this.final_();
         this.break_(rdn_3.break_);
         if (!((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
            if (var1 == null) {
               this.byte_(var3);
            }
         } else {
            if (var1 instanceof rhd_3 var4 && ((rhx_3)var4.implements_[18]).protected_) {
               this.byte_(var3);
               return;
            }

            if (var2) {
               this.class_(rdy_3.dB);
            }

            if (!var3.class_()) {
               var3 = var3.implements_();
               this.byte_(var3);
               if (((Random)this.throws_[40]).nextFloat() < this.finally_) {
                  this.a_(var3);
               }
            }
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (!this.extends_) {
         if (this.class_(var1)) {
            return false;
         } else if (!var1.protected_() && !this.final_().class_()) {
            if (!((rYB)this.throws_[7]).continue_) {
               this.break_(var1.extends_(), false);
               this.class_(rqn_3.Ej, 1.0F, 1.0F);
            }

            return true;
         } else {
            return super.break_(var1, var2);
         }
      } else {
         return var1 != rye_3.volatile_ && !var1.synchronized_() ? false : super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      rcd_3 var2 = var1.int_("Item");
      if (var2 != null && !var2.case_()) {
         rdn_3 var3 = rdn_3.class_(var2);
         if (var3.class_()) {
            catch_.warn("Unable to load item from: {}", var2);
         }

         rdn_3 var4 = this.final_();
         if (!var4.class_() && !rdn_3.break_(var3, var4)) {
            this.byte_(var4);
         }

         this.class_(var3, false);
         this.class_(var1.case_("ItemRotation"), false);
         if (var1.byte_("ItemDropChance", 99)) {
            this.finally_ = var1.finally_("ItemDropChance");
         }
      }

      this.class_(rpr_3.class_(var1.case_("Facing")));
      this.package_(var1.new_("Invisible"));
      this.extends_ = var1.new_("Fixed");
   }

   @Override
   public boolean throws_() {
      if (this.extends_) {
         return true;
      } else if (!((rYB)this.throws_[7]).throws_(this)) {
         return false;
      } else {
         xc_3 var1 = ((rYB)this.throws_[7]).byte_(this.break_.break_(this.protected_.case_()));
         return !var1.byte_().break_() && (!this.protected_.final_().protected_() || !Wk_1.volatile_(var1))
            ? false
            : ((rYB)this.throws_[7]).break_(this, this.rN(), class_).isEmpty();
      }
   }

   @Override
   public int catch_() {
      return 12;
   }

   @Override
   public int case_() {
      return 12;
   }

   @Override
   public void implements_(double var1, double var3, double var5) {
      if (!this.extends_) {
         super.implements_(var1, var3, var5);
      }
   }

   public int package_() {
      return this.BQ().class_(implements_);
   }

   @Override
   protected void protected_() {
      if (this.protected_ != null) {
         double var1 = 0.46875;
         double var3 = (double)this.break_.b_() + 0.5 - (double)this.protected_.implements_() * 0.46875;
         double var5 = (double)this.break_.c_() + 0.5 - (double)this.protected_.finally_() * 0.46875;
         double var7 = (double)this.break_.d_() + 0.5 - (double)this.protected_.extends_() * 0.46875;
         this.volatile_(var3, var5, var7);
         double var9 = (double)this.case_();
         double var11 = (double)this.catch_();
         double var13 = (double)this.case_();
         rpB_2 var15 = this.protected_.final_();
         switch (var15) {
            case X:
               var9 = 1.0;
               break;
            case Y:
               var11 = 1.0;
               break;
            case Z:
               var13 = 1.0;
         }

         var9 /= 32.0;
         var11 /= 32.0;
         var13 /= 32.0;
         this.class_(new rfl_3(var3 - var9, var5 - var11, var7 - var13, var3 + var9, var5 + var11, var7 + var13));
      }
   }

   @Override
   public void private_() {
      this.class_(rqn_3.Ef, 1.0F, 1.0F);
   }

   public rdn_3 final_() {
      return this.BQ().class_(private_);
   }

   @Override
   protected void m_() {
      this.BQ().class_(private_, rdn_3.break_);
      this.BQ().class_(implements_, 0);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, this.BC(), this.protected_.byte_(), this.implements_());
   }
}
