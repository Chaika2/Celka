package celestial;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class rnd_3 {
   private final Map<rqO_2, rnx_3> class_ = Maps.newHashMap();

   public rcd_3 byte_() {
      rcd_3 var1 = new rcd_3();

      for (rnx_3 var3 : this.class_.values()) {
         var1.class_(var3.break_().toString(), var3.catch_());
      }

      return var1;
   }

   public Collection<rqO_2> class_() {
      return this.class_.keySet();
   }

   public void class_(rcd_3 var1) {
      for (String var3 : var1.protected_()) {
         rqO_2 var4 = new rqO_2(var3);
         this.class_.put(var4, rnx_3.class_(var1.int_(var3), var4));
      }
   }

   public void class_(rhN_2 var1) {
      for (rnx_3 var3 : this.class_.values()) {
         var3.byte_(var1);
      }
   }

   public rnx_3 class_(rqO_2 var1) {
      return this.class_.get(var1);
   }

   public void class_(rnx_3 var1) {
      this.class_.remove(var1.break_());
   }

   public rnx_3 class_(rqO_2 var1, rgP_2 var2) {
      rnx_3 var3 = new rnx_3(var1, var2);
      this.class_.put(var1, var3);
      return var3;
   }

   public void break_(rhN_2 var1) {
      for (rnx_3 var3 : this.class_.values()) {
         var3.protected_(var1);
      }
   }

   public Collection<rnx_3> break_() {
      return this.class_.values();
   }
}
