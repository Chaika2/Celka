package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rjX_2 extends AbstractSpliterator<rjh_3> {
   final rfR_2 class_;

   rjX_2(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.break_ = var4;
      this.byte_ = var5;
      this.protected_ = var6;
      this.throws_ = var7;
      this.case_ = var8;
      this.catch_ = var9;
      this.class_ = new rfR_2(this.break_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }

   @Override
   public boolean tryAdvance(Consumer<? super rjh_3> var1) {
      if (this.class_.class_()) {
         var1.accept(new rjh_3(this.class_.break_(), this.class_.byte_(), this.class_.protected_()));
         return true;
      } else {
         return false;
      }
   }
}
