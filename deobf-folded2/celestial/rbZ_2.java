package celestial;

import java.util.Random;
import java.util.UUID;

public abstract class rbZ_2 extends au_3 {
   private int id_super;
   private UUID id_this;

   @Override
   public int id_char() {
      return 120;
   }

   @Override
   protected int id_byte(rhd_3 var1) {
      return 1 + ((rYB)this.id_throws[7]).id_int.nextInt(3);
   }

   public static boolean id_byte(aI_2<? extends rbZ_2> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_byte(var3.id_break()).id_class(xu_3.id_implements) && var1.id_class(var3, 0) > 8;
   }

   @Override
   protected void id_double() {
      if (this.O_() != 0) {
         this.id_super = 0;
      }

      super.id_double();
   }

   protected rbZ_2(aI_2<? extends rbZ_2> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.DANGER_FIRE, 16.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, -1.0F);
      this.id_private(3);
   }

   public void id_this(int var1) {
      this.id_super = var1;
   }

   protected void id_class(rhd_3 var1, rdn_3 var2) {
      if (!((rhx_3)var1.id_implements[18]).id_protected) {
         var2.id_catch(1);
      }
   }

   public void id_class(rrEm_1 var1, rbZ_2 var2) {
      au_3 var3 = this.id_class(var1, (au_3)var2);
      if (var3 != null) {
         rhN_2 var4 = this.sz();
         if (var4 == null && var2.sz() != null) {
            var4 = var2.sz();
         }

         if (var4 != null) {
            var4.id_break(rlB_2.id_strictfp);
            Oo_1.id_package.id_class(var4, this, var2, var3);
         }

         this.e_(6000);
         var2.e_(6000);
         this.sN();
         var2.sN();
         var3.id_class(true);
         var3.id_class(this.rx(), this.re(), this.BO(), 0.0F, 0.0F);
         var1.id_class(var3);
         var1.id_class(this, (byte)18);
         if (var1.B().id_break(rRu_1.id_throws)) {
            var1.a_(new rsP_2(var1, this.rx(), this.re(), this.BO(), this.Sa().nextInt(7) + 1));
         }
      }
   }

   public boolean id_class(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else {
         return var1.getClass() != this.getClass() ? false : this.sQ() && var1.sQ();
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 18) {
         for (int var2 = 0; var2 < 7; var2++) {
            double var3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var5 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var7 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_long, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), var3, var5, var7);
         }
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("InLove", this.id_super);
      if (this.id_this != null) {
         var1.id_class("LoveCause", this.id_this);
      }
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return var2.id_byte(var1.id_break()).id_class(xu_3.id_implements) ? 10.0F : var2.id_native(var1) - 0.5F;
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.O_() != 0) {
         this.id_super = 0;
      }

      if (this.id_super > 0) {
         this.id_super--;
         if (this.id_super % 10 == 0) {
            double var1 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            double var5 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_long, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), var1, var3, var5);
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_super = var1.id_private("InLove");
      this.id_this = var1.id_break("LoveCause") ? var1.id_class("LoveCause") : null;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         this.id_super = 0;
         return super.id_break(var1, var2);
      }
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (this.id_extends(var3)) {
         int var4 = this.O_();
         if (!((rYB)this.id_throws[7]).id_continue && var4 == 0 && this.sk()) {
            this.id_class(var1, var3);
            this.id_throws(var1);
            return ryZ_2.SUCCESS;
         }

         if (this.n_()) {
            this.id_class(var1, var3);
            this.id_class((int)((float)(-var4 / 20) * 0.1F), true);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }

         if (((rYB)this.id_throws[7]).id_continue) {
            return ryZ_2.CONSUME;
         }
      }

      return super.id_break(var1, var2);
   }

   public void id_throws(rhd_3 var1) {
      this.id_super = 600;
      if (var1 != null) {
         this.id_this = var1.ro();
      }

      ((rYB)this.id_throws[7]).id_class(this, (byte)18);
   }

   public boolean sk() {
      return this.id_super <= 0;
   }

   public boolean id_extends(rdn_3 var1) {
      return var1.id_break() == rdy_3.hB;
   }

   @Override
   public boolean id_private(double var1) {
      return false;
   }

   public rhN_2 sz() {
      if (this.id_this == null) {
         return null;
      } else {
         rhd_3 var1 = ((rYB)this.id_throws[7]).id_class(this.id_this);
         return var1 instanceof rhN_2 ? (rhN_2)var1 : null;
      }
   }

   @Override
   public double Pv() {
      return 0.14;
   }

   public void sN() {
      this.id_super = 0;
   }

   public int sW() {
      return this.id_super;
   }

   public boolean sQ() {
      return this.id_super > 0;
   }
}
