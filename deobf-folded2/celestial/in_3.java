package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class in_3<T> {
   private final T id_class;
   private long id_break;

   public boolean id_byte() {
      return this.id_break <= 0L;
   }

   public in_3(T var1, long var2) {
      this.id_class = (T)var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class.toString() + (this.id_protected() ? " (ttl: " + this.id_break + ")" : "");
   }

   public static <T> Codec<in_3<T>> id_class(Codec<T> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  var0.fieldOf("value").forGetter(var0xx -> var0xx.id_class),
                  Codec.LONG.optionalFieldOf("ttl").forGetter(var0xx -> var0xx.id_protected() ? Optional.of(var0xx.id_break) : Optional.empty())
               )
               .apply(var1, (var0xx, var1x) -> new in_3<>(var0xx, var1x.orElse(Long.MAX_VALUE)))
      );
   }

   public static <T> in_3<T> id_class(T var0) {
      return new in_3<>((T)var0, Long.MAX_VALUE);
   }

   public void id_class() {
      if (this.id_protected()) {
         this.id_break--;
      }
   }

   public static <T> in_3<T> id_class(T var0, long var1) {
      return new in_3<>((T)var0, var1);
   }

   public T id_break() {
      return this.id_class;
   }

   public boolean id_protected() {
      return this.id_break != Long.MAX_VALUE;
   }
}
