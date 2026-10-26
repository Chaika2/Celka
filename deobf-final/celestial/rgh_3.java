package celestial;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class rgh_3 extends rgZ_2 {
   private static Function<String, Supplier<rgP_2>> byte_ = var0 -> () -> new rgN_2(var0);
   private final String protected_;
   private Supplier<rgP_2> throws_;

   public rgh_3(String var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgh_3 var2) ? false : this.protected_.equals(var2.protected_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "KeybindComponent{keybind='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   public static void class_(Function<String, Supplier<rgP_2>> var0) {
      byte_ = var0;
   }

   @Override
   public <T> Optional<T> break_(rgM_2<T> var1, rgc_3 var2) {
      return this.extends_().class_(var1, var2);
   }

   @Override
   public <T> Optional<T> break_(rgO_2<T> var1) {
      return this.extends_().class_(var1);
   }

   private rgP_2 extends_() {
      if (this.throws_ == null) {
         this.throws_ = byte_.apply(this.protected_);
      }

      return this.throws_.get();
   }

   public String implements_() {
      return this.protected_;
   }

   public rgh_3 private_() {
      return new rgh_3(this.protected_);
   }
}
