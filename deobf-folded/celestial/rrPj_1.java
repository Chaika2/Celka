package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPj_1 extends rrPf_1 {
   public static final Codec<rrPj_1> id_byte = RecordCodecBuilder.create(var0 -> id_class(var0).apply(var0, rrPj_1::new));

   public rrPj_1(rUX var1, rUX var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      for (int var11 = var9; var11 >= var9 - var6; var11--) {
         int var12 = var7 + var5.id_break() - 1 - var11;
         this.id_class(var1, var2, var3, var5.id_class(), var12, var8, var11, var5.id_byte(), var10);
      }
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_throws;
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var1.nextInt(2) == 0;
   }
}
