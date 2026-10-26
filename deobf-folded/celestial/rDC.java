package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDC implements rUv_1 {
   public static final Codec<rDC> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("target").forGetter(var0x -> var0x.id_break),
               xc_3.id_break.fieldOf("state").forGetter(var0x -> var0x.id_byte),
               rUX.id_class.fieldOf("radius").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rDC::new)
   );
   public final xc_3 id_break;
   public final xc_3 id_byte;
   private final rUX id_protected;

   public rDC(xc_3 var1, xc_3 var2, rUX var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public rUX id_class() {
      return this.id_protected;
   }
}
