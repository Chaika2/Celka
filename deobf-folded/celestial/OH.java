package celestial;

import java.util.function.Consumer;

public class OH<T> implements Oy_1 {
   private final Class<T> id_class;
   private final int id_break;
   private final Consumer<T> id_byte;
   private Object id_protected;

   @Override
   public int id_byte() {
      return this.id_break;
   }

   public OH(Class<T> var1, int var2, Consumer<T> var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public OH(Class<T> var1, Consumer<T> var2) {
      this(var1, 0, var2);
   }

   @Override
   public Class<T> id_class() {
      return this.id_class;
   }

   @Override
   public void id_class(Object var1) {
      this.id_byte.accept((T)var1);
   }

   @Override
   public Object id_break() {
      return this.id_protected;
   }

   @Override
   public void id_break(Object var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean id_protected() {
      return false;
   }
}
