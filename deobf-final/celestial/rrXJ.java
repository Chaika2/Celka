package celestial;

public class rrXJ implements rrXh_1 {
   private rrMi_1 class_;
   private In_1 break_;
   private rrMU[] byte_;
   private Iq_1 protected_;
   private Iq_1 throws_;
   private rrXX case_;

   @Override
   public rrXt_1 byte_(String var1) {
      rrXd_1 var2 = this.break_(var1);
      if (var2 != null) {
         return var2;
      } else {
         rrXt_1 var3 = this.case_.class_(var1);
         return var3 != null ? var3 : null;
      }
   }

   public rrXJ(rrMi_1 var1, In_1 var2, rrMU[] var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      rrWQ var4 = var1.class_();
      if (var4.break_().isPresent()) {
         this.case_ = new rrXZ();
      } else {
         this.case_ = new rrXm_1();
      }
   }

   public void class_(Iq_1 var1) {
      this.throws_ = var1;
   }

   @Override
   public Iq_1 class_(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(":") >= 0) {
         String[] var7 = rrbb_3.class_(var1, ":");
         Iq_1 var8 = this.class_(var7[0]);

         for (int var9 = 1; var9 < var7.length; var9++) {
            String var10 = var7[var9];
            Iq_1 var11 = var8.byte_(var10);
            if (var11 == null) {
               return null;
            }

            var8 = var11;
         }

         return var8;
      } else if (this.protected_ != null && var1.equals("this")) {
         return this.protected_;
      } else if (this.throws_ != null && var1.equals("part")) {
         return this.throws_;
      } else {
         Iq_1 var2 = this.class_.class_(this.break_, var1);
         if (var2 != null) {
            return var2;
         } else {
            for (int var3 = 0; var3 < this.byte_.length; var3++) {
               rrMU var4 = this.byte_[var3];
               Iq_1 var5 = var4.class_();
               if (var1.equals(var5.byte_())) {
                  return var5;
               }

               Iq_1 var6 = var5.byte_(var1);
               if (var6 != null) {
                  return var6;
               }
            }

            return null;
         }
      }
   }

   public void break_(Iq_1 var1) {
      this.protected_ = var1;
   }

   @Override
   public rrXd_1 break_(String var1) {
      String[] var2 = rrbb_3.class_(var1, ".");
      if (var2.length != 2) {
         return null;
      } else {
         String var3 = var2[0];
         String var4 = var2[1];
         Iq_1 var5 = this.class_(var3);
         if (var5 == null) {
            return null;
         } else {
            rrXk_1 var6 = rrXk_1.class_(var4);
            return var6 == null ? null : new rrXd_1(var1, var5, var6);
         }
      }
   }
}
