package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class rrEU {
   private final Map<String, rrEe_1> id_class = Maps.newHashMap();
   private final rrEi_1 id_break;

   public rrEU(rrEi_1 var1) {
      this.id_break = var1;
   }

   public Stream<rqO_2> id_class() {
      return this.id_class.entrySet().stream().flatMap(var0 -> var0.getValue().id_break(var0.getKey()));
   }

   private static String id_class(String var0) {
      return "command_storage_" + var0;
   }

   public rcd_3 id_class(rqO_2 var1) {
      String var2 = var1.id_byte();
      String var3 = id_class(var2);
      rrEe_1 var4 = this.id_break.id_break(() -> this.id_class(var2, var3), var3);
      return var4 != null ? var4.id_class(var1.id_break()) : new rcd_3();
   }

   public void id_class(rqO_2 var1, rcd_3 var2) {
      String var3 = var1.id_byte();
      String var4 = id_class(var3);
      this.id_break.id_class(() -> this.id_class(var3, var4), var4).id_class(var1.id_break(), var2);
   }

   private rrEe_1 id_class(String var1, String var2) {
      rrEe_1 var3 = new rrEe_1(var2);
      this.id_class.put(var1, var3);
      return var3;
   }
}
