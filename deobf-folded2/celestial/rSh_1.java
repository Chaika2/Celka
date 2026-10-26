package celestial;

import java.util.function.Predicate;

public class rSh_1<T extends iB_2> extends rBI<T> {
   private boolean id_implements = true;

   public rSh_1(rEB var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<iB_2> var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void id_class(boolean var1) {
      this.id_implements = var1;
   }

   @Override
   public boolean id_class() {
      return this.id_implements && super.id_class();
   }
}
