package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.StringUtils;

public class rwe_3 extends rwW_2 {
   public static final Gson class_ = new GsonBuilder().registerTypeAdapter(rgP_2.class, new rwa_3()).create();

   public rwe_3(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntitySignTextStrictJsonFix", rTC.extends_, "Sign");
   }

   private Dynamic<?> class_(Dynamic<?> var1, String var2) {
      String var3 = var1.get(var2).asString("");
      Object var4 = null;
      if (!"null".equals(var3) && !StringUtils.isEmpty(var3)) {
         if (var3.charAt(0) == '"' && var3.charAt(var3.length() - 1) == '"' || var3.charAt(0) == '{' && var3.charAt(var3.length() - 1) == '}') {
            try {
               var4 = rpY_2.class_(class_, var3, rgP_2.class, true);
               if (var4 == null) {
                  var4 = rgN_2.byte_;
               }
            } catch (JsonParseException var8) {
            }

            if (var4 == null) {
               try {
                  var4 = rgB_2.class_(var3);
               } catch (JsonParseException var7) {
               }
            }

            if (var4 == null) {
               try {
                  var4 = rgB_2.break_(var3);
               } catch (JsonParseException var6) {
               }
            }

            if (var4 == null) {
               var4 = new rgN_2(var3);
            }
         } else {
            var4 = new rgN_2(var3);
         }
      } else {
         var4 = rgN_2.byte_;
      }

      return var1.set(var2, var1.createString(rgB_2.class_((rgP_2)var4)));
   }

   @Override
   protected Typed<?> class_(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var1x -> {
         var1x = this.class_(var1x, "Text1");
         var1x = this.class_(var1x, "Text2");
         var1x = this.class_(var1x, "Text3");
         return this.class_(var1x, "Text4");
      });
   }
}
