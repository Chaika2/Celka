package celestial;

import java.util.EnumSet;

class rEq_1 extends rBk_1 {
   private final rEy_1 class_;

   public rEq_1(rEy_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean class_() {
      return true;
   }

   @Override
   public void throws_() {
      if (this.class_.I_() == null) {
         rjU_2 var1 = this.class_.rv();
         rEy_1 var10000 = this.class_;
         Float var10 = -((float)rfU_2.protected_(var1.break_, var1.protected_)) * (180.0F / (float)Math.PI);
         var10000.throws_[15] = var10;
         var10000 = this.class_;
         Float var11 = (Float)this.class_.throws_[15];
         var10000.private_[23] = var11;
      } else {
         iB_2 var14 = this.class_.I_();
         if (var14.int_(this.class_) < 4096.0) {
            double var2 = var14.rx() - this.class_.rx();
            double var4 = var14.BO() - this.class_.BO();
            rEy_1 var16 = this.class_;
            Float var12 = -((float)rfU_2.protected_(var2, var4)) * (180.0F / (float)Math.PI);
            var16.throws_[15] = var12;
            var16 = this.class_;
            Float var13 = (Float)this.class_.throws_[15];
            var16.private_[23] = var13;
         }
      }
   }
}
