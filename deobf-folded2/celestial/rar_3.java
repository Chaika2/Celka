package celestial;

import java.util.Random;

public class rar_3 extends rrrw_1 {
   private final String id_protected;
   private final rqd_3 id_throws;
   private final boolean id_case;

   public rar_3(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4, boolean var5) {
      super(raF_2.s, 0);
      this.id_protected = var2;
      this.id_byte = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_class(var1);
   }

   public rar_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.s, var2);
      this.id_protected = var2.id_native("Template");
      this.id_throws = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_case = var2.id_new("OW");
      this.id_class(var1);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_protected);
      var1.id_class("Rot", this.id_throws.name());
      var1.id_class("OW", this.id_case);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if (var1.startsWith("Chest")) {
         rfH_2 var6 = var2.id_break();
         if (var5.id_break(var6)) {
            rHK.id_class(var3, var4, var6, rzl_3.id_byte);
         }
      } else if (var1.startsWith("Sentry")) {
         rGz_1 var7 = aI_2.v.id_class(var3.id_byte());
         var7.id_new((double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5);
         var7.id_finally(var2);
         var3.a_(var7);
      } else if (var1.startsWith("Elytra")) {
         rsG_2 var8 = new rsG_2(var3.id_byte(), var2, this.id_throws.id_class(rpr_3.SOUTH));
         var8.id_class(new rdn_3(rdy_3.kc), false);
         var3.a_(var8);
      }
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(new rqO_2("end_city/" + this.id_protected));
      rrPN var3 = (this.id_case ? reD_2.id_class : reD_2.id_break).id_class().id_class(this.id_throws);
      this.id_class(var2, this.id_byte, var3);
   }
}
