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
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = new GsonBuilder().create();
   private Ow_1 id_byte = new Ow_1();
   private final rzZ_2 id_protected;

   public Of_1(rzZ_2 var1) {
      super(id_break, "advancements");
      this.id_protected = var1;
   }

   public Collection<OT> id_class() {
      return this.id_byte.id_byte();
   }

   protected void id_class(Map<rqO_2, JsonElement> var1, rAL var2) {
      HashMap var3 = Maps.newHashMap();
      var1.forEach((var2x, var3x) -> {
         try {
            JsonObject var4x = rpY_2.id_private(var3x, "advancement");
            Ot_1 var5 = Ot_1.id_class(var4x, new rWl_1(var2x, this.id_protected));
            var3.put(var2x, var5);
         } catch (JsonParseException | IllegalArgumentException var6x) {
            id_class.error("Parsing error loading custom advancement {}: {}", var2x, var6x.getMessage());
         }
      });
      Ow_1 var4 = new Ow_1();
      var4.id_class(var3);

      for (OT var6 : var4.id_break()) {
         if (var6.id_byte() != null) {
            OY.id_class(var6);
         }
      }

      this.id_byte = var4;
   }

   public OT id_class(rqO_2 var1) {
      return this.id_byte.id_class(var1);
   }
}
