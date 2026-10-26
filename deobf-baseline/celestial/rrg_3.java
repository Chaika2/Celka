package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;

public class rrg_3 extends rPm_1<iB_2> {
   private rLq_1 id_class;
   private int id_byte;

   private void id_byte(rrEm_1 var1, iB_2 var2, rfH_2 var3) {
      iZ_2 var4 = var2.SF();
      rfK_2 var5 = rfK_2.id_class(var1.E(), var3);
      if (var4.id_byte(il_3.id_synchronized).isPresent()) {
         var4.id_byte(il_3.id_synchronized).get().add(var5);
      } else {
         var4.id_class(il_3.id_synchronized, Sets.newHashSet(new rfK_2[]{var5}));
      }
   }

   public rrg_3() {
      super(ImmutableMap.of(il_3.id_this, iC_2.VALUE_PRESENT, il_3.id_synchronized, iC_2.REGISTERED));
   }

   private static boolean id_class(rrEm_1 var0, iB_2 var1, rfK_2 var2) {
      return var2.id_class() != var0.E() || !var2.id_break().id_class(var1.Ps(), 2.0);
   }

   private static boolean id_class(rrEm_1 var0, iB_2 var1, rfH_2 var2) {
      iZ_2 var3 = var1.SF();
      return !var3.id_class(il_3.id_catch)
         ? false
         : var3.id_byte(il_3.id_catch)
            .get()
            .stream()
            .filter(var1x -> var1x.BC() == var1.BC())
            .filter(var1x -> var2.id_class(var1x.Ps(), 2.0))
            .anyMatch(var2x -> id_break(var0, var2x, var2));
   }

   public static void id_class(rrEm_1 var0, iB_2 var1, rLq_1 var2, rLq_1 var3) {
      iZ_2 var4 = var1.SF();
      if (var4.id_class(il_3.id_synchronized)) {
         Iterator var5 = var4.id_byte(il_3.id_synchronized).get().iterator();

         while (var5.hasNext()) {
            rfK_2 var6 = (rfK_2)var5.next();
            rfH_2 var7 = var6.id_break();
            if ((var2 == null || !var2.id_byte().equals(var7)) && (var3 == null || !var3.id_byte().equals(var7))) {
               if (id_class(var0, var1, var6)) {
                  var5.remove();
               } else {
                  xc_3 var8 = var0.id_byte(var7);
                  if (!var8.id_class(rls_3.id_private)) {
                     var5.remove();
                  } else {
                     dN_2 var9 = (dN_2)var8.id_break();
                     if (!var9.id_private(var8)) {
                        var5.remove();
                     } else if (id_class(var0, var1, var7)) {
                        var5.remove();
                     } else {
                        var9.id_class(var0, var8, var7, false);
                        var5.remove();
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      rLC var3 = var2.SF().id_byte(il_3.id_this).get();
      if (!var3.id_break() && !var3.id_byte()) {
         if (!Objects.equals(this.id_class, var3.id_private())) {
            this.id_byte = 20;
            return true;
         } else {
            if (this.id_byte > 0) {
               this.id_byte--;
            }

            return this.id_byte == 0;
         }
      } else {
         return false;
      }
   }

   private static boolean id_break(rrEm_1 var0, iB_2 var1, rfH_2 var2) {
      if (!var1.SF().id_class(il_3.id_this)) {
         return false;
      } else {
         rLC var3 = var1.SF().id_byte(il_3.id_this).get();
         if (var3.id_byte()) {
            return false;
         } else {
            rLq_1 var4 = var3.id_implements();
            if (var4 == null) {
               return false;
            } else {
               rLq_1 var5 = var3.id_private();
               return var2.equals(var4.id_byte()) || var2.equals(var5.id_byte());
            }
         }
      }
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      rLC var5 = var2.SF().id_byte(il_3.id_this).get();
      this.id_class = var5.id_private();
      rLq_1 var6 = var5.id_implements();
      rLq_1 var7 = var5.id_private();
      rfH_2 var8 = var6.id_byte();
      xc_3 var9 = var1.id_byte(var8);
      if (var9.id_class(rls_3.id_private)) {
         dN_2 var10 = (dN_2)var9.id_break();
         if (!var10.id_private(var9)) {
            var10.id_class(var1, var9, var8, true);
         }

         this.id_byte(var1, var2, var8);
      }

      rfH_2 var13 = var7.id_byte();
      xc_3 var11 = var1.id_byte(var13);
      if (var11.id_class(rls_3.id_private)) {
         dN_2 var12 = (dN_2)var11.id_break();
         if (!var12.id_private(var11)) {
            var12.id_class(var1, var11, var13, true);
            this.id_byte(var1, var2, var13);
         }
      }

      id_class(var1, var2, var6, var7);
   }
}
