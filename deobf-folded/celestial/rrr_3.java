package celestial;

import java.util.Random;
import java.util.Set;

public abstract class rrr_3<E extends iB_2> {
   private static final Random id_class = new Random();
   private static final ay_3 id_break = new ay_3().id_class(16.0).id_break().id_protected();
   private static final ay_3 id_byte = new ay_3().id_class(16.0).id_break().id_protected().id_throws();
   private final int id_protected;
   private long id_throws;

   public rrr_3(int var1) {
      this.id_protected = var1;
      this.id_throws = (long)id_class.nextInt(var1);
   }

   public rrr_3() {
      this(20);
   }

   protected abstract void id_class(rrEm_1 var1, E var2);

   public abstract Set<il_3<?>> id_class();

   protected static boolean id_class(iB_2 var0, iB_2 var1) {
      return var0.SF().id_break(il_3.id_package, var1) ? id_byte.id_class(var0, var1) : id_break.id_class(var0, var1);
   }

   public final void id_break(rrEm_1 var1, E var2) {
      if (--this.id_throws <= 0L) {
         this.id_throws = (long)this.id_protected;
         this.id_class(var1, (E)var2);
      }
   }
}
