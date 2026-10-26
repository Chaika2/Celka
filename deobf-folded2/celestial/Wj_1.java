package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Wj_1 extends Ww_1 {
   protected Wj_1(Jq_1 var1) {
      super(Wf_1.PLAYER, var1);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.id_class(var1, var2, var3, var4, var5);
      if (var1.id_class(var2) instanceof rys_3 var7) {
         GameProfile var8 = null;
         if (var5.id_final()) {
            rcd_3 var9 = var5.id_package();
            if (var9.id_byte("SkullOwner", 10)) {
               var8 = rco_3.id_class(var9.id_int("SkullOwner"));
            } else if (var9.id_byte("SkullOwner", 8) && !StringUtils.isBlank(var9.id_native("SkullOwner"))) {
               var8 = new GameProfile((UUID)null, var9.id_native("SkullOwner"));
            }
         }

         var7.id_class(var8);
      }
   }
}
