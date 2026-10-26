package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class rdv_3 {
   private static final Map<rqO_2, rdE_2> id_class = Maps.newHashMap();
   private static final rqO_2 id_break = new rqO_2("damaged");
   private static final rqO_2 id_byte = new rqO_2("damage");
   private static final rdE_2 id_protected = (var0, var1, var2) -> var0.id_case() ? 1.0F : 0.0F;
   private static final rdE_2 id_throws = (var0, var1, var2) -> rfU_2.id_class((float)var0.id_catch() / (float)var0.id_private(), 0.0F, 1.0F);
   private static final Map<rdb_3, Map<rqO_2, rdE_2>> id_case = Maps.newHashMap();

   static {
      id_class(new rqO_2("lefthanded"), (var0, var1, var2) -> var2 != null && var2.Su() != rpZ_2.RIGHT ? 1.0F : 0.0F);
      id_class(new rqO_2("cooldown"), (var0, var1, var2) -> var2 instanceof rhd_3 ? ((rhd_3)var2).sK().id_class(var0.id_break(), 0.0F) : 0.0F);
      id_class(new rqO_2("custom_model_data"), (var0, var1, var2) -> var0.id_final() ? (float)var0.id_package().id_private("CustomModelData") : 0.0F);
      id_class(rdy_3.OM, new rqO_2("pull"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            return var2.sX() != var0 ? 0.0F : (float)(var0.id_extends() - var2.SH()) / 20.0F;
         }
      });
      id_class(rdy_3.OM, new rqO_2("pulling"), (var0, var1, var2) -> var2 != null && var2.id_return() && var2.sX() == var0 ? 1.0F : 0.0F);
      id_class(rdy_3.Xk, new rqO_2("time"), new rdF_2());
      id_class(rdy_3.Xx, new rqO_2("angle"), new rdL_2());
      id_class(rdy_3.kU, new rqO_2("pull"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            return rxm_3.id_protected(var0) ? 0.0F : (float)(var0.id_extends() - var2.SH()) / (float)rxm_3.id_private(var0);
         }
      });
      id_class(
         rdy_3.kU, new rqO_2("pulling"), (var0, var1, var2) -> var2 != null && var2.id_return() && var2.sX() == var0 && !rxm_3.id_protected(var0) ? 1.0F : 0.0F
      );
      id_class(rdy_3.kU, new rqO_2("charged"), (var0, var1, var2) -> var2 != null && rxm_3.id_protected(var0) ? 1.0F : 0.0F);
      id_class(rdy_3.kU, new rqO_2("firework"), (var0, var1, var2) -> var2 != null && rxm_3.id_protected(var0) && rxm_3.id_class(var0, rdy_3.dc) ? 1.0F : 0.0F);
      id_class(rdy_3.kc, new rqO_2("broken"), (var0, var1, var2) -> rxH_2.id_protected(var0) ? 0.0F : 1.0F);
      id_class(rdy_3.Xd, new rqO_2("cast"), (var0, var1, var2) -> {
         if (var2 == null) {
            return 0.0F;
         } else {
            boolean var3 = var2.ss() == var0;
            boolean var4 = var2.Sn() == var0;
            if (var2.ss().id_break() instanceof rxY_2) {
               var4 = false;
            }

            return (var3 || var4) && var2 instanceof rhd_3 && (rhp_3)((rhd_3)var2).id_implements[29] != null ? 1.0F : 0.0F;
         }
      });
      id_class(rdy_3.kN, new rqO_2("blocking"), (var0, var1, var2) -> var2 != null && var2.id_return() && var2.sX() == var0 ? 1.0F : 0.0F);
      id_class(rdy_3.kY, new rqO_2("throwing"), (var0, var1, var2) -> var2 != null && var2.id_return() && var2.sX() == var0 ? 1.0F : 0.0F);
   }

   private static rdE_2 id_class(rqO_2 var0, rdE_2 var1) {
      id_class.put(var0, var1);
      return var1;
   }

   private static void id_class(rdb_3 var0, rqO_2 var1, rdE_2 var2) {
      id_case.computeIfAbsent(var0, var0x -> Maps.newHashMap()).put(var1, var2);
   }

   public static rdE_2 id_class(rdb_3 var0, rqO_2 var1) {
      if (var0.id_finally() > 0) {
         if (id_byte.equals(var1)) {
            return id_throws;
         }

         if (id_break.equals(var1)) {
            return id_protected;
         }
      }

      rdE_2 var2 = id_class.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         Map var3 = id_case.get(var0);
         return var3 == null ? null : (rdE_2)var3.get(var1);
      }
   }
}
