package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.Map;

public class rFW implements ruS_2<At_1> {
   private Object2IntMap<rCi_1<?>> class_;

   public rFW() {
   }

   public rFW(Object2IntMap<rCi_1<?>> var1) {
      this.class_ = var1;
   }

   private <T> int class_(rCi_1<T> var1) {
      return var1.protected_().class_().class_(var1.throws_());
   }

   private <T> void class_(rlr_3<T> var1, ruu_3 var2) {
      int var3 = var2.case_();
      int var4 = var2.case_();
      this.class_.put(var1.break_(var1.class_().class_(var3)), var4);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      int var2 = var1.case_();
      this.class_ = new Object2IntOpenHashMap(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.class_(rVL.h.class_(var1.case_()), var1);
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_.size());
      ObjectIterator var2 = this.class_.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         rCi_1 var4 = (rCi_1)var3.getKey();
         var1.protected_(rVL.h.class_(var4.protected_()));
         var1.protected_(this.class_(var4));
         var1.protected_(var3.getIntValue());
      }
   }

   public Map<rCi_1<?>, Integer> break_() {
      return this.class_;
   }
}
