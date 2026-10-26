package celestial;

import com.google.common.primitives.Doubles;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class yN_2 implements Comparable<yN_2> {
   protected final double class_;
   protected final AtomicBoolean break_ = new AtomicBoolean(false);
   protected Map<rfH_2, rrGq_1> byte_;

   public yN_2(yQ_2 var1, rfj_3 var2, double var3) {
      this.class_ = var3;
      if (var2 == null) {
         this.byte_ = Collections.emptyMap();
      } else {
         this.byte_ = rrGy_1.class_((gm_3)QY.instanceof_().class_[56], var2);
      }
   }

   public int class_(yN_2 var1) {
      return Doubles.compare(this.class_, var1.class_);
   }

   public rrGq_1 class_(rfH_2 var1) {
      return this.byte_.getOrDefault(var1, rrGp_1.class_);
   }

   public abstract CompletableFuture<ym_3> class_(Hv_1 var1);

   public abstract void class_();
}
