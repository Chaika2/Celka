package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;

class Xg_1 implements XY {
   private final Object2BooleanMap<String> class_;

   public Xg_1(Object2BooleanMap<String> var1) {
      this.class_ = var1;
   }

   @Override
   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      this.class_.forEach(var1::addProperty);
      return var1;
   }

   public boolean class_(Oj_1 var1) {
      ObjectIterator var2 = this.class_.object2BooleanEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         OD var4 = var1.byte_((String)var3.getKey());
         if (var4 == null || var4.class_() != var3.getBooleanValue()) {
            return false;
         }
      }

      return true;
   }
}
