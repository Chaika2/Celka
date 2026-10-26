package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrPh_1 extends rrPA {
   public static final Codec<rrPh_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKv_1.field_236078_g_.fieldOf("heightmap").orElse(rKv_1.WORLD_SURFACE_WG).forGetter(var0x -> var0x.break_),
               Codec.INT.fieldOf("offset").orElse(0).forGetter(var0x -> var0x.byte_)
            )
            .apply(var0, rrPh_1::new)
   );
   private final rKv_1 break_;
   private final int byte_;

   public rrPh_1(rKv_1 var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public rrPp_1 class_(rRR var1, rfH_2 var2, rfH_2 var3, rrPp_1 var4, rrPp_1 var5, rrPN var6) {
      rKv_1 var7;
      if (var1 instanceof rrEm_1) {
         if (this.break_ == rKv_1.WORLD_SURFACE_WG) {
            var7 = rKv_1.WORLD_SURFACE;
         } else if (this.break_ == rKv_1.OCEAN_FLOOR_WG) {
            var7 = rKv_1.OCEAN_FLOOR;
         } else {
            var7 = this.break_;
         }
      } else {
         var7 = this.break_;
      }

      int var8 = var1.class_(var7, var5.class_.b_(), var5.class_.d_()) + this.byte_;
      int var9 = var4.class_.c_();
      return new rrPp_1(new rfH_2(var5.class_.b_(), var8 + var9, var5.class_.d_()), var5.break_, var5.byte_);
   }

   @Override
   protected rrPx_1<?> class_() {
      return rrPx_1.byte_;
   }
}
