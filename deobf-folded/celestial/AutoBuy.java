package celestial;

import java.io.File;
import java.net.ServerSocket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoBuy extends Module {
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;

   private int id_char() {
      this.id_while();
      int var1 = rpu_3.id_class();

      try {
         Files.write(((File)this.id_break[3]).toPath(), String.valueOf(var1).getBytes());
      } catch (Exception var3) {
      }

      return var1;
   }

   private static void id_long() {
      id_byte = new short[]{4, 0, 0, 1, 2, 24, 3, 0, 1, 2, 0, 2000, 0, 2, 2, 1, 1, 0, 0, 3, 3, 1, 2, 1, 4, 1, 2, 1, 2};
   }

   private static void id_float() {
      id_catch = new boolean[]{false, true, false, false, false, true, true, false, true, false, true, false};
   }

   public AutoBuy() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_while();
      String var10003 = id_protected[2];
      String var10004 = id_protected[3];
      String[] var10005 = new String[2];
      var10005[id_catch[0]] = id_protected[4];
      var10005[1] = id_protected[5];
      rrIQ var6 = new rrIQ(var10003, var10004, var10005).id_class(id_protected[6], (var1x, var2) -> {
         if (this.aJ_()) {
            if (this.id_this()) {
               this.id_else();
               this.id_public();
            } else {
               this.id_return();
               this.id_new();
            }
         }
      });
      this.id_break[id_byte[1]] = var6;
      this.id_class(
         ((rrIQ)this.id_break[id_byte[2]])
            .id_class(() -> (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : id_catch[11])
      );
      rrtB_2 var1 = new rrtB_2();
      rrTo_1 var7 = new rrTo_1(var1, id_protected[7]);
      this.id_break[1] = var7;
      rrTU var8 = new rrTU(var1, id_protected[8]);
      this.id_break[2] = var8;
      File var9 = new File((File)id_import.id_class[24], id_protected[9]);
      this.id_break[3] = var9;
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_while();
      return ((rrIQ)this.id_break[id_byte[17]]).id_byte().equals(id_protected[12]);
   }

   private static void id_interface() {
      id_throws = new byte[]{2, -1, -1, 4};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4782069303500722079L;
   }

   @Override
   public void id_class(boolean var1) {
      if (!this.id_instanceof()) {
         this.id_try();
      } else {
         super.id_class(var1);
         if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
            if (this.id_this()) {
               this.id_else();
               this.id_public();
            } else if (this.id_goto()) {
               this.id_return();
               this.id_new();
            }
         }
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[7]] && !this.id_instanceof()) {
         this.id_byte(id_catch[2]);
      }
   }

   private boolean id_class(int var1) {
      try {
         boolean var3;
         try (ServerSocket var2 = new ServerSocket(var1)) {
            var2.setReuseAddress(true);
            var3 = true;
         }

         return var3;
      } catch (Exception var7) {
         return id_catch[7];
      }
   }

   @EventTarget
   public void id_class(rrLM var1) {
      this.id_byte(id_catch[3]);
   }

   private int id_void() {
      this.id_while();

      try {
         return Integer.parseInt(new String(Files.readAllBytes(((File)this.id_break[3]).toPath())));
      } catch (Exception var2) {
         return -1;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -63, -80, -19, -74, -116, 7, -85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -158910370;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_else();
      this.id_return();
      ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_byte[12]]).id_throws().id_catch();
   }

   public boolean id_goto() {
      this.id_while();
      return ((rrIQ)this.id_break[id_byte[18]]).id_byte().equals(id_protected[13]);
   }

   public rrTo_1 id_continue() {
      this.id_while();
      return (rrTo_1)this.id_break[1];
   }

   public void id_else() {
      this.id_while();

      try {
         ((rrTo_1)this.id_break[1]).id_protected();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   private boolean id_instanceof() {
      return (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
            && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         ? id_catch[9]
         : true;
   }

   public void id_new() {
      this.id_while();

      try {
         int var1 = this.id_void();
         if (var1 != -1 && !this.id_class(var1)) {
            ((rrTo_1)this.id_break[1]).id_class(var1);
         } else {
            rrfu_3.id_byte(id_protected[11]);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void id_return() {
      this.id_while();

      try {
         ((rrTU)this.id_break[2]).id_byte();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public rrTU id_super() {
      this.id_while();
      return (rrTU)this.id_break[2];
   }

   private static void id_throw() {
      id_protected = new String[]{
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

   private void id_try() {
      String var1 = id_protected[10];
      rrfu_3.id_byte(rrfu_3.id_class((Module)this) + var1);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_byte[10]]).id_class(new rrtx_3(this.id_final(), var1, 2000));
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   public void id_public() {
      this.id_while();

      try {
         int var1 = this.id_char();
         ((rrTU)this.id_break[2]).id_class(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}
