package celestial;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class rgh_3 extends rgZ_2 {
   private static Function<String, Supplier<rgP_2>> id_byte = var0 -> () -> new rgN_2(var0);
   private final String id_protected;
   private Supplier<rgP_2> id_throws;

   public rgh_3(String var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgh_3 var2) ? false : this.id_protected.equals(var2.id_protected) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "KeybindComponent{keybind='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   public static void id_class(Function<String, Supplier<rgP_2>> var0) {
      id_byte = var0;
   }

   @Override
   public <T> Optional<T> id_break(rgM_2<T> var1, rgc_3 var2) {
      return this.id_extends().id_class(var1, var2);
   }

   @Override
   public <T> Optional<T> id_break(rgO_2<T> var1) {
      return this.id_extends().id_class(var1);
   }

   private rgP_2 id_extends() {
      if (this.id_throws == null) {
         this.id_throws = id_byte.apply(this.id_protected);
      }

      return this.id_throws.get();
   }

   public String id_implements() {
      return this.id_protected;
   }

   public rgh_3 id_private() {
      return new rgh_3(this.id_protected);
   }
}
