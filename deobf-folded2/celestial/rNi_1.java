package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNi_1 extends rzO_2 {
   private static final Logger id_break = LogManager.getLogger();
   final rgP_2 id_byte;
   final rzB_2 id_protected;

   rNi_1(rQz_1[] var1, rgP_2 var2, rzB_2 var3) {
      super(var1);
      this.id_byte = var2;
      this.id_protected = var3;
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return this.id_protected != null ? ImmutableSet.of(this.id_protected.id_class()) : ImmutableSet.of();
   }

   public static UnaryOperator<rgP_2> id_class(rzr_3 var0, rzB_2 var1) {
      if (var1 != null) {
         an_3 var2 = var0.id_break(var1.id_class());
         if (var2 != null) {
            gy_3 var3 = var2.PL().id_break(2);
            return var2x -> {
               try {
                  return rgv_3.id_class(var3, var2x, var2, 0);
               } catch (CommandSyntaxException var4) {
                  id_break.warn("Failed to resolve text component", var4);
                  return var2x;
               }
            };
         }
      }

      return var0x -> var0x;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (this.id_byte != null) {
         var1.id_class(id_class(var2, this.id_protected).apply(this.id_byte));
      }

      return var1;
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_finally;
   }
}
