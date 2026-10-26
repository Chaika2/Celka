package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class NoSlow extends Module implements rrnZ_2 {
   private static boolean[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static byte[] id_catch;

   public NoSlow() {
      super("No Slow", "Убирает замедление при\nиспользовании предмета", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "SpookyTime", "ReallyWorld", "Vanilla");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rrlr_3 var6 = new rrlr_3(this);
      this.id_break[2] = var6;
      rrCe_1 var7 = new rrCe_1(this);
      this.id_break[3] = var7;
      rrCi_1 var8 = new rrCi_1(this);
      this.id_break[4] = var8;
      rrCa_1 var9 = new rrCa_1(this);
      this.id_break[5] = var9;
      rrCe_1 var10 = (rrCe_1)this.id_break[3];
      this.id_break[1] = var10;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
         if ((rrTF)this.id_break[1] != null && this.aJ_()) {
            ((rrTF)this.id_break[1]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9x = switch (var3) {
            case "Funtime" -> (rrCe_1)this.id_break[3];
            case "Vanilla" -> (rrlr_3)this.id_break[2];
            case "SpookyTime" -> (rrCi_1)this.id_break[4];
            case "ReallyWorld" -> (rrCa_1)this.id_break[5];
            default -> null;
         };
         this.id_break[1] = var9x;
         if ((rrTF)this.id_break[1] != null && this.aJ_()) {
            ((rrTF)this.id_break[1]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7835112948601203375L;
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -347817080;
   }

   @Override
   public void id_class() {
      this.id_byte(false);
      this.id_new().id_super();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -62, 93, -58, -36, -76, -42, 82}, "DES");
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
      id_throws = new short[]{1, 0, 0, 2, 3, 4, 5, 3, 1, 0, 1, 1, 1, 3, 2, 4, 5, 1, 1, 1};
   }

   private static void id_else() {
      id_byte = new boolean[]{false, true, false, false, true};
   }

   public rrTF<NoSlow> id_new() {
      this.id_this();
      return (rrTF<NoSlow>)this.id_break[1];
   }

   private static void id_return() {
      id_protected = new String[]{
         new String("No Slow"),
         new String("Убирает замедление при\nиспользовании предмета"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("SpookyTime"),
         new String("ReallyWorld"),
         new String("Vanilla"),
         new String("change_mode"),
         new String("Funtime"),
         new String("Vanilla"),
         new String("SpookyTime"),
         new String("ReallyWorld")
      };
   }

   private static void id_super() {
      id_catch = new byte[]{4, 2, 3, -1, 2, 3, 6};
   }
}
