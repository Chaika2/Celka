package celestial;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import javax.annotation.Nullable;

class cX_2 {
   private final Deque<uI_2> id_class = new ArrayDeque<>();

   public boolean id_class(int var1, int var2) {
      return this.id_class.isEmpty() || this.id_class.peek().id_class(var1, var2);
   }

   @Nullable
   public uI_2 id_class() {
      if (this.id_class.isEmpty()) {
         throw new IllegalStateException("Scissor stack underflow");
      } else {
         this.id_class.removeLast();
         return this.id_class.peekLast();
      }
   }

   public uI_2 id_class(uI_2 var1) {
      uI_2 var2 = this.id_class.peekLast();
      if (var2 != null) {
         uI_2 var3 = Objects.requireNonNullElse(var1.id_break(var2), uI_2.id_class());
         this.id_class.addLast(var3);
         return var3;
      } else {
         this.id_class.addLast(var1);
         return var1;
      }
   }
}
