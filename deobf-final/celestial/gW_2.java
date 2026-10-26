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
   private static final rqO_2 class_ = new rqO_2("texts/splashes.txt");
   private static final Random break_ = new Random();
   private final List<String> byte_ = Lists.newArrayList();
   private final rqN_2 protected_;

   public gW_2(rqN_2 var1) {
      this.protected_ = var1;
   }

   protected List<String> class_(rAL var1) {
      try {
         List var4;
         try (
            rAF var2 = QY.instanceof_().F().class_(class_);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.break_(), StandardCharsets.UTF_8));
         ) {
            var4 = var3.lines().map(String::trim).filter(var0 -> var0.hashCode() != 125780783).collect(Collectors.toList());
         }

         return var4;
      } catch (IOException var10) {
         return Collections.emptyList();
      }
   }

   protected void class_(List<String> var1, rAL var2) {
      this.byte_.clear();
      this.byte_.addAll(var1);
   }

   public String break_() {
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if (var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         return "Merry X-mas!";
      } else if (var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         return "Happy new year!";
      } else if (var1.get(2) + 1 == 10 && var1.get(5) == 31) {
         return "OOoooOOOoooo! Spooky!";
      } else if (this.byte_.isEmpty()) {
         return null;
      } else {
         return this.protected_ != null && break_.nextInt(this.byte_.size()) == 42
            ? this.protected_.byte_().toUpperCase(Locale.ROOT) + " IS YOU"
            : this.byte_.get(break_.nextInt(this.byte_.size()));
      }
   }
}
