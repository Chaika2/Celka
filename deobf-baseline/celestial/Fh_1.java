package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fh_1 extends Fu_1<rXT> {
   static final rqO_2 id_class = new rqO_2("textures/gui/container/beacon.png");
   private static final rgP_2 id_throws = new rgn_3("block.minecraft.beacon.primary");
   private static final rgP_2 id_case = new rgn_3("block.minecraft.beacon.secondary");
   private Fd_1 id_catch;
   boolean id_private;
   rLR id_implements;
   rLR id_finally;

   public Fh_1(rXT var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_synchronized = 230;
      this.id_return = 219;
      var1.id_class(new FX(this, var1));
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      this.id_final.id_break = 100.0F;
      this.id_final.id_class(new rdn_3(rdy_3.Ok), var5 + 20, var6 + 109);
      this.id_final.id_class(new rdn_3(rdy_3.dP), var5 + 41, var6 + 109);
      this.id_final.id_class(new rdn_3(rdy_3.OJ), var5 + 41 + 22, var6 + 109);
      this.id_final.id_class(new rdn_3(rdy_3.Od), var5 + 42 + 44, var6 + 109);
      this.id_final.id_class(new rdn_3(rdy_3.Ox), var5 + 42 + 66, var6 + 109);
      this.id_final.id_break = 0.0F;
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      id_class(var1, this.id_super, id_throws, 62, 10, 14737632);
      id_class(var1, this.id_super, id_case, 169, 10, 14737632);

      for (LZ var5 : this.id_new) {
         if (var5.B_()) {
            var5.id_class(var1, var2 - this.id_char, var3 - this.id_abstract);
            break;
         }
      }
   }

   @Override
   public void id_private() {
      super.id_private();
      int var1 = this.id_instanceof.id_class();
      if (this.id_private && var1 >= 0) {
         this.id_private = false;

         for (int var2 = 0; var2 <= 2; var2++) {
            int var3 = rHO.id_class[var2].length;
            int var4 = var3 * 22 + (var3 - 1) * 2;

            for (int var5 = 0; var5 < var3; var5++) {
               rLR var6 = rHO.id_class[var2][var5];
               Fk_1 var7 = new Fk_1(this, this.id_char + 76 + var5 * 24 - var4 / 2, this.id_abstract + 22 + var2 * 25, var6, true);
               this.id_class(var7);
               if (var2 >= var1) {
                  var7.id_int = false;
               } else if (var6 == this.id_implements) {
                  var7.id_class(true);
               }
            }
         }

         byte var8 = 3;
         int var9 = rHO.id_class[3].length + 1;
         int var10 = var9 * 22 + (var9 - 1) * 2;

         for (int var11 = 0; var11 < var9 - 1; var11++) {
            rLR var13 = rHO.id_class[3][var11];
            Fk_1 var14 = new Fk_1(this, this.id_char + 167 + var11 * 24 - var10 / 2, this.id_abstract + 47, var13, false);
            this.id_class(var14);
            if (3 >= var1) {
               var14.id_int = false;
            } else if (var13 == this.id_finally) {
               var14.id_class(true);
            }
         }

         if (this.id_implements != null) {
            Fk_1 var12 = new Fk_1(this, this.id_char + 167 + (var9 - 1) * 24 - var10 / 2, this.id_abstract + 47, this.id_implements, false);
            this.id_class(var12);
            if (3 >= var1) {
               var12.id_int = false;
            } else if (this.id_implements == this.id_finally) {
               var12.id_class(true);
            }
         }
      }

      this.id_catch.id_int = this.id_instanceof.id_protected() && this.id_implements != null;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_catch = this.id_class(new Fd_1(this, this.id_char + 164, this.id_abstract + 107));
      this.id_class(new Fx_1(this, this.id_char + 190, this.id_abstract + 107));
      this.id_private = true;
      this.id_catch.id_int = false;
   }
}
