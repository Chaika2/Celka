package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class WaterSpeed extends Module implements rrnZ_2 {
   public Object[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_catch;

   public WaterSpeed() {
      super("Water Speed", "Увеличивает скорость в воде", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_this();
      rrIQ var5 = new rrIQ("Режим", "Funtime", "Funtime", "Vulcan");
      this.id_break[0] = var5;
      this.id_class((rrIQ)this.id_break[0]);
      rrlx_3 var6 = new rrlx_3(this);
      this.id_break[1] = var6;
      rrld_3 var7 = new rrld_3(this);
      this.id_break[2] = var7;
      rrlx_3 var8 = (rrlx_3)this.id_break[1];
      this.id_break[3] = var8;
      ((rrIQ)this.id_break[0]).id_class("change_mode", (var1, var2) -> {
         this.id_this();
         if ((rrTF)this.id_break[3] != null && this.aJ_()) {
            ((rrTF)this.id_break[3]).aK_();
         }

         String var3 = (String)var2.getLeft();

         Object var9 = switch (var3) {
            case "Funtime" -> (rrlx_3)this.id_break[1];
            case "Vulcan" -> (rrld_3)this.id_break[2];
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

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
      }
   }

   @Override
   public void id_class() {
      this.id_byte(false);
      this.id_new().id_super();
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8560510927816771796L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 536343992;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 70, -51, -53, -122, 36, -9, -37}, "DES");
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
      id_throws = new byte[]{2, -1, 4};
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Water Speed"),
         new String("Увеличивает скорость в воде"),
         new String("Режим"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Vulcan"),
         new String("change_mode"),
         new String("Funtime"),
         new String("Vulcan")
      };
   }

   public rrTF<WaterSpeed> id_new() {
      this.id_this();
      return (rrTF<WaterSpeed>)this.id_break[3];
   }

   private static void id_return() {
      id_byte = new short[]{1, 0, 0, 1, 2, 1, 3, 0, 3, 3, 3, 1, 2, 3, 3, 3};
   }

   private static void id_super() {
      id_catch = new boolean[]{false, true, false, false, true};
   }
}
