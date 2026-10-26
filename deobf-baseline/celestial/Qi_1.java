package celestial;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.glfw.GLFWDropCallback;

public class Qi_1 {
   private final QY id_class;
   private boolean id_break;
   private boolean id_byte;
   private boolean id_protected;
   private double id_throws;
   private double id_case;
   private int id_catch;
   private int id_private = -1;
   private boolean id_implements = true;
   private int id_finally;
   private double id_extends;
   private double id_native;
   private double id_volatile;
   private double id_final;
   private boolean id_package;

   public double id_byte() {
      return this.id_throws;
   }

   public void id_byte(boolean var1) {
      this.id_package = var1;
   }

   public Qi_1(QY var1) {
      this.id_class = var1;
   }

   private void id_class(long var1, double var3) {
      if (var1 == QY.id_instanceof().id_else().id_implements()) {
         double var5 = (((Qw_1)this.id_class.id_class[20]).id_double ? Math.signum(var3) : var3) * ((Qw_1)this.id_class.id_class[20]).id_long;
         if ((cT_2)this.id_class.id_class[75] == null) {
            if ((vm_3)this.id_class.id_class[73] != null) {
               double var7 = this.id_throws * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
               double var9 = this.id_case * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
               ((vm_3)this.id_class.id_class[73]).id_class(var7, var9, var5);
            } else if ((cb_3)this.id_class.id_class[57] != null) {
               if (this.id_final != 0.0 && Math.signum(var5) != Math.signum(this.id_final)) {
                  this.id_final = 0.0;
               }

               this.id_final += var5;
               float var11 = (float)((int)this.id_final);
               if (var11 == 0.0F) {
                  return;
               }

               this.id_final -= (double)var11;
               if (((cb_3)this.id_class.id_class[57]).id_native()) {
                  if (((cq_3)this.id_class.id_class[19]).id_private().id_class()) {
                     ((cq_3)this.id_class.id_class[19]).id_private().id_class((double)(-var11));
                  } else {
                     float var8 = rfU_2.id_class(((rhx_3)((cb_3)this.id_class.id_class[57]).id_implements[18]).id_class() + var11 * 0.005F, 0.0F, 0.2F);
                     ((rhx_3)((cb_3)this.id_class.id_class[57]).id_implements[18]).id_class(var8);
                  }
               } else {
                  ((rhz_3)((cb_3)this.id_class.id_class[57]).id_implements[1]).id_class((double)var11);
               }
            }
         }
      }
   }

