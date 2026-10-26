package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNx_1 extends rzO_2 {
   private static final Logger id_break = LogManager.getLogger();
   final List<ev_3> id_byte;

   public static rzh_3<?> id_byte() {
      return id_class(var0 -> new rNx_1(var0, ImmutableList.of()));
   }

   rNx_1(rQz_1[] var1, Collection<ev_3> var2) {
      super(var1);
      this.id_byte = ImmutableList.copyOf(var2);
   }

   private static rdn_3 id_class(rdn_3 var0, ev_3 var1, Random var2) {
      int var3 = rfU_2.id_class(var2, var1.id_throws(), var1.id_class());
      if (var0.id_break() == rdy_3.XM) {
         var0 = new rdn_3(rdy_3.dm);
         rxy_3.id_class(var0, new eL_2(var1, var3));
      } else {
         var0.id_class(var1, var3);
      }

      return var0;
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_protected;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.id_class();
      ev_3 var4;
      if (this.id_byte.isEmpty()) {
         boolean var5 = var1.id_break() == rdy_3.XM;
         List var6 = rVL.id_boolean.id_case().filter(ev_3::id_implements).filter(var2x -> var5 || var2x.id_class(var1)).collect(Collectors.toList());
         if (var6.isEmpty()) {
            id_break.warn("Couldn't find a compatible enchantment for {}", var1);
            return var1;
         }

         var4 = (ev_3)var6.get(var3.nextInt(var6.size()));
      } else {
         var4 = this.id_byte.get(var3.nextInt(this.id_byte.size()));
      }

      return id_class(var1, var4, var3);
   }
}
