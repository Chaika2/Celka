package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVh_1 {
   private static final Logger break_ = LogManager.getLogger();
   public static final rVh_1 class_ = new rVh_1();
   private static final rpM_2[] byte_ = rpM_2.values();
   private final EnumSet<rpM_2> protected_ = EnumSet.noneOf(rpM_2.class);
   private final int[][] throws_ = new int[16][];
   static final Map<xd_3, rVz_1> case_ = new IdentityHashMap<>();
   static final Set<rVz_1> catch_ = Sets.newHashSet();

   private rVh_1() {
   }

   public rVh_1(rcd_3 var1) {
      this();
      if (var1.byte_("Indices", 10)) {
         rcd_3 var2 = var1.int_("Indices");

         for (int var3 = 0; var3 < this.throws_.length; var3++) {
            String var4 = String.valueOf(var3);
            if (var2.byte_(var4, 11)) {
               this.throws_[var3] = var2.final_(var4);
            }
         }
      }

      int var7 = var1.private_("Sides");

      for (rpM_2 var6 : rpM_2.values()) {
         if ((var7 & 1 << var6.ordinal()) != 0) {
            this.protected_.add(var6);
         }
      }
   }

   public boolean class_() {
      for (int[] var4 : this.throws_) {
         if (var4 != null) {
            return false;
         }
      }

      return this.protected_.isEmpty();
   }

   public void class_(roJ_2 var1) {
      this.break_(var1);

      for (rpM_2 var5 : byte_) {
         class_(var1, var5);
      }

      rYB var6 = var1.extends_();
      catch_.forEach(var1x -> var1x.class_(var6));
   }

   private static void class_(roJ_2 var0, rpM_2 var1) {
      rYB var2 = var0.extends_();
      if (var0.synchronized_().protected_.remove(var1)) {
         Set var3 = var1.class_();
         boolean var4 = false;
         byte var5 = 15;
         boolean var6 = var3.contains(rpr_3.EAST);
         boolean var7 = var3.contains(rpr_3.WEST);
         boolean var8 = var3.contains(rpr_3.SOUTH);
         boolean var9 = var3.contains(rpr_3.NORTH);
         boolean var10 = var3.size() == 1;
         rfj_3 var11 = var0.private_();
         int var12 = var11.break_() + (!var10 || !var9 && !var8 ? (var7 ? 0 : 15) : 1);
         int var13 = var11.break_() + (!var10 || !var9 && !var8 ? (var7 ? 0 : 15) : 14);
         int var14 = var11.byte_() + (!var10 || !var6 && !var7 ? (var9 ? 0 : 15) : 1);
         int var15 = var11.byte_() + (!var10 || !var6 && !var7 ? (var9 ? 0 : 15) : 14);
         rpr_3[] var16 = rpr_3.values();
         rfw_3 var17 = new rfw_3();

         for (rfH_2 var19 : rfH_2.break_(var12, 0, var14, var13, var2.try_() - 1, var15)) {
            xc_3 var20 = var2.byte_(var19);
            xc_3 var21 = var20;

            for (rpr_3 var25 : var16) {
               var17.class_(var19, var25);
               var21 = class_(var21, var25, var2, var19, var17);
            }

            xd_3.class_(var20, var21, var2, var19, 18);
         }
      }
   }

   private static xc_3 class_(xc_3 var0, rpr_3 var1, rRg_1 var2, rfH_2 var3, rfH_2 var4) {
      return case_.getOrDefault(var0.break_(), rVX.DEFAULT).class_(var0, var1, var2.byte_(var4), var2, var3, var4);
   }

   public rcd_3 break_() {
      rcd_3 var1 = new rcd_3();
      rcd_3 var2 = new rcd_3();

      for (int var3 = 0; var3 < this.throws_.length; var3++) {
         String var4 = String.valueOf(var3);
         if (this.throws_[var3] != null && this.throws_[var3].length != 0) {
            var2.class_(var4, this.throws_[var3]);
         }
      }

      if (!var2.case_()) {
         var1.class_("Indices", var2);
      }

      int var6 = 0;

      for (rpM_2 var5 : this.protected_) {
         var6 |= 1 << var5.ordinal();
      }

      var1.class_("Sides", (byte)var6);
      return var1;
   }

   private void break_(roJ_2 var1) {
      rfw_3 var2 = new rfw_3();
      rfw_3 var3 = new rfw_3();
      rfj_3 var4 = var1.private_();
      rYB var5 = var1.extends_();

      for (int var6 = 0; var6 < 16; var6++) {
         roQ_2 var7 = var1.byte_()[var6];
         int[] var8 = this.throws_[var6];
         this.throws_[var6] = null;
         if (var7 != null && var8 != null && var8.length > 0) {
            rpr_3[] var9 = rpr_3.values();
            rVM var10 = var7.implements_();

            for (int var14 : var8) {
               int var15 = var14 & 15;
               int var16 = var14 >> 8 & 15;
               int var17 = var14 >> 4 & 15;
               var2.class_(var4.break_() + var15, (var6 << 4) + var16, var4.byte_() + var17);
               xc_3 var18 = (xc_3)var10.class_(var14);
               xc_3 var19 = var18;

               for (rpr_3 var23 : var9) {
                  var3.class_(var2, var23);
                  if (var2.b_() >> 4 == var4.break_ && var2.d_() >> 4 == var4.byte_) {
                     var19 = class_(var19, var23, var5, var2, var3);
                  }
               }

               xd_3.class_(var18, var19, var5, var2, 18);
            }
         }
      }

      for (int var24 = 0; var24 < this.throws_.length; var24++) {
         if (this.throws_[var24] != null) {
            break_.warn("Discarding update data for section {} for chunk ({} {})", var24, var4.break_, var4.byte_);
         }

         this.throws_[var24] = null;
      }
   }
}
