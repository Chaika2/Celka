package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rdv_3 {
   private static final Map<rqO_2, rdE_2> class_ = Maps.newHashMap();
   private static final rqO_2 break_ = new rqO_2("damaged");
   private static final rqO_2 byte_ = new rqO_2("damage");
   private static final rdE_2 protected_ = (var0, var1, var2) -> var0.case_() ? 1.0F : 0.0F;
   private static final rdE_2 throws_ = (var0, var1, var2) -> rfU_2.class_((float)var0.catch_() / (float)var0.private_(), 0.0F, 1.0F);
   private static final Map<rdb_3, Map<rqO_2, rdE_2>> case_ = Maps.newHashMap();

   static {
      class_(new rqO_2("lefthanded"), (var0, var1, var2) -> var2 != null && var2.Su() != rpZ_2.RIGHT ? 1.0F : 0.0F);
      class_(new rqO_2("cooldown"), (var0, var1, var2) -> var2 instanceof rhd_3 ? ((rhd_3)var2).sK().class_(var0.break_(), 0.0F) : 0.0F);
      class_(new rqO_2("custom_model_data"), (var0, var1, var2) -> var0.final_() ? (float)var0.package_().private_("CustomModelData") : 0.0F);
      class_(rdy_3.OM, new rqO_2("pull"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            return var2.sX() != var0 ? 0.0F : (float)(var0.extends_() - var2.SH()) / 20.0F;
         }
      });
      class_(rdy_3.OM, new rqO_2("pulling"), (var0, var1, var2) -> var2 != null && var2.return_() && var2.sX() == var0 ? 1.0F : 0.0F);
      class_(rdy_3.Xk, new rqO_2("time"), new rdF_2());
      class_(rdy_3.Xx, new rqO_2("angle"), new rdL_2());
      class_(rdy_3.kU, new rqO_2("pull"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            return rxm_3.protected_(var0) ? 0.0F : (float)(var0.extends_() - var2.SH()) / (float)rxm_3.private_(var0);
         }
      });
      class_(rdy_3.kU, new rqO_2("pulling"), (var0, var1, var2) -> var2 != null && var2.return_() && var2.sX() == var0 && !rxm_3.protected_(var0) ? 1.0F : 0.0F);
      class_(rdy_3.kU, new rqO_2("charged"), (var0, var1, var2) -> var2 != null && rxm_3.protected_(var0) ? 1.0F : 0.0F);
      class_(rdy_3.kU, new rqO_2("firework"), (var0, var1, var2) -> var2 != null && rxm_3.protected_(var0) && rxm_3.class_(var0, rdy_3.dc) ? 1.0F : 0.0F);
      class_(rdy_3.kc, new rqO_2("broken"), (var0, var1, var2) -> rxH_2.protected_(var0) ? 0.0F : 1.0F);
      class_(rdy_3.Xd, new rqO_2("cast"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            boolean var3 = var2.ss() == var0;
            boolean var4 = var2.Sn() == var0;
            if (var2.ss().break_() instanceof rxY_2) {
               var4 = false;
            }

            return (var3 || var4) && var2 instanceof rhd_3 && (rhp_3)((rhd_3)var2).implements_[29] != null ? 1.0F : 0.0F;
         }
      });
      class_(rdy_3.kN, new rqO_2("blocking"), (var0, var1, var2) -> var2 != null && var2.return_() && var2.sX() == var0 ? 1.0F : 0.0F);
      class_(rdy_3.kY, new rqO_2("throwing"), (var0, var1, var2) -> var2 != null && var2.return_() && var2.sX() == var0 ? 1.0F : 0.0F);
   }

   private static rdE_2 class_(rqO_2 var0, rdE_2 var1) {
      class_.put(var0, var1);
      return var1;
   }

   private static void class_(rdb_3 var0, rqO_2 var1, rdE_2 var2) {
      case_.computeIfAbsent(var0, var0x -> Maps.newHashMap()).put(var1, var2);
   }

   public static rdE_2 class_(rdb_3 var0, rqO_2 var1) {
      if (var0.finally_() > 0) {
         if (byte_.equals(var1)) {
            return throws_;
         }

         if (break_.equals(var1)) {
            return protected_;
         }
      }

      rdE_2 var2 = class_.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         Map var3 = case_.get(var0);
         return var3 == null ? null : (rdE_2)var3.get(var1);
      }
   }
}
