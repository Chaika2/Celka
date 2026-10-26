package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class rkG_2 extends rku_3 {
   public rkG_2(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("SkullOwner", 8) && !StringUtils.isBlank(var1.native_("SkullOwner"))) {
         GameProfile var2 = new GameProfile((UUID)null, var1.native_("SkullOwner"));
         var2 = rys_3.break_(var2);
         var1.class_("SkullOwner", rco_3.class_(new rcd_3(), var2));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rgP_2 implements_(rdn_3 var1) {
      if (var1.break_() == rdy_3.dJ && var1.final_()) {
         String var2 = null;
         rcd_3 var3 = var1.package_();
         if (var3.byte_("SkullOwner", 8)) {
            var2 = var3.native_("SkullOwner");
         } else if (var3.byte_("SkullOwner", 10)) {
            rcd_3 var4 = var3.int_("SkullOwner");
            if (var4.byte_("Name", 8)) {
               var2 = var4.native_("Name");
            }
         }

         if (var2 != null) {
            return new rgn_3(this.break_() + ".named", var2);
         }
      }

      return super.implements_(var1);
   }
}
