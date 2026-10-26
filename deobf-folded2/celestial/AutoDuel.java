package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoDuel extends Module {
   private static byte[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_catch;
   public Object[] id_break;

   public AutoDuel() {
      super("Auto Duel", "Автоматически находит дуэли", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_return();
      rrIQ var5 = new rrIQ("Сервер", "Funtime", "Funtime", "ReallyWorld");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rryQ var6 = new rryQ(this);
      this.id_break[1] = var6;
      rryA var7 = new rryA(this);
      this.id_break[2] = var7;
      rryQ var8 = (rryQ)this.id_break[1];
      this.id_break[3] = var8;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_return();
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Funtime" -> (rryQ)this.id_break[1];
            case "ReallyWorld" -> (rryA)this.id_break[2];
            default -> null;
         };
         this.id_break[3] = var9;
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new boolean[]{false, true, false, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2807325463839614754L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1278666294;
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(false);
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, 46, -7, -49, 66, 73, -60, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   private static void id_continue() {
      id_byte = new byte[]{2, -1, 4};
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Auto Duel"),
         new String("Автоматически находит дуэли"),
         new String("Сервер"),
         new String("Funtime"),
         new String("Funtime"),
         new String("ReallyWorld"),
         new String("change_mode"),
         new String("Funtime"),
         new String("ReallyWorld")
      };
   }

   public rrTF<AutoDuel> id_new() {
      this.id_return();
      return (rrTF<AutoDuel>)this.id_break[3];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   private static void id_super() {
      id_catch = new short[]{4, 0, 0, 1, 2, 1, 3, 0, 3, 3, 3, 1, 2, 3, 3, 3};
   }
}
