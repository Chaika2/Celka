package celestial;

import java.util.concurrent.Executor;

public class rop_3 implements roq_3 {
   private final roq_3 id_class;
   private final rTh_1<Runnable> id_break;

   public rop_3(roq_3 var1, Executor var2) {
      this.id_class = var1;
      this.id_break = rTh_1.id_class(var2, "progressListener");
   }

   @Override
   public void id_class() {
      this.id_break.id_class(this.id_class::id_class);
   }

   @Override
   public void id_class(rfj_3 var1, roN_2 var2) {
      this.id_break.id_class(() -> this.id_class.id_class(var1, var2));
   }

   @Override
   public void id_class(rfj_3 var1) {
      this.id_break.id_class(() -> this.id_class.id_class(var1));
   }
}
