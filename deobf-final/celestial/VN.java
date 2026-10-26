package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class VN extends QF {
   protected BiConsumer<Qw_1, Integer> rF;
   protected BiFunction<Qw_1, VN, rgP_2> rL;

   public VN(String var1, BiConsumer<Qw_1, Integer> var2, BiFunction<Qw_1, VN, rgP_2> var3) {
      super(var1);
      this.rF = var2;
      this.rL = var3;
   }

   public rgP_2 class_(Qw_1 var1) {
      return this.rL.apply(var1, this);
   }

   @Override
   public LZ class_(Qw_1 var1, int var2, int var3, int var4) {
      return new Vc_1(this, var2, var3, var4, 20, this, this.class_(var1), var2x -> {
         this.class_(var1, 1);
         var2x.break_(this.class_(var1));
      });
   }

   public void class_(Qw_1 var1, int var2) {
      this.rF.accept(var1, var2);
      var1.break_();
   }
}
