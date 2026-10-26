package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rUa_1 implements rUv_1 {
   public static final Codec<rUa_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("state").forGetter(var0x -> var0x.id_break),
               rUX.id_class(0, 4, 4).fieldOf("radius").forGetter(var0x -> var0x.id_byte),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(var0x -> var0x.id_protected),
               xc_3.id_break.listOf().fieldOf("targets").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rUa_1::new)
   );
   public final xc_3 id_break;
   public final rUX id_byte;
   public final int id_protected;
   public final List<xc_3> id_throws;

   public rUa_1(xc_3 var1, rUX var2, int var3, List<xc_3> var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }
}
