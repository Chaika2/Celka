package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPK extends rrPR {
   public static final Codec<rrPK> id_class = RecordCodecBuilder.create(
      var0 -> id_break(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.id_break)).apply(var0, rrPK::new)
   );
   protected final int id_break;

   public rrPK(rUX var1, rUX var2, int var3) {
      super(var1, var2);
      this.id_break = var3;
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 >= 7 ? true : var2 * var2 + var4 * var4 > var5 * var5;
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_catch;
   }

   @Override
   public int id_class(Random var1, int var2, rDv_1 var3) {
      return this.id_break;
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      int var11 = var5.id_byte() ? var6 : 1 + var2.nextInt(2);

      for (int var12 = var9; var12 >= var9 - var11; var12--) {
         int var13 = var7 + var5.id_break() + 1 - var12;
         this.id_class(var1, var2, var3, var5.id_class(), var13, var8, var12, var5.id_byte(), var10);
      }
   }
}
