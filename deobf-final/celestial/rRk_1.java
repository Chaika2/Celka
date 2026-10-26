package celestial;

import java.util.Optional;

public class rRk_1 extends rRQ {
   private final an_3 class_;

   public rRk_1(an_3 var1) {
      this.class_ = var1;
   }

   @Override
   public boolean class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return this.class_.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public Optional<Float> class_(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5) {
      return super.class_(var1, var2, var3, var4, var5).map(var6 -> this.class_.class_(var1, var2, var3, var4, var5, var6));
   }
}
