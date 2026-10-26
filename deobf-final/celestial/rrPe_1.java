package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPe_1 extends rrPR {
   public static final Codec<rrPe_1> class_ = RecordCodecBuilder.create(
      var0 -> break_(var0).and(rUX.class_(0, 16, 8).fieldOf("trunk_height").forGetter(var0x -> var0x.break_)).apply(var0, rrPe_1::new)
   );
   private final rUX break_;

   public rrPe_1(rUX var1, rUX var2, rUX var3) {
      super(var1, var2);
      this.break_ = var3;
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.break_;
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return Math.max(4, var2 - this.break_.class_(var1));
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      rfH_2 var11 = var5.class_();
      int var12 = var2.nextInt(2);
      int var13 = 1;
      byte var14 = 0;

      for (int var15 = var9; var15 >= -var6; var15--) {
         this.class_(var1, var2, var3, var11, var12, var8, var15, var5.byte_(), var10);
         if (var12 >= var13) {
            var12 = var14;
            var14 = 1;
            var13 = Math.min(var13 + 1, var7 + var5.break_());
         } else {
            var12++;
         }
      }
   }
}
