package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class reB_2 extends rDQ {
   public static final Codec<reB_2> id_byte = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.id_protected),
               Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter(var0x -> var0x.id_throws),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.id_case),
               Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter(var0x -> var0x.id_catch),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.id_private),
               id_class()
            )
            .apply(var0, reB_2::new)
   );
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final int id_private;

   public reB_2(int var1, int var2, int var3, int var4, int var5, OptionalInt var6) {
      super(var6);
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
   }

   @Override
   public int id_class(int var1, int var2) {
      if (var2 < this.id_protected) {
         return this.id_case;
      } else {
         return var2 >= var1 - this.id_throws ? this.id_private : this.id_catch;
      }
   }

   @Override
   protected rUh_1<?> id_break() {
      return rUh_1.id_break;
   }
}
