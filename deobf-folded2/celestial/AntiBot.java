package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AntiBot extends Module {
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   public Object[] id_break;
   private static byte[] id_catch;

   public AntiBot() {
      super("Anti Bot", "Детектит НПС/ботов от античита", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Matrix", "Matrix", "ReallyWorld");
      this.id_break[1] = var5;
      this.id_class(new Setting[]{(rrIQ)this.id_break[1]});
      rrnR_2 var6 = new rrnR_2(this);
      this.id_break[3] = var6;
      rrnY_2 var7 = new rrnY_2(this);
      this.id_break[2] = var7;
      rrnR_2 var8 = (rrnR_2)this.id_break[3];
      this.id_break[0] = var8;
      ((rrIQ)this.id_break[1]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
         if ((rrTF)this.id_break[0] != null && this.aJ_()) {
            ((rrTF)this.id_break[0]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "ReallyWorld" -> (rrnY_2)this.id_break[2];
            case "Matrix" -> (rrnR_2)this.id_break[3];
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

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5066033562427460724L;
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 272510405;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, -47, -124, 81, 62, -57, -69, -95}, "DES");
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
      id_throws = new String[]{
         new String("Anti Bot"),
         new String("Детектит НПС/ботов от античита"),
         new String("Режим"),
         new String("Matrix"),
         new String("Matrix"),
         new String("ReallyWorld"),
         new String("change_mode"),
         new String("ReallyWorld"),
         new String("Matrix")
      };
   }

   private static void id_else() {
      id_byte = new boolean[]{false, true, true, false, false, true};
   }

   public rrTF<AntiBot> id_new() {
      this.id_this();
      return (rrTF<AntiBot>)this.id_break[0];
   }

   private static void id_return() {
      id_protected = new short[]{0, 1, 1, 3, 2, 3, 0, 1, 0, 0, 0, 2, 3, 0, 0, 0};
   }

   private static void id_super() {
      id_catch = new byte[]{2, -1, 4};
   }
}
