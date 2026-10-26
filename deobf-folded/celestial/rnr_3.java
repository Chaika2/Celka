package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public enum rnr_3 {
   INTEGER("integer"),
   HEARTS("hearts");

   private final String field_211840_c;
   private static final Map<String, rnr_3> field_211841_d;

   private rnr_3(String var3) {
      this.field_211840_c = var3;
   }

   static {
      Builder var0 = ImmutableMap.builder();

      for (rnr_3 var4 : values()) {
         var0.put(var4.field_211840_c, var4);
      }

      field_211841_d = var0.build();
   }

   public String id_class() {
      return this.field_211840_c;
   }

   public static rnr_3 id_class(String var0) {
      return field_211841_d.getOrDefault(var0, INTEGER);
   }
}
