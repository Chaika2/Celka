package celestial;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class In_1 implements Consumer<Iq_1> {
   protected final Function<rqO_2, HU> synchronized_;
   public int return_ = 64;
   public int public_ = 32;

   public In_1(Function<rqO_2, HU> var1) {
      this.synchronized_ = var1;
   }

   public abstract void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8);

   public final HU class_(rqO_2 var1) {
      HU var2 = this.synchronized_.apply(var1);
      if (rrbY_2.case_() && var2.abstract_()) {
         var2 = HU.byte_(var1);
      }

      return var2;
   }

   public void a_(Iq_1 var1) {
   }
}
