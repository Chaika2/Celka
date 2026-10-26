package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

class rrEe_1 extends rrGc_1 {
   private final Map<String, rcd_3> class_ = Maps.newHashMap();

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      this.class_.forEach((var1x, var2x) -> var2.class_(var1x, var2x.catch_()));
      var1.class_("contents", var2);
      return var1;
   }

   public rrEe_1(String var1) {
      super(var1);
   }

   public void class_(String var1, rcd_3 var2) {
      if (var2.case_()) {
         this.class_.remove(var1);
      } else {
         this.class_.put(var1, var2);
      }

      this.byte_();
   }

   public rcd_3 class_(String var1) {
      rcd_3 var2 = this.class_.get(var1);
      return var2 != null ? var2 : new rcd_3();
   }

   @Override
   public void class_(rcd_3 var1) {
      rcd_3 var2 = var1.int_("contents");

      for (String var4 : var2.protected_()) {
         this.class_.put(var4, var2.int_(var4));
      }
   }

   public Stream<rqO_2> break_(String var1) {
      return this.class_.keySet().stream().map(var1x -> new rqO_2(var1, var1x));
   }
}
