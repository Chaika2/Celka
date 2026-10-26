package celestial;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class rkG_2 extends rku_3 {
   public rkG_2(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("SkullOwner", 8) && !StringUtils.isBlank(var1.id_native("SkullOwner"))) {
         GameProfile var2 = new GameProfile((UUID)null, var1.id_native("SkullOwner"));
         var2 = rys_3.id_break(var2);
         var1.id_class("SkullOwner", rco_3.id_class(new rcd_3(), var2));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rgP_2 id_implements(rdn_3 var1) {
      if (var1.id_break() == rdy_3.dJ && var1.id_final()) {
         String var2 = null;
         rcd_3 var3 = var1.id_package();
         if (var3.id_byte("SkullOwner", 8)) {
            var2 = var3.id_native("SkullOwner");
         } else if (var3.id_byte("SkullOwner", 10)) {
            rcd_3 var4 = var3.id_int("SkullOwner");
            if (var4.id_byte("Name", 8)) {
               var2 = var4.id_native("Name");
            }
         }

         if (var2 != null) {
            return new rgn_3(this.id_break() + ".named", var2);
         }
      }

      return super.id_implements(var1);
   }
}
