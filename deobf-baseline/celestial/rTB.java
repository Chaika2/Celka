package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class rTB<U> {
   protected final List<rTS<U>> id_class;
   private final Random id_break = new Random();

   public Stream<U> id_byte() {
      return this.id_class.stream().map(rTS::id_class);
   }

   private rTB(List<rTS<U>> var1) {
      this.id_class = Lists.newArrayList(var1);
   }

   public rTB() {
      this(Lists.newArrayList());
   }

   @Override
   public String toString() {
      return "WeightedList[" + this.id_class + "]";
   }

   public static <U> Codec<rTB<U>> id_class(Codec<U> var0) {
      return rTS.id_class(var0).listOf().xmap(rTB::new, var0x -> var0x.id_class);
   }

   public rTB<U> id_class(U var1, int var2) {
      this.id_class.add(new rTS<>((U)var1, var2));
      return this;
   }

   public rTB<U> id_class() {
      return this.id_class(this.id_break);
   }

   public rTB<U> id_class(Random var1) {
      this.id_class.forEach(var1x -> var1x.id_class(var1.nextFloat()));
      this.id_class.sort(Comparator.comparingDouble(var0 -> var0.id_break()));
      return this;
   }

   public U id_break(Random var1) {
      return this.id_class(var1).id_byte().findFirst().orElseThrow(RuntimeException::new);
   }

   public boolean id_break() {
      return this.id_class.isEmpty();
   }
}
