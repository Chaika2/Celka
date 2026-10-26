package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Wj_1 extends Ww_1 {
   protected Wj_1(Jq_1 var1) {
      super(Wf_1.PLAYER, var1);
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (var1.class_(var2) instanceof rys_3 var7) {
         GameProfile var8 = null;
         if (var5.final_()) {
            rcd_3 var9 = var5.package_();
            if (var9.byte_("SkullOwner", 10)) {
               var8 = rco_3.class_(var9.int_("SkullOwner"));
            } else if (var9.byte_("SkullOwner", 8) && !StringUtils.isBlank(var9.native_("SkullOwner"))) {
               var8 = new GameProfile((UUID)null, var9.native_("SkullOwner"));
            }
         }

         var7.class_(var8);
      }
   }
}
