package celestial;

import java.util.Objects;

public final class rrEF<T> implements Comparable<rrEF<?>> {
   private final rrEl_1<T> id_class;
   private final int id_break;
   private final T id_byte;
   private long id_protected;

   protected rrEF(rrEl_1<T> var1, int var2, T var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = (T)var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rrEF var2)
            ? false
            : this.id_break == var2.id_break && Objects.equals(this.id_class, var2.id_class) && Objects.equals(this.id_byte, var2.id_byte);
      }
   }

   @Override
   public String toString() {
      return "Ticket[" + this.id_class + " " + this.id_break + " (" + this.id_byte + ")] at " + this.id_protected;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break, this.id_byte);
   }

   public rrEl_1<T> id_class() {
      return this.id_class;
   }

   protected void id_class(long var1) {
      this.id_protected = var1;
   }

   public int id_class(rrEF<?> var1) {
      int var2 = Integer.compare(this.id_break, var1.id_break);
      if (var2 != 0) {
         return var2;
      } else {
         int var3 = Integer.compare(System.identityHashCode(this.id_class), System.identityHashCode(var1.id_class));
         return var3 != 0 ? var3 : this.id_class.id_class().compare(this.id_byte, var1.id_byte);
      }
   }

   protected boolean id_break(long var1) {
      long var3 = this.id_class.id_break();
      return var3 != 0L && var1 - this.id_protected > var3;
   }

   public int id_break() {
      return this.id_break;
   }
}
