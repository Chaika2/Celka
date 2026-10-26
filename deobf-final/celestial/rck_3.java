package celestial;

import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;

class rck_3 implements rcv_3<rcd_3> {
   @Override
   public String class_() {
      return "COMPOUND";
   }

   public rcd_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(384L);
      if (var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         HashMap var4 = Maps.newHashMap();

         byte var5;
         while ((var5 = rcd_3.class_(var1, var3)) != 0) {
            String var6 = rcd_3.break_(var1, var3);
            var3.class_((long)(224 + 16 * var6.length()));
            rcZ_2 var7 = rcd_3.class_(rcY_2.class_(var5), var6, var1, var2 + 1, var3);
            if (var4.put(var6, var7) != null) {
               var3.class_(288L);
            }
         }

         return new rcd_3(var4);
      }
   }

   @Override
   public String break_() {
      return "TAG_Compound";
   }
}
