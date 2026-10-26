package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Map;
import java.util.Objects;

class Zz_1 implements rRF {
   Zz_1(ZW var1, ZJ var2, rRu_1 var3, Map var4) {
      this.protected_ = var1;
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   private <T extends rRC<T>> void class_(rRA<T> var1, ZQ<T> var2) {
      rgn_3 var3 = new rgn_3(var1.break_());
      rVi_1 var4 = new rgN_2(var1.class_()).class_(rgF_2.YELLOW);
      rRC var5 = this.break_.class_(var1);
      String var6 = var5.break_();
      rVi_1 var7 = new rgn_3("editGamerule.default", new rgN_2(var6)).class_(rgF_2.GRAY);
      String var8 = var1.break_() + ".description";
      ImmutableList var9;
      String var10;
      if (jI_2.class_(var8)) {
         Builder var11 = ImmutableList.builder().add(var4.catch_());
         rgn_3 var12 = new rgn_3(var8);
         this.protected_.class_.super_.break_(var12, 150).forEach(var11::add);
         var9 = var11.add(var7.catch_()).build();
         var10 = var12.getString() + "\n" + var7.getString();
      } else {
         var9 = ImmutableList.of(var4.catch_(), var7.catch_());
         var10 = var7.getString();
      }

      this.byte_.computeIfAbsent(var1.byte_(), var0 -> Maps.newHashMap()).put(var1, var2.create(var3, var9, var10, (T)var5));
   }

   @Override
   public void class_(rRA<rRm_1> var1, rRn_1<rRm_1> var2) {
      this.class_(var1, (var1x, var2x, var3, var4) -> {
         ZJ var10002 = this.protected_.class_;
         Objects.requireNonNull(this.protected_.class_);
         return new Zx_1(var10002, var1x, var2x, var3, var4);
      });
   }

   @Override
   public void break_(rRA<rRL> var1, rRn_1<rRL> var2) {
      this.class_(var1, (var1x, var2x, var3, var4) -> {
         ZJ var10002 = this.protected_.class_;
         Objects.requireNonNull(this.protected_.class_);
         return new ZN(var10002, var1x, var2x, var3, var4);
      });
   }
}
