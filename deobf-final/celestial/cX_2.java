package celestial;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import javax.annotation.Nullable;

class cX_2 {
   private final Deque<uI_2> class_ = new ArrayDeque<>();

   public boolean class_(int var1, int var2) {
      return this.class_.isEmpty() || this.class_.peek().class_(var1, var2);
   }

   @Nullable
   public uI_2 class_() {
      if (this.class_.isEmpty()) {
         throw new IllegalStateException("Scissor stack underflow");
      } else {
         this.class_.removeLast();
         return this.class_.peekLast();
      }
   }

   public uI_2 class_(uI_2 var1) {
      uI_2 var2 = this.class_.peekLast();
      if (var2 != null) {
         uI_2 var3 = Objects.requireNonNullElse(var1.break_(var2), uI_2.class_());
         this.class_.addLast(var3);
         return var3;
      } else {
         this.class_.addLast(var1);
         return var1;
      }
   }
}
