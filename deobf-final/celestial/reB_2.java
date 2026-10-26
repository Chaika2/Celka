package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class reB_2 extends rDQ {
   public static final Codec<reB_2> byte_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.protected_),
               Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter(var0x -> var0x.throws_),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.case_),
               Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter(var0x -> var0x.catch_),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.private_),
               class_()
            )
            .apply(var0, reB_2::new)
   );
   private final int protected_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int private_;

   public reB_2(int var1, int var2, int var3, int var4, int var5, OptionalInt var6) {
      super(var6);
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
   }

   @Override
   public int class_(int var1, int var2) {
      if (var2 < this.protected_) {
         return this.case_;
      } else {
         return var2 >= var1 - this.throws_ ? this.private_ : this.catch_;
      }
   }

   @Override
   protected rUh_1<?> break_() {
      return rUh_1.break_;
   }
}
