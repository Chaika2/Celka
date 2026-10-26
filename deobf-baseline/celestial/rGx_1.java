package celestial;

import java.util.Random;
import java.util.function.Predicate;

public class rGx_1 extends rEB {
   private static final Predicate<an_3> id_protected = var0 -> var0.BM() && !(var0 instanceof rGx_1);
   private int id_super;
   private int id_this;
   private int id_else;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Xd;
   }

   public rGx_1(aI_2<? extends rGx_1> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 1.0F;
      this.id_throws[37] = var7;
      this.id_finally = 20;
   }

   @Override
   public int S() {
      return 45;
   }

   private void sl() {
      if (this.BM()) {
         for (an_3 var2 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_class(4.0), id_protected)) {
            if (!(var2 instanceof rsi_3)) {
               var2.id_break(rye_3.id_byte(this), 6.0F);
            }

            this.id_class(var2);
         }

         rjU_2 var9 = this.rN().id_case();

         for (int var10 = 0; var10 < 40; var10++) {
            double var3 = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
            double var5 = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
            double var7 = ((Random)this.id_throws[40]).nextGaussian() * 0.2;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_boolean, var9.id_break, var9.id_byte, var9.id_protected, var3, var5, var7);
         }
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 4) {
         this.id_super = 10;
         this.id_class(rqn_3.XX, 1.0F, 1.0F);
      } else if (var1 == 39) {
         this.id_this = 40;
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(int var1, boolean var2) {
   }

   @Override
   public boolean id_class(rRR var1) {
      return !var1.id_protected(this.rN());
   }

   private void id_class(an_3 var1) {
      double var2 = var1.rx() - this.rx();
      double var4 = var1.BO() - this.BO();
      double var6 = Math.max(var2 * var2 + var4 * var4, 0.001);
      var1.id_implements(var2 / var6 * 4.0, 0.2, var4 / var6 * 4.0);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("AttackTick", this.id_super);
      var1.id_break("StunTick", this.id_this);
      var1.id_break("RoarTick", this.id_else);
   }

   public int sc() {
      return this.id_this;
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.BM()) {
         if (this.BK()) {
            this.id_byte(iQ_2.id_protected).id_class(0.0);
         } else {
            double var1 = this.I_() != null ? 0.35 : 0.3;
            double var3 = this.id_byte(iQ_2.id_protected).id_break();
            this.id_byte(iQ_2.id_protected).id_class(rfU_2.id_protected(0.1, var3, var1));
         }

         if ((Boolean)this.id_throws[23] && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
            boolean var7 = false;
            rfl_3 var2 = this.rN().id_class(0.2);

            for (rfH_2 var4 : rfH_2.id_break(
               rfU_2.id_byte(var2.id_class),
               rfU_2.id_byte(var2.id_break),
               rfU_2.id_byte(var2.id_byte),
               rfU_2.id_byte(var2.id_protected),
               rfU_2.id_byte(var2.id_throws),
               rfU_2.id_byte(var2.id_case)
            )) {
               xc_3 var5 = ((rYB)this.id_throws[7]).id_byte(var4);
               xd_3 var6 = var5.id_break();
               if (var6 instanceof kZ_2) {
                  var7 = ((rYB)this.id_throws[7]).id_class(var4, true, this) || var7;
               }
            }

            if (!var7 && (Boolean)this.id_throws[20]) {
               this.id_continue(false);
            }
         }

         if (this.id_else > 0) {
            this.id_else--;
            if (this.id_else == 10) {
               this.sl();
            }
         }

         if (this.id_super > 0) {
            this.id_super--;
         }

         if (this.id_this > 0) {
            this.id_this--;
            this.sC();
            if (this.id_this == 0) {
               this.id_class(rqn_3.Xz, 1.0F, 1.0F);
               this.id_else = 20;
            }
         }
      }
   }

   @Override
   protected void id_void() {
      boolean var1 = !(this.rU() instanceof is_3) || this.rU().BC().id_class(rlE_2.id_byte);
      boolean var2 = !(this.ra() instanceof rSK);
      this.id_package.id_class(rBW.MOVE, var1);
      this.id_package.id_class(rBW.JUMP, var1 && var2);
      this.id_package.id_class(rBW.LOOK, var1);
      this.id_package.id_class(rBW.TARGET, var1);
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Xk, 0.15F, 1.0F);
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rGk_1(this, var1);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_super = var1.id_private("AttackTick");
      this.id_this = var1.id_private("StunTick");
      this.id_else = var1.id_private("RoarTick");
   }

   @Override
   protected void id_throws(iB_2 var1) {
      if (this.id_else == 0) {
         if (((Random)this.id_throws[40]).nextDouble() < 0.5) {
            this.id_this = 40;
            this.id_class(rqn_3.XW, 1.0F, 1.0F);
            ((rYB)this.id_throws[7]).id_class(this, (byte)39);
            var1.id_byte(this);
         } else {
            this.id_class(var1);
         }

         Boolean var6 = true;
         var1.id_throws[25] = var6;
      }
   }

   public static iz_3 id_throws() {
      return rEi_1.sm()
         .id_class(iQ_2.id_class, 100.0)
         .id_class(iQ_2.id_protected, 0.3)
         .id_class(iQ_2.id_byte, 0.75)
         .id_class(iQ_2.id_case, 12.0)
         .id_class(iQ_2.id_catch, 1.5)
         .id_class(iQ_2.id_break, 32.0);
   }

   @Override
   public boolean G() {
      return !this.c() && this.rU() instanceof iB_2;
   }

   @Override
   public boolean id_while(an_3 var1) {
      return this.id_this <= 0 && this.id_else <= 0 ? super.id_while(var1) : false;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Xh;
   }

   @Override
   public boolean id_public(an_3 var1) {
      this.id_super = 10;
      ((rYB)this.id_throws[7]).id_class(this, (byte)4);
      this.id_class(rqn_3.XX, 1.0F, 1.0F);
      return super.id_public(var1);
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(4, new rGd_1(this));
      this.id_package.id_class(5, new rSk_1(this, 0.4));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 8.0F));
      this.id_int.id_class(2, new rBc_1(this, rEB.class).id_class());
      this.id_int.id_class(3, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(4, new rBI<>(this, rsy_3.class, true));
      this.id_int.id_class(4, new rBI<>(this, rMZ.class, true));
   }

   public int sn() {
      return this.id_else;
   }

   @Override
   public an_3 rU() {
      return this.Bh().isEmpty() ? null : this.Bh().get(0);
   }

   @Override
   public double PS() {
      return 2.1;
   }

   @Override
   protected boolean BK() {
      return super.BK() || this.id_super > 0 || this.id_this > 0 || this.id_else > 0;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Xx;
   }

   public int sN() {
      return this.id_super;
   }

   @Override
   public boolean su() {
      return false;
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.XJ;
   }

   private void sC() {
      if (((Random)this.id_throws[40]).nextInt(6) == 0) {
         double var1 = this.rx()
            - (double)this.PN() * Math.sin((double)((Float)this.id_private[23] * (float) (Math.PI / 180.0)))
            + (((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3);
         double var3 = this.re() + (double)this.Bm() - 0.3;
         double var5 = this.BO()
            + (double)this.PN() * Math.cos((double)((Float)this.id_private[23] * (float) (Math.PI / 180.0)))
            + (((Random)this.id_throws[40]).nextDouble() * 0.6 - 0.3);
         ((rYB)this.id_throws[7]).id_class(rLQ.id_else, var1, var3, var5, 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
      }
   }
}
