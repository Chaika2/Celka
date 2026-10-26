package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jC_2 extends rgX_2 {
   private static final Logger id_class = LogManager.getLogger();
   private final Map<String, String> id_break;
   private final boolean id_byte;

   private jC_2(Map<String, String> var1, boolean var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public rpl_3 id_class(rgS_2 var1) {
      return Vg_1.id_class(var1, this.id_byte);
   }

   @Override
   public boolean id_class() {
      return this.id_byte;
   }

   public static jC_2 id_class(rAL var0, List<jj_3> var1) {
      HashMap var2 = Maps.newHashMap();
      boolean var3 = false;

      for (jj_3 var5 : var1) {
         var3 |= var5.id_class();
         String var6 = var5.getCode();
         String var7;
         if ("ru_ru".equals(var6)) {
            var7 = "celestial/lang/ru_ru.json";
         } else if ("en_us".equals(var6)) {
            var7 = "celestial/lang/en_us.json";
         } else {
            var7 = String.format("lang/%s.json", var6);
         }

         for (String var9 : var0.id_class()) {
            try {
               rqO_2 var10 = new rqO_2(var9, var7);
               id_class(var0.id_byte(var10), var2);
               rrba_3.id_class(var0, var6, var2);
            } catch (FileNotFoundException var11) {
            } catch (Exception var12) {
               id_class.warn("Skipped language file: {}:{} ({})", var9, var7, var12.toString());
            }
         }
      }

      return new jC_2(ImmutableMap.copyOf(var2), var3);
   }

   @Override
   public String id_class(String var1) {
      return this.id_break.getOrDefault(var1, var1);
   }

   private static void id_class(List<rAF> var0, Map<String, String> var1) {
      for (rAF var3 : var0) {
         try (InputStream var4 = var3.id_break()) {
            rgX_2.id_class(var4, var1::put);
         } catch (IOException var9) {
            id_class.warn("Failed to load translations from {}", var3, var9);
         }
      }
   }

   @Override
   public boolean id_break(String var1) {
      return this.id_break.containsKey(var1);
   }

   public Map<String, String> id_break() {
      return this.id_break;
   }
}
