package celestial;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class rDM<WC extends rDX> {
   public static final Codec<rDM<?>> id_class = rVL.y.dispatch(var0 -> var0.id_protected, rDk_1::id_byte);
   public static final Codec<Supplier<rDM<?>>> id_break = rVA.id_class(rVL.Z, id_class);
   public static final Codec<List<Supplier<rDM<?>>>> id_byte = rVA.id_break(rVL.Z, id_class);
   private final rDk_1<WC> id_protected;
   private final WC id_throws;

   public rDM(rDk_1<WC> var1, WC var2) {
      this.id_protected = var1;
      this.id_throws = (WC)var2;
   }

   public boolean id_class(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9) {
      return this.id_protected.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, this.id_throws);
   }

   public WC id_class() {
      return this.id_throws;
   }

   public boolean id_class(Random var1, int var2, int var3) {
      return this.id_protected.id_class(var1, var2, var3, this.id_throws);
   }
}
