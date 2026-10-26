package celestial;

import java.util.Comparator;

public class rRD<T> {
   private static long id_protected;
   private final T id_throws;
   public final rfH_2 id_class;
   public final long id_break;
   public final rYr_1 id_byte;
   private final long id_case;

   public rRD(rfH_2 var1, T var2) {
      this(var1, (T)var2, 0L, rYr_1.NORMAL);
   }

   public rRD(rfH_2 var1, T var2, long var3, rYr_1 var5) {
      this.id_case = id_protected++;
      this.id_class = var1.id_int();
      this.id_throws = (T)var2;
      this.id_break = var3;
      this.id_byte = var5;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof rRD var2) ? false : this.id_class.equals(var2.id_class) && this.id_throws == var2.id_throws;
   }

   @Override
   public String toString() {
      return this.id_throws + ": " + this.id_class + ", " + this.id_break + ", " + this.id_byte + ", " + this.id_case;
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   public static <T> Comparator<rRD<T>> id_class() {
      return Comparator.<rRD<T>>comparingLong(var0 -> var0.id_break).thenComparing(var0 -> var0.id_byte).thenComparingLong(var0 -> var0.id_case);
   }

   public T id_break() {
      return this.id_throws;
   }
}
