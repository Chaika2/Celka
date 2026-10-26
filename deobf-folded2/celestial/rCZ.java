package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class rCZ<T extends Comparable<T>> {
   private final Class<T> id_class;
   private final String id_break;
   private Integer id_byte;
   private final Codec<T> id_protected = Codec.STRING
      .comapFlatMap(
         var1x -> this.id_break(var1x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error("Unable to read property: " + this + " with value: " + var1x)),
         this::id_class
      );
   private final Codec<rCv_1<T>> id_throws = this.id_protected.xmap(this::id_break, rCv_1::id_break);

   public Stream<rCv_1<T>> id_byte() {
      return this.id_class().stream().map(this::id_break);
   }

   protected rCZ(String var1, Class<T> var2) {
      this.id_class = var2;
      this.id_break = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rCZ var2) ? false : this.id_class.equals(var2.id_class) && this.id_break.equals(var2.id_break);
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.id_break).add("clazz", this.id_class).add("values", this.id_class()).toString();
   }

   @Override
   public final int hashCode() {
      if (this.id_byte == null) {
         this.id_byte = this.id_break();
      }

      return this.id_byte;
   }

   public abstract String id_class(T var1);

   public rCv_1<T> id_class(rCn_1<?, ?> var1) {
      return new rCv_1<>(this, var1.id_byte(this));
   }

   public abstract Collection<T> id_class();

   public abstract Optional<T> id_break(String var1);

   public int id_break() {
      return 31 * this.id_class.hashCode() + this.id_break.hashCode();
   }

   public rCv_1<T> id_break(T var1) {
      return new rCv_1<>(this, (T)var1);
   }

   public String id_throws() {
      return this.id_break;
   }

   public Class<T> id_case() {
      return this.id_class;
   }

   public Codec<rCv_1<T>> id_protected() {
      return this.id_throws;
   }
}
