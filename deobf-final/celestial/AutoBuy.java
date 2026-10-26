package celestial;

import java.io.File;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoBuy extends Module {
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   public Object[] break_;
   private static boolean[] catch_;

   private int char_() {
      this.while_();
      int var1 = rpu_3.class_();

      try {
         Files.write(((File)this.break_[byte_[19]]).toPath(), String.valueOf(var1).getBytes());
      } catch (Exception var3) {
      }

      return var1;
   }

   private static void long_() {
      byte_ = new short[]{4, 0, 0, 1, 2, 24, 3, 0, 1, 2, 0, 2000, 0, 2, 2, 1, 1, 0, 0, 3, 3, 1, 2, 1, 4, 1, 2, 1, 2};
   }

   private static void float_() {
      catch_ = new boolean[]{false, true, false, false, false, true, true, false, true, false, true, false};
   }

   public AutoBuy() {
      super("Auto Buy", "Утилитарный модуль для работы\nс аукционом", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.while_();
      rrIQ var6 = new rrIQ("Процесс", "Покупающий", "Покупающий", "Проверяющий").class_("process", (var1x, var2) -> {
         if (this.aJ_()) {
            if (this.this_()) {
               this.else_();
               this.public_();
            } else {
               this.return_();
               this.new_();
            }
         }
      });
      this.break_[0] = var6;
      this.class_(
         ((rrIQ)this.break_[0]).class_(() -> (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : catch_[11])
      );
      rrtB_2 var1 = new rrtB_2();
      rrTo_1 var7 = new rrTo_1(var1, "127.0.0.1");
      this.break_[1] = var7;
      rrTU var8 = new rrTU(var1, "127.0.0.1");
      this.break_[2] = var8;
      File var9 = new File((File)import_.class_[24], "freeport.celka");
      this.break_[3] = var9;
   }

   static {
      ntfClinit();
   }

   public boolean this_() {
      this.while_();
      return ((rrIQ)this.break_[0]).byte_().equals("Покупающий");
   }

   private static void interface_() {
      throws_ = new byte[]{2, -1, -1, 4};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4782069303500722079L;
   }

   @Override
   public void class_(boolean var1) {
      if (!this.instanceof_()) {
         this.try_();
      } else {
         super.class_(var1);
         if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            if (this.this_()) {
               this.else_();
               this.public_();
            } else if (this.goto_()) {
               this.return_();
               this.new_();
            }
         }
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !this.instanceof_()) {
         this.byte_(false);
      }
   }

   private boolean class_(int var1) {
      try {
         boolean var3;
         try (ServerSocket var2 = new ServerSocket(var1)) {
            var2.setReuseAddress(catch_[5]);
            var3 = catch_[6];
         }

         return var3;
      } catch (Exception var7) {
         return false;
      }
   }

   @EventTarget
   public void class_(rrLM var1) {
      this.byte_(false);
   }

   private int void_() {
      this.while_();

      try {
         return Integer.parseInt(new String(Files.readAllBytes(((File)this.break_[byte_[20]]).toPath())));
      } catch (Exception var2) {
         return -1;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -63, -80, -19, -74, -116, 7, -85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -158910370;
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.else_();
      this.return_();
      ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_().catch_();
   }

   public boolean goto_() {
      this.while_();
      return ((rrIQ)this.break_[0]).byte_().equals("Проверяющий");
   }

   public rrTo_1 continue_() {
      this.while_();
      return (rrTo_1)this.break_[1];
   }

   public void else_() {
      this.while_();

      try {
         ((rrTo_1)this.break_[byte_[16]]).protected_();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private boolean instanceof_() {
      return (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         ? catch_[9]
         : catch_[8];
   }

   public void new_() {
      this.while_();

      try {
         int var1 = this.void_();
         if (var1 != throws_[1] && !this.class_(var1)) {
            ((rrTo_1)this.break_[byte_[15]]).class_(var1);
         } else {
            rrfu_3.byte_(protected_[11]);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void return_() {
      this.while_();

      try {
         ((rrTU)this.break_[byte_[14]]).byte_();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public rrTU super_() {
      this.while_();
      return (rrTU)this.break_[2];
   }

   private static void throw_() {
      protected_ = new String[]{
         new String("Auto Buy"),
         new String("Утилитарный модуль для работы\nс аукционом"),
         new String("Процесс"),
         new String("Покупающий"),
         new String("Покупающий"),
         new String("Проверяющий"),
         new String("process"),
         new String("127.0.0.1"),
         new String("127.0.0.1"),
         new String("freeport.celka"),
         new String("Этот модуль не поддерживается на этом сервере"),
         new String("Запустите модуль с режимом \"Покупающий\" в этом или другом клиенте"),
         new String("Покупающий"),
         new String("Проверяющий")
      };
   }

   private void try_() {
      String var1 = "Этот модуль не поддерживается на этом сервере";
      rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), var1, 2000));
   }

   private void while_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
      }
   }

   public void public_() {
      this.while_();

      try {
         int var1 = this.char_();
         ((rrTU)this.break_[byte_[13]]).class_(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
