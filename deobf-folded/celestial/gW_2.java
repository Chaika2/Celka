package celestial;

import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;

public class gW_2 extends jY_2<List<String>> {
   private static final rqO_2 id_class = new rqO_2("texts/splashes.txt");
   private static final Random id_break = new Random();
   private final List<String> id_byte = Lists.newArrayList();
   private final rqN_2 id_protected;

   public gW_2(rqN_2 var1) {
      this.id_protected = var1;
   }

   protected List<String> id_class(rAL var1) {
      try {
         List var4;
         try (
            rAF var2 = QY.id_instanceof().F().id_class(id_class);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.id_break(), StandardCharsets.UTF_8));
         ) {
            var4 = var3.lines().map(String::trim).filter(var0 -> var0.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var10) {
         return Collections.emptyList();
      }
   }

   protected void id_class(List<String> var1, rAL var2) {
      this.id_byte.clear();
      this.id_byte.addAll(var1);
   }

   public String id_break() {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if (var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         return "Merry X-mas!";
      } else if (var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         return "Happy new year!";
      } else if (var1.get(2) + 1 == 10 && var1.get(5) == 31) {
         return "OOoooOOOoooo! Spooky!";
      } else if (this.id_byte.isEmpty()) {
         return null;
      } else {
         return this.id_protected != null && id_break.nextInt(this.id_byte.size()) == 42
            ? this.id_protected.id_byte().toUpperCase(Locale.ROOT) + " IS YOU"
            : this.id_byte.get(id_break.nextInt(this.id_byte.size()));
      }
   }
}
