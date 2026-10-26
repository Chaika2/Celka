package celestial;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class rnd_3 {
   private final Map<rqO_2, rnx_3> id_class = Maps.newHashMap();

   public rcd_3 id_byte() {
      rcd_3 var1 = new rcd_3();

      for (rnx_3 var3 : this.id_class.values()) {
         var1.id_class(var3.id_break().toString(), var3.id_catch());
      }

      return var1;
   }

   public Collection<rqO_2> id_class() {
      return this.id_class.keySet();
   }

   public void id_class(rcd_3 var1) {
      for (String var3 : var1.id_protected()) {
         rqO_2 var4 = new rqO_2(var3);
         this.id_class.put(var4, rnx_3.id_class(var1.id_int(var3), var4));
      }
   }

   public void id_class(rhN_2 var1) {
      for (rnx_3 var3 : this.id_class.values()) {
         var3.id_byte(var1);
      }
   }

   public rnx_3 id_class(rqO_2 var1) {
      return this.id_class.get(var1);
   }

   public void id_class(rnx_3 var1) {
      this.id_class.remove(var1.id_break());
   }

   public rnx_3 id_class(rqO_2 var1, rgP_2 var2) {
      rnx_3 var3 = new rnx_3(var1, var2);
      this.id_class.put(var1, var3);
      return var3;
   }

   public void id_break(rhN_2 var1) {
      for (rnx_3 var3 : this.id_class.values()) {
         var3.id_protected(var1);
      }
   }

   public Collection<rnx_3> id_break() {
      return this.id_class.values();
   }
}
