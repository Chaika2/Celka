package celestial;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWl_1 {
   private static final Logger class_ = LogManager.getLogger();
   private final rqO_2 break_;
   private final rzZ_2 byte_;
   private final Gson protected_ = rzF_2.class_().create();

   public rWl_1(rqO_2 var1, rzZ_2 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public final rQz_1[] class_(JsonArray var1, String var2, rzk_3 var3) {
      rQz_1[] var4 = (rQz_1[])this.protected_.fromJson(var1, rQz_1[].class);
      rQs_1 var5 = new rQs_1(var3, this.byte_::class_, var0 -> null);

      for (rQz_1 var9 : var4) {
         var9.class_(var5);
         var5.class_().forEach((var1x, var2x) -> class_.warn("Found validation problem in advancement trigger {}/{}: {}", var2, var1x, var2x));
      }

      return var4;
   }

   public rqO_2 class_() {
      return this.break_;
   }
}
