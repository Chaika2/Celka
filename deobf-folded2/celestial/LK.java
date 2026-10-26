package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class LK extends Lo_1 {
   private final Vu_1 id_break;
   private final rgP_2 id_byte;
   private final LF id_protected;
   private final LF id_throws;

   LK(LR var1, Vu_1 var2, rgP_2 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = new LD(this, 0, 0, 75, 20, var3, var2x -> this.id_class.id_class.id_class = var2, var1, var2, var3);
      this.id_throws = new LU(this, 0, 0, 50, 20, new rgn_3("controls.reset"), var2x -> {
         ((Qw_1)this.id_class.id_native.id_class[20]).id_class(var2, var2.id_private(), var2.id_finally());
         Vu_1.id_byte();
      }, var1, var3);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      return this.id_protected.id_class(var1, var3, var5) || this.id_throws.id_class(var1, var3, var5);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      boolean var11 = this.id_class.id_class.id_class == this.id_break;
      ((cm_3)this.id_class.id_native.id_class[15])
         .id_byte(var1, this.id_byte, (float)(var4 + 90 - this.id_class.id_throws), (float)(var3 + var6 / 2 - 4), 16777215);
      this.id_throws.id_volatile = var4 + 190;
      this.id_throws.id_final = var3;
      this.id_throws.id_int = !this.id_break.id_volatile();
      this.id_throws.id_class(var1, var7, var8, var10);
      this.id_protected.id_volatile = var4 + 105;
      this.id_protected.id_final = var3;
      this.id_protected.id_break(this.id_break.id_native());
      boolean var12 = false;
      if (!this.id_break.id_extends()) {
         for (Vu_1 var16 : ((Qw_1)this.id_class.id_native.id_class[20]).f) {
            if (var16 != this.id_break && this.id_break.id_byte(var16)) {
               var12 = true;
               break;
            }
         }
      }

      if (var11) {
         this.id_protected.id_break(new rgN_2("> ").id_class(this.id_protected.C_().id_case().id_class(rgF_2.YELLOW)).id_break(" <").id_class(rgF_2.YELLOW));
      } else if (var12) {
         this.id_protected.id_break(this.id_protected.C_().id_case().id_class(rgF_2.RED));
      }

      this.id_protected.id_class(var1, var7, var8, var10);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      return this.id_protected.id_break(var1, var3, var5) ? true : this.id_throws.id_break(var1, var3, var5);
   }

   @Override
   public List<? extends cC_2> x_() {
      return ImmutableList.of(this.id_protected, this.id_throws);
   }
}
