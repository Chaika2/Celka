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
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         if (((Random)this.throws_[40]).nextInt(8) == 0) {
            byte var2 = 1;
            if (((Random)this.throws_[40]).nextInt(32) == 0) {
               var2 = 4;
            }

            for (int var3 = 0; var3 < var2; var3++) {
               rbR_2 var4 = aI_2.finally_.class_((rYB)this.throws_[7]);
               var4.e_(-24000);
               var4.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], 0.0F);
               ((rYB)this.throws_[7]).a_(var4);
            }
         }

         ((rYB)this.throws_[7]).class_(this, (byte)3);
         this.PD();
      }
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      var1.class_().break_(rye_3.break_(this, this.else_()), 0.0F);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 3) {
         double var2 = 0.08;

         for (int var4 = 0; var4 < 8; var4++) {
            ((rYB)this.throws_[7])
               .class_(
                  new rLk_1(rLQ.void_, this.class_()),
                  this.rx(),
                  this.re(),
                  this.BO(),
                  ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.08,
                  ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.08,
                  ((double)((Random)this.throws_[40]).nextFloat() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected rdb_3 protected_() {
      return rdy_3.XJ;
   }
}
