package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rjX_2 extends AbstractSpliterator<rjh_3> {
   final rfR_2 id_class;

   rjX_2(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.id_break = var4;
      this.id_byte = var5;
      this.id_protected = var6;
      this.id_throws = var7;
      this.id_case = var8;
      this.id_catch = var9;
      this.id_class = new rfR_2(this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }

   @Override
   public boolean tryAdvance(Consumer<? super rjh_3> var1) {
      if (this.id_class.id_class()) {
         var1.accept(new rjh_3(this.id_class.id_break(), this.id_class.id_byte(), this.id_class.id_protected()));
         return true;
      } else {
         return false;
      }
   }
}
