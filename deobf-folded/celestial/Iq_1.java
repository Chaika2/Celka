package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iq_1 {
   public float id_class = 64.0F;
   public float id_break = 32.0F;
   private int id_continue;
   private int id_super;
   public float id_byte;
   public float id_protected;
   public float id_throws;
   public float id_case;
   public float id_catch;
   public float id_private;
   public boolean id_implements;
   public boolean id_finally = true;
   public final ObjectList<IT> id_extends = new ObjectArrayList();
   public final ObjectList<Iq_1> id_native = new ObjectArrayList();
   public List id_volatile = new ArrayList();
   public boolean id_final = false;
   public float id_package = 1.0F;
   public float id_int = 1.0F;
   public float id_new = 1.0F;
   private rqO_2 id_this = null;
   private String id_else = null;
   private rrXx_1 id_synchronized;
   private final yX_2 id_return = rrbb_3.z();

   public String id_byte() {
      return this.id_else;
   }

   public Iq_1 id_byte(String var1) {
      if (var1 == null) {
         return null;
      } else {
         Iq_1 var2 = this.id_break(var1);
         if (var2 != null) {
            return var2;
         } else {
            if (this.id_native != null) {
               for (int var3 = 0; var3 < this.id_native.size(); var3++) {
                  Iq_1 var4 = (Iq_1)this.id_native.get(var3);
                  Iq_1 var5 = var4.id_byte(var1);
                  if (var5 != null) {
                     return var5;
                  }
               }
            }

            return null;
         }
      }
   }

   private Iq_1() {
   }

   public Iq_1(In_1 var1) {
      var1.a_(this);
      this.id_break(var1.id_return, var1.id_public);
   }

   public Iq_1(In_1 var1, int var2, int var3) {
      this(var1.id_return, var1.id_public, var2, var3);
      var1.a_(this);
   }

   public Iq_1(int var1, int var2, int var3, int var4) {
      this.id_break(var1, var2);
      this.id_class(var3, var4);
   }

   @Override
   public String toString() {
      return "id: "
         + this.id_else
         + ", boxes: "
         + (this.id_extends != null ? this.id_extends.size() : null)
         + ", submodels: "
         + (this.id_native != null ? this.id_native.size() : null);
   }

   public void id_class(Iq_1 var1) {
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
   }

   public void id_class(rqO_2 var1) {
      this.id_this = var1;
   }

   public void id_class(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.id_volatile.add(new rrJq_1(this, this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, var7));
   }

   public IT id_class(Random var1) {
      return (IT)this.id_extends.get(var1.nextInt(this.id_extends.size()));
   }

   private void id_class(MH var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      rjV_2 var9 = var1.id_class();
      rjj_3 var10 = var1.id_break();
      boolean var11 = rrbb_3.rs() && rrdZ.p && rrbb_3.id_final();
      ObjectListIterator var12 = this.id_extends.iterator();

      while (var12.hasNext()) {
         IT var13 = (IT)var12.next();
         rrxq_3[][] var14 = null;
         if (var11) {
            rrbD_2 var15 = rrME.id_class();
            if (var15 != null) {
               var14 = var13.id_class(var15.id_class());
            }
         }

         int var30 = var13.id_catch.length;

         for (int var16 = 0; var16 < var30; var16++) {
            Iw_1 var17 = var13.id_catch[var16];
            if (var17 != null) {
               if (var14 != null) {
                  var2.id_class(var14[var16]);
               }

               rje_3 var18 = var2.id_class(var17.id_break);
               var18.id_class(var10);
               float var19 = var18.id_class();
               float var20 = var18.id_break();
               float var21 = var18.id_byte();

               for (int var22 = 0; var22 < 4; var22++) {
                  It_1 var23 = var17.id_class[var22];
                  float var24 = var23.id_class.id_class() / 16.0F;
                  float var25 = var23.id_class.id_break() / 16.0F;
                  float var26 = var23.id_class.id_byte() / 16.0F;
                  float var27 = var9.id_break(var24, var25, var26, 1.0F);
                  float var28 = var9.id_byte(var24, var25, var26, 1.0F);
                  float var29 = var9.id_protected(var24, var25, var26, 1.0F);
                  var2.id_class(var27, var28, var29, var5, var6, var7, var8, var23.id_break, var23.id_byte, var4, var3, var19, var20, var21);
               }
            }
         }
      }
   }

   public void id_class(Ml_1 var1) {
      var1.id_class((double)(this.id_byte / 16.0F), (double)(this.id_protected / 16.0F), (double)(this.id_throws / 16.0F));
      if (this.id_private != 0.0F) {
         var1.id_class(rje_3.id_case.id_break(this.id_private));
      }

      if (this.id_catch != 0.0F) {
         var1.id_class(rje_3.id_protected.id_break(this.id_catch));
      }

      if (this.id_case != 0.0F) {
         var1.id_class(rje_3.id_break.id_break(this.id_case));
      }
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5) {
      this.id_class(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, var5);
   }

   public void id_class(rrXx_1 var1) {
      this.id_synchronized = var1;
   }

   public Iq_1 id_class() {
      Iq_1 var1 = new Iq_1();
      var1.id_class(this);
      return var1;
   }

   public Iq_1 id_class(int var1) {
      if (this.id_native == null) {
         return null;
      } else {
         return var1 >= 0 && var1 < this.id_native.size() ? (Iq_1)this.id_native.get(var1) : null;
      }
   }

   public void id_class(int[][] var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.id_extends.add(new IT(var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, this.id_implements, this.id_class, this.id_break));
   }

   public void id_class(String var1) {
      this.id_else = var1;
   }

   public Iq_1 id_class(float var1, float var2, float var3, float var4, float var5, float var6, boolean var7) {
      this.id_class(this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, var7, false);
      return this;
   }

   public void id_class(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.id_class(this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, var7, var7, var7, this.id_implements, false);
   }

   public void id_class(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.id_class(this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, var7, var8, var9, this.id_implements, false);
   }

   public void id_class(float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      this.id_class(this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, var7, var7, var7, var8, false);
   }

   public Iq_1 id_class(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class(this.id_continue, this.id_super, var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 0.0F, this.id_implements, false);
      return this;
   }

   public Iq_1 id_class(String var1, float var2, float var3, float var4, int var5, int var6, int var7, float var8, int var9, int var10) {
      this.id_class(var9, var10);
      this.id_class(this.id_continue, this.id_super, var2, var3, var4, (float)var5, (float)var6, (float)var7, var8, var8, var8, this.id_implements, false);
      return this;
   }

   public Iq_1 id_class(int var1, int var2) {
      this.id_continue = var1;
      this.id_super = var2;
      return this;
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.id_finally && (!this.id_extends.isEmpty() || !this.id_native.isEmpty() || !this.id_volatile.isEmpty())) {
         HU var9 = null;
         Hd_1 var10 = null;
         if (this.id_this != null) {
            if (this.id_return.id_case) {
               return;
            }

            var10 = var2.id_protected();
            if (var10 != null) {
               Ok_1 var11 = var2.id_throws();
               var9 = var10.id_byte();
               var2 = var10.id_class(this.id_this, var2);
               if (var11 != null) {
                  var2 = OQ.id_class(var11, var2);
               }
            }
         }

         if (this.id_synchronized != null) {
            this.id_synchronized.id_class();
         }

         var1.id_class();
         this.id_class(var1);
         this.id_class(var1.id_byte(), var2, var3, var4, var5, var6, var7, var8);
         int var15 = this.id_native.size();

         for (int var12 = 0; var12 < var15; var12++) {
            Iq_1 var13 = (Iq_1)this.id_native.get(var12);
            var13.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         int var16 = this.id_volatile.size();

         for (int var17 = 0; var17 < var16; var17++) {
            rrJq_1 var14 = (rrJq_1)this.id_volatile.get(var17);
            var14.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         var1.id_break();
         if (var9 != null) {
            var10.getBuffer(var9);
         }
      }
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.id_class(var1, var2, var3, var4, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void id_class(float var1, float var2, float var3) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
   }

   private void id_class(
      int var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13
   ) {
      this.id_extends.add(new IT(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, this.id_class, this.id_break));
   }

   public Iq_1 id_break(String var1) {
      if (var1 == null) {
         return null;
      } else {
         if (this.id_native != null) {
            for (int var2 = 0; var2 < this.id_native.size(); var2++) {
               Iq_1 var3 = (Iq_1)this.id_native.get(var2);
               if (var1.equals(var3.id_byte())) {
                  return var3;
               }
            }
         }

         return null;
      }
   }

   public void id_break(Iq_1 var1) {
      this.id_native.add(var1);
   }

   public Iq_1 id_break(int var1, int var2) {
      this.id_class = (float)var1;
      this.id_break = (float)var2;
      return this;
   }

   public rqO_2 id_break() {
      return this.id_this;
   }
}
