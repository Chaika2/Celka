package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrF_2 extends rPm_1<iB_2> {
   private final float id_class;
   private final int id_byte;
   private final int id_protected;
   private Optional<rfH_2> id_throws = Optional.empty();

   public rrF_2(int var1, float var2, int var3) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_break, iC_2.REGISTERED, il_3.id_instanceof, iC_2.REGISTERED));
      this.id_byte = var1;
      this.id_class = var2;
      this.id_protected = var3;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      Optional var3 = var1.d().id_byte(var0 -> var0 == rRP.id_continue, var0 -> true, var2.Bs(), this.id_protected + 1, rRr_1.ANY);
      if (var3.isPresent() && ((rfH_2)var3.get()).id_class(var2.Ps(), (double)this.id_protected)) {
         this.id_throws = var3;
      } else {
         this.id_throws = Optional.empty();
      }

      return true;
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = this.id_throws;
      if (!var6.isPresent()) {
         var6 = var1.d().id_class(var0 -> var0 == rRP.id_continue, var0 -> true, rRr_1.ANY, var2.Bs(), this.id_byte, var2.Sa());
         if (!var6.isPresent()) {
            Optional var7 = var5.id_byte(il_3.id_break);
            if (var7.isPresent()) {
               var6 = Optional.of(((rfK_2)var7.get()).id_break());
            }
         }
      }

      if (var6.isPresent()) {
         var5.id_break(il_3.id_this);
         var5.id_break(il_3.id_final);
         var5.id_break(il_3.id_continue);
         var5.id_break(il_3.id_new);
         var5.id_class(il_3.id_instanceof, rfK_2.id_class(var1.E(), (rfH_2)var6.get()));
         if (!((rfH_2)var6.get()).id_class(var2.Ps(), (double)this.id_protected)) {
            var5.id_class(il_3.id_volatile, new iH_2((rfH_2)var6.get(), this.id_class, this.id_protected));
         }
      }
   }
}
