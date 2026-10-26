package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrsG_2 implements rrSa_1 {
   public static final Codec<rrsG_2> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("top_material").forGetter(var0x -> var0x.id_break),
               xc_3.id_break.fieldOf("under_material").forGetter(var0x -> var0x.id_byte),
               xc_3.id_break.fieldOf("underwater_material").forGetter(var0x -> var0x.id_protected)
            )
            .apply(var0, rrsG_2::new)
   );
   private final xc_3 id_break;
   private final xc_3 id_byte;
   private final xc_3 id_protected;

   public xc_3 id_byte() {
      return this.id_protected;
   }

   public rrsG_2(xc_3 var1, xc_3 var2, xc_3 var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   @Override
   public xc_3 id_class() {
      return this.id_break;
   }

   @Override
   public xc_3 id_break() {
      return this.id_byte;
   }
}
