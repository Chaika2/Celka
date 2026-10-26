package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAuth extends Module {
   public static Object[] id_break;
   public Object[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_catch;
   private static float[] id_private;
   private static String[] id_implements;

   private void id_byte(String var1) {
      String[] var2 = var1.split(" ");

      for (String var6 : var2) {
         if (((Set)id_break[2]).contains(var6)) {
            this.id_super();
            break;
         }

         if (((Set)id_break[1]).contains(var6)) {
            this.id_return();
            break;
         }
      }
   }

   public AutoAuth() {
      super("Auto Auth", "Автоматически регистрируется\nи авторизируется на сервере", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_else();
      rrIv_1 var5 = new rrIv_1("Пароль", "qwerty123", rrte_3.id_class((Pattern)rrtR_2.id_class[8])).id_class(80.0F);
      this.id_byte[0] = var5;
      this.id_class((rrIv_1)this.id_byte[0]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new short[]{4, 8, 0, 0, 57, 2, 1, 0, 57, 57, 0, 0, 0, 57, 0};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6004689058799502909L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFu_1 var2) {
         rFm_1 var5 = var2.id_break();
         rgP_2 var4 = var2.id_byte();
         if (var4 == null) {
            return;
         }

         if ((cb_3)id_import.id_class[57] == null || id_import.id_finally() || id_import.S() == null) {
            return;
         }

         if (var5 == rFm_1.TITLE || var5 == rFm_1.SUBTITLE || var5 == rFm_1.ACTIONBAR) {
            this.id_byte(var4.id_byte().toLowerCase());
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1639085265;
   }

   @EventTarget
   public void id_class(rrLO var1) {
      String var2 = var1.id_protected().toLowerCase();
      if (!id_import.id_finally() && id_import.S() != null) {
         this.id_byte(var2);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, 65, -11, 125, 95, -94, 116, -91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_implements = new String[]{
         new String("Auto Auth"),
         new String("Автоматически регистрируется\nи авторизируется на сервере"),
         new String("Пароль"),
         new String("qwerty123"),
         new String(" "),
         new String("/register"),
         new String("/reg"),
         new String("/login"),
         new String("/l")
      };
   }

   private static void id_continue() {
      id_protected = new byte[]{2, 3};
   }

   private void id_else() {
      if (this.id_byte == null) {
         this.id_byte = new Object[1];
      }
   }

   private static void id_new() {
      Object[] var0 = new Object[]{new HashSet(), Set.of("/register", "/reg"), Set.of("/login", "/l")};
      id_break = var0;
   }

   private void id_return() {
      this.id_else();
      String var1 = ((rrIv_1)this.id_byte[0]).id_extends();
      if (var1.isEmpty()) {
         var1 = ((rrIv_1)this.id_byte[0]).id_final();
      }

      ((cb_3)id_import.id_class[57]).id_case("/register " + var1 + " " + var1);
      ((Set)id_break[0]).add(new rrHc_1(id_import.id_while().id_byte(), id_import.S().id_break, var1));
   }

   private void id_super() {
      this.id_else();

      for (rrHc_1 var2 : (Set)id_break[0]) {
         String var3 = var2.id_byte();
         String var4 = var2.id_break();
         if (id_import.id_while().id_byte().equalsIgnoreCase(var3) && var4.equals(id_import.S().id_break)) {
            String var5 = var2.id_class();
            if (!rql_3.id_break(var5)) {
               ((cb_3)id_import.id_class[57]).id_case("/login " + var5);
            }

            return;
         }
      }

      ((cb_3)id_import.id_class[57]).id_case("/login " + ((rrIv_1)this.id_byte[0]).id_extends());
   }

   private static void id_while() {
      id_private = new float[]{80.0F};
   }

   private static void id_public() {
      id_throws = new boolean[]{false, false, true, true};
   }
}
