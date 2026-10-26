package celestial;

public class rrXJ implements rrXh_1 {
   private rrMi_1 id_class;
   private In_1 id_break;
   private rrMU[] id_byte;
   private Iq_1 id_protected;
   private Iq_1 id_throws;
   private rrXX id_case;

   @Override
   public rrXt_1 id_byte(String var1) {
      rrXd_1 var2 = this.id_break(var1);
      if (var2 != null) {
         return var2;
      } else {
         rrXt_1 var3 = this.id_case.id_class(var1);
         return var3 != null ? var3 : null;
      }
   }

   public rrXJ(rrMi_1 var1, In_1 var2, rrMU[] var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      rrWQ var4 = var1.id_class();
      if (var4.id_break().isPresent()) {
         this.id_case = new rrXZ();
      } else {
         this.id_case = new rrXm_1();
      }
   }

   public void id_class(Iq_1 var1) {
      this.id_throws = var1;
   }

   @Override
   public Iq_1 id_class(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.indexOf(":") >= 0) {
         String[] var7 = rrbb_3.id_class(var1, ":");
         Iq_1 var8 = this.id_class(var7[0]);

         for (int var9 = 1; var9 < var7.length; var9++) {
            String var10 = var7[var9];
            Iq_1 var11 = var8.id_byte(var10);
            if (var11 == null) {
               return null;
            }

            var8 = var11;
         }

         return var8;
      } else if (this.id_protected != null && var1.equals("this")) {
         return this.id_protected;
      } else if (this.id_throws != null && var1.equals("part")) {
         return this.id_throws;
      } else {
         Iq_1 var2 = this.id_class.id_class(this.id_break, var1);
         if (var2 != null) {
            return var2;
         } else {
            for (int var3 = 0; var3 < this.id_byte.length; var3++) {
               rrMU var4 = this.id_byte[var3];
               Iq_1 var5 = var4.id_class();
               if (var1.equals(var5.id_byte())) {
                  return var5;
               }

               Iq_1 var6 = var5.id_byte(var1);
               if (var6 != null) {
                  return var6;
               }
            }

            return null;
         }
      }
   }

   public void id_break(Iq_1 var1) {
      this.id_protected = var1;
   }

   @Override
   public rrXd_1 id_break(String var1) {
      String[] var2 = rrbb_3.id_class(var1, ".");
      if (var2.length != 2) {
         return null;
      } else {
         String var3 = var2[0];
         String var4 = var2[1];
         Iq_1 var5 = this.id_class(var3);
         if (var5 == null) {
            return null;
         } else {
            rrXk_1 var6 = rrXk_1.id_class(var4);
            return var6 == null ? null : new rrXd_1(var1, var5, var6);
         }
      }
   }
}
