package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPz_1 extends rrPc_1 {
   public static final Codec<rrPz_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.id_throws),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.id_case)
            )
            .apply(var0, rrPz_1::new)
   );
   private final float id_break;
   private final float id_protected;
   private final int id_throws;
   private final int id_case;

   public rrPz_1(float var1, float var2, int var3, int var4) {
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.id_break = var1;
         this.id_protected = var2;
         this.id_throws = var3;
         this.id_case = var4;
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, rfH_2 var2, rfH_2 var3, Random var4) {
      int var5 = var2.id_implements(var3);
      float var6 = var4.nextFloat();
      return (double)var6
         <= rfU_2.id_break((double)this.id_break, (double)this.id_protected, rfU_2.id_byte((double)var5, (double)this.id_throws, (double)this.id_case));
   }

   @Override
   protected rrPX<?> id_class() {
      return rrPX.id_break;
   }
}
