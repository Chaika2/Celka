package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Map;
import java.util.Objects;

class Zz_1 implements rRF {
   Zz_1(ZW var1, ZJ var2, rRu_1 var3, Map var4) {
      this.id_protected = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
   }

   private <T extends rRC<T>> void id_class(rRA<T> var1, ZQ<T> var2) {
      rgn_3 var3 = new rgn_3(var1.id_break());
      rVi_1 var4 = new rgN_2(var1.id_class()).id_class(rgF_2.YELLOW);
      rRC var5 = this.id_break.id_class(var1);
      String var6 = var5.id_break();
      rVi_1 var7 = new rgn_3("editGamerule.default", new rgN_2(var6)).id_class(rgF_2.GRAY);
      String var8 = var1.id_break() + ".description";
      ImmutableList var9;
      String var10;
      if (jI_2.id_class(var8)) {
         Builder var11 = ImmutableList.builder().add(var4.id_catch());
         rgn_3 var12 = new rgn_3(var8);
         this.id_protected.id_class.id_super.id_break(var12, 150).forEach(var11::add);
         var9 = var11.add(var7.id_catch()).build();
         var10 = var12.getString() + "\n" + var7.getString();
      } else {
         var9 = ImmutableList.of(var4.id_catch(), var7.id_catch());
         var10 = var7.getString();
      }

      this.id_byte.computeIfAbsent(var1.id_byte(), var0 -> Maps.newHashMap()).put(var1, var2.create(var3, var9, var10, (T)var5));
   }

   @Override
   public void id_class(rRA<rRm_1> var1, rRn_1<rRm_1> var2) {
      this.id_class(var1, (var1x, var2x, var3, var4) -> {
         ZJ var10002 = this.id_protected.id_class;
         Objects.requireNonNull(this.id_protected.id_class);
         return new Zx_1(var10002, var1x, var2x, var3, var4);
      });
   }

   @Override
   public void id_break(rRA<rRL> var1, rRn_1<rRL> var2) {
      this.id_class(var1, (var1x, var2x, var3, var4) -> {
         ZJ var10002 = this.id_protected.id_class;
         Objects.requireNonNull(this.id_protected.id_class);
         return new ZN(var10002, var1x, var2x, var3, var4);
      });
   }
}
