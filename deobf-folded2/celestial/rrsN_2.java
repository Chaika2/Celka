package celestial;

import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsN_2 {
   public static final Codec<rrsN_2> id_class = rVL.rB.dispatch(rrsN_2::id_class, rrsA_2::id_class);
   protected final int id_break;
   protected final int id_byte;
   protected final int id_protected;

   public rrsN_2(int var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   protected static boolean id_class(rKH var0, Random var1, rfH_2 var2, Set<rfH_2> var3, rfi_3 var4, rDv_1 var5) {
      if (reS_2.id_throws(var0, var2)) {
         id_class(var0, var2, var5.id_break.id_class(var1, var2), var4);
         var3.add(var2.id_int());
         return true;
      } else {
         return false;
      }
   }

   protected static void id_class(rKH var0, Random var1, rfw_3 var2, Set<rfH_2> var3, rfi_3 var4, rDv_1 var5) {
      if (reS_2.id_byte(var0, var2)) {
         id_class(var0, var1, (rfH_2)var2, var3, var4, var5);
      }
   }

   protected static <P extends rrsN_2> P3<Mu<P>, Integer, Integer, Integer> id_class(Instance<P> var0) {
      return var0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter(var0x -> var0x.id_break),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(var0x -> var0x.id_byte),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(var0x -> var0x.id_protected)
      );
   }

   protected abstract rrsA_2<?> id_class();

   public abstract List<rrPY> id_class(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7);

   public int id_class(Random var1) {
      return this.id_break + var1.nextInt(this.id_byte + 1) + var1.nextInt(this.id_protected + 1);
   }

   protected static void id_class(rKH var0, rfH_2 var1) {
      if (!id_class((rKl_1)var0, var1)) {
         reS_2.id_break(var0, var1, xu_3.id_finally.id_continue());
      }
   }

   private static boolean id_class(rKl_1 var0, rfH_2 var1) {
      return var0.id_class(var1, var0x -> {
         xd_3 var1x = var0x.id_break();
         return rUO.id_break(var1x) && !var0x.id_class(xu_3.id_implements) && !var0x.id_class(xu_3.Bi);
      });
   }

   protected static void id_class(rRY var0, rfH_2 var1, xc_3 var2, rfi_3 var3) {
      reS_2.id_break(var0, var1, var2);
      var3.id_break(new rfi_3(var1, var1));
   }
}
