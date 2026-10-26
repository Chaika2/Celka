package celestial;

import java.util.Random;

public class rED extends rGp_1 implements aa_3 {
   private int id_super;
   private final rjU_2[][] id_this;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.EZ;
   }

   public rED(aI_2<? extends rED> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 5;
      this.id_this = new rjU_2[2][4];

      for (int var3 = 0; var3 < 4; var3++) {
         this.id_this[0][var3] = rjU_2.id_class;
         this.id_this[1][var3] = rjU_2.id_class;
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OM));
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(int var1, boolean var2) {
   }

   @Override
   protected rqA_2 sc() {
      return rqn_3.Eu;
   }

   @Override
   public void id_default() {
      super.id_default();
      if (((rYB)this.id_throws[7]).id_continue && this.Pp()) {
         this.id_super--;
         if (this.id_super < 0) {
            this.id_super = 0;
         }

         if ((Integer)this.id_private[10] != 1 && (Integer)this.id_throws[41] % 1200 != 0) {
            if ((Integer)this.id_private[10] == (Integer)this.id_private[11] - 1) {
               this.id_super = 3;

               for (int var4 = 0; var4 < 4; var4++) {
                  this.id_this[0][var4] = this.id_this[1][var4];
                  this.id_this[1][var4] = new rjU_2(0.0, 0.0, 0.0);
               }
            }
         } else {
            this.id_super = 3;
            float var1 = -6.0F;
            byte var2 = 13;

            for (int var3 = 0; var3 < 4; var3++) {
               this.id_this[0][var3] = this.id_this[1][var3];
               this.id_this[1][var3] = new rjU_2(
                  (double)(-6.0F + (float)((Random)this.id_throws[40]).nextInt(13)) * 0.5,
                  (double)Math.max(0, ((Random)this.id_throws[40]).nextInt(6) - 4),
                  (double)(-6.0F + (float)((Random)this.id_throws[40]).nextInt(13)) * 0.5
               );
            }

            for (int var5 = 0; var5 < 16; var5++) {
               ((rYB)this.id_throws[7]).id_class(rLQ.id_case, this.id_break(0.5), this.Ph(), this.id_throws(0.5), 0.0, 0.0, 0.0);
            }

            ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Ev, this.Pr(), 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      rdn_3 var3 = this.id_case(this.id_protected(rhj_3.id_class(this, rdy_3.OM)));
      rhm_3 var4 = rhj_3.id_class(this, var3, var2);
      double var5 = var1.rx() - this.rx();
      double var7 = var1.id_byte(0.3333333333333333) - var4.re();
      double var9 = var1.BO() - this.BO();
      double var11 = (double)rfU_2.id_class(var5 * var5 + var9 * var9);
      var4.id_byte(var5, var7 + var11 * 0.2F, var9, 1.6F, (float)(14 - ((rYB)this.id_throws[7]).id_abstract().id_class() * 4));
      this.id_class(rqn_3.JT, 1.0F, 1.0F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.id_throws[7]).a_(var4);
   }

   @Override
   public rEr_1 id_throws() {
      if (this.sn()) {
         return rEr_1.SPELLCASTING;
      } else {
         return this.v() ? rEr_1.BOW_AND_ARROW : rEr_1.CROSSED;
      }
   }

   public rjU_2[] id_throw(float var1) {
      if (this.id_super <= 0) {
         return this.id_this[1];
      } else {
         double var2 = (double)(((float)this.id_super - var1) / 3.0F);
         var2 = Math.pow(var2, 0.25);
         rjU_2[] var4 = new rjU_2[4];

         for (int var5 = 0; var5 < 4; var5++) {
            var4[var5] = this.id_this[1][var5].id_class(1.0 - var2).id_throws(this.id_this[0][var5].id_class(var2));
         }

         return var4;
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Ec;
   }

   @Override
   public boolean id_final(an_3 var1) {
      if (super.id_final(var1)) {
         return true;
      } else {
         return var1 instanceof iB_2 && ((iB_2)var1).sG() == aL_2.id_protected ? this.BG() == null && var1.BG() == null : false;
      }
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rGq_1(this));
      this.id_package.id_class(4, new rEe_1(this));
      this.id_package.id_class(5, new rEU(this));
      this.id_package.id_class(6, new rBa_1<>(this, 0.5, 20, 15.0F));
      this.id_package.id_class(8, new rBU(this, 0.6));
      this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 8.0F));
      this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true).id_class(300));
      this.id_int.id_class(3, new rBI<>(this, rsy_3.class, false).id_class(300));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, false).id_class(300));
   }

   @Override
   public rfl_3 PE() {
      return this.rN().id_byte(3.0, 0.0, 3.0);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Em;
   }

   public static iz_3 sN() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 18.0).id_class(iQ_2.id_class, 32.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.Ec;
   }

   @Override
   protected void m_() {
      super.m_();
   }
}
