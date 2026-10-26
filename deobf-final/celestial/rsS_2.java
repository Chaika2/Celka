package celestial;

import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class rsS_2 extends an_3 {
   protected static final Predicate<an_3> class_ = var0 -> var0 instanceof rsS_2;
   private int catch_;
   protected rfH_2 break_;
   protected rpr_3 protected_ = rpr_3.SOUTH;

   protected rsS_2(aI_2<? extends rsS_2> var1, rYB var2) {
      super(var1, var2);
   }

   protected rsS_2(aI_2<? extends rsS_2> var1, rYB var2, rfH_2 var3) {
      this(var1, var2);
      this.break_ = var3;
   }

   @Override
   public void this_() {
      if (!((rYB)this.throws_[7]).continue_) {
         if (this.re() < -64.0) {
            this.PQ();
         }

         if (this.catch_++ == 100) {
            this.catch_ = 0;
            if (!(Boolean)this.throws_[27] && !this.throws_()) {
               this.PD();
               this.class_((an_3)null);
            }
         }
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      rfH_2 var2 = this.implements_();
      var1.break_("TileX", var2.b_());
      var1.break_("TileY", var2.c_());
      var1.break_("TileZ", var2.d_());
   }

   @Override
   public rsE_2 class_(rdn_3 var1, float var2) {
      rsE_2 var3 = new rsE_2(
         (rYB)this.throws_[7],
         this.rx() + (double)((float)this.protected_.implements_() * 0.15F),
         this.re() + (double)var2,
         this.BO() + (double)((float)this.protected_.extends_() * 0.15F),
         var1
      );
      var3.private_();
      ((rYB)this.throws_[7]).a_(var3);
      return var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float class_(rqd_3 var1) {
      if (this.protected_.final_() != rpB_2.Y) {
         switch (var1) {
            case CLOCKWISE_180:
               this.protected_ = this.protected_.case_();
               break;
            case COUNTERCLOCKWISE_90:
               this.protected_ = this.protected_.private_();
               break;
            case CLOCKWISE_90:
               this.protected_ = this.protected_.catch_();
         }
      }

      float var2 = rfU_2.catch_((Float)this.throws_[15]);
      switch (var1) {
         case CLOCKWISE_180:
            return var2 + 180.0F;
         case COUNTERCLOCKWISE_90:
            return var2 + 90.0F;
         case CLOCKWISE_90:
            return var2 + 270.0F;
         default:
            return var2;
      }
   }

   public abstract void class_(an_3 var1);

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      if (!((rYB)this.throws_[7]).continue_ && !(Boolean)this.throws_[27] && var2.catch_() > 0.0) {
         this.PD();
         this.class_((an_3)null);
      }
   }

   protected void class_(rpr_3 var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.final_().protected_());
      this.protected_ = var1;
      Float var6 = (float)(this.protected_.protected_() * 90);
      this.throws_[15] = var6;
      Float var7 = (Float)this.throws_[15];
      this.throws_[17] = var7;
      this.protected_();
   }

   private double class_(int var1) {
      return var1 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
   }

   @Override
   public float class_(rpa_3 var1) {
      return this.class_(var1.class_(this.protected_));
   }

   @Override
   public void break_(rcd_3 var1) {
      this.break_ = new rfH_2(var1.private_("TileX"), var1.private_("TileY"), var1.private_("TileZ"));
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         if (!(Boolean)this.throws_[27] && !((rYB)this.throws_[7]).continue_) {
            this.PD();
            this.rf();
            this.class_(var1.extends_());
         }

         return true;
      }
   }

   public boolean throws_() {
      if (!((rYB)this.throws_[7]).throws_(this)) {
         return false;
      } else {
         int var1 = Math.max(1, this.case_() / 16);
         int var2 = Math.max(1, this.catch_() / 16);
         rfH_2 var3 = this.break_.break_(this.protected_.case_());
         rpr_3 var4 = this.protected_.private_();
         rfw_3 var5 = new rfw_3();

         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 0; var7 < var2; var7++) {
               int var8 = (var1 - 1) / -2;
               int var9 = (var2 - 1) / -2;
               var5.class_(var3).byte_(var4, var6 + var8).byte_(rpr_3.UP, var7 + var9);
               xc_3 var10 = ((rYB)this.throws_[7]).byte_(var5);
               if (!var10.byte_().break_() && !Wk_1.volatile_(var10)) {
                  return false;
               }
            }
         }

         return ((rYB)this.throws_[7]).break_(this, this.rN(), class_).isEmpty();
      }
   }

   @Override
   public boolean finally_(an_3 var1) {
      if (var1 instanceof rhd_3 var2) {
         return !((rYB)this.throws_[7]).class_(var2, this.break_) ? true : this.break_(rye_3.class_(var2), 0.0F);
      } else {
         return false;
      }
   }

   public abstract int catch_();

   public abstract int case_();

   @Override
   public void implements_(double var1, double var3, double var5) {
      if (!((rYB)this.throws_[7]).continue_ && !(Boolean)this.throws_[27] && var1 * var1 + var3 * var3 + var5 * var5 > 0.0) {
         this.PD();
         this.class_((an_3)null);
      }
   }

   public rfH_2 implements_() {
      return this.break_;
   }

   @Override
   public void new_(double var1, double var3, double var5) {
      this.break_ = new rfH_2(var1, var3, var5);
      this.protected_();
      Boolean var11 = true;
      this.throws_[57] = var11;
   }

   protected void protected_() {
      if (this.protected_ != null) {
         double var1 = (double)this.break_.b_() + 0.5;
         double var3 = (double)this.break_.c_() + 0.5;
         double var5 = (double)this.break_.d_() + 0.5;
         double var7 = 0.46875;
         double var9 = this.class_(this.case_());
         double var11 = this.class_(this.catch_());
         var1 -= (double)this.protected_.implements_() * 0.46875;
         var5 -= (double)this.protected_.extends_() * 0.46875;
         var3 += var11;
         rpr_3 var13 = this.protected_.private_();
         var1 += var9 * (double)var13.implements_();
         var5 += var9 * (double)var13.extends_();
         this.volatile_(var1, var3, var5);
         double var14 = (double)this.case_();
         double var16 = (double)this.catch_();
         double var18 = (double)this.case_();
         if (this.protected_.final_() == rpB_2.Z) {
            var18 = 1.0;
         } else {
            var14 = 1.0;
         }

         var14 /= 32.0;
         var16 /= 32.0;
         var18 /= 32.0;
         this.class_(new rfl_3(var1 - var14, var3 - var16, var5 - var18, var1 + var14, var3 + var16, var5 + var18));
      }
   }

   public abstract void private_();

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected boolean BZ() {
      return false;
   }

   @Override
   public rpr_3 Pg() {
      return this.protected_;
   }

   @Override
   protected void m_() {
   }

   @Override
   public void q_() {
   }
}
