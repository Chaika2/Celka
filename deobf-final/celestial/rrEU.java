package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class rrEU {
   private final Map<String, rrEe_1> class_ = Maps.newHashMap();
   private final rrEi_1 break_;

   public rrEU(rrEi_1 var1) {
      this.break_ = var1;
   }

   public Stream<rqO_2> class_() {
      return this.class_.entrySet().stream().flatMap(var0 -> var0.getValue().break_(var0.getKey()));
   }

   private static String class_(String var0) {
      return "command_storage_" + var0;
   }

   public rcd_3 class_(rqO_2 var1) {
      String var2 = var1.byte_();
      String var3 = class_(var2);
      rrEe_1 var4 = this.break_.break_(() -> this.class_(var2, var3), var3);
      return var4 != null ? var4.class_(var1.break_()) : new rcd_3();
   }

   public void class_(rqO_2 var1, rcd_3 var2) {
      String var3 = var1.byte_();
      String var4 = class_(var3);
      this.break_.class_(() -> this.class_(var3, var4), var4).class_(var1.break_(), var2);
   }

   private rrEe_1 class_(String var1, String var2) {
      rrEe_1 var3 = new rrEe_1(var2);
      this.class_.put(var1, var3);
      return var3;
   }
}
