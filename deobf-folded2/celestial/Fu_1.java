package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class Fu_1<T extends rJr_1> extends vm_3 implements Zg_1, cl_3<T> {
   public static final rqO_2 id_else = new rqO_2("textures/gui/container/inventory.png");
   public int id_synchronized = 176;
   public int id_return = 166;
   protected int id_public;
   protected int id_goto;
   protected int id_while;
   protected int id_try;
   protected final T id_instanceof;
   @Nullable
   protected final rhz_3 id_throw;
   protected rJY id_interface;
   private rJY id_class;
   private rJY id_throws;
   private rJY id_case;
   private rJY id_catch;
   protected int id_char;
   protected int id_abstract;
   private boolean id_private;
   private rdn_3 id_implements = rdn_3.id_break;
   private int id_finally;
   private int id_boolean;
   private long id_transient;
   private rdn_3 id_for = rdn_3.id_break;
   private long id_double;
   protected final Set<rJY> id_long = Sets.newHashSet();
   protected boolean id_float;
   private int id_switch;
   private int r;
   private boolean P;
   private int B;
   private long S;
   private int s;
   private boolean E;
   private rdn_3 G = rdn_3.id_break;

   @Override
   public rdn_3 id_byte() {
      return this.id_interface != null ? this.id_interface.id_class() : null;
   }

   public rJY id_int() {
      return this.id_interface;
   }

   public Fu_1(T var1, rhz_3 var2, rgP_2 var3) {
      super(var3);
      this.id_instanceof = (T)var1;
      this.id_throw = var2;
      this.P = true;
      this.id_public = 8;
      this.id_goto = 6;
      this.id_while = 8;
      this.id_try = this.id_return - 94;
   }

   public void id_class(rJY var1, int var2, int var3, rXa_1 var4) {
      if (var1 != null) {
         var2 = var1.id_protected;
      }

      ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_instanceof.id_case, var2, var3, var4, true);
   }

   protected boolean id_class(int var1, int var2, int var3, int var4, double var5, double var7) {
      int var9 = this.id_char;
      int var10 = this.id_abstract;
      var5 -= (double)var9;
      var7 -= (double)var10;
      return var5 >= (double)(var1 - 1) && var5 < (double)(var1 + var3 + 1) && var7 >= (double)(var2 - 1) && var7 < (double)(var2 + var4 + 1);
   }

   public boolean id_class(rJY var1, double var2, double var4) {
      return this.id_class(var1.id_throws, var1.id_case, 16, 16, var2, var4);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      super.id_class(var1, var3, var5, var6, var8);
      rJY var10 = this.id_protected(var1, var3);
      rdn_3 var11 = ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally();
      if (this.id_class != null && ((Qw_1)this.id_volatile.id_class[20]).S) {
         if (var5 == 0 || var5 == 1) {
            if (this.id_implements.id_class()) {
               if (var10 != this.id_class && !this.id_class.id_class().id_class()) {
                  this.id_implements = this.id_class.id_class().id_implements();
               }
            } else if (this.id_implements.id_char() > 1 && var10 != null && rJr_1.id_class(var10, this.id_implements, false)) {
               long var12 = rqR_2.id_break();
               if (this.id_case == var10) {
                  if (var12 - this.id_double > 500L) {
                     this.id_class(this.id_class, this.id_class.id_protected, 0, rXa_1.PICKUP);
                     this.id_class(var10, var10.id_protected, 1, rXa_1.PICKUP);
                     this.id_class(this.id_class, this.id_class.id_protected, 0, rXa_1.PICKUP);
                     this.id_double = var12 + 750L;
                     this.id_implements.id_catch(1);
                  }
               } else {
                  this.id_case = var10;
                  this.id_double = var12;
               }
            }
         }
      } else if (this.id_float
         && var10 != null
         && !var11.id_class()
         && (var11.id_char() > this.id_long.size() || this.id_switch == 2)
         && rJr_1.id_class(var10, var11, true)
         && var10.id_class(var11)
         && this.id_instanceof.id_class(var10)) {
         this.id_long.add(var10);
         this.id_finally();
      }

      return true;
   }

   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      rJY var6 = this.id_protected(var1, var3);
      int var7 = this.id_char;
      int var8 = this.id_abstract;
      boolean var9 = this.id_class(var1, var3, var7, var8, var5);
      int var10 = -1;
      if (var6 != null) {
         var10 = var6.id_protected;
      }

      if (var9) {
         var10 = -999;
      }

      if (this.E && var6 != null && var5 == 0 && this.id_instanceof.id_class(rdn_3.id_break, var6)) {
         if (id_synchronized()) {
            if (!this.G.id_class()) {
               for (rJY var16 : this.id_instanceof.id_throws) {
                  if (var16 != null
                     && var16.id_class((cb_3)this.id_volatile.id_class[57])
                     && var16.id_break()
                     && var16.id_byte == var6.id_byte
                     && rJr_1.id_class(var16, this.G, true)) {
                     this.id_class(var16, var16.id_protected, var5, rXa_1.QUICK_MOVE);
                  }
               }
            }
         } else {
            this.id_class(var6, var10, var5, rXa_1.PICKUP_ALL);
         }

         this.E = false;
         this.S = 0L;
      } else {
         if (this.id_float && this.r != var5) {
            this.id_float = false;
            this.id_long.clear();
            this.P = true;
            return true;
         }

         if (this.P) {
            this.P = false;
            return true;
         }

         if (this.id_class != null && ((Qw_1)this.id_volatile.id_class[20]).S) {
            if (var5 == 0 || var5 == 1) {
               if (this.id_implements.id_class() && var6 != this.id_class) {
                  this.id_implements = this.id_class.id_class();
               }

               boolean var14 = rJr_1.id_class(var6, this.id_implements, false);
               if (var10 != -1 && !this.id_implements.id_class() && var14) {
                  this.id_class(this.id_class, this.id_class.id_protected, var5, rXa_1.PICKUP);
                  this.id_class(var6, var10, 0, rXa_1.PICKUP);
                  if (((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
                     this.id_for = rdn_3.id_break;
                  } else {
                     this.id_class(this.id_class, this.id_class.id_protected, var5, rXa_1.PICKUP);
                     this.id_finally = rfU_2.id_byte(var1 - (double)var7);
                     this.id_boolean = rfU_2.id_byte(var3 - (double)var8);
                     this.id_throws = this.id_class;
                     this.id_for = this.id_implements;
                     this.id_transient = rqR_2.id_break();
                  }
               } else if (!this.id_implements.id_class()) {
                  this.id_finally = rfU_2.id_byte(var1 - (double)var7);
                  this.id_boolean = rfU_2.id_byte(var3 - (double)var8);
                  this.id_throws = this.id_class;
                  this.id_for = this.id_implements;
                  this.id_transient = rqR_2.id_break();
               }

               this.id_implements = rdn_3.id_break;
               this.id_class = null;
            }
         } else if (this.id_float && !this.id_long.isEmpty()) {
            this.id_class(null, -999, rJr_1.id_byte(0, this.id_switch), rXa_1.QUICK_CRAFT);

            for (rJY var12 : this.id_long) {
               this.id_class(var12, var12.id_protected, rJr_1.id_byte(1, this.id_switch), rXa_1.QUICK_CRAFT);
            }

            this.id_class(null, -999, rJr_1.id_byte(2, this.id_switch), rXa_1.QUICK_CRAFT);
         } else if (!((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
            if (((Qw_1)this.id_volatile.id_class[20]).Z.id_class(var5)) {
               this.id_class(var6, var10, var5, rXa_1.CLONE);
            } else {
               boolean var11 = var10 != -999
                  && (Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 340) || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 344));
               if (var11) {
                  this.G = var6 != null && var6.id_break() ? var6.id_class().id_implements() : rdn_3.id_break;
               }

               this.id_class(var6, var10, var5, var11 ? rXa_1.QUICK_MOVE : rXa_1.PICKUP);
            }
         }
      }

      if (((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
         this.S = 0L;
      }

      this.id_float = false;
      return super.id_class(var1, var3, var5);
   }

   protected boolean id_class(int var1, int var2) {
      if (((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class() && this.id_interface != null) {
         if (((Qw_1)this.id_volatile.id_class[20]).Q.id_class(var1, var2)) {
            this.id_class(this.id_interface, this.id_interface.id_protected, 40, rXa_1.SWAP);
            return true;
         }

         for (int var3 = 0; var3 < 9; var3++) {
            if (((Qw_1)this.id_volatile.id_class[20]).t[var3].id_class(var1, var2)) {
               this.id_class(this.id_interface, this.id_interface.id_protected, var3, rXa_1.SWAP);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      String var5 = this.id_extends.id_byte();
      rrns_3 var6 = rrns_3.id_class(this, this.id_instanceof.id_throws, var5, (float)var2, (float)var3, this.id_char, this.id_abstract);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var6);
      if (!var6.id_byte()) {
         int var7 = var6.id_protected();
         int var8 = var6.id_private();
         this.id_class(var1, var4, var2, var3);
         RenderSystem.disableRescaleNormal();
         RenderSystem.disableDepthTest();
         super.id_class(var1, var2, var3, var4);
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var7, (float)var8, 0.0F);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableRescaleNormal();
         this.id_interface = null;
         RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);

         for (rJY var11 : var6.id_throws()) {
            if (var11.id_case()) {
               this.id_class(var1, var11);
            }

            if (this.id_class(var11, (double)var2, (double)var3) && var11.id_case()) {
               this.id_interface = var11;
               RenderSystem.disableDepthTest();
               int var12 = var11.id_throws;
               int var13 = var11.id_case;
               RenderSystem.colorMask(true, true, true, false);
               this.id_class(var1, var12, var13, var12 + 16, var13 + 16, -2130706433, -2130706433);
               RenderSystem.colorMask(true, true, true, true);
               RenderSystem.enableDepthTest();
            }
         }

         this.id_class(var1, var2, var3);
         rhz_3 var17 = (rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1];
         rdn_3 var18 = this.id_implements.id_class() ? var17.id_finally() : this.id_implements;
         if (!var18.id_class()) {
            int var19 = this.id_implements.id_class() ? 8 : 16;
            String var21 = null;
            if (!this.id_implements.id_class() && this.id_private) {
               var18 = var18.id_implements();
               var18.id_throws(rfU_2.id_case((float)var18.id_char() / 2.0F));
            } else if (this.id_float && this.id_long.size() > 1) {
               var18 = var18.id_implements();
               var18.id_throws(this.B);
               if (var18.id_class()) {
                  var21 = rgF_2.YELLOW + "0";
               }
            }

            this.id_class(var18, var2 - var7 - 8, var3 - var8 - var19, var21);
         }

         if (!this.id_for.id_class()) {
            float var20 = (float)(rqR_2.id_break() - this.id_transient) / 100.0F;
            if (var20 >= 1.0F) {
               var20 = 1.0F;
               this.id_for = rdn_3.id_break;
            }

            int var22 = this.id_throws.id_throws - this.id_finally;
            int var14 = this.id_throws.id_case - this.id_boolean;
            int var15 = this.id_finally + (int)((float)var22 * var20);
            int var16 = this.id_boolean + (int)((float)var14 * var20);
            this.id_class(this.id_for, var15, var16, null);
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (((Qw_1)this.id_volatile.id_class[20]).z.id_class(var1, var2)) {
         if (!rrFY.id_class(this).id_byte()) {
            this.id_volatile();
            return true;
         } else {
            return false;
         }
      } else {
         this.id_class(var1, var2);
         if (this.id_interface != null && this.id_interface.id_break()) {
            if (((Qw_1)this.id_volatile.id_class[20]).Z.id_class(var1, var2)) {
               this.id_class(this.id_interface, this.id_interface.id_protected, 0, rXa_1.CLONE);
            } else if (((Qw_1)this.id_volatile.id_class[20]).N.id_class(var1, var2)) {
               rdn_3 var4 = this.id_interface.id_class().id_implements();
               this.id_class(this.id_interface, this.id_interface.id_protected, id_else() ? 1 : 0, rXa_1.THROW);
               rrLV.id_class(var4, this, (rrLg_1)rrLg_1.staticFields83bfa4843c3c3647913690fe22963b15[0]);
            }
         }

         return true;
      }
   }

   public void id_class(rdn_3 var1, int var2, int var3, String var4) {
      RenderSystem.translatef(0.0F, 0.0F, 32.0F);
      this.id_class(200);
      this.id_final.id_break = 200.0F;
      this.id_final.id_class(var1, var2, var3);
      this.id_final.id_class(this.id_super, var1, (float)var2, (float)(var3 - (this.id_implements.id_class() ? 0 : 8)), var4);
      this.id_class(0);
      this.id_final.id_break = 0.0F;
   }

   protected abstract void id_class(Ml_1 var1, float var2, int var3, int var4);

   private void id_class(Ml_1 var1, rJY var2) {
      int var3 = var2.id_throws;
      int var4 = var2.id_case;
      rdn_3 var5 = var2.id_class();
      boolean var6 = false;
      boolean var7 = var2 == this.id_class && !this.id_implements.id_class() && !this.id_private;
      rdn_3 var8 = ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally();
      String var9 = null;
      if (var2 == this.id_class && !this.id_implements.id_class() && this.id_private && !var5.id_class()) {
         var5 = var5.id_implements();
         var5.id_throws(var5.id_char() / 2);
      } else if (this.id_float && this.id_long.contains(var2) && !var8.id_class()) {
         if (this.id_long.size() == 1) {
            return;
         }

         if (rJr_1.id_class(var2, var8, true) && this.id_instanceof.id_class(var2)) {
            var5 = var8.id_implements();
            var6 = true;
            rJr_1.id_class(this.id_long, this.id_switch, var5, var2.id_class().id_class() ? 0 : var2.id_class().id_char());
            int var10 = Math.min(var5.id_byte(), var2.id_byte(var5));
            if (var5.id_char() > var10) {
               var9 = rgF_2.YELLOW.toString() + var10;
               var5.id_throws(var10);
            }
         } else {
            this.id_long.remove(var2);
            this.id_finally();
         }
      }

      this.id_class(100);
      this.id_final.id_break = 100.0F;
      if (var5.id_class() && var2.id_case()) {
         Pair var12 = var2.id_throws();
         if (var12 != null) {
            fj_3 var11 = this.id_volatile.id_class((rqO_2)var12.getFirst()).apply((rqO_2)var12.getSecond());
            this.id_volatile.A().id_class(var11.id_extends().id_protected());
            id_class(var1, var3, var4, this.h_(), 16, 16, var11);
            var7 = true;
         }
      }

      if (!var7) {
         if (var6) {
            id_class(var1, var3, var4, var3 + 16, var4 + 16, -2130706433);
         }

         RenderSystem.enableDepthTest();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAD.id_class(var1, var2, var3, var4, 16, 16));
         this.id_final.id_class((cb_3)this.id_volatile.id_class[57], var5, (float)var3, (float)var4);
         this.id_final.id_class(this.id_super, var5, (float)var3, (float)var4, var9);
      }

      this.id_final.id_break = 0.0F;
      this.id_class(0);
   }

   protected void id_class(Ml_1 var1, int var2, int var3) {
      this.id_super.id_byte(var1, this.id_extends, (float)this.id_public, (float)this.id_goto, 4210752);
      if (this.id_throw != null) {
         this.id_super.id_byte(var1, this.id_throw.L_(), (float)this.id_while, (float)this.id_try, 4210752);
      }
   }

   protected void id_break(Ml_1 var1, int var2, int var3) {
      if (((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class() && this.id_interface != null && this.id_interface.id_break()) {
         this.id_class(var1, this.id_interface.id_class(), var2, var3);
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (super.id_break(var1, var3, var5)) {
         return true;
      } else {
         boolean var6 = ((Qw_1)this.id_volatile.id_class[20]).Z.id_class(var5);
         rJY var7 = this.id_protected(var1, var3);
         long var8 = rqR_2.id_break();
         this.E = this.id_catch == var7 && var8 - this.S < 250L && this.s == var5;
         this.P = false;
         if (var5 != 0 && var5 != 1 && !var6) {
            this.id_break(var5);
         } else {
            int var10 = this.id_char;
            int var11 = this.id_abstract;
            boolean var12 = this.id_class(var1, var3, var10, var11, var5);
            int var13 = -1;
            if (var7 != null) {
               var13 = var7.id_protected;
            }

            if (var12) {
               var13 = -999;
            }

            if (((Qw_1)this.id_volatile.id_class[20]).S && var12 && ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
               this.id_volatile.id_break(null);
               return true;
            }

            if (var13 != -1) {
               if (((Qw_1)this.id_volatile.id_class[20]).S) {
                  if (var7 != null && var7.id_break()) {
                     this.id_class = var7;
                     this.id_implements = rdn_3.id_break;
                     this.id_private = var5 == 1;
                  } else {
                     this.id_class = null;
                  }
               } else if (!this.id_float) {
                  if (((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
                     if (((Qw_1)this.id_volatile.id_class[20]).Z.id_class(var5)) {
                        this.id_class(var7, var13, var5, rXa_1.CLONE);
                     } else {
                        boolean var14 = var13 != -999
                           && (
                              Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 340)
                                 || Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 344)
                           );
                        rXa_1 var15 = rXa_1.PICKUP;
                        if (var14) {
                           this.G = var7 != null && var7.id_break() ? var7.id_class().id_implements() : rdn_3.id_break;
                           var15 = rXa_1.QUICK_MOVE;
                        } else if (var13 == -999) {
                           var15 = rXa_1.THROW;
                        }

                        this.id_class(var7, var13, var5, var15);
                     }

                     this.P = true;
                  } else {
                     this.id_float = true;
                     this.r = var5;
                     this.id_long.clear();
                     if (var5 == 0) {
                        this.id_switch = 0;
                     } else if (var5 == 1) {
                        this.id_switch = 1;
                     } else if (((Qw_1)this.id_volatile.id_class[20]).Z.id_class(var5)) {
                        this.id_switch = 2;
                     }
                  }
               }
            }
         }

         this.id_catch = var7;
         this.S = var8;
         this.s = var5;
         return true;
      }
   }

   private void id_break(int var1) {
      if (this.id_interface != null && ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally().id_class()) {
         if (((Qw_1)this.id_volatile.id_class[20]).Q.id_class(var1)) {
            this.id_class(this.id_interface, this.id_interface.id_protected, 40, rXa_1.SWAP);
            return;
         }

         for (int var2 = 0; var2 < 9; var2++) {
            if (((Qw_1)this.id_volatile.id_class[20]).t[var2].id_class(var1)) {
               this.id_class(this.id_interface, this.id_interface.id_protected, var2, rXa_1.SWAP);
            }
         }
      }
   }

   private void id_finally() {
      rdn_3 var1 = ((rhz_3)((cb_3)this.id_volatile.id_class[57]).id_implements[1]).id_finally();
      if (!var1.id_class() && this.id_float) {
         if (this.id_switch == 2) {
            this.B = var1.id_byte();
         } else {
            this.B = var1.id_char();

            for (rJY var3 : this.id_long) {
               rdn_3 var4 = var1.id_implements();
               rdn_3 var5 = var3.id_class();
               int var6 = var5.id_class() ? 0 : var5.id_char();
               rJr_1.id_class(this.id_long, this.id_switch, var4, var6);
               int var7 = Math.min(var4.id_byte(), var3.id_byte(var4));
               if (var4.id_char() > var7) {
                  var4.id_throws(var7);
               }

               this.B = this.B - (var4.id_char() - var6);
            }
         }
      }
   }

   private rJY id_protected(double var1, double var3) {
      for (int var5 = 0; var5 < this.id_instanceof.id_throws.size(); var5++) {
         rJY var6 = this.id_instanceof.id_throws.get(var5);
         if (this.id_class(var6, var1, var3) && var6.id_case()) {
            return var6;
         }
      }

      return null;
   }

   @Override
   public void id_private() {
      super.id_private();
      if (!((cb_3)this.id_volatile.id_class[57]).BM() || (Boolean)((cb_3)this.id_volatile.id_class[57]).id_throws[27]) {
         ((cb_3)this.id_volatile.id_class[57]).id_strictfp();
      }
   }

   @Override
   public void id_volatile() {
      ((cb_3)this.id_volatile.id_class[57]).id_strictfp();
      super.id_volatile();
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_char = (this.id_package - this.id_synchronized) / 2;
      this.id_abstract = (this.id_int - this.id_return) / 2;
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      if ((cb_3)this.id_volatile.id_class[57] != null) {
         this.id_instanceof.id_break((cb_3)this.id_volatile.id_class[57]);
      }
   }

   @Override
   public T G_() {
      return this.id_instanceof;
   }
}
