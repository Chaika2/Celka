package celestial;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public class rrPf_1 extends rrPR {
   public static final Codec<rrPf_1> class_ = RecordCodecBuilder.create(var0 -> class_(var0).apply(var0, rrPf_1::new));
   protected final int break_;

   public rrPf_1(rUX var1, rUX var2, int var3) {
      super(var1, var2);
      this.break_ = var3;
   }

   protected static <P extends rrPf_1> P3<Mu<P>, rUX, rUX, Integer> class_(Instance<P> var0) {
      return break_(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.break_));
   }

   @Override
   protected boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && (var1.nextInt(2) == 0 || var3 == 0);
   }

   @Override
   public int class_(Random var1, int var2, rDv_1 var3) {
      return this.break_;
   }

   @Override
   protected void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      for (int var11 = var9; var11 >= var9 - var6; var11--) {
         int var12 = Math.max(var7 + var5.break_() - 1 - var11 / 2, 0);
         this.class_(var1, var2, var3, var5.class_(), var12, var8, var11, var5.byte_(), var10);
      }
   }

   @Override
   protected rrPo_1<?> class_() {
      return rrPo_1.class_;
   }
}
