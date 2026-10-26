package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class rCZ<T extends Comparable<T>> {
   private final Class<T> class_;
   private final String break_;
   private Integer byte_;
   private final Codec<T> protected_ = Codec.STRING
      .comapFlatMap(
         var1x -> this.break_(var1x)
               .<DataResult>map(DataResult::success)
               .orElseGet(() -> DataResult.error("Unable to read property: " + this + " with value: " + var1x)),
         this::class_
      );
   private final Codec<rCv_1<T>> throws_ = this.protected_.xmap(this::break_, rCv_1::break_);

   public Stream<rCv_1<T>> byte_() {
      return this.class_().stream().map(this::break_);
   }

   protected rCZ(String var1, Class<T> var2) {
      this.class_ = var2;
      this.break_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rCZ var2) ? false : this.class_.equals(var2.class_) && this.break_.equals(var2.break_);
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", this.break_).add("clazz", this.class_).add("values", this.class_()).toString();
   }

   @Override
   public final int hashCode() {
      if (this.byte_ == null) {
         this.byte_ = this.break_();
      }

      return this.byte_;
   }

   public abstract String class_(T var1);

   public rCv_1<T> class_(rCn_1<?, ?> var1) {
      return new rCv_1<>(this, var1.byte_(this));
   }

   public abstract Collection<T> class_();

   public abstract Optional<T> break_(String var1);

   public int break_() {
      return 31 * this.class_.hashCode() + this.break_.hashCode();
   }

   public rCv_1<T> break_(T var1) {
      return new rCv_1<>(this, (T)var1);
   }

   public String throws_() {
      return this.break_;
   }

   public Class<T> case_() {
      return this.class_;
   }

   public Codec<rCv_1<T>> protected_() {
      return this.throws_;
   }
}
