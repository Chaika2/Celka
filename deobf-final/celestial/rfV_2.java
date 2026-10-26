package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rfV_2 extends AbstractSpliterator<rfj_3> {
   private rfj_3 throws_;

   rfV_2(long var1, int var3, rfj_3 var4, rfj_3 var5, int var6, int var7) {
      super(var1, var3);
      this.class_ = var4;
      this.break_ = var5;
      this.byte_ = var6;
      this.protected_ = var7;
   }

   @Override
   public boolean tryAdvance(Consumer<? super rfj_3> var1) {
      if (this.throws_ == null) {
         this.throws_ = this.class_;
      } else {
         int var2 = this.throws_.break_;
         int var3 = this.throws_.byte_;
         if (var2 == this.break_.break_) {
            if (var3 == this.break_.byte_) {
               return false;
            }

            this.throws_ = new rfj_3(this.class_.break_, var3 + this.byte_);
         } else {
            this.throws_ = new rfj_3(var2 + this.protected_, var3);
         }
      }

      var1.accept(this.throws_);
      return true;
   }
}
