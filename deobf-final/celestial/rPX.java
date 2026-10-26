package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class rPX extends rPm_1<rsq_3> {
   private Set<rdb_3> class_ = ImmutableSet.of();

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().byte_(il_3.new_).get();
      if (!(var2.int_(var5) > 5.0)) {
         iA_2.class_(var2, var5, 0.5F);
         var2.class_(var1, var5, var3);
         if (var2.sZ() && (var2.su().break_() == rsT_2.case_ || var5.sv())) {
            class_(var2, rsq_3.this_.keySet(), var5);
         }

         if (var5.su().break_() == rsT_2.case_ && var2.sd().class_(rdy_3.hB) > rdy_3.hB.implements_() / 2) {
            class_(var2, ImmutableSet.of(rdy_3.hB), var5);
         }

         if (!this.class_.isEmpty() && var2.sd().class_(this.class_)) {
            class_(var2, this.class_, var5);
         }
      }
   }

   public rPX() {
      super(ImmutableMap.of(il_3.new_, iC_2.VALUE_PRESENT, il_3.private_, iC_2.VALUE_PRESENT));
   }

   private static void class_(rsq_3 var0, Set<rdb_3> var1, iB_2 var2) {
      rXA var3 = var0.sd();
      rdn_3 var4 = rdn_3.break_;

      for (int var5 = 0; var5 < var3.else_(); var5++) {
         rdn_3 var6 = var3.extends_(var5);
         if (!var6.class_()) {
            rdb_3 var7 = var6.break_();
            if (var1.contains(var7)) {
               int var8;
               if (var6.char_() > var6.byte_() / 2) {
                  var8 = var6.char_() / 2;
               } else {
                  if (var6.char_() <= 24) {
                     continue;
                  }

                  var8 = var6.char_() - 24;
               }

               var6.catch_(var8);
               var4 = new rdn_3(var7, var8);
               break;
            }
         }
      }

      if (!var4.class_()) {
         iA_2.class_(var0, var4, var2.Ps());
      }
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.class_(var1, var2);
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      return iA_2.class_(var2.SF(), il_3.new_, aI_2.D);
   }

   private static Set<rdb_3> class_(rsq_3 var0, rsq_3 var1) {
      ImmutableSet var2 = var1.su().break_().break_();
      ImmutableSet var3 = var0.su().break_().break_();
      return var2.stream().filter(var1x -> !var3.contains(var1x)).collect(Collectors.toSet());
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().byte_(il_3.new_).get();
      iA_2.class_(var2, var5, 0.5F);
      this.class_ = class_(var2, var5);
   }

   protected void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().break_(il_3.new_);
   }
}
