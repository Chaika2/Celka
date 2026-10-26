package celestial;

import java.util.Iterator;

public class rrWg_1 implements Iterator<String> {
   private int id_break;

   public rrWg_1(rrWV var1) {
      this.id_class = var1;
   }

   @Override
   public boolean hasNext() {
      return this.id_break < this.id_class.id_class.size();
   }

   public String id_class() {
      String var1 = this.id_class.id_class.get(this.id_break);
      this.id_break++;
      return var1;
   }
}
