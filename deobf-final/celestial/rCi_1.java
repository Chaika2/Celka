package celestial;

import java.util.Objects;

public class rCi_1<T> extends rAi_1 {
   private final rCe_1 package_;
   private final T int_;
   private final rlr_3<T> new_;

   protected rCi_1(rlr_3<T> var1, T var2, rCe_1 var3) {
      super(class_(var1, var2));
      this.new_ = var1;
      this.package_ = var3;
      this.int_ = (T)var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof rCi_1 && Objects.equals(this.class_(), ((rCi_1)var1).class_());
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.class_() + ", formatter=" + this.package_ + "}";
   }

   @Override
   public int hashCode() {
      return this.class_().hashCode();
   }

   public static <T> String class_(rlr_3<T> var0, T var1) {
      return class_(rVL.h.break_(var0)) + ":" + class_(var0.class_().break_(var1));
   }

   public String class_(int var1) {
      return this.package_.format(var1);
   }

   private static <T> String class_(rqO_2 var0) {
      return var0.toString().replace(':', '.');
   }

   public T throws_() {
      return this.int_;
   }

   public rlr_3<T> protected_() {
      return this.new_;
   }
}
