package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPV extends rrPR {
   public static final Codec<rrPV> class_ = RecordCodecBuilder.create(var0 -> break_(var0).apply(var0, rrPV::new));

   public rrPV(rUX var1, rUX var2) {
      super(var1, var2);
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && !var6) {
         return var2 == var5 && var4 == var5;
      } else {
         return var3 == 1 ? var2 + var4 > var5 * 2 - 2 : false;
      }
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.implements_;
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return 4;
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      rfH_2 var11 = var5.class_().break_(var9);
      boolean var12 = var5.byte_();
      if (var12) {
         this.class_(var1, var2, var3, var11, var7 + 2, var8, -1, var12, var10);
         this.class_(var1, var2, var3, var11, var7 + 3, var8, 0, var12, var10);
         this.class_(var1, var2, var3, var11, var7 + 2, var8, 1, var12, var10);
         if (var2.nextBoolean()) {
            this.class_(var1, var2, var3, var11, var7, var8, 2, var12, var10);
         }
      } else {
         this.class_(var1, var2, var3, var11, var7 + 2, var8, -1, var12, var10);
         this.class_(var1, var2, var3, var11, var7 + 1, var8, 0, var12, var10);
      }
   }

   @Override
   protected boolean break_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 && var6 && (var2 == -var5 || var2 >= var5) && (var4 == -var5 || var4 >= var5) ? true : super.break_(var1, var2, var3, var4, var5, var6);
   }
}
