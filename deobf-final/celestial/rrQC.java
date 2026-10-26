package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQC extends vm_3 {
   private static short[] case_;
   private static double[] catch_;
   private static int[] private_;
   public Object[] class_;
   private static byte[] implements_;
   private static String[] finally_;
   private static float[] else_;
   public static Object[] throws_;
   private static boolean[] synchronized_;

   private void char_() {
      this.short_();
      rrQn_1 var1 = ((rrQA)this.class_[1]).finally_();
      if (var1 != null) {
         ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0]).class_(var1.private_());
      }
   }

   @Override
   public void byte_(boolean var1) {
      this.short_();
      ((LF)this.class_[6]).int_ = var1;
      ((LF)this.class_[5]).int_ = var1;
   }

   private static void int_() {
      private_ = new int[]{16777215};
   }

   private static void long_() {
      synchronized_ = new boolean[]{
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true
      };
   }

   private static void float_() {
      else_ = new float[]{
         2.0F,
         16.0F,
         16.0F,
         4.0F,
         4.0F,
         4.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         8.0F,
         8.0F,
         20.0F,
         20.0F,
         44.0F,
         20.0F,
         36.0F,
         52.0F,
         4.0F,
         20.0F,
         20.0F,
         52.0F,
         40.0F,
         8.0F,
         44.0F,
         36.0F,
         52.0F,
         52.0F,
         4.0F,
         36.0F,
         4.0F,
         52.0F
      };
   }

   public rrQC(vm_3 var1) {
      super(new rgn_3("account.switcher.title"));
      this.short_();
      Av_1 var6 = new Av_1();
      this.class_[3] = var6;
      this.class_[0] = var1;
      ArrayList var8 = new ArrayList();
      this.class_[2] = var8;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      finally_ = new String[]{
         new String("account.switcher.title"),
         new String(","),
         new String("[ \"]"),
         new String(""),
         new String("account.switcher.randomaccount"),
         new String("account.switcher.deleteallrandom"),
         new String("account.switcher.findaccount"),
         new String("..."),
         new String("account.switcher.add"),
         new String("account.switcher.delete"),
         new String("account.switcher.login"),
         new String("uuid_list.txt")
      };
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.short_();
      if (vm_3.case_(var1)) {
         boolean var4 = false;
         String[] var5 = ((Qj_1)this.volatile_.class_[23]).class_().split(",");
         if (var5 != null) {
            for (String var9 : var5) {
               var9 = var9.replaceAll("[ \"]", "");
               if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                  .class_(new rrQQ(var9, rrQV.class_(var9), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[0]), true, true)) {
                  this.native_();
                  var4 = true;
               }
            }
         }

         if (var4) {
            return true;
         }
      } else if (vm_3.catch_(var1)) {
         rrQn_1 var10 = ((rrQA)this.class_[1]).finally_();
         if (var10 != null) {
            ((Qj_1)this.volatile_.class_[23]).class_(var10.private_().class_());
            return true;
         }
      }

      return !super.class_(var1, var2, var3) && !((rrQA)this.class_[1]).class_(var1, var2, var3) ? synchronized_[8] : synchronized_[7];
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.short_();
      this.class_(var1);
      ((rrQA)this.class_[1]).class_(var1, var2, var3, var4);
      ((Lu_1)this.class_[4]).class_(var1, var2, var3, var4);

      for (rrQT var6 : (List)this.class_[2]) {
         var6.class_(var1, var2, var3, var4);
      }

      class_(var1, this.super_, this.extends_.case_().break_(" (" + import_.while_().byte_() + ")"), this.package_ / 2, 8, 16777215);
      ((rrQA)this.class_[1]).private_().ifPresent(var2x -> {
         boolean var3x = var2x.class_();
         rqO_2 var4x = var2x.break_();
         var1.class_();
         var1.class_(4.0F, 4.0F, 4.0F);
         var1.class_(1.0, (double)this.int_ / 8.0 - 16.0 - 4.0, 0.0);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         import_.A().class_(var4x);
         vm_3.class_(var1, 4, 0, 8.0F, 8.0F, 8, 8, 64, 64);
         vm_3.class_(var1, 4, 8, 20.0F, 20.0F, 8, 12, 64, 64);
         vm_3.class_(var1, var3x ? 1 : synchronized_[19], implements_[38], 44.0F, 20.0F, var3x ? 3 : implements_[40], implements_[41], 64, 64);
         vm_3.class_(var1, 12, 8, 36.0F, 52.0F, var3x ? 3 : implements_[47], implements_[48], 64, 64);
         vm_3.class_(var1, 4, 20, 4.0F, 20.0F, 4, 12, 64, 64);
         vm_3.class_(var1, 8, 20, 20.0F, 52.0F, 4, 12, 64, 64);
         if (((Qw_1)this.volatile_.class_[20]).break_(rhQ_2.HAT)) {
            vm_3.class_(var1, 4, 0, 40.0F, 8.0F, 8, 8, 64, 64);
         }

         if (((Qw_1)this.volatile_.class_[20]).break_(rhQ_2.RIGHT_SLEEVE)) {
            vm_3.class_(var1, var3x ? 1 : synchronized_[22], implements_[68], 44.0F, 36.0F, var3x ? 3 : implements_[70], implements_[71], 64, 64);
         }

         if (((Qw_1)this.volatile_.class_[20]).break_(rhQ_2.LEFT_SLEEVE)) {
            vm_3.class_(var1, 12, 8, 52.0F, 52.0F, var3x ? 3 : implements_[77], implements_[78], 64, 64);
         }

         if (((Qw_1)this.volatile_.class_[20]).break_(rhQ_2.RIGHT_PANTS_LEG)) {
            vm_3.class_(var1, 4, 20, 4.0F, 36.0F, 4, 12, 64, 64);
         }

         if (((Qw_1)this.volatile_.class_[20]).break_(rhQ_2.LEFT_PANTS_LEG)) {
            vm_3.class_(var1, 8, 20, 4.0F, 52.0F, 4, 12, 64, 64);
         }

         var1.break_();
      });
      super.class_(var1, var2, var3, var4);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, 58, -93, -89, 0, -14, 118, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrQx_1 var1) {
      ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0]).break_(var1.class_());
      this.native_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6284359710662226713L;
   }

   private void short_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
      }
   }

   private static void void_() {
      Object[] var0 = new Object[]{
         (new rgn_3("account.switcher.findaccount")).class_(new rgN_2("...")),
         new rgn_3("account.switcher.add"),
         new rgn_3("account.switcher.delete"),
         new rgn_3("account.switcher.login"),
         new rrQL("uuid_list.txt")
      };
      throws_ = var0;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 443458071;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.short_();

      for (rrQT var7 : (List)this.class_[2]) {
         if (var7.class_(var1, var3, var5)) {
            return true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   public void finally_() {
      this.short_();
      ((rrQA)this.class_[1]).private_().ifPresent(var1 -> this.class_(var1.private_()));
   }

   private static void import_() {
      case_ = new short[]{
         3,
         0,
         2,
         1,
         4,
         2,
         1,
         23,
         0,
         0,
         1,
         23,
         1,
         23,
         0,
         2,
         200,
         4,
         0,
         0,
         4,
         1,
         4,
         150,
         3,
         5,
         2,
         6,
         1,
         2,
         23,
         1,
         1,
         0,
         4,
         1,
         0,
         6,
         5,
         1,
         0,
         1,
         4,
         3,
         0,
         1,
         4,
         0,
         1,
         0,
         1,
         4,
         20,
         20,
         20,
         20,
         20
      };
   }

   private static void package_() {
      implements_ = new byte[]{
         2,
         8,
         2,
         20,
         2,
         100,
         22,
         20,
         16,
         48,
         64,
         16,
         2,
         2,
         4,
         52,
         20,
         28,
         20,
         52,
         20,
         28,
         20,
         52,
         20,
         28,
         20,
         4,
         8,
         8,
         64,
         64,
         4,
         8,
         8,
         12,
         64,
         64,
         8,
         3,
         4,
         12,
         64,
         64,
         12,
         8,
         3,
         4,
         12,
         64,
         64,
         4,
         20,
         4,
         12,
         64,
         64,
         8,
         20,
         4,
         12,
         64,
         64,
         4,
         8,
         8,
         64,
         64,
         8,
         3,
         4,
         12,
         64,
         64,
         12,
         8,
         3,
         4,
         12,
         64,
         64,
         4,
         20,
         4,
         12,
         64,
         64,
         8,
         20,
         4,
         12,
         64,
         64,
         2,
         3,
         4,
         7,
         5
      };
   }

   private static void static_() {
      catch_ = new double[]{1.0, 8.0, 16.0, 4.0, 0.0};
   }

   @Override
   public void private_() {
      this.short_();
      super.private_();
      ((Lu_1)this.class_[4]).catch_();
   }

   private void abstract_() {
      import_.break_(new rrQl_1(this, this));
   }

   public Av_1 final_() {
      this.short_();
      return (Av_1)this.class_[3];
   }

   public void native_() {
      this.short_();
      ((rrQA)this.class_[1]).class_(((Lu_1)this.class_[4]).private_());
   }

   @Override
   public void v_() {
      this.short_();
      super.v_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      ArrayList var1 = new ArrayList();

      for (rrwp_3 var3 : ((rrwq_3)rrwq_3.staticFieldsd739829cf0613d349fc0bda49435f7f4[0]).class_()) {
         var1.add(new rrQT(this, var3));
      }

      for (int var13 = synchronized_[10]; var13 < var1.size(); var13++) {
         rrQT var15 = (rrQT)var1.get(var13);
         var15.class_(new rruv_1((float)(2 + var13 * 20), 2.0F, 16.0F, 16.0F));
         ((List)this.class_[2]).add(var15);
      }

      Lu_1 var9 = this.class_(
         new Lu_1(this.super_, this.package_ / 2 - 100, 22, 200, 20, (Lu_1)this.class_[4], (rVi_1)throws_[0], true).class_((rVi_1)throws_[0]).implements_(16)
      );
      this.class_[4] = var9;
      rrQA var10 = this.protected_(new rrQA(this, this.volatile_, this.package_, this.int_, 48, this.int_ - 64, 16));
      this.class_[1] = var10;
      ((Lu_1)this.class_[4]).class_(var1x -> {
         this.short_();
         ((rrQA)this.class_[1]).class_(((Lu_1)this.class_[4]).private_());
      });
      short var14 = 150;
      int var16 = this.package_ / 2 - var14 - var14 / 2;
      byte var4 = 4;
      LF var11 = this.class_((LF)(new LF(var16, this.int_ - 52, var14, 20, (rgn_3)throws_[3], var1x -> this.char_())));
      this.class_[5] = var11;
      LF var12 = this.class_((LF)(new LF(var16, this.int_ - 28, var14, 20, (rgn_3)throws_[2], var1x -> this.finally_())));
      this.class_[6] = var12;
      var16 += var14 + var4;
      this.class_((LF)(new LF(var16, this.int_ - 52, var14, 20, (rgn_3)throws_[1], var1x -> this.abstract_())));
      this.class_((LF)(new LF(var16, this.int_ - 28, var14, 20, cN_2.protected_, var1x -> {
         this.short_();
         this.volatile_.break_((vm_3)this.class_[0]);
      })));
      var16 += var14 + var4;
      this.class_(
         (LF)(new LF(
            var16,
            this.int_ - 52,
            var14,
            20,
            new rgn_3("account.switcher.randomaccount"),
            var1x -> {
               CompletableFuture var2 = ((rrQF)throws_[4]).class_();
               if (var2 != null) {
                  var2.thenAccept(
                     var1xx -> {
                        if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                           .class_(new rrQQ(var1xx, rrQV.class_(var1xx), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[1]), true, true)) {
                           this.native_();
                        }
                     }
                  );
               }
            }
         ))
      );
      this.class_((LF)(new LF(var16, this.int_ - 28, var14, 20, new rgn_3("account.switcher.deleteallrandom"), var1x -> {
         if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0]).class_((rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[1])) {
            this.native_();
         }
      })));
      this.byte_(false);
      this.native_();
   }

   @Override
   public void w_() {
      this.short_();
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
      if ((rrQA)this.class_[1] != null) {
         ((rrQA)this.class_[1]).x_().forEach(rrQn_1::close);
      }

      for (rrQx_1 var2 : ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0]).class_()) {
         if (var2 instanceof AutoCloseable) {
            AutoCloseable var3 = (AutoCloseable)var2;

            try {
               var3.close();
            } catch (Exception var5) {
            }
         }
      }
   }
}
