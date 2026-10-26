package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jV_2 implements rAn_1 {
   private static final Logger break_ = LogManager.getLogger();
   public static final jj_3 class_ = new jj_3("en_us", "US", "English", false);
   private Map<String, jj_3> byte_ = ImmutableMap.of("en_us", class_);
   private String protected_;
   private jj_3 throws_ = class_;

   public SortedSet<jj_3> byte_() {
      return Sets.newTreeSet(this.byte_.values());
   }

   public jV_2(String var1) {
      this.protected_ = var1;
   }

   public jj_3 class_(String var1) {
      return this.byte_.get(var1);
   }

   public static Map<String, jj_3> class_(Stream<rAC> var0) {
      HashMap var1 = Maps.newHashMap();
      var0.forEach(var1x -> {
         try {
            VB var2 = var1x.class_(VB.class_);
            if (var2 != null) {
               for (jj_3 var4 : var2.class_()) {
                  var1.putIfAbsent(var4.getCode(), var4);
               }
            }
         } catch (RuntimeException | IOException var5) {
            break_.warn("Unable to parse language metadata section of resourcepack: {}", var1x.class_(), var5);
         }
      });
      return ImmutableMap.copyOf(var1);
   }

   @Override
   public void class_(rAL var1) {
      this.byte_ = class_(var1.break_());
      jj_3 var2 = this.byte_.getOrDefault("en_us", class_);
      this.throws_ = this.byte_.getOrDefault(this.protected_, var2);
      ArrayList var3 = Lists.newArrayList(new jj_3[]{var2});
      if (this.throws_ != var2) {
         var3.add(this.throws_);
      }

      jC_2 var4 = jC_2.class_(var1, var3);
      jI_2.class_(var4);
      rgX_2.class_(var4);
   }

   public void class_(jj_3 var1) {
      this.protected_ = var1.getCode();
      this.throws_ = var1;
   }

   public jj_3 break_() {
      return this.throws_;
   }
}
