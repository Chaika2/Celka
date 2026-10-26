package celestial;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collection;
import java.util.List;

public class rrWP {
   private static final ThreadLocal<rrWS> id_class = ThreadLocal.withInitial(() -> new rrWS((xc_3)null, (xc_3)null, (rpr_3)null));
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<rrWS>> id_break = ThreadLocal.withInitial(() -> {
      rrWB var0 = new rrWB(200);
      var0.defaultReturnValue((byte)127);
      return var0;
   });

   public static List<xc_3> id_byte(xd_3 var0) {
      rCF var1 = var0.id_new();
      return var1.id_class();
   }

   public static boolean id_class(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3, rrxF_2 var4, xc_3 var5, rfH_2 var6) {
      long var7 = (long)var0.id_else() << 36 | (long)var5.id_else() << 4 | (long)var3.ordinal();
      Long2ByteLinkedOpenHashMap var9 = var4.id_new();
      byte var10 = var9.getAndMoveToFirst(var7);
      if (var10 != 0) {
         return var10 > 0;
      } else {
         rjC_2 var11 = var0.id_class(var1, var2, var3);
         rjC_2 var12 = var5.id_class(var1, var6, var3.id_case());
         boolean var13 = rjw_3.id_byte(var11, var12, rjN_2.id_throws);
         if (var9.size() > 400) {
            var9.removeLastByte();
         }

         var9.putAndMoveToFirst(var7, (byte)(var13 ? 1 : -1));
         return var13;
      }
   }

   public static boolean id_class(xc_3 var0, rRq_1 var1, rfH_2 var2, rpr_3 var3, rrxF_2 var4) {
      rfH_2 var5 = var2.id_break(var3);
      xc_3 var6 = var1.id_byte(var5);
      if (var6.id_synchronized()) {
         return false;
      } else if (var0.id_class(var6, var3)) {
         return false;
      } else if (var6.id_native()) {
         return id_class(var0, var1, var2, var3, var4, var6, var5);
      } else {
         FreeCamera var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K();
         if (var7.aJ_() && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            boolean var8 = var6.id_catch() || var6.id_volatile().id_class(rlG_2.id_byte);
            if (var8) {
               boolean var9 = true;

               for (rpr_3 var13 : rpr_3.VALUES) {
                  rfH_2 var14 = var5.id_break(var13);
                  xc_3 var15 = var1.id_byte(var14);
                  if (var15.id_catch()) {
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

   public static boolean id_class(xc_3 var0, rRq_1 var1, rfH_2 var2) {
      return var0.id_return();
   }

   public static xc_3 id_class(xd_3 var0, int var1) {
      rCF var2 = var0.id_new();
      ImmutableList var3 = var2.id_class();
      return var1 >= 0 && var1 < var3.size() ? (xc_3)var3.get(var1) : null;
   }

   public static int id_class(xd_3 var0) {
      return rVL.id_strictfp.id_class(var0);
   }

   public static int id_class(xc_3 var0) {
      xd_3 var1 = var0.id_break();
      rCF var2 = var1.id_new();
      ImmutableList var3 = var2.id_class();
      return var3.indexOf(var0);
   }

   public static xd_3 id_class(rqO_2 var0) {
      return !rVL.id_strictfp.id_byte(var0) ? null : rVL.id_strictfp.id_class(var0);
   }

   public static int id_break(xd_3 var0) {
      rCF var1 = var0.id_new();
      ImmutableList var2 = var1.id_class();
      return var2.size();
   }

   public static Collection<rCZ> id_break(xc_3 var0) {
      return var0.id_public();
   }
}
