package celestial;

import com.google.common.collect.ImmutableMap;

public class rPu_1 extends rPm_1<rsq_3> {
   final rsT_2 class_;

   public rPu_1(rsT_2 var1) {
      super(ImmutableMap.of(il_3.byte_, iC_2.VALUE_PRESENT, il_3.catch_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
   }

   private boolean class_(rRP var1, rsT_2 var2) {
      return var2.class_().break_().test(var1);
   }

   private boolean class_(rsq_3 var1) {
      return var1.SF().byte_(il_3.byte_).isPresent();
   }

   private boolean class_(rfK_2 var1, rRP var2, rsq_3 var3) {
      return this.class_(var3) && var1.equals(var3.SF().byte_(il_3.byte_).get()) && this.class_(var2, var3.su().break_());
   }

   private static rsq_3 class_(rsq_3 var0, rsq_3 var1) {
      rsq_3 var2;
      rsq_3 var3;
      if (var0.protected_() > var1.protected_()) {
         var2 = var0;
         var3 = var1;
      } else {
         var2 = var1;
         var3 = var0;
      }

      var3.SF().break_(il_3.byte_);
      return var2;
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      rfK_2 var5 = var2.SF().byte_(il_3.byte_).get();
      var1.d().byte_(var5.break_()).ifPresent(var3x -> iA_2.class_(var2, var3xx -> this.class_(var5, var3x, var3xx)).reduce(var2, rPu_1::class_));
   }
}
