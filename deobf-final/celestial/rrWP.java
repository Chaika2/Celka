package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collection;
import java.util.List;

public class rrWP {
   private static final ThreadLocal<rrWS> class_ = ThreadLocal.withInitial(() -> new rrWS((xc_3)null, (xc_3)null, (rpr_3)null));
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<rrWS>> break_ = ThreadLocal.withInitial(() -> {
      rrWB var0 = new rrWB(200);
      var0.defaultReturnValue((byte)127);
      return var0;
   });

   public static List<xc_3> byte_(xd_3 var0) {
      rCF var1 = var0.new_();
      return var1.class_();
   }

   public static boolean class_(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3, rrxF_2 var4, xc_3 var5, rfH_2 var6) {
      long var7 = (long)var0.else_() << 36 | (long)var5.else_() << 4 | (long)var3.ordinal();
      Long2ByteLinkedOpenHashMap var9 = var4.new_();
      byte var10 = var9.getAndMoveToFirst(var7);
      if (var10 != 0) {
         return var10 > 0;
      } else {
         rjC_2 var11 = var0.class_(var1, var2, var3);
         rjC_2 var12 = var5.class_(var1, var6, var3.case_());
         boolean var13 = rjw_3.byte_(var11, var12, rjN_2.throws_);
         if (var9.size() > 400) {
            var9.removeLastByte();
         }

         var9.putAndMoveToFirst(var7, (byte)(var13 ? 1 : -1));
         return var13;
      }
   }

   public static boolean class_(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3, rrxF_2 var4) {
      rfH_2 var5 = var2.break_(var3);
      xc_3 var6 = var1.byte_(var5);
      if (var6.synchronized_()) {
         return false;
      } else if (var0.class_(var6, var3)) {
         return false;
      } else if (var6.native_()) {
         return class_(var0, var1, var2, var3, var4, var6, var5);
      } else {
         FreeCamera var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K();
         if (var7.aJ_() && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            boolean var8 = var6.catch_() || var6.volatile_().class_(rlG_2.byte_);
            if (var8) {
               boolean var9 = true;

               for (rpr_3 var13 : rpr_3.VALUES) {
                  rfH_2 var14 = var5.break_(var13);
                  xc_3 var15 = var1.byte_(var14);
                  if (var15.catch_()) {
                     var9 = false;
                     break;
                  }
               }

               if (var9) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static boolean class_(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      return var0.return_();
   }

   public static xc_3 class_(xd_3 var0, int var1) {
      rCF var2 = var0.new_();
      ImmutableList var3 = var2.class_();
      return var1 >= 0 && var1 < var3.size() ? (xc_3)var3.get(var1) : null;
   }

   public static int class_(xd_3 var0) {
      return rVL.strictfp_.class_(var0);
   }

   public static int class_(xc_3 var0) {
      xd_3 var1 = var0.break_();
      rCF var2 = var1.new_();
      ImmutableList var3 = var2.class_();
      return var3.indexOf(var0);
   }

   public static xd_3 class_(rqO_2 var0) {
      return !rVL.strictfp_.byte_(var0) ? null : rVL.strictfp_.class_(var0);
   }

   public static int break_(xd_3 var0) {
      rCF var1 = var0.new_();
      ImmutableList var2 = var1.class_();
      return var2.size();
   }

   public static Collection<rCZ> break_(xc_3 var0) {
      return var0.public_();
   }
}
