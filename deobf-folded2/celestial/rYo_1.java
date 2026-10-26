package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class rYo_1 extends rYY {
   public static final Codec<rYo_1> id_throws = RecordCodecBuilder.create(
      var0 -> var0.group(
               rYG.id_throws.fieldOf("biomes").forGetter(var0x -> var0x.id_case),
               Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.id_private)
            )
            .apply(var0, rYo_1::new)
   );
   private final List<Supplier<rYG>> id_case;
   private final int id_catch;
   private final int id_private;

   public rYo_1(List<Supplier<rYG>> var1, int var2) {
      super(var1.stream());
      this.id_case = var1;
      this.id_catch = var2 + 2;
      this.id_private = var2;
   }

   @Override
   protected Codec<? extends rYY> id_class() {
      return id_throws;
   }

   @Override
   public rYY id_class(long var1) {
      return this;
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      return this.id_case.get(Math.floorMod((var1 >> this.id_catch) + (var3 >> this.id_catch), this.id_case.size())).get();
   }
}
