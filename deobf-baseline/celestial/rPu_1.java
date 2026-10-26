package celestial;

import com.google.common.collect.ImmutableMap;

public class rPu_1 extends rPm_1<rsq_3> {
   final rsT_2 id_class;

   public rPu_1(rsT_2 var1) {
      super(ImmutableMap.of(il_3.id_byte, iC_2.VALUE_PRESENT, il_3.id_catch, iC_2.VALUE_PRESENT));
      this.id_class = var1;
   }

   private boolean id_class(rRP var1, rsT_2 var2) {
      return var2.id_class().id_break().test(var1);
   }

   private boolean id_class(rsq_3 var1) {
      return var1.SF().id_byte(il_3.id_byte).isPresent();
   }

   private boolean id_class(rfK_2 var1, rRP var2, rsq_3 var3) {
      return this.id_class(var3) && var1.equals(var3.SF().id_byte(il_3.id_byte).get()) && this.id_class(var2, var3.su().id_break());
   }

   private static rsq_3 id_class(rsq_3 var0, rsq_3 var1) {
      rsq_3 var2;
      rsq_3 var3;
      if (var0.id_protected() > var1.id_protected()) {
         var2 = var0;
         var3 = var1;
      } else {
         var2 = var1;
         var3 = var0;
      }

      var3.SF().id_break(il_3.id_byte);
      return var2;
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      rfK_2 var5 = var2.SF().id_byte(il_3.id_byte).get();
      var1.d().id_byte(var5.id_break()).ifPresent(var3x -> iA_2.id_class(var2, var3xx -> this.id_class(var5, var3x, var3xx)).reduce(var2, rPu_1::id_class));
   }
}
