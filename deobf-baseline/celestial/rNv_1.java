package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class rNv_1 extends rzO_2 {
   final rzB_2 id_break;

   public rNv_1(rQz_1[] var1, rzB_2 var2) {
      super(var1);
      this.id_break = var2;
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(this.id_break.id_class());
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_this;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_break() == rdy_3.dJ) {
         an_3 var3 = var2.id_break(this.id_break.id_class());
         if (var3 instanceof rhd_3) {
            GameProfile var4 = ((rhd_3)var3).sv();
            var1.id_int().id_class("SkullOwner", rco_3.id_class(new rcd_3(), var4));
         }
      }

      return var1;
   }
}
