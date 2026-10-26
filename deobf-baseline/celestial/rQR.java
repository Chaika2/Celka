package celestial;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class rQR extends rzO_2 {
   static final Map<rqO_2, rQK> id_break = Maps.newHashMap();
   final ev_3 id_byte;
   final rQo_1 id_protected;

   rQR(rQz_1[] var1, ev_3 var2, rQo_1 var3) {
      super(var1);
      this.id_byte = var2;
      this.id_protected = var3;
   }

   static {
      id_break.put(rQY.id_class, rQY::id_class);
      id_break.put(rQD.id_class, rQD::id_class);
      id_break.put(rQe_1.id_class, rQe_1::id_class);
   }

   public static rzh_3<?> id_class(ev_3 var0, int var1) {
      return id_class(var2 -> new rQR(var2, var0, new rQe_1(var1)));
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_implements);
   }

   public static rzh_3<?> id_class(ev_3 var0) {
      return id_class(var1 -> new rQR(var1, var0, new rQD()));
   }

   public static rzh_3<?> id_class(ev_3 var0, float var1, int var2) {
      return id_class(var3 -> new rQR(var3, var0, new rQY(var2, var1)));
   }

   public static rzh_3<?> id_break(ev_3 var0) {
      return id_class(var1 -> new rQR(var1, var0, new rQe_1(1)));
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      rdn_3 var3 = var2.id_break(rzQ_2.id_implements);
      if (var3 != null) {
         int var4 = eA_2.id_class(this.id_byte, var3);
         int var5 = this.id_protected.id_class(var2.id_class(), var1.id_char(), var4);
         var1.id_throws(var5);
      }

      return var1;
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_int;
   }
}
