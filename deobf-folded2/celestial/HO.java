package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HO {
   private final List<Pattern> id_class;
   private final List<Pattern> id_break;
   private final List<Pattern> id_byte;

   HO(List<Pattern> var1, List<Pattern> var2, List<Pattern> var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   private static String id_class(List<Pattern> var0, String var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Pattern var4 : var0) {
         Matcher var5 = var4.matcher(var1);

         while (var5.find()) {
            var2.add(var5.group());
         }
      }

      return String.join(", ", var2);
   }

   ImmutableMap<String, String> id_class() {
      Builder var1 = new Builder();
      String var2 = id_class(this.id_class, Oh_1.id_byte());
      if (!var2.isEmpty()) {
         var1.put("renderer", var2);
      }

      String var3 = id_class(this.id_break, Oh_1.id_protected());
      if (!var3.isEmpty()) {
         var1.put("version", var3);
      }

      String var4 = id_class(this.id_byte, Oh_1.id_class());
      if (!var4.isEmpty()) {
         var1.put("vendor", var4);
      }

      return var1.build();
   }
}
