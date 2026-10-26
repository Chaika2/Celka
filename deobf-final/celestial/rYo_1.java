package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class rYo_1 extends rYY {
   public static final Codec<rYo_1> throws_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYG.throws_.fieldOf("biomes").forGetter(var0x -> var0x.case_),
               Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.private_)
            )
            .apply(var0, rYo_1::new)
   );
   private final List<Supplier<rYG>> case_;
   private final int catch_;
   private final int private_;

   public rYo_1(List<Supplier<rYG>> var1, int var2) {
      super(var1.stream());
      this.case_ = var1;
      this.catch_ = var2 + 2;
      this.private_ = var2;
   }

   @Override
   protected Codec<? extends rYY> class_() {
      return throws_;
   }

   @Override
   public rYY class_(long var1) {
      return this;
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      return this.case_.get(Math.floorMod((var1 >> this.catch_) + (var3 >> this.catch_), this.case_.size())).get();
   }
}
