package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoSprint extends Module {
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;

   public AutoSprint() {
      super("Auto Sprint", "Автоматически включает спринт", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_try();
      rrIk_1 var5 = new rrIk_1("Голод", false);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Слепоту", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Приседание", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Ползание", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Использование предметов", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Горизонтальную коллизию", true);
      this.id_break[5] = var10;
      this.id_class(
         new Setting[]{
            new GroupSetting("Авто. конфигурации", new ButtonSetting(this, "SpookyTime", () -> {
               this.id_try();
               ((rrIk_1)this.id_break[0]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[1]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[2]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[3]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[4]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[5]).id_class(Boolean.valueOf(true), false, true);
            }), new ButtonSetting(this, "Funtime", () -> {
               this.id_try();
               ((rrIk_1)this.id_break[0]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[1]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[2]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[3]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[4]).id_class(Boolean.valueOf(true), false, true);
               ((rrIk_1)this.id_break[5]).id_class(Boolean.valueOf(true), false, true);
            }), new ButtonSetting(this, "Grim", () -> {
               this.id_try();
               ((rrIk_1)this.id_break[0]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[1]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[2]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[3]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[4]).id_class(Boolean.valueOf(false), false, true);
               ((rrIk_1)this.id_break[5]).id_class(Boolean.valueOf(false), false, true);
            })),
            new GroupSetting(
               "Игнорировать",
               (rrIk_1)this.id_break[0],
               (rrIk_1)this.id_break[1],
               (rrIk_1)this.id_break[2],
               (rrIk_1)this.id_break[3],
               (rrIk_1)this.id_break[4],
               (rrIk_1)this.id_break[5]
            )
         }
      );
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[2]).id_class() ? true : id_byte[21];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5324248355237797422L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -905121113;
   }

   @EventTarget
   public void id_class(I var1) {
      var1.id_class(true);
   }

   @EventTarget
   public void id_class(rrLX var1) {
      this.id_try();
      if (((rrIk_1)this.id_break[5]).id_class()) {
         var1.id_break(false);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -53, -72, -18, 111, -104, -114, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_catch = new byte[]{2, 3, 2, 6, 2, 3, 4, 5, 6};
   }

   public boolean id_continue() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[1]).id_class() ? true : id_byte[17];
   }

   public boolean id_else() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[0]).id_class() ? true : id_byte[15];
   }

   private static void id_instanceof() {
      id_protected = new String[]{
         new String("Auto Sprint"),
         new String("Автоматически включает спринт"),
         new String("Голод"),
         new String("Слепоту"),
         new String("Приседание"),
         new String("Ползание"),
         new String("Использование предметов"),
         new String("Горизонтальную коллизию"),
         new String("Авто. конфигурации"),
         new String("SpookyTime"),
         new String("Funtime"),
         new String("Grim"),
         new String("Игнорировать")
      };
   }

   public boolean id_new() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[4]).id_class() ? true : id_byte[19];
   }

   private static void id_return() {
      id_throws = new short[]{1, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 5, 0, 1, 4, 2, 3, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   public boolean id_super() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[3]).id_class() ? true : id_byte[23];
   }

   private void id_try() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_while() {
      id_byte = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true
      };
   }
}
