package celestial;

import java.util.EnumSet;

public abstract class rBp_1 extends rBk_1 {
   protected final aA_2 id_class;
   public final double id_break;
   protected int id_byte;
   protected int id_protected;
   private int id_catch;
   protected rfH_2 id_throws = rfH_2.id_protected;
   private boolean id_private;
   private final int id_implements;
   private final int id_finally;
   protected int id_case;

   @Override
   public void id_byte() {
      this.id_catch();
      this.id_protected = 0;
      this.id_catch = this.id_class.Sa().nextInt(this.id_class.Sa().nextInt(1200) + 1200) + 1200;
   }

   public rBp_1(aA_2 var1, double var2, int var4) {
      this(var1, var2, var4, 1);
   }

   public rBp_1(aA_2 var1, double var2, int var4, int var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_implements = var4;
      this.id_case = 0;
      this.id_finally = var5;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.JUMP));
   }

   protected abstract boolean id_class(rRR var1, rfH_2 var2);

   @Override
   public boolean id_class() {
      if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         this.id_byte = this.id_class(this.id_class);
         return this.id_volatile();
      }
   }

   protected int id_class(aA_2 var1) {
      return 200 + var1.Sa().nextInt(200);
   }

   @Override
   public boolean id_break() {
      return this.id_protected >= -this.id_catch && this.id_protected <= 1200 && this.id_class((rYB)this.id_class.id_throws[7], this.id_throws);
   }

   @Override
   public void id_throws() {
      rfH_2 var1 = this.id_finally();
      if (!var1.id_class(this.id_class.Ps(), this.id_private())) {
         this.id_private = false;
         this.id_protected++;
         if (this.id_extends()) {
            this.id_class.id_public().id_class((double)((float)var1.b_()) + 0.5, (double)var1.c_(), (double)((float)var1.d_()) + 0.5, this.id_break);
         }
      } else {
         this.id_private = true;
         this.id_protected--;
      }
   }

   protected rfH_2 id_finally() {
      return this.id_throws.id_final();
   }

   protected void id_catch() {
      this.id_class
         .id_public()
         .id_class((double)((float)this.id_throws.b_()) + 0.5, (double)(this.id_throws.c_() + 1), (double)((float)this.id_throws.d_()) + 0.5, this.id_break);
   }

   public boolean id_extends() {
      return this.id_protected % 40 == 0;
   }

   public double id_private() {
      return 1.0;
   }

   protected boolean id_volatile() {
      int var1 = this.id_implements;
      int var2 = this.id_finally;
      rfH_2 var3 = this.id_class.Bs();
      rfw_3 var4 = new rfw_3();

      for (int var5 = this.id_case; var5 <= var2; var5 = var5 > 0 ? -var5 : 1 - var5) {
         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 0; var7 <= var6; var7 = var7 > 0 ? -var7 : 1 - var7) {
               for (int var8 = var7 < var6 && var7 > -var6 ? var6 : 0; var8 <= var6; var8 = var8 > 0 ? -var8 : 1 - var8) {
                  var4.id_class(var3, var7, var5 - 1, var8);
                  if (this.id_class.id_private(var4) && this.id_class((rYB)this.id_class.id_throws[7], var4)) {
                     this.id_throws = var4;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   protected boolean id_native() {
      return this.id_private;
   }
}
