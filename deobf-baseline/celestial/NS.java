package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class NS {
   public static final Codec<NS> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqA_2.id_class.fieldOf("sound").forGetter(var0x -> var0x.id_break),
               Codec.INT.fieldOf("min_delay").forGetter(var0x -> var0x.id_byte),
               Codec.INT.fieldOf("max_delay").forGetter(var0x -> var0x.id_protected),
               Codec.BOOL.fieldOf("replace_current_music").forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, NS::new)
   );
   private final rqA_2 id_break;
   private final int id_byte;
   private final int id_protected;
   private final boolean id_throws;

   public int id_byte() {
      return this.id_protected;
   }

   public NS(rqA_2 var1, int var2, int var3, boolean var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public rqA_2 id_class() {
      return this.id_break;
   }

   public int id_break() {
      return this.id_byte;
   }

   public boolean id_protected() {
      return this.id_throws;
   }
}
