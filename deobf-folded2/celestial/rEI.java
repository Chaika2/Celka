package celestial;

import java.util.EnumSet;
import java.util.Random;

public class rEI extends rEi_1 {
   private static final rut_3<Boolean> id_class = rmE_2.id_class(rEI.class, ruw_3.id_implements);
   private static final rut_3<Integer> id_protected = rmE_2.id_class(rEI.class, ruw_3.id_break);
   private float id_super;
   private float id_this;
   private float id_else;
   private float id_synchronized;
   private float id_return;
   private iB_2 id_public;
   private int id_goto;
   private boolean id_while;
   protected rBU id_break;

   @Override
   public int id_char() {
      return 160;
   }

   public float id_char(float var1) {
      return ((float)this.id_goto + var1) / (float)this.L();
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return this.Pa() ? rqn_3.sl : rqn_3.sH;
   }

   public rEI(aI_2<? extends rEI> var1, rYB var2) {
      super(var1, var2);
      this.id_finally = 10;
      this.id_class(rLp_1.WATER, 0.0F);
      this.id_native = new rEj_1(this);
      this.id_super = ((Random)this.id_throws[40]).nextFloat();
      this.id_this = this.id_super;
   }

   void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   public float id_interface(float var1) {
      return rfU_2.id_catch(var1, this.id_return, this.id_synchronized);
   }

