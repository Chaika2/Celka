package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class rBq_1<T extends rEB> extends rBk_1 {
   private final T class_;

   public rBq_1(T var1) {
      this.class_ = (T)var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   private void class_(rrEr_1 var1) {
      if (var1.this_()) {
         HashSet var2 = Sets.newHashSet();
         List var3 = ((rYB)this.class_.throws_[7]).class_(rEB.class, this.class_.rN().class_(16.0), var1x -> !var1x.sd() && rrEs_1.class_(var1x, var1));
         var2.addAll(var3);

         for (rEB var5 : var2) {
            var1.class_(var1.implements_(), var5, (rfH_2)null, true);
         }
      }
   }

   @Override
   public boolean class_() {
      return this.class_.I_() == null
         && !this.class_.BP()
         && this.class_.sd()
         && !this.class_.sx().class_()
         && !((rrEm_1)((rYB)this.class_.throws_[7])).throw_(this.class_.Bs());
   }

   @Override
   public boolean break_() {
      return this.class_.sd()
         && !this.class_.sx().class_()
         && (rYB)this.class_.throws_[7] instanceof rrEm_1
         && !((rrEm_1)((rYB)this.class_.throws_[7])).throw_(this.class_.Bs());
   }

   @Override
   public void throws_() {
      if (this.class_.sd()) {
         rrEr_1 var1 = this.class_.sx();
         if ((Integer)this.class_.throws_[41] % 20 == 0) {
            this.class_(var1);
         }

         if (!this.class_.catch_()) {
            rjU_2 var2 = iX_2.break_(this.class_, 15, 4, rjU_2.protected_(var1.continue_()));
            if (var2 != null) {
               this.class_.public_().class_(var2.break_, var2.byte_, var2.protected_, 1.0);
            }
         }
      }
   }
}
