package celestial;

import com.google.common.primitives.Doubles;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class yN_2 implements Comparable<yN_2> {
   protected final double id_class;
   protected final AtomicBoolean id_break = new AtomicBoolean(false);
   protected Map<rfH_2, rrGq_1> id_byte;

   public yN_2(yQ_2 var1, rfj_3 var2, double var3) {
      this.id_class = var3;
      if (var2 == null) {
         this.id_byte = Collections.emptyMap();
      } else {
         this.id_byte = rrGy_1.id_class((gm_3)QY.id_instanceof().id_class[56], var2);
      }
   }

   public int id_class(yN_2 var1) {
      return Doubles.compare(this.id_class, var1.id_class);
   }

   public rrGq_1 id_class(rfH_2 var1) {
      return this.id_byte.getOrDefault(var1, rrGp_1.id_class);
   }

   public abstract CompletableFuture<ym_3> id_class(Hv_1 var1);

   public abstract void id_class();
}
