package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Da_1 implements DT {
   private static final Gson id_break = new GsonBuilder().setPrettyPrinting().create();
   private final DA id_byte;

   public Da_1(DA var1) {
      this.id_byte = var1;
   }

   @Override
   public String id_class() {
      return "Registry Dump";
   }

   @Override
   public void id_class(Dn_1 var1) throws IOException {
      JsonObject var2 = new JsonObject();
      rVL.id_protected.id_protected().forEach(var1x -> var2.add(var1x.toString(), id_class((rVL<?>)rVL.id_protected.id_class(var1x))));
      Path var3 = this.id_byte.id_break().resolve("reports/registries.json");
      DT.id_class(id_break, var1, var2, var3);
   }

   private static <T> JsonElement id_class(rVL<T> var0) {
      JsonObject var1 = new JsonObject();
      if (var0 instanceof rVu_1) {
         rqO_2 var2 = ((rVu_1)var0).id_class();
         var1.addProperty("default", var2.toString());
      }

      int var9 = rVL.id_protected.id_class(var0);
      var1.addProperty("protocol_id", var9);
      JsonObject var3 = new JsonObject();

      for (rqO_2 var5 : var0.id_protected()) {
         Object var6 = var0.id_class(var5);
         int var7 = var0.id_class(var6);
         JsonObject var8 = new JsonObject();
         var8.addProperty("protocol_id", var7);
         var3.add(var5.toString(), var8);
      }

      var1.add("entries", var3);
      return var1;
   }
}
