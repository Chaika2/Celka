package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsk_3 {
   public static final Codec<rrsk_3> byte_ = rVL.rS.dispatch(rrsk_3::class_, rrsW_2::class_);

   protected void class_(rRY var1, rfH_2 var2, rCN var3, Set<rfH_2> var4, rfi_3 var5) {
      this.class_(var1, var2, xu_3.BD.continue_().class_(var3, Boolean.valueOf(true)), var4, var5);
   }

   protected void class_(rRY var1, rfH_2 var2, xc_3 var3, Set<rfH_2> var4, rfi_3 var5) {
      var1.class_(var2, var3, 19);
      var4.add(var2);
      var5.break_(new rfi_3(var2, var2));
   }

   protected abstract rrsW_2<?> class_();

   public abstract void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6);
}
