package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HO {
   private final List<Pattern> class_;
   private final List<Pattern> break_;
   private final List<Pattern> byte_;

   HO(List<Pattern> var1, List<Pattern> var2, List<Pattern> var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   private static String class_(List<Pattern> var0, String var1) {
      ArrayList var2 = Lists.newArrayList();

      for (Pattern var4 : var0) {
         Matcher var5 = var4.matcher(var1);

         while (var5.find()) {
            var2.add(var5.group());
         }
      }

      return String.join(", ", var2);
   }

   ImmutableMap<String, String> class_() {
      Builder var1 = new Builder();
      String var2 = class_(this.class_, Oh_1.byte_());
      if (!var2.isEmpty()) {
         var1.put("renderer", var2);
      }

      String var3 = class_(this.break_, Oh_1.protected_());
      if (!var3.isEmpty()) {
         var1.put("version", var3);
      }

      String var4 = class_(this.byte_, Oh_1.class_());
      if (!var4.isEmpty()) {
         var1.put("vendor", var4);
      }

      return var1.build();
   }
}
