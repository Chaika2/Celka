package celestial;

import java.util.Objects;

public class rCi_1<T> extends rAi_1 {
   private final rCe_1 id_package;
   private final T id_int;
   private final rlr_3<T> id_new;

   protected rCi_1(rlr_3<T> var1, T var2, rCe_1 var3) {
      super(id_class(var1, var2));
      this.id_new = var1;
      this.id_package = var3;
      this.id_int = (T)var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof rCi_1 && Objects.equals(this.id_class(), ((rCi_1)var1).id_class());
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.id_class() + ", formatter=" + this.id_package + "}";
   }

   @Override
   public int hashCode() {
      return this.id_class().hashCode();
   }

   public static <T> String id_class(rlr_3<T> var0, T var1) {
      return id_class(rVL.h.id_break(var0)) + ":" + id_class(var0.id_class().id_break(var1));
   }

   public String id_class(int var1) {
      return this.id_package.format(var1);
   }

   private static <T> String id_class(rqO_2 var0) {
      return var0.toString().replace(':', '.');
   }

   public T id_throws() {
      return this.id_int;
   }

   public rlr_3<T> id_protected() {
      return this.id_new;
   }
}
