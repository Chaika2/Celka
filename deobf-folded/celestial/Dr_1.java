package celestial;

import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Dr_1 implements DT {
   private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
   private final DA id_byte;

   public Dr_1(DA var1) {
      this.id_byte = var1;
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      JsonObject var2 = new JsonObject();

      for (xd_3 var4 : rVL.id_strictfp) {
         rqO_2 var5 = rVL.id_strictfp.id_break(var4);
         JsonObject var6 = new JsonObject();
         rCF var7 = var4.id_new();
         if (!var7.id_protected().isEmpty()) {
            JsonObject var8 = new JsonObject();

            for (rCZ var10 : var7.id_protected()) {
               JsonArray var11 = new JsonArray();

               for (Comparable var13 : var10.id_class()) {
                  var11.add(rqR_2.id_class(var10, var13));
               }

               var8.add(var10.id_throws(), var11);
            }

            var6.add("properties", var8);
         }

         JsonArray var16 = new JsonArray();
         UnmodifiableIterator var17 = var7.id_class().iterator();

         while (var17.hasNext()) {
            xc_3 var18 = (xc_3)var17.next();
            JsonObject var19 = new JsonObject();
            JsonObject var20 = new JsonObject();

            for (rCZ var14 : var7.id_protected()) {
               var20.addProperty(var14.id_throws(), rqR_2.id_class(var14, var18.id_byte(var14)));
            }

            if (var20.size() > 0) {
               var19.add("properties", var20);
            }

            var19.addProperty("id", xd_3.id_finally(var18));
            if (var18 == var4.id_continue()) {
               var19.addProperty("default", true);
            }

            var16.add(var19);
         }

         var6.add("states", var16);
         var2.add(var5.toString(), var6);
      }

      Path var15 = this.id_byte.id_break().resolve("reports/blocks.json");
      DT.id_class(id_break, var1, var2, var15);
   }

   @Override
   public String id_class() {
      return "Block List";
   }
}
