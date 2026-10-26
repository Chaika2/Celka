package celestial;

import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class roW_2<T> implements rRV<T> {
   protected final Predicate<T> class_;
   private final rfj_3 break_;
   private final ShortList[] byte_ = new ShortList[16];

   public roW_2(Predicate<T> var1, rfj_3 var2) {
      this(var1, var2, new rcy_3());
   }

   public roW_2(Predicate<T> var1, rfj_3 var2, rcy_3 var3) {
      this.class_ = var1;
      this.break_ = var2;

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rcy_3 var5 = var3.break_(var4);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            roC_2.class_(this.byte_, var4).add(var5.protected_(var6));
         }
      }
   }

   @Override
   public boolean class_(rfH_2 var1, T var2) {
      return false;
   }

   @Override
   public void class_(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      roC_2.class_(this.byte_, var1.c_() >> 4).add(rok_3.finally_(var1));
   }

   public void class_(rRV<T> var1, Function<rfH_2, T> var2) {
      for (int var3 = 0; var3 < this.byte_.length; var3++) {
         if (this.byte_[var3] != null) {
            ShortListIterator var4 = this.byte_[var3].iterator();

            while (var4.hasNext()) {
               Short var5 = (Short)var4.next();
               rfH_2 var6 = rok_3.class_(var5, var3, this.break_);
               var1.class_(var6, var2.apply(var6), 0);
            }

            this.byte_[var3].clear();
         }
      }
   }

   public rcy_3 class_() {
      return roR_2.class_(this.byte_);
   }

   @Override
   public boolean break_(rfH_2 var1, T var2) {
      return false;
   }
}
