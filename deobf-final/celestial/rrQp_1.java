package celestial;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQp_1 extends rrQH {
   private static int[] case_;
   private static String[] catch_;
   private static short[] private_;
   private static boolean[] implements_;
   private static byte[] finally_;
   public Object[] throws_;

   private static void char_() {
      catch_ = new String[]{
         new String("gui.authme.mojang.title"),
         new String("gui.authme.mojang.field.username"),
         new String("gui.authme.mojang.field.password"),
         new String("gui.authme.mojang.button.login"),
         new String("gui.cancel"),
         new String("gui.authme.mojang.status.loggingIn"),
         new String("gui.authme.error.credentials"),
         new String("gui.authme.error.generic"),
         new String("Successfully logged in via Mojang (or legacy)!")
      };
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{15, 33, 9, 112, 4, -126, -46, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void int_() {
      finally_ = new byte[]{2, 100, 2, 39, 20, 2, 100, 2, 6, 20, 2, 100, 2, 2, 59, 100, 20, 2, 2, 2, 59, 100, 20, 2, 16, 23, 16, 16, 2, 20, 7};
   }

   public rrQp_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.mojang.title"), var2, var3);
      this.interface_();
      Object var8 = null;
      this.throws_[1] = var8;
      Object var9 = null;
      this.throws_[2] = var9;
      Object var10 = null;
      this.throws_[3] = var10;
      this.throws_[0] = var1;
      Boolean var12 = true;
      this.class_[3] = var12;
   }

   static {
      ntfClinit();
   }

   private void interface_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[7];
         Object[] var1 = this.throws_;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 498612066035982819L;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.interface_();
      if ((var1 == 257 || var1 == 335) && ((LF)this.throws_[6]).int_) {
         this.native_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.interface_();
      this.class_(var1);
      this.super_.class_(var1, this.extends_, this.package_ / 2, ((Lu_1)this.throws_[4]).final_ - 16 - 23, 16777215);
      this.super_.break_(var1, ((Lu_1)this.throws_[4]).C_(), (float)((Lu_1)this.throws_[4]).volatile_, (float)(((Lu_1)this.throws_[4]).final_ - 16), 10526880);
      this.super_.break_(var1, ((Lu_1)this.throws_[5]).C_(), (float)((Lu_1)this.throws_[5]).volatile_, (float)(((Lu_1)this.throws_[5]).final_ - 16), 10526880);
      if ((rgP_2)this.throws_[3] != null) {
         this.super_.class_(var1, (rgP_2)this.throws_[3], this.package_ / 2, ((LF)this.throws_[6]).final_ - 20, 14540253);
      }

      super.class_(var1, var2, var3, var4);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1321975579;
   }

   public boolean finally_() {
      this.interface_();
      return !((Lu_1)this.throws_[4]).private_().isEmpty() && !((Lu_1)this.throws_[5]).private_().isEmpty() ? true : implements_[8];
   }

   private static void package_() {
      private_ = new short[]{
         1,
         2,
         3,
         0,
         3,
         23,
         200,
         4,
         4,
         128,
         4,
         4,
         200,
         5,
         5,
         6,
         6,
         4,
         23,
         4,
         5,
         6,
         3,
         1,
         4,
         5,
         1,
         2,
         4,
         5,
         4,
         4,
         4,
         4,
         5,
         5,
         5,
         3,
         3,
         6,
         4,
         5,
         2,
         2,
         2,
         1,
         257,
         335,
         6,
         4,
         5,
         3,
         4,
         5,
         0,
         2,
         0,
         1,
         0,
         1,
         1,
         4,
         2,
         6,
         6
      };
   }

   @Override
   public void private_() {
      this.interface_();
      super.private_();
      ((Lu_1)this.throws_[4]).catch_();
      ((Lu_1)this.throws_[5]).catch_();
   }

   private static void abstract_() {
      case_ = new int[]{16777215, 10526880, 10526880, 14540253};
   }

   private static void final_() {
      implements_ = new boolean[]{true, true, true, false, false, false, false, true, false, true, false, true, true, true, true, true, true, true};
   }

   @Override
   public void volatile_() {
      this.interface_();
      if ((CompletableFuture)this.throws_[2] != null && !((CompletableFuture)this.throws_[2]).isDone()) {
         ((CompletableFuture)this.throws_[2]).cancel(true);
         ((ExecutorService)this.throws_[1]).shutdownNow();
      }

      super.volatile_();
   }

   public void native_() {
      this.interface_();
      if (this.finally_()) {
         ((Lu_1)this.throws_[4]).int_ = false;
         ((Lu_1)this.throws_[5]).int_ = false;
         ((LF)this.throws_[6]).int_ = false;
         rgn_3 var5 = new rgn_3("gui.authme.mojang.status.loggingIn");
         this.throws_[3] = var5;
         ExecutorService var6 = Executors.newSingleThreadExecutor();
         this.throws_[1] = var6;
         CompletableFuture var7 = rrQV.class_(((Lu_1)this.throws_[4]).private_(), ((Lu_1)this.throws_[5]).private_(), (ExecutorService)this.throws_[1])
            .thenAccept(
               var1 -> {
                  this.interface_();
                  if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
                     .class_(
                        new rrQz_1(var1.byte_(), var1.protected_(), rrQV.class_(var1.byte_()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[2]),
                        true,
                        true
                     )) {
                     ((rrQC)this.throws_[0]).native_();
                     ((Logger)QY.break_[1]).info("Successfully logged in via Mojang (or legacy)!");
                     rrQg_1.class_(var1);
                     ((rrQZ)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[0]).fields065bd3322daf3178a8bd0d03c4b20e54[1]).class_[1]).class_ = ((Lu_1)this.throws_[4])
                        .private_();
                     Boolean var6x = true;
                     this.class_[2] = var6x;
                  }
               }
            )
            .exceptionally(var1 -> {
               this.interface_();
               rVi_1 var6x = new rgn_3(var1.getCause() instanceof InvalidCredentialsException ? "gui.authme.error.credentials" : catch_[7]).class_(rgF_2.RED);
               this.throws_[3] = var6x;
               ((Lu_1)this.throws_[4]).int_ = true;
               ((Lu_1)this.throws_[5]).int_ = true;
               return null;
            });
         this.throws_[2] = var7;
      }
   }

   @Override
   public boolean E_() {
      this.interface_();
      return !((Lu_1)this.throws_[4]).aO_() && !((Lu_1)this.throws_[5]).aO_() ? true : implements_[10];
   }

   @Override
   public void v_() {
      this.interface_();
      super.v_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(this.super_, this.package_ / 2 - 100, this.int_ / 2 - 39, 200, 20, new rgn_3("gui.authme.mojang.field.username"));
      this.throws_[4] = var5;
      this.class_(var10001);
      ((Lu_1)this.throws_[4]).implements_(128);
      ((Lu_1)this.throws_[4]).class_(var1 -> {
         this.interface_();
         ((LF)this.throws_[6]).int_ = this.finally_();
      });
      ((Lu_1)this.throws_[4]).byte_(true);
      rrQY var6;
      rrQY var8 = var6 = new rrQY(this.super_, this.package_ / 2 - 100, this.int_ / 2 + 6, 200, 20, new rgn_3("gui.authme.mojang.field.password"));
      this.throws_[5] = var6;
      this.class_(var8);
      ((Lu_1)this.throws_[5]).class_(var1 -> {
         this.interface_();
         ((LF)this.throws_[6]).int_ = this.finally_();
      });
      LF var7;
      LF var9 = var7 = new LF(this.package_ / 2 - 100 - 2, this.int_ / 2 + 59, 100, 20, new rgn_3("gui.authme.mojang.button.login"), var1 -> this.native_());
      this.throws_[6] = var7;
      this.class_((LF)var9);
      ((LF)this.throws_[6]).int_ = this.finally_();
      this.class_((LF)(new LF(this.package_ / 2 + 2, this.int_ / 2 + 59, 100, 20, new rgn_3("gui.cancel"), var1 -> this.volatile_())));
      this.class_((Lu_1)this.throws_[4]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
