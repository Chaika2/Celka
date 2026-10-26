package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class in_3<T> {
   private final T class_;
   private long break_;

   public boolean byte_() {
      return this.break_ <= 0L;
   }

   public in_3(T var1, long var2) {
      this.class_ = (T)var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return this.class_.toString() + (this.protected_() ? " (ttl: " + this.break_ + ")" : "");
   }

   public static <T> Codec<in_3<T>> class_(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  var0.fieldOf("value").forGetter(var0xx -> var0xx.class_),
                  Codec.LONG.optionalFieldOf("ttl").forGetter(var0xx -> var0xx.protected_() ? Optional.of(var0xx.break_) : Optional.empty())
               )
               .apply(var1, (var0xx, var1x) -> new in_3<>(var0xx, var1x.orElse(Long.MAX_VALUE)))
      );
   }

   public static <T> in_3<T> class_(T var0) {
      return new in_3<>((T)var0, Long.MAX_VALUE);
   }

   public void class_() {
      if (this.protected_()) {
         this.break_--;
      }
   }

   public static <T> in_3<T> class_(T var0, long var1) {
      return new in_3<>((T)var0, var1);
   }

   public T break_() {
      return this.class_;
   }

   public boolean protected_() {
      return this.break_ != Long.MAX_VALUE;
   }
}
