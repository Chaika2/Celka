package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

class rrEe_1 extends rrGc_1 {
   private final Map<String, rcd_3> id_class = Maps.newHashMap();

   @Override
   public rcd_3 id_byte(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      this.id_class.forEach((var1x, var2x) -> var2.id_class(var1x, var2x.id_catch()));
      var1.id_class("contents", var2);
      return var1;
   }

   public rrEe_1(String var1) {
      super(var1);
   }

   public void id_class(String var1, rcd_3 var2) {
      if (var2.id_case()) {
         this.id_class.remove(var1);
      } else {
         this.id_class.put(var1, var2);
      }

      this.id_byte();
   }

   public rcd_3 id_class(String var1) {
      rcd_3 var2 = this.id_class.get(var1);
      return var2 != null ? var2 : new rcd_3();
   }

   @Override
   public void id_class(rcd_3 var1) {
      rcd_3 var2 = var1.id_int("contents");

      for (String var4 : var2.id_protected()) {
         this.id_class.put(var4, var2.id_int(var4));
      }
   }

   public Stream<rqO_2> id_break(String var1) {
      return this.id_class.keySet().stream().map(var1x -> new rqO_2(var1, var1x));
   }
}
