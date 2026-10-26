package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsk_3 {
   public static final Codec<rrsk_3> id_byte = rVL.rS.dispatch(rrsk_3::id_class, rrsW_2::id_class);

   protected void id_class(rRY var1, rfH_2 var2, rCN var3, Set<rfH_2> var4, rfi_3 var5) {
      this.id_class(var1, var2, xu_3.BD.id_continue().id_class(var3, Boolean.valueOf(true)), var4, var5);
   }

   protected void id_class(rRY var1, rfH_2 var2, xc_3 var3, Set<rfH_2> var4, rfi_3 var5) {
      var1.id_class(var2, var3, 19);
      var4.add(var2);
      var5.id_break(new rfi_3(var2, var2));
   }

   protected abstract rrsW_2<?> id_class();

   public abstract void id_class(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6);
}
