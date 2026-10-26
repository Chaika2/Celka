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
   private static final Logger class_ = LogManager.getLogger();
   private final Map<String, String> break_;
   private final boolean byte_;

   private jC_2(Map<String, String> var1, boolean var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public rpl_3 class_(rgS_2 var1) {
      return Vg_1.class_(var1, this.byte_);
   }

   @Override
   public boolean class_() {
      return this.byte_;
   }

   public static jC_2 class_(rAL var0, List<jj_3> var1) {
      HashMap var2 = Maps.newHashMap();
      boolean var3 = false;

      for (jj_3 var5 : var1) {
         var3 |= var5.class_();
         String var6 = var5.getCode();
         String var7;
         if ("ru_ru".equals(var6)) {
            var7 = "celestial/lang/ru_ru.json";
         } else if ("en_us".equals(var6)) {
            var7 = "celestial/lang/en_us.json";
         } else {
            var7 = String.format("lang/%s.json", var6);
         }

         for (String var9 : var0.class_()) {
            try {
               rqO_2 var10 = new rqO_2(var9, var7);
               class_(var0.byte_(var10), var2);
               rrba_3.class_(var0, var6, var2);
            } catch (FileNotFoundException var11) {
            } catch (Exception var12) {
               class_.warn("Skipped language file: {}:{} ({})", var9, var7, var12.toString());
            }
         }
      }

      return new jC_2(ImmutableMap.copyOf(var2), var3);
   }

   @Override
   public String class_(String var1) {
      return this.break_.getOrDefault(var1, var1);
   }

   private static void class_(List<rAF> var0, Map<String, String> var1) {
      for (rAF var3 : var0) {
         try (InputStream var4 = var3.break_()) {
            rgX_2.class_(var4, var1::put);
         } catch (IOException var9) {
            class_.warn("Failed to load translations from {}", var3, var9);
         }
      }
   }

   @Override
   public boolean break_(String var1) {
      return this.break_.containsKey(var1);
   }

   public Map<String, String> break_() {
      return this.break_;
   }
}
