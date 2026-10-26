package celestial;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Random;

public abstract class rsy_3 extends au_3 implements ae_3, rsA_2 {
   private static final rut_3<Integer> id_this = rmE_2.id_class(rsy_3.class, ruw_3.id_break);
   private rhd_3 id_else;
   protected rdf_3 id_super;
   private final rXA id_synchronized = new rXA(8);

   @Override
   public rYB id_byte() {
      return (rYB)this.id_throws[7];
   }

   public rsy_3(aI_2<? extends rsy_3> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.DANGER_FIRE, 16.0F);
      this.id_class(rLp_1.DAMAGE_FIRE, -1.0F);
   }

   protected rqA_2 id_this(boolean var1) {
      return var1 ? rqn_3.ks : rqn_3.kB;
   }

   public void id_this(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_this, var1);
   }

   @Override
   public boolean n() {
      return this.id_else != null;
   }

   @Override
   public void id_class(rdI_2 var1) {
      var1.id_finally();
      this.id_implements = -this.id_char();
      this.id_break(var1);
      if (this.id_else instanceof rhN_2) {
         Oo_1.id_super.id_class((rhN_2)this.id_else, this, var1.id_protected());
      }
   }

   @Override
   public void id_class(rdn_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && this.id_implements > -this.id_char() + 20) {
         this.id_implements = -this.id_char();
         this.id_class(this.id_this(!var1.id_class()), this.Si(), this.SN());
      }
   }

   protected void id_class(rLx_1 var1) {
      for (int var2 = 0; var2 < 5; var2++) {
         double var3 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var5 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         double var7 = ((Random)this.id_throws[40]).nextGaussian() * 0.02;
         ((rYB)this.id_throws[7]).id_class(var1, this.id_break(1.0), this.Ph() + 1.0, this.id_protected(1.0), var3, var5, var7);
      }
   }

   @Override
   public an_3 id_class(rrEm_1 var1) {
      this.sx();
      return super.id_class(var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rdf_3 var2 = this.id_break();
      if (!var2.isEmpty()) {
         var1.id_class("Offers", var2.id_class());
      }

      var1.id_class("Inventory", this.id_synchronized.id_byte());
   }

   protected void id_class(rdf_3 var1, rsR_2[] var2, int var3) {
      HashSet var4 = Sets.newHashSet();
      if (var2.length > var3) {
         while (var4.size() < var3) {
            var4.add(((Random)this.id_throws[40]).nextInt(var2.length));
         }
      } else {
         for (int var5 = 0; var5 < var2.length; var5++) {
            var4.add(var5);
         }
      }

      for (Integer var6 : var4) {
         rsR_2 var7 = var2[var6];
         rdI_2 var8 = var7.id_class(this, (Random)this.id_throws[40]);
         if (var8 != null) {
            var1.add(var8);
         }
      }
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      if (super.id_class(var1, var2)) {
         return true;
      } else {
         int var3 = var1 - 300;
         if (var3 >= 0 && var3 < this.id_synchronized.id_else()) {
            this.id_synchronized.id_break(var3, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public rhd_3 id_class() {
      return this.id_else;
   }

   @Override
   public void id_class(rhd_3 var1) {
      this.id_else = var1;
   }

   @Override
   public rjU_2 id_class(float var1) {
      float var2 = rfU_2.id_catch(var1, (Float)this.id_private[24], (Float)this.id_private[23]) * (float) (Math.PI / 180.0);
      rjU_2 var3 = new rjU_2(0.0, this.rN().id_byte() - 1.0, 0.2);
      return this.id_finally(var1).id_throws(var3.id_break(-var2));
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(int var1) {
   }

   @Override
   public void id_class(rdf_3 var1) {
   }

   public rXA sd() {
      return this.id_synchronized;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("Offers", 10)) {
         this.id_super = new rdf_3(var1.id_int("Offers"));
      }

      this.id_synchronized.id_class(var1.id_protected("Inventory", 10));
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
      this.sx();
   }

   @Override
   public rdf_3 id_break() {
      if (this.id_super == null) {
         this.id_super = new rdf_3();
         this.sk();
      }

      return this.id_super;
   }

   protected abstract void id_break(rdI_2 var1);

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return this.n_() ? 0.81F : 1.62F;
   }

   @Override
   public boolean id_throws() {
      return true;
   }

   public int L() {
      return ((rmE_2)this.id_throws[49]).id_class(id_this);
   }

   protected void sx() {
      this.id_class((rhd_3)null);
   }

   protected abstract void sk();

   @Override
   public rqA_2 id_case() {
      return rqn_3.ks;
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return false;
   }

   @Override
   public int id_protected() {
      return 0;
   }

   @Override
   public void sJ() {
      this.id_class(rqn_3.di, this.Si(), this.SN());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_this, 0);
   }
}
