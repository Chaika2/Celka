package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.concurrent.atomic.AtomicInteger;

public class xc_3 extends JC implements rrGf_1 {
   public static final Codec<xc_3> id_break = id_class(rVL.id_strictfp, xd_3::id_continue).stable();
   private int id_throws = -1;
   private int id_case = -1;
   private rqO_2 id_catch;
   private int id_private = -1;
   private static final AtomicInteger id_implements = new AtomicInteger(0);

   @Override
   protected xc_3 id_int() {
      return this;
   }

   public xc_3(xd_3 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<xc_3> var3) {
      super(var1, var2, var3);
   }

   public rqO_2 id_this() {
      if (this.id_catch == null) {
         this.id_catch = rVL.id_strictfp.id_break(this.id_break());
      }

      return this.id_catch;
   }

   public int id_continue() {
      if (this.id_throws < 0) {
         this.id_throws = rVL.id_strictfp.id_class(this.id_break());
      }

      return this.id_throws;
   }

   public int id_continue(rRq_1 var1, rfH_2 var2) {
      return this.id_case();
   }

   public int id_else() {
      if (this.id_private < 0) {
         this.id_private = id_implements.incrementAndGet();
      }

      return this.id_private;
   }

   public boolean id_return() {
      return this.id_class != null && this.id_class.id_protected;
   }

   public int id_super() {
      if (this.id_case < 0) {
         this.id_case = rrWP.id_class(this);
         if (this.id_case < 0) {
            rrbb_3.id_protected("Metadata not found, block: " + this.id_this());
            this.id_case = 0;
         }
      }

      return this.id_case;
   }

   public boolean id_synchronized() {
      return this.id_class != null && this.id_class.id_class;
   }
}
