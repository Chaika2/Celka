package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rDt_1 implements rUv_1 {
   public static final Codec<rDt_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("to_place").forGetter(var0x -> var0x.id_break),
               xc_3.id_break.listOf().fieldOf("place_on").forGetter(var0x -> var0x.id_byte),
               xc_3.id_break.listOf().fieldOf("place_in").forGetter(var0x -> var0x.id_protected),
               xc_3.id_break.listOf().fieldOf("place_under").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rDt_1::new)
   );
   public final xc_3 id_break;
   public final List<xc_3> id_byte;
   public final List<xc_3> id_protected;
   public final List<xc_3> id_throws;

   public rDt_1(xc_3 var1, List<xc_3> var2, List<xc_3> var3, List<xc_3> var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }
}
