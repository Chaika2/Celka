package celestial;

import java.util.List;

public class rhA_2 extends rhL_2 {
   public rhA_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.int_, var2, var3, var5, var7, var1);
   }

   public rhA_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.int_, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhA_2(aI_2<? extends rhA_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void class_(rjG_2 var1) {
      super.class_(var1);
      an_3 var2 = this.else_();
      if ((var1.byte_() != rjM_2.ENTITY || !((rfo_3)var1).class_().continue_(var2)) && !((rYB)this.throws_[7]).continue_) {
         List var3 = ((rYB)this.throws_[7]).class_(iB_2.class, this.rN().byte_(4.0, 2.0, 4.0));
         aZ_2 var4 = new aZ_2((rYB)this.throws_[7], this.rx(), this.re(), this.BO());
         if (var2 instanceof iB_2) {
            var4.class_((iB_2)var2);
         }

         var4.class_(rLQ.implements_);
         var4.byte_(3.0F);
         var4.break_(600);
         var4.catch_((7.0F - var4.protected_()) / (float)var4.private_());
         var4.class_(new rLY(rLD.catch_, 1, 1));
         if (!var3.isEmpty()) {
            for (iB_2 var6 : var3) {
               double var7 = this.int_(var6);
               if (var7 < 16.0) {
                  var4.new_(var6.rx(), var6.re(), var6.BO());
                  break;
               }
            }
         }

         ((rYB)this.throws_[7]).byte_(2006, this.Bs(), this.BF() ? -1 : 1);
         ((rYB)this.throws_[7]).a_(var4);
         this.PD();
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return false;
   }

   @Override
   protected boolean throws_() {
      return false;
   }

   @Override
   protected rLx_1 case_() {
      return rLQ.implements_;
   }

   @Override
   public boolean rY() {
      return false;
   }
}