   void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      super.id_class(var1);
      if (id_protected.equals(var1)) {
         this.id_goto = 0;
         this.id_public = null;
      }
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this);
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      return var2.id_break(var1).id_class(rlG_2.id_break) ? 10.0F + var2.id_native(var1) - 0.5F : super.id_class(var1, var2);
   }

   @Override
   public void id_default() {
      if (this.BM()) {
         if (((rYB)this.id_throws[7]).id_continue) {
            this.id_this = this.id_super;
            if (!this.rT()) {
               this.id_else = 2.0F;
               rjU_2 var1 = this.rv();
               if (var1.id_byte > 0.0 && this.id_while && !this.BF()) {
                  ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), this.sJ(), this.Pr(), 1.0F, 1.0F, false);
               }

               this.id_while = var1.id_byte < 0.0 && ((rYB)this.id_throws[7]).id_class(this.Bs().id_break(), this);
            } else if (this.sd()) {
               if (this.id_else < 0.5F) {
                  this.id_else = 4.0F;
               } else {
                  this.id_else = this.id_else + (0.5F - this.id_else) * 0.1F;
               }
            } else {
               this.id_else = this.id_else + (0.125F - this.id_else) * 0.2F;
            }

            this.id_super = this.id_super + this.id_else;
            this.id_return = this.id_synchronized;
            if (!this.Pa()) {
               this.id_synchronized = ((Random)this.id_throws[40]).nextFloat();
            } else if (this.sd()) {
               this.id_synchronized = this.id_synchronized + (0.0F - this.id_synchronized) * 0.25F;
            } else {
               this.id_synchronized = this.id_synchronized + (1.0F - this.id_synchronized) * 0.06F;
            }

            if (this.sd() && this.rT()) {
               rjU_2 var22 = this.id_break(0.0F);

               for (int var2 = 0; var2 < 2; var2++) {
                  ((rYB)this.id_throws[7])
                     .id_class(
                        rLQ.id_throws,
                        this.id_break(0.5) - var22.id_break * 1.5,
                        this.Ph() - var22.id_byte * 1.5,
                        this.id_protected(0.5) - var22.id_protected * 1.5,
                        0.0,
                        0.0,
                        0.0
                     );
               }
            }

            if (this.sk()) {
               if (this.id_goto < this.L()) {
                  this.id_goto++;
               }

               iB_2 var23 = this.sW();
               if (var23 != null) {
                  this.id_continue().id_class(var23, 90.0F, 90.0F);
                  this.id_continue().id_class();
                  double var24 = (double)this.id_char(0.0F);
                  double var4 = var23.rx() - this.rx();
                  double var6 = var23.id_byte(0.5) - this.rH();
                  double var8 = var23.BO() - this.BO();
                  double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
                  var4 /= var10;
                  var6 /= var10;
                  var8 /= var10;
                  double var12 = ((Random)this.id_throws[40]).nextDouble();

                  while (var12 < var10) {
                     var12 += 1.8 - var24 + ((Random)this.id_throws[40]).nextDouble() * (1.7 - var24);
                     ((rYB)this.id_throws[7])
                        .id_class(rLQ.id_throws, this.rx() + var4 * var12, this.rH() + var6 * var12, this.BO() + var8 * var12, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.Pa()) {
            this.id_throws(300);
         } else if ((Boolean)this.id_throws[20]) {
            this.id_byte(
               this.rv()
                  .id_break(
                     (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.4F),
                     0.5,
                     (double)((((Random)this.id_throws[40]).nextFloat() * 2.0F - 1.0F) * 0.4F)
                  )
            );
            Float var18 = ((Random)this.id_throws[40]).nextFloat() * 360.0F;
            this.id_throws[15] = var18;
            Boolean var19 = false;
            this.id_throws[20] = var19;
            Boolean var20 = true;
            this.id_throws[57] = var20;
         }

         if (this.sk()) {
            Float var21 = (Float)this.id_private[25];
            this.id_throws[15] = var21;
         }
      }

      super.id_default();
   }

   public boolean sd() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   @Override
   public int r() {
      return 180;
   }

   public static boolean id_break(aI_2<? extends rEI> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return (var4.nextInt(20) == 0 || !var1.id_extends(var3))
         && var1.id_abstract() != rRO.PEACEFUL
         && (var2 == iO_2.SPAWNER || var1.id_break(var3).id_class(rlG_2.id_break));
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rLw_1(this, var1);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.5F;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (!this.sd() && !var1.id_this() && var1.id_finally() instanceof iB_2) {
         iB_2 var3 = (iB_2)var1.id_finally();
         if (!var1.id_protected()) {
            var3.id_break(rye_3.id_class((an_3)this), 2.0F);
         }
      }

      if (this.id_break != null) {
         this.id_break.id_private();
      }

      return super.id_break(var1, var2);
   }

   public int L() {
      return 80;
   }

   public static iz_3 sx() {
      return rEi_1.sm().id_class(iQ_2.id_case, 6.0).id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 16.0).id_class(iQ_2.id_class, 30.0);
   }

   public boolean sk() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected) != 0;
   }

   public float id_throw(float var1) {
      return rfU_2.id_catch(var1, this.id_this, this.id_super);
   }

   @Override
   protected rqA_2 id_static() {
      return this.Pa() ? rqn_3.sv : rqn_3.sF;
   }

   @Override
   public void id_private(rjU_2 var1) {
      if (this.id_try() && this.rT()) {
         this.id_class(0.1F, var1);
         this.id_class(iG_2.SELF, this.rv());
         this.id_byte(this.rv().id_class(0.9));
         if (!this.sd() && this.I_() == null) {
            this.id_byte(this.rv().id_break(0.0, -0.005, 0.0));
         }
      } else {
         super.id_private(var1);
      }
   }

   @Override
   protected void id_final() {
      rBT var1 = new rBT(this, 1.0);
      this.id_break = new rBU(this, 1.0, 80);
      this.id_package.id_class(4, new rEf_1(this));
      this.id_package.id_class(5, var1);
      this.id_package.id_class(7, this.id_break);
      this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(8, new rBA(this, rEI.class, 12.0F, 0.01F));
      this.id_package.id_class(9, new rBC(this));
      this.id_break.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      var1.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      this.id_int.id_class(1, new rBI<>(this, iB_2.class, 10, true, false, new rEV(this)));
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return this.Pa() ? rqn_3.sA : rqn_3.sn;
   }

   protected rqA_2 sJ() {
      return rqn_3.sC;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_throws;
   }

   public iB_2 sW() {
      if (!this.sk()) {
         return null;
      } else if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_public != null) {
            return this.id_public;
         } else {
            an_3 var1 = ((rYB)this.id_throws[7]).id_break(((rmE_2)this.id_throws[49]).id_class(id_protected));
            if (var1 instanceof iB_2) {
               this.id_public = (iB_2)var1;
               return this.id_public;
            } else {
               return null;
            }
         }
      } else {
         return this.I_();
      }
   }

   @Override
   public boolean SO() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, false);
      ((rmE_2)this.id_throws[49]).id_class(id_protected, 0);
   }
}
