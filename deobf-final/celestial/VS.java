package celestial;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.HashSet;
import java.util.Map.Entry;

public class VS implements rAo_1<VB> {
   @Override
   public String class_() {
      return "language";
   }

   public VB class_(JsonObject var1) {
      HashSet var2 = Sets.newHashSet();

      for (Entry var4 : var1.entrySet()) {
         String var5 = (String)var4.getKey();
         if (var5.length() > 16) {
            throw new JsonParseException("Invalid language->'" + var5 + "': language code must not be more than 16 characters long");
         }

         JsonObject var6 = rpY_2.private_((JsonElement)var4.getValue(), "language");
         String var7 = rpY_2.case_(var6, "region");
         String var8 = rpY_2.case_(var6, "name");
         boolean var9 = rpY_2.class_(var6, "bidirectional", false);
         if (var7.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var5 + "'->region: empty value");
         }

         if (var8.isEmpty()) {
            throw new JsonParseException("Invalid language->'" + var5 + "'->name: empty value");
         }

         if (!var2.add(new jj_3(var5, var7, var8, var9))) {
            throw new JsonParseException("Duplicate language->'" + var5 + "' defined");
         }
      }

      return new VB(var2);
   }
}
