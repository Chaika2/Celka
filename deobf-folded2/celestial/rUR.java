package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUR implements rUv_1 {
   public static final Codec<rUR> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(xc_3.id_break.fieldOf("target").forGetter(var0x -> var0x.id_break), xc_3.id_break.fieldOf("state").forGetter(var0x -> var0x.id_byte))
            .apply(var0, rUR::new)
   );
   public final xc_3 id_break;
   public final xc_3 id_byte;

   public rUR(xc_3 var1, xc_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }
}