   private void id_class(long var1, int var3, int var4, int var5) {
      if (var1 == this.id_class.id_else().id_implements()) {
         boolean var6 = var4 == 1;
         if ((Boolean)QY.id_break[2] && var3 == 0) {
            if (var6) {
               if ((var5 & 2) == 2) {
                  var3 = 1;
                  this.id_catch++;
               }
            } else if (this.id_catch > 0) {
               var3 = 1;
               this.id_catch--;
            }
         }

         int var7 = var3;
         Va_1 var8 = Vi_1.MOUSE.id_class(var7);
         rrLs_1 var9 = rrLs_1.id_class(var8, var7, var4);
         if (var9.id_byte()) {
            return;
         }

         if (var6) {
            if (((Qw_1)this.id_class.id_class[20]).S && this.id_finally++ > 0) {
               return;
            }

            this.id_private = var7;
            this.id_extends = gb_3.id_break();
         } else if (this.id_private != -1) {
            if (((Qw_1)this.id_class.id_class[20]).S && --this.id_finally > 0) {
               return;
            }

            this.id_private = -1;
         }

         boolean[] var10 = new boolean[]{false};
         if ((cT_2)this.id_class.id_class[75] == null) {
            if ((vm_3)this.id_class.id_class[73] == null) {
               if (!this.id_package && var6) {
                  this.id_catch();
               }
            } else {
               double var11 = this.id_throws * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
               double var13 = this.id_case * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
               if (var6) {
                  vm_3.id_class(
                     () -> var10[0] = ((vm_3)this.id_class.id_class[73]).id_break(var11, var13, var7),
                     "mouseClicked event handler",
                     ((vm_3)this.id_class.id_class[73]).getClass().getCanonicalName()
                  );
               } else {
                  vm_3.id_class(
                     () -> var10[0] = ((vm_3)this.id_class.id_class[73]).id_class(var11, var13, var7),
                     "mouseReleased event handler",
                     ((vm_3)this.id_class.id_class[73]).getClass().getCanonicalName()
                  );
               }
            }
         }

         if (!var10[0]
            && ((vm_3)this.id_class.id_class[73] == null || ((vm_3)this.id_class.id_class[73]).id_continue)
            && (cT_2)this.id_class.id_class[75] == null) {
            if (var7 == 0) {
               this.id_break = var6;
            } else if (var7 == 2) {
               this.id_byte = var6;
            } else if (var7 == 1) {
               this.id_protected = var6;
            }

            Vu_1.id_class(var8, var6);
            if (var6) {
               rrLB.id_break((rrLS)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[0], var7, Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 292));
               if (((cb_3)this.id_class.id_class[57]).id_native() && var7 == 2) {
                  ((cq_3)this.id_class.id_class[19]).id_private().id_protected();
               } else {
                  Vu_1.id_class(var8);
               }
            }
         }
      }
   }

   public boolean id_class() {
      return this.id_break;
   }

   public void id_class(boolean var1) {
      if (this.id_case() && this.id_class.id_static()) {
         double var11 = ((Qw_1)this.id_class.id_class[20]).id_class * 0.6F + 0.2F;
         double var4 = var11 * var11 * var11 * 8.0;
         double var6 = this.id_native * var4;
         double var8 = this.id_volatile * var4;
         this.id_native = 0.0;
         this.id_volatile = 0.0;
         byte var10 = 1;
         if (((Qw_1)this.id_class.id_class[20]).id_for) {
            var10 = -1;
         }

         if ((cb_3)this.id_class.id_class[57] != null) {
            ((cb_3)this.id_class.id_class[57]).id_class(var6, var8 * (double)var10);
         }
      } else {
         if ((cb_3)this.id_class.id_class[57] != null) {
            aF_2 var2 = ((cb_3)this.id_class.id_class[57]).s();
            if (var2 != null) {
               var2.id_class((Float)((cb_3)this.id_class.id_class[57]).id_throws[15], (Float)((cb_3)this.id_class.id_class[57]).id_throws[16]);
            }
         }

         this.id_native = 0.0;
         this.id_volatile = 0.0;
      }

      if (!var1 && (cb_3)this.id_class.id_class[57] != null) {
         ((cb_3)this.id_class.id_class[57]).id_class(rrAX.id_class().id_break());
      }
   }

   private void id_class(long var1, double var3, double var5) {
      if (var1 == QY.id_instanceof().id_else().id_implements()) {
         if (this.id_implements) {
            this.id_throws = var3;
            this.id_case = var5;
            this.id_implements = false;
         }

         vm_3 var7 = (vm_3)this.id_class.id_class[73];
         if (var7 != null && (cT_2)this.id_class.id_class[75] == null) {
            double var8 = var3 * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
            double var10 = var5 * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
            vm_3.id_class(() -> var7.id_class(var8, var10), "mouseMoved event handler", var7.getClass().getCanonicalName());
            if (this.id_private != -1 && this.id_extends > 0.0) {
               double var12 = (var3 - this.id_throws) * (double)this.id_class.id_else().id_super() / (double)this.id_class.id_else().id_new();
               double var14 = (var5 - this.id_case) * (double)this.id_class.id_else().id_this() / (double)this.id_class.id_else().id_continue();
               vm_3.id_class(() -> var7.id_class(var8, var10, this.id_private, var12, var14), "mouseDragged event handler", var7.getClass().getCanonicalName());
            }
         }

         if (this.id_case() && this.id_class.id_static()) {
            this.id_native = this.id_native + (var3 - this.id_throws);
            this.id_volatile = this.id_volatile + (var5 - this.id_case);
         }

         this.id_class(true);
         this.id_throws = var3;
         this.id_case = var5;
      }
   }

   public void id_class(long var1) {
      Ve_1.id_class(
         var1,
         (var1x, var3, var5) -> this.id_class.execute(() -> this.id_class(var1x, var3, var5)),
         (var1x, var3, var4, var5) -> this.id_class.execute(() -> this.id_class(var1x, var3, var4, var5)),
         (var1x, var3, var5) -> this.id_class.execute(() -> this.id_class(var1x, var5)),
         (var1x, var3, var4) -> {
            Path[] var6 = new Path[var3];

            for (int var7 = 0; var7 < var3; var7++) {
               var6[var7] = Paths.get(GLFWDropCallback.getName(var4, var7));
            }

            this.id_class.execute(() -> this.id_class(Arrays.asList(var6)));
         }
      );
   }

   private void id_class(List<Path> var1) {
      if ((vm_3)this.id_class.id_class[73] != null) {
         ((vm_3)this.id_class.id_class[73]).a_(var1);
      }
   }

   public void id_break(boolean var1) {
      if (this.id_class.id_static() && !this.id_package) {
         if (!(Boolean)QY.id_break[2]) {
            Vu_1.id_class();
         }

         this.id_package = true;
         this.id_throws = (double)(this.id_class.id_else().id_new() / 2);
         this.id_case = (double)(this.id_class.id_else().id_continue() / 2);
         Ve_1.id_class(this.id_class.id_else().id_implements(), 212995, this.id_throws, this.id_case);
         if (var1) {
            this.id_class.id_break(null);
         }

         QY var10000 = this.id_class;
         Integer var6 = 10000;
         var10000.id_class[66] = var6;
         this.id_implements = true;
      }
   }

   public boolean id_break() {
      return this.id_protected;
   }

   public void id_throws() {
      this.id_implements = true;
   }

   public void id_catch() {
      this.id_break(true);
   }

   public boolean id_case() {
      return this.id_package;
   }

   public void id_implements() {
      this.id_implements = true;
   }

   public double id_protected() {
      return this.id_case;
   }

   public void id_private() {
      if (this.id_package) {
         this.id_package = false;
         this.id_throws = (double)(this.id_class.id_else().id_new() / 2);
         this.id_case = (double)(this.id_class.id_else().id_continue() / 2);
         Ve_1.id_class(this.id_class.id_else().id_implements(), 212993, this.id_throws, this.id_case);
      }
   }
}
