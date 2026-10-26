package celestial;

import java.util.Random;

public class rPa_1 extends rBp_1 {
   private final xd_3 id_catch;
   private final is_3 id_private;
   private int id_implements;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_implements = 0;
   }

   public rPa_1(xd_3 var1, aA_2 var2, double var3, int var5) {
      super(var2, var3, 24, var5);
      this.id_catch = var1;
      this.id_private = var2;
   }

   public void id_class(rRg_1 var1, rfH_2 var2) {
   }

   public void id_class(rYB var1, rfH_2 var2) {
   }

   private rfH_2 id_class(rfH_2 var1, rRq_1 var2) {
      if (var2.id_byte(var1).id_class(this.id_catch)) {
         return var1;
      } else {
         rfH_2[] var3 = new rfH_2[]{var1.id_break(), var1.id_byte(), var1.id_extends(), var1.id_private(), var1.id_protected(), var1.id_break().id_break()};

         for (rfH_2 var7 : var3) {
            if (var2.id_byte(var7).id_class(this.id_catch)) {
               return var7;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      roC_2 var3 = var1.id_class(var2.b_() >> 4, var2.d_() >> 4, roN_2.id_volatile, false);
      return var3 == null
         ? false
         : var3.id_byte(var2).id_class(this.id_catch) && var3.id_byte(var2.id_final()).id_catch() && var3.id_byte(var2.id_break(2)).id_catch();
   }

   @Override
   public boolean id_class() {
      if (!((rYB)this.id_private.id_throws[7]).B().id_break(rRu_1.id_break)) {
         return false;
      } else if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else if (this.id_final()) {
         this.id_byte = 20;
         return true;
      } else {
         this.id_byte = this.id_class(this.id_class);
         return false;
      }
   }

   @Override
   public void id_throws() {
      super.id_throws();
      rYB var1 = (rYB)this.id_private.id_throws[7];
      rfH_2 var2 = this.id_private.Bs();
      rfH_2 var3 = this.id_class(var2, var1);
      Random var4 = this.id_private.Sa();
      if (this.id_native() && var3 != null) {
         if (this.id_implements > 0) {
            rjU_2 var5 = this.id_private.rv();
            this.id_private.id_catch(var5.id_break, 0.3, var5.id_protected);
            if (!var1.id_continue) {
               double var6 = 0.08;
               ((rrEm_1)var1)
                  .id_class(
                     new rLk_1(rLQ.id_void, new rdn_3(rdy_3.XJ)),
                     (double)var3.b_() + 0.5,
                     (double)var3.c_() + 0.7,
                     (double)var3.d_() + 0.5,
                     3,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     ((double)var4.nextFloat() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.id_implements % 2 == 0) {
            rjU_2 var12 = this.id_private.rv();
            this.id_private.id_catch(var12.id_break, -0.3, var12.id_protected);
            if (this.id_implements % 6 == 0) {
               this.id_class((rRg_1)var1, this.id_throws);
            }
         }

         if (this.id_implements > 60) {
            var1.id_class(var3, false);
            if (!var1.id_continue) {
               for (int var13 = 0; var13 < 20; var13++) {
                  double var14 = var4.nextGaussian() * 0.02;
                  double var8 = var4.nextGaussian() * 0.02;
                  double var10 = var4.nextGaussian() * 0.02;
                  ((rrEm_1)var1).id_class(rLQ.id_boolean, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, 1, var14, var8, var10, 0.15F);
               }

               this.id_class(var1, var3);
            }
         }

         this.id_implements++;
      }
   }

   @Override
   public void id_protected() {
      super.id_protected();
      is_3 var10000 = this.id_private;
      Float var5 = 1.0F;
      var10000.id_throws[31] = var5;
   }

   private boolean id_final() {
      return this.id_throws != null && this.id_class((rRR)((rYB)this.id_class.id_throws[7]), this.id_throws) ? true : this.id_volatile();
   }
}
