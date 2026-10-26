package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

class Ne_1 implements Na_1 {
   private final int class_;
   private final Set<NK> break_ = Sets.newIdentityHashSet();

   @Override
   public int byte_() {
      return this.class_;
   }

   public Ne_1(int var1) {
      this.class_ = var1;
   }

   @Override
   public NK class_() {
      if (this.break_.size() >= this.class_) {
         return null;
      } else {
         NK var1 = NK.class_();
         if (var1 != null) {
            this.break_.add(var1);
         }

         return var1;
      }
   }

   @Override
   public boolean class_(NK var1) {
      if (!this.break_.remove(var1)) {
         return false;
      } else {
         var1.break_();
         return true;
      }
   }

   @Override
   public void break_() {
      this.break_.forEach(NK::break_);
      this.break_.clear();
   }

   @Override
   public int protected_() {
      return this.break_.size();
   }
}
