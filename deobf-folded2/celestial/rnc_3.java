package celestial;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class rnc_3 {
   private final Path id_class;
   private rnp_3 id_break;

   public rnc_3(rVm_1 var1, Path var2) {
      this.id_class = var2;
      this.id_break = rnp_3.id_class(var1, var2);
   }

   public rnc_3 id_class(UnaryOperator<rnp_3> var1) {
      (this.id_break = var1.apply(this.id_break)).id_break(this.id_class);
      return this;
   }

   public rnp_3 id_class() {
      return this.id_break;
   }

   public void id_break() {
      this.id_break.id_break(this.id_class);
   }
}
