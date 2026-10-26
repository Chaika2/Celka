package celestial;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;

class rcp_3 implements rcv_3<rcy_3> {
   @Override
   public String class_() {
      return "LIST";
   }

   public rcy_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(296L);
      if (var2 > 512) {
         throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
      } else {
         byte var4 = var1.readByte();
         int var5 = var1.readInt();
         if (var4 == 0 && var5 > 0) {
            throw new RuntimeException("Missing type on ListTag");
         } else {
            var3.class_(32L * (long)var5);
            rcv_3 var6 = rcY_2.class_(var4);
            ArrayList var7 = Lists.newArrayListWithCapacity(var5);

            for (int var8 = 0; var8 < var5; var8++) {
               var7.add(var6.break_(var1, var2 + 1, var3));
            }

            return new rcy_3(var7, var4);
         }
      }
   }

   @Override
   public String break_() {
      return "TAG_List";
   }
}
