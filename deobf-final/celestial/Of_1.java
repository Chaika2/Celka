package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Of_1 extends jf_3 {
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = new GsonBuilder().create();
   private Ow_1 byte_ = new Ow_1();
   private final rzZ_2 protected_;

   public Of_1(rzZ_2 var1) {
      super(break_, "advancements");
      this.protected_ = var1;
   }

   public Collection<OT> class_() {
      return this.byte_.byte_();
   }

   protected void class_(Map<rqO_2, JsonElement> var1, rAL var2) {
      HashMap var3 = Maps.newHashMap();
      var1.forEach((var2x, var3x) -> {
         try {
            JsonObject var4x = rpY_2.private_(var3x, "advancement");
            Ot_1 var5 = Ot_1.class_(var4x, new rWl_1(var2x, this.protected_));
            var3.put(var2x, var5);
         } catch (JsonParseException | IllegalArgumentException var6x) {
            class_.error("Parsing error loading custom advancement {}: {}", var2x, var6x.getMessage());
         }
      });
      Ow_1 var4 = new Ow_1();
      var4.class_(var3);

      for (OT var6 : var4.break_()) {
         if (var6.byte_() != null) {
            OY.class_(var6);
         }
      }

      this.byte_ = var4;
   }

   public OT class_(rqO_2 var1) {
      return this.byte_.class_(var1);
   }
}
