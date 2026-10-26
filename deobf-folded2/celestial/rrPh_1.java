package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrPh_1 extends rrPA {
   public static final Codec<rrPh_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKv_1.field_236078_g_.fieldOf("heightmap").orElse(rKv_1.WORLD_SURFACE_WG).forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("offset").orElse(0).forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rrPh_1::new)
   );
   private final rKv_1 id_break;
   private final int id_byte;

   public rrPh_1(rKv_1 var1, int var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public rrPp_1 id_class(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      rKv_1 var7;
      if (var1 instanceof rrEm_1) {
         if (this.id_break == rKv_1.WORLD_SURFACE_WG) {
            var7 = rKv_1.WORLD_SURFACE;
         } else if (this.id_break == rKv_1.OCEAN_FLOOR_WG) {
            var7 = rKv_1.OCEAN_FLOOR;
         } else {
            var7 = this.id_break;
         }
      } else {
         var7 = this.id_break;
      }

      int var8 = var1.id_class(var7, var5.id_class.b_(), var5.id_class.d_()) + this.id_byte;
      int var9 = var4.id_class.c_();
      return new rrPp_1(new rfH_2(var5.id_class.b_(), var8 + var9, var5.id_class.d_()), var5.id_break, var5.id_byte);
   }

   @Override
   protected rrPx_1<?> id_class() {
      return rrPx_1.id_byte;
   }
}
