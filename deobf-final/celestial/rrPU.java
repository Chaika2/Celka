package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPU extends rrPR {
   public static final Codec<rrPU> class_ = RecordCodecBuilder.create(
      var0 -> break_(var0).and(rUX.class_(0, 16, 8).fieldOf("height").forGetter(var0x -> var0x.break_)).apply(var0, rrPU::new)
   );
   private final rUX break_;

   public rrPU(rUX var1, rUX var2, rUX var3) {
      super(var1, var2);
      this.break_ = var3;
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return this.break_.class_(var1);
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.byte_;
   }

   @Override
   public int class_(Random var1, int var2) {
      return super.class_(var1, var2) + var1.nextInt(var2 + 1);
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      int var11 = 0;

      for (int var12 = var9; var12 >= var9 - var6; var12--) {
         this.class_(var1, var2, var3, var5.class_(), var11, var8, var12, var5.byte_(), var10);
         if (var11 >= 1 && var12 == var9 - var6 + 1) {
            var11--;
         } else if (var11 < var7 + var5.break_()) {
            var11++;
         }
      }
   }
}
