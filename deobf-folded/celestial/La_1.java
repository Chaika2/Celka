package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class La_1 extends Lj_1<La_1> {
   final List<LZ> id_class;

   private La_1(List<LZ> var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.id_class.forEach(var5x -> {
         var5x.id_final = var3;
         var5x.id_class(var1, var7, var8, var10);
      });
   }

   public static La_1 id_class(Qw_1 var0, int var1, QF var2, QF var3) {
      LZ var4 = var2.id_class(var0, var1 / 2 - 155, 0, 150);
      return var3 == null ? new La_1(ImmutableList.of(var4)) : new La_1(ImmutableList.of(var4, var3.id_class(var0, var1 / 2 - 155 + 160, 0, 150)));
   }

   public static La_1 id_class(Qw_1 var0, int var1, QF var2) {
      return new La_1(ImmutableList.of(var2.id_class(var0, var1 / 2 - 155, 0, 310)));
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.id_class;
   }
}
