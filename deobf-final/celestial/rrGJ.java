package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class rrGJ extends rrGc_1 {
   private final Object2IntMap<String> class_ = new Object2IntOpenHashMap();

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      ObjectIterator var2 = this.class_.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.break_((String)var3.getKey(), var3.getIntValue());
      }

      return var1;
   }

   public rrGJ() {
      super("idcounts");
      this.class_.defaultReturnValue(-1);
   }

   @Override
   public void class_(rcd_3 var1) {
      this.class_.clear();

      for (String var3 : var1.protected_()) {
         if (var1.byte_(var3, 99)) {
            this.class_.put(var3, var1.private_(var3));
         }
      }
   }

   public int class_() {
      int var1 = this.class_.getInt("map") + 1;
      this.class_.put("map", var1);
      this.byte_();
      return var1;
   }
}
