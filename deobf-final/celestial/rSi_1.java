package celestial;

import java.util.Random;

public class rSi_1 extends rhV_2 {
   public rSi_1(rYB var1, double var2, double var4, double var6) {
      super(aI_2.f, var2, var4, var6, var1);
   }

   public rSi_1(rYB var1, iB_2 var2) {
      super(aI_2.f, var2, var1);
   }

   public rSi_1(aI_2<? extends rSi_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      an_3 var1 = this.else_();
      if (var1 instanceof rhd_3 && !var1.BM()) {
         this.PD();
      } else {
         super.this_();
      }
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .finally_()
         .class_(rrnh_3.class_((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[2]));
      an_3 var2 = this.else_();

      for (int var3 = 0; var3 < 32; var3++) {
         ((rYB)this.throws_[7])
            .class_(
               rLQ.transient_,
               this.rx(),
               this.re() + ((Random)this.throws_[40]).nextDouble() * 2.0,
               this.BO(),
               ((Random)this.throws_[40]).nextGaussian(),
               0.0,
               ((Random)this.throws_[40]).nextGaussian()
            );
      }

      if (!((rYB)this.throws_[7]).continue_ && !(Boolean)this.throws_[27]) {
         if (var2 instanceof rhN_2 var11) {
            if (var11.class_.class_().case_() && (rYB)var11.throws_[7] == (rYB)this.throws_[7] && !var11.Sc()) {
               if (((Random)this.throws_[40]).nextFloat() < 0.05F && ((rYB)this.throws_[7]).B().break_(rRu_1.protected_)) {
                  rEL var4 = aI_2.synchronized_.class_((rYB)this.throws_[7]);
                  var4.this_(true);
                  var4.class_(var2.rx(), var2.re(), var2.BO(), (Float)var2.throws_[15], (Float)var2.throws_[16]);
                  ((rYB)this.throws_[7]).a_(var4);
               }

               if (var2.Pm()) {
                  var2.BH();
               }

               var2.case_(this.rx(), this.re(), this.BO());
               Float var9 = 0.0F;
               var2.throws_[31] = var9;
               var2.break_(rye_3.extends_, 5.0F);
            }
         } else if (var2 != null) {
            var2.case_(this.rx(), this.re(), this.BO());
            Float var10 = 0.0F;
            var2.throws_[31] = var10;
         }

         this.PD();
      }
   }

   @Override
   public an_3 class_(rrEm_1 var1) {
      an_3 var2 = this.else_();
      if (var2 != null && ((rYB)var2.throws_[7]).E() != var1.E()) {
         this.break_((an_3)null);
      }

      return super.class_(var1);
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      var1.class_().break_(rye_3.break_(this, this.else_()), 0.0F);
   }

   @Override
   protected rdb_3 protected_() {
      return rdy_3.Jm;
   }
}
