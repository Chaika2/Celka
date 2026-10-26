package celestial;

import java.util.function.Consumer;

public class OH<T> implements Oy_1 {
   private final Class<T> class_;
   private final int break_;
   private final Consumer<T> byte_;
   private Object protected_;

   @Override
   public int byte_() {
      return this.break_;
   }

   public OH(Class<T> var1, int var2, Consumer<T> var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public OH(Class<T> var1, Consumer<T> var2) {
      this(var1, 0, var2);
   }

   @Override
   public Class<T> class_() {
      return this.class_;
   }

   @Override
   public void class_(Object var1) {
      this.byte_.accept((T)var1);
   }

   @Override
   public Object break_() {
      return this.protected_;
   }

   @Override
   public void break_(Object var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean protected_() {
      return false;
   }
}
