package celestial;

import java.util.EnumSet;
import java.util.List;

public class rEG<T extends rEB> extends rBk_1 {
   private final T class_;

   public rEG(T var1, rEB var2) {
      this.class_ = (T)var2;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      rrEr_1 var1 = this.class_.sx();
      if (this.class_.sd() && !this.class_.sx().class_() && this.class_.su() && !rdn_3.break_(this.class_.class_(rXQ.HEAD), rrEr_1.new_())) {
         rEB var2 = var1.class_(this.class_.sk());
         if (var2 == null || !var2.BM()) {
            List var3 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(16.0, 8.0, 16.0), rEB.protected_);
            if (!var3.isEmpty()) {
               return this.class_.public_().class_((an_3)var3.get(0), 1.15F);
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void throws_() {
      if (this.class_.public_().catch_().class_(this.class_.Ps(), 1.414)) {
         List var1 = ((rYB)this.class_.throws_[7]).class_(rsE_2.class, this.class_.rN().byte_(4.0, 4.0, 4.0), rEB.protected_);
         if (!var1.isEmpty()) {
            this.class_.break_((rsE_2)var1.get(0));
         }
      }
   }
}
