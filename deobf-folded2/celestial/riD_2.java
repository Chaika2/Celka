package celestial;

import java.util.Random;

public class riD_2 extends rrrw_1 {
   private final rqd_3 id_protected;
   private final rqO_2 id_throws;
   private final boolean id_case;

   public riD_2(rrPt_1 var1, rqO_2 var2, rfH_2 var3, rqd_3 var4, boolean var5) {
      super(raF_2.b, 0);
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var2;
      this.id_case = var5;
      this.id_class(var1);
   }

   public riD_2(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.b, var2);
      this.id_throws = new rqO_2(var2.id_native("Template"));
      this.id_case = var2.id_new("isBeached");
      this.id_protected = rqd_3.valueOf(var2.id_native("Rot"));
      this.id_class(var1);
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
      if ("map_chest".equals(var1)) {
         rHK.id_class(var3, var4, var2.id_break(), rzl_3.id_float);
      } else if ("treasure_chest".equals(var1)) {
         rHK.id_class(var3, var4, var2.id_break(), rzl_3.id_static);
      } else if ("supply_chest".equals(var1)) {
         rHK.id_class(var3, var4, var2.id_break(), rzl_3.id_void);
      }
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      int var8 = 256;
      int var9 = 0;
      rfH_2 var10 = this.id_class.id_class();
      rKv_1 var11 = this.id_case ? rKv_1.WORLD_SURFACE_WG : rKv_1.OCEAN_FLOOR_WG;
      int var12 = var10.b_() * var10.d_();
      if (var12 == 0) {
         var9 = var1.id_class(var11, this.id_byte.b_(), this.id_byte.d_());
      } else {
         rfH_2 var13 = this.id_byte.id_break(var10.b_() - 1, 0, var10.d_() - 1);

         for (rfH_2 var15 : rfH_2.id_class(this.id_byte, var13)) {
            int var16 = var1.id_class(var11, var15.b_(), var15.d_());
            var9 += var16;
            var8 = Math.min(var8, var16);
         }

         var9 /= var12;
      }

      int var18 = this.id_case ? var8 - var10.c_() / 2 - var4.nextInt(3) : var9;
      this.id_byte = new rfH_2(this.id_byte.b_(), var18, this.id_byte.d_());
      return super.id_class(var1, var2, var3, var4, var5, var6, var7);
   }

   private void id_class(rrPt_1 var1) {
      rrPl_1 var2 = var1.id_class(this.id_throws);
      rrPN var3 = new rrPN().id_class(this.id_protected).id_class(rpa_3.NONE).id_class(riK_2.id_class).id_class(rrPG.id_protected);
      this.id_class(var2, this.id_byte, var3);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_throws.toString());
      var1.id_class("isBeached", this.id_case);
      var1.id_class("Rot", this.id_protected.name());
   }
}
