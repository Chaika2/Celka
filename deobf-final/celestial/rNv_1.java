package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class rNv_1 extends rzO_2 {
   final rzB_2 break_;

   public rNv_1(rQz_1[] var1, rzB_2 var2) {
      super(var1);
      this.break_ = var2;
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(this.break_.class_());
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.this_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.break_() == rdy_3.dJ) {
         an_3 var3 = var2.break_(this.break_.class_());
         if (var3 instanceof rhd_3) {
            GameProfile var4 = ((rhd_3)var3).sv();
            var1.int_().class_("SkullOwner", rco_3.class_(new rcd_3(), var4));
         }
      }

      return var1;
   }
}
