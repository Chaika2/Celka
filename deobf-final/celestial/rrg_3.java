package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;

public class rrg_3 extends rPm_1<iB_2> {
   private rLq_1 class_;
   private int byte_;

   private void byte_(rrEm_1 var1, iB_2 var2, rfH_2 var3) {
      iZ_2 var4 = var2.SF();
      rfK_2 var5 = rfK_2.class_(var1.E(), var3);
      if (var4.byte_(il_3.synchronized_).isPresent()) {
         var4.byte_(il_3.synchronized_).get().add(var5);
      } else {
         var4.class_(il_3.synchronized_, Sets.newHashSet(new rfK_2[]{var5}));
      }
   }

   public rrg_3() {
      super(ImmutableMap.of(il_3.this_, iC_2.VALUE_PRESENT, il_3.synchronized_, iC_2.REGISTERED));
   }

   private static boolean class_(rrEm_1 var0, iB_2 var1, rfK_2 var2) {
      return var2.class_() != var0.E() || !var2.break_().class_(var1.Ps(), 2.0);
   }

   private static boolean class_(rrEm_1 var0, iB_2 var1, rfH_2 var2) {
      iZ_2 var3 = var1.SF();
      return !var3.class_(il_3.catch_)
         ? false
         : var3.byte_(il_3.catch_)
            .get()
            .stream()
            .filter(var1x -> var1x.BC() == var1.BC())
            .filter(var1x -> var2.class_(var1x.Ps(), 2.0))
            .anyMatch(var2x -> break_(var0, var2x, var2));
   }

   public static void class_(rrEm_1 var0, iB_2 var1, rLq_1 var2, rLq_1 var3) {
      iZ_2 var4 = var1.SF();
      if (var4.class_(il_3.synchronized_)) {
         Iterator var5 = var4.byte_(il_3.synchronized_).get().iterator();

         while (var5.hasNext()) {
            rfK_2 var6 = (rfK_2)var5.next();
            rfH_2 var7 = var6.break_();
            if ((var2 == null || !var2.byte_().equals(var7)) && (var3 == null || !var3.byte_().equals(var7))) {
               if (class_(var0, var1, var6)) {
                  var5.remove();
               } else {
                  xc_3 var8 = var0.byte_(var7);
                  if (!var8.class_(rls_3.private_)) {
                     var5.remove();
                  } else {
                     dN_2 var9 = (dN_2)var8.break_();
                     if (!var9.private_(var8)) {
                        var5.remove();
                     } else if (class_(var0, var1, var7)) {
                        var5.remove();
                     } else {
                        var9.class_(var0, var8, var7, false);
                        var5.remove();
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      rLC var3 = var2.SF().byte_(il_3.this_).get();
      if (!var3.break_() && !var3.byte_()) {
         if (!Objects.equals(this.class_, var3.private_())) {
            this.byte_ = 20;
            return true;
         } else {
            if (this.byte_ > 0) {
               this.byte_--;
            }

            return this.byte_ == 0;
         }
      } else {
         return false;
      }
   }

   private static boolean break_(rrEm_1 var0, iB_2 var1, rfH_2 var2) {
      if (!var1.SF().class_(il_3.this_)) {
         return false;
      } else {
         rLC var3 = var1.SF().byte_(il_3.this_).get();
         if (var3.byte_()) {
            return false;
         } else {
            rLq_1 var4 = var3.implements_();
            if (var4 == null) {
               return false;
            } else {
               rLq_1 var5 = var3.private_();
               return var2.equals(var4.byte_()) || var2.equals(var5.byte_());
            }
         }
      }
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      rLC var5 = var2.SF().byte_(il_3.this_).get();
      this.class_ = var5.private_();
      rLq_1 var6 = var5.implements_();
      rLq_1 var7 = var5.private_();
      rfH_2 var8 = var6.byte_();
      xc_3 var9 = var1.byte_(var8);
      if (var9.class_(rls_3.private_)) {
         dN_2 var10 = (dN_2)var9.break_();
         if (!var10.private_(var9)) {
            var10.class_(var1, var9, var8, true);
         }

         this.byte_(var1, var2, var8);
      }

      rfH_2 var13 = var7.byte_();
      xc_3 var11 = var1.byte_(var13);
      if (var11.class_(rls_3.private_)) {
         dN_2 var12 = (dN_2)var11.break_();
         if (!var12.private_(var11)) {
            var12.class_(var1, var11, var13, true);
            this.byte_(var1, var2, var13);
         }
      }

      class_(var1, var2, var6, var7);
   }
}
