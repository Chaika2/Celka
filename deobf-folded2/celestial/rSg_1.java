package celestial;

import java.util.List;
import java.util.Random;

public class rSg_1 extends an_3 {
   private int id_break;
   public long id_class;
   private int id_protected;
   private boolean id_catch;
   private rhN_2 id_private;

   public rSg_1(aI_2<? extends rSg_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[56] = var7;
      this.id_break = 2;
      this.id_class = ((Random)this.id_throws[40]).nextLong();
      this.id_protected = ((Random)this.id_throws[40]).nextInt(3) + 1;
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_break == 2) {
         rRO var1 = ((rYB)this.id_throws[7]).id_abstract();
         if (var1 == rRO.NORMAL || var1 == rRO.HARD) {
            this.id_class(4);
         }

         ((rYB)this.id_throws[7])
            .id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GO, rqL_2.WEATHER, 10000.0F, 0.8F + ((Random)this.id_throws[40]).nextFloat() * 0.2F);
         ((rYB)this.id_throws[7])
            .id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.GM, rqL_2.WEATHER, 2.0F, 0.5F + ((Random)this.id_throws[40]).nextFloat() * 0.2F);
      }

      this.id_break--;
      if (this.id_break < 0) {
         if (this.id_protected == 0) {
            this.PD();
         } else if (this.id_break < -((Random)this.id_throws[40]).nextInt(10)) {
            this.id_protected--;
            this.id_break = 1;
            this.id_class = ((Random)this.id_throws[40]).nextLong();
            this.id_class(0);
         }
      }

      if (this.id_break >= 0) {
         if (!((rYB)this.id_throws[7] instanceof rrEm_1)) {
            ((rYB)this.id_throws[7]).id_byte(2);
         } else if (!this.id_catch) {
            double var6 = 3.0;
            List var3 = ((rYB)this.id_throws[7])
               .id_break(this, new rfl_3(this.rx() - 3.0, this.re() - 3.0, this.BO() - 3.0, this.rx() + 3.0, this.re() + 6.0 + 3.0, this.BO() + 3.0), an_3::BM);

            for (an_3 var5 : var3) {
               var5.id_class((rrEm_1)((rYB)this.id_throws[7]), this);
            }

            if (this.id_private != null) {
               Oo_1.id_char.id_class(this.id_private, var3);
            }
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
   }

   private void id_class(int var1) {
      if (!this.id_catch && !((rYB)this.id_throws[7]).id_continue && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_class)) {
         rfH_2 var2 = this.Bs();
         xc_3 var3 = Jj_1.id_class((rYB)this.id_throws[7], var2);
         if (((rYB)this.id_throws[7]).id_byte(var2).id_catch() && var3.id_class((rRR)((rYB)this.id_throws[7]), var2)) {
            ((rYB)this.id_throws[7]).id_break(var2, var3);
         }

         for (int var4 = 0; var4 < var1; var4++) {
            rfH_2 var5 = var2.id_break(
               ((Random)this.id_throws[40]).nextInt(3) - 1, ((Random)this.id_throws[40]).nextInt(3) - 1, ((Random)this.id_throws[40]).nextInt(3) - 1
            );
            var3 = Jj_1.id_class((rYB)this.id_throws[7], var5);
            if (((rYB)this.id_throws[7]).id_byte(var5).id_catch() && var3.id_class((rRR)((rYB)this.id_throws[7]), var5)) {
               ((rYB)this.id_throws[7]).id_break(var5, var3);
            }
         }
      }
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void id_class(boolean var1) {
      this.id_catch = var1;
   }

   @Override
   protected void id_break(rcd_3 var1) {
   }

   public void id_protected(rhN_2 var1) {
      this.id_private = var1;
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.WEATHER;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
