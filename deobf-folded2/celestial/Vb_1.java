package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Vb_1 {
   NONE("none"),
   PARTIAL("partial"),
   FULL("full");

   private static final Map<String, Vb_1> field_217824_d = Arrays.stream(values()).collect(Collectors.toMap(Vb_1::id_class, var0 -> (Vb_1)var0));
   private final String field_217825_e;

   private Vb_1(String var3) {
      this.field_217825_e = var3;
   }

   public static Vb_1 id_class(String var0) {
      return field_217824_d.getOrDefault(var0, NONE);
   }

   public String id_class() {
      return this.field_217825_e;
   }
}
