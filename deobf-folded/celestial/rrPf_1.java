package celestial;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public class rrPf_1 extends rrPR {
   public static final Codec<rrPf_1> id_class = RecordCodecBuilder.create(var0 -> id_class(var0).apply(var0, rrPf_1::new));
   protected final int id_break;

   public rrPf_1(rUX var1, rUX var2, int var3) {
      super(var1, var2);
      this.id_break = var3;
   }

   protected static <P extends rrPf_1> P3<Mu<P>, rUX, rUX, Integer> id_class(Instance<P> var0) {
      return id_break(var0).and(Codec.intRange(0, 16).fieldOf("height").forGetter(var0x -> var0x.id_break));
   }

   @Override
   protected boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && (var1.nextInt(2) == 0 || var3 == 0);
   }

   @Override
   public int id_class(Random var1, int var2, rDv_1 var3) {
      return this.id_break;
   }

   @Override
   protected void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10) {
      for (int var11 = var9; var11 >= var9 - var6; var11--) {
         int var12 = Math.max(var7 + var5.id_break() - 1 - var11 / 2, 0);
         this.id_class(var1, var2, var3, var5.id_class(), var12, var8, var11, var5.id_byte(), var10);
      }
   }

   @Override
   protected rrPo_1<?> id_class() {
      return rrPo_1.id_class;
   }
}
