package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rNq_1 extends rzO_2 {
   final List<rNt_1> id_break;

   rNq_1(rQz_1[] var1, List<rNt_1> var2) {
      super(var1);
      this.id_break = ImmutableList.copyOf(var2);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_implements;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.id_class();

      for (rNt_1 var5 : this.id_break) {
         UUID var6 = var5.id_throws;
         if (var6 == null) {
            var6 = UUID.randomUUID();
         }

         rXQ var7 = rqR_2.id_class(var5.id_case, var3);
         var1.id_class(var5.id_break, new ix_3(var6, var5.id_class, (double)var5.id_protected.id_break(var3), var5.id_byte), var7);
      }

      return var1;
   }
}
