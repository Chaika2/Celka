package celestial;

public abstract class JD extends dB_2 implements kd_3 {
   public static final rCN id_volatile = rCT.id_throw;
   protected static final rjC_2 id_final = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final Qr_1 id_package;

   protected JD(Jq_1 var1, Qr_1 var2) {
      super(var1);
      this.id_package = var2;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new ryS_2();
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      rdn_3 var7 = var4.id_protected(var5);
      boolean var8 = var7.id_break() instanceof rxA_2 && ((rhx_3)var4.id_implements[18]).id_throws;
      if (var2.id_continue) {
         return var8 ? ryZ_2.SUCCESS : ryZ_2.CONSUME;
      } else if (var2.id_class(var3) instanceof ryS_2 var10) {
         if (var8) {
            boolean var11 = var10.id_class(((rxA_2)var7.id_break()).id_byte());
            if (var11 && !var4.id_implements()) {
               var7.id_catch(1);
            }
         }

         return var10.id_break(var4) ? ryZ_2.SUCCESS : ryZ_2.PASS;
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_volatile)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final;
   }

   @Override
   public boolean id_class() {
      return true;
   }

   public Qr_1 id_break() {
      return this.id_package;
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_volatile) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }
}
