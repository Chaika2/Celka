package celestial;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class In_1 implements Consumer<Iq_1> {
   protected final Function<rqO_2, HU> id_synchronized;
   public int id_return = 64;
   public int id_public = 32;

   public In_1(Function<rqO_2, HU> var1) {
      this.id_synchronized = var1;
   }

   public abstract void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8);

   public final HU id_class(rqO_2 var1) {
      HU var2 = this.id_synchronized.apply(var1);
      if (rrbY_2.id_case() && var2.id_abstract()) {
         var2 = HU.id_byte(var1);
      }

      return var2;
   }

   public void a_(Iq_1 var1) {
   }
}
