package celestial;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public abstract class rrPR {
   public static final Codec<rrPR> protected_ = rVL.rP.dispatch(rrPR::class_, rrPo_1::class_);
   protected final rUX throws_;
   protected final rUX case_;

   public rrPR(rUX var1, rUX var2) {
      this.throws_ = var1;
      this.case_ = var2;
   }

   private int class_(Random var1) {
      return this.case_.class_(var1);
   }

   protected abstract boolean class_(Random var1, int var2, int var3, int var4, int var5, boolean var6);

   public int class_(Random var1, int var2) {
      return this.throws_.class_(var1);
   }

   protected void class_(rKH var1, Random var2, rDv_1 var3, rfH_2 var4, int var5, Set<rfH_2> var6, int var7, boolean var8, rfi_3 var9) {
      int var10 = var8 ? 1 : 0;
      rfw_3 var11 = new rfw_3();

      for (int var12 = -var5; var12 <= var5 + var10; var12++) {
         for (int var13 = -var5; var13 <= var5 + var10; var13++) {
            if (!this.break_(var2, var12, var7, var13, var5, var8)) {
               var11.class_(var4, var12, var7, var13);
               if (reS_2.throws_(var1, var11)) {
                  var1.class_(var11, var3.byte_.class_(var2, var11), 19);
                  var9.break_(new rfi_3(var11, var11));
                  var6.add(var11.int_());
               }
            }
         }
      }
   }

   protected abstract rrPo_1<?> class_();

   public void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, rfi_3 var9) {
      this.class_(var1, var2, var3, var4, var5, var6, var7, var8, this.class_(var2), var9);
   }

   public abstract int class_(Random var1, int var2, rDv_1 var3);

   protected abstract void class_(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10);

   protected static <P extends rrPR> P2<Mu<P>, rUX, rUX> break_(Instance<P> var0) {
      return var0.group(
         rUX.class_(0, 8, 8).fieldOf("radius").forGetter(var0x -> var0x.throws_), rUX.class_(0, 8, 8).fieldOf("offset").forGetter(var0x -> var0x.case_)
      );
   }

   protected boolean break_(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7;
      int var8;
      if (var6) {
         var7 = Math.min(Math.abs(var2), Math.abs(var2 - 1));
         var8 = Math.min(Math.abs(var4), Math.abs(var4 - 1));
      } else {
         var7 = Math.abs(var2);
         var8 = Math.abs(var4);
      }

      return this.class_(var1, var7, var3, var8, var5, var6);
   }
}
