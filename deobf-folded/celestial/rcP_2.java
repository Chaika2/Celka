package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class rcP_2 extends rzO_2 {
   final Map<rLR, rzV_2> id_break;

   public static rcB_2 id_byte() {
      return new rcB_2();
   }

   rcP_2(rQz_1[] var1, Map<rLR, rzV_2> var2) {
      super(var1);
      this.id_break = ImmutableMap.copyOf(var2);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_native;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_break() == rdy_3.ke && !this.id_break.isEmpty()) {
         Random var3 = var2.id_class();
         int var4 = var3.nextInt(this.id_break.size());
         Entry var5 = (Entry)Iterables.get(this.id_break.entrySet(), var4);
         rLR var6 = (rLR)var5.getKey();
         int var7 = ((rzV_2)var5.getValue()).id_class(var3);
         if (!var6.id_class()) {
            var7 *= 20;
         }

         rkJ_2.id_class(var1, var6, var7);
         return var1;
      } else {
         return var1;
      }
   }
}
