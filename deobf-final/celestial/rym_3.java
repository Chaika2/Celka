package celestial;

public class rym_3<T> {
   private final ryZ_2 class_;
   private final T break_;

   public static <T> rym_3<T> byte_(T var0) {
      return new rym_3<>(ryZ_2.PASS, (T)var0);
   }

   public rym_3(ryZ_2 var1, T var2) {
      this.class_ = var1;
      this.break_ = (T)var2;
   }

   public static <T> rym_3<T> class_(T var0) {
      return new rym_3<>(ryZ_2.SUCCESS, (T)var0);
   }

   public static <T> rym_3<T> class_(T var0, boolean var1) {
      return var1 ? class_((T)var0) : break_((T)var0);
   }

   public ryZ_2 class_() {
      return this.class_;
   }

   public static <T> rym_3<T> break_(T var0) {
      return new rym_3<>(ryZ_2.CONSUME, (T)var0);
   }

   public T break_() {
      return this.break_;
   }

   public static <T> rym_3<T> protected_(T var0) {
      return new rym_3<>(ryZ_2.FAIL, (T)var0);
   }
}
