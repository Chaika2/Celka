package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNN extends rzO_2 {
   static final Logger id_protected = LogManager.getLogger();
   public static final rrrZ<?> id_break = rrrZ.id_int;
   public static final rrGh_1 id_byte = rrGh_1.MANSION;
   final rrrZ<?> id_throws;
   final rrGh_1 id_case;
   final byte id_catch;
   final int id_private;
   final boolean id_implements;

   public static rNc_1 id_byte() {
      return new rNc_1();
   }

   rNN(rQz_1[] var1, rrrZ<?> var2, rrGh_1 var3, byte var4, int var5, boolean var6) {
      super(var1);
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = var4;
      this.id_private = var5;
      this.id_implements = var6;
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_case);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_extends;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_break() != rdy_3.dM) {
         return var1;
      } else {
         rjU_2 var3 = var2.id_break(rzQ_2.id_case);
         if (var3 != null) {
            rrEm_1 var4 = var2.id_byte();
            rfH_2 var5 = var4.id_class(this.id_throws, new rfH_2(var3), this.id_private, this.id_implements);
            if (var5 != null) {
               rdn_3 var6 = rxI_2.id_class(var4, var5.b_(), var5.d_(), this.id_catch, true, true);
               rxI_2.id_class(var4, var6);
               rrGb_1.id_class(var6, var5, "+", this.id_case);
               var6.id_class(new rgn_3("filled_map." + this.id_throws.id_catch().toLowerCase(Locale.ROOT)));
               return var6;
            }
         }

         return var1;
      }
   }
}
