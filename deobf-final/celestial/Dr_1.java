package celestial;

import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Dr_1 implements DT {
   private static final Gson break_ = new GsonBuilder().setPrettyPrinting().create();
   private final DA byte_;

   public Dr_1(DA var1) {
      this.byte_ = var1;
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      JsonObject var2 = new JsonObject();

      for (xd_3 var4 : rVL.strictfp_) {
         rqO_2 var5 = rVL.strictfp_.break_(var4);
         JsonObject var6 = new JsonObject();
         rCF var7 = var4.new_();
         if (!var7.protected_().isEmpty()) {
            JsonObject var8 = new JsonObject();

            for (rCZ var10 : var7.protected_()) {
               JsonArray var11 = new JsonArray();

               for (Comparable var13 : var10.class_()) {
                  var11.add(rqR_2.class_(var10, var13));
               }

               var8.add(var10.throws_(), var11);
            }

            var6.add("properties", var8);
         }

         JsonArray var16 = new JsonArray();
         UnmodifiableIterator var17 = var7.class_().iterator();

         while (var17.hasNext()) {
            xc_3 var18 = (xc_3)var17.next();
            JsonObject var19 = new JsonObject();
            JsonObject var20 = new JsonObject();

            for (rCZ var14 : var7.protected_()) {
               var20.addProperty(var14.throws_(), rqR_2.class_(var14, var18.byte_(var14)));
            }

            if (var20.size() > 0) {
               var19.add("properties", var20);
            }

            var19.addProperty("id", xd_3.finally_(var18));
            if (var18 == var4.continue_()) {
               var19.addProperty("default", true);
            }

            var16.add(var19);
         }

         var6.add("states", var16);
         var2.add(var5.toString(), var6);
      }

      Path var15 = this.byte_.break_().resolve("reports/blocks.json");
      DT.class_(break_, var1, var2, var15);
   }

   @Override
   public String class_() {
      return "Block List";
   }
}
