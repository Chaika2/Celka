package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;

class Xg_1 implements XY {
   private final Object2BooleanMap<String> id_class;

   public Xg_1(Object2BooleanMap<String> var1) {
      this.id_class = var1;
   }

   @Override
   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      this.id_class.forEach(var1::addProperty);
      return var1;
   }

   public boolean id_class(Oj_1 var1) {
      ObjectIterator var2 = this.id_class.object2BooleanEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         OD var4 = var1.id_byte((String)var3.getKey());
         if (var4 == null || var4.id_class() != var3.getBooleanValue()) {
            return false;
         }
      }

      return true;
   }
}
