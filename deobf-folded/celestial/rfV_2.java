package celestial;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

class rfV_2 extends AbstractSpliterator<rfj_3> {
   private rfj_3 id_throws;

   rfV_2(long var1, int var3, rfj_3 var4, rfj_3 var5, int var6, int var7) {
      super(var1, var3);
      this.id_class = var4;
      this.id_break = var5;
      this.id_byte = var6;
      this.id_protected = var7;
   }

   @Override
   public boolean tryAdvance(Consumer<? super rfj_3> var1) {
      if (this.id_throws == null) {
         this.id_throws = this.id_class;
      } else {
         int var2 = this.id_throws.id_break;
         int var3 = this.id_throws.id_byte;
         if (var2 == this.id_break.id_break) {
            if (var3 == this.id_break.id_byte) {
               return false;
            }

            this.id_throws = new rfj_3(this.id_class.id_break, var3 + this.id_byte);
         } else {
            this.id_throws = new rfj_3(var2 + this.id_protected, var3);
         }
      }

      var1.accept(this.id_throws);
      return true;
   }
}
