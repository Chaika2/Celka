package celestial;

import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public class rrQq_1 extends rrQH {
   private static String[] id_case;
   private static short[] id_catch;
   public Object[] id_throws;
   private static int[] id_private;
   private static byte[] id_implements;
   private static boolean[] id_finally;

   private static void id_char() {
      id_case = new String[]{
         new String("gui.authme.offline.title"),
         new String("gui.authme.offline.field.username"),
         new String("gui.authme.offline.button.login"),
         new String("gui.cancel"),
         new String("Successfully logged in offline-mode!")
      };
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 23, 104, -6, 116, -115, -18, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_int() {
      id_catch = new short[]{0, 3, 23, 200, 1, 1, 1, 1, 1, 2, 2, 1, 23, 1, 0, 0, 0, 1, 2, 0, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 257, 335, 2, 1, 7, 2};
   }

   public rrQq_1(rrQC var1, vm_3 var2, vm_3 var3) {
      super(new rgn_3("gui.authme.offline.title"), var2, var3);
      this.id_final();
      this.id_throws[0] = var1;
      Boolean var9 = true;
      this.id_class[3] = var9;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_implements = new byte[]{2, 100, 2, 6, 20, 16, 2, 100, 2, 2, 26, 100, 20, 2, 2, 2, 26, 100, 20, 2, 16, 23, 16, 3};
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_final();
      if ((var1 == 257 || var1 == 335) && ((LF)this.id_throws[2]).id_int) {
         this.id_finally();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4957199880209339171L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_final();
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_super.id_class(var1, this.id_extends, this.id_package / 2, ((Lu_1)this.id_throws[1]).id_final - 16 - 23, 16777215);
      this.id_super
         .id_break(
            var1, ((Lu_1)this.id_throws[1]).C_(), (float)((Lu_1)this.id_throws[1]).id_volatile, (float)(((Lu_1)this.id_throws[1]).id_final - 16), 10526880
         );
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1534192246;
   }

   public void id_finally() {
      this.id_final();
      if (this.id_native()) {
         rqN_2 var1 = rrQg_1.id_break(((Lu_1)this.id_throws[1]).id_private());
         if (((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[0])
            .id_class(
               new rrQQ(var1.id_byte(), UUIDTypeAdapter.fromString(var1.id_break()), (rrQd_1)rrQd_1.staticFields634ba5beb257384d8792f008140c7c0a[0]),
               true,
               true
            )) {
            ((rrQC)this.id_throws[0]).id_native();
            ((Lu_1)this.id_throws[1]).id_int = false;
            ((LF)this.id_throws[2]).id_int = false;
            rrQg_1.id_class(var1);
            ((rrQv_1)((rrQu_1)((rrQN)rrQN.staticFields065bd3322daf3178a8bd0d03c4b20e54[0]).fields065bd3322daf3178a8bd0d03c4b20e54[1]).id_class[2]).id_class = ((Lu_1)this.id_throws[1])
               .id_private();
            ((Logger)QY.id_break[1]).info("Successfully logged in offline-mode!");
            Boolean var6 = true;
            this.id_class[2] = var6;
         }
      }
   }

   private static void id_package() {
      id_finally = new boolean[]{true, true, true, false, true, true, false, false, true, true, false, true, true};
   }

   @Override
   public void id_private() {
      this.id_final();
      super.id_private();
      ((Lu_1)this.id_throws[1]).id_catch();
   }

   private static void id_abstract() {
      id_private = new int[]{16777215, 10526880};
   }

   private void id_final() {
      if (this.id_throws == null) {
         this.id_throws = new Object[3];
         Object[] var1 = this.id_throws;
      }
   }

   public boolean id_native() {
      this.id_final();
      return !((Lu_1)this.id_throws[1]).id_private().isBlank() ? true : id_finally[10];
   }

   @Override
   public void v_() {
      this.id_final();
      super.v_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      Lu_1 var5;
      Lu_1 var10001 = var5 = new Lu_1(this.id_super, this.id_package / 2 - 100, this.id_int / 2 - 6, 200, 20, new rgn_3("gui.authme.offline.field.username"));
      this.id_throws[1] = var5;
      this.id_class(var10001);
      ((Lu_1)this.id_throws[1]).id_implements(16);
      ((Lu_1)this.id_throws[1]).id_class(var1 -> {
         this.id_final();
         ((LF)this.id_throws[2]).id_int = this.id_native();
      });
      ((Lu_1)this.id_throws[1]).id_class(var0 -> var0.isEmpty() ? true : ((Pattern)rrtR_2.id_class[7]).matcher(var0).matches());
      ((Lu_1)this.id_throws[1]).id_byte(true);
      LF var6;
      LF var7 = var6 = new LF(
         this.id_package / 2 - 100 - 2, this.id_int / 2 + 26, 100, 20, new rgn_3("gui.authme.offline.button.login"), var1 -> this.id_finally()
      );
      this.id_throws[2] = var6;
      this.id_class(var7);
      ((LF)this.id_throws[2]).id_int = this.id_native();
      this.id_class(new LF(this.id_package / 2 + 2, this.id_int / 2 + 26, 100, 20, new rgn_3("gui.cancel"), var1 -> this.id_volatile()));
      this.id_class((Lu_1)this.id_throws[1]);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
