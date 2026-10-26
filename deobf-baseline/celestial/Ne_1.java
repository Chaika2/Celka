package celestial;

import com.google.common.collect.Sets;
import java.util.Set;

class Ne_1 implements Na_1 {
   private final int id_class;
   private final Set<NK> id_break = Sets.newIdentityHashSet();

   @Override
   public int id_byte() {
      return this.id_class;
   }

   public Ne_1(int var1) {
      this.id_class = var1;
   }

   @Override
   public NK id_class() {
      if (this.id_break.size() >= this.id_class) {
         return null;
      } else {
         NK var1 = NK.id_class();
         if (var1 != null) {
            this.id_break.add(var1);
         }

         return var1;
      }
   }

   @Override
   public boolean id_class(NK var1) {
      if (!this.id_break.remove(var1)) {
         return false;
      } else {
         var1.id_break();
         return true;
      }
   }

   @Override
   public void id_break() {
      this.id_break.forEach(NK::id_break);
      this.id_break.clear();
   }

   @Override
   public int id_protected() {
      return this.id_break.size();
   }
}
