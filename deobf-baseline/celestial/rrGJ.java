package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class rrGJ extends rrGc_1 {
   private final Object2IntMap<String> id_class = new Object2IntOpenHashMap();

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      ObjectIterator var2 = this.id_class.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.id_break((String)var3.getKey(), var3.getIntValue());
      }

      return var1;
   }

   public rrGJ() {
      super("idcounts");
      this.id_class.defaultReturnValue(-1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      this.id_class.clear();

      for (String var3 : var1.id_protected()) {
         if (var1.id_byte(var3, 99)) {
            this.id_class.put(var3, var1.id_private(var3));
         }
      }
   }

   public int id_class() {
      int var1 = this.id_class.getInt("map") + 1;
      this.id_class.put("map", var1);
      this.id_byte();
      return var1;
   }
}
