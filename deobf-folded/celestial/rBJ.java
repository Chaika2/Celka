package celestial;

import java.util.EnumSet;

public class rBJ extends rBk_1 {
   private final rOQ id_class;
   private iB_2 id_break;
   private final rRR id_byte;
   private final double id_protected;
   private final rLy_1 id_throws;
   private int id_case;
   private final float id_catch;
   private final float id_private;
   private float id_implements;
   private final boolean id_finally;

   @Override
   public void id_byte() {
      this.id_case = 0;
      this.id_implements = this.id_class.id_class(rLp_1.WATER);
      this.id_class.id_class(rLp_1.WATER, 0.0F);
   }

   public rBJ(rOQ var1, double var2, float var4, float var5, boolean var6) {
      this.id_class = var1;
      this.id_byte = (rYB)var1.id_throws[7];
      this.id_protected = var2;
      this.id_throws = var1.id_public();
      this.id_private = var4;
      this.id_catch = var5;
      this.id_finally = var6;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
      if (!(var1.id_public() instanceof rLA) && !(var1.id_public() instanceof rLL)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   private int id_class(int var1, int var2) {
      return this.id_class.Sa().nextInt(var2 - var1 + 1) + var1;
   }

   private boolean id_class(int var1, int var2, int var3) {
      if (Math.abs((double)var1 - this.id_break.rx()) < 2.0 && Math.abs((double)var3 - this.id_break.BO()) < 2.0) {
         return false;
      } else if (!this.id_class(new rfH_2(var1, var2, var3))) {
         return false;
      } else {
         this.id_class.id_class((double)var1 + 0.5, (double)var2, (double)var3 + 0.5, (Float)this.id_class.id_throws[15], (Float)this.id_class.id_throws[16]);
         this.id_throws.id_final();
         return true;
      }
   }

   private boolean id_class(rfH_2 var1) {
      rLp_1 var2 = rLf_1.id_class(this.id_byte, var1.id_new());
      if (var2 != rLp_1.WALKABLE) {
         return false;
      } else {
         xc_3 var3 = this.id_byte.id_byte(var1.id_break());
         if (!this.id_finally && var3.id_break() instanceof kZ_2) {
            return false;
         } else {
            rfH_2 var4 = var1.id_byte(this.id_class.Bs());
            return this.id_byte.a_(this.id_class, this.id_class.rN().id_class(var4));
         }
      }
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.sF();
      if (var1 == null) {
         return false;
      } else if (var1.id_native()) {
         return false;
      } else if (this.id_class.sL()) {
         return false;
      } else if (this.id_class.id_int(var1) < (double)(this.id_private * this.id_private)) {
         return false;
      } else {
         this.id_break = var1;
         return true;
      }
   }

   @Override
   public boolean id_break() {
      if (this.id_throws.id_native()) {
         return false;
      } else {
         return this.id_class.sL() ? false : !(this.id_class.id_int(this.id_break) <= (double)(this.id_catch * this.id_catch));
      }
   }

   @Override
   public void id_throws() {
      this.id_class.id_continue().id_class(this.id_break, 10.0F, (float)this.id_class.r());
      if (--this.id_case <= 0) {
         this.id_case = 10;
         if (!this.id_class.z() && !this.id_class.Pm()) {
            if (this.id_class.id_int(this.id_break) >= 144.0) {
               this.id_catch();
            } else {
               this.id_throws.id_class(this.id_break, this.id_protected);
            }
         }
      }
   }

   private void id_catch() {
      rfH_2 var1 = this.id_break.Bs();

      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = this.id_class(-3, 3);
         int var4 = this.id_class(-1, 1);
         int var5 = this.id_class(-3, 3);
         boolean var6 = this.id_class(var1.b_() + var3, var1.c_() + var4, var1.d_() + var5);
         if (var6) {
            return;
         }
      }
   }

   @Override
   public void id_protected() {
      this.id_break = null;
      this.id_throws.id_final();
      this.id_class.id_class(rLp_1.WATER, this.id_implements);
   }
}
