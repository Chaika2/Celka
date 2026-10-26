package celestial;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rxu_3 extends rdb_3 implements ee_3 {
   private static final Logger class_ = LogManager.getLogger();

   public rxu_3(rdO_2 var1) {
      super(var1);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rfH_2 var2 = var1.class_();
      rYB var3 = var1.int_();
      if (!var3.byte_(var2).class_(xu_3.Jc)) {
         return super.class_(var1);
      } else {
         var3.class_((rhd_3)null, var2, rqn_3.GL, rqL_2.PLAYERS, 1.0F, 1.0F);
         rhd_3 var4 = var1.final_();
         rdn_3 var5 = var1.volatile_();
         boolean var6 = !((rhx_3)var4.implements_[18]).protected_ && var5.char_() == 1;
         if (var6) {
            this.class_(var3.E(), var2, var5.int_());
         } else {
            rdn_3 var7 = new rdn_3(rdy_3.Xx, 1);
            rcd_3 var8 = var5.final_() ? var5.package_().catch_() : new rcd_3();
            var7.byte_(var8);
            if (!((rhx_3)var4.implements_[18]).protected_) {
               var5.catch_(1);
            }

            this.class_(var3.E(), var2, var8);
            if (!((rhz_3)var4.implements_[1]).throws_(var7)) {
               var4.class_(var7, false);
            }
         }

         return ryZ_2.class_(var3.continue_);
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, an_3 var3, int var4, boolean var5) {
      if (!var2.continue_ && protected_(var1)) {
         rcd_3 var6 = var1.int_();
         if (var6.throws_("LodestoneTracked") && !var6.new_("LodestoneTracked")) {
            return;
         }

         Optional var7 = class_(var6);
         if (var7.isPresent()
            && var7.get() == var2.E()
            && var6.throws_("LodestonePos")
            && !((rrEm_1)var2).d().class_(rRP.return_, rco_3.break_(var6.int_("LodestonePos")))) {
            var6.continue_("LodestonePos");
         }
      }
   }

   public static Optional<rqM_2<rYB>> class_(rcd_3 var0) {
      return rYB.break_.parse(rcf_3.class_, var0.byte_("LodestoneDimension")).result();
   }

   private void class_(rqM_2<rYB> var1, rfH_2 var2, rcd_3 var3) {
      var3.class_("LodestonePos", rco_3.class_(var2));
      rYB.break_.encodeStart(rcf_3.class_, var1).resultOrPartial(class_::error).ifPresent(var1x -> var3.class_("LodestoneDimension", var1x));
      var3.class_("LodestoneTracked", true);
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      return protected_(var1) || super.throws_(var1);
   }

   @Override
   public String case_(rdn_3 var1) {
      return protected_(var1) ? "item.minecraft.lodestone_compass" : super.case_(var1);
   }

   public static boolean protected_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return var1 != null && (var1.throws_("LodestoneDimension") || var1.throws_("LodestonePos"));
   }
}
