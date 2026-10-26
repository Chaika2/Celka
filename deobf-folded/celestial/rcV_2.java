package celestial;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.util.Map.Entry;

class rcV_2 extends AbstractStringBuilder<rcZ_2, rcd_3> {
   protected rcV_2(rcf_3 var1) {
      super(var1);
   }

   protected DataResult<rcZ_2> id_class(rcd_3 var1, rcZ_2 var2) {
      if (var2 == null || var2 == rcN_2.id_break) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof rcd_3)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         rcd_3 var3 = new rcd_3(Maps.newHashMap(((rcd_3)var2).id_private()));

         for (Entry var5 : var1.id_private().entrySet()) {
            var3.id_class((String)var5.getKey(), (rcZ_2)var5.getValue());
         }

         return DataResult.success(var3);
      }
   }

   protected rcd_3 id_class(String var1, rcZ_2 var2, rcd_3 var3) {
      var3.id_class(var1, var2);
      return var3;
   }

   protected rcd_3 id_class() {
      return new rcd_3();
   }
}
