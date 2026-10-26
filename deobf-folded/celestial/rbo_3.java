package celestial;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;

public class rbo_3 extends rOl_1 {
   private static final rut_3<rfH_2> id_break = rmE_2.id_class(rbo_3.class, ruw_3.id_native);
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rbo_3.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_super = rmE_2.id_class(rbo_3.class, ruw_3.id_break);
   static final ay_3 id_this = new ay_3().id_class(10.0).id_break().id_class().id_byte();
   public static final Predicate<rsE_2> id_class = var0 -> !var0.id_package() && var0.BM() && var0.rT();

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Pj;
   }

   public rbo_3(aI_2<? extends rbo_3> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rbK_2(this);
      this.id_extends = new rPj_1(this, 10);
      this.id_byte(true);
   }

   @Override
   public int S() {
      return 1;
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.c()) {
         this.id_throws(this.ri());
      } else {
         if (this.Pk()) {
            this.id_break(2400);
         } else {
            this.id_break(this.n() - 1);
            if (this.n() <= 0) {
               this.id_break(rye_3.id_this, 1.0F);
            }

            if ((Boolean)this.id_throws[20]) {
               this.id_byte(
                  this.rv()
                     .id_break(
                        (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.2F),
                        0.5,
                        (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.2F)
                     )
               );
               Float var10 = ((Random)this.id_throws[40]).nextFloat() * 360.0F;
               this.id_throws[15] = var10;
               Boolean var11 = false;
               this.id_throws[20] = var11;
               Boolean var12 = true;
               this.id_throws[57] = var12;
            }
         }

         if (((rYB)this.id_throws[7]).id_continue && this.rT() && this.rv().id_catch() > 0.03) {
            rjU_2 var1 = this.id_break(0.0F);
            float var2 = rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * 0.3F;
            float var3 = rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * 0.3F;
            float var4 = 1.2F - ((Random)this.id_throws[40]).nextFloat() * 0.7F;

            for (int var5 = 0; var5 < 2; var5++) {
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.X,
                     this.rx() - var1.id_break * (double)var4 + (double)var2,
                     this.re() - var1.id_byte,
                     this.BO() - var1.id_protected * (double)var4 + (double)var3,
                     0.0,
                     0.0,
                     0.0
                  );
               ((rYB)this.id_throws[7])
                  .id_class(
                     rLQ.X,
                     this.rx() - var1.id_break * (double)var4 - (double)var2,
                     this.re() - var1.id_byte,
                     this.BO() - var1.id_protected * (double)var4 - (double)var3,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      }
   }

   public int n() {
      return ((rmE_2)this.id_throws[49]).id_class(id_super);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 38) {
         this.id_class(rLQ.id_char);
      } else {
         super.id_class(var1);
      }
   }

   private void id_class(rLx_1 var1) {
      for (int var2 = 0; var2 < 7; var2++) {
         double var3 = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
         double var5 = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
         double var7 = ((Random)this.id_throws[40]).nextGaussian() * 0.01;
         ((rYB)this.id_throws[7]).id_class(var1, this.id_break(1.0), this.Ph() + 0.2, this.id_protected(1.0), var3, var5, var7);
      }
   }

   @Override
   protected void id_class(int var1) {
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_throws(this.ri());
      Float var10 = 0.0F;
      this.id_throws[16] = var10;
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("TreasurePosX", this.id_throws().b_());
      var1.id_break("TreasurePosY", this.id_throws().c_());
      var1.id_break("TreasurePosZ", this.id_throws().d_());
      var1.id_class("GotFish", this.L());
      var1.id_break("Moistness", this.n());
   }

   @Override
   public int r() {
      return 1;
   }

   @Override
   protected void id_break(rsE_2 var1) {
      if (this.id_class(rXQ.MAINHAND).id_class()) {
         rdn_3 var2 = var1.id_protected();
         if (this.id_private(var2)) {
            this.id_class(var1);
            this.id_class(rXQ.MAINHAND, var2);
            this.id_new[rXQ.MAINHAND.id_break()] = 2.0F;
            this.id_class(var1, var2.id_char());
            var1.PD();
         }
      }
   }

   public static boolean id_break(aI_2<rbo_3> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      if (var3.c_() > 45 && var3.c_() < var1.id_short()) {
         Optional var5 = var1.id_protected(var3);
         return (!Objects.equals(var5, Optional.of(rYl_1.id_class)) || !Objects.equals(var5, Optional.of(rYl_1.id_goto)))
            && var1.id_break(var3).id_class(rlG_2.id_break);
      } else {
         return false;
      }
   }

   @Override
   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (!var3.id_class() && var3.id_break().id_class(rlc_3.id_switch)) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class(rqn_3.Pf, 1.0F, 1.0F);
         }

         this.id_this(true);
         if (!((rhx_3)var1.id_implements[18]).id_protected) {
            var3.id_catch(1);
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      int var2 = var1.id_private("TreasurePosX");
      int var3 = var1.id_private("TreasurePosY");
      int var4 = var1.id_private("TreasurePosZ");
      this.id_implements(new rfH_2(var2, var3, var4));
      super.id_break(var1);
      this.id_this(var1.id_new("GotFish"));
      this.id_break(var1.id_private("Moistness"));
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rLw_1(this, var1);
   }

   public void id_break(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_super, var1);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.3F;
   }

   public rfH_2 id_throws() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      rXQ var2 = is_3.id_finally(var1);
      return !this.id_class(var2).id_class() ? false : var2 == rXQ.MAINHAND && super.id_throws(var1);
   }

   public boolean L() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   protected boolean sx() {
      rfH_2 var1 = this.id_public().id_catch();
      return var1 != null ? var1.id_class(this.Ps(), 12.0) : false;
   }

   public void id_implements(rfH_2 var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   @Override
   protected boolean id_new(an_3 var1) {
      return true;
   }

   @Override
   protected int id_new(int var1) {
      return this.ri();
   }

   @Override
   protected rqA_2 id_static() {
      return this.rT() ? rqn_3.Pt : rqn_3.PT;
   }

   @Override
   public boolean id_public(an_3 var1) {
      boolean var2 = var1.id_break(rye_3.id_byte(this), (float)((int)this.id_class(iQ_2.id_case)));
      if (var2) {
         this.id_class(this, var1);
         this.id_class(rqn_3.Pw, 1.0F, 1.0F);
      }

      return var2;
   }

   @Override
   public boolean id_protected(rhd_3 var1) {
      return true;
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_try() && this.rT()) {
         this.id_class(this.sB(), var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.9));
         if (this.I_() == null) {
            this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
         }
      } else {
         super.id_private(var1);
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rBr_1(this));
      this.id_package.id_class(0, new rBM(this));
      this.id_package.id_class(1, new rbU_2(this));
      this.id_package.id_class(2, new rbe_3(this, 4.0));
      this.id_package.id_class(4, new rBD(this, 1.0, 10));
      this.id_package.id_class(4, new rBC(this));
      this.id_package.id_class(5, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(5, new rBG(this, 10));
      this.id_package.id_class(6, new rBl_1(this, 1.2F, true));
      this.id_package.id_class(8, new rbD_2(this));
      this.id_package.id_class(8, new rBh_1(this));
      this.id_package.id_class(9, new rPD<>(this, rEI.class, 8.0F, 1.0, 1.0));
      this.id_int.id_class(1, new rBc_1(this, rEI.class).id_class());
   }

   @Override
   public int ri() {
      return 4800;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.PY;
   }

   @Override
   protected rqA_2 BJ() {
      return rqn_3.PR;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.PI;
   }

   public static iz_3 sJ() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0).id_class(iQ_2.id_protected, 1.2F).id_class(iQ_2.id_case, 3.0);
   }

   @Override
   public boolean SO() {
      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_break, rfH_2.id_protected);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
      ((rmE_2)this.id_throws[49]).id_class(id_super, 2400);
   }
}
