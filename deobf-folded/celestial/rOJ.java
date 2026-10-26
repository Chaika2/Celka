package celestial;

import java.util.Random;

public class rOJ extends rOl_1 {
   public float id_class;
   public float id_break;
   public float id_protected;
   public float id_super;
   public float id_this;
   public float id_else;
   public float id_synchronized;
   public float id_return;
   private float id_public;
   private float id_goto;
   private float id_while;
   private float id_try;
   private float id_instanceof;
   private float id_throw;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.xj;
   }

   public void id_byte(float var1, float var2, float var3) {
      this.id_try = var1;
      this.id_instanceof = var2;
      this.id_throw = var3;
   }

   public rOJ(aI_2<? extends rOJ> var1, rYB var2) {
      super(var1, var2);
      ((Random)this.id_throws[40]).setSeed((long)this.V());
      this.id_goto = 1.0F / (((Random)this.id_throws[40]).nextFloat() + 1.0F) * 0.2F;
   }

   private void n() {
      this.id_class(rqn_3.xV, this.Si(), this.SN());
      rjU_2 var1 = this.id_finally(new rjU_2(0.0, -1.0, 0.0)).id_break(this.rx(), this.re(), this.BO());

      for (int var2 = 0; var2 < 30; var2++) {
         rjU_2 var3 = this.id_finally(
            new rjU_2((double)((Random)this.id_throws[40]).nextFloat() * 0.6 - 0.3, -1.0, (double)((Random)this.id_throws[40]).nextFloat() * 0.6 - 0.3)
         );
         rjU_2 var4 = var3.id_class(0.3 + (double)(((Random)this.id_throws[40]).nextFloat() * 2.0F));
         ((rrEm_1)((rYB)this.id_throws[7]))
            .id_class(rLQ.P, var1.id_break, var1.id_byte + 0.5, var1.id_protected, 0, var4.id_break, var4.id_byte, var4.id_protected, 0.1F);
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 19) {
         this.id_this = 0.0F;
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_default() {
      super.id_default();
      this.id_break = this.id_class;
      this.id_super = this.id_protected;
      this.id_else = this.id_this;
      this.id_return = this.id_synchronized;
      this.id_this = this.id_this + this.id_goto;
      if ((double)this.id_this > Math.PI * 2) {
         if (((rYB)this.id_throws[7]).id_continue) {
            this.id_this = (float) (Math.PI * 2);
         } else {
            this.id_this = (float)((double)this.id_this - (Math.PI * 2));
            if (((Random)this.id_throws[40]).nextInt(10) == 0) {
               this.id_goto = 1.0F / (((Random)this.id_throws[40]).nextFloat() + 1.0F) * 0.2F;
            }

            ((rYB)this.id_throws[7]).id_class(this, (byte)19);
         }
      }

      if (this.Pa()) {
         if (this.id_this < (float) Math.PI) {
            float var1 = this.id_this / (float) Math.PI;
            this.id_synchronized = rfU_2.id_class(var1 * var1 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)var1 > 0.75) {
               this.id_public = 1.0F;
               this.id_while = 1.0F;
            } else {
               this.id_while *= 0.8F;
            }
         } else {
            this.id_synchronized = 0.0F;
            this.id_public *= 0.9F;
            this.id_while *= 0.99F;
         }

         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_catch((double)(this.id_try * this.id_public), (double)(this.id_instanceof * this.id_public), (double)(this.id_throw * this.id_public));
         }

         rjU_2 var9 = this.rv();
         float var2 = rfU_2.id_class(id_case(var9));
         Float var7 = (Float)this.id_private[23]
            + (-((float)rfU_2.id_protected(var9.id_break, var9.id_protected)) * (180.0F / (float)Math.PI) - (Float)this.id_private[23]) * 0.1F;
         this.id_private[23] = var7;
         Float var8 = (Float)this.id_private[23];
         this.id_throws[15] = var8;
         this.id_protected = (float)((double)this.id_protected + Math.PI * (double)this.id_while * 1.5);
         this.id_class = this.id_class + (-((float)rfU_2.id_protected((double)var2, var9.id_byte)) * (180.0F / (float)Math.PI) - this.id_class) * 0.1F;
      } else {
         this.id_synchronized = rfU_2.id_throws(rfU_2.id_class(this.id_this)) * (float) Math.PI * 0.25F;
         if (!((rYB)this.id_throws[7]).id_continue) {
            double var10 = this.rv().id_byte;
            if (this.id_break(rLD.id_goto)) {
               var10 = 0.05 * (double)(this.id_byte(rLD.id_goto).id_byte() + 1);
            } else if (!this.rw()) {
               var10 -= 0.08;
            }

            this.id_catch(0.0, var10 * 0.98F, 0.0);
         }

         this.id_class = (float)((double)this.id_class + (double)(-90.0F - this.id_class) * 0.02);
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (super.id_break(var1, var2) && this.Sr() != null) {
         this.n();
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.5F;
   }

   public static boolean id_break(aI_2<rOJ> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var3.c_() > 45 && var3.c_() < var1.id_short();
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 10.0);
   }

   public boolean L() {
      return this.id_try != 0.0F || this.id_instanceof != 0.0F || this.id_throw != 0.0F;
   }

   private rjU_2 id_finally(rjU_2 var1) {
      rjU_2 var2 = var1.id_class(this.id_break * (float) (Math.PI / 180.0));
      return var2.id_break(-(Float)this.id_private[24] * (float) (Math.PI / 180.0));
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.xI;
   }

   @Override
   public void id_private(rjU_2 var1) {
      this.id_class(iG_2.SELF, this.rv());
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(0, new rOd_1(this, this));
      this.id_package.id_class(1, new rOx_1(this));
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xf;
   }

   @Override
   protected float Si() {
      return 0.4F;
   }
}
