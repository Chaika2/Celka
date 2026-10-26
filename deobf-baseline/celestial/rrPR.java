package celestial;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public abstract class rrPR {
   public static final Codec<rrPR> id_protected = rVL.rP.dispatch(rrPR::id_class, rrPo_1::id_class);
   protected final rUX id_throws;
   protected final rUX id_case;

   public rrPR(rUX var1, rUX var2) {
      this.id_throws = var1;
      this.id_case = var2;
   }

   private int id_class(Random var1) {
      return this.id_case.id_class(var1);
   }

   protected abstract boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6);

   public int id_class(Random var1, int var2) {
      return this.id_throws.id_class(var1);
   }

   protected void id_class(rKH var1, Random var2, rDv_1 var3, rfH_2 var4, int var5, Set<rfH_2> var6, int var7, boolean var8, rfi_3 var9) {
      int var10 = var8 ? 1 : 0;
      rfw_3 var11 = new rfw_3();

      for (int var12 = -var5; var12 <= var5 + var10; var12++) {
         for (int var13 = -var5; var13 <= var5 + var10; var13++) {
            if (!this.id_break(var2, var12, var7, var13, var5, var8)) {
               var11.id_class(var4, var12, var7, var13);
               if (reS_2.id_throws(var1, var11)) {
                  var1.id_class(var11, var3.id_byte.id_class(var2, var11), 19);
                  var9.id_break(new rfi_3(var11, var11));
                  var6.add(var11.id_int());
               }
            }
         }
      }
   }

   protected abstract rrPo_1<?> id_class();

   public void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, rfi_3 var9) {
      this.id_class(var1, var2, var3, var4, var5, var6, var7, var8, this.id_class(var2), var9);
   }

   public abstract int id_class(Random var1, int var2, rDv_1 var3);

   protected abstract void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10);

   protected static <P extends rrPR> P2<Mu<P>, rUX, rUX> id_break(Instance<P> var0) {
      return var0.group(
         rUX.id_class(0, 8, 8).fieldOf("radius").forGetter(var0x -> var0x.id_throws), rUX.id_class(0, 8, 8).fieldOf("offset").forGetter(var0x -> var0x.id_case)
      );
   }

   protected boolean id_break(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7;
      int var8;
      if (var6) {
         var7 = Math.min(Math.abs(var2), Math.abs(var2 - 1));
         var8 = Math.min(Math.abs(var4), Math.abs(var4 - 1));
      } else {
         var7 = Math.abs(var2);
         var8 = Math.abs(var4);
      }

      return this.id_class(var1, var7, var3, var8, var5, var6);
   }
}
