package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class rLi_1 {
   private final String id_class;
   private final ImmutableList<rLY> id_break;

   public rLi_1(String var1, rLY... var2) {
      this.id_class = var1;
      this.id_break = ImmutableList.copyOf(var2);
   }

   public rLi_1(rLY... var1) {
      this((String)null, var1);
   }

   public List<rLY> id_class() {
      return this.id_break;
   }

   public static rLi_1 id_class(String var0) {
      return rVL.id_double.id_class(rqO_2.id_break(var0));
   }

   public boolean id_break() {
      if (!this.id_break.isEmpty()) {
         UnmodifiableIterator var1 = this.id_break.iterator();

         while (var1.hasNext()) {
            rLY var2 = (rLY)var1.next();
            if (var2.id_class().id_class()) {
               return true;
            }
         }
      }

      return false;
   }

   public String id_break(String var1) {
      return var1 + (this.id_class == null ? rVL.id_double.id_break(this).id_break() : this.id_class);
   }
}
