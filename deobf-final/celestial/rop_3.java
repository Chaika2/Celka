package celestial;

import java.util.concurrent.Executor;

public class rop_3 implements roq_3 {
   private final roq_3 class_;
   private final rTh_1<Runnable> break_;

   public rop_3(roq_3 var1, Executor var2) {
      this.class_ = var1;
      this.break_ = rTh_1.class_(var2, "progressListener");
   }

   @Override
   public void class_() {
      this.break_.class_(this.class_::class_);
   }

   @Override
   public void class_(rfj_3 var1, roN_2 var2) {
      this.break_.class_(() -> this.class_.class_(var1, var2));
   }

   @Override
   public void class_(rfj_3 var1) {
      this.break_.class_(() -> this.class_.class_(var1));
   }
}
