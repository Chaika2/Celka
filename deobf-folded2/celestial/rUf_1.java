package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUf_1 implements rUv_1 {
   public static final Codec<rUf_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrPL.id_byte.fieldOf("target").forGetter(var0x -> var0x.id_break),
               xc_3.id_break.fieldOf("state").forGetter(var0x -> var0x.id_protected),
               Codec.intRange(0, 64).fieldOf("size").forGetter(var0x -> var0x.id_byte)
            )
            .apply(var0, rUf_1::new)
   );
   public final rrPL id_break;
   public final int id_byte;
   public final xc_3 id_protected;

   public rUf_1(rrPL var1, xc_3 var2, int var3) {
      this.id_byte = var3;
      this.id_protected = var2;
      this.id_break = var1;
   }
}
