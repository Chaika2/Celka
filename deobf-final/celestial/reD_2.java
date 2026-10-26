package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class reD_2 {
   static final rrPN class_ = new rrPN().class_(true).class_(rrPG.break_);
   static final rrPN break_ = new rrPN().class_(true).class_(rrPG.protected_);
   static final raP_2 byte_ = new reU_2();
   static final List<rqj_3<rqd_3, rfH_2>> protected_ = Lists.newArrayList(
      new rqj_3[]{
         new rqj_3<>(rqd_3.NONE, new rfH_2(1, -1, 0)),
         new rqj_3<>(rqd_3.CLOCKWISE_90, new rfH_2(6, -1, 1)),
         new rqj_3<>(rqd_3.COUNTERCLOCKWISE_90, new rfH_2(0, -1, 5)),
         new rqj_3<>(rqd_3.CLOCKWISE_180, new rfH_2(5, -1, 6))
      }
   );
   static final raP_2 throws_ = new ree_3();
   static final raP_2 case_ = new rea_3();
   static final List<rqj_3<rqd_3, rfH_2>> catch_ = Lists.newArrayList(
      new rqj_3[]{
         new rqj_3<>(rqd_3.NONE, new rfH_2(4, -1, 0)),
         new rqj_3<>(rqd_3.CLOCKWISE_90, new rfH_2(12, -1, 4)),
         new rqj_3<>(rqd_3.COUNTERCLOCKWISE_90, new rfH_2(0, -1, 8)),
         new rqj_3<>(rqd_3.CLOCKWISE_180, new rfH_2(8, -1, 12))
      }
   );
   static final raP_2 private_ = new rei_3();

   static rar_3 class_(List<rrrn_1> var0, rar_3 var1) {
      var0.add(var1);
      return var1;
   }

   static boolean class_(rrPt_1 var0, raP_2 var1, int var2, rar_3 var3, rfH_2 var4, List<rrrn_1> var5, Random var6) {
      if (var2 > 8) {
         return false;
      } else {
         ArrayList var7 = Lists.newArrayList();
         if (var1.class_(var0, var2, var3, var4, var7, var6)) {
            boolean var8 = false;
            int var9 = var6.nextInt();

            for (rrrn_1 var11 : var7) {
               var11.package_ = var9;
               rrrn_1 var12 = rrrn_1.class_(var5, var11.catch_());
               if (var12 != null && var12.package_ != var3.package_) {
                  var8 = true;
                  break;
               }
            }

            if (!var8) {
               var5.addAll(var7);
               return true;
            }
         }

         return false;
      }
   }

   static rar_3 class_(rrPt_1 var0, rar_3 var1, rfH_2 var2, String var3, rqd_3 var4, boolean var5) {
      rar_3 var6 = new rar_3(var0, var3, var1.byte_, var4, var5);
      rfH_2 var7 = var1.class_.class_(var1.break_, var2, var6.break_, rfH_2.protected_);
      var6.class_(var7.b_(), var7.c_(), var7.d_());
      return var6;
   }

   public static void class_(rrPt_1 var0, rfH_2 var1, rqd_3 var2, List<rrrn_1> var3, Random var4) {
      private_.class_();
      byte_.class_();
      case_.class_();
      throws_.class_();
      rar_3 var5 = class_(var3, new rar_3(var0, "base_floor", var1, var2, true));
      var5 = class_(var3, class_(var0, var5, new rfH_2(-1, 0, -1), "second_floor_1", var2, false));
      var5 = class_(var3, class_(var0, var5, new rfH_2(-1, 4, -1), "third_floor_1", var2, false));
      var5 = class_(var3, class_(var0, var5, new rfH_2(-1, 8, -1), "third_roof", var2, true));
      class_(var0, throws_, 1, var5, (rfH_2)null, var3, var4);
   }
}
