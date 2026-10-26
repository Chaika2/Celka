package celestial;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsN_2 {
   public static final Codec<rrsN_2> class_ = rVL.rB.dispatch(rrsN_2::class_, rrsA_2::class_);
   protected final int break_;
   protected final int byte_;
   protected final int protected_;

   public rrsN_2(int var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   protected static boolean class_(rKH var0, Random var1, rfH_2 var2, Set<rfH_2> var3, rfi_3 var4, rDv_1 var5) {
      if (reS_2.throws_(var0, var2)) {
         class_(var0, var2, var5.break_.class_(var1, var2), var4);
         var3.add(var2.int_());
         return true;
      } else {
         return false;
      }
   }

   protected static void class_(rKH var0, Random var1, rfw_3 var2, Set<rfH_2> var3, rfi_3 var4, rDv_1 var5) {
      if (reS_2.byte_(var0, var2)) {
         class_(var0, var1, (rfH_2)var2, var3, var4, var5);
      }
   }

   protected static <P extends rrsN_2> P3<Mu<P>, Integer, Integer, Integer> class_(Instance<P> var0) {
      return var0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter(var0x -> var0x.break_),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(var0x -> var0x.byte_),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(var0x -> var0x.protected_)
      );
   }

   protected abstract rrsA_2<?> class_();

   public abstract List<rrPY> class_(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7);

   public int class_(Random var1) {
      return this.break_ + var1.nextInt(this.byte_ + 1) + var1.nextInt(this.protected_ + 1);
   }

   protected static void class_(rKH var0, rfH_2 var1) {
      if (!class_((rKl_1)var0, var1)) {
         reS_2.break_(var0, var1, xu_3.finally_.continue_());
      }
   }

   private static boolean class_(rKl_1 var0, rfH_2 var1) {
      return var0.class_(var1, var0x -> {
         xd_3 var1x = var0x.break_();
         return rUO.break_(var1x) && !var0x.class_(xu_3.implements_) && !var0x.class_(xu_3.Bi);
      });
   }

   protected static void class_(rRY var0, rfH_2 var1, xc_3 var2, rfi_3 var3) {
      reS_2.break_(var0, var1, var2);
      var3.break_(new rfi_3(var1, var1));
   }
}
