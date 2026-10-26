package celestial;

import java.util.List;

public class rkP_2 extends rdb_3 {
   @Override
   public rkc_3 id_byte(rdn_3 var1) {
      return rkc_3.BLOCK;
   }

   public rkP_2(rdO_2 var1) {
      super(var1);
      dQ_2.id_class(this, rxS_2.id_class);
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      var2.id_break(var3);
      return rym_3.id_break(var4);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      rxO_2.id_class(var1, var3);
   }

   @Override
   public boolean id_class(rdn_3 var1, rdn_3 var2) {
      return rlc_3.id_byte.id_class(var2.id_break()) || super.id_class(var1, var2);
   }

   @Override
   public int id_break(rdn_3 var1) {
      return 72000;
   }

   @Override
   public String id_case(rdn_3 var1) {
      return var1.id_break("BlockEntityTag") != null ? this.id_break() + "." + id_protected(var1).id_byte() : super.id_case(var1);
   }

   public static rxL_2 id_protected(rdn_3 var0) {
      return rxL_2.id_class(var0.id_class("BlockEntityTag").id_private("Base"));
   }
}
