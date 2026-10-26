package celestial;

public class rPY {
   protected final is_3 id_class;
   protected double id_break;
   protected double id_byte;
   protected double id_protected;
   protected double id_throws;
   protected float id_case;
   protected float id_catch;
   protected rPo_1 id_private = rPo_1.WAIT;

   public double id_byte() {
      return this.id_throws;
   }

   public rPY(is_3 var1) {
      this.id_class = var1;
   }

   protected float id_class(float var1, float var2, float var3) {
      float var4 = rfU_2.id_catch(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      float var5 = var1 + var4;
      if (var5 < 0.0F) {
         var5 += 360.0F;
      } else if (var5 > 360.0F) {
         var5 -= 360.0F;
      }

      return var5;
   }

   public void id_class() {
      if (this.id_private == rPo_1.STRAFE) {
         float var1 = (float)this.id_class.id_class(iQ_2.id_protected);
         float var2 = (float)this.id_throws * var1;
         float var3 = this.id_case;
         float var4 = this.id_catch;
         float var5 = rfU_2.id_byte(var3 * var3 + var4 * var4);
         if (var5 < 1.0F) {
            var5 = 1.0F;
         }

         var5 = var2 / var5;
         var3 *= var5;
         var4 *= var5;
         float var6 = rfU_2.id_class((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0));
         float var7 = rfU_2.id_break((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0));
         float var8 = var3 * var7 - var4 * var6;
         float var9 = var4 * var7 + var3 * var6;
         if (!this.id_break(var8, var9)) {
            this.id_case = 1.0F;
            this.id_catch = 0.0F;
         }

         this.id_class.id_super(var2);
         this.id_class.id_catch(this.id_case);
         this.id_class.id_try(this.id_catch);
         this.id_private = rPo_1.WAIT;
      } else if (this.id_private == rPo_1.MOVE_TO) {
         this.id_private = rPo_1.WAIT;
         double var19 = this.id_break - this.id_class.rx();
         double var21 = this.id_protected - this.id_class.BO();
         double var24 = this.id_byte - this.id_class.re();
         double var25 = var19 * var19 + var24 * var24 + var21 * var21;
         if (var25 < 2.5000003E-7F) {
            this.id_class.id_catch(0.0F);
            return;
         }

         float var26 = (float)(rfU_2.id_protected(var21, var19) * 180.0F / (float)Math.PI) - 90.0F;
         is_3 var10000 = this.id_class;
         Float var18 = this.id_class((Float)this.id_class.id_throws[15], var26, 90.0F);
         var10000.id_throws[15] = var18;
         this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
         rfH_2 var10 = this.id_class.Bs();
         xc_3 var11 = ((rYB)this.id_class.id_throws[7]).id_byte(var10);
         xd_3 var12 = var11.id_break();
         rjC_2 var13 = var11.id_extends((rYB)this.id_class.id_throws[7], var10);
         if (var24 > (double)((Float)this.id_class.id_throws[37]).floatValue() && var19 * var19 + var21 * var21 < (double)Math.max(1.0F, this.id_class.PN())
            || !var13.id_break()
               && this.id_class.re() < var13.id_byte(rpB_2.Y) + (double)var10.c_()
               && !var12.id_class(rls_3.id_int)
               && !var12.id_class(rls_3.id_default)) {
            this.id_class.id_else().id_class();
            this.id_private = rPo_1.JUMPING;
         }
      } else if (this.id_private == rPo_1.JUMPING) {
         this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
         if (this.id_class.BL()) {
            this.id_private = rPo_1.WAIT;
         }
      } else {
         this.id_class.id_catch(0.0F);
      }
   }

   public void id_class(float var1, float var2) {
      this.id_private = rPo_1.STRAFE;
      this.id_case = var1;
      this.id_catch = var2;
      this.id_throws = 0.25;
   }

   public void id_class(double var1, double var3, double var5, double var7) {
      this.id_break = var1;
      this.id_byte = var3;
      this.id_protected = var5;
      this.id_throws = var7;
      if (this.id_private != rPo_1.JUMPING) {
         this.id_private = rPo_1.MOVE_TO;
      }
   }

   public boolean id_break() {
      return this.id_private == rPo_1.MOVE_TO;
   }

   private boolean id_break(float var1, float var2) {
      rLy_1 var3 = this.id_class.id_public();
      if (var3 != null) {
         rLn_1 var4 = var3.id_int();
         if (var4 != null
            && var4.id_class(
                  (rYB)this.id_class.id_throws[7],
                  rfU_2.id_byte(this.id_class.rx() + (double)var1),
                  rfU_2.id_byte(this.id_class.re()),
                  rfU_2.id_byte(this.id_class.BO() + (double)var2)
               )
               != rLp_1.WALKABLE) {
            return false;
         }
      }

      return true;
   }

   public double id_throws() {
      return this.id_byte;
   }

   public double id_case() {
      return this.id_protected;
   }

   public double id_protected() {
      return this.id_break;
   }
}
