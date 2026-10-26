package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPV extends rrPR {
   public static final Codec<rrPV> id_class = RecordCodecBuilder.create(var0 -> id_break(var0).apply(var0, rrPV::new));

   public rrPV(rUX var1, rUX var2) {
      super(var1, var2);
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && !var6) {
         return var2 == var5 && var4 == var5;
      } else {
         return var3 == 1 ? var2 + var4 > var5 * 2 - 2 : false;
      }
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_implements;
   }

   @Override
   public int id_class(Random var1, int var2, rDv_1 var3) {
      return 4;
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      rfH_2 var11 = var5.id_class().id_break(var9);
      boolean var12 = var5.id_byte();
      if (var12) {
         this.id_class(var1, var2, var3, var11, var7 + 2, var8, -1, var12, var10);
         this.id_class(var1, var2, var3, var11, var7 + 3, var8, 0, var12, var10);
         this.id_class(var1, var2, var3, var11, var7 + 2, var8, 1, var12, var10);
         if (var2.nextBoolean()) {
            this.id_class(var1, var2, var3, var11, var7, var8, 2, var12, var10);
         }
      } else {
         this.id_class(var1, var2, var3, var11, var7 + 2, var8, -1, var12, var10);
         this.id_class(var1, var2, var3, var11, var7 + 1, var8, 0, var12, var10);
      }
   }

   @Override
   protected boolean id_break(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 && var6 && (var2 == -var5 || var2 >= var5) && (var4 == -var5 || var4 >= var5)
         ? true
         : super.id_break(var1, var2, var3, var4, var5, var6);
   }
}
