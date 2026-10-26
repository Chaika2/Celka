package celestial;

import java.util.Collection;
import java.util.function.Consumer;

public class rlp_3 {
   private final String id_class;
   private final Collection<rlj_3> id_break;
   private final Consumer<rrEm_1> id_byte;

   public rlp_3(String var1, Collection<rlj_3> var2, Consumer<rrEm_1> var3) {
      if (var2.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.id_class = var1;
         this.id_break = var2;
         this.id_byte = var3;
      }
   }

   public void id_class(rrEm_1 var1) {
      if (this.id_byte != null) {
         this.id_byte.accept(var1);
      }
   }

   public String id_class() {
      return this.id_class;
   }

   public Collection<rlj_3> id_break() {
      return this.id_break;
   }
}
