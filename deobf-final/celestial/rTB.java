package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class rTB<U> {
   protected final List<rTS<U>> class_;
   private final Random break_ = new Random();

   public Stream<U> byte_() {
      return this.class_.stream().map(rTS::class_);
   }

   private rTB(List<rTS<U>> var1) {
      this.class_ = Lists.newArrayList(var1);
   }

   public rTB() {
      this(Lists.newArrayList());
   }

   @Override
   public String toString() {
      return "WeightedList[" + this.class_ + "]";
   }

   public static <U> Codec<rTB<U>> class_(Codec<U> var0) {
      return rTS.class_(var0).listOf().xmap(rTB::new, var0x -> var0x.class_);
   }

   public rTB<U> class_(U var1, int var2) {
      this.class_.add(new rTS<>((U)var1, var2));
      return this;
   }

   public rTB<U> class_() {
      return this.class_(this.break_);
   }

   public rTB<U> class_(Random var1) {
      this.class_.forEach(var1x -> var1x.class_(var1.nextFloat()));
      this.class_.sort(Comparator.comparingDouble(var0 -> var0.break_()));
      return this;
   }

   public U break_(Random var1) {
      return this.class_(var1).byte_().findFirst().orElseThrow(RuntimeException::new);
   }

   public boolean break_() {
      return this.class_.isEmpty();
   }
}
