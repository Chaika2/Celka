package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class rPX extends rPm_1<rsq_3> {
   private Set<rdb_3> id_class = ImmutableSet.of();

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().id_byte(il_3.id_new).get();
      if (!(var2.id_int(var5) > 5.0)) {
         iA_2.id_class(var2, var5, 0.5F);
         var2.id_class(var1, var5, var3);
         if (var2.sZ() && (var2.su().id_break() == rsT_2.id_case || var5.sv())) {
            id_class(var2, rsq_3.id_this.keySet(), var5);
         }

         if (var5.su().id_break() == rsT_2.id_case && var2.sd().id_class(rdy_3.hB) > rdy_3.hB.id_implements() / 2) {
            id_class(var2, ImmutableSet.of(rdy_3.hB), var5);
         }

         if (!this.id_class.isEmpty() && var2.sd().id_class(this.id_class)) {
            id_class(var2, this.id_class, var5);
         }
      }
   }

   public rPX() {
      super(ImmutableMap.of(il_3.id_new, iC_2.VALUE_PRESENT, il_3.id_private, iC_2.VALUE_PRESENT));
   }

   private static void id_class(rsq_3 var0, Set<rdb_3> var1, iB_2 var2) {
      rXA var3 = var0.sd();
      rdn_3 var4 = rdn_3.id_break;

      for (int var5 = 0; var5 < var3.id_else(); var5++) {
         rdn_3 var6 = var3.id_extends(var5);
         if (!var6.id_class()) {
            rdb_3 var7 = var6.id_break();
            if (var1.contains(var7)) {
               int var8;
               if (var6.id_char() > var6.id_byte() / 2) {
                  var8 = var6.id_char() / 2;
               } else {
                  if (var6.id_char() <= 24) {
                     continue;
                  }

                  var8 = var6.id_char() - 24;
               }

               var6.id_catch(var8);
               var4 = new rdn_3(var7, var8);
               break;
            }
         }
      }

      if (!var4.id_class()) {
         iA_2.id_class(var0, var4, var2.Ps());
      }
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_class(var1, var2);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      return iA_2.id_class(var2.SF(), il_3.id_new, aI_2.D);
   }

   private static Set<rdb_3> id_class(rsq_3 var0, rsq_3 var1) {
      ImmutableSet var2 = var1.su().id_break().id_break();
      ImmutableSet var3 = var0.su().id_break().id_break();
      return var2.stream().filter(var1x -> !var3.contains(var1x)).collect(Collectors.toSet());
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().id_byte(il_3.id_new).get();
      iA_2.id_class(var2, var5, 0.5F);
      this.id_class = id_class(var2, var5);
   }

   protected void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().id_break(il_3.id_new);
   }
}
