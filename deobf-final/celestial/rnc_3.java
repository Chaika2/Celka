package celestial;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class rnc_3 {
   private final Path class_;
   private rnp_3 break_;

   public rnc_3(rVm_1 var1, Path var2) {
      this.class_ = var2;
      this.break_ = rnp_3.class_(var1, var2);
   }

   public rnc_3 class_(UnaryOperator<rnp_3> var1) {
      (this.break_ = var1.apply(this.break_)).break_(this.class_);
      return this;
   }

   public rnp_3 class_() {
      return this.break_;
   }

   public void break_() {
      this.break_.break_(this.class_);
   }
}
