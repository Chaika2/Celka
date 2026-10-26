package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlq_3 extends rrTF<AutoAccept> {
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_case;
   private static String[] id_catch;
   public Object[] id_break;

   private void id_byte(String var1) {
      ((cb_3)id_import.id_class[57]).id_case("/duel team accept " + var1);
   }

   private void id_byte() {
      ((cb_3)id_import.id_class[57]).id_case("/duel cancel");
   }

   public rrlq_3(AutoAccept var1) {
      super(var1);
      this.id_private();
      rrIk_1 var6 = new rrIk_1("Включено", true).id_class("enabled", (var1x, var2) -> {
         this.id_private();
         Object var7x = null;
         this.id_break[2] = var7x;
      });
      this.id_break[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только от друзей", true);
      this.id_break[1] = var7;
      var1.id_class(new GroupSetting("Запрос в команду", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrFo_1 var1) {
      this.id_private();
      if (var1.id_break() instanceof Fc_1 var3) {
         String var4 = var3.id_new().id_byte().toLowerCase();
         if (this.id_break(var4)) {
            Object var9 = null;
            this.id_break[2] = var9;
         }
      }
   }

   private boolean id_class(rrLO var1, String var2) {
      this.id_private();
      if (((rrIk_1)this.id_break[1]).id_class()) {
         return var1.id_class() != null ? false : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_break(var2);
      } else {
         return id_byte[11];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -850556619;
   }

   @EventTarget
   public void id_class(rrLO var1) {
      this.id_private();
      if (((rrIk_1)this.id_break[0]).id_class() && var1.id_class() == null) {
         String var2 = var1.id_protected();

         for (Pattern var6 : (Pattern[])id_class[0]) {
            Matcher var7 = var6.matcher(var2);
            if (var7.find()) {
               String var8 = var7.group(1);
               if (this.id_class(var1, var8)) {
                  uj_3 var9 = ((cq_3)id_import.id_class[19]).id_extends();
                  if (var9.id_class("поиск", "дуэли")) {
                     this.id_byte();
                  }

                  this.id_byte(var8);
                  rrlT_2 var14 = (rrlT_2)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[0];
                  this.id_break[2] = var14;
               }
               break;
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4187382438245985888L;
   }

   @EventTarget
   public void id_class(rrAZ var1) {
      this.id_private();
      if ((rrlT_2)this.id_break[2] == (rrlT_2)rrlT_2.staticFields8894b88cba4233cc950e42483f078233[0] && var1.id_class() instanceof Fc_1 var3) {
         String var4 = var3.id_new().id_byte().toLowerCase();
         rXe_1 var5 = var3.G_();
         if (this.id_break(var4)) {
            ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_finally = true;
            List var6 = var5.id_class(var1x -> this.id_class(var1x.id_class()));
            if (!var6.isEmpty()) {
               ((Ax_1)id_import.id_class[55]).id_class(var5.id_case, ((rJY)var6.get(0)).id_protected, 2, rXa_1.CLONE);
            }
         }
      }
   }

   private static void id_class() {
      Object[] var0 = new Object[1];
      Pattern[] var2 = new Pattern[]{Pattern.compile("\\[⚔] Игрок (.*) приглашает вас (.*)", 0)};
      var0[0] = var2;
      id_class = var0;
   }

   private boolean id_class(rdn_3 var1) {
      return var1 != null && !var1.id_class() ? var1.id_continue().id_byte().equalsIgnoreCase("[подтвердить]") : id_byte[12];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -119, 77, 55, -81, 122, -1, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, false, true, false, true, false, true, true, false, false, true, false, true, false, false, true};
   }

   private boolean id_break(String var1) {
      return var1.contains("приглашение в команду");
   }

   private static void id_throws() {
      id_protected = new short[]{0, 1, 0, 1, 0, 0, 19, 0, 2, 2, 2, 0, 57, 17, 55, 1, 0, 57, 57, 2, 2};
   }

   private static void id_case() {
      id_catch = new String[]{
         new String("Включено"),
         new String("enabled"),
         new String("Только от друзей"),
         new String("Запрос в команду"),
         new String("поиск"),
         new String("дуэли"),
         new String("приглашение в команду"),
         new String("/duel cancel"),
         new String("[подтвердить]"),
         new String("\\[⚔] Игрок (.*) приглашает вас (.*)")
      };
   }

   private static void id_protected() {
      id_case = new byte[]{2, 2, 2, 3};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
      }
   }

   @Override
   public boolean aK_() {
      this.id_private();
      Object var5 = null;
      this.id_break[2] = var5;
      return super.aK_();
   }
}
