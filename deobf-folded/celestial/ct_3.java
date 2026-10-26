package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class ct_3 implements AutoCloseable {
   private static final rqO_2 id_class = new rqO_2("textures/map/map_icons.png");
   static final HU id_break = HU.id_int(id_class);
   final fY_2 id_byte;
   private final Map<String, cw_3> id_protected = Maps.newHashMap();

   public ct_3(fY_2 var1) {
      this.id_byte = var1;
   }

   public cw_3 id_class(String var1) {
      return this.id_protected.get(var1);
   }

   public rrGb_1 id_class(cw_3 var1) {
      return var1 != null ? var1.id_class : null;
   }

   public void id_class() {
      for (cw_3 var2 : this.id_protected.values()) {
         var2.close();
      }

      this.id_protected.clear();
   }

   public void id_class(Ml_1 var1, Hx_1 var2, rrGb_1 var3, boolean var4, int var5) {
      this.id_break(var3).id_class(var1, var2, var4, var5);
   }

   public void id_class(rrGb_1 var1) {
      this.id_break(var1).id_class();
   }

   @Override
   public void close() {
      this.id_class();
   }

   private cw_3 id_break(rrGb_1 var1) {
      cw_3 var2 = this.id_protected.get(var1.id_throws());
      if (var2 == null) {
         var2 = new cw_3(this, var1);
         this.id_protected.put(var1.id_throws(), var2);
      }

      return var2;
   }
}
