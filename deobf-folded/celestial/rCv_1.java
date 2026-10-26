package celestial;

public final class rCv_1<T extends Comparable<T>> {
   private final rCZ<T> id_class;
   private final T id_break;

   rCv_1(rCZ<T> var1, T var2) {
      if (!var1.id_class().contains(var2)) {
         throw new IllegalArgumentException("Value " + var2 + " does not belong to property " + var1);
      } else {
         this.id_class = var1;
         this.id_break = (T)var2;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rCv_1 var2) ? false : this.id_class == var2.id_class && this.id_break.equals(var2.id_break);
      }
   }

   @Override
   public String toString() {
      return this.id_class.id_throws() + "=" + this.id_class.id_class(this.id_break);
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      return 31 * var1 + this.id_break.hashCode();
   }

   public rCZ<T> id_class() {
      return this.id_class;
   }

   public T id_break() {
      return this.id_break;
   }
}
