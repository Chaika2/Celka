package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPg_1 extends rrPf_1 {
   public static final Codec<rrPg_1> id_byte = RecordCodecBuilder.create(var0 -> id_class(var0).apply(var0, rrPg_1::new));

   public rrPg_1(rUX var1, rUX var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      for (int var11 = var9; var11 >= var9 - var6; var11--) {
         int var12 = var7 + (var11 != var9 && var11 != var9 - var6 ? 1 : 0);
         this.id_class(var1, var2, var3, var5.id_class(), var12, var8, var11, var5.id_byte(), var10);
      }
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_case;
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return rfU_2.id_extends((float)var2 + 0.5F) + rfU_2.id_extends((float)var4 + 0.5F) > (float)(var5 * var5);
   }
}
