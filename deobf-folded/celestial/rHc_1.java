package celestial;

import java.util.Optional;
import java.util.Random;

public class rHc_1 extends ryO_2 implements rHf_1, rXc_1 {
   private final rqs_3<rdn_3> id_class = rqs_3.id_class(4, rdn_3.id_break);
   private final int[] id_break = new int[4];
   private final int[] id_byte = new int[4];

   public rHc_1() {
      super(ryW_2.id_abstract);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      this.id_break(var1);
      var1.id_class("CookingTimes", this.id_break);
      var1.id_class("CookingTotalTimes", this.id_byte);
      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class.clear();
      rXC.id_break(var2, this.id_class);
      if (var2.id_byte("CookingTimes", 11)) {
         int[] var3 = var2.id_final("CookingTimes");
         System.arraycopy(var3, 0, this.id_break, 0, Math.min(this.id_byte.length, var3.length));
      }

      if (var2.id_byte("CookingTotalTimes", 11)) {
         int[] var4 = var2.id_final("CookingTotalTimes");
         System.arraycopy(var4, 0, this.id_byte, 0, Math.min(this.id_byte.length, var4.length));
      }
   }

   public Optional<rkC_2> id_class(rdn_3 var1) {
      return this.id_class.stream().noneMatch(rdn_3::id_class)
         ? Optional.empty()
         : this.id_extends.id_implements().id_class(rkj_3.id_throws, new rXA(var1), this.id_extends);
   }

   public boolean id_class(rdn_3 var1, int var2) {
      for (int var3 = 0; var3 < this.id_class.size(); var3++) {
         rdn_3 var4 = this.id_class.get(var3);
         if (var4.id_class()) {
            this.id_byte[var3] = var2;
            this.id_break[var3] = 0;
            this.id_class.set(var3, var1.id_class(1));
            this.id_extends();
            return true;
         }
      }

      return false;
   }

   public rqs_3<rdn_3> id_class() {
      return this.id_class;
   }

   private rcd_3 id_break(rcd_3 var1) {
      super.id_class(var1);
      rXC.id_class(var1, this.id_class, true);
      return var1;
   }

   @Override
   public void id_throws() {
      boolean var1 = this.id_abstract().id_byte(xn_3.id_final);
      boolean var2 = this.id_extends.id_continue;
      if (var2) {
         if (var1) {
            this.id_finally();
         }
      } else if (var1) {
         this.id_private();
      } else {
         for (int var3 = 0; var3 < this.id_class.size(); var3++) {
            if (this.id_break[var3] > 0) {
               this.id_break[var3] = rfU_2.id_class(this.id_break[var3] - 2, 0, this.id_byte[var3]);
            }
         }
      }
   }

   private void id_finally() {
      rYB var1 = this.id_while();
      if (var1 != null) {
         rfH_2 var2 = this.id_char();
         Random var3 = var1.id_int;
         if (var3.nextFloat() < 0.11F) {
            for (int var4 = 0; var4 < var3.nextInt(2) + 2; var4++) {
               xn_3.id_class(var1, var2, this.id_abstract().id_byte(xn_3.id_package), false);
            }
         }

         int var15 = this.id_abstract().id_byte(xn_3.id_new).id_protected();

         for (int var5 = 0; var5 < this.id_class.size(); var5++) {
            if (!this.id_class.get(var5).id_class() && var3.nextFloat() < 0.2F) {
               rpr_3 var6 = rpr_3.id_break(Math.floorMod(var5 + var15, 4));
               float var7 = 0.3125F;
               double var8 = (double)var2.b_()
                  + 0.5
                  - (double)((float)var6.id_implements() * 0.3125F)
                  + (double)((float)var6.id_catch().id_implements() * 0.3125F);
               double var10 = (double)var2.c_() + 0.5;
               double var12 = (double)var2.d_() + 0.5 - (double)((float)var6.id_extends() * 0.3125F) + (double)((float)var6.id_catch().id_extends() * 0.3125F);

               for (int var14 = 0; var14 < 4; var14++) {
                  var1.id_class(rLQ.id_double, var8, var10, var12, 0.0, 5.0E-4, 0.0);
               }
            }
         }
      }
   }

   public void id_catch() {
      if (this.id_extends != null) {
         if (!this.id_extends.id_continue) {
            rXn_1.id_class(this.id_extends, this.id_char(), this.id_class());
         }

         this.id_extends();
      }
   }

   private void id_extends() {
      this.id_break();
      this.id_while().id_class(this.id_char(), this.id_abstract(), this.id_abstract(), 3);
   }

   @Override
   public void id_public() {
      this.id_class.clear();
   }

   private void id_private() {
      for (int var1 = 0; var1 < this.id_class.size(); var1++) {
         rdn_3 var2 = this.id_class.get(var1);
         if (!var2.id_class()) {
            this.id_break[var1]++;
            if (this.id_break[var1] >= this.id_byte[var1]) {
               rXA var4 = new rXA(var2);
               rdn_3 var5 = this.id_extends.id_implements().id_class(rkj_3.id_throws, var4, this.id_extends).map(var1x -> var1x.id_class(var4)).orElse(var2);
               rfH_2 var6 = this.id_char();
               rXn_1.id_class(this.id_extends, (double)var6.b_(), (double)var6.c_(), (double)var6.d_(), var5);
               this.id_class.set(var1, rdn_3.id_break);
               this.id_extends();
            }
         }
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 13, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_break(new rcd_3());
   }
}
