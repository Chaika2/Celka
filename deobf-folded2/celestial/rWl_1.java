package celestial;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWl_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final rqO_2 id_break;
   private final rzZ_2 id_byte;
   private final Gson id_protected = rzF_2.id_class().create();

   public rWl_1(rqO_2 var1, rzZ_2 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public final rQz_1[] id_class(JsonArray var1, String var2, rzk_3 var3) {
      rQz_1[] var4 = (rQz_1[])this.id_protected.fromJson(var1, rQz_1[].class);
      rQs_1 var5 = new rQs_1(var3, this.id_byte::id_class, var0 -> null);

      for (rQz_1 var9 : var4) {
         var9.id_class(var5);
         var5.id_class().forEach((var1x, var2x) -> id_class.warn("Found validation problem in advancement trigger {}/{}: {}", var2, var1x, var2x));
      }

      return var4;
   }

   public rqO_2 id_class() {
      return this.id_break;
   }
}
