package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class XA {
   public static final XA id_class = new XA(Collections.emptyMap());
   private final Map<rLR, Xn_1> id_break;

   public XA(Map<rLR, Xn_1> var1) {
      this.id_break = var1;
   }

   public static XA id_class() {
      return new XA(Maps.newLinkedHashMap());
   }

   public static XA id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "effects");
         LinkedHashMap var2 = Maps.newLinkedHashMap();

         for (Entry var4 : var1.entrySet()) {
            rqO_2 var5 = new rqO_2((String)var4.getKey());
            rLR var6 = rVL.id_const.id_break(var5).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + var5 + "'"));
            Xn_1 var7 = Xn_1.id_class(rpY_2.id_private((JsonElement)var4.getValue(), (String)var4.getKey()));
            var2.put(var6, var7);
         }

         return new XA(var2);
      } else {
         return id_class;
      }
   }

   public boolean id_class(Map<rLR, rLY> var1) {
      if (this == id_class) {
         return true;
      } else {
         for (Entry var3 : this.id_break.entrySet()) {
            rLY var4 = (rLY)var1.get(var3.getKey());
            if (!((Xn_1)var3.getValue()).id_class(var4)) {
               return false;
            }
         }

         return true;
      }
   }

   public XA id_class(rLR var1) {
      this.id_break.put(var1, new Xn_1());
      return this;
   }

   public boolean id_class(an_3 var1) {
      if (this == id_class) {
         return true;
      } else {
         return var1 instanceof iB_2 ? this.id_class(((iB_2)var1).sb()) : false;
      }
   }

   public boolean id_class(iB_2 var1) {
      return this == id_class ? true : this.id_class(var1.sb());
   }

   public JsonElement id_break() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();

         for (Entry var3 : this.id_break.entrySet()) {
            var1.add(rVL.id_const.id_break((rLR)var3.getKey()).toString(), ((Xn_1)var3.getValue()).id_class());
         }

         return var1;
      }
   }
}
