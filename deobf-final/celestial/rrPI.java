package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPI extends rrPR {
   public static final Codec<rrPI> class_ = RecordCodecBuilder.create(var0 -> break_(var0).apply(var0, rrPI::new));

   public rrPI(rUX var1, rUX var2) {
      super(var1, var2);
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return 0;
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 ? (var2 > 1 || var4 > 1) && var2 != 0 && var4 != 0 : var2 == var5 && var4 == var5 && var5 > 0;
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.protected_;
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      boolean var11 = var5.byte_();
      rfH_2 var12 = var5.class_().break_(var9);
      this.class_(var1, var2, var3, var12, var7 + var5.break_(), var8, -1 - var6, var11, var10);
      this.class_(var1, var2, var3, var12, var7 - 1, var8, -var6, var11, var10);
      this.class_(var1, var2, var3, var12, var7 + var5.break_() - 1, var8, 0, var11, var10);
   }
}
