package celestial;

import java.util.Random;

public class rhn_3 extends rhV_2 {
   public rhn_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.I, var2, var4, var6, var1);
   }

   public rhn_3(rYB var1, iB_2 var2) {
      super(aI_2.I, var2, var1);
   }

   public rhn_3(aI_2<? extends rhn_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (((Random)this.id_throws[40]).nextInt(8) == 0) {
            byte var2 = 1;
            if (((Random)this.id_throws[40]).nextInt(32) == 0) {
               var2 = 4;
            }

            for (int var3 = 0; var3 < var2; var3++) {
               rbR_2 var4 = aI_2.id_finally.id_class((rYB)this.id_throws[7]);
               var4.e_(-24000);
               var4.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], 0.0F);
               ((rYB)this.id_throws[7]).a_(var4);
            }
         }

         ((rYB)this.id_throws[7]).id_class(this, (byte)3);
         this.PD();
      }
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      var1.id_class().id_break(rye_3.id_break(this, this.id_else()), 0.0F);
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 3) {
         double var2 = 0.08;

         for (int var4 = 0; var4 < 8; var4++) {
            ((rYB)this.id_throws[7])
               .id_class(
                  new rLk_1(rLQ.id_void, this.id_class()),
                  this.rx(),
                  this.re(),
                  this.BO(),
                  ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08,
                  ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08,
                  ((double)((Random)this.id_throws[40]).nextFloat() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected rdb_3 id_protected() {
      return rdy_3.XJ;
   }
}
