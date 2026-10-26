package celestial;

import java.util.List;

public class rdU_2 extends rdb_3 {
   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.DRINK;
   }

   public rdU_2(rdO_2 var1) {
      super(var1);
   }

   @Override
   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.id_class(var1)) {
         for (rLi_1 var4 : rVL.id_double) {
            if (var4 != rAS.id_class) {
               var2.add(rAB.id_class(new rdn_3(this), var4));
            }
         }
      }
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      return rpO_2.id_class(var1, var2, var3);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rAB.id_class(var1, var3, 1.0F);
   }

   @Override
   public rdn_3 id_class(rdn_3 var1, rYB var2, iB_2 var3) {
      rhd_3 var4 = var3 instanceof rhd_3 ? (rhd_3)var3 : null;
      if (var4 instanceof rhN_2) {
         Oo_1.id_while.id_class((rhN_2)var4, var1);
      }

      if (!var2.id_continue) {
         for (rLY var6 : rAB.id_class(var1)) {
            if (var6.id_class().id_class()) {
               var6.id_class().id_class(var4, var4, var3, var6.id_byte(), 1.0);
            } else {
               var3.id_break(new rLY(var6));
            }
         }
      }

      if (var4 != null) {
         var4.id_class(rlB_2.id_byte.id_break(this));
         if (!((rhx_3)var4.id_implements[18]).id_protected) {
            var1.id_catch(1);
         }
      }

      if (var4 == null || !((rhx_3)var4.id_implements[18]).id_protected) {
         if (var1.id_class()) {
            return new rdn_3(rdy_3.Jn);
         }

         if (var4 != null) {
            ((rhz_3)var4.id_implements[1]).id_throws(new rdn_3(rdy_3.Jn));
         }
      }

      return var1;
   }

   @Override
   public int id_break(rdn_3 var1) {
      return 32;
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return super.id_throws(var1) || !rAB.id_class(var1).isEmpty();
   }

   @Override
   public String id_case(rdn_3 var1) {
      return rAB.id_protected(var1).id_break(this.id_break() + ".effect.");
   }

   @Override
   public rdn_3 id_continue() {
      return rAB.id_class(super.id_continue(), rAS.id_break);
   }
}
