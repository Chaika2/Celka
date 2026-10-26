package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;

public class rkq_3 extends rWN {
   private static final rkg_3 class_ = rkg_3.class_(rdy_3.xa, rdy_3.Oi, rdy_3.JF, rdy_3.dh, rdy_3.dX, rdy_3.dd, rdy_3.dJ, rdy_3.dk, rdy_3.dx);
   private static final rkg_3 break_ = rkg_3.class_(rdy_3.OJ);
   private static final rkg_3 byte_ = rkg_3.class_(rdy_3.XW);
   private static final Map<rdb_3, rxV_2> protected_ = rqR_2.class_(Maps.newHashMap(), var0 -> {
      var0.put(rdy_3.xa, rxV_2.LARGE_BALL);
      var0.put(rdy_3.Oi, rxV_2.BURST);
      var0.put(rdy_3.JF, rxV_2.STAR);
      var0.put(rdy_3.dh, rxV_2.CREEPER);
      var0.put(rdy_3.dX, rxV_2.CREEPER);
      var0.put(rdy_3.dd, rxV_2.CREEPER);
      var0.put(rdy_3.dJ, rxV_2.CREEPER);
      var0.put(rdy_3.dk, rxV_2.CREEPER);
      var0.put(rdy_3.dx, rxV_2.CREEPER);
   });
   private static final rkg_3 throws_ = rkg_3.class_(rdy_3.hr);

   @Override
   public rdn_3 byte_() {
      return new rdn_3(rdy_3.du);
   }

   public rkq_3(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   public rdn_3 class_(rXk_1 var1) {
      rdn_3 var2 = new rdn_3(rdy_3.du);
      rcd_3 var3 = var2.class_("Explosion");
      rxV_2 var4 = rxV_2.SMALL_BALL;
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var1.else_(); var6++) {
         rdn_3 var7 = var1.extends_(var6);
         if (!var7.class_()) {
            if (class_.class_(var7)) {
               var4 = protected_.get(var7.break_());
            } else if (byte_.class_(var7)) {
               var3.class_("Flicker", true);
            } else if (break_.class_(var7)) {
               var3.class_("Trail", true);
            } else if (var7.break_() instanceof rxA_2) {
               var5.add(((rxA_2)var7.break_()).byte_().case_());
            }
         }
      }

      var3.class_("Colors", var5);
      var3.class_("Type", (byte)var4.class_());
      return var2;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;

      for (int var8 = 0; var8 < var1.else_(); var8++) {
         rdn_3 var9 = var1.extends_(var8);
         if (!var9.class_()) {
            if (class_.class_(var9)) {
               if (var5) {
                  return false;
               }

               var5 = true;
            } else if (byte_.class_(var9)) {
               if (var7) {
                  return false;
               }

               var7 = true;
            } else if (break_.class_(var9)) {
               if (var6) {
                  return false;
               }

               var6 = true;
            } else if (throws_.class_(var9)) {
               if (var3) {
                  return false;
               }

               var3 = true;
            } else {
               if (!(var9.break_() instanceof rxA_2)) {
                  return false;
               }

               var4 = true;
            }
         }
      }

      return var3 && var4;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.private_;
   }
}
