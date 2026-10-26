package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPZ extends rrPL {
   public static final Codec<rrPZ> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("block_state").forGetter(var0x -> var0x.id_break),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrPZ::new)
   );
   private final xc_3 id_break;
   private final float id_protected;

   public rrPZ(xc_3 var1, float var2) {
      this.id_break = var1;
      this.id_protected = var2;
   }

   @Override
   public boolean id_class(xc_3 var1, Random var2) {
      return var1 == this.id_break && var2.nextFloat() < this.id_protected;
   }

   @Override
   protected rrPJ<?> id_class() {
      return rrPJ.id_case;
   }
}
