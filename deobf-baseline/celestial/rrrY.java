package celestial;

import java.util.Random;

public class rrrY extends rrrw_1 {
   private final String id_protected;
   private final rqd_3 id_throws;
   private final rpa_3 id_case;

   public rrrY(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.E, var2);
      this.id_protected = var2.id_native("Template");
      this.id_throws = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_case = rpa_3.valueOf(var2.id_native("Mi"));
      this.id_class(var1);
   }

   public rrrY(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4, rpa_3 var5) {
      super(raF_2.E, 0);
      this.id_protected = var2;
      this.id_byte = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_class(var1);
   }

   public rrrY(rrPt_1 var1, String var2, rfH_2 var3, rqd_3 var4) {
      this(var1, var2, var3, var4, rpa_3.NONE);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if (var1.startsWith("Chest")) {
         rqd_3 var6 = this.id_break.id_protected();
         xc_3 var7 = xu_3.re.id_continue();
         if ("ChestWest".equals(var1)) {
            var7 = var7.id_class(xt_3.id_final, var6.id_class(rpr_3.WEST));
         } else if ("ChestEast".equals(var1)) {
            var7 = var7.id_class(xt_3.id_final, var6.id_class(rpr_3.EAST));
         } else if ("ChestSouth".equals(var1)) {
            var7 = var7.id_class(xt_3.id_final, var6.id_class(rpr_3.SOUTH));
         } else if ("ChestNorth".equals(var1)) {
            var7 = var7.id_class(xt_3.id_final, var6.id_class(rpr_3.NORTH));
         }

         this.id_class(var3, var5, var4, var2, rzl_3.id_interface, var7);
      } else {
         rsi_3 var9;
         switch (var1) {
            case "Mage":
               var9 = aI_2.id_return.id_class(var3.id_byte());
               break;
            case "Warrior":
               var9 = aI_2.U.id_class(var3.id_byte());
               break;
            default:
               return;
         }

         var9.b();
         var9.id_class(var2, 0.0F, 0.0F);
         var9.id_class(var3, var3.id_throws(var9.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
         var3.id_class(var9);
         var3.id_class(var2, xu_3.id_class.id_continue(), 2);
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_protected);
      var1.id_class("Rot", this.id_break.id_protected().name());
      var1.id_class("Mi", this.id_break.id_byte().name());
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(new rqO_2("woodland_mansion/" + this.id_protected));
      rrPN var3 = new rrPN().id_class(true).id_class(this.id_throws).id_class(this.id_case).id_class(rrPG.id_break);
      this.id_class(var2, this.id_byte, var3);
   }
}
