package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class No_1 implements JsonDeserializer<NY> {
   private NT class_(JsonObject var1, NT var2) {
      NT var3 = var2;
      if (var1.has("type")) {
         var3 = NT.class_(rpY_2.case_(var1, "type"));
         Validate.notNull(var3, "Invalid type", new Object[0]);
      }

      return var3;
   }

   private List<Nq_1> class_(JsonObject var1) {
      ArrayList var2 = Lists.newArrayList();
      if (var1.has("sounds")) {
         JsonArray var3 = rpY_2.volatile_(var1, "sounds");

         for (int var4 = 0; var4 < var3.size(); var4++) {
            JsonElement var5 = var3.get(var4);
            if (rpY_2.class_(var5)) {
               String var6 = rpY_2.class_(var5, "sound");
               var2.add(new Nq_1(var6, 1.0F, 1.0F, 1, NT.FILE, false, false, 16));
            } else {
               var2.add(this.break_(rpY_2.private_(var5, "sound")));
            }
         }
      }

      return var2;
   }

   public NY class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = rpY_2.private_(var1, "entry");
      boolean var5 = rpY_2.class_(var4, "replace", false);
      String var6 = rpY_2.class_(var4, "subtitle", (String)null);
      List var7 = this.class_(var4);
      return new NY(var7, var5, var6);
   }

   private Nq_1 break_(JsonObject var1) {
      String var2 = rpY_2.case_(var1, "name");
      NT var3 = this.class_(var1, NT.FILE);
      float var4 = rpY_2.class_(var1, "volume", 1.0F);
      Validate.isTrue(var4 > 0.0F, "Invalid volume", new Object[0]);
      float var5 = rpY_2.class_(var1, "pitch", 1.0F);
      Validate.isTrue(var5 > 0.0F, "Invalid pitch", new Object[0]);
      int var6 = rpY_2.class_(var1, "weight", 1);
      Validate.isTrue(var6 > 0, "Invalid weight", new Object[0]);
      boolean var7 = rpY_2.class_(var1, "preload", false);
      boolean var8 = rpY_2.class_(var1, "stream", false);
      int var9 = rpY_2.class_(var1, "attenuation_distance", 16);
      return new Nq_1(var2, var4, var5, var6, var3, var8, var7, var9);
   }
}
