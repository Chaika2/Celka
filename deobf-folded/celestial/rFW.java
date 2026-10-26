package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.Map;

public class rFW implements ruS_2<At_1> {
   private Object2IntMap<rCi_1<?>> id_class;

   public rFW() {
   }

   public rFW(Object2IntMap<rCi_1<?>> var1) {
      this.id_class = var1;
   }

   private <T> int id_class(rCi_1<T> var1) {
      return var1.id_protected().id_class().id_class(var1.id_throws());
   }

   private <T> void id_class(rlr_3<T> var1, ruu_3 var2) {
      int var3 = var2.id_case();
      int var4 = var2.id_case();
      this.id_class.put(var1.id_break(var1.id_class().id_class(var3)), var4);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      int var2 = var1.id_case();
      this.id_class = new Object2IntOpenHashMap(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_class(rVL.h.id_class(var1.id_case()), var1);
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class.size());
      ObjectIterator var2 = this.id_class.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         rCi_1 var4 = (rCi_1)var3.getKey();
         var1.id_protected(rVL.h.id_class(var4.id_protected()));
         var1.id_protected(this.id_class(var4));
         var1.id_protected(var3.getIntValue());
      }
   }

   public Map<rCi_1<?>, Integer> id_break() {
      return this.id_class;
   }
}
