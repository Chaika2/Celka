package celestial;

import java.util.Iterator;
import java.util.List;

public class rHa_1 extends ryO_2 implements rHf_1 {
   private xc_3 id_class;
   private rpr_3 id_break;
   private boolean id_byte;
   private boolean id_protected;
   private static final ThreadLocal<rpr_3> id_throws = ThreadLocal.withInitial(() -> null);
   private float id_case;
   private float id_catch;
   private long id_private;
   private int id_implements;

   public float id_byte(float var1) {
      return (float)this.id_break.id_finally() * this.id_throws(this.id_class(var1));
   }

   public rHa_1() {
      super(ryW_2.id_finally);
   }

   public rHa_1(xc_3 var1, rpr_3 var2, boolean var3, boolean var4) {
      this();
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   private void id_class(an_3 var1, rpr_3 var2, double var3) {
      rfl_3 var5 = var1.rN();
      rfl_3 var6 = rjw_3.id_break().id_class().id_class(this.id_native);
      if (var5.id_byte(var6)) {
         rpr_3 var7 = var2.id_case();
         double var8 = id_class(var6, var7, var5) + 0.01;
         double var10 = id_class(var6, var7, var5.id_class(var6)) + 0.01;
         if (Math.abs(var8 - var10) < 0.01) {
            var8 = Math.min(var8, var3) + 0.01;
            id_class(var2, var1, var8, var7);
         }
      }
   }

   private rfl_3 id_class(rfl_3 var1) {
      double var2 = (double)this.id_throws(this.id_case);
      return var1.id_protected(
         (double)this.id_native.b_() + var2 * (double)this.id_break.id_implements(),
         (double)this.id_native.c_() + var2 * (double)this.id_break.id_finally(),
         (double)this.id_native.d_() + var2 * (double)this.id_break.id_extends()
      );
   }

   public rjC_2 id_class(rRq_1 var1, rfH_2 var2) {
      rjC_2 var3;
      if (!this.id_byte && this.id_protected) {
         var3 = this.id_class.id_class(kD_2.id_final, Boolean.valueOf(true)).id_extends(var1, var2);
      } else {
         var3 = rjw_3.id_class();
      }

      rpr_3 var4 = id_throws.get();
      if ((double)this.id_case < 1.0 && var4 == this.id_extends()) {
         return var3;
      } else {
         xc_3 var5;
         if (this.id_finally()) {
            var5 = xu_3.rS
               .id_continue()
               .id_class(ka_3.id_volatile, this.id_break)
               .id_class(ka_3.id_package, Boolean.valueOf(this.id_byte != 1.0F - this.id_case < 0.25F));
         } else {
            var5 = this.id_class;
         }

         float var6 = this.id_throws(this.id_case);
         double var7 = (double)((float)this.id_break.id_implements() * var6);
         double var9 = (double)((float)this.id_break.id_finally() * var6);
         double var11 = (double)((float)this.id_break.id_extends() * var6);
         return rjw_3.id_class(var3, var5.id_extends(var1, var2).id_class(var7, var9, var11));
      }
   }

   private static void id_class(rpr_3 var0, an_3 var1, double var2, rpr_3 var4) {
      id_throws.set(var0);
      var1.id_class(iG_2.PISTON, new rjU_2(var2 * (double)var4.id_implements(), var2 * (double)var4.id_finally(), var2 * (double)var4.id_extends()));
      id_throws.set((rpr_3)null);
   }

   private static boolean id_class(rfl_3 var0, an_3 var1) {
      return var1.r_() == Qs_1.NORMAL
         && var1.BL()
         && var1.rx() >= var0.id_class
         && var1.rx() <= var0.id_protected
         && var1.BO() >= var0.id_byte
         && var1.BO() <= var0.id_case;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static double id_class(rfl_3 var0, rpr_3 var1, rfl_3 var2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rpr_3; with value 5
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: getstatic celestial/rHi_1.id_break [I
      // 03: aload 1
      // 04: invokevirtual celestial/rpr_3.ordinal ()I
      // 07: iaload
      // 08: tableswitch 60 1 6 40 50 60 70 80 90
      // 30: aload 0
      // 31: getfield celestial/rfl_3.id_protected D
      // 34: aload 2
      // 35: getfield celestial/rfl_3.id_class D
      // 38: dsub
      // 39: dreturn
      // 3a: aload 2
      // 3b: getfield celestial/rfl_3.id_protected D
      // 3e: aload 0
      // 3f: getfield celestial/rfl_3.id_class D
      // 42: dsub
      // 43: dreturn
      // 44: aload 0
      // 45: getfield celestial/rfl_3.id_throws D
      // 48: aload 2
      // 49: getfield celestial/rfl_3.id_break D
      // 4c: dsub
      // 4d: dreturn
      // 4e: aload 2
      // 4f: getfield celestial/rfl_3.id_throws D
      // 52: aload 0
      // 53: getfield celestial/rfl_3.id_break D
      // 56: dsub
      // 57: dreturn
      // 58: aload 0
      // 59: getfield celestial/rfl_3.id_case D
      // 5c: aload 2
      // 5d: getfield celestial/rfl_3.id_byte D
      // 60: dsub
      // 61: dreturn
      // 62: aload 2
      // 63: getfield celestial/rfl_3.id_case D
      // 66: aload 0
      // 67: getfield celestial/rfl_3.id_byte D
      // 6a: dsub
      // 6b: dreturn
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = rco_3.id_byte(var2.id_int("blockState"));
      this.id_break = rpr_3.id_class(var2.id_private("facing"));
      this.id_case = var2.id_finally("progress");
      this.id_catch = this.id_case;
      this.id_byte = var2.id_new("extending");
      this.id_protected = var2.id_new("source");
   }

   public float id_class(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return rfU_2.id_catch(var1, this.id_catch, this.id_case);
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("blockState", rco_3.id_class(this.id_class));
      var1.id_break("facing", this.id_break.id_byte());
      var1.id_class("progress", this.id_catch);
      var1.id_class("extending", this.id_byte);
      var1.id_class("source", this.id_protected);
      return var1;
   }

   public float id_break(float var1) {
      return (float)this.id_break.id_implements() * this.id_throws(this.id_class(var1));
   }

   private float id_throws(float var1) {
      return this.id_byte ? var1 - 1.0F : 1.0F - var1;
   }

   @Override
   public void id_throws() {
      this.id_private = this.id_extends.r();
      this.id_catch = this.id_case;
      if (this.id_catch >= 1.0F) {
         if (this.id_extends.id_continue && this.id_implements < 5) {
            this.id_implements++;
         } else {
            this.id_extends.id_else(this.id_native);
            this.aa_();
            if (this.id_class != null && this.id_extends.id_byte(this.id_native).id_class(xu_3.rc)) {
               xc_3 var1 = xd_3.id_break(this.id_class, this.id_extends, this.id_native);
               if (var1.id_catch()) {
                  this.id_extends.id_class(this.id_native, this.id_class, 84);
                  xd_3.id_class(this.id_class, var1, this.id_extends, this.id_native, 3);
               } else {
                  if (var1.id_break(rCT.id_throw) && var1.id_byte(rCT.id_throw)) {
                     var1 = var1.id_class(rCT.id_throw, Boolean.valueOf(false));
                  }

                  this.id_extends.id_class(this.id_native, var1, 67);
                  this.id_extends.id_class(this.id_native, var1.id_break(), this.id_native);
               }
            }
         }
      } else {
         float var2 = this.id_case + 0.5F;
         this.id_case(var2);
         this.id_catch(var2);
         this.id_case = var2;
         if (this.id_case >= 1.0F) {
            this.id_case = 1.0F;
         }
      }
   }

   public boolean id_finally() {
      return this.id_protected;
   }

   public boolean id_catch() {
      return this.id_byte;
   }

   private void id_catch(float var1) {
      if (this.id_new()) {
         rpr_3 var2 = this.id_extends();
         if (var2.id_final().id_protected()) {
            double var3 = this.id_class.id_extends(this.id_extends, this.id_native).id_byte(rpB_2.Y);
            rfl_3 var5 = this.id_class(new rfl_3(0.0, var3, 0.0, 1.0, 1.5000000999999998, 1.0));
            double var6 = (double)(var1 - this.id_case);

            for (an_3 var9 : this.id_extends.id_break((an_3)null, var5, var1x -> id_class(var5, var1x))) {
               id_class(var2, var9, var6, var2);
            }
         }
      }
   }

   public rpr_3 id_extends() {
      return this.id_byte ? this.id_break : this.id_break.id_case();
   }

   private void id_case(float var1) {
      rpr_3 var2 = this.id_extends();
      double var3 = (double)(var1 - this.id_case);
      rjC_2 var5 = this.id_package().id_extends(this.id_extends, this.id_char());
      if (!var5.id_break()) {
         rfl_3 var6 = this.id_class(var5.id_class());
         List var7 = this.id_extends.id_class((an_3)null, ryc_3.id_class(var6, var2, var3).id_break(var6));
         if (!var7.isEmpty()) {
            List var8 = var5.id_protected();
            boolean var9 = this.id_class.id_class(xu_3.EN);
            Iterator var10 = var7.iterator();

            while (true) {
               an_3 var11;
               while (true) {
                  if (!var10.hasNext()) {
                     return;
                  }

                  var11 = (an_3)var10.next();
                  if (var11.r_() != Qs_1.IGNORE) {
                     if (!var9) {
                        break;
                     }

                     if (!(var11 instanceof rhN_2)) {
                        rjU_2 var12 = var11.rv();
                        double var13 = var12.id_break;
                        double var15 = var12.id_byte;
                        double var17 = var12.id_protected;
                        switch (var2.id_final()) {
                           case X:
                              var13 = (double)var2.id_implements();
                              break;
                           case Y:
                              var15 = (double)var2.id_finally();
                              break;
                           case Z:
                              var17 = (double)var2.id_extends();
                        }

                        var11.id_catch(var13, var15, var17);
                        break;
                     }
                  }
               }

               double var19 = 0.0;

               for (rfl_3 var21 : var8) {
                  rfl_3 var16 = ryc_3.id_class(this.id_class(var21), var2, var3);
                  rfl_3 var22 = var11.rN();
                  if (var16.id_byte(var22)) {
                     var19 = Math.max(var19, id_class(var16, var2, var22));
                     if (var19 >= var3) {
                        break;
                     }
                  }
               }

               if (!(var19 <= 0.0)) {
                  var19 = Math.min(var19, var3) + 0.01;
                  id_class(var2, var11, var19, var2);
                  if (!this.id_byte && this.id_protected) {
                     this.id_class(var11, var2, var3);
                  }
               }
            }
         }
      }
   }

   @Override
   public double id_implements() {
      return 68.0;
   }

   private boolean id_new() {
      return this.id_class.id_class(xu_3.Jh);
   }

   private xc_3 id_package() {
      return !this.id_catch() && this.id_finally() && this.id_class.id_break() instanceof kD_2
         ? xu_3.rS
            .id_continue()
            .id_class(ka_3.id_package, Boolean.valueOf(this.id_case > 0.25F))
            .id_class(ka_3.id_final, this.id_class.id_class(xu_3.D) ? rCg_1.STICKY : rCg_1.DEFAULT)
            .id_class(ka_3.id_volatile, this.id_class.id_byte(kD_2.id_volatile))
         : this.id_class;
   }

   public float id_protected(float var1) {
      return (float)this.id_break.id_extends() * this.id_throws(this.id_class(var1));
   }

   public rpr_3 id_private() {
      return this.id_break;
   }

   public long id_final() {
      return this.id_private;
   }

   public void id_volatile() {
      if (this.id_extends != null && (this.id_catch < 1.0F || this.id_extends.id_continue)) {
         this.id_case = 1.0F;
         this.id_catch = this.id_case;
         this.id_extends.id_else(this.id_native);
         this.aa_();
         if (this.id_extends.id_byte(this.id_native).id_class(xu_3.rc)) {
            xc_3 var1;
            if (this.id_protected) {
               var1 = xu_3.id_class.id_continue();
            } else {
               var1 = xd_3.id_break(this.id_class, this.id_extends, this.id_native);
            }

            this.id_extends.id_class(this.id_native, var1, 3);
            this.id_extends.id_class(this.id_native, var1.id_break(), this.id_native);
         }
      }
   }

   public xc_3 id_native() {
      return this.id_class;
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
