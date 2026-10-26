package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rSI extends rSp_1 {
   private static final Logger id_break = LogManager.getLogger();
   private int id_byte;
   private rLC id_protected;
   private rjU_2 id_throws;
   private iB_2 id_case;
   private boolean id_catch;

   @Override
   public void id_byte() {
      this.id_byte = 0;
      this.id_throws = null;
      this.id_protected = null;
      this.id_case = null;
   }

   public rSI(rSu_1 var1) {
      super(var1);
   }

   public void id_class(iB_2 var1) {
      this.id_case = var1;
      int var2 = this.id_class.id_catch();
      int var3 = this.id_class.id_continue(this.id_case.rx(), this.id_case.re(), this.id_case.BO());
      int var4 = rfU_2.id_byte(this.id_case.rx());
      int var5 = rfU_2.id_byte(this.id_case.BO());
      double var6 = (double)var4 - this.id_class.rx();
      double var8 = (double)var5 - this.id_class.BO();
      double var10 = (double)rfU_2.id_class(var6 * var6 + var8 * var8);
      double var12 = Math.min(0.4F + var10 / 80.0 - 1.0, 10.0);
      int var14 = rfU_2.id_byte(this.id_case.re() + var12);
      rLq_1 var15 = new rLq_1(var4, var14, var5);
      this.id_protected = this.id_class.id_class(var2, var3, var15);
      if (this.id_protected != null) {
         this.id_protected.id_class();
         this.id_extends();
      }
   }

   @Override
   public void id_break() {
      if (this.id_case == null) {
         id_break.warn("Skipping player strafe phase because no player was found");
         this.id_class.L().id_class(rST.id_class);
      } else {
         if (this.id_protected != null && this.id_protected.id_byte()) {
            double var1 = this.id_case.rx();
            double var3 = this.id_case.BO();
            double var5 = var1 - this.id_class.rx();
            double var7 = var3 - this.id_class.BO();
            double var9 = (double)rfU_2.id_class(var5 * var5 + var7 * var7);
            double var11 = Math.min(0.4F + var9 / 80.0 - 1.0, 10.0);
            this.id_throws = new rjU_2(var1, this.id_case.re() + var11, var3);
         }

         double var25 = this.id_throws == null ? 0.0 : this.id_throws.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
         if (var25 < 100.0 || var25 > 22500.0) {
            this.id_finally();
         }

         double var26 = 64.0;
         if (this.id_case.id_int(this.id_class) < 4096.0) {
            if (this.id_class.id_while(this.id_case)) {
               this.id_byte++;
               rjU_2 var27 = new rjU_2(this.id_case.rx() - this.id_class.rx(), 0.0, this.id_case.BO() - this.id_class.BO()).id_protected();
               rjU_2 var6 = new rjU_2(
                     (double)rfU_2.id_class((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)(-rfU_2.id_break((Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0)))
                  )
                  .id_protected();
               float var28 = (float)var6.id_break(var27);
               float var8 = (float)(Math.acos((double)var28) * 180.0F / (float)Math.PI);
               var8 += 0.5F;
               if (this.id_byte >= 5 && var8 >= 0.0F && var8 < 10.0F) {
                  double var30 = 1.0;
                  rjU_2 var31 = this.id_class.id_break(1.0F);
                  double var12 = this.id_class.id_super.rx() - var31.id_break * 1.0;
                  double var14 = this.id_class.id_super.id_byte(0.5) + 0.5;
                  double var16 = this.id_class.id_super.BO() - var31.id_protected * 1.0;
                  double var18 = this.id_case.rx() - var12;
                  double var20 = this.id_case.id_byte(0.5) - var14;
                  double var22 = this.id_case.BO() - var16;
                  if (!this.id_class.BF()) {
                     ((rYB)this.id_class.id_throws[7]).id_class((rhd_3)null, 1017, this.id_class.Bs(), 0);
                  }

                  rhA_2 var24 = new rhA_2((rYB)this.id_class.id_throws[7], this.id_class, var18, var20, var22);
                  var24.id_class(var12, var14, var16, 0.0F, 0.0F);
                  ((rYB)this.id_class.id_throws[7]).a_(var24);
                  this.id_byte = 0;
                  if (this.id_protected != null) {
                     while (!this.id_protected.id_byte()) {
                        this.id_protected.id_class();
                     }
                  }

                  this.id_class.L().id_class(rST.id_class);
               }
            } else if (this.id_byte > 0) {
               this.id_byte--;
            }
         } else if (this.id_byte > 0) {
            this.id_byte--;
         }
      }
   }

   private void id_finally() {
      if (this.id_protected == null || this.id_protected.id_byte()) {
         int var1 = this.id_class.id_catch();
         int var2 = var1;
         if (this.id_class.Sa().nextInt(8) == 0) {
            this.id_catch = !this.id_catch;
            var2 = var1 + 6;
         }

         if (this.id_catch) {
            var2++;
         } else {
            var2--;
         }

         if (this.id_class.n() != null && this.id_class.n().id_byte() > 0) {
            var2 %= 12;
            if (var2 < 0) {
               var2 += 12;
            }
         } else {
            var2 -= 12;
            var2 &= 7;
            var2 += 12;
         }

         this.id_protected = this.id_class.id_class(var1, var2, (rLq_1)null);
         if (this.id_protected != null) {
            this.id_protected.id_class();
         }
      }

      this.id_extends();
   }

   private void id_extends() {
      if (this.id_protected != null && !this.id_protected.id_byte()) {
         rfH_2 var1 = this.id_protected.id_catch();
         this.id_protected.id_class();
         double var2 = (double)var1.b_();
         double var4 = (double)var1.d_();

         double var6;
         do {
            var6 = (double)((float)var1.c_() + this.id_class.Sa().nextFloat() * 20.0F);
         } while (var6 < (double)var1.c_());

         this.id_throws = new rjU_2(var2, var6, var4);
      }
   }

   @Override
   public rjU_2 id_case() {
      return this.id_throws;
   }

   @Override
   public rST<rSI> id_protected() {
      return rST.id_break;
   }
}
