package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rQR extends rzO_2 {
   static final Map<rqO_2, rQK> break_ = Maps.newHashMap();
   final ev_3 byte_;
   final rQo_1 protected_;

   rQR(rQz_1[] var1, ev_3 var2, rQo_1 var3) {
      super(var1);
      this.byte_ = var2;
      this.protected_ = var3;
   }

   static {
      break_.put(rQY.class_, rQY::class_);
      break_.put(rQD.class_, rQD::class_);
      break_.put(rQe_1.class_, rQe_1::class_);
   }

   public static rzh_3<?> class_(ev_3 var0, int var1) {
      return class_(var2 -> new rQR(var2, var0, new rQe_1(var1)));
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.implements_);
   }

   public static rzh_3<?> class_(ev_3 var0) {
      return class_(var1 -> new rQR(var1, var0, new rQD()));
   }

   public static rzh_3<?> class_(ev_3 var0, float var1, int var2) {
      return class_(var3 -> new rQR(var3, var0, new rQY(var2, var1)));
   }

   public static rzh_3<?> break_(ev_3 var0) {
      return class_(var1 -> new rQR(var1, var0, new rQe_1(1)));
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      rdn_3 var3 = var2.break_(rzQ_2.implements_);
      if (var3 != null) {
         int var4 = eA_2.class_(this.byte_, var3);
         int var5 = this.protected_.class_(var2.class_(), var1.char_(), var4);
         var1.throws_(var5);
      }

      return var1;
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.int_;
   }
}
