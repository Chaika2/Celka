package celestial;

import java.util.Random;

public class rir_3 extends rrrw_1 {
   private final rqO_2 id_protected;
   private final rqd_3 id_throws;

   public rir_3(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4) {
      super(raF_2.M, 0);
      this.id_protected = var2;
      this.id_byte = var3;
      this.id_throws = var4;
      this.id_class(var1);
   }

   public rir_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.M, var2);
      this.id_protected = new rqO_2(var2.id_native("Template"));
      this.id_throws = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_class(var1);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      var5.id_break(this.id_class.id_break(this.id_break, this.id_byte));
      return super.id_class(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_protected.toString());
      var1.id_class("Rot", this.id_throws.name());
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(this.id_protected);
      rrPN var3 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(rrPG.id_protected);
      this.id_class(var2, this.id_byte, var3);
   }
}
