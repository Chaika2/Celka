package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Optional;
import java.util.Random;

public class NM implements NW {
   private final cb_3 id_class;
   private final Nf_1 id_break;
   private final rYA id_byte;
   private final Random id_protected;
   private Object2ObjectArrayMap<rYG, NO> id_throws = new Object2ObjectArrayMap();
   private Optional<rYj_1> id_case = Optional.empty();
   private Optional<rYg_1> id_catch = Optional.empty();
   private float id_private;
   private rYG id_implements;

   public NM(cb_3 var1, Nf_1 var2, rYA var3) {
      this.id_protected = ((rYB)var1.id_throws[7]).id_long();
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public float id_class() {
      return this.id_private;
   }

   @Override
   public void id_break() {
      this.id_throws.values().removeIf(cr_3::id_continue);
      rYG var1 = this.id_byte.id_class(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      if (var1 != this.id_implements) {
         this.id_implements = var1;
         this.id_case = var1.id_new();
         this.id_catch = var1.id_continue();
         this.id_throws.values().forEach(NO::id_class);
         var1.id_int().ifPresent(var2 -> {
            NO var3 = (NO)this.id_throws.compute(var1, (var2x, var3x) -> {
               if (var3x == null) {
                  var3x = new NO(var2);
                  this.id_break.id_class((NQ)var3x);
               }

               var3x.id_break();
               return var3x;
            });
         });
      }

      this.id_catch.ifPresent(var1x -> {
         if (this.id_protected.nextDouble() < var1x.id_break()) {
            this.id_break.id_class(Np_1.id_break(var1x.id_class()));
         }
      });
      this.id_case
         .ifPresent(
            var1x -> {
               rYB var2 = (rYB)this.id_class.id_throws[7];
               int var3 = var1x.id_byte() * 2 + 1;
               rfH_2 var4 = new rfH_2(
                  this.id_class.rx() + (double)this.id_protected.nextInt(var3) - (double)var1x.id_byte(),
                  this.id_class.rH() + (double)this.id_protected.nextInt(var3) - (double)var1x.id_byte(),
                  this.id_class.BO() + (double)this.id_protected.nextInt(var3) - (double)var1x.id_byte()
               );
               int var5 = var2.id_class(rRo_1.SKY, var4);
               if (var5 > 0) {
                  this.id_private = this.id_private - (float)var5 / (float)var2.id_while() * 0.001F;
               } else {
                  this.id_private = this.id_private - (float)(var2.id_class(rRo_1.BLOCK, var4) - 1) / (float)var1x.id_break();
               }

               if (this.id_private >= 1.0F) {
                  double var6 = (double)var4.b_() + 0.5;
                  double var8 = (double)var4.c_() + 0.5;
                  double var10 = (double)var4.d_() + 0.5;
                  double var12 = var6 - this.id_class.rx();
                  double var14 = var8 - this.id_class.rH();
                  double var16 = var10 - this.id_class.BO();
                  double var18 = (double)rfU_2.id_class(var12 * var12 + var14 * var14 + var16 * var16);
                  double var20 = var18 + var1x.id_protected();
                  Np_1 var22 = Np_1.id_break(
                     var1x.id_class(),
                     this.id_class.rx() + var12 / var18 * var20,
                     this.id_class.rH() + var14 / var18 * var20,
                     this.id_class.BO() + var16 / var18 * var20
                  );
                  this.id_break.id_class(var22);
                  this.id_private = 0.0F;
               } else {
                  this.id_private = Math.max(this.id_private, 0.0F);
               }
            }
         );
   }
}
