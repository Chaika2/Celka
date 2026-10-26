package celestial;

import java.util.Random;
import java.util.Set;

public abstract class rrr_3<E extends iB_2> {
   private static final Random class_ = new Random();
   private static final ay_3 break_ = new ay_3().class_(16.0).break_().protected_();
   private static final ay_3 byte_ = new ay_3().class_(16.0).break_().protected_().throws_();
   private final int protected_;
   private long throws_;

   public rrr_3(int var1) {
      this.protected_ = var1;
      this.throws_ = (long)class_.nextInt(var1);
   }

   public rrr_3() {
      this(20);
   }

   protected abstract void class_(rrEm_1 var1, E var2);

   public abstract Set<il_3<?>> class_();

   protected static boolean class_(iB_2 var0, iB_2 var1) {
      return var0.SF().break_(il_3.package_, var1) ? byte_.class_(var0, var1) : break_.class_(var0, var1);
   }

   public final void break_(rrEm_1 var1, E var2) {
      if (--this.throws_ <= 0L) {
         this.throws_ = (long)this.protected_;
         this.class_(var1, (E)var2);
      }
   }
}
