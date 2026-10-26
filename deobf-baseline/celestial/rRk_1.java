package celestial;

import java.util.Optional;

public class rRk_1 extends rRQ {
   private final an_3 id_class;

   public rRk_1(an_3 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return this.id_class.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public Optional<Float> id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5) {
      return super.id_class(var1, var2, var3, var4, var5).map(var6 -> this.id_class.id_class(var1, var2, var3, var4, var5, var6));
   }
}
