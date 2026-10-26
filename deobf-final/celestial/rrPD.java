package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPD extends rrPR {
   public static final Codec<rrPD> class_ = RecordCodecBuilder.create(
      var0 -> break_(var0).and(rUX.class_(0, 16, 8).fieldOf("crown_height").forGetter(var0x -> var0x.break_)).apply(var0, rrPD::new)
   );
   private final rUX break_;

   public rrPD(rUX var1, rUX var2, rUX var3) {
      super(var1, var2);
      this.break_ = var3;
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 >= 7 ? true : var2 * var2 + var4 * var4 > var5 * var5;
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.private_;
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return this.break_.class_(var1);
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      rfH_2 var11 = var5.class_();
      int var12 = 0;

      for (int var13 = var11.c_() - var6 + var9; var13 <= var11.c_() + var9; var13++) {
         int var14 = var11.c_() - var13;
         int var15 = var7 + var5.break_() + rfU_2.protected_((float)var14 / (float)var6 * 3.5F);
         int var16;
         if (var14 > 0 && var15 == var12 && (var13 & 1) == 0) {
            var16 = var15 + 1;
         } else {
            var16 = var15;
         }

         this.class_(var1, var2, var3, new rfH_2(var11.b_(), var13, var11.d_()), var16, var8, 0, var5.byte_(), var10);
         var12 = var15;
      }
   }
}
