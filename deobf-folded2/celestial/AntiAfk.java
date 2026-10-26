package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiAfk extends Module {
   private static String[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static byte[] id_throws;
   private static short[] id_catch;

   public AntiAfk() {
      super("Anti AFK", "Обходит сервера с проверкой на\nАФК", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_super();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Vanilla");
      this.id_break[1] = var5;
      this.id_class((rrIQ)this.id_break[1]);
      rryJ var6 = new rryJ(this);
      this.id_break[2] = var6;
      rryX var7 = new rryX(this);
      this.id_break[3] = var7;
      rryJ var8 = (rryJ)this.id_break[2];
      this.id_break[0] = var8;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_super();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Vanilla" -> (rryJ)this.id_break[2];
            case "Funtime" -> (rryX)this.id_break[3];
            default -> null;
         };
         this.id_break[0] = var9;
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new String[]{
         new String("Anti AFK"),
         new String("Обходит сервера с проверкой на\nАФК"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Funtime")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -572880595;
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1493400069218405243L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -57, -46, -110, 117, 66, -101, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new().aK_();
   }

   private static void id_continue() {
      id_catch = new short[]{4, 1, 1, 2, 3, 2, 0, 1, 0, 0, 0, 2, 3, 0, 0, 0};
   }

   private static void id_else() {
      id_protected = new boolean[]{false, true, false, true};
   }

   public rrTF<AntiAfk> id_new() {
      this.id_super();
      return (rrTF<AntiAfk>)this.id_break[0];
   }

   private static void id_return() {
      id_throws = new byte[]{2, -1, 4};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }
}
