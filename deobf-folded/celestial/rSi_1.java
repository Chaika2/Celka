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
   public void id_this() {
      an_3 var1 = this.id_else();
      if (var1 instanceof rhd_3 && !var1.BM()) {
         this.PD();
      } else {
         super.id_this();
      }
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_finally()
         .id_class(rrnh_3.id_class((rrnX_2)rrnX_2.staticFields1e73a3d9163a3242ac9ccbcc36d981ca[2]));
      an_3 var2 = this.id_else();

      for (int var3 = 0; var3 < 32; var3++) {
         ((rYB)this.id_throws[7])
            .id_class(
               rLQ.id_transient,
               this.rx(),
               this.re() + ((Random)this.id_throws[40]).nextDouble() * 2.0,
               this.BO(),
               ((Random)this.id_throws[40]).nextGaussian(),
               0.0,
               ((Random)this.id_throws[40]).nextGaussian()
            );
      }

      if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)this.id_throws[27]) {
         if (var2 instanceof rhN_2 var11) {
            if (var11.id_class.id_class().id_case() && (rYB)var11.id_throws[7] == (rYB)this.id_throws[7] && !var11.Sc()) {
               if (((Random)this.id_throws[40]).nextFloat() < 0.05F && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_protected)) {
                  rEL var4 = aI_2.id_synchronized.id_class((rYB)this.id_throws[7]);
                  var4.id_this(true);
                  var4.id_class(var2.rx(), var2.re(), var2.BO(), (Float)var2.id_throws[15], (Float)var2.id_throws[16]);
                  ((rYB)this.id_throws[7]).a_(var4);
               }

               if (var2.Pm()) {
                  var2.BH();
               }

               var2.id_case(this.rx(), this.re(), this.BO());
               Float var9 = 0.0F;
               var2.id_throws[31] = var9;
               var2.id_break(rye_3.id_extends, 5.0F);
            }
         } else if (var2 != null) {
            var2.id_case(this.rx(), this.re(), this.BO());
            Float var10 = 0.0F;
            var2.id_throws[31] = var10;
         }

         this.PD();
      }
   }

   @Override
   public an_3 id_class(rrEm_1 var1) {
      an_3 var2 = this.id_else();
      if (var2 != null && ((rYB)var2.id_throws[7]).E() != var1.E()) {
         this.id_break((an_3)null);
      }

      return super.id_class(var1);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      var1.id_class().id_break(rye_3.id_break(this, this.id_else()), 0.0F);
   }

   @Override
   protected rdb_3 id_protected() {
      return rdy_3.Jm;
   }
}
