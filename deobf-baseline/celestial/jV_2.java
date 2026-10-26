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
   private static final Logger id_break = LogManager.getLogger();
   public static final jj_3 id_class = new jj_3("en_us", "US", "English", false);
   private Map<String, jj_3> id_byte = ImmutableMap.of("en_us", id_class);
   private String id_protected;
   private jj_3 id_throws = id_class;

   public SortedSet<jj_3> id_byte() {
      return Sets.newTreeSet(this.id_byte.values());
   }

   public jV_2(String var1) {
      this.id_protected = var1;
   }

   public jj_3 id_class(String var1) {
      return this.id_byte.get(var1);
   }

   public static Map<String, jj_3> id_class(Stream<rAC> var0) {
      HashMap var1 = Maps.newHashMap();
      var0.forEach(var1x -> {
         try {
            VB var2 = var1x.id_class(VB.id_class);
            if (var2 != null) {
               for (jj_3 var4 : var2.id_class()) {
                  var1.putIfAbsent(var4.getCode(), var4);
               }
            }
         } catch (RuntimeException | IOException var5) {
            id_break.warn("Unable to parse language metadata section of resourcepack: {}", var1x.id_class(), var5);
         }
      });
      return ImmutableMap.copyOf(var1);
   }

   @Override
   public void id_class(rAL var1) {
      this.id_byte = id_class(var1.id_break());
      jj_3 var2 = this.id_byte.getOrDefault("en_us", id_class);
      this.id_throws = this.id_byte.getOrDefault(this.id_protected, var2);
      ArrayList var3 = Lists.newArrayList(new jj_3[]{var2});
      if (this.id_throws != var2) {
         var3.add(this.id_throws);
      }

      jC_2 var4 = jC_2.id_class(var1, var3);
      jI_2.id_class(var4);
      rgX_2.id_class(var4);
   }

   public void id_class(jj_3 var1) {
      this.id_protected = var1.getCode();
      this.id_throws = var1;
   }

   public jj_3 id_break() {
      return this.id_throws;
   }
}
