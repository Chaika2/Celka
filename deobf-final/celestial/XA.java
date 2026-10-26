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
   public static final XA class_ = new XA(Collections.emptyMap());
   private final Map<rLR, Xn_1> break_;

   public XA(Map<rLR, Xn_1> var1) {
      this.break_ = var1;
   }

   public static XA class_() {
      return new XA(Maps.newLinkedHashMap());
   }

   public static XA class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "effects");
         LinkedHashMap var2 = Maps.newLinkedHashMap();

         for (Entry var4 : var1.entrySet()) {
            rqO_2 var5 = new rqO_2((String)var4.getKey());
            rLR var6 = rVL.const_.break_(var5).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + var5 + "'"));
            Xn_1 var7 = Xn_1.class_(rpY_2.private_((JsonElement)var4.getValue(), (String)var4.getKey()));
            var2.put(var6, var7);
         }

         return new XA(var2);
      } else {
         return class_;
      }
   }

   public boolean class_(Map<rLR, rLY> var1) {
      if (this == class_) {
         return true;
      } else {
         for (Entry var3 : this.break_.entrySet()) {
            rLY var4 = (rLY)var1.get(var3.getKey());
            if (!((Xn_1)var3.getValue()).class_(var4)) {
               return false;
            }
         }

         return true;
      }
   }

   public XA class_(rLR var1) {
      this.break_.put(var1, new Xn_1());
      return this;
   }

   public boolean class_(an_3 var1) {
      if (this == class_) {
         return true;
      } else {
         return var1 instanceof iB_2 ? this.class_(((iB_2)var1).sb()) : false;
      }
   }

   public boolean class_(iB_2 var1) {
      return this == class_ ? true : this.class_(var1.sb());
   }

   public JsonElement break_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();

         for (Entry var3 : this.break_.entrySet()) {
            var1.add(rVL.const_.break_((rLR)var3.getKey()).toString(), ((Xn_1)var3.getValue()).class_());
         }

         return var1;
      }
   }
}
