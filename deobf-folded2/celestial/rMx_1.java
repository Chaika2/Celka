package celestial;

public class rMx_1 extends rBm_1 {
   @Override
   public void id_byte() {
      this.id_class.id_super(true);
      this.id_class.id_else(true);
      this.id_class.id_return(false);
      iB_2 var1 = this.id_class.I_();
      this.id_class.id_continue().id_class(var1, 60.0F, 30.0F);
      rjU_2 var2 = new rjU_2(var1.rx() - this.id_class.rx(), var1.re() - this.id_class.re(), var1.BO() - this.id_class.BO()).id_protected();
      this.id_class.id_byte(this.id_class.rv().id_break(var2.id_break * 0.8, 0.9, var2.id_protected * 0.8));
      this.id_class.id_public().id_final();
   }

   public rMx_1(rba_3 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.sc()) {
         return false;
      } else {
         iB_2 var1 = this.id_class.I_();
         if (var1 != null && var1.BM()) {
            if (var1.rS() != var1.Pg()) {
               return false;
            } else {
               boolean var2 = rba_3.id_class(this.id_class, var1);
               if (!var2) {
                  this.id_class.id_public().id_class(var1, 0);
                  this.id_class.id_synchronized(false);
                  this.id_class.id_return(false);
               }

               return var2;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_class.I_();
      if (var1 != null && var1.BM()) {
         double var2 = this.id_class.rv().id_byte;
         return (!(var2 * var2 < 0.05F) || !(Math.abs((Float)this.id_class.id_throws[16]) < 15.0F) || !rba_3.id_byte(this.id_class)) && !this.id_class.sx();
      } else {
         return false;
      }
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      if (var1 != null) {
         this.id_class.id_continue().id_class(var1, 60.0F, 30.0F);
      }

      if (!this.id_class.sx()) {
         rjU_2 var2 = this.id_class.rv();
         if (var2.id_byte * var2.id_byte < 0.03F && (Float)this.id_class.id_throws[16] != 0.0F) {
            rba_3 var14 = this.id_class;
            Float var11 = rfU_2.id_implements((Float)this.id_class.id_throws[16], 0.0F, 0.2F);
            var14.id_throws[16] = var11;
         } else {
            double var3 = Math.sqrt(an_3.id_case(var2));
            double var5 = Math.signum(-var2.id_byte) * Math.acos(var3 / var2.id_case()) * 180.0F / (float)Math.PI;
            rba_3 var10000 = this.id_class;
            Float var12 = (float)var5;
            var10000.id_throws[16] = var12;
         }
      }

      if (var1 != null && this.id_class.id_implements(var1) <= 2.0F) {
         this.id_class.id_public(var1);
      } else if ((Float)this.id_class.id_throws[16] > 0.0F
         && rba_3.id_protected(this.id_class)
         && (float)this.id_class.rv().id_byte != 0.0F
         && ((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.Bs()).id_class(xu_3.Pq)) {
         rba_3 var15 = this.id_class;
         Float var13 = 60.0F;
         var15.id_throws[16] = var13;
         this.id_class.id_byte((iB_2)null);
         this.id_class.id_public(true);
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_synchronized(false);
      this.id_class.id_abstract = 0.0F;
      this.id_class.id_long = 0.0F;
      this.id_class.id_return(false);
      this.id_class.id_else(false);
   }

   @Override
   public boolean J_() {
      return false;
   }
}
