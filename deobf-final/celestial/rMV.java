package celestial;

import java.util.EnumSet;
import java.util.List;

class rMV extends rBk_1 {
   private int break_;

   @Override
   public void byte_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rMl_1.import_);
      if (!var1.isEmpty() && this.class_.class_(rXQ.MAINHAND).class_()) {
         this.class_.public_().class_((an_3)var1.get(0), 1.2F);
      } else if (!this.class_.class_(rXQ.MAINHAND).class_()) {
         this.class_.sg();
      }

      this.break_ = 0;
   }

   public rMV(rMl_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (this.break_ <= (Integer)this.class_.throws_[41] && !this.class_.n_() && !this.class_.rT() && this.class_.sy() && this.class_.L() <= 0) {
         List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(6.0, 6.0, 6.0), rMl_1.import_);
         return !var1.isEmpty() || !this.class_.class_(rXQ.MAINHAND).class_();
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      return !this.class_.rT() && (this.class_.sL() || rMl_1.implements_(this.class_).nextInt(600) != 1)
         ? rMl_1.finally_(this.class_).nextInt(2000) != 1
         : false;
   }

   @Override
   public void throws_() {
      if (!this.class_.sJ() && !this.class_.class_(rXQ.MAINHAND).class_()) {
         this.class_.sg();
      }
   }

   @Override
   public void protected_() {
      rdn_3 var1 = this.class_.class_(rXQ.MAINHAND);
      if (!var1.class_()) {
         this.class_.a_(var1);
         this.class_.class_(rXQ.MAINHAND, rdn_3.break_);
         int var2 = this.class_.sL() ? rMl_1.extends_(this.class_).nextInt(50) + 10 : rMl_1.native_(this.class_).nextInt(150) + 10;
         this.break_ = (Integer)this.class_.throws_[41] + var2 * 20;
      }

      this.class_.this_(false);
   }
}
