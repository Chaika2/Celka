package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPU extends rrPR {
   public static final Codec<rrPU> id_class = RecordCodecBuilder.create(
      var0 -> id_break(var0).and(rUX.id_class(0, 16, 8).fieldOf("height").forGetter(var0x -> var0x.id_break)).apply(var0, rrPU::new)
   );
   private final rUX id_break;

   public rrPU(rUX var1, rUX var2, rUX var3) {
      super(var1, var2);
      this.id_break = var3;
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   public int id_class(Random var1, int var2, rDv_1 var3) {
      return this.id_break.id_class(var1);
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_byte;
   }

   @Override
   public int id_class(Random var1, int var2) {
      return super.id_class(var1, var2) + var1.nextInt(var2 + 1);
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      int var11 = 0;

      for (int var12 = var9; var12 >= var9 - var6; var12--) {
         this.id_class(var1, var2, var3, var5.id_class(), var11, var8, var12, var5.id_byte(), var10);
         if (var11 >= 1 && var12 == var9 - var6 + 1) {
            var11--;
         } else if (var11 < var7 + var5.id_break()) {
            var11++;
         }
      }
   }
}
