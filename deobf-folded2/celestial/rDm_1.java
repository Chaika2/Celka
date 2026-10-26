package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDm_1 implements rUv_1 {
   public static final Codec<rDm_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("contents").forGetter(var0x -> var0x.id_break),
               xc_3.id_break.fieldOf("rim").forGetter(var0x -> var0x.id_byte),
               rUX.id_class(0, 8, 8).fieldOf("size").forGetter(var0x -> var0x.id_protected),
               rUX.id_class(0, 8, 8).fieldOf("rim_size").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, rDm_1::new)
   );
   private final xc_3 id_break;
   private final xc_3 id_byte;
   private final rUX id_protected;
   private final rUX id_throws;

   public rUX id_byte() {
      return this.id_protected;
   }

   public rDm_1(xc_3 var1, xc_3 var2, rUX var3, rUX var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public xc_3 id_class() {
      return this.id_break;
   }

   public xc_3 id_break() {
      return this.id_byte;
   }

   public rUX id_protected() {
      return this.id_throws;
   }
}
