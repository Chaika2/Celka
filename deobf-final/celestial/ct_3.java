package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class ct_3 implements AutoCloseable {
   private static final rqO_2 class_ = new rqO_2("textures/map/map_icons.png");
   static final HU break_ = HU.int_(class_);
   final fY_2 byte_;
   private final Map<String, cw_3> protected_ = Maps.newHashMap();

   public ct_3(fY_2 var1) {
      this.byte_ = var1;
   }

   public cw_3 class_(String var1) {
      return this.protected_.get(var1);
   }

   public rrGb_1 class_(cw_3 var1) {
      return var1 != null ? var1.class_ : null;
   }

   public void class_() {
      for (cw_3 var2 : this.protected_.values()) {
         var2.close();
      }

      this.protected_.clear();
   }

   public void class_(Ml_1 var1, Hx_1 var2, rrGb_1 var3, boolean var4, int var5) {
      this.break_(var3).class_(var1, var2, var4, var5);
   }

   public void class_(rrGb_1 var1) {
      this.break_(var1).class_();
   }

   @Override
   public void close() {
      this.class_();
   }

   private cw_3 break_(rrGb_1 var1) {
      cw_3 var2 = this.protected_.get(var1.throws_());
      if (var2 == null) {
         var2 = new cw_3(this, var1);
         this.protected_.put(var1.throws_(), var2);
      }

      return var2;
   }
}
