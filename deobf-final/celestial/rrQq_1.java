package celestial;

import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQq_1 extends rrQH {
   private static String[] case_;
   private static short[] catch_;
   public Object[] throws_;
   private static int[] private_;
   private static byte[] implements_;
   private static boolean[] finally_;

   private static void char_() {
      case_ = new String[]{
         new String("gui.authme.offline.title"),
         new String("gui.authme.offline.field.username"),
         new String("gui.authme.offline.button.login"),
         new String("gui.cancel"),
         new String("Successfully logged in offline-mode!")
      };
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 23, 104, -6, 116, -115, -18, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void int_() {
      catch_ = new short[]{0, 3, 23, 200, 1, 1, 1, 1, 1, 2, 2, 1, 23, 1, 0, 0, 0, 1, 2, 0, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 257, 335, 2, 1, 7, 2};
   }

   public rrQq_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.offline.title"), var2, var3);
      this.final_();
      this.throws_[0] = var1;
      Boolean var9 = true;
      this.class_[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      implements_ = new byte[]{2, 100, 2, 6, 20, 16, 2, 100, 2, 2, 26, 100, 20, 2, 2, 2, 26, 100, 20, 2, 16, 23, 16, 3};
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.final_();
      if ((var1 == 257 || var1 == 335) && ((LF)this.throws_[2]).int_) {
         this.finally_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4957199880209339171L;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.final_();
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.super_.class_(var1, this.extends_, this.package_ / 2, ((Lu_1)this.throws_[1]).final_ - 16 - 23, 16777215);
      this.super_.break_(var1, ((Lu_1)this.throws_[1]).C_(), (float)((Lu_1)this.throws_[1]).volatile_, (float)(((Lu_1)this.throws_[1]).final_ - 16), 10526880);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1534192246;
   }

   public void finally_() {
      this.final_();
      if (this.native_()) {
         rqN_2 var1 = rrQg_1.break_(((Lu_1)this.throws_[1]).private_());
         if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
            .class_(
               new rrQQ(var1.byte_(), UUIDTypeAdapter.fromString(var1.break_()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[0]), true, true
            )) {
            ((rrQC)this.throws_[0]).native_();
            ((Lu_1)this.throws_[1]).int_ = false;
            ((LF)this.throws_[2]).int_ = false;
            rrQg_1.class_(var1);
            ((rrQv_1)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[0]).fields065bd3322daf3178a8bd0d03c4b20e54[1]).class_[2]).class_ = ((Lu_1)this.throws_[1])
               .private_();
            ((Logger)QY.break_[1]).info("Successfully logged in offline-mode!");
            Boolean var6 = true;
            this.class_[2] = var6;
         }
      }
   }

   private static void package_() {
      finally_ = new boolean[]{true, true, true, false, true, true, false, false, true, true, false, true, true};
   }

   @Override
   public void private_() {
      this.final_();
      super.private_();
      ((Lu_1)this.throws_[1]).catch_();
   }

   private static void abstract_() {
      private_ = new int[]{16777215, 10526880};
   }

   private void final_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[3];
         Object[] var1 = this.throws_;
      }
   }

   public boolean native_() {
      this.final_();
      return !((Lu_1)this.throws_[1]).private_().isBlank() ? true : finally_[10];
   }

   @Override
   public void v_() {
      this.final_();
      super.v_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(this.super_, this.package_ / 2 - 100, this.int_ / 2 - 6, 200, 20, new rgn_3("gui.authme.offline.field.username"));
      this.throws_[1] = var5;
      this.class_(var10001);
      ((Lu_1)this.throws_[1]).implements_(16);
      ((Lu_1)this.throws_[1]).class_(var1 -> {
         this.final_();
         ((LF)this.throws_[2]).int_ = this.native_();
      });
      ((Lu_1)this.throws_[1]).class_(var0 -> var0.isEmpty() ? true : ((Pattern)rrtR_2.class_[7]).matcher(var0).matches());
      ((Lu_1)this.throws_[1]).byte_(true);
      LF var6;
      LF var7 = var6 = new LF(this.package_ / 2 - 100 - 2, this.int_ / 2 + 26, 100, 20, new rgn_3("gui.authme.offline.button.login"), var1 -> this.finally_());
      this.throws_[2] = var6;
      this.class_(var7);
      ((LF)this.throws_[2]).int_ = this.native_();
      this.class_(new LF(this.package_ / 2 + 2, this.int_ / 2 + 26, 100, 20, new rgn_3("gui.cancel"), var1 -> this.volatile_()));
      this.class_((Lu_1)this.throws_[1]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
