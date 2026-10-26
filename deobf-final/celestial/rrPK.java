package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPK extends rrPR {
   public static final Codec<rrPK> class_ = RecordCodecBuilder.create(
      var0 -> break_(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.break_)).apply(var0, rrPK::new)
   );
   protected final int break_;

   public rrPK(rUX var1, rUX var2, int var3) {
      super(var1, var2);
      this.break_ = var3;
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 >= 7 ? true : var2 * var2 + var4 * var4 > var5 * var5;
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.catch_;
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return this.break_;
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      int var11 = var5.byte_() ? var6 : 1 + var2.nextInt(2);

      for (int var12 = var9; var12 >= var9 - var11; var12--) {
         int var13 = var7 + var5.break_() + 1 - var12;
         this.class_(var1, var2, var3, var5.class_(), var13, var8, var12, var5.byte_(), var10);
      }
   }
}
