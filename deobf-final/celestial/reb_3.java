package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class reb_3 extends rDQ {
   public static final Codec<reb_3> byte_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.protected_),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.throws_),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.case_),
               class_()
            )
            .apply(var0, reb_3::new)
   );
   private final int protected_;
   private final int throws_;
   private final int case_;

   public reb_3(int var1, int var2, int var3) {
      this(var1, var2, var3, OptionalInt.empty());
   }

   public reb_3(int var1, int var2, int var3, OptionalInt var4) {
      super(var4);
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   @Override
   public int class_(int var1, int var2) {
      return var2 < this.protected_ ? this.throws_ : this.case_;
   }

   @Override
   protected rUh_1<?> break_() {
      return rUh_1.class_;
   }
}
