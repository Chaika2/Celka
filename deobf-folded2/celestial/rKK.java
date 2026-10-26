package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rKK extends rKY {
   public static final Codec<rKK> id_break = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("min_size").forGetter(var0x -> var0x.id_byte), Codec.INT.fieldOf("extra_size").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rKK::new)
   );
   private final int id_byte;
   private final int id_protected;

   public rKK(int var1, int var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   protected rKo_1<?> id_class() {
      return rKo_1.id_byte;
   }

   @Override
   public void id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, Random var4) {
      rfw_3 var5 = var2.id_new();
      int var6 = this.id_byte + var4.nextInt(var4.nextInt(this.id_protected + 1) + 1);

      for (int var7 = 0; var7 < var6; var7++) {
         var1.id_class(var5, var3, 2);
         var5.id_class(rpr_3.UP);
      }
   }
}
