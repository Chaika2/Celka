package celestial;

import java.util.Collection;
import java.util.function.Consumer;

public class rlp_3 {
   private final String class_;
   private final Collection<rlj_3> break_;
   private final Consumer<rrEm_1> byte_;

   public rlp_3(String var1, Collection<rlj_3> var2, Consumer<rrEm_1> var3) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.class_ = var1;
         this.break_ = var2;
         this.byte_ = var3;
      }
   }

   public void class_(rrEm_1 var1) {
      if (this.byte_ != null) {
         this.byte_.accept(var1);
      }
   }

   public String class_() {
      return this.class_;
   }

   public Collection<rlj_3> break_() {
      return this.break_;
   }
}
