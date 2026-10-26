package celestial;

import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class roW_2<T> implements rRV<T> {
   protected final Predicate<T> id_class;
   private final rfj_3 id_break;
   private final ShortList[] id_byte = new ShortList[16];

   public roW_2(Predicate<T> var1, rfj_3 var2) {
      this(var1, var2, new rcy_3());
   }

   public roW_2(Predicate<T> var1, rfj_3 var2, rcy_3 var3) {
      this.id_class = var1;
      this.id_break = var2;

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rcy_3 var5 = var3.id_break(var4);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            roC_2.id_class(this.id_byte, var4).add(var5.id_protected(var6));
         }
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, T var2) {
      return false;
   }

   @Override
   public void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      roC_2.id_class(this.id_byte, var1.c_() >> 4).add(rok_3.id_finally(var1));
   }

   public void id_class(rRV<T> var1, Function<rfH_2, T> var2) {
      for (int var3 = 0; var3 < this.id_byte.length; var3++) {
         if (this.id_byte[var3] != null) {
            ShortListIterator var4 = this.id_byte[var3].iterator();

            while (var4.hasNext()) {
               Short var5 = (Short)var4.next();
               rfH_2 var6 = rok_3.id_class(var5, var3, this.id_break);
               var1.id_class(var6, var2.apply(var6), 0);
            }

            this.id_byte[var3].clear();
         }
      }
   }

   public rcy_3 id_class() {
      return roR_2.id_class(this.id_byte);
   }

   @Override
   public boolean id_break(rfH_2 var1, T var2) {
      return false;
   }
}
