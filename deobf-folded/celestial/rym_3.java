package celestial;

public class rym_3<T> {
   private final ryZ_2 id_class;
   private final T id_break;

   public static <T> rym_3<T> id_byte(T var0) {
      return new rym_3<>(ryZ_2.PASS, (T)var0);
   }

   public rym_3(ryZ_2 var1, T var2) {
      this.id_class = var1;
      this.id_break = (T)var2;
   }

   public static <T> rym_3<T> id_class(T var0) {
      return new rym_3<>(ryZ_2.SUCCESS, (T)var0);
   }

   public static <T> rym_3<T> id_class(T var0, boolean var1) {
      return var1 ? id_class((T)var0) : id_break((T)var0);
   }

   public ryZ_2 id_class() {
      return this.id_class;
   }

   public static <T> rym_3<T> id_break(T var0) {
      return new rym_3<>(ryZ_2.CONSUME, (T)var0);
   }

   public T id_break() {
      return this.id_break;
   }

   public static <T> rym_3<T> id_protected(T var0) {
      return new rym_3<>(ryZ_2.FAIL, (T)var0);
   }
}
