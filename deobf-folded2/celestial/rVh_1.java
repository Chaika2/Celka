package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVh_1 {
   private static final Logger id_break = LogManager.getLogger();
   public static final rVh_1 id_class = new rVh_1();
   private static final rpM_2[] id_byte = rpM_2.values();
   private final EnumSet<rpM_2> id_protected = EnumSet.noneOf(rpM_2.class);
   private final int[][] id_throws = new int[16][];
   static final Map<xd_3, rVz_1> id_case = new IdentityHashMap<>();
   static final Set<rVz_1> id_catch = Sets.newHashSet();

   private rVh_1() {
   }

   public rVh_1(rcd_3 var1) {
      this();
      if (var1.id_byte("Indices", 10)) {
         rcd_3 var2 = var1.id_int("Indices");

         for (int var3 = 0; var3 < this.id_throws.length; var3++) {
            String var4 = String.valueOf(var3);
            if (var2.id_byte(var4, 11)) {
               this.id_throws[var3] = var2.id_final(var4);
            }
         }
      }

      int var7 = var1.id_private("Sides");

      for (rpM_2 var6 : rpM_2.values()) {
         if ((var7 & 1 << var6.ordinal()) != 0) {
            this.id_protected.add(var6);
         }
      }
   }

   public boolean id_class() {
      for (int[] var4 : this.id_throws) {
         if (var4 != null) {
            return false;
         }
      }

      return this.id_protected.isEmpty();
   }

   public void id_class(roJ_2 var1) {
      this.id_break(var1);

      for (rpM_2 var5 : id_byte) {
         id_class(var1, var5);
      }

      rYB var6 = var1.id_extends();
      id_catch.forEach(var1x -> var1x.id_class(var6));
   }

   private static void id_class(roJ_2 var0, rpM_2 var1) {
      rYB var2 = var0.id_extends();
      if (var0.id_synchronized().id_protected.remove(var1)) {
         Set var3 = var1.id_class();
         boolean var4 = false;
         byte var5 = 15;
         boolean var6 = var3.contains(rpr_3.EAST);
         boolean var7 = var3.contains(rpr_3.WEST);
         boolean var8 = var3.contains(rpr_3.SOUTH);
         boolean var9 = var3.contains(rpr_3.NORTH);
         boolean var10 = var3.size() == 1;
         rfj_3 var11 = var0.id_private();
         int var12 = var11.id_break() + (!var10 || !var9 && !var8 ? (var7 ? 0 : 15) : 1);
         int var13 = var11.id_break() + (!var10 || !var9 && !var8 ? (var7 ? 0 : 15) : 14);
         int var14 = var11.id_byte() + (!var10 || !var6 && !var7 ? (var9 ? 0 : 15) : 1);
         int var15 = var11.id_byte() + (!var10 || !var6 && !var7 ? (var9 ? 0 : 15) : 14);
         rpr_3[] var16 = rpr_3.values();
         rfw_3 var17 = new rfw_3();

         for (rfH_2 var19 : rfH_2.id_break(var12, 0, var14, var13, var2.id_try() - 1, var15)) {
            xc_3 var20 = var2.id_byte(var19);
            xc_3 var21 = var20;

            for (rpr_3 var25 : var16) {
               var17.id_class(var19, var25);
               var21 = id_class(var21, var25, var2, var19, var17);
            }

            xd_3.id_class(var20, var21, var2, var19, 18);
         }
      }
   }

   private static xc_3 id_class(xc_3 var0, rpr_3 var1, rRg_1 var2, rfH_2 var3, rfH_2 var4) {
      return id_case.getOrDefault(var0.id_break(), rVX.DEFAULT).id_class(var0, var1, var2.id_byte(var4), var2, var3, var4);
   }

   public rcd_3 id_break() {
      rcd_3 var1 = new rcd_3();
      rcd_3 var2 = new rcd_3();

      for (int var3 = 0; var3 < this.id_throws.length; var3++) {
         String var4 = String.valueOf(var3);
         if (this.id_throws[var3] != null && this.id_throws[var3].length != 0) {
            var2.id_class(var4, this.id_throws[var3]);
         }
      }

      if (!var2.id_case()) {
         var1.id_class("Indices", var2);
      }

      int var6 = 0;

      for (rpM_2 var5 : this.id_protected) {
         var6 |= 1 << var5.ordinal();
      }

      var1.id_class("Sides", (byte)var6);
      return var1;
   }

   private void id_break(roJ_2 var1) {
      rfw_3 var2 = new rfw_3();
      rfw_3 var3 = new rfw_3();
      rfj_3 var4 = var1.id_private();
      rYB var5 = var1.id_extends();

      for (int var6 = 0; var6 < 16; var6++) {
         roQ_2 var7 = var1.id_byte()[var6];
         int[] var8 = this.id_throws[var6];
         this.id_throws[var6] = null;
         if (var7 != null && var8 != null && var8.length > 0) {
            rpr_3[] var9 = rpr_3.values();
            rVM var10 = var7.id_implements();

            for (int var14 : var8) {
               int var15 = var14 & 15;
               int var16 = var14 >> 8 & 15;
               int var17 = var14 >> 4 & 15;
               var2.id_class(var4.id_break() + var15, (var6 << 4) + var16, var4.id_byte() + var17);
               xc_3 var18 = (xc_3)var10.id_class(var14);
               xc_3 var19 = var18;

               for (rpr_3 var23 : var9) {
                  var3.id_class(var2, var23);
                  if (var2.b_() >> 4 == var4.id_break && var2.d_() >> 4 == var4.id_byte) {
                     var19 = id_class(var19, var23, var5, var2, var3);
                  }
               }

               xd_3.id_class(var18, var19, var5, var2, 18);
            }
         }
      }

      for (int var24 = 0; var24 < this.id_throws.length; var24++) {
         if (this.id_throws[var24] != null) {
            id_break.warn("Discarding update data for section {} for chunk ({} {})", var24, var4.id_break, var4.id_byte);
         }

         this.id_throws[var24] = null;
      }
   }
}
