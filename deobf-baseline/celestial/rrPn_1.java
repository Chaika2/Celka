package celestial;

import java.util.List;

public class rrPn_1 {
   private final List<rrPA> id_class;

   public rrPn_1(List<rrPA> var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "ProcessorList[" + this.id_class + "]";
   }

   public List<rrPA> id_class() {
      return this.id_class;
   }
}
