package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class Da_1 implements DT {
   private static final Gson break_ = new GsonBuilder().setPrettyPrinting().create();
   private final DA byte_;

   public Da_1(DA var1) {
      this.byte_ = var1;
   }

   @Override
   public String class_() {
      return "Registry Dump";
   }

   @Override
   public void class_(Dn_1 var1) throws IOException {
      JsonObject var2 = new JsonObject();
      rVL.protected_.protected_().forEach(var1x -> var2.add(var1x.toString(), class_((rVL<?>)rVL.protected_.class_(var1x))));
      Path var3 = this.byte_.break_().resolve("reports/registries.json");
      DT.class_(break_, var1, var2, var3);
   }

   private static <T> JsonElement class_(rVL<T> var0) {
      JsonObject var1 = new JsonObject();
      if (var0 instanceof rVu_1) {
         rqO_2 var2 = ((rVu_1)var0).class_();
         var1.addProperty("default", var2.toString());
      }

      int var9 = rVL.protected_.class_(var0);
      var1.addProperty("protocol_id", var9);
      JsonObject var3 = new JsonObject();

      for (rqO_2 var5 : var0.protected_()) {
         Object var6 = var0.class_(var5);
         int var7 = var0.class_(var6);
         JsonObject var8 = new JsonObject();
         var8.addProperty("protocol_id", var7);
         var3.add(var5.toString(), var8);
      }

      var1.add("entries", var3);
      return var1;
   }
}
