package celestial;

import java.util.Collections;
import java.util.List;

public class NY {
   private final List<Nq_1> id_class;
   private final boolean id_break;
   private final String id_byte;

   public String id_byte() {
      return this.id_byte;
   }

   public NY(List<Nq_1> var1, boolean var2, String var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public NY(Nq_1 var1, boolean var2, String var3) {
      this.id_class = Collections.singletonList(var1);
      this.id_break = var2;
      this.id_byte = var3;
   }

   public List<Nq_1> id_class() {
      return this.id_class;
   }

   public boolean id_break() {
      return this.id_break;
   }
}
