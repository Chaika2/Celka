package celestial;

import java.util.EnumSet;
import java.util.List;

class rMS extends rBk_1 {
   @Override
   public void byte_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rba_3.return_);
      if (!var1.isEmpty()) {
         this.class_.public_().class_((an_3)var1.get(0), 1.2F);
      }
   }

   public rMS(rba_3 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      if (!this.class_.class_(rXQ.MAINHAND).class_()) {
         return false;
      } else if (this.class_.I_() != null || this.class_.Sr() != null) {
         return false;
      } else if (!this.class_.sA()) {
         return false;
      } else if (this.class_.Sa().nextInt(10) != 0) {
         return false;
      } else {
         List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rba_3.return_);
         return !var1.isEmpty() && this.class_.class_(rXQ.MAINHAND).class_();
      }
   }

   @Override
   public void throws_() {
      List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(8.0, 8.0, 8.0), rba_3.return_);
      rdn_3 var2 = this.class_.class_(rXQ.MAINHAND);
      if (var2.class_() && !var1.isEmpty()) {
         this.class_.public_().class_((an_3)var1.get(0), 1.2F);
      }
   }
}
