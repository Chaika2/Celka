package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class reb_3 extends rDQ {
   public static final Codec<reb_3> id_byte = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.id_protected),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.id_throws),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.id_case),
               id_class()
            )
            .apply(var0, reb_3::new)
   );
   private final int id_protected;
   private final int id_throws;
   private final int id_case;

   public reb_3(int var1, int var2, int var3) {
      this(var1, var2, var3, OptionalInt.empty());
   }

   public reb_3(int var1, int var2, int var3, OptionalInt var4) {
      super(var4);
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   @Override
   public int id_class(int var1, int var2) {
      return var2 < this.id_protected ? this.id_throws : this.id_case;
   }

   @Override
   protected rUh_1<?> id_break() {
      return rUh_1.id_class;
   }
}
