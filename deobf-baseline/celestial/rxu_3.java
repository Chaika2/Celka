package celestial;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rxu_3 extends rdb_3 implements ee_3 {
   private static final Logger id_class = LogManager.getLogger();

   public rxu_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rfH_2 var2 = var1.id_class();
      rYB var3 = var1.id_int();
      if (!var3.id_byte(var2).id_class(xu_3.Jc)) {
         return super.id_class(var1);
      } else {
         var3.id_class((rhd_3)null, var2, rqn_3.GL, rqL_2.PLAYERS, 1.0F, 1.0F);
         rhd_3 var4 = var1.id_final();
         rdn_3 var5 = var1.id_volatile();
         boolean var6 = !((rhx_3)var4.id_implements[18]).id_protected && var5.id_char() == 1;
         if (var6) {
            this.id_class(var3.E(), var2, var5.id_int());
         } else {
            rdn_3 var7 = new rdn_3(rdy_3.Xx, 1);
            rcd_3 var8 = var5.id_final() ? var5.id_package().id_catch() : new rcd_3();
            var7.id_byte(var8);
            if (!((rhx_3)var4.id_implements[18]).id_protected) {
               var5.id_catch(1);
            }

            this.id_class(var3.E(), var2, var8);
            if (!((rhz_3)var4.id_implements[1]).id_throws(var7)) {
               var4.id_class(var7, false);
            }
         }

         return ryZ_2.id_class(var3.id_continue);
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
      if (!var2.id_continue && id_protected(var1)) {
         rcd_3 var6 = var1.id_int();
         if (var6.id_throws("LodestoneTracked") && !var6.id_new("LodestoneTracked")) {
            return;
         }

         Optional var7 = id_class(var6);
         if (var7.isPresent()
            && var7.get() == var2.E()
            && var6.id_throws("LodestonePos")
            && !((rrEm_1)var2).d().id_class(rRP.id_return, rco_3.id_break(var6.id_int("LodestonePos")))) {
            var6.id_continue("LodestonePos");
         }
      }
   }

   public static Optional<rqM_2<rYB>> id_class(rcd_3 var0) {
      return rYB.id_break.parse(rcf_3.id_class, var0.id_byte("LodestoneDimension")).result();
   }

   private void id_class(rqM_2<rYB> var1, rfH_2 var2, rcd_3 var3) {
      var3.id_class("LodestonePos", rco_3.id_class(var2));
      rYB.id_break.encodeStart(rcf_3.id_class, var1).resultOrPartial(id_class::error).ifPresent(var1x -> var3.id_class("LodestoneDimension", var1x));
      var3.id_class("LodestoneTracked", true);
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return id_protected(var1) || super.id_throws(var1);
   }

   @Override
   public String id_case(rdn_3 var1) {
      return id_protected(var1) ? "item.minecraft.lodestone_compass" : super.id_case(var1);
   }

   public static boolean id_protected(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return var1 != null && (var1.id_throws("LodestoneDimension") || var1.id_throws("LodestonePos"));
   }
}
