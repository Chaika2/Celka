package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Deque;
import java.util.List;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class cI_2 extends ch_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final QY id_throws;
   private final List<String> id_case = Lists.newArrayList();
   private final List<cx_3<rgP_2>> id_catch = Lists.newArrayList();
   private final List<cx_3<rpl_3>> id_private = Lists.newArrayList();
   private final Deque<rgP_2> id_implements = Queues.newArrayDeque();
   private int id_finally;
   private boolean id_extends;
   private long id_native = 0L;
   private int id_volatile = 0;
   private String id_final;
   private int id_package;
   private int id_int;

   private void id_byte(rgP_2 var1) {
      String var2 = var1.getString();
      if (var2.equals(this.id_final)) {
         if (((Qw_1)this.id_throws.id_class[20]).id_synchronized) {
            this.id_package++;
            this.id_final = var2;
            this.id_break(this.id_int);
            rVe_1 var3 = rrfu_3.id_class().id_class().id_class(" (x" + this.id_package + ")").id_break();
            ((rVi_1)var1).id_class(var3);
         }
      } else {
         this.id_package = 1;
         this.id_final = var2;
      }

      this.id_int++;
      if (this.id_int > 256) {
         this.id_int = 0;
      }

      this.id_class(var1, this.id_int);
   }

   public static int id_byte(double var0) {
      return rfU_2.id_byte(var0 * 160.0 + 20.0);
   }

   private static double id_byte(int var0) {
      double var1 = (double)var0 / 200.0;
      var1 = 1.0 - var1;
      var1 *= 10.0;
      var1 = rfU_2.id_class(var1, 0.0, 1.0);
      return var1 * var1;
   }

   public cI_2(QY var1) {
      this.id_throws = var1;
   }

   public void id_class() {
      this.id_private.clear();
      this.id_throws();

      for (int var1 = this.id_catch.size() - 1; var1 >= 0; var1--) {
         cx_3 var2 = this.id_catch.get(var1);
         this.id_class((rgP_2)var2.id_class(), var2.id_byte(), var2.id_break(), true);
      }
   }

   public void id_class(String var1) {
      if (this.id_case.isEmpty() || !this.id_case.get(this.id_case.size() - 1).equals(var1)) {
         this.id_case.add(var1);
      }
   }

   public void id_class(double var1) {
      this.id_finally = (int)((double)this.id_finally + var1);
      int var3 = this.id_private.size();
      if (this.id_finally > var3 - this.id_implements()) {
         this.id_finally = var3 - this.id_implements();
      }

      if (this.id_finally <= 0) {
         this.id_finally = 0;
         this.id_extends = false;
      }
   }

   public boolean id_class(double var1, double var3) {
      if (this.id_extends() && !((Qw_1)this.id_throws.id_class[20]).g && !this.id_finally() && !this.id_implements.isEmpty()) {
         double var5 = var1 - 2.0;
         double var7 = (double)this.id_throws.id_else().id_this() - var3 - 40.0;
         if (var5 <= (double)rfU_2.id_byte((double)this.id_case() / this.id_private()) && var7 < 0.0 && var7 > (double)rfU_2.id_byte(-9.0 * this.id_private())) {
            this.id_class(this.id_implements.remove());
            this.id_native = System.currentTimeMillis();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void id_class(Ml_1 var1, int var2) {
      if (!this.id_private.isEmpty()) {
         int var3 = this.id_case();
         if (this.id_volatile != var3) {
            this.id_volatile = var3;
            this.id_class();
         }

         if (!this.id_finally()) {
            this.id_volatile();
            int var4 = this.id_implements();
            int var5 = this.id_private.size();
            if (var5 > 0) {
               boolean var6 = this.id_extends();
               double var7 = this.id_private();
               int var9 = rfU_2.id_throws((double)this.id_case() / var7);
               RenderSystem.pushMatrix();
               RenderSystem.translatef(2.0F, 8.0F, 0.0F);
               RenderSystem.scaled(var7, var7, 1.0);
               double var10 = ((Qw_1)this.id_throws.id_class[20]).id_extends * 0.9F + 0.1F;
               double var12 = ((Qw_1)this.id_throws.id_class[20]).id_volatile;
               double var14 = 9.0 * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0);
               double var16 = -8.0 * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0) + 4.0 * ((Qw_1)this.id_throws.id_class[20]).id_native;
               int var18 = 0;

               for (int var19 = 0; var19 + this.id_finally < this.id_private.size() && var19 < var4; var19++) {
                  cx_3 var20 = this.id_private.get(var19 + this.id_finally);
                  if (var20 != null) {
                     int var21 = var2 - var20.id_break();
                     if (var21 < 200 || var6) {
                        double var22 = var6 ? 1.0 : id_byte(var21);
                        int var24 = (int)(255.0 * var22 * var10);
                        int var25 = (int)(255.0 * var22 * var12);
                        var18++;
                        if (var24 > 3) {
                           boolean var26 = false;
                           double var27 = (double)(-var19) * var14;
                           var1.id_class();
                           var1.id_class(0.0, 0.0, 50.0);
                           if (((Qw_1)this.id_throws.id_class[20]).Pb == 5) {
                              var9 = ((cm_3)this.id_throws.id_class[15]).id_class((rpl_3)var20.id_class()) - 2;
                           }

                           if (((Qw_1)this.id_throws.id_class[20]).Pb != 3) {
                              id_class(var1, -2, (int)(var27 - var14), var9 + 4, (int)var27, var25 << 24);
                           }

                           RenderSystem.enableBlend();
                           var1.id_class(0.0, 0.0, 50.0);
                           if (!((Qw_1)this.id_throws.id_class[20]).PM) {
                              ((cm_3)this.id_throws.id_class[15])
                                 .id_break(var1, (rpl_3)var20.id_class(), 0.0F, (float)((int)(var27 + var16)), 16777215 + (var24 << 24));
                           } else {
                              ((cm_3)this.id_throws.id_class[15])
                                 .id_class(var1, (rpl_3)var20.id_class(), 0.0F, (float)((int)(var27 + var16)), 16777215 + (var24 << 24));
                           }

                           RenderSystem.disableAlphaTest();
                           RenderSystem.disableBlend();
                           var1.id_break();
                        }
                     }
                  }
               }

               if (!this.id_implements.isEmpty()) {
                  int var29 = (int)(128.0 * var10);
                  int var31 = (int)(255.0 * var12);
                  var1.id_class();
                  var1.id_class(0.0, 0.0, 50.0);
                  id_class(var1, -2, 0, var9 + 4, 9, var31 << 24);
                  RenderSystem.enableBlend();
                  var1.id_class(0.0, 0.0, 50.0);
                  ((cm_3)this.id_throws.id_class[15]).id_break(var1, new rgn_3("chat.queue", this.id_implements.size()), 0.0F, 1.0F, 16777215 + (var29 << 24));
                  var1.id_break();
                  RenderSystem.disableAlphaTest();
                  RenderSystem.disableBlend();
               }

               if (var6) {
                  byte var30 = 9;
                  RenderSystem.translatef(-3.0F, 0.0F, 0.0F);
                  int var32 = var5 * var30 + var5;
                  int var33 = var18 * var30 + var18;
                  int var34 = this.id_finally * var33 / var5;
                  int var23 = var33 * var33 / var32;
                  if (var32 != var33) {
                     int var35 = var34 > 0 ? 170 : 96;
                     int var36 = this.id_extends ? 13382451 : 3355562;
                     id_class(var1, 0, -var34, 2, -var34 - var23, var36 + (var35 << 24));
                     id_class(var1, 2, -var34, 1, -var34 - var23, 13421772 + (var35 << 24));
                  }
               }

               RenderSystem.popMatrix();
            }
         }
      }
   }

   public void id_class(rgP_2 var1) {
      this.id_class(var1, null);
   }

   public void id_class(boolean var1) {
      this.id_implements.clear();
      this.id_private.clear();
      this.id_catch.clear();
      this.id_final = null;
      this.id_package = 0;
      OA var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally();
      if (var1 && var2 != null && !var2.id_class(rrFR.id_class()).id_byte()) {
         this.id_case.clear();
      }
   }

   public void id_class(rgP_2 var1, UUID var2) {
      rrLh_1 var3 = rrLh_1.id_class(var1, var2);
      if (!var3.id_byte()) {
         this.id_byte(var3.id_throws());
         rrLO.id_class(var1, var3.id_protected(), var3.id_break());
      }
   }

   public void id_class(rgP_2 var1, int var2) {
      this.id_class(var1, var2, ((cq_3)this.id_throws.id_class[19]).id_case(), false);
      id_class.info("[CHAT] {}", var1.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void id_class(rgP_2 var1, int var2, int var3, boolean var4) {
      if (var2 != 0) {
         this.id_break(var2);
      }

      int var5 = rfU_2.id_byte((double)this.id_case() / this.id_private());
      List var6 = cf_3.id_class(var1, var5, (cm_3)this.id_throws.id_class[15]);
      boolean var7 = this.id_extends();

      for (rpl_3 var9 : var6) {
         if (var7 && this.id_finally > 0) {
            this.id_extends = true;
            this.id_class(1.0);
         }

         this.id_private.add(0, new cx_3<>(var3, var9, var2));
      }

      while (this.id_private.size() > 100) {
         this.id_private.remove(this.id_private.size() - 1);
      }

      if (!var4) {
         this.id_catch.add(0, new cx_3<>(var3, var1, var2));

         while (this.id_catch.size() > 100) {
            this.id_catch.remove(this.id_catch.size() - 1);
         }
      }
   }

   public void id_break(int var1) {
      this.id_private.removeIf(var1x -> var1x.id_byte() == var1);
      this.id_catch.removeIf(var1x -> var1x.id_byte() == var1);
   }

   public void id_break(rgP_2 var1, UUID var2) {
      if (((Qw_1)this.id_throws.id_class[20]).id_try <= 0.0) {
         this.id_class(var1, var2);
      } else {
         long var3 = System.currentTimeMillis();
         if (var3 - this.id_native >= this.id_native()) {
            this.id_class(var1, var2);
            this.id_native = var3;
         } else {
            this.id_implements.add(var1);
         }
      }
   }

   public static int id_break(double var0) {
      return rfU_2.id_byte(var0 * 280.0 + 40.0);
   }

   public rgc_3 id_break(double var1, double var3) {
      if (this.id_extends() && !((Qw_1)this.id_throws.id_class[20]).g && !this.id_finally()) {
         double var5 = var1 - 2.0;
         double var7 = (double)this.id_throws.id_else().id_this()
            - var3
            - 40.0
            - (double)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().w().id_new();
         var5 = (double)rfU_2.id_byte(var5 / this.id_private());
         var7 = (double)rfU_2.id_byte(var7 / (this.id_private() * (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0)));
         if (!(var5 < 0.0) && !(var7 < 0.0)) {
            int var9 = Math.min(this.id_implements(), this.id_private.size());
            if (var5 <= (double)rfU_2.id_byte((double)this.id_case() / this.id_private()) && var7 < (double)(9 * var9 + var9)) {
               int var10 = (int)(var7 / 9.0 + (double)this.id_finally);
               if (var10 >= 0 && var10 < this.id_private.size()) {
                  cx_3 var11 = this.id_private.get(var10);
                  return ((cm_3)this.id_throws.id_class[15]).id_break().id_class((rpl_3)var11.id_class(), (int)var5);
               }
            }
         }
      }

      return null;
   }

   public void id_break(rgP_2 var1) {
      this.id_byte(var1);
   }

   public void id_throws() {
      this.id_finally = 0;
      this.id_extends = false;
   }

   private boolean id_finally() {
      return ((Qw_1)this.id_throws.id_class[20]).id_finally == rhJ_2.HIDDEN;
   }

   public int id_catch() {
      return id_byte(
         (this.id_extends() ? ((Qw_1)this.id_throws.id_class[20]).id_while : ((Qw_1)this.id_throws.id_class[20]).id_goto)
            / (((Qw_1)this.id_throws.id_class[20]).id_native + 1.0)
      );
   }

   private boolean id_extends() {
      return (vm_3)this.id_throws.id_class[73] instanceof FP;
   }

   public int id_case() {
      int var1 = id_break(((Qw_1)this.id_throws.id_class[20]).id_public);
      Qg_1 var2 = QY.id_instanceof().id_else();
      int var3 = (int)((double)(var2.id_extends() - 3) / var2.id_return());
      return rfU_2.id_class(var1, 0, var3);
   }

   public int id_implements() {
      return this.id_catch() / 9;
   }

   public List<String> id_protected() {
      return this.id_case;
   }

   public double id_private() {
      return ((Qw_1)this.id_throws.id_class[20]).id_return;
   }

   private void id_volatile() {
      if (!this.id_implements.isEmpty()) {
         long var1 = System.currentTimeMillis();
         if (var1 - this.id_native >= this.id_native()) {
            this.id_class(this.id_implements.remove());
            this.id_native = var1;
         }
      }
   }

   private long id_native() {
      return (long)(((Qw_1)this.id_throws.id_class[20]).id_try * 1000.0);
   }
}
